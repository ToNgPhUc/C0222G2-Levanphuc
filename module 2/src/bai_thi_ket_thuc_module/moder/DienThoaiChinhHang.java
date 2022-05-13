package bai_thi_ket_thuc_module.moder;

public class DienThoaiChinhHang extends DienThoai {
    private Integer thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang() {
    }

    public DienThoaiChinhHang(Integer thoiGianBaoHanh, String phamViBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public DienThoaiChinhHang(Integer id, String ten, Integer giaBan, Integer soLuong, String nhaSanXuat, Integer thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, ten, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public Integer getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(Integer thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return "DienThoaiChinhHang: " +super.toString()+","+
                "thoiGianBaoHanh: " + thoiGianBaoHanh +
                " phamViBaoHanh: " + phamViBaoHanh + ',' ;
    }

    @Override
    public String getDienThoai() {
        return super.getDienThoai()+","+this.thoiGianBaoHanh+","+phamViBaoHanh;
    }
}
