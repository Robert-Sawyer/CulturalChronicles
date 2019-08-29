package com.github.robertsawyer.CulturalChronicles.web.controllers;

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

    @GetMapping
    public String prepareRegistrationForm(Model model) {
        return "home/register";
    }

//    @PostMapping
//    public String processRegistration(@Valid @ModelAttribute("registrationForm") RegistrationFormDTO form, BindingResult result){
//        if (result.hasErrors()){
//            return "registration-page";
//        }
//        if(!checkPasswordEquality(form)){
//            result.rejectValue("password", null, "Hasło i powtórzone hasło niezgodne");
//            return "registration-page";
//        }
//        if(!checkIsUsernameIsAvailable(form)){
//            result.rejectValue("login", null, "Nazwa użytkownika już zajęta");
//            return "registration-page";
//        }
//        //Konwersja rfDTO na user encja i wywołąnie userrepositiry.save(...);
//        userService.registerUser(form);
//        return "redirect:/index.html";
}
