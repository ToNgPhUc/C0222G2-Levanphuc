package ss0_bai_tap_oop.model;

public class Oto extends DanhSachXe {
    private int SoChoNgoi;
    private String kieuXe;

    public Oto(){

    }
    public Oto(int soChoNgoi, String kieuXe) {
        SoChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Oto(int bks, String tenHangSX, int namSX, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bks, tenHangSX, namSX, chuSoHuu);
        SoChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        SoChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }
}
