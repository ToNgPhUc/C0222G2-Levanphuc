package ss00_bai_tap_oop.view;

import ss00_bai_tap_oop.controller.QuanLiPhuongTien;
import ss00_bai_tap_oop.service.IPhuongTienService;
import ss00_bai_tap_oop.service.IPhuongTienXeMay;
import ss00_bai_tap_oop.service.impl.XeMayService;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        QuanLiPhuongTien quanLiPhuongTien= new QuanLiPhuongTien();
        quanLiPhuongTien.hienThi();
    }


}
