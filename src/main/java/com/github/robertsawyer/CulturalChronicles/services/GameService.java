package com.github.robertsawyer.CulturalChronicles.services;

import com.github.robertsawyer.CulturalChronicles.domain.model.Game;
import com.github.robertsawyer.CulturalChronicles.domain.repositories.GameRepository;
import com.github.robertsawyer.CulturalChronicles.dto.AddGameDTO;
import com.github.robertsawyer.CulturalChronicles.dto.FindGameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public void createNewGame(AddGameDTO addGameDTO) {
        Game game = Converters.convertToNewGame(addGameDTO);
        gameRepository.save(game);
    }

    public List<Game> getAllGames() {
        List<Game> games = gameRepository.findAll();
        return games;
    }

    public Game findByName(FindGameDTO gameTitle) {
        return gameRepository.findByGameTitle(gameTitle.getTitle());
    }
}
