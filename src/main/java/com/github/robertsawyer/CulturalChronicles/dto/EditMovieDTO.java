package com.github.robertsawyer.CulturalChronicles.dto;

import lombok.AllArgsConstructor;

import java.util.Set;

@AllArgsConstructor
public class EditMovieDTO {

    private Long movieId;
    private Long duration;
    private Set<String> genre;

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Set<String> getGenre() {
        return genre;
    }

    public void setGenre(Set<String> genre) {
        this.genre = genre;
    }
}
