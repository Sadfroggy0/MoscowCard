package com.example.moscowcard.controllers;

import com.example.moscowcard.models.Shop;
import com.example.moscowcard.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/catalog")
public class ShopController {
    @Autowired
    ShopService shopService;

    @GetMapping()
    public String catalog(Model model){
        model.addAttribute("shopList",shopService.findAll());
        return "catalog";
    }

    @GetMapping("/item/{id}")
    public String item(@PathVariable Integer id, Model model){
        model.addAttribute("item",shopService.findById(id));
        model.addAttribute("char", shopService.findAllCharacteristicsById(id));
        return "items/item";
    }
    @PostMapping()
    public String purchase(@ModelAttribute("it") Shop shop){
//        ArrayList<Shop> list  = new ArrayList<>(shopList);
          shop.setItemsLeft(shop.getItemsLeft()-1);
          shopService.save(shop);
        return "redirect:/catalog";
    }

}
