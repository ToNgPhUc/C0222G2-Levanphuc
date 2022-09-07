package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String maSanPham;
    private String tenSanPham;
    private Double gia;

    private String tinhTrang;
    private Date ngayNhap;
    private String xuatXu;
    private String banhNgotMan;
    private String tacGia;
    private String theLoai;
    private Date ngayXuatBan;

    @ManyToOne
    @JoinColumn(name = "id_loai_san_pham", referencedColumnName = "id")
    private LoaiSanPham loaiSanPham;

    @OneToMany(mappedBy = "sanPham")
    @JsonIgnore
    private List<DishOrder> dishOrderList;

    public SanPham() {
    }

    public SanPham(Integer id, String maSanPham, String tenSanPham, Double gia, String tinhTrang, Date ngayNhap, String xuatXu, String banhNgotMan, String tacGia, String theLoai, Date ngayXuatBan, LoaiSanPham loaiSanPham, List<DishOrder> dishOrderList) {
        this.id = id;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.tinhTrang = tinhTrang;
        this.ngayNhap = ngayNhap;
        this.xuatXu = xuatXu;
        this.banhNgotMan = banhNgotMan;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.ngayXuatBan = ngayXuatBan;
        this.loaiSanPham = loaiSanPham;
        this.dishOrderList = dishOrderList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getBanhNgotMan() {
        return banhNgotMan;
    }

    public void setBanhNgotMan(String banhNgotMan) {
        this.banhNgotMan = banhNgotMan;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public Date getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(Date ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public LoaiSanPham getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public List<DishOrder> getDishOrderList() {
        return dishOrderList;
    }

    public void setDishOrderList(List<DishOrder> dishOrderList) {
        this.dishOrderList = dishOrderList;
    }
}
