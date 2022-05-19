package com.example.moscowcard;

import com.example.moscowcard.models.Excursion;
import com.example.moscowcard.models.Spot;
import com.example.moscowcard.repositories.ExcursionRepository;
import com.example.moscowcard.repositories.SpotRepository;
import com.example.moscowcard.services.SpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class MoscowCardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoscowCardApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(SpotRepository spotrep, ExcursionRepository er) {
        return (args) -> {
            /*Spot wanToChange = spotrep.findById(5);
            wanToChange.setDescription("This is changed decription for 5 index");
            spotrep.save(wanToChange);
            SpotService spotService = new SpotService();
            ArrayList<Spot> list= new ArrayList<>(spotService.getAllSpot());
            for (Spot o:
                 list) {
                System.out.println(o.getId() + " " + o.getName() + " " + o.getDescription());
            }
            SpotService ss = new SpotService();
            Spot spot = ss.findById(7);
            System.out.println(spot.getName());


            ArrayList<Spot>spotList = new ArrayList<>();
            Collections.addAll(spotList,
                    new Spot("VDNH","VDNH description"),
                    new Spot("Krmlin","Kremlin description"),
                    new Spot("Government House","Government house description"));

            spotrep.deleteAll();
            spotrep.saveAll(spotList);

             */
           er.save(new Excursion("Tsaritsiono Excursion", 333, 100, 666, spotrep.findById(34)));


        };


    }
}
