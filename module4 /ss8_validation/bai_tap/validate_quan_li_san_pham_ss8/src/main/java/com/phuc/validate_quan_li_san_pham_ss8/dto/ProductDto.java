package com.phuc.validate_quan_li_san_pham_ss8.dto;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

public class ProductDto implements Validator {
    private Integer idProduct;
    @NotNull
    @NotEmpty
    @NotBlank
    private String nameProduct;
    @PositiveOrZero
    @NotNull
    private Double priceProduct;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 2,max = 1000)
    private String describeProduct;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 2,max = 1000)
    private String producerProduct;

    public ProductDto() {
    }

    public ProductDto(Integer idProduct, @NotNull @NotEmpty @NotBlank String nameProduct, @PositiveOrZero @NotNull Double priceProduct, @NotNull @NotEmpty @NotBlank @Size(min = 2, max = 1000) String describeProduct, @NotNull @NotEmpty @NotBlank @Size(min = 2, max = 1000) String producerProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.describeProduct = describeProduct;
        this.producerProduct = producerProduct;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDescribeProduct() {
        return describeProduct;
    }

    public void setDescribeProduct(String describeProduct) {
        this.describeProduct = describeProduct;
    }

    public String getProducerProduct() {
        return producerProduct;
    }

    public void setProducerProduct(String producerProduct) {
        this.producerProduct = producerProduct;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
