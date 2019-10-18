package com.github.robertsawyer.CulturalChronicles.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private LocalDate created;

    @Column(name = "enabled")
    private Boolean enabled = true;

//    @ManyToMany
//    @JoinTable(name = "user_role",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))
//    private Set<Role> role = new HashSet<Role>();

    @OneToOne
    private UserDetails userDetails;

    @Column
    @ElementCollection(targetClass=Movie.class)
    private Set<Movie> movies;

    @Column
    @ElementCollection(targetClass=Book.class)
    private Set<Book> books;

    @Column
    @ElementCollection(targetClass=Game.class)
    private Set<Game> games;

    @PrePersist
    public void prePersist() {
        created = LocalDate.now();
    }
}
