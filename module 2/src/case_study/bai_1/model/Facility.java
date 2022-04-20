package case_study.bai_1.model;

public abstract class Facility {      // facility: co so vat chat
   private String tenDichVu;
    private double dienTich;
    private double chiPhiThue;
    private int soNguoiToiDa;
    private int kieuThue;

    public Facility() {
    }

    public Facility(String tenDichVu, double area, double chiPhiThue, int peopleMax, int kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTich = area;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = peopleMax;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public int getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(int kieuThue) {
        this.kieuThue = kieuThue;
    }

}
