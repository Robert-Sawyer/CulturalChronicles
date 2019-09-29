package com.github.robertsawyer.CulturalChronicles.services;

import com.github.robertsawyer.CulturalChronicles.domain.model.Movie;
import com.github.robertsawyer.CulturalChronicles.dto.AddMovieDTO;

public class Converters {


    public static Movie convertToNewMovie(AddMovieDTO addMovieDTO) {
        Movie movie = new Movie();
        movie.setTitle(addMovieDTO.getTitle());
        movie.setCountry(addMovieDTO.getCountry());
        movie.setGenre(addMovieDTO.getGenre());
        movie.setYearOfProduction(addMovieDTO.getProductionYear());
        return movie;
    }
}
