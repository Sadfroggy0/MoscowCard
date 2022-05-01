package com.example.moscowcard.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="spot")
public class Spot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "spot", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Excursion> excursionList;

    public Spot(){};

    public Spot(String name, String description) {
        this.name = name;
        this.description = description;
        excursionList = new ArrayList<>();
    }

    public void addExcursion(Excursion excursion) {
        excursion.setSpot(this);
        excursionList.add(excursion);
    }
    public List<Excursion> getAutos() {
        return excursionList;
    }
    public void setExcursionList(List<Excursion> excursionList) {
        this.excursionList = excursionList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }
}
