package com.github.robertsawyer.CulturalChronicles.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @GetMapping("/userProfile")
    public String showPofile(Model model) {
        return "user/userProfile";
    }
}
