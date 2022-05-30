package com.example.moscowcard.controllers;

import com.example.moscowcard.models.Spot;
import com.example.moscowcard.repositories.SpotRepository;
import com.example.moscowcard.services.ShopService;
import com.example.moscowcard.services.SpotService;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@org.springframework.stereotype.Controller
public class IndexController {
    @Autowired
    SpotService spotService;
    @Autowired
    ShopService shopService;

    @GetMapping("/index")
    public String mainPage(){
        return "index";
    }



    @GetMapping("/items/ushanka")
    public String milk(){
        return "/items/ushanka";
    }

    @GetMapping("/items/caviar")
    public String cookies(){
        return "/items/caviar";
    }

    @GetMapping("/items/valenki")
    public String salad(){
        return "/items/valenki";
    }

    @GetMapping("/sights")
    public String sights(Model model) {
        model.addAttribute("sightsList",spotService.findAll());
        return "sights";
    }



}
