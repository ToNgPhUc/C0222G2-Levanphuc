package com.phuc.ca_phe_thong_minh.controller;

import com.phuc.ca_phe_thong_minh.dto.DishDto;
import com.phuc.ca_phe_thong_minh.model.Dish;
import com.phuc.ca_phe_thong_minh.model.DishType;
import com.phuc.ca_phe_thong_minh.service.IDishService;
import com.phuc.ca_phe_thong_minh.service.IDishTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RequestMapping(value = "ca_phe_thong_minh")
@CrossOrigin
@Controller
public class DishController {
    @Autowired
    private IDishService iDishService;
    @Autowired
    private IDishTypeService iDishTypeService;

    @GetMapping("/Dish")
    public ResponseEntity<List<Dish>> getAll() {
        List<Dish> dishList = this.iDishService.getAllDish();
        return new ResponseEntity<>(dishList, HttpStatus.OK);
    }

    @GetMapping("/DishType")
    public ResponseEntity<List<DishType>> getDishType() {
        List<DishType> dishTypeList = this.iDishTypeService.getAllDishType();
        return new ResponseEntity<>(dishTypeList, HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<FieldError> createDish(@Valid @RequestBody DishDto dishDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getFieldError(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        Dish dish = new Dish();
        BeanUtils.copyProperties(dishDto, dish);
        iDishService.save(dish);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Dish> findById(@PathVariable int id) {
        Optional<Dish> dishOptional = iDishService.findById(id);
        if (!dishOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(dishOptional.get(), HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Dish> updateDish(@PathVariable int id, @RequestBody DishDto dishDto ,BindingResult bindingResult) {
        Optional<Dish> dishOptional = iDishService.findById(id);
        if (!dishOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        if (bindingResult.hasErrors()){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        Dish dish= new Dish();
        BeanUtils.copyProperties(dishDto,dish);
        dish.setId(dishOptional.get().getId());
        iDishService.editDish(dish);

        return new ResponseEntity<>( dish, HttpStatus.OK);
    }

//    @PatchMapping("/{id}")
//    public ResponseEntity<Dish> updateDish(@Valid @PathVariable int id, @RequestBody Dish dish, BindingResult bindingResult) {
//        Optional<Dish> dishOptional = iDishService.findById(id);
//
//        if (!dishOptional.isPresent()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        DishDto dishDto= new DishDto();
//        BeanUtils.copyProperties(dish, dishDto);
//        dishDto.setId(dishOptional.get().getId());
//        if (bindingResult.hasErrors()){
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//        BeanUtils.copyProperties(dishDto, dish);
//        iDishService.editDish(dish);
//        return new ResponseEntity<>(dish, HttpStatus.OK);
//    }

}
