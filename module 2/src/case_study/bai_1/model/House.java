package case_study.bai_1.model;

import java.util.Objects;

public class House extends Facility {
    private String tieuCHuanPhong;
    private Integer soTang;

    public House(String tieuCHuanPhong, int soTang) {
        this.tieuCHuanPhong = tieuCHuanPhong;
        this.soTang = soTang;
    }

    public House(String maDichVu, String tenDichVu, double dienTich, double chiPhiThue, int soNguoiToiDa, String kieuThue, String tieuCHuanPhong, int soTang) {
        super(maDichVu, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuCHuanPhong = tieuCHuanPhong;
        this.soTang = soTang;
    }

    public House() {
    }

    public House(String tenDichVu, double area, double chiPhiThue, int peopleMax, String kieuThue, String tieuCHuanPhong, int soTang) {
        super(tenDichVu, area, chiPhiThue, peopleMax, kieuThue);
        this.tieuCHuanPhong = tieuCHuanPhong;
        this.soTang = soTang;
    }

    public String getTieuCHuanPhong() {
        return tieuCHuanPhong;
    }

    public void setTieuCHuanPhong(String tieuCHuanPhong) {
        this.tieuCHuanPhong = tieuCHuanPhong;
    }

    public Integer getSoTang() {
        return soTang;
    }

    public void setSoTang(Integer soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House: " + super.toString() +
                "tieuCHuanPhong: " + tieuCHuanPhong +
                ", soTang: " + soTang+" }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return soTang == house.soTang && Objects.equals(tieuCHuanPhong, house.tieuCHuanPhong);
    }

    @Override
    public int hashCode() {
        return this.soTang;
    }
}
