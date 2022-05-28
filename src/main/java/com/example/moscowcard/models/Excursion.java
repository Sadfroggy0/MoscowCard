package com.example.moscowcard.models;

import com.example.moscowcard.repositories.SpotRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "excursion")
public class Excursion {


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    private int tickets;
    private int tickets_left;
    private int price;


    @OneToMany(mappedBy = "excursion",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Spot> spotList;

    public Excursion(){}

    public Excursion(String name, int tickets, int tickets_left, int price) {
        this.name = name;
        this.tickets = tickets;
        this.tickets_left = tickets_left;
        this.price = price;
        spotList = new ArrayList<>();
    }
    public void addSpot(Spot spot){
        spot.setExcursion(this);
        spotList.add(spot);
    }
    public void removeSpot(Spot spot){
        spotList.remove(spot);
    }
    public void setSpotList(List<Spot>spotList){
        this.spotList = spotList;
    }

    public List<Spot> getSpotList() {
        return spotList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public int getTickets_left() {
        return tickets_left;
    }

    public void setTickets_left(int tickets_left) {
        this.tickets_left = tickets_left;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public Spot getSpot() {
//        return spot;
//    }

//    public void setSpot(Spot spot) {
//        this.spot = spot;
//    }




}
