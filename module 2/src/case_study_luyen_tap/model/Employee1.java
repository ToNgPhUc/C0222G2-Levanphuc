package case_study_luyen_tap.model;

public class Employee1 extends Person1 {
    private  String maNhanVien;
    private String trinhDo;
    private String viTri;
    private Double luong;

    public Employee1() {
    }

    public Employee1(String maNhanVien, String trinhDo, String viTri, Double luong) {
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee1(String hoTen, String ngaySinh, String gioiTinh, Integer soCMND, Integer soDienThoai, String email, String maNhanVien, String trinhDo, String viTri, Double luong) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString()+
                "maNhanVien='" + maNhanVien + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }

    @Override
    public String getInFor1() {
        return super.getInFor1()+","+this.maNhanVien+","+this.trinhDo+","+this.viTri+","+this.luong;
    }
}
