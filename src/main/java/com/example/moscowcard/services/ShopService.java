package com.example.moscowcard.services;

import com.example.moscowcard.models.Shop;
import com.example.moscowcard.models.Spot;
import com.example.moscowcard.repositories.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ShopService implements IShopService {

    @Autowired
    private ShopRepository shopRepository;

    @Override
    public Shop findById(int id) {
        return shopRepository.findById(id);
    }

    @Override
    public List<Shop> findAll() {
        return new ArrayList<>(shopRepository.findAll());
    }

    @Override
    public void save(Shop shop) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void delete(Shop shop) {

    }

    @Override
    public String[] findAllCharacteristicsById(int id) {
        Shop shop = shopRepository.findById(id);
        String[]list = shop.getCharacteristics().split(";");
        return list;
    }
}
