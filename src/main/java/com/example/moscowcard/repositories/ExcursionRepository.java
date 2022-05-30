package com.example.moscowcard.repositories;

import com.example.moscowcard.models.Excursion;
import com.example.moscowcard.models.Spot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ExcursionRepository extends CrudRepository<Excursion, Long> {
    Excursion findById(Integer id);

    List<Excursion> findAll();

    void deleteById(Integer id);


}
