package case_study_luyen_tap.model;

public class Customer1 extends Person1 {
    private String maKhachHang;
    private String loaiKhach;
    private String diaChi;

    public Customer1() {
    }

    public Customer1(String maKhachHang, String loaiKhach, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer1(String hoTen, String ngaySinh, String gioiTinh, Integer soCMND, Integer soDienThoai, String email, String maKhachHang, String loaiKhach, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
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
        return "Customer{" +super.toString()+
                "maKhachHang='" + maKhachHang + '\'' +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    @Override
    public String getInFor1() {
        return super.getInFor1()+","+this.maKhachHang+","+this.loaiKhach+","+this.diaChi;
    }
}
