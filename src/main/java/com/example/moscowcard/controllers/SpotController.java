package com.example.moscowcard.controllers;

import com.example.store.services.SpotService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spot")
public class SpotController {
    SpotService spotService = new SpotService();

    @GetMapping("/{id}")
    public String spot(Model model,@PathVariable int id){
        model.addAttribute("spot",spotService.findById(id));

        return "spot";
    }
}
