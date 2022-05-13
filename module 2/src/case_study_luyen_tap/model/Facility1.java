package case_study_luyen_tap.model;

public abstract class Facility1 {
    private String tenDichVu;
    private Double dienTich;
    private Double chiPhi;
    private Integer soLuongNguoiToiDa;
    private String kieuThue;

    public Facility1() {
    }

    public Facility1(String tenDichVu, Double dienTich, Double chiPhi, Integer soLuongNguoiToiDa, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.chiPhi = chiPhi;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
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

    public Double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(Double chiPhi) {
        this.chiPhi = chiPhi;
    }

    public Integer getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(Integer soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Furama" +
                "tenDichVu: " + tenDichVu + '\'' +
                ", dienTich: " + dienTich +
                ", chiPhi: " + chiPhi +
                ", soLuongNguoiToiDa=" + soLuongNguoiToiDa +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
    public String getInFor(){
        return this.tenDichVu+","+this.dienTich+","+this.chiPhi+","+this.soLuongNguoiToiDa+","+this.kieuThue;
    }
}
