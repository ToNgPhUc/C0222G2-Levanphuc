package quan_li_phuong_tien_tài_làm.service;

import quan_li_phuong_tien_tài_làm.model.Xe;

public interface IQuanLyPhuongTien {
    void themPhuongTien(Xe xe);
    void hienThiPhuongTien();
    void xoaPhuongTien(String bks);
    Xe timKiemPhuongTien(String bks);
}
