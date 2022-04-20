package case_study.bai_1.model;

public class Contract {
    private String soHopDong;
    private String maBooking;
    private String tienCocTruoc;
    private String tongTienThanhToan;
    private String maKhachHang;

    public Contract() {
    }

    public Contract(String soHopDong, String maBooking, String tienCocTruoc, String tongTienThanhToan, String maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.tienCocTruoc = tienCocTruoc;
        this.tongTienThanhToan = tongTienThanhToan;
        this.maKhachHang = maKhachHang;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getTienCocTruoc() {
        return tienCocTruoc;
    }

    public void setTienCocTruoc(String tienCocTruoc) {
        this.tienCocTruoc = tienCocTruoc;
    }

    public String getTongTienThanhToan() {
        return tongTienThanhToan;
    }

    public void setTongTienThanhToan(String tongTienThanhToan) {
        this.tongTienThanhToan = tongTienThanhToan;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return "Contract: " +
                "soHopDong: " + soHopDong + '\'' +
                ", maBooking: " + maBooking + '\'' +
                ", tienCocTruoc:  " + tienCocTruoc + '\'' +
                ", tongTienThanhToan: " + tongTienThanhToan + '\'' +
                ", maKhachHang: " + maKhachHang + '\'';
    }
}
