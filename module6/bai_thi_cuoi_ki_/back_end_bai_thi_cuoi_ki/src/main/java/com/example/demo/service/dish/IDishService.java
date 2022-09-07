package com.example.demo.service.dish;

import com.example.demo.model.Dish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IDishService {

    Page<Dish> findAllDish(Pageable pageable);

    Page<Dish> searchDish(String name, String code, String price, String typeId, Pageable pageable);
}
