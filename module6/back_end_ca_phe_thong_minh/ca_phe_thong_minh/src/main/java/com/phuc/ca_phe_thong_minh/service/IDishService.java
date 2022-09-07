package com.phuc.ca_phe_thong_minh.service;

import com.phuc.ca_phe_thong_minh.model.Dish;


import java.util.List;
import java.util.Optional;


public interface IDishService {

    List<Dish> getAllDish();

    void save(Dish dish);

    Optional<Dish> findById(int id);


    void editDish( Dish dish);
}
