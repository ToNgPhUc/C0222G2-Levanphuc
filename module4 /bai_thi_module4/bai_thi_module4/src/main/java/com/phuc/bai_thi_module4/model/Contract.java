package com.phuc.bai_thi_module4.model;

import javax.persistence.*;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private Integer id;
    private Integer contractCode;
    private String personName;
    private String idCard;
    private String dateRent;
    private Integer timeRent;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id", referencedColumnName = "room_id")
    private Room room;
    public Contract() {
    }

    public Contract(Integer id, Integer contractCode, String personName, String idCard, String dateRent, Integer timeRent, Room room) {
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

    public Integer getContractCode() {
        return contractCode;
    }

    public void setContractCode(Integer contractCode) {
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
