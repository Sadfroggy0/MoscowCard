package com.example.moscowcard.controllers;

import com.example.moscowcard.models.Excursion;
import com.example.moscowcard.repositories.ExcursionRepository;
import com.example.moscowcard.repositories.SpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
    @PostMapping("/excursions/buy/{id}")
    public String buy(@PathVariable("id")int id){
        Excursion excursion = excursionRepository.findById(id);
        excursion.setTickets_left(excursion.getTickets_left()-1);
        excursionRepository.save(excursion);
        return "redirect:/excursions";
    }

}
