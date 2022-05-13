package case_study_luyen_tap.model;

public class House1 extends Facility1 {
    private String tieuChuanPhong;
    private Integer soTang;

    public House1() {
    }

    public House1(String tieuChuanPhong, Integer soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House1(String tenDichVu, Double dienTich, Double chiPhi, Integer soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, Integer soTang) {
        super(tenDichVu, dienTich, chiPhi, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public Integer getSoTang() {
        return soTang;
    }

    public void setSoTang(Integer soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                '}';
    }

    @Override
    public String getInFor() {
        return super.getInFor()+","+this.tieuChuanPhong+","+this.soTang;
    }
}
