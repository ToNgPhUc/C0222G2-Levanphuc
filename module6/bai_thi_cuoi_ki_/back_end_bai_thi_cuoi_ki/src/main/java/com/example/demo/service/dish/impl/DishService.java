package com.example.demo.service.dish.impl;

import com.example.demo.model.Dish;
import com.example.demo.repository.IDishRepository;
import com.example.demo.service.dish.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DishService implements IDishService {
    @Autowired
    private IDishRepository iDishRepository;


    @Override
    public Page<Dish> findAllDish(Pageable pageable) {
        return iDishRepository.findAll(pageable);
    }

    @Override
    public Page<Dish> searchDish(String name, String code, String price, String dishType, Pageable pageable) {
        return iDishRepository.searchDishPage("%" + name + "%", "%" + code + "%", "%" + price + "%", dishType, pageable);
    }
}
