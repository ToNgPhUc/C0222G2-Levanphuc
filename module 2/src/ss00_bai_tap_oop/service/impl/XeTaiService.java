package ss00_bai_tap_oop.service.impl;

import ss00_bai_tap_oop.model.XeOto;
import ss00_bai_tap_oop.model.XeTai;
import ss00_bai_tap_oop.service.IPhuongTienXeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IPhuongTienXeTai {
    private static Scanner scanner = new Scanner(System.in);
    private static List<XeTai> xeTaiList = new ArrayList<>();

    static {
    xeTaiList.add(new XeTai("73H5","toyota",1999,"phuc5",300));
    xeTaiList.add(new XeTai("73H6","toyota6",1999,"phuc6",300));
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
        System.out.println("nhap trong tai");
        Integer trongTai = Integer.parseInt(scanner.nextLine());
        XeTai xeTai = new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
        xeTaiList.add(xeTai);
    }

    @Override
    public void hienThiPhuongTien() {
        for (XeTai xeTai : xeTaiList) {
            System.out.println(xeTai);
        }
    }

    @Override
    public void xoaPhuongTien() {
        boolean flag = false;
        System.out.println("nhap bien Kiem soat");
        String bienKiemSoat = scanner.nextLine();

        for (int i = 0; i < xeTaiList.size(); i++) {
            if (bienKiemSoat.equals(xeTaiList.get(i).getBienKiemSoat())) {
                System.out.println("yes or no");
                flag = true;
            }
            if (flag) {
                String luaChon = scanner.nextLine();
                if (luaChon.equals("yes")) {
                    xeTaiList.remove(i);
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

        for (int i = 0; i < xeTaiList.size(); i++) {
            if (bienKiemSoat.contains(xeTaiList.get(i).getBienKiemSoat())) {
                flag = true;
            }
            if (flag) {
                System.out.println(xeTaiList);
            } else {
                System.out.println("khong tim thay trong list");
                break;
            }
        }

    }
}
