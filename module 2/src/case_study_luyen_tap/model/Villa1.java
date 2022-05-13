package case_study_luyen_tap.model;

public class Villa1 extends Facility1 {
    private String tieuChuanPhong;
    private Double dienTichHoBoi;
    private Integer soTang;

    public Villa1() {
    }

    public Villa1(String tieuChuanPhong, Double dienTichHoBoi, Integer soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa1(String tenDichVu, Double dienTich, Double chiPhi, Integer soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, Double dienTichHoBoi, Integer soTang) {
        super(tenDichVu, dienTich, chiPhi, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public Double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(Double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public Integer getSoTang() {
        return soTang;
    }

    public void setSoTang(Integer soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                '}';
    }

    @Override
    public String getInFor() {
        return super.getInFor()+","+this.tieuChuanPhong+","+this.dienTichHoBoi+","+this.soTang;
    }
}
