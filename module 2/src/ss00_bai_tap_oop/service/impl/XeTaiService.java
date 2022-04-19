package ss00_bai_tap_oop.service.impl;

import ss00_bai_tap_oop.model.XeTai;
import ss00_bai_tap_oop.service.IPhuongTienXeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IPhuongTienXeTai {
    private static Scanner scanner = new Scanner(System.in);
    private static List<XeTai> xeTaiList = new ArrayList<>();

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
        System.out.println("nhap trong tai");
        Integer trongTai = Integer.parseInt(scanner.nextLine());
        XeTai xeTai = new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
        xeTaiList.add(xeTai);
    }

    @Override
    public void hienThiPhuongTien() {
        for (XeTai xeTai:xeTaiList) {
            System.out.println(xeTai);
        }
    }

    @Override
    public void xoaPhuongTien() {

    }

    @Override
    public void timKiemPhuongTien() {

    }
}
