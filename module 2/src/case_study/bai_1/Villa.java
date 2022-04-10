package case_study.bai_1;

public class Villa extends Furama{
    String tieuChuanPhong;
    double areaHoBoi;
    int soTang;
public Villa(){

}
    public Villa(String tieuChuanPhong, double areaHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.areaHoBoi = areaHoBoi;
        this.soTang = soTang;
    }

    public Villa(String tenDichVu, double area, double chiPhiThue, int peopleMax, int kieuThueNam, String tieuChuanPhong, double areaHoBoi, int soTang) {
        super(tenDichVu, area, chiPhiThue, peopleMax, kieuThueNam);
        this.tieuChuanPhong = tieuChuanPhong;
        this.areaHoBoi = areaHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getAreaHoBoi() {
        return areaHoBoi;
    }

    public void setAreaHoBoi(double areaHoBoi) {
        this.areaHoBoi = areaHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
}
