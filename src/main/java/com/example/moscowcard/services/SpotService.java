package com.example.moscowcard.services;

import com.example.store.daos.SpotDao;
import com.example.store.models.Spot;


public class SpotService {
    private SpotDao spotDao = new SpotDao();

    public SpotService(){};

    public Spot findById(int id){
        return spotDao.findById(id);
    }

    public void saveSpot(Spot spot){
        spotDao.save(spot);
    }

    public void updateSpot(Spot spot){
        spotDao.update(spot);
    }
}
