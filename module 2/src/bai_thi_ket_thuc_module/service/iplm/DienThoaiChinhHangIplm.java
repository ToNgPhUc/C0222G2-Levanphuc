package bai_thi_ket_thuc_module.service.iplm;

import bai_thi_ket_thuc_module.common.check_try_catch.CheckTryCatch;
import bai_thi_ket_thuc_module.common.check_try_catch.ThrowException;
import bai_thi_ket_thuc_module.common.read_writer.ReadWriteDienThoaiChinhHang;
import bai_thi_ket_thuc_module.moder.DienThoaiChinhHang;
import bai_thi_ket_thuc_module.service.IDienThoaiChinhHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiChinhHangIplm implements IDienThoaiChinhHang {
    Scanner scanner = new Scanner(System.in);
    List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
    ReadWriteDienThoaiChinhHang readWriteDienThoaiChinhHang = new ReadWriteDienThoaiChinhHang();

    @Override
    public void add() {
        dienThoaiChinhHangList = readWriteDienThoaiChinhHang.readToFileDIenThoaiChinhHang();
        System.out.println(" THÊM MÓI ĐIỆN THOẠI CHÍNH HÃNG");
        System.out.println(" thêm id ");
        Integer id = CheckTryCatch.getChoiceInteger();
        System.out.println(" thêm tên");
        String ten = scanner.nextLine();
        System.out.println("thêm giá");
        Integer gia = bai_thi_ket_thuc_module.common.check_try_catch.CheckTryCatch.getChoiceInteger();
        System.out.println(" thêm số lượng");
        Integer soLuong = bai_thi_ket_thuc_module.common.check_try_catch.CheckTryCatch.getChoiceInteger();
        System.out.println(" thêm nhà sản xuất");
        String nhaSanXuat = scanner.nextLine();
        System.out.println(" thêm thời gian bảo hành");
        Integer thoiGianBaoHanh = CheckTryCatch.getChoiceInteger();
        System.out.println(" thêm phạm vi bảo hành");
        String phamViBaoHanh = scanner.nextLine();
        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(id, ten, gia, soLuong, nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh);
        dienThoaiChinhHangList.add(dienThoaiChinhHang);
        readWriteDienThoaiChinhHang.writerToFileDienThoaiChinhHang(dienThoaiChinhHangList);
    }

    @Override
    public void delete() throws ThrowException {
        System.out.println(" ---- CHƯƠNG TRÌNH XÓA ĐIỆN THOẠI CHÍNH HÃNG---");
        dienThoaiChinhHangList = readWriteDienThoaiChinhHang.readToFileDIenThoaiChinhHang();
        System.out.println(" kiểm tra id");
        int id = CheckTryCatch.getChoiceInteger();
        for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
            if (dienThoaiChinhHangList.get(i).getId().equals(id)) {
                System.out.println(" bạn có muốn xóa không\n" +
                        "1. yes\n" +
                        "2.no");
                int chon = CheckTryCatch.getChoiceInteger();
                switch (chon) {
                    case 1:
                        dienThoaiChinhHangList.remove(i);
                        System.out.println(" xóa thành công");

                        readWriteDienThoaiChinhHang.writerToFileDienThoaiChinhHang(dienThoaiChinhHangList);
                        break;
                    case 2:
                        System.out.println(" bạn đã không xóa");
                        break;
                    default:
                        System.out.println(" nhập ko hợp lệ");
                        break;
                }
            } else {
                throw new ThrowException(" không có id " + id + " trong danh sách");

            }
            break;
        }

    }

    @Override
    public void display() {
        dienThoaiChinhHangList = readWriteDienThoaiChinhHang.readToFileDIenThoaiChinhHang();
        for (DienThoaiChinhHang dienThoai : dienThoaiChinhHangList) {
            System.out.println(dienThoai);
        }
    }

    @Override
    public void search() throws ThrowException {
        System.out.println(" ---- CHƯƠNG TRÌNH XÓA ĐIỆN THOẠI TÌM DIỆN THOẠI---");
        dienThoaiChinhHangList = readWriteDienThoaiChinhHang.readToFileDIenThoaiChinhHang();

        System.out.println(" kiểm tra tên");
        String ten = scanner.nextLine();
        for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
            if (dienThoaiChinhHangList.get(i).getTen().contains(ten)) {
                System.out.println(dienThoaiChinhHangList.get(i));
                break;
            } else {
                throw new ThrowException(" không có tên " + ten + " ở trong danh sách");
            }
        }
    }
}
