package com.github.robertsawyer.CulturalChronicles.domain.model;

import java.util.List;

public class Movie {

    private Long id;
    private String title;
    private List<Director> director;
    private List<Writer> writer;
    private List<Producer> producers;
    private Integer yearOfProduction;
    private Double rating;
    private Boolean favourite;
    private Long duration;
    private List<String> country;
    private List<String> genre;

}
