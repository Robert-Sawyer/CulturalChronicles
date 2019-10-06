package com.github.robertsawyer.CulturalChronicles.web.controllers;

import com.github.robertsawyer.CulturalChronicles.dto.AddMovieDTO;
import com.github.robertsawyer.CulturalChronicles.services.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/movies")
public class MovieController {

    public static final Logger logger = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/add")
    public String prepareAddNewMovieForm(Model model) {
        model.addAttribute("newMovie", new AddMovieDTO());
        return "movies/addMovie";
    }

    @PostMapping("/add")
    public String addNewMovie(@Valid @ModelAttribute("movie") AddMovieDTO addMovieDTO, BindingResult bindingResult) {

        if (bindingResult.hasErrors()){
            return "movies/addMovie";
        }
        logger.info("Dodaję film do bazy.");

        movieService.createNewMovie(addMovieDTO);
        return "redirect:/dashboard"; //TODO zrobić inne przekierowanie
    }
}
