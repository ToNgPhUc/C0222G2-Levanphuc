package quan_li_phuong_tien.service.impl;

import quan_li_phuong_tien.common.check_try_catch.ThrowException;
import quan_li_phuong_tien.common.read_writer.ReadWriterToFileXeTai;
import quan_li_phuong_tien.common.read_writer.ReadWriterToFilephuongTien;
import quan_li_phuong_tien.model.PhuongTien;
import quan_li_phuong_tien.model.XeTai;
import quan_li_phuong_tien.service.IPhuongTienXeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IPhuongTienXeTai {
    private static Scanner scanner = new Scanner(System.in);
    private static List<XeTai> xeTaiList = new ArrayList<>();
    ReadWriterToFileXeTai readWriterToFileXeTai = new ReadWriterToFileXeTai();
    ReadWriterToFilephuongTien readWriterToFilephuongTien= new ReadWriterToFilephuongTien();
    public static List<PhuongTien>phuongTienList = new ArrayList<>();


    @Override
    public void themPhuongTien() {
        phuongTienList = readWriterToFilephuongTien.readToFilePhuongTien(phuongTienList);

//        xeTaiList = readWriterToFileXeTai.readToFileXeTai();
        System.out.println(" ---CHƯƠNG TRÌNH THÊM MỚI XE TẢI---");

        System.out.println(" nhap bien kiem soat ");
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
        phuongTienList.addAll(xeTaiList);
        readWriterToFilephuongTien.readToFilePhuongTien(phuongTienList);
//        readWriterToFileXeTai.writerToFileXeOto(xeTaiList);
    }

    @Override
    public void hienThiPhuongTien() {
        xeTaiList = readWriterToFileXeTai.readToFileXeTai();
        for (XeTai xeTai : xeTaiList) {
            System.out.println(xeTai);
        }
    }

    @Override
    public void xoaPhuongTien() {
        xeTaiList = readWriterToFileXeTai.readToFileXeTai();
        System.out.println("nhap bien Kiem soat");
        String bienKiemSoat = scanner.nextLine();
        boolean flag = false;
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
        if (flag) {
            try {
                throw new ThrowException("không có mã " + bienKiemSoat + " ở trong danh sách");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void timKiemPhuongTien() {
        System.out.println("nhap bien Kiem soat");
        String bienKiemSoat = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < xeTaiList.size(); i++) {
            if (bienKiemSoat.equals(xeTaiList.get(i).getBienKiemSoat())) {
                flag = true;
                System.out.println(xeTaiList.get(i).toString());
                break;
            }

        }
        if (flag) {
            System.out.println("không có biển kiểm soát " + bienKiemSoat + "ở trong danh sách");

        }


    }
}
