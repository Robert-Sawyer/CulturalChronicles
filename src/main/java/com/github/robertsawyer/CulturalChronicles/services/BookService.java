package com.github.robertsawyer.CulturalChronicles.services;

import com.github.robertsawyer.CulturalChronicles.domain.model.Book;
import com.github.robertsawyer.CulturalChronicles.domain.repositories.BookRepository;
import com.github.robertsawyer.CulturalChronicles.dto.AddBookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public void createNewBook(AddBookDTO addBookDTO) {
        Book book = Converters.convertToNewBook(addBookDTO);
        bookRepository.save(book);
    }
}
