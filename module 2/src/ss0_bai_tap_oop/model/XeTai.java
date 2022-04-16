package ss0_bai_tap_oop.model;

public class XeTai extends DanhSachXe {
    private double trongTai;

    public XeTai(){
    }
    public XeTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(int bks, String tenHangSX, int namSX, String chuSoHuu, double trongTai) {
        super(bks, tenHangSX, namSX, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
}
