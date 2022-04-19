package ss0_bai_tap_oop1.service;

import ss0_bai_tap_oop1.model.HangSanXuat;
import ss0_bai_tap_oop1.model.Xe;

import java.util.ArrayList;

public abstract class QuanLyPhuongTien implements IQuanLyPhuongTien {
    public static ArrayList<Xe> danhSachXe;
    public static ArrayList<HangSanXuat> danhSachHang;

    public QuanLyPhuongTien() {
        danhSachXe = new ArrayList<Xe>();

        danhSachHang = new ArrayList<HangSanXuat>();
        danhSachHang.add(new HangSanXuat("001", "Honda", "VN"));
        danhSachHang.add(new HangSanXuat("002", "Yamaha", "VN"));
        danhSachHang.add(new HangSanXuat("003", "Toyota", "VN"));
    }


    @Override
    public void themPhuongTien(Xe xe) {
        this.danhSachXe.add(xe);
    }

    @Override
    public abstract void hienThiPhuongTien();

    @Override
    public void xoaPhuongTien(String bks) {
        Xe xe = this.timKiemPhuongTien(bks);
        if (xe != null) {
            // Xac nhan xoa
            this.danhSachXe.remove(xe);
            System.out.println("Xoa Thanh Cong!");
            return;
        }
        System.out.println("Xoa khong thanh cong! Khong tim thay xe co BKS " + bks);
    }

    @Override
    public Xe timKiemPhuongTien(String bks) {
        Xe xeTimThay = null;
        for (Xe xe : this.danhSachXe) {
            if (xe.getBienKiemSoat().equals(bks)) {
                xeTimThay = xe;
                break;
            }
        }
        return xeTimThay;
    }
}
