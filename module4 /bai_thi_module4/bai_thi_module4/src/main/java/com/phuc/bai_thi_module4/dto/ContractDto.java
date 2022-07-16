package com.phuc.bai_thi_module4.dto;

import com.phuc.bai_thi_module4.model.CustomerType;
import com.phuc.bai_thi_module4.model.Room;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

public class ContractDto {
    private Integer id;
    private String contractCode;
    private String personName;
    private String idCard;
    private String dateRent;
    private Integer timeRent;
    private Room room;

    public ContractDto() {
    }

    public ContractDto(Integer id, String contractCode, String personName, String idCard, String dateRent, Integer timeRent, Room room) {
        this.id = id;
        this.contractCode = contractCode;
        this.personName = personName;
        this.idCard = idCard;
        this.dateRent = dateRent;
        this.timeRent = timeRent;
        this.room = room;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getDateRent() {
        return dateRent;
    }

    public void setDateRent(String dateRent) {
        this.dateRent = dateRent;
    }

    public Integer getTimeRent() {
        return timeRent;
    }

    public void setTimeRent(Integer timeRent) {
        this.timeRent = timeRent;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
