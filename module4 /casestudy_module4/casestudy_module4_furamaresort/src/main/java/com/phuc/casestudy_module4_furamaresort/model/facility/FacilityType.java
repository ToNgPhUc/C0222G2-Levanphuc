package com.phuc.casestudy_module4_furamaresort.model.facility;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "facility_type")
public class FacilityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id_facility_type")
    private Integer idFacilityType;
    @Column(name = "name_facility_type")
    private String nameFacilityType;
    @OneToMany(mappedBy = "facilityType")
    private List<Facility>facilityList;

    public FacilityType() {
    }

    public FacilityType(Integer idFacilityType, String nameFacilityType, List<Facility> facilityList) {
        this.idFacilityType = idFacilityType;
        this.nameFacilityType = nameFacilityType;
        this.facilityList = facilityList;
    }

    public Integer getIdFacilityType() {
        return idFacilityType;
    }

    public void setIdFacilityType(Integer idFacilityType) {
        this.idFacilityType = idFacilityType;
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
