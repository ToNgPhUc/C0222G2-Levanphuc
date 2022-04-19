package ss00_bai_tap_oop.service.impl;


import ss00_bai_tap_oop.model.XeMay;
import ss00_bai_tap_oop.service.IPhuongTienXeMay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayService implements IPhuongTienXeMay {
    private static Scanner scanner = new Scanner(System.in);
    private static List<XeMay> xeMayList = new ArrayList<>();

    static {
        xeMayList.add(new XeMay("73H1=55022", "toyota", 1995, "phuc1", 100));
        xeMayList.add(new XeMay("73H2=55022", "yamaha", 1996, "phuc2", 200));
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

    }

    @Override
    public void xoaPhuongTien() {

    }

    @Override
    public void timKiemPhuongTien() {

    }
}
