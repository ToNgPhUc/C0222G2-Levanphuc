package bai_thi_ket_thuc_module.moder;

public abstract class DienThoai {
    private Integer id;
    private String ten;
    private Integer giaBan;
    private Integer soLuong;
    private String nhaSanXuat;

    public DienThoai() {
    }

    public DienThoai(Integer id, String ten, Integer giaBan, Integer soLuong, String nhaSanXuat) {
        this.id = id;
        this.ten = ten;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Integer giaBan) {
        this.giaBan = giaBan;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "DienThoai" +
                "id: " + id + '\'' +
                " ten: " + ten + '\'' +
                " giaBan: " + giaBan +
                " soLuong: " + soLuong +
                " nhaSanXuat: " + nhaSanXuat ;
    }
    public String getDienThoai(){
        return this.id+","+this.ten+","+this.giaBan+","+this.soLuong+","+this.nhaSanXuat;
    }
}

