package com.example.moscowcard.services;

import com.example.moscowcard.models.Excursion;
import com.example.moscowcard.models.Spot;

import java.util.List;

public interface IExcursionService {
    Spot findById(int id);

    List<Excursion> findAll();

    void save(Excursion excursion);

    void deleteById(int id);

    void delete(Excursion excursion);
}
