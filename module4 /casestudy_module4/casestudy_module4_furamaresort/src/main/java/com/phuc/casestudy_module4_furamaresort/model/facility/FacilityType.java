package com.phuc.casestudy_module4_furamaresort.model.facility;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class FacilityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_facility_type")
    private String nameFacilityType;
    @OneToMany(mappedBy = "facilityType")
    @JsonBackReference
    private List<Facility>facilityList;

    public FacilityType() {
    }

    public FacilityType(Integer id, String nameFacilityType, List<Facility> facilityList) {
        this.id = id;
        this.nameFacilityType = nameFacilityType;
        this.facilityList = facilityList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameFacilityType() {
        return nameFacilityType;
    }

    public void setNameFacilityType(String nameFacilityType) {
        this.nameFacilityType = nameFacilityType;
    }

    public List<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<Facility> facilityList) {
        this.facilityList = facilityList;
    }
}
