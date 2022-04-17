package ss0_bai_tap_oop.model;

public abstract class Xe {
    private String bks;
    private HangSanXuat hangSanXuat;
    private int namSX;
    private String chuSoHuu;

    public Xe() {
    }

    public Xe(String bks, HangSanXuat hangSanXuat, int namSX, String chuSoHuu) {
        this.bks = bks;
        this.hangSanXuat = hangSanXuat;
        this.namSX = namSX;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBks() {
        return bks;
    }

    public void setBks(String bks) {
        this.bks = bks;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
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

    @Override
    public String toString() {
        return "Xe{" +
                "bks='" + bks + '\'' +
                ", tenHangSX='" + hangSanXuat + '\'' +
                ", namSX=" + namSX +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
