package com.github.robertsawyer.CulturalChronicles.services;

import com.github.robertsawyer.CulturalChronicles.domain.model.Author;
import com.github.robertsawyer.CulturalChronicles.domain.repositories.AuthorReepository;
import com.github.robertsawyer.CulturalChronicles.dto.AddAuthorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class AuthorService {

    @Autowired
    private AuthorReepository authorReepository;

    public boolean checkAuthor(Set<Author> authors) {
        if (authors.isEmpty()) {
            throw new IllegalArgumentException("Musisz podać autora książki.");
        }
        try {
            for (Author newAuthor : authors) {
                String author = newAuthor.toString();
                Author checkedAuthor = authorReepository.checkAuthor(author);
                if (checkedAuthor == null) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException re) {
            return false;
        }
    }

    @Transactional
    public void createNewAuthor(AddAuthorDTO addAuthorDTO) {
        Author author = Converters.convertToNewAuthor(addAuthorDTO);
        authorReepository.save(author);
    }
}
