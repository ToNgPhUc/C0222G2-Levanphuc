package quan_li_phuong_tien.controller;

import case_study.bai_1.common.check_try_catch.CheckTryCatch;
import quan_li_phuong_tien.common.check_try_catch.ThrowException;
import quan_li_phuong_tien.service.impl.PhuongTienService;
import quan_li_phuong_tien.service.impl.XeMayService;
import quan_li_phuong_tien.service.impl.XeOtoService;
import quan_li_phuong_tien.service.impl.XeTaiService;

import java.util.Scanner;

public class QuanLiPhuongTien {
    private Scanner scanner = new Scanner(System.in);
    private XeMayService xeMayService = new XeMayService();
    private XeTaiService xeTaiService = new XeTaiService();
    private XeOtoService xeOtoService = new XeOtoService();
    PhuongTienService phuongTienService = new PhuongTienService();


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
            int chon = CheckTryCatch.getChoiceInteger();
            switch (chon) {
                case 1:
                    themPhuongTien();
                    break;
                case 2:
                    hienThiPhuongTien();
                    break;
                case 3:
                    xoaPhuongTien();
                    break;
                case 4:
                    timKiemPhuongTien();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("bạn nhập ko phù hợp,vui lòng nhập lại");

            }
        }
    }

    private void timKiemPhuongTien() {
        boolean flag1 = true;
        while (flag1) {
            System.out.println("tìm kiếm phuong tiên\n" +
                    "1:tìm kiếm xe máy\n" +
                    "2.tìm kiếm ô tô\n" +
                    "3.tìm kiếm xe tải\n" +
                    "4.return menu");
            Integer chon1 = CheckTryCatch.getChoiceInteger();
            switch (chon1) {
                case 1:
                    xeMayService.timKiemPhuongTien();
                    break;
                case 2:
                    xeOtoService.timKiemPhuongTien();
                    break;
                case 3:
                    xeTaiService.timKiemPhuongTien();
                    break;
                case 4:
                    flag1 = false;
                default:
                    System.out.println("nhập không phù hợp");
            }
        }

    }

    private void xoaPhuongTien() {
//        xeOtoService.xoaPhuongTien();
//
//        xeOtoService.xoaPhuongTien();
//        xeTaiService.xoaPhuongTien();

        boolean flag = true;
        while (flag) {
            System.out.println("xóa phuong tiên\n" +
                    "1:xóa xe máy\n" +
                    "2.xóa ô tô\n" +
                    "3.xóa xe tải\n" +
                    "4: return menu");
            Integer chon1 = CheckTryCatch.getChoiceInteger();
            switch (chon1) {
                case 1:
                    try {
                        xeMayService.xoaPhuongTien();
                    } catch (ThrowException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        xeOtoService.xoaPhuongTien();
                    } catch (ThrowException e) {
                        e.printStackTrace();
                    }

                    break;
                case 3:
                        xeTaiService.xoaPhuongTien();
                    break;
                case 4:
                    flag = false;
                default:
                    System.out.println(" nhập không phù hợp");
            }
        }
    }

    private void themPhuongTien() {
        System.out.println("xin mời chọn\n" +
                "1. Thêm xe tải,\n" +
                "2. Thêm ôtô, \n" +
                "3. Thêm  xe máy.\n");
        System.out.println("xin mời chọn thêm loại xe");
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

    private void hienThiPhuongTien() {
        System.out.println("xin mời chọn\n" +
                "1. hiển thị xe tải,\n" +
                "2. hiển thị ôtô, \n" +
                "3. hiển thị  xe máy.\n" +
                "4. hiển thị tất cả phương tiện");
        System.out.println("xin mời chọn hiển thị loại xe");
        int chonLoaiXe = scanner.nextInt();
        switch (chonLoaiXe) {
            case 1:
                xeTaiService.hienThiPhuongTien();
                break;
            case 2:
                xeOtoService.hienThiPhuongTien();
                break;
            case 3:
                xeMayService.hienThiPhuongTien();
                break;
            case 4:
                phuongTienService.hienThiPhuongTien();


        }
    }
}
