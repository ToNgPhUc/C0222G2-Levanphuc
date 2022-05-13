package quan_li_phuong_tien_tài_làm.model;

public class XeOto extends Xe {
    private int SoChoNgoi;
    private String kieuXe;

    public XeOto() {

    }

    public XeOto(int soChoNgoi, String kieuXe) {
        SoChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public XeOto(String bks, HangSanXuat hangSanXuat, int namSX, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bks, hangSanXuat, namSX, chuSoHuu);
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

    @Override
    public String toString() {
        return super.toString() + "so cho ngoi= " + this.SoChoNgoi + "kieu xe: " + this.kieuXe;
    }

}
