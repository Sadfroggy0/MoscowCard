package com.example.moscowcard;

import com.example.moscowcard.models.Spot;
import com.example.moscowcard.repositories.SpotRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MoscowCardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoscowCardApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(SpotRepository spotrep) {
        return (args) -> {
            System.out.println();
            Spot spot = spotrep.findById(1);
            System.out.println(spot.getId() + " " + spot.getName() + " " + spot.getDescription());
        };

    }
}
