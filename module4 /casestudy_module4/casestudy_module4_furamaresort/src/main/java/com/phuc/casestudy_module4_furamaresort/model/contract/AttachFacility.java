package com.phuc.casestudy_module4_furamaresort.model.contract;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
@Entity
public class AttachFacility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameAttach;
    private Double code;
    private String unit;
    private String status;
    @OneToMany(mappedBy = "attachFacility")
    @JsonBackReference
    private List<ContractDetail>contractDetailList;

    public AttachFacility() {
    }

    public AttachFacility(Integer id, String nameAttach, Double code, String unit, String status, List<ContractDetail> contractDetailList) {
        this.id = id;
        this.nameAttach = nameAttach;
        this.code = code;
        this.unit = unit;
        this.status = status;
        this.contractDetailList = contractDetailList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameAttach() {
        return nameAttach;
    }

    public void setNameAttach(String nameAttach) {
        this.nameAttach = nameAttach;
    }

    public Double getCode() {
        return code;
    }

    public void setCode(Double code) {
        this.code = code;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }
}
