package quan_li_phuong_tien.service;

public interface IPhuongTienService<T> {
    void themPhuongTien();
    void hienThiPhuongTien();
    void xoaPhuongTien() throws Exception;
    void timKiemPhuongTien();
}
