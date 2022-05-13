package quan_li_phuong_tien.model;

public class XeTai extends PhuongTien {
    private double trongTai;

    public XeTai() {
    }

    public XeTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
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
        return "XeTai: " +super.toString() +","+
                "trongTai: " + trongTai;
    }

    @Override
    public String inForPhuongTien() {
        return super.inForPhuongTien()+","+this.trongTai;
    }
}
