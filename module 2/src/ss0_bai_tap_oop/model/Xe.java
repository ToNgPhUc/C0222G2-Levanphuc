package ss0_bai_tap_oop.model;

public abstract class Xe {
    private String bienKiemSoat;
    private HangSanXuat hangSanXuat;
    private int namwSanXuat;
    private String chuSoHuu;

    public Xe() {
    }

    public Xe(String bks, HangSanXuat hangSanXuat, int namSX, String chuSoHuu) {
        this.bienKiemSoat = bks;
        this.hangSanXuat = hangSanXuat;
        this.namwSanXuat = namSX;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamwSanXuat() {
        return namwSanXuat;
    }

    public void setNamwSanXuat(int namwSanXuat) {
        this.namwSanXuat = namwSanXuat;
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
                "bks='" + bienKiemSoat + '\'' +
                ", tenHangSX='" + hangSanXuat + '\'' +
                ", namSX=" + namwSanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
