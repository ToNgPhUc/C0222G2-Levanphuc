package com.phuc.bai_thi_module4.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


import java.util.List;
@Entity
public class Room {
    @Id
    @Column(name = "room_id")
    private Integer id;
    private String roomCode;
    private Integer area;
    private Integer price;
    private String status;
    @OneToOne(mappedBy = "room")
    private Contract contract;

    public Room() {
    }

    public Room(Integer id, String roomCode, Integer area, Integer price, String status, Contract contract) {
        this.id = id;
        this.roomCode = roomCode;
        this.area = area;
        this.price = price;
        this.status = status;
        this.contract = contract;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
