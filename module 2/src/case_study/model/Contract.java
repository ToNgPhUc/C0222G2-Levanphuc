package case_study.model;

public class Contract {
    private String soHopDong;
    private String maBooking;
    private Double tienCocTruoc;
    private Double tongTienThanhToan;
    private String maKhachHang;

    public Contract() {
    }

    public Contract(String soHopDong, String maBooking, Double tienCocTruoc, Double tongTienThanhToan, String maKhachHang) {
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

    public Double getTienCocTruoc() {
        return tienCocTruoc;
    }

    public void setTienCocTruoc(Double tienCocTruoc) {
        this.tienCocTruoc = tienCocTruoc;
    }

    public Double getTongTienThanhToan() {
        return tongTienThanhToan;
    }

    public void setTongTienThanhToan(Double tongTienThanhToan) {
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
