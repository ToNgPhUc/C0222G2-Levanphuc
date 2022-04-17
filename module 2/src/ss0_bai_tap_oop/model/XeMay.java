package ss0_bai_tap_oop.model;

public class XeMay extends Xe {
    private int congSuat;

    public XeMay(int congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bks, HangSanXuat hangSanXuat, int namSX, String chuSoHuu, int congSuat) {
        super(bks, hangSanXuat, namSX, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString() + "congSuat="    + congSuat;
    }
}