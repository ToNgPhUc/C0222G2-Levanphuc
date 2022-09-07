package com.phuc.ca_phe_thong_minh.dto;

import com.phuc.ca_phe_thong_minh.model.DishType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;


public class DishDto implements Validator {

    private Integer id;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 5, message = "mã số món phải nhiều hơn 3 chữ cái")
    private String code;

    @NotNull
    @NotEmpty
    @NotBlank
    @Min(value = 5000, message="giá phải lớn hơn 5000")
    private Integer price;

    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 5, message = "mã số món phải nhiều hơn 3 chữ cái")
    private String name;

    @NotNull
    @NotEmpty
    @NotBlank
    private String image;

    private Boolean isDeleted;

    private String creationDate;
    @NotNull
    @NotEmpty
    @NotBlank
    private DishType dishType;

    public DishDto() {
    }

    public DishDto(Integer id, @NotNull @NotEmpty @NotBlank @Size(min = 5, message = "mã số món phải nhiều hơn 3 chữ cái") String code, @NotNull @NotEmpty @NotBlank @Min(value = 5000, message = "giá phải lớn hơn 5000") Integer price, @NotNull @NotEmpty @NotBlank @Size(min = 5, message = "mã số món phải nhiều hơn 3 chữ cái") String name, @NotNull @NotEmpty @NotBlank String image, Boolean isDeleted, String creationDate, @NotNull @NotEmpty @NotBlank DishType dishType) {
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
