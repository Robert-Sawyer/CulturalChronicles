package com.github.robertsawyer.CulturalChronicles.services;

import com.github.robertsawyer.CulturalChronicles.domain.model.Book;
import com.github.robertsawyer.CulturalChronicles.domain.repositories.BookRepository;
import com.github.robertsawyer.CulturalChronicles.dto.AddBookDTO;
import com.github.robertsawyer.CulturalChronicles.dto.FindBookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public void createNewBook(AddBookDTO addBookDTO) {
        Book book = Converters.convertToNewBook(addBookDTO);
        bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books;
    }

    public Book findByName(FindBookDTO findBook) {
//        Book book = Converters.convertFindBookDTOtoBook(bookTitle);
        return bookRepository.findByBookTitle(findBook.getTitle());
    }
}
