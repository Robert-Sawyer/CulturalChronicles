package com.github.robertsawyer.CulturalChronicles.domain.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "games")
@NoArgsConstructor
@AllArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Long yearOfRelease;
    private String genre;
    private Date dateOfRate;

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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(Long yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Date getDateOfRate() {
        return dateOfRate;
    }

    public void setDateOfRate(Date dateOfRate) {
        this.dateOfRate = dateOfRate;
    }
}
