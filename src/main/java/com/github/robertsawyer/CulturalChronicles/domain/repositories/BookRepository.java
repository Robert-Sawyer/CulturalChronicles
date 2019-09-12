package com.github.robertsawyer.CulturalChronicles.domain.repositories;

import com.github.robertsawyer.CulturalChronicles.domain.model.Book;

public interface BookRepository {

    Book findByTitle(String title);
}
