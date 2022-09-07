package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String tenKhachHang;
    private  String maDichVu;
    private Date ngayDatDichVu;
    @OneToMany(mappedBy = "khachHang")
    @JsonIgnore
    private List<DishOrder> dishOrderList;

    public KhachHang() {
    }

    public KhachHang(Integer id, String tenKhachHang, String maDichVu, Date ngayDatDichVu, List<DishOrder> dishOrderList) {
        this.id = id;
        this.tenKhachHang = tenKhachHang;
        this.maDichVu = maDichVu;
        this.ngayDatDichVu = ngayDatDichVu;
        this.dishOrderList = dishOrderList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public Date getNgayDatDichVu() {
        return ngayDatDichVu;
    }

    public void setNgayDatDichVu(Date ngayDatDichVu) {
        this.ngayDatDichVu = ngayDatDichVu;
    }

    public List<DishOrder> getDishOrderList() {
        return dishOrderList;
    }

    public void setDishOrderList(List<DishOrder> dishOrderList) {
        this.dishOrderList = dishOrderList;
    }
}
