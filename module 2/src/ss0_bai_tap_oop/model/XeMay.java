package ss0_bai_tap_oop.model;

public class XeMay extends DanhSachXe {
    private int congSuat;

    public XeMay(int congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(int bks, String tenHangSX, int namSX, String chuSoHuu, int congSuat) {
        super(bks, tenHangSX, namSX, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
}
