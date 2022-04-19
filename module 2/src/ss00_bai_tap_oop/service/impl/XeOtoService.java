package ss00_bai_tap_oop.service.impl;

import ss00_bai_tap_oop.model.XeMay;
import ss00_bai_tap_oop.model.XeOto;
import ss00_bai_tap_oop.service.IPhuongTienXeOto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeOtoService implements IPhuongTienXeOto {
    private static Scanner scanner = new Scanner(System.in);
    private static List<XeOto> xeOtoList = new ArrayList<>();

    static {
        xeOtoList.add(new XeOto("73H1=55022", "toyota", 1995, "phuc1", 40, "Du lich"));
        xeOtoList.add(new XeOto("73H1=55023", "yamaha", 1996, "phuc2", 41, "cho hang"));
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
        System.out.println("nhap so cho ngoi");
        Integer soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap kieu xe");
        String kieuXe = scanner.nextLine();

        XeOto xeOto = new XeOto(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        xeOtoList.add(xeOto);
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
