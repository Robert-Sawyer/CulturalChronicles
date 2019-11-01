package com.github.robertsawyer.CulturalChronicles.web.controllers;

import com.github.robertsawyer.CulturalChronicles.dto.AddAuthorDTO;
import com.github.robertsawyer.CulturalChronicles.services.AuthorService;
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
@RequestMapping("/authors")
public class AuthorController {

    public static final Logger logger = LoggerFactory.getLogger(AuthorController.class);

    @Autowired
    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/add")
    public String prepareAddNewAuthorForm(Model model) {
        model.addAttribute("newAuthor", new AddAuthorDTO());
        return "authors/addAuthor";
    }

    @PostMapping("/add")
    public String addNewAuthor(@Valid @ModelAttribute("author") AddAuthorDTO addAuthorDTO, BindingResult result) {
        if (result.hasErrors()) {
            return "authors/addAuthor";
        }

        logger.info("Zapisuję nowego autora do bazy.");
        authorService.createNewAuthor(addAuthorDTO);
        return "redirect:/dashboard";
    }

}
