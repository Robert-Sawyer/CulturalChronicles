package com.github.robertsawyer.CulturalChronicles.domain.model;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {

    private Long id;
    private String login;
    private String password;
    private String email;
    private LocalDate created;

    @Column(name = "enabled")
    private Boolean enabled = true;

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> role = new HashSet<>();

    private UserDetails userDetails;

    private List<Movie> movies;
    private List<Book> books;
    private List<Game> games;

    @PrePersist
    public void prePersist() {
        created = LocalDate.now();
    }
}
