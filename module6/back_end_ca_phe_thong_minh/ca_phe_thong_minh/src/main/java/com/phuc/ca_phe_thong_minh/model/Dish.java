package com.phuc.ca_phe_thong_minh.model;

import javax.persistence.*;

@Entity
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String code;
    private Integer price;
    private String name;
    private String image;

    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;
    private String creationDate;
    @ManyToOne
    @JoinColumn(name = "dish_type_id", referencedColumnName = "id")
    private DishType dishType;


    public Dish() {
    }

    public Dish(Integer id, String code, Integer price, String name, String image, Boolean isDeleted, String creationDate, DishType dishType) {
        this.id = id;
        this.code = code;
        this.price = price;
        this.name = name;
        this.image = image;
        this.isDeleted = isDeleted;
        this.creationDate = creationDate;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public DishType getDishType() {
        return dishType;
    }

    public void setDishType(DishType dishType) {
        this.dishType = dishType;
    }
}
