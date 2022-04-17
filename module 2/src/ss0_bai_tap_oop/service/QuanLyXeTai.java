package ss0_bai_tap_oop.service;


import ss0_bai_tap_oop.model.HangSanXuat;
import ss0_bai_tap_oop.model.Xe;
import ss0_bai_tap_oop.model.XeMay;
import ss0_bai_tap_oop.model.XeTai;

import java.util.Scanner;

public class QuanLyXeTai extends QuanLyPhuongTien {
    Scanner scanner = new Scanner(System.in);

    public void themPhuongTien() {
        System.out.print("Nhap bks : ");
        String bks = scanner.nextLine();
        HangSanXuat hangSanXuat = null;
        do {
            System.out.print("Nhap ma hang sx:");
            for (HangSanXuat hang : QuanLyPhuongTien.danhSachHang) {
                System.out.println(hang);
            }
            String maHangSX = scanner.nextLine();
            for (HangSanXuat hang : QuanLyPhuongTien.danhSachHang) {
                if (maHangSX.equals(hang.getMaHang())) {
                    hangSanXuat = hang;
                    break;
                }
            }
        } while (hangSanXuat == null);
        System.out.print("Nhap nam san xuat: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap chu so huu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.print("Nhap trong tai: ");
        int trongTai = Integer.parseInt(scanner.nextLine());
        Xe xe = new XeTai(bks, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
        super.themPhuongTien(xe);
        System.out.println("Them thanh cong!");
    }

    @Override
    public void hienThiPhuongTien() {
//        Goi bien static cua class: TenClass.thuoctinh
        for (Xe xe : QuanLyPhuongTien.danhSachXe) {
            if (xe instanceof XeTai) {
                System.out.println(xe);
            }
        }
    }
}




