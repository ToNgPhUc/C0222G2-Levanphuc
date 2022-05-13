package bai_thi_ket_thuc_module.moder;

public class DienThoaiXachTay extends DienThoai {
    private String quocGiaXachTay;
    private  String trangThai;

    public DienThoaiXachTay() {
    }

    public DienThoaiXachTay(String quocGiaXachTay, String trangThai) {
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public DienThoaiXachTay(Integer id, String ten, Integer giaBan, Integer soLuong, String nhaSanXuat, String quocGiaXachTay, String trangThai) {
        super(id, ten, giaBan, soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "DienThoaiXachTay{" +super.toString()+","+
                "quocGiaXachTay: " + quocGiaXachTay + ',' +
                "trangThai: " + trangThai ;
    }

    @Override
    public String getDienThoai() {
        return super.getDienThoai()+ ","+this.quocGiaXachTay+ ","+this.trangThai;
    }
}
