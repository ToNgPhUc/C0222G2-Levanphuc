package quan_li_phuong_tien.model;

public abstract class PhuongTien {
    private String bienKiemSoat;
    private String hangSanXuat;
    private Integer namSanXuat;
    private String chuSoHuu;

    public PhuongTien() {

    }

    public PhuongTien(String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Integer getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(Integer namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "Xe " +
                "bienKiemSoat: " + bienKiemSoat + "," +
                "hangSanXuat: " + hangSanXuat + "," +
                "namSanXuat: " + namSanXuat +","+
                "chuSoHuu: " + chuSoHuu;
    }
    public String inForPhuongTien(){
        return this.bienKiemSoat+","+this.hangSanXuat+","+this.namSanXuat+","+this.chuSoHuu;
    }

}
