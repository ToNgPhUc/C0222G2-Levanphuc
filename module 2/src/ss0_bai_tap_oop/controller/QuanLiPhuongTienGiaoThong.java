package ss0_bai_tap_oop.controller;

import ss0_bai_tap_oop.model.Xe;
import ss0_bai_tap_oop.service.QuanLyXeMay;
import ss0_bai_tap_oop.service.QuanLyXeOTo;
import ss0_bai_tap_oop.service.QuanLyXeTai;

import java.util.Scanner;

public class QuanLiPhuongTienGiaoThong {
    static Scanner scanner = new Scanner(System.in);
public void hienThiPhuongTien(){
//    public static void main(String[] args) {
        QuanLyXeMay quanLyXeMay = new QuanLyXeMay();
        QuanLyXeTai quanLyXeTai = new QuanLyXeTai();
        QuanLyXeOTo quanLyXeOTo = new QuanLyXeOTo();

        int chucNang;
        int loaiXe;
        while (true) {
            try {
                chucNang = chonChucNang();
                switch (chucNang) {
                    case 1:
                        loaiXe = chonLoaiXe();
                        switch (loaiXe) {
                            case 1:
                                quanLyXeOTo.themPhuongTien();
                                break;
                            case 2:
                                quanLyXeTai.themPhuongTien();
                                break;
                            case 3:
                                quanLyXeMay.themPhuongTien();
                                break;
                            case 0:
                                System.exit(0);
                        }
                        break;
                    case 2:
                        loaiXe = chonLoaiXe();
                        switch (loaiXe) {
                            case 1:
                                quanLyXeOTo.hienThiPhuongTien();
                                break;
                            case 2:
                                quanLyXeTai.hienThiPhuongTien();
                                break;
                            case 3:
                                quanLyXeMay.hienThiPhuongTien();
                                break;
                            case 0:
                                System.exit(0);
                        }
                        break;
                    case 3:
                        System.out.print("Nhap BKS: ");
                        String bks = scanner.nextLine();
                        // Co the goi tu bat ky object nao la con cua QuanLyPhuongTien
                        quanLyXeMay.xoaPhuongTien(bks);
                        break;
                    case 4:
                        System.out.print("Nhap BKS: ");
                        String timBKS = scanner.nextLine();
                        // Co the goi tu bat ky object nao la con cua QuanLyPhuongTien
                        Xe xe = quanLyXeMay.timKiemPhuongTien(timBKS);
                        if (xe instanceof Xe) {
                            System.out.println(xe);
                        } else {
                            System.out.println("khong tim thay bks: " + timBKS);
                        }
                        break;
                    case 5:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("ERROR:" + e);
            }
        }
    }


    public static int chonChucNang() {
        int luaChon;
        do {
            System.out.println("\nChon chuc nang \n" +
                    "1. Them phuong tien moi \n" +
                    "2. Hien thi phuong tien \n" +
                    "3. Xoa phuong tien \n" +
                    "4. Tim kiem theo bien kiem soat \n" +
                    "5. Thoat \n");

            luaChon = scanner.nextInt();
            scanner.nextLine();
        } while (luaChon <= 0 || luaChon > 5);
        System.out.println("Chuc Nang: " + luaChon);
        return luaChon;
    }

    public static int chonLoaiXe() {
        int luaChon;
        do {
            System.out.println("\nChon loai xe:\n" +
                    "1. Xe tai\n" +
                    "2. O to\n" +
                    "3. Xe may");
            luaChon = scanner.nextInt();
            scanner.nextLine();
        } while (luaChon <= 0 || luaChon > 3);
        return luaChon;
    }
}

