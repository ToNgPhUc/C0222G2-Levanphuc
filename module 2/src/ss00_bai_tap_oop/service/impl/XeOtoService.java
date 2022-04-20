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
        xeOtoList.add(new XeOto("73H3", "toyota3", 3, "phuc3", 1, "Du lich"));
        xeOtoList.add(new XeOto("73H4", "toyota4", 4, "phuc4", 2, "cho hang"));
    }

    public static List<XeOto> getXeOtoList() {
        return xeOtoList;
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
        PhuongTienService.getPhuongTiens().add(xeOto);
    }

    @Override
    public void hienThiPhuongTien() {
        for (XeOto xeOto:xeOtoList) {
            System.out.println(xeOto);
        }
    }

    @Override
    public void xoaPhuongTien( ) {
        boolean flag = false;
        System.out.println("nhap bien Kiem soat");
        String bienKiemSoat = scanner.nextLine();

        for (int i = 0; i < xeOtoList.size(); i++) {
            if (bienKiemSoat.equals(xeOtoList.get(i).getBienKiemSoat())) {
                System.out.println("yes or no");
                flag = true;
            }
            if (flag) {
                String luaChon = scanner.nextLine();
                if (luaChon.equals("yes")) {
                    xeOtoList.remove(i);
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

        for (int i = 0; i < xeOtoList.size(); i++) {
            if (bienKiemSoat.contains(xeOtoList.get(i).getBienKiemSoat())) {
                flag = true;
            }
            if (flag) {
                System.out.println(xeOtoList);
            } else {
                System.out.println("khong tim thay trong list");
                break;
            }
        }
    }

}
