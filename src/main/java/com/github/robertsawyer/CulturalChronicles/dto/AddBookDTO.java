package com.github.robertsawyer.CulturalChronicles.dto;

import com.github.robertsawyer.CulturalChronicles.domain.model.Author;
import com.github.robertsawyer.CulturalChronicles.domain.model.Publisher;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
public class AddBookDTO {

    @NotNull
    @Size(min = 1)
    private String title;

    @NotNull
    @Size(min = 1)
    private Set<Author> author;

    private Long yearOfPublish;
    private Long pages;
    private Publisher publisher;
    private Set<String> genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public Set<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }

    public void setGenre(Set<String> genre) {
        this.genre = genre;
    }

    public Set<String> getGenre() {
        return genre;
    }

    public Long getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(Long yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

}
