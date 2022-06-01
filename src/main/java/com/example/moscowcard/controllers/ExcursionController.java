package com.example.moscowcard.controllers;

import com.example.moscowcard.models.Excursion;
import com.example.moscowcard.repositories.ExcursionRepository;
import com.example.moscowcard.repositories.SpotRepository;
import com.example.moscowcard.services.ExcursionService;
import com.example.moscowcard.services.SpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExcursionController {
    @Autowired
    ExcursionService excursionService;
    @Autowired
    SpotService spotService;

    @GetMapping("/excursions")
    public String excursions(Model model){
        model.addAttribute("excursionList",excursionService.findAll());

        return "excursions";
    }

    @PostMapping("/excursions/buy/{id}")
    public String buy(@PathVariable("id")int id){
        Excursion excursion = excursionService.findById(id);
        excursion.setTickets_left(excursion.getTickets_left()-1);
        excursionService.save(excursion);
        return "redirect:/excursions";
    }

}
