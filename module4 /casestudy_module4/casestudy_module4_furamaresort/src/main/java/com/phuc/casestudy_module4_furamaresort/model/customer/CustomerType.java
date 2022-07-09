package com.phuc.casestudy_module4_furamaresort.model.customer;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String nameCustomerType;
    @OneToMany(mappedBy = "customerType")
    @JsonBackReference
    private List<Customer> customerList;

    public CustomerType() {
    }

    public CustomerType(Integer id, String nameCustomerType, List<Customer> customerList) {
        Id = id;
        this.nameCustomerType = nameCustomerType;
        this.customerList = customerList;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNameCustomerType() {
        return nameCustomerType;
    }

    public void setNameCustomerType(String nameCustomerType) {
        this.nameCustomerType = nameCustomerType;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
