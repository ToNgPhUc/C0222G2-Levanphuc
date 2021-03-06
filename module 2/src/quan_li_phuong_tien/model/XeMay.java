package quan_li_phuong_tien.model;

public class XeMay extends PhuongTien {
    private Integer congSuat;

    public XeMay() {

    }

    public XeMay(Integer congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu, Integer congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public Integer getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(Integer congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay: " + super.toString()+","+
                "congSuat: " + congSuat;

    }

    @Override
    public String inForPhuongTien() {
        return super.inForPhuongTien()+","+this.congSuat;
    }
}