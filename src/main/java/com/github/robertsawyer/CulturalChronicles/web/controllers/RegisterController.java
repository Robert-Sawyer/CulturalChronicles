package com.github.robertsawyer.CulturalChronicles.web.controllers;

import com.github.robertsawyer.CulturalChronicles.dto.RegisterDTO;
import com.github.robertsawyer.CulturalChronicles.dto.UserDTO;
import com.github.robertsawyer.CulturalChronicles.services.UserService;
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
@RequestMapping("/register")
public class RegisterController {

    public static final Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @Autowired
    private UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String prepareRegistrationForm(Model model) {
        model.addAttribute("register", new RegisterDTO());
        return "home/register";
    }

    @PostMapping
    public String processRegistration(@Valid @ModelAttribute("register") RegisterDTO form, BindingResult result) {
        if (result.hasErrors()) {
            return "home/register";
        }
        if (!checkPasswordEquality(form)) {
            result.rejectValue("password", null, "Hasło i powtórzone hasło niezgodne");
            return "home/registrer";
        }
        if (!checkIsUsernameIsAvailable(form)) {
            result.rejectValue("login", null, "Nazwa użytkownika już zajęta");
            return "home/register";
        }
        logger.info("Rejestruję nowego użytkownika.");
        //Konwersja rfDTO na user encja i wywołąnie userrepositiry.save(...);
        userService.registerUser(form);
        return "redirect:/home/home";
    }

    private boolean checkIsUsernameIsAvailable(RegisterDTO form) {
        UserDTO user = userService.findUser(form.getLogin());
        if (user == null) {
            return true;
        }
        return false;
    }

    private boolean checkPasswordEquality(RegisterDTO form) {
        return false;
    }
}
