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
        System.out.println("---CH????NG TR??NH X??A PH????NG TI???N---");
        System.out.println(" nhap bien Kiem soat ");
        String bienKiemSoat = scanner.nextLine();
        for (int i = 0; i < xeMayList.size(); i++) {
            if (bienKiemSoat.equals(xeMayList.get(i).getBienKiemSoat())) {
                System.out.println("b???n c?? mu???n x??a kh???i danh s??ch kh??ng\n" +
                        "1: yes\n" +
                        "2: no");
                Integer luaChon = CheckTryCatch.getChoiceInteger();
                switch (luaChon) {
                    case 1:
                        xeMayList.remove(i);
                        System.out.println(" b???n ???? x??a th??nh c??ng");
                        readWriterToFileXeMay.writerToFileXeMay(xeMayList);

                        break;
                    case 2:
                        System.out.println(" b???n ???? kh??ng x??a");
                        break;
                    default:
                        System.out.println(" nh???p kh??ng ph?? h???p! nh???p l???i ");
                        break;
                }
                return;
            }
        }
        throw new ThrowException(" bi???n ki???m so??t " + bienKiemSoat + " ??? trong danh s??ch");
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
            throw new ThrowException(" kh??ng c?? bi???n ki???m so??t " + bienKiemSoat + " ??? trong danh s??ch");
        } catch (ThrowException e) {
            e.printStackTrace();
        }
    }
}
