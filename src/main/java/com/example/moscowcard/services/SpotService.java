package com.example.moscowcard.services;

import com.example.moscowcard.models.Spot;
import com.example.moscowcard.repositories.SpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Transactional
@Service
public class SpotService implements ISpotService{

    @Autowired
    private  SpotRepository spotRepository;

    @Transactional
    @Override
    public Spot findById(int id) {
        return spotRepository.findById(id);
    }

    @Override
    public List<Spot> findAll() {
        return new ArrayList<>(spotRepository.findAll());
    }

    @Override
    public void save(Spot spot) {
        spotRepository.save(spot);
    }

    @Override
    public void deleteById(int id) {
        spotRepository.deleteById(id);
    }

    @Override
    public void delete(Spot spot) {
        spotRepository.delete(spot);
    }
}
