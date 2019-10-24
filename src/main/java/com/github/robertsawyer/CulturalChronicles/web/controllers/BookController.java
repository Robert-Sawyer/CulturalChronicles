package com.github.robertsawyer.CulturalChronicles.web.controllers;

import com.github.robertsawyer.CulturalChronicles.dto.AddBookDTO;
import com.github.robertsawyer.CulturalChronicles.services.AuthorService;
import com.github.robertsawyer.CulturalChronicles.services.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/books")
public class BookController {

    public static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorService authorService;

    public BookController(AuthorService authorService, BookService bookService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @GetMapping("/add")
    public String prepareAddNewBookForm(Model model) {
        model.addAttribute("newBook", new AddBookDTO());
        return "books/addBook";
    }

    @PostMapping("/add")
    public String addNewBook(@Valid @ModelAttribute("book") AddBookDTO addBookDTO, BindingResult result) {

        if(result.hasErrors()) {
            return "books/addBook";
        }
        if(!checkIfAuthorExists(addBookDTO)) {
            result.rejectValue("author", null, "Taki autor nie istnieje w bazie. Zanim dodasz książkę, dodaj autora.");
        }
        logger.info("Zapisuję nowa książkę do bazy danych.");

        bookService.createNewBook(addBookDTO);
        return "redirect:/dashboard";
    }

    private boolean checkIfAuthorExists(AddBookDTO addBookDTO) {
        return authorService.checkAuthor(addBookDTO.getAuthor());
    }

}
