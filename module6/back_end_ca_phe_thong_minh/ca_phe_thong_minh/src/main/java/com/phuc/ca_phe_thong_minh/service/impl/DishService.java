package com.phuc.ca_phe_thong_minh.service;


import com.phuc.ca_phe_thong_minh.model.Dish;
import com.phuc.ca_phe_thong_minh.repository.IDishRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DishService implements IDishService{
    @Autowired
    private IDishRepository iDishRepository;


    @Override
    public List<Dish> getAllDish() {
        return iDishRepository.findAll();
    }

    @Override
    public Dish save(Dish dish) {
        return iDishRepository.saveDish(dish);
    }

    @Override
    public Optional<Dish> findById(int id) {
        return iDishRepository.findByIdDish(id);
    }
}
