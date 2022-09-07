package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true,nullable = false)
    private String code;
    private String name;
    private Double price;
    private String image;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;
    @ManyToOne
    @JoinColumn(name = "dish_type_id",referencedColumnName = "id")
    private DishType dishType;

    public Dish() {
    }

    public Dish(Integer id, String code, String name, Double price, String image, Boolean isDeleted, DishType dishType) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
        this.image = image;
        this.isDeleted = isDeleted;
        this.dishType = dishType;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public DishType getDishType() {
        return dishType;
    }

    public void setDishType(DishType dishType) {
        this.dishType = dishType;
    }
}
