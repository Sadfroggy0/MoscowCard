package com.example.moscowcard.services;

import com.example.store.daos.ExcursionDao;
import com.example.store.models.Excursion;

public class ExcursionService {
    ExcursionDao excursionDao = new ExcursionDao();
    public void saveExcursion(Excursion excursion){
        excursionDao.save(excursion);
    }

    public void updateExcursion(Excursion excursion){
        excursionDao.update(excursion);
    }

    public void deleteExcursion(Excursion excursion){
        excursionDao.delete(excursion);
    }
}
