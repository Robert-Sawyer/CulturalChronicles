package com.github.robertsawyer.CulturalChronicles.services;

import com.github.robertsawyer.CulturalChronicles.domain.model.*;
import com.github.robertsawyer.CulturalChronicles.dto.*;

public class Converters {


    public static Movie convertToNewMovie(AddMovieDTO addMovieDTO) {
        Movie movie = new Movie();
        movie.setTitle(addMovieDTO.getTitle());
        movie.setCountry(addMovieDTO.getCountry());
        movie.setGenre(addMovieDTO.getGenre());
        movie.setYearOfProduction(addMovieDTO.getProductionYear());
        movie.setDuration(addMovieDTO.getDuration());
        movie.setDirector(addMovieDTO.getDirectors());
        movie.setProducers(addMovieDTO.getProducers());
        movie.setWriter(addMovieDTO.getWriters());
        movie.setCastMembers(addMovieDTO.getCastMembers());
        movie.setFilmStudio(addMovieDTO.getStudio());
        return movie;
    }

    public static Book convertToNewBook(AddBookDTO addBookDTO) {
        Book book = new Book();
        book.setTitle(addBookDTO.getTitle());
        book.setAuthors(addBookDTO.getAuthor());
        book.setYearOfPublish(addBookDTO.getYearOfPublish());
        book.setPublisher(addBookDTO.getPublisher());
        book.setGenre(addBookDTO.getGenre());
        book.setPages(addBookDTO.getPages());
        return book;
    }

    public static Game convertToNewGame(AddGameDTO addGameDTO) {
        Game game = new Game();
        game.setTitle(addGameDTO.getTitle());
        game.setGenre(addGameDTO.getGenre());
        return game;
    }

    public static Author convertToNewAuthor(AddAuthorDTO addAuthorDTO) {
        Author author = new Author();
        author.setName(addAuthorDTO.getName());
        author.setBirthDate(addAuthorDTO.getBirthDate());
        author.setDeathDate(addAuthorDTO.getDeathDate());
        return author;
    }

    public static User convertToUser(RegisterDTO form) {
        User user = new User();
        user.setLogin(form.getLogin());
        user.setEmail(form.getEmail());
        user.setPassword(form.getPassword());
        return user;
    }

    public static UserDTO convertToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setLogin(user.getLogin());
        return userDTO;
    }
}
