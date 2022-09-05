package com.phuc.demo.model;

import javax.persistence.*;

@Entity
public class LoHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String maLoHang;
    private Integer soLuong;
    private String ngayNhapHang;
    private String ngaySanXuat;
    private String ngayHetHan;
    @ManyToOne
    @JoinColumn(name = "san_pham", referencedColumnName = "id")
    private SanPham sanPham;

    public LoHang() {
    }


}
