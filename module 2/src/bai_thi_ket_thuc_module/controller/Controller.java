package bai_thi_ket_thuc_module.controller;

import bai_thi_ket_thuc_module.common.check_try_catch.CheckTryCatch;
import bai_thi_ket_thuc_module.common.check_try_catch.ThrowException;
import bai_thi_ket_thuc_module.service.iplm.DienThoaiChinhHangIplm;
import bai_thi_ket_thuc_module.service.iplm.DienThoaiXachTayIplm;

public class Controller {
    DienThoaiChinhHangIplm dienThoaiChinhHangIplm= new DienThoaiChinhHangIplm();
    DienThoaiXachTayIplm dienThoaiXachTayIplm= new DienThoaiXachTayIplm();

    public void displayMainMenu1() {
        Boolean flag = true;
        while (flag) {
            System.out.println(
                    "\t CHƯƠNG TRÌNH QUẢN ĐIỆN THOẠI \n" +
                            "1.\thiển thị danh sách\n" +
                            "2.\tthêm mới danh sách \n" +
                            "3.\txóa danh sách\n" +
                            "4.\ttìm kiếm danh sách\n" +
                            "5.thoát");
            System.out.println("xin hay chon chuc nang");
            int chon = CheckTryCatch.getChoiceInteger();
            switch (chon) {
                case 1:
                    hienThiDanhSach();
                    break;
                case 2:
                    themMoiDanhSach();
                    break;
                case 3:
                    xoaDanhSach();
                    break;
                case 4:
                    timKiemDanhSach();
                    break;
                case 5:
                    flag = false;
                    System.exit(0);
                default:
                    System.out.println("không hợp lệ xin hãy chọn lại");

            }
        }


    }
    private void hienThiDanhSach() {
        boolean flag = true;
        while (flag) {
            System.out.println("chọn hiển thị danh sách\n" +
                    "1: chọn hiển thị danh sách điện thoại chính hãng\n" +
                    "2: chọn hiển thị danh sách điện thoại xách tay\n" +
                    "3: quay lại menu");
            System.out.println(" xin mời chọn");
            int chon = CheckTryCatch.getChoiceInteger();
            switch (chon) {
                case 1:
                    dienThoaiChinhHangIplm.display();
                    break;
                case 2:
                    dienThoaiXachTayIplm.display();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println(" chọn không phù hợp! vui lòng chọn lai");
                    break;
            }
        }
    }

    private void timKiemDanhSach() {
        boolean flag = true;
        while (flag) {
            System.out.println("tìm kiếm danh sách\n" +
                    "1: tìm kiếm danh sách điện thoại chính hãng\n" +
                    "2: tìm kiếm danh sách điện thoại xách tay\n" +
                    "3: quay lại menu");
            System.out.println(" xin mời chọn");
            int chon = CheckTryCatch.getChoiceInteger();
            switch (chon) {
                case 1:
                    try {
                        dienThoaiChinhHangIplm.search();
                    } catch (ThrowException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        dienThoaiXachTayIplm.search();
                    } catch (ThrowException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println(" chọn không phù hợp! vui lòng chọn lai");
                    break;
            }
        }

    }

    private void xoaDanhSach() {
        boolean flag = true;
        while (flag) {
            System.out.println("chọn xóa danh sách\n" +
                    "1: xóa danh sách điện thoại chính hãng\n" +
                    "2: xóa danh sách điện thoại xách tay\n" +
                    "3: quay lại menu");
            System.out.println(" xin mời chọn");
            int chon = CheckTryCatch.getChoiceInteger();

            switch (chon) {
                case 1:
                    try {
                        dienThoaiChinhHangIplm.delete();
                    } catch (ThrowException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        dienThoaiXachTayIplm.delete();
                    } catch (ThrowException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println(" chọn không phù hợp! vui lòng chọn lai");
                    break;
            }
        }

    }

    private void themMoiDanhSach() {
        boolean flag = true;
        while (flag) {
            System.out.println("chọn thêm mới danh sách\n" +
                    "1: thêm mới danh sách điện thoại chính hãng\n" +
                    "2: thêm mới danh sách điện thoại xách tay\n" +
                    "3: quay lại menu");
            System.out.println(" xin mời chọn");
            int chon = CheckTryCatch.getChoiceInteger();
            switch (chon) {
                case 1:
                    dienThoaiChinhHangIplm.add();
                    break;
                case 2:
                    dienThoaiXachTayIplm.add();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println(" chọn không phù hợp! vui lòng chọn lai");
                    break;
            }
        }

    }

}
