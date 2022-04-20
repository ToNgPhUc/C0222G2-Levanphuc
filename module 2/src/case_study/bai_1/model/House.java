package case_study.bai_1.model;

public class House extends Facility {
    private String tieuCHuanPhong;
    private int soTang;

    public House(String tieuCHuanPhong, int soTang) {
        this.tieuCHuanPhong = tieuCHuanPhong;
        this.soTang = soTang;
    }

    public House(String tenDichVu, double area, double chiPhiThue, int peopleMax, int kieuThue, String tieuCHuanPhong, int soTang) {
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

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "DichVuHouse: " + super.toString() +
                "tieuCHuanPhong: " + tieuCHuanPhong + '\'' +
                ", soTang: " + soTang;
    }
}
