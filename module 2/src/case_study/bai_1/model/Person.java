package case_study.bai_1.model;

public abstract class Person {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private Integer soChungMinhNhanDan;
    private Integer soDienThoai;
    private String email;

    public void Person() {

    }

    public Person(String hoTen, String ngaySinh, String gioiTinh, Integer soChungMinhNhanDan, Integer soDienThoai, String email) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soChungMinhNhanDan = soChungMinhNhanDan;
        this.soDienThoai = soDienThoai;
        this.email = email;

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getSoChungMinhNhanDan() {
        return soChungMinhNhanDan;
    }

    public void setSoChungMinhNhanDan(Integer soChungMinhNhanDan) {
        this.soChungMinhNhanDan = soChungMinhNhanDan;
    }

    public Integer getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(Integer soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person: " +
                "hoTen: " + hoTen + ';' +
                ", ngaySinh: " + ngaySinh + ';' +
                ", gioiTinh: " + gioiTinh + ';' +
                ", soChungMinhNhanDan: " + soChungMinhNhanDan + ';' +
                ", soDienThoai: " + soDienThoai + ';' +
                ", email: " + email;
    }

    public String displayPerson() {
        String displayPerson = this.hoTen + ";" +
                this.ngaySinh + ";" +
                this.gioiTinh + ";" +
                this.soChungMinhNhanDan + ";" +
                this.soDienThoai + ";" +
                this.email;
        return displayPerson;
    }
}
