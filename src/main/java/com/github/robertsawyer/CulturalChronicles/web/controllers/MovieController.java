package com.github.robertsawyer.CulturalChronicles.web.controllers;

import com.github.robertsawyer.CulturalChronicles.dto.AddMovieDTO;
import com.github.robertsawyer.CulturalChronicles.services.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
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
        return "movies/addMovieForm";
    }

}
