package quan_li_phuong_tien.service.impl;

import case_study.common.check_try_catch.CheckTryCatch;
import quan_li_phuong_tien.common.check_try_catch.ThrowException;
import quan_li_phuong_tien.common.read_writer.ReadWriterToFileXeOto;
import quan_li_phuong_tien.common.read_writer.ReadWriterToFilephuongTien;
import quan_li_phuong_tien.model.PhuongTien;
import quan_li_phuong_tien.model.XeOto;
import quan_li_phuong_tien.service.IPhuongTienXeOto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeOtoService implements IPhuongTienXeOto {
    private static Scanner scanner = new Scanner(System.in);
    private static List<XeOto> xeOtoList = new ArrayList<>();
    ReadWriterToFileXeOto readWriterToFileXeOto = new ReadWriterToFileXeOto();
    ReadWriterToFilephuongTien readWriterToFilephuongTien= new ReadWriterToFilephuongTien();
    private static List<PhuongTien>phuongTienList = new ArrayList<>();



    @Override
    public void themPhuongTien() {
        phuongTienList = readWriterToFilephuongTien.readToFilePhuongTien(phuongTienList);

//        xeOtoList = readWriterToFileXeOto.readToFileXeOto();
        System.out.println("nhap bien kiem soat ");
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
        phuongTienList.addAll(xeOtoList);
        readWriterToFilephuongTien.writerToFilePhuongTien(phuongTienList);
//        readWriterToFileXeOto.writerToFileXeOto(xeOtoList);

    }

    @Override
    public void hienThiPhuongTien() {
        xeOtoList = readWriterToFileXeOto.readToFileXeOto();
        for (XeOto xeOto : xeOtoList) {
            System.out.println(xeOto);
        }
    }

    @Override
    public void xoaPhuongTien()throws ThrowException {
        xeOtoList = readWriterToFileXeOto.readToFileXeOto();
        System.out.println("nhap bien Kiem soat");
        String bienKiemSoat = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < xeOtoList.size(); i++) {
            if (bienKiemSoat.equals(xeOtoList.get(i).getBienKiemSoat())) {
                flag = true;
                System.out.println("b???n c?? mu???n x??a kh???i danh s??ch kh??ng\n" +
                        "1: yes\n" +
                        "2: no");
                Integer luaChon = CheckTryCatch.getChoiceInteger();
                switch (luaChon) {
                    case 1:
                        xeOtoList.remove(i);
                        readWriterToFileXeOto.writerToFileXeOto(xeOtoList);
                        break;
                    case 2:
                        System.out.println("b???n ???? kh??ng x??a");
                        break;
                    default:
                        System.out.println(" b???n nh???p sai! xin m???i nh???p l???i");
                        break;
                }
               return;
            }
        }
        if (flag) {

                throw new ThrowException("kh??ng c?? bi???n ki???m so??t " + bienKiemSoat + " ??? trong danh s??ch");


        }
    }

    @Override
    public void timKiemPhuongTien() {
        System.out.println("nhap bien Kiem soat");
        String bienKiemSoat = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < xeOtoList.size(); i++) {
            if (bienKiemSoat.contains(xeOtoList.get(i).getBienKiemSoat())) {
                flag = true;
                System.out.println(xeOtoList.get(i).toString());
            }return;
        }
        if (flag) {
            try {
                throw new ThrowException("kh??ng c?? bi???n ki???m so??t " + bienKiemSoat + " ??? trong danh s??ch");
            } catch (ThrowException e) {
                e.printStackTrace();
            }

        }
    }
}
