package com.phuc.casestudy_module4_furamaresort.model.facility;

import com.phuc.casestudy_module4_furamaresort.model.contract.Contract;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "facility")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_facility")
    private Integer idFacility;
    private String nameFacility;
    private Integer areaFacility;
    private Double costFacility;
    private Integer maxPeople;
    @ManyToOne
    @JoinColumn(name = "id_rent_type",referencedColumnName = "id_rent_type")
    private RentType rentType;
    @ManyToOne
    @JoinColumn(name = "id_facility_type",referencedColumnName = "id_facility_type")
    private FacilityType facilityType;
    private String standardRoom;
    private String descriptionOtherConvenience;
    private Double poolArea;
    private Integer numberOfFloors;
    private String facilityFree;
    @OneToMany(mappedBy = "facility")
    private List<Contract> contractList;

    public Facility() {
    }

    public Integer getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(Integer idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public Integer getAreaFacility() {
        return areaFacility;
    }

    public void setAreaFacility(Integer areaFacility) {
        this.areaFacility = areaFacility;
    }

    public Double getCostFacility() {
        return costFacility;
    }

    public void setCostFacility(Double costFacility) {
        this.costFacility = costFacility;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
