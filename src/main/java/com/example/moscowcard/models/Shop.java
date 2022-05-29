package com.example.moscowcard.models;

import org.hibernate.annotations.ListIndexBase;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(name = "items_left")
    private int itemsLeft;
    private int price;
    private String description;
    private String link;
    private String characteristics;

    public Shop(){}
    public Shop(String name, int itemsLeft, int price, String description, String link,String characteristics){
        this.name = name;
        this.itemsLeft = itemsLeft;
        this.price = price;
        this.description = description;
        this.characteristics = characteristics;
        this.link = link;

    }
    public Shop(String name, int itemsLeft, int price, String description,String link){
        this.name = name;
        this.itemsLeft = itemsLeft;
        this.price = price;
        this.description = description;
        this.link = link;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemsLeft() {
        return itemsLeft;
    }

    public void setItemsLeft(int itemsLeft) {
        this.itemsLeft = itemsLeft;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }
}
