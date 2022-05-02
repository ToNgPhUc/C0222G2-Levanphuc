package case_study.bai_1.model;

public class Customer extends Person {
    private String maKhachHang;
    private String loaiKhach;
    private String diaChi;

    public Customer(String hoTen, String ngaySinh, String gioiTinh, Integer soChungMinhNhanDan, Integer soDienThoai, String email) {
        super(hoTen, ngaySinh, gioiTinh, soChungMinhNhanDan, soDienThoai, email);
    }

    public Customer(String hoTen, String ngaySinh, String gioiTinh, Integer soChungMinhNhanDan, Integer soDienThoai, String email, String maKhachHang, String loaiKhach, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, soChungMinhNhanDan, soDienThoai, email);
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer: " +super.toString()+";"+
                "maKhachHang: " + maKhachHang + ';' +
                ", loaiKhach: " + loaiKhach + ';' +
                ", diaChi: " + diaChi;
    }
}
