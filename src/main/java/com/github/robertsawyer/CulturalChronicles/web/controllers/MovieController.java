package com.github.robertsawyer.CulturalChronicles.web.controllers;

import com.github.robertsawyer.CulturalChronicles.domain.model.Movie;
import com.github.robertsawyer.CulturalChronicles.dto.AddMovieDTO;
import com.github.robertsawyer.CulturalChronicles.dto.FindMovieDTO;
import com.github.robertsawyer.CulturalChronicles.services.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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
    public String addNewMovie(@Valid @ModelAttribute("newMovie") AddMovieDTO addMovieDTO, BindingResult bindingResult) {

        if (bindingResult.hasErrors()){
            return "movies/addMovie";
        }
        if (!checkIfGenreExists(addMovieDTO)) {
            bindingResult.rejectValue("genre", null, "Taki gatunek nie istnieje. Wybierz gatunek z listy.");
        }

        logger.info("Dodaję film do bazy.");

        movieService.createNewMovie(addMovieDTO);
        return "redirect:/dashboard"; //TODO zrobić inne przekierowanie
    }

    @GetMapping("/listAllMovies")
    public String showMoviesList(Model model) {
        model.addAttribute("movieTitle", new FindMovieDTO());
        model.addAttribute("movies", movieService.getAllMovies());
        return "movies/listAllMovies";
    }

    @PostMapping(value = "/listAllMovies", params = "search")
    public Movie findMovie(@ModelAttribute("movieTitle") FindMovieDTO movieTitle) {
        return movieService.findByName(movieTitle);
    }

    @DeleteMapping(value = "/{movieId}")
    public void deleteMovie(Long movieId) {
        movieService.deleteMovie(movieId);
    }

    private boolean checkIfGenreExists(AddMovieDTO addMovieDTO) {
        return movieService.checkGenre(addMovieDTO.getGenre());
    }

}
