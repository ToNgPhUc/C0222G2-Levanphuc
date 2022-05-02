package ss17_io_binary_file_serialization.bai_tap.model;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer maSanPham;
    private String tenSanPham;
    private String hangSanXuat;
    private Integer gia;

    public Product() {
    }

    public Product(Integer maSanPham, String tenSanPham, String hangSanXuat, Integer gia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.gia = gia;
    }

    public Integer getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(Integer maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Product " +
                "maSanPham: " + maSanPham +
                ", tenSanPham: " + tenSanPham + '\'' +
                ", hangSanXuat: " + hangSanXuat + '\'' +
                ", gia: " + gia +"\n";
    }
}
