package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class DishType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(unique = true, nullable = false)
    private String code;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;
    @OneToMany(mappedBy = "dishType")
    @JsonIgnore
    private List<Dish> dishList;

    public DishType() {
    }

    public DishType(Integer id, String name, String code, Boolean isDeleted, List<Dish> dishList) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.isDeleted = isDeleted;
        this.dishList = dishList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }
}
