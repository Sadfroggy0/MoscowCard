package com.example.moscowcard.services;

import com.example.moscowcard.models.Shop;
import com.example.moscowcard.models.Spot;

import java.util.List;

public interface IShopService {
    Shop findById(int id);

    List<Shop> findAll();

    void save(Shop shop);

    void deleteById(int id);

    void delete(Shop shop);

    String[]findAllCharacteristicsById(int id);
}
