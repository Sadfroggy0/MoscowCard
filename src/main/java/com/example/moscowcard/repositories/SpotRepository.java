package com.example.moscowcard.repositories;

import com.example.moscowcard.models.Spot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public interface SpotRepository extends CrudRepository<Spot,Long> {

    Spot findById(Integer id);

    List<Spot> findAll();

    void deleteById(Integer id);

}
