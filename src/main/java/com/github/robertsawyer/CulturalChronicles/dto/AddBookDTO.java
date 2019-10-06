package com.github.robertsawyer.CulturalChronicles.dto;

import com.github.robertsawyer.CulturalChronicles.domain.model.Author;
import com.github.robertsawyer.CulturalChronicles.domain.model.Publisher;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class AddBookDTO {

    private String title;
    private Author author;
    private Long yearOfPublish;
    private Publisher publisher;
    private String genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
