package com.github.robertsawyer.CulturalChronicles.domain.repositories;

import com.github.robertsawyer.CulturalChronicles.domain.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByTitle(String title);

    @Query(value = "SELECT * FROM books WHERE title = ?",
    nativeQuery = true)
    Book findByBookTitle(Book book);
}
