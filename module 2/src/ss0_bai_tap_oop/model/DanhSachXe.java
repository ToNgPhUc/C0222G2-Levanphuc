package ss0_bai_tap_oop.model;

public abstract class DanhSachXe{
    private int Bks;
    private String tenHangSX;
    private int namSX;
    private String chuSoHuu;

    public DanhSachXe() {
    }

    public DanhSachXe(int bks, String tenHangSX, int namSX, String chuSoHuu) {
        Bks = bks;
        this.tenHangSX = tenHangSX;
        this.namSX = namSX;
        this.chuSoHuu = chuSoHuu;
    }

    public int getBks() {
        return Bks;
    }

    public void setBks(int bks) {
        Bks = bks;
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }
}
