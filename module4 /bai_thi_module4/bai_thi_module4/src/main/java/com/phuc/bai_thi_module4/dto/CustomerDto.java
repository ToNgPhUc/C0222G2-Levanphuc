package com.phuc.bai_thi_module4.dto;

import com.phuc.bai_thi_module4.model.CustomerType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.util.List;

public class CustomerDto implements Validator {

    private Integer id;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z ]*$", message = "In hoa chữ cái đầu và không có kí tự số")
    private String nameCustomer;

    private String dateOfBirth;

    private Integer gender;
    @Pattern(regexp = "^([0-9]{9})|([0-9]{12})$", message = "không đúng định dạng: phải là XXXXXXXXX hoặc XXXXXXXXXXXX (X là số 0-9).")
    private String idCard;
    @Pattern(regexp = "^([0][9][0][0-9]{7})|([0][9][1][0-9]{7})$", message = " không đúng định dạng: phải là 090xxxxxxx hoặc 091xxxxxxx ")

    private String phoneNumber;
    @Email
    private String email;
    private String address;
    private CustomerType customerType;

    public CustomerDto() {
    }

    public CustomerDto(Integer id, @Pattern(regexp = "^[A-Z]{1}[a-zA-Z ]*$", message = "In hoa chữ cái đầu và không có kí tự số") String nameCustomer, String dateOfBirth, Integer gender, @Pattern(regexp = "^([0-9]{9})|([0-9]{12})$", message = "không đúng định dạng: phải là XXXXXXXXX hoặc XXXXXXXXXXXX (X là số 0-9).") String idCard, @Pattern(regexp = "^([0][9][0][0-9]{7})|([0][9][1][0-9]{7})$", message = " không đúng định dạng: phải là 090xxxxxxx hoặc 091xxxxxxx ") String phoneNumber, @Email String email, String address, CustomerType customerType) {
        this.id = id;
        this.nameCustomer = nameCustomer;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}

