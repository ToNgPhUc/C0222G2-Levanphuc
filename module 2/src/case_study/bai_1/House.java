package case_study.bai_1;

public class House extends Furama {
    String tieuChuanPhong;
    int soTang;
public House(){

}
    public House(String tieuChuanPhong, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House(String tenDichVu, double area, double chiPhiThue, int peopleMax, int kieuThueNam, String tieuChuanPhong, int soTang) {
        super(tenDichVu, area, chiPhiThue, peopleMax, kieuThueNam);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
}
