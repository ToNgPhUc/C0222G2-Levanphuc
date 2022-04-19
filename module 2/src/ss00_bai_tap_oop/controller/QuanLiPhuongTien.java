package ss00_bai_tap_oop.controller;

import ss00_bai_tap_oop.model.XeMay;
import ss00_bai_tap_oop.service.impl.XeMayService;
import ss00_bai_tap_oop.service.impl.XeOtoService;
import ss00_bai_tap_oop.service.impl.XeTaiService;

import java.util.Scanner;

public class QuanLiPhuongTien {
    Scanner scanner = new Scanner(System.in);
    XeMayService xeMayService = new XeMayService();
    XeTaiService xeTaiService = new XeTaiService();
    XeOtoService xeOtoService = new XeOtoService();

    public void hienThi() {
        while (true) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát");
            System.out.println("xin hãy chọn chức năng");
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    extracted();
                    break;
                case 2:
                    xeTaiService.hienThiPhuongTien();
                    xeMayService.hienThiPhuongTien();
                    xeOtoService.hienThiPhuongTien();
                    break;
                case 3:
                    xeTaiService.xoaPhuongTien();
                    xeOtoService.xoaPhuongTien();
                    xeMayService.xoaPhuongTien();
                    break;
                case 4:
                    xeTaiService.timKiemPhuongTien();
                    xeOtoService.timKiemPhuongTien();
                    xeMayService.timKiemPhuongTien();
                    break;
                case 5:
                    System.exit(0);

            }
        }
    }

    private void extracted() {
        System.out.println("xin mời chọn\n" +
                "1. Thêm xe tải,\n" +
                "2. Thêm ôtô, \n" +
                "3. Thêm  xe máy.\n");
        System.out.println("xin moi chon");
        int chonLoaiXe = scanner.nextInt();
        switch (chonLoaiXe) {
            case 1:
                xeTaiService.themPhuongTien();

                break;
            case 2:
                xeOtoService.themPhuongTien();
                break;
            case 3:
                xeMayService.themPhuongTien();
                break;

        }
    }


}
