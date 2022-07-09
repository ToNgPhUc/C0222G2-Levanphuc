package com.phuc.casestudy_module4_furamaresort.model.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
@Entity
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameEducationDegree;
    @OneToMany(mappedBy ="educationDegree" )
    @JsonBackReference
    private List<Employee>employeeList;

    public EducationDegree() {
    }

    public EducationDegree(Integer id, String nameEducationDegree, List<Employee> employeeList) {
        this.id = id;
        this.nameEducationDegree = nameEducationDegree;
        this.employeeList = employeeList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameEducationDegree() {
        return nameEducationDegree;
    }

    public void setNameEducationDegree(String nameEducationDegree) {
        this.nameEducationDegree = nameEducationDegree;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
