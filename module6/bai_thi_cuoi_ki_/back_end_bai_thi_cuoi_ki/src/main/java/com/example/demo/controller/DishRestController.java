package com.example.demo.controller;


import com.example.demo.model.Dish;
import com.example.demo.service.dish.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(value = "/dish")
public class DishRestController {
    @Autowired
    private IDishService iDishService;
    @GetMapping("/searchDish")
    public ResponseEntity<Page<Dish>> getAllDish(@PageableDefault(10) Pageable pageable,
                                                 Optional<String> dishName,
                                                 Optional<String> dishCode,
                                                 Optional<String> dishPrice,
                                                 Optional<String> dishTypeId) {
        String name = dishName.orElse("");
        String code = dishCode.orElse("");
        String price = dishPrice.orElse("");
        String typeId = dishTypeId.orElse("");
        if (typeId.equals("")) {
            typeId = "%" + typeId + "%";
        }

        if (name.equals("null")) {
            name = "";
        }
        if (code.equals("null")) {
            code = "";
        }
        if (price.equals("null")) {
            price = "";
        }

        Page<Dish> dishPage = this.iDishService.searchDish(name, code, price, typeId, pageable);
        if (dishPage.isEmpty()) {
            return new ResponseEntity<>(dishPage, HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(dishPage, HttpStatus.OK);
        }
    }

    @GetMapping("/getDishPage")
    public ResponseEntity<Page<Dish>> getAllDish1(@PageableDefault(4) Pageable pageable) {
        Page<Dish> dishPage = this.iDishService.findAllDish(pageable);
        if (dishPage.isEmpty()) {
            return new ResponseEntity<>(dishPage, HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(dishPage, HttpStatus.OK);
        }
    }

}
