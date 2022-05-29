package com.example.moscowcard.repositories;

import com.example.moscowcard.models.Shop;
import com.example.moscowcard.models.Spot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ShopRepository extends CrudRepository<Shop, Long> {
    Shop findById(Integer id);
    void deleteById(Integer id);
    List<Shop> findAll();
}
