package ss00_bai_tap_oop.service.impl;


import ss00_bai_tap_oop.controller.QuanLiPhuongTien;
import ss00_bai_tap_oop.model.XeMay;
import ss00_bai_tap_oop.service.IPhuongTienXeMay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayService implements IPhuongTienXeMay {
    private static Scanner scanner = new Scanner(System.in);
    private static List<XeMay> xeMayList = new ArrayList<>();

    static {
        xeMayList.add(new XeMay("73H1", "toyota", 1995, "phuc1", 100));
        xeMayList.add(new XeMay("73H2", "toyota", 1996, "phuc2", 200));
    }

    @Override
    public void themPhuongTien() {
        System.out.println("nhap bien kiem soat");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("nhap hang san xuat");
        String hangSanXuat = scanner.nextLine();
        System.out.println("nhap nam san xuat");
        Integer namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap chu so huu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("nhap cong suat");
        Integer congSuat = Integer.parseInt(scanner.nextLine());
        XeMay xeMay = new XeMay(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
        xeMayList.add(xeMay);
    }

    @Override
    public void hienThiPhuongTien() {
        for (XeMay xeMay : xeMayList) {
            System.out.println(xeMay);
        }
    }

    @Override
    public void xoaPhuongTien() {
        boolean flag = false;
        System.out.println("nhap bien Kiem soat");
        String bienKiemSoat = scanner.nextLine();

        for (int i = 0; i < xeMayList.size(); i++) {
            if (bienKiemSoat.equals(xeMayList.get(i).getBienKiemSoat())) {
                System.out.println("yes or no");
                flag = true;
            }
            if (flag) {
                String luaChon = scanner.nextLine();
                if (luaChon.equals("yes")) {
                    xeMayList.remove(i);
                    System.out.println("da xoa thanh cong");
                    break;
                } else if (luaChon.equals("no")) {
                    System.out.println("ban da khong xoa");
                }
            } else {
                System.out.println("ban nhap sai");
                break;
            }
        }
    }

    @Override
    public void timKiemPhuongTien() {
        boolean flag = false;
        System.out.println("nhap bien Kiem soat");
        String bienKiemSoat = scanner.nextLine();

        for (int i = 0; i < xeMayList.size(); i++) {
            if (bienKiemSoat.contains(xeMayList.get(i).getBienKiemSoat())) {
                flag = true;
            }
            if (flag) {
                System.out.println(xeMayList);
            } else {
                System.out.println("khong tim thay trong list");
                break;
            }
        }
    }
}
