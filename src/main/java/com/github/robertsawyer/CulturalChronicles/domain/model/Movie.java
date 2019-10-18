package com.github.robertsawyer.CulturalChronicles.domain.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "movies")
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column
    @ElementCollection(targetClass=String.class)
    private Set<Director> director;

    @Column
    @ElementCollection(targetClass=String.class)
    private Set<Writer> writer;

    @Column
    @ElementCollection(targetClass=String.class)
    private Set<Producer> producers;

    @Column
    @ElementCollection(targetClass = CastMember.class)
    private Set<CastMember> castMembers;

    @Column
    private Integer yearOfProduction;

    @Column
    private Double rating;

    @Column
    private Boolean favourite;

    @Column
    private Long duration;

    @Column
    @ElementCollection(targetClass=String.class)
    private Set<String> country = new HashSet<>();

    @Column
    @ElementCollection(targetClass=String.class)
    private Set<String> genre = new HashSet<>();

    //TODO dodać resztę członków ekipy (montażysta, operator itp.)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Set<Director> getDirector() {
        return director;
    }

    public void setDirector(Set<Director> director) {
        this.director = director;
    }

    public Set<Writer> getWriter() {
        return writer;
    }

    public void setWriter(Set<Writer> writer) {
        this.writer = writer;
    }

    public Set<Producer> getProducers() {
        return producers;
    }

    public void setProducers(Set<Producer> producers) {
        this.producers = producers;
    }

    public Set<String> getCountry() {
        return country;
    }

    public void setCountry(Set<String> country) {
        this.country = country;
    }

    public Set<String> getGenre() {
        return genre;
    }

    public void setGenre(Set<String> genre) {
        this.genre = genre;
    }

    public Set<CastMember> getCastMembers() {
        return castMembers;
    }

    public void setCastMembers(Set<CastMember> castMembers) {
        this.castMembers = castMembers;
    }
}
