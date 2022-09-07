package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
@Entity
public class LoaiSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tenSanPham;
    @OneToMany(mappedBy = "loaiSanPham")
    @JsonIgnore
    private List<SanPham> sanPhamList;

    public LoaiSanPham() {
    }

    public LoaiSanPham(Integer id, String tenSanPham, List<SanPham> sanPhamList) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.sanPhamList = sanPhamList;
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

    public List<SanPham> getSanPhamList() {
        return sanPhamList;
    }

    public void setSanPhamList(List<SanPham> sanPhamList) {
        this.sanPhamList = sanPhamList;
    }
}
