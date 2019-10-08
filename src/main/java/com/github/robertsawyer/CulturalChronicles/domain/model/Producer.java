package com.github.robertsawyer.CulturalChronicles.domain.model;

import java.util.List;

public class Producer {

    private Long id;
    private String firstName;
    private String lastName;
    private Integer yearOfBirth;
    private Integer yearOfDeath;
    private Boolean favourite;
    private List<Movie> movies;
}
