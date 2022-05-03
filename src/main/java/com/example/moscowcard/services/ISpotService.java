package com.example.moscowcard.services;

import com.example.moscowcard.models.Spot;

import java.util.List;

public interface ISpotService {
    Spot findById(int id);

    List<Spot> findAll();

    void save(Spot spot);

    void deleteById(int id);

    void delete(Spot spot);


}
