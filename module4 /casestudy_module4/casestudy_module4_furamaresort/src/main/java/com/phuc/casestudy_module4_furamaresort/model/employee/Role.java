package com.phuc.casestudy_module4_furamaresort.model.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(generator = "role")
    private Integer id;
    private String roleName;
    @OneToMany(mappedBy = "role")
    @JsonBackReference
    private List<UserRole> userRoleList;

    public Role() {
    }

    public Role(Integer id, String roleName, List<UserRole> userRoleList) {
        this.id = id;
        this.roleName = roleName;
        this.userRoleList = userRoleList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<UserRole> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<UserRole> userRoleList) {
        this.userRoleList = userRoleList;
    }
}
