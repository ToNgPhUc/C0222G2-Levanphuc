package case_study.bai_1.model;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTicHoBoi;
    private int soTang;

    public Villa(String tieuChuanPhong, double dienTicHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTicHoBoi = dienTicHoBoi;
        this.soTang = soTang;
    }

    public Villa() {
    }

    public Villa(String tenDichVu, double area, double chiPhiThue, int peopleMax, int kieuThueNam, String tieuChuanPhong, double dienTicHoBoi, int soTang) {
        super(tenDichVu, area, chiPhiThue, peopleMax, kieuThueNam);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTicHoBoi = dienTicHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTicHoBoi() {
        return dienTicHoBoi;
    }

    public void setDienTicHoBoi(double dienTicHoBoi) {
        this.dienTicHoBoi = dienTicHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "DichVuVilla: " + super.toString() +
                "tieuChuanPhong: " + tieuChuanPhong + '\'' +
                ", dienTicHoBoi: " + dienTicHoBoi +
                ", soTang: " + soTang;
    }
}
