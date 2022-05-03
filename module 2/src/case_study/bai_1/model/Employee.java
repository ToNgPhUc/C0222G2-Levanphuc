package case_study.bai_1.model;

public class Employee extends Person {
    private String maNhanVien;
    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee(String hoTen, String ngaySinh, String gioiTinh, Integer soChungMinhNhanDan, Integer soDienThoai, String email) {
        super(hoTen, ngaySinh, gioiTinh, soChungMinhNhanDan, soDienThoai, email);
    }

    public Employee(String hoTen, String ngaySinh, String gioiTinh, Integer soChungMinhNhanDan, Integer soDienThoai, String email, String maNhanVien, String trinhDo, String viTri, double luong) {
        super(hoTen, ngaySinh, gioiTinh, soChungMinhNhanDan, soDienThoai, email);
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

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString() + "," +
                "maNhanVien: " + maNhanVien + ',' +
                ", trinhDo: " + trinhDo + ',' +
                ", viTri: " + viTri + ',' +
                ", luong: " + luong;
    }
    public String displayEmployee(){
        String displayEmployee=super.displayPerson()+","+this.maNhanVien+","+
                this.trinhDo+","+this.viTri+","+this.luong;
        return displayEmployee;
    }


}
