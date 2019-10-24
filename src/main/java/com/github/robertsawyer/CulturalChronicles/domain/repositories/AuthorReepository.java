package com.github.robertsawyer.CulturalChronicles.domain.repositories;

import com.github.robertsawyer.CulturalChronicles.domain.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface AuthorReepository extends JpaRepository<Author, Long> {


    Author checkAuthor(String author);
}
