package com.github.robertsawyer.CulturalChronicles.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userProfile")
public class ProfileController {

    @GetMapping
    public String showProfile(Model model) {
        return "user/userProfile";
    }
}
