package com.phuc.casestudy_module4_furamaresort.model.facility;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rent_type")
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_rent_type")
    private String nameRentType;
    @OneToMany(mappedBy = "rentType")
    @JsonBackReference
    private List<Facility>facilityList;

    public RentType() {
    }

    public RentType(Integer id, String nameRentType, List<Facility> facilityList) {
        this.id = id;
        this.nameRentType = nameRentType;
        this.facilityList = facilityList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameRentType() {
        return nameRentType;
    }

    public void setNameRentType(String nameRentType) {
        this.nameRentType = nameRentType;
    }

    public List<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<Facility> facilityList) {
        this.facilityList = facilityList;
    }
}
