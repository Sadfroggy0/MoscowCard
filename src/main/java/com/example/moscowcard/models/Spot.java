package com.example.moscowcard.models;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="spot")
public class Spot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String link;
    private  static final String modelName = "spots";

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "excursion_id")
//    private Excursion excursion;

    public Spot(){}


    public Spot(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Spot(String name, String description,String link) {
        this.name = name;
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

    @Override
    public String toString() {
        return id +"| "+ name +"| "+description;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public static String getModelName() {
        return modelName;
    }

//    public void setExcursion(Excursion excursion) {
//        this.excursion = excursion;
//    }
//    public Excursion getExcursion(){
//        return excursion;
//    }
}
