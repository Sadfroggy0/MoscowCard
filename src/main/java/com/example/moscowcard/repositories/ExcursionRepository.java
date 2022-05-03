package com.example.moscowcard.repositories;

import com.example.moscowcard.models.Excursion;
import com.example.moscowcard.models.Spot;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExcursionRepository extends CrudRepository<Excursion, Long> {
    Spot findById(Integer id);

    List<Excursion> findAll();

    void deleteById(Integer id);
}
