package com.phuc.casestudy_module4_furamaresort.model.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @Column(name = "username")
    private String userName;

    private String password;
    @OneToMany(mappedBy = "user")
    @JsonBackReference
    private List<Employee> employeeList;
    @OneToMany(mappedBy = "user")
    @JsonBackReference
    private List<UserRole>userRoleList;

    public User() {
    }

    public User(String userName, String password, List<Employee> employeeList, List<UserRole> userRoleList) {
        this.userName = userName;
        this.password = password;
        this.employeeList = employeeList;
        this.userRoleList = userRoleList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<UserRole> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<UserRole> userRoleList) {
        this.userRoleList = userRoleList;
    }
}
