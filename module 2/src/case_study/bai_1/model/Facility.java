package case_study.bai_1.model;

import java.util.Objects;

public abstract class Facility {      // facility: co so vat chat
    private String maDichVu;
    private String tenDichVu;
    private Double dienTich;
    private Double chiPhiThue;
    private Integer soNguoiToiDa;
    private String kieuThue;

    public Facility() {
    }

    public Facility(String maDichVu, String tenDichVu, double dienTich, double chiPhiThue, int soNguoiToiDa, String kieuThue) {
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public Facility(String tenDichVu, double area, double chiPhiThue, int peopleMax, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTich = area;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = peopleMax;
        this.kieuThue = kieuThue;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public Double getDienTich() {
        return dienTich;
    }

    public void setDienTich(Double dienTich) {
        this.dienTich = dienTich;
    }

    public Double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(Double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public Integer getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(Integer soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Facility: { " +
                "maDichVu: " + maDichVu + '\'' +
                ", tenDichVu: " + tenDichVu + '\'' +
                ", dienTich: " + dienTich +
                ", chiPhiThue: " + chiPhiThue +
                ", soNguoiToiDa: " + soNguoiToiDa +
                ", kieuThue: " + kieuThue ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Double.compare(facility.dienTich, dienTich) == 0 && Double.compare(facility.chiPhiThue, chiPhiThue) == 0 && soNguoiToiDa == facility.soNguoiToiDa && Objects.equals(maDichVu, facility.maDichVu) && Objects.equals(tenDichVu, facility.tenDichVu) && Objects.equals(kieuThue, facility.kieuThue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maDichVu, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue);
    }
}
