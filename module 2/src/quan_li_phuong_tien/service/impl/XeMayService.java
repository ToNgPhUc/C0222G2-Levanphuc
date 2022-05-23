package quan_li_phuong_tien.service.impl;


import case_study.common.check_try_catch.CheckTryCatch;
import quan_li_phuong_tien.common.check_try_catch.ThrowException;
import quan_li_phuong_tien.common.read_writer.ReadWriterToFileXeMay;
import quan_li_phuong_tien.common.read_writer.ReadWriterToFilephuongTien;
import quan_li_phuong_tien.model.PhuongTien;
import quan_li_phuong_tien.model.XeMay;
import quan_li_phuong_tien.service.IPhuongTienXeMay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayService implements IPhuongTienXeMay {
    private static Scanner scanner = new Scanner(System.in);
    private static List<XeMay> xeMayList = new ArrayList<>();
    ReadWriterToFileXeMay readWriterToFileXeMay = new ReadWriterToFileXeMay();
    private static List<PhuongTien> phuongTienList = new ArrayList<>();
    ReadWriterToFilephuongTien readWriterToFilephuongTien = new ReadWriterToFilephuongTien();

    @Override
    public void themPhuongTien() {
        phuongTienList = readWriterToFilephuongTien.readToFilePhuongTien(phuongTienList);
//        xeMayList = readWriterToFileXeMay.readToFileXeMay();
        System.out.println(" nhap bien kiem soat ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("nhap hang san xuat");
        String hangSanXuat = scanner.nextLine();
        System.out.println("nhap nam san xuat");
        Integer namSanXuat = CheckTryCatch.getChoiceInteger();
        System.out.println("nhap chu so huu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("nhap cong suat");
        Integer congSuat = CheckTryCatch.getChoiceInteger();
        XeMay xeMay = new XeMay(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
        xeMayList.add(xeMay);
        phuongTienList.addAll(xeMayList);
        readWriterToFilephuongTien.writerToFilePhuongTien(phuongTienList);

//        readWriterToFileXeMay.writerToFileXeMay(xeMayList);

    }

    @Override
    public void hienThiPhuongTien() {
        xeMayList = readWriterToFileXeMay.readToFileXeMay();
        for (XeMay xeMay : xeMayList) {
            System.out.println(xeMay.toString());
        }
    }

    @Override
    public void xoaPhuongTien() throws ThrowException {
        xeMayList = readWriterToFileXeMay.readToFileXeMay();
        System.out.println("---CHƯƠNG TRÌNH XÓA PHƯƠNG TIỆN---");
        System.out.println(" nhap bien Kiem soat ");
        String bienKiemSoat = scanner.nextLine();
        for (int i = 0; i < xeMayList.size(); i++) {
            if (bienKiemSoat.equals(xeMayList.get(i).getBienKiemSoat())) {
                System.out.println("bạn có muốn xóa khỏi danh sách không\n" +
                        "1: yes\n" +
                        "2: no");
                Integer luaChon = CheckTryCatch.getChoiceInteger();
                switch (luaChon) {
                    case 1:
                        xeMayList.remove(i);
                        System.out.println(" bạn đã xóa thành công");
                        readWriterToFileXeMay.writerToFileXeMay(xeMayList);

                        break;
                    case 2:
                        System.out.println(" bạn đã không xóa");
                        break;
                    default:
                        System.out.println(" nhập không phù hợp! nhập lại ");
                        break;
                }
                return;
            }
        }
        throw new ThrowException(" biển kiểm soát " + bienKiemSoat + " ở trong danh sách");
    }

    @Override
    public void timKiemPhuongTien() {
        xeMayList = readWriterToFileXeMay.readToFileXeMay();
        System.out.println("nhap bien Kiem soat");
        String bienKiemSoat = scanner.nextLine();

        for (int i = 0; i < xeMayList.size(); i++) {
            if (bienKiemSoat.equals(xeMayList.get(i).getBienKiemSoat())) {
                System.out.println(xeMayList.get(i).toString());
            }
            return;
        }
        try {
            throw new ThrowException(" không có biển kiểm soát " + bienKiemSoat + " ở trong danh sách");
        } catch (ThrowException e) {
            e.printStackTrace();
        }
    }
}
