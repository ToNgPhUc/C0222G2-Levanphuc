package ss00_bai_tap_oop.model;

public class XeOto extends PhuongTien {
    private Integer SoChoNgoi;
    private String kieuXe;

    public XeOto() {

    }

    public XeOto(Integer soChoNgoi, String kieuXe) {
        SoChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public XeOto(String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu, Integer soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        SoChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Integer getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(Integer soChoNgoi) {
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
        return "XeOto: " +super.toString()+
                "SoChoNgoi: " + SoChoNgoi +
                ", kieuXe: " + kieuXe;
    }
}
