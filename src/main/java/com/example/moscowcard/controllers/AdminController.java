package com.example.moscowcard.controllers;

import com.example.moscowcard.models.Excursion;
import com.example.moscowcard.models.Shop;
import com.example.moscowcard.models.Spot;
import com.example.moscowcard.services.ExcursionService;
import com.example.moscowcard.services.ShopService;
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
    @Autowired
    ShopService shopService;


    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/admin/{tableName}/show")
    public String show(Model model, @PathVariable String tableName ){

        if (tableName.equals("spots")) {
            model.addAttribute("table", spotService.findAll());
            model.addAttribute("model",Spot.getModelName());
        }
        if (tableName.equals("excursions")) {
            model.addAttribute("table", excursionService.findAll());
            model.addAttribute("model",Excursion.getModelName());
        }
        if (tableName.equals("shop")) {
            model.addAttribute("table", shopService.findAll());
            model.addAttribute("model",Shop.getModelName());
        }
            
        return "show";
    }

    @GetMapping("/admin/spots/new")
    public String newSpot(Model model){
        model.addAttribute("model",new Spot());
        return "new";
    }
    @GetMapping("/admin/excursions/new")
    public String newExcursion(Model model){
        model.addAttribute("model",new Excursion());
        return "new";
    }
    @GetMapping("/admin/shop/new")
    public String newShop(Model model){
        model.addAttribute("model",new Shop());
        return "new";
    }

   // @RequestMapping(value="/show", method=RequestMethod.POST)
    @PostMapping("/spots/show")
    public String create(@ModelAttribute("model")Spot spot){
        spotService.save(spot);
        return "redirect:/admin/spots/show";
    }
    @PostMapping("/excursions/show")
    public String create(@ModelAttribute("spot")Excursion excursion){
        excursionService.save(excursion);
        return "redirect:/admin/excursions/show";
    }
    @PostMapping("/shop/show")
    public String create(@ModelAttribute("model")Shop shop){
        shopService.save(shop);
        return "redirect:/admin/shop/show";
    }

    @GetMapping("/admin/{name}/{id}/edit")
    public String edit(Model model, @PathVariable("id")int id,@PathVariable("name")String name){
        if(name.equals("spots"))
            model.addAttribute("model", spotService.findById(id));
        if(name.equals("excursions"))
            model.addAttribute("model", excursionService.findById(id));
        if(name.equals("shop")){
            model.addAttribute("model", shopService.findById(id));
        }
        return "edit";
    }
//    @PostMapping("/{name}/{id}")
//    public String update(@ModelAttribute("model")Spot spot,
//                         @ModelAttribute("model")Shop shop,
//                         @ModelAttribute("model")Excursion excursion,
//                         @PathVariable("id")int id,
//                         @PathVariable("name")String name ){
//        if(name.equals("spots")) {
//            spotService.save(spot);
//            return "redirect:/admin/spots/show";
//        }
//        if (name.equals("excursions")) {
//            excursionService.save(excursion);
//            return "redirect:/admin/excursions/show";
//        }
//        if (name.equals("shop")) {
//            shopService.save(shop);
//            return "redirect:/admin/shop/show";
//        }
//        return "admin";
//
//    }
    @PostMapping("/spots/{id}")
    public String update(@ModelAttribute("model")Spot spot, @PathVariable("id")int id){
        spotService.save(spot);
        return "redirect:/admin/spots/show";
    }
    @PostMapping("/excursions/{id}")
    public String update(@ModelAttribute("model")Excursion excursion, @PathVariable("id")int id){
        excursionService.save(excursion);
        return "redirect:/admin/excursions/show";
    }
    @PostMapping("/shop/{id}")
    public String update(@ModelAttribute("model")Shop shop, @PathVariable("id")int id){
        shopService.save(shop);
        return "redirect:/admin/shop/show";
    }

    @GetMapping("/admin/spots/{id}/delete")
    public String deleteSpot(@PathVariable("id")int id){
        spotService.deleteById(id);
        return "redirect:/admin/spots/show";
    }
    @GetMapping("/admin/excursions/{id}/delete")
    public String deleteExcursions(@PathVariable("id")int id){
        excursionService.deleteById(id);
        return "redirect:/admin/excursions/show";
    }
    @GetMapping("/admin/shop/{id}/delete")
    public String deleteShop(@PathVariable("id")int id){
        shopService.deleteById(id);
        return "redirect:/admin/shop/show";
    }


}
