package com.example.moscowcard.models;

import javax.persistence.*;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "spot_id")
    private Spot spot;

    public Excursion(){}

    public Excursion(String name, int tickets, int tickets_left, int price, Spot spot) {
        this.name = name;
        this.tickets = tickets;
        this.tickets_left = tickets_left;
        this.price = price;
        this.spot = spot;
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

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }

}
