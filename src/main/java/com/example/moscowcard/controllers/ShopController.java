package com.example.moscowcard.controllers;

import com.example.moscowcard.services.ShopService;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog")
public class ShopController {
    @Autowired
    ShopService shopService;

    @GetMapping("/item/{id}")
    public String item(@PathVariable Integer id, Model model){
        model.addAttribute("item",shopService.findById(id));
        model.addAttribute("char", shopService.findAllCharacteristicsById(id));
        return "items/item";
    }
}
