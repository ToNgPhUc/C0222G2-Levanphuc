package ss00_bai_tap_oop.service;

import ss0_bai_tap_oop1.model.Xe;

public interface IPhuongTienService<T> {
    void themPhuongTien();
    void hienThiPhuongTien();
    void xoaPhuongTien();
    void timKiemPhuongTien();
}
