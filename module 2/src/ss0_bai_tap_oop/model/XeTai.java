package ss0_bai_tap_oop.model;

public class XeTai extends Xe {
    private double trongTai;

    public XeTai() {
    }

    public XeTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bks, HangSanXuat hangSanXuat, int namSX, String chuSoHuu, double trongTai) {
        super(bks, hangSanXuat, namSX, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString() + "trong tai= " + trongTai;
    }
}
