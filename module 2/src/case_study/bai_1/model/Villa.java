package case_study.bai_1.model;

import java.util.Objects;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private Double dienTicHoBoi;
    private Integer soTang;

    public Villa(String tieuChuanPhong, double dienTicHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTicHoBoi = dienTicHoBoi;
        this.soTang = soTang;
    }

    public Villa(String maDichVu, String tenDichVu, double dienTich, double chiPhiThue, int soNguoiToiDa, String kieuThue, String tieuChuanPhong, double dienTicHoBoi, int soTang) {
        super(maDichVu, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTicHoBoi = dienTicHoBoi;
        this.soTang = soTang;
    }

    public Villa() {
    }

    public Villa(String tenDichVu, double area, double chiPhiThue, int peopleMax, String kieuThue, String tieuChuanPhong, double dienTicHoBoi, int soTang) {
        super(tenDichVu, area, chiPhiThue, peopleMax, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTicHoBoi = dienTicHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public Double getDienTicHoBoi() {
        return dienTicHoBoi;
    }

    public void setDienTicHoBoi(Double dienTicHoBoi) {
        this.dienTicHoBoi = dienTicHoBoi;
    }

    public Integer getSoTang() {
        return soTang;
    }

    public void setSoTang(Integer soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa: " + super.toString() +
                "tieuChuanPhong: " + tieuChuanPhong + '\'' +
                ", dienTicHoBoi: " + dienTicHoBoi +
                ", soTang: " + soTang+" }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Villa villa = (Villa) o;
        return Double.compare(villa.dienTicHoBoi, dienTicHoBoi) == 0 && soTang == villa.soTang && Objects.equals(tieuChuanPhong, villa.tieuChuanPhong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tieuChuanPhong, dienTicHoBoi, soTang);
    }
}
