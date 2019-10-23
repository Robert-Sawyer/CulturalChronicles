package com.github.robertsawyer.CulturalChronicles.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cockpite")
public class CockpiteController {

    @GetMapping
    public String showCockpite(Model model) {
        return "home/cockpite";
    }
}
