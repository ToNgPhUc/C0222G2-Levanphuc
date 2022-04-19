package ss0_bai_tap_oop1.service;

import ss0_bai_tap_oop1.model.Xe;

public interface IQuanLyPhuongTien {
    void themPhuongTien(Xe xe);
    void hienThiPhuongTien();
    void xoaPhuongTien(String bks);
    Xe timKiemPhuongTien(String bks);
}
