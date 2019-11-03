package com.github.robertsawyer.CulturalChronicles.domain.repositories;

import com.github.robertsawyer.CulturalChronicles.domain.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorReepository extends JpaRepository<Author, Long> {


    Author checkAuthor(String author);

    @Query(value = "SELECT * FROM authors WHERE name = ?",
    nativeQuery = true)
    Author findByAuthorName(Author author);

}
