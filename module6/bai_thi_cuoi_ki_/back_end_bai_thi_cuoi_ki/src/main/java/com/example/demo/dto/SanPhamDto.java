package com.example.demo.dto;

import com.example.demo.model.DishOrder;
import com.example.demo.model.LoaiSanPham;
import com.example.demo.model.SanPham;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.List;

public class SanPhamDto implements Validator {
    private Integer id;
    @NotNull
    @NotBlank
    private String maSanPham;
    @NotNull
    @NotBlank
    private String tenSanPham;
    @NotNull
    private Double gia;
    @NotNull
    @NotBlank
    private String tinhTrang;
    @NotNull

    private Date ngayNhap;
    private String xuatXu;
    private String banhNgotMan;
    private String tacGia;
    private String theLoai;
    private Date ngayXuatBan;
    private LoaiSanPham loaiSanPham;
    private List<DishOrder> dishOrderList;
    private List<SanPham>sanPhamList;

    public SanPhamDto(Integer id, @NotNull @NotBlank String maSanPham, @NotNull @NotBlank String tenSanPham, @NotNull Double gia, @NotNull @NotBlank String tinhTrang, @NotNull Date ngayNhap, String xuatXu, String banhNgotMan, String tacGia, String theLoai, Date ngayXuatBan, LoaiSanPham loaiSanPham, List<DishOrder> dishOrderList, List<SanPham> sanPhamList) {
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
        this.sanPhamList = sanPhamList;
    }

    public SanPhamDto() {
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

    public List<SanPham> getSanPhamList() {
        return sanPhamList;
    }

    public void setSanPhamList(List<SanPham> sanPhamList) {
        this.sanPhamList = sanPhamList;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        SanPhamDto sanPhamDto = (SanPhamDto) target;
        List<SanPham> sanPhamList = this.getSanPhamList();

        if (!sanPhamList.isEmpty()) {
            for (SanPham sanPham : sanPhamList) {
                if (sanPham.getMaSanPham().equals(sanPhamDto.getMaSanPham())) {
                    errors.rejectValue("maSanPham", "", "maSanPhamExists");
                    break;
                }

            }
        }
    }
}
