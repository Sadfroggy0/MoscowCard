package com.example.moscowcard.controllers;

import com.example.moscowcard.repositories.SpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpotController {
    @Autowired
    SpotRepository spotRepository;

    @GetMapping("/spot/{id}")
    public String spot(Model model,@PathVariable Integer id){
        model.addAttribute("spot",spotRepository.findById(id));

        return "spot";
    }
}
