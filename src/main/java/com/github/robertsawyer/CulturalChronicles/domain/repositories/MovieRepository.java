package com.github.robertsawyer.CulturalChronicles.domain.repositories;

import com.github.robertsawyer.CulturalChronicles.domain.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    String checkGenre(String genre);

    @Query(value = "SELECT * FROM movies WHERE title = ?",
    nativeQuery = true)
    Movie findByMovieTitle(Movie movie);

}
