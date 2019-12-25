package com.github.robertsawyer.CulturalChronicles.services;

import com.github.robertsawyer.CulturalChronicles.domain.model.Movie;
import com.github.robertsawyer.CulturalChronicles.domain.repositories.MovieRepository;
import com.github.robertsawyer.CulturalChronicles.dto.AddMovieDTO;
import com.github.robertsawyer.CulturalChronicles.dto.EditMovieDTO;
import com.github.robertsawyer.CulturalChronicles.dto.FindMovieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

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
        return movieRepository.findByMovieTitle(movieTitle.getTitle());
    }

    public boolean checkGenre(Set<String> genres) {
        if (genres.isEmpty()){
            throw new IllegalArgumentException("Musisz wybrać gatunek.");
        }
        try {
            for (String genre : genres) {
                String newGenre = movieRepository.checkGenre(genre);
                if (newGenre == null) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException re) {
            return false;
        }
    }

    public void editMovie(EditMovieDTO editMovieDTO){
        Movie movie = movieRepository.findById(editMovieDTO.getMovieId()).get();
        movie.setDuration(editMovieDTO.getDuration());
        movie.setGenre(editMovieDTO.getGenre());
        movieRepository.save(movie);
    }
}
