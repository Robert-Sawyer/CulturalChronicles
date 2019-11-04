package com.github.robertsawyer.CulturalChronicles.web.controllers;

import com.github.robertsawyer.CulturalChronicles.domain.model.Game;
import com.github.robertsawyer.CulturalChronicles.dto.AddGameDTO;
import com.github.robertsawyer.CulturalChronicles.dto.FindGameDTO;
import com.github.robertsawyer.CulturalChronicles.services.GameService;
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
@RequestMapping("/games")
public class GameController {

    public static final Logger logger = LoggerFactory.getLogger(GameController.class);

    @Autowired
    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/add")
    public String prepareAddNewGameForm(Model model) {
        model.addAttribute("newGame", new AddGameDTO());
        return "games/addGame";
    }

    @PostMapping("/add")
    public String addNewGame(@Valid @ModelAttribute("game") AddGameDTO addGameDTO, BindingResult result) {

        if (result.hasErrors()) {
            return "games/addGame";
        }

        logger.info("Zapisuję nową grę do bazy");

        gameService.createNewGame(addGameDTO);
        return "redirect:/dashboard";
    }

    @GetMapping("/listAllGames")
    public String showGamesList(Model model) {
        model.addAttribute("gameTitle", new FindGameDTO());
        model.addAttribute("games", gameService.getAllGames());
        return "games/listAllGames";
    }

    @PostMapping(value = "listAllGames", params = "search")
    public Game findGame(@ModelAttribute("games") FindGameDTO gameTitle) {
        return gameService.findByName(gameTitle);
    }
    
}
