package com.phuc.casestudy_module4_furamaresort.model.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
public class Division {
    @Id
    private Integer id;
    private String nameDivision;
    @OneToMany(mappedBy = "division")
    @JsonBackReference
    private List<Employee> employeeList;

    public Division() {
    }

    public Division(Integer id, String nameDivision, List<Employee> employeeList) {
        this.id = id;
        this.nameDivision = nameDivision;
        this.employeeList = employeeList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameDivision() {
        return nameDivision;
    }

    public void setNameDivision(String nameDivision) {
        this.nameDivision = nameDivision;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
