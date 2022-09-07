package com.phuc.ca_phe_thong_minh.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class DishType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String name;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;
    @OneToMany(mappedBy = "dishType")
    @JsonBackReference
    private List<Dish> dishes;

    public DishType() {
    }

    public DishType(Integer id, String code, String name, Boolean isDeleted, List<Dish> dishes) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.isDeleted = isDeleted;
        this.dishes = dishes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
