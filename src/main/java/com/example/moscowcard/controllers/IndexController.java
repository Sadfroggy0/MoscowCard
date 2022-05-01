package com.example.moscowcard.controllers;

import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.stereotype.Controller
public class IndexController {
    @GetMapping("/index")
    public String mainPage(){
        return "index";
    }

    @GetMapping("/catalog")
    public String catalog(){
        return "catalog";
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
    public String sights() {return "sights";}

}
