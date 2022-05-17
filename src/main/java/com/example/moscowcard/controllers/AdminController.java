package com.example.moscowcard.controllers;

import com.example.moscowcard.models.Spot;
import com.example.moscowcard.services.ExcursionService;
import com.example.moscowcard.services.SpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminController {

    @Autowired
    SpotService spotService;

    @Autowired
    ExcursionService excursionService;


    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/admin/{tableName}/show")
    public String show(Model model, @PathVariable String tableName ){

        if (tableName.equals("spots"))
            model.addAttribute("table",spotService.findAll());
        if (tableName.equals("excursions"))
            model.addAttribute("table",excursionService.findAll());

        return "show";
    }

    @GetMapping("/admin/spots/new")
    public String newSpot(Model model){
        model.addAttribute("spot",new Spot());
        return "new";
    }

   // @RequestMapping(value="/show", method=RequestMethod.POST)
    @PostMapping("/show")
    public String create(@ModelAttribute("spot")Spot spot){
        spotService.save(spot);
        return "redirect:/admin/spots/show";
    }

    @GetMapping("/admin/spots/{id}/edit")
    public String edit(Model model, @PathVariable("id")int id ){
        model.addAttribute("spot", spotService.findById(id));
        return "edit";
    }
    @PatchMapping("/{id}")
    public String update(@ModelAttribute("spot")Spot spot,@PathVariable("id")int id ){
        spotService.save(spot);
        return "redirect:/admin/spots/show";
    }


    /*
    @PatchMapping("/{id}")
    public String update(@ModelAttribute("spot") new Spot(), @PathVariable("id") int id) {
        spotService.save(spot);
        return "redirect:/people";
    }*/

}
