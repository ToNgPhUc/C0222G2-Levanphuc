package com.phuc.casestudy_module4_furamaresort.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rent_type")
public class RentType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_rent_type")
    private Integer idRentType;
    @Column(name = "name_rent_type")
    private String nameRentType;
    @OneToMany(mappedBy = "rentType")
    private List<Facility>facilityList;

    public RentType() {
    }

    public RentType(Integer idRentType, String nameRentType, List<Facility> facilityList) {
        this.idRentType = idRentType;
        this.nameRentType = nameRentType;
        this.facilityList = facilityList;
    }

    public Integer getIdRentType() {
        return idRentType;
    }

    public void setIdRentType(Integer idRentType) {
        this.idRentType = idRentType;
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
