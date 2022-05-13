package bai_thi_ket_thuc_module.service.iplm;

import bai_thi_ket_thuc_module.common.check_try_catch.CheckTryCatch;
import bai_thi_ket_thuc_module.common.check_try_catch.ThrowException;
import bai_thi_ket_thuc_module.common.read_writer.ReadWriteDienThoaiXachTay;
import bai_thi_ket_thuc_module.moder.DienThoaiXachTay;
import bai_thi_ket_thuc_module.service.IDienThoaiXachTay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiXachTayIplm implements IDienThoaiXachTay {
    Scanner scanner = new Scanner(System.in);
    List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();
    ReadWriteDienThoaiXachTay readWriteDienThoaiXachTay = new ReadWriteDienThoaiXachTay();

    @Override
    public void add() {
        dienThoaiXachTayList = readWriteDienThoaiXachTay.readToFileDIenThoaixachTay();
        System.out.println(" THÊM MÓI ĐIỆN THOẠI CHÍNH HÃNG");
        System.out.println(" thêm id ");
        Integer id = CheckTryCatch.getChoiceInteger();
        System.out.println(" thêm tên");
        String ten = scanner.nextLine();

        System.out.println("thêm giá");
        Integer gia = CheckTryCatch.getChoiceInteger();
        System.out.println(" thêm số lượng");
        Integer soLuong = CheckTryCatch.getChoiceInteger();
        System.out.println(" thêm nhà sản xuất");
        String nhaSanXuat = scanner.nextLine();
        System.out.println(" thêm quốc gia xách tay");
        String quocGiaXachTay = scanner.nextLine();
        System.out.println(" thêm trang thái");
        String trangThai = scanner.nextLine();
        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(id, ten, gia, soLuong, nhaSanXuat, quocGiaXachTay, trangThai);
        dienThoaiXachTayList.add(dienThoaiXachTay);
        readWriteDienThoaiXachTay.writerToFileDienThoaiXachTay(dienThoaiXachTayList);
    }

    @Override
    public void delete() throws ThrowException {
        System.out.println(" ---- CHƯƠNG TRÌNH XÓA ĐIỆN THOẠI XÁCH TAY---");
        dienThoaiXachTayList = readWriteDienThoaiXachTay.readToFileDIenThoaixachTay();
        System.out.println(" kiểm tra id");
        int id = CheckTryCatch.getChoiceInteger();

        for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
            if (dienThoaiXachTayList.get(i).getId().equals(id)) {
                System.out.println(" bạn có muốn xóa không\n" +
                        "1. yes\n" +
                        "2.no\n");
                int chon = CheckTryCatch.getChoiceInteger();
                switch (chon) {
                    case 1:
                        dienThoaiXachTayList.remove(i);
                        System.out.println(" bạn đã xóa thành công");
                        readWriteDienThoaiXachTay.writerToFileDienThoaiXachTay(dienThoaiXachTayList);
                        break;
                    case 2:
                        System.out.println(" bạn đã không xóa");
                        break;
                    default:
                        System.out.println(" nhập không hợp lệ");
                        break;
                }
            } else {
                throw new ThrowException(" không có id " + id + " ở trong danh sách");
            }

        }
    }

    @Override
    public void display() {
        dienThoaiXachTayList = readWriteDienThoaiXachTay.readToFileDIenThoaixachTay();
        for (DienThoaiXachTay dienThoaiXachTay : dienThoaiXachTayList
        ) {
            System.out.println(dienThoaiXachTay);
        }
    }

    @Override
    public void search() throws ThrowException {
        System.out.println(" ---- CHƯƠNG TRÌNH XÓA ĐIỆN THOẠI TÌM DIỆN THOẠI---");
        dienThoaiXachTayList = readWriteDienThoaiXachTay.readToFileDIenThoaixachTay();

        System.out.println(" kiểm tra tên");
        String ten = scanner.nextLine();
        for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
            if (dienThoaiXachTayList.get(i).getTen().contains(ten)) {
                System.out.println(dienThoaiXachTayList.get(i));
                break;
            } else {
                throw new ThrowException(" không có tên " + ten + " ở trong danh sách");
            }
        }
    }
}
