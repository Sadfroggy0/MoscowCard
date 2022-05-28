package com.example.moscowcard.controllers;

import com.example.moscowcard.repositories.ExcursionRepository;
import com.example.moscowcard.repositories.SpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExcursionController {
    @Autowired
    ExcursionRepository excursionRepository;
    @Autowired
    SpotRepository spotRepository;


    @GetMapping("/excursions")
    public String excursions(Model model){
        model.addAttribute("excursionList",excursionRepository.findAll());
        return "excursions";
    }

}
