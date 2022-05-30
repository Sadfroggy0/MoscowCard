package com.example.moscowcard.services;

import com.example.moscowcard.models.Excursion;
import com.example.moscowcard.models.Spot;
import com.example.moscowcard.repositories.ExcursionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class ExcursionService  implements IExcursionService{
    @Autowired
    ExcursionRepository excursionRepository;


    @Override
    public Excursion findById(int id) {
        return excursionRepository.findById(id);
    }

    @Override
    public List<Excursion> findAll() {
        return new ArrayList<>(excursionRepository.findAll());
    }

    @Override
    public void save(Excursion excursion) {
        excursionRepository.save(excursion);
    }

    @Override
    public void deleteById(int id) {
        excursionRepository.deleteById(id);
    }

    @Override
    public void delete(Excursion excursion) {
        excursionRepository.delete(excursion);
    }
}
