package com.example.moscowcard.controllers;

import com.example.moscowcard.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
