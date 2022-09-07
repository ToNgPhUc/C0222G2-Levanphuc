package com.phuc.baithimodule5.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tenSanPham;
    private String xuatXu;
    private String donVi;
    private Integer giaTien;
    @OneToMany(mappedBy = "sanPham")
    @JsonBackReference
    List<LoHang> loHangList;

    public SanPham() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public Integer getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Integer giaTien) {
        this.giaTien = giaTien;
    }

    public List<LoHang> getLoHangList() {
        return loHangList;
    }

    public void setLoHangList(List<LoHang> loHangList) {
        this.loHangList = loHangList;
    }

    public SanPham(Integer id, String tenSanPham, String xuatXu, String donVi, Integer giaTien, List<LoHang> loHangList) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.xuatXu = xuatXu;
        this.donVi = donVi;
        this.giaTien = giaTien;
        this.loHangList = loHangList;
    }
}

