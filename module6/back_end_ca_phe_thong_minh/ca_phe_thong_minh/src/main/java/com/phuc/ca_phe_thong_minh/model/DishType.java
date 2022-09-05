package com.phuc.ca_phe_thong_minh.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypeOfDish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String groupCode;
    private String name;
    @OneToMany(mappedBy = "typeOfDish")
    private List<Dish> dishList;

    public TypeOfDish() {
    }

    public TypeOfDish(Integer id, String groupCode, String name, List<Dish> dishList) {
        this.id = id;
        this.groupCode = groupCode;
        this.name = name;
        this.dishList = dishList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }
}
