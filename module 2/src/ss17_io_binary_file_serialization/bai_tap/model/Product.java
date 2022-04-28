package ss17_io_binary_file_serialization.bai_tap.model;

public class Product {
    private int maSanPham;
    private String tenSanPham;
    private Double gia;

    public Product() {
    }

    public Product(int maSanPham, String tenSanPham, Double gia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
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

    @Override
    public String toString() {
        return "Product: " +
                "maSanPham: " + maSanPham +
                ", tenSanPham: " + tenSanPham  +
                ", gia: " + gia;
    }
}
