package com.github.robertsawyer.CulturalChronicles.services;

import com.github.robertsawyer.CulturalChronicles.domain.model.Movie;
import com.github.robertsawyer.CulturalChronicles.domain.repositories.MovieRepository;
import com.github.robertsawyer.CulturalChronicles.dto.AddMovieDTO;
import com.github.robertsawyer.CulturalChronicles.dto.FindMovieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional
    public void createNewMovie(AddMovieDTO addMovieDTO) {
        Movie movie = Converters.convertToNewMovie(addMovieDTO);
        movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        List<Movie> movies = movieRepository.findAll();
        return movies;
    }

    public Movie findByName(FindMovieDTO movieTitle) {
        Movie movie = Converters.convertFindMovieDTOtoMovie(movieTitle);
        return movieRepository.findByMovieTitle(movie);
    }
}
