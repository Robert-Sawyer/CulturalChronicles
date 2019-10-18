package com.github.robertsawyer.CulturalChronicles.dto;

import com.github.robertsawyer.CulturalChronicles.domain.model.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
public class AddMovieDTO {

    @NotNull
    private String title;

    @NotNull
    private Set<String> genre;

    private Set<String> country;
    private Integer productionYear;
    private Long duration;
    private Set<Director> directors;
    private Set<Writer> writers;
    private Set<Producer> producers;
    private Set<CastMember> castMembers;
    private FilmStudio studio;



    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Set<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(Set<Director> directors) {
        this.directors = directors;
    }

    public Set<Writer> getWriters() {
        return writers;
    }

    public void setWriters(Set<Writer> writers) {
        this.writers = writers;
    }

    public Set<Producer> getProducers() {
        return producers;
    }

    public void setProducers(Set<Producer> producers) {
        this.producers = producers;
    }

    public Set<CastMember> getCastMembers() {
        return castMembers;
    }

    public void setCastMembers(Set<CastMember> castMembers) {
        this.castMembers = castMembers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<String> getGenre() {
        return genre;
    }

    public void setGenre(Set<String> genre) {
        this.genre = genre;
    }

    public Set<String> getCountry() {
        return country;
    }

    public void setCountry(Set<String> country) {
        this.country = country;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public FilmStudio getStudio() {
        return studio;
    }

    public void setStudio(FilmStudio studio) {
        this.studio = studio;
    }
}
