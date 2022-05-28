package com.example.moscowcard.controllers;

import com.example.moscowcard.repositories.SpotRepository;
import com.example.moscowcard.services.SpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SpotController {

    @Autowired
    SpotService spotService;

    @GetMapping("/spot/{id}")
    public String spot(Model model,@PathVariable Integer id){
        model.addAttribute("spot",spotService.findById(id));

        return "spot";
    }

}
