package case_study_luyen_tap.service.Iplm;

import case_study.bai_1.common.check_try_catch.CheckTryCatch;
import case_study_luyen_tap.common.read_writer.ReadWriterToFileCustomer1;
import case_study_luyen_tap.model.Customer1;
import case_study_luyen_tap.service.CustomerService1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CustomerServiceImpl1 implements CustomerService1 {
    private  static  ReadWriterToFileCustomer1 readWriterToFileCustomer1= new ReadWriterToFileCustomer1();
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer1> customer1List = new ArrayList<>();

    static {
        customer1List.add(new Customer1("phuc", "14-2", "nam", 1945, 911, "@a"
                , "b11", "vip", "quang binh"));
        readWriterToFileCustomer1.writerToFileCustomer1(customer1List);
    }

    @Override
    public void display() {
        customer1List=readWriterToFileCustomer1.readToFileCustomer1();
        for (Customer1 customer1 : customer1List) {
            System.out.println(customer1);
        }
    }
//    public Customer1(String hoTen, String ngaySinh, String gioiTinh, Integer soCMND, Integer soDienThoai,
//    String email, String maKhachHang, String loaiKhach, String diaChi) {

    @Override
    public void add() {
        System.out.println("---ADD NEW CUSTOMER---");
        System.out.println(" thêm họ tên ");
        String hoTen = scanner.nextLine();
        System.out.println(" thêm ngày sinh");
        String ngaySinh = scanner.nextLine();
        System.out.println("thêm giới tính");
        String gioiTinh = scanner.nextLine();
        System.out.println(" thêm số CMND");
        Integer soCMND = CheckTryCatch.getChoiceInteger();
        System.out.println(" thêm số điện thoại");
        Integer soDienThoai = CheckTryCatch.getChoiceInteger();
        System.out.println(" thêm email");
        String email = scanner.nextLine();
        System.out.println(" thêm mã khách hàng");
        String maKhachHang = scanner.nextLine();
        System.out.println(" thêm loại khách");
        String loaiKhachHang = scanner.nextLine();
        System.out.println("thêm địa chỉ");
        String diaChi = scanner.nextLine();
        Customer1 customer1 = new Customer1(hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, maKhachHang, loaiKhachHang, diaChi);
        customer1List.add(customer1);
    }


    @Override
    public void edit() {

        System.out.println("---EDIT CUSTOMER---");
        System.out.println("kiểm tra mã khách hàng");
        String maKhachHang = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < customer1List.size(); i++) {
            if (maKhachHang.equals(customer1List.get(i).getMaKhachHang())) {
                flag = true;
                System.out.println("mã khách hàng " + maKhachHang + " có trong danh sách");

                System.out.println(" sửa họ tên");
                customer1List.get(i).setHoTen(scanner.nextLine());

                System.out.println(" sửa ngày sinh");
                customer1List.get(i).setNgaySinh(scanner.nextLine());

                System.out.println(" sửa giới tính");
                customer1List.get(i).setGioiTinh(scanner.nextLine());

                System.out.println(" sửa số CMND");
                Integer soCMND = CheckTryCatch.getChoiceInteger();
                customer1List.get(i).setSoCMND(soCMND);

                System.out.println(" sửa số điện thoại");
                Integer soDIenThoai = CheckTryCatch.getChoiceInteger();
                customer1List.get(i).setSoDienThoai(soDIenThoai);

                System.out.println(" sửa email");
                customer1List.get(i).setEmail(scanner.nextLine());

                System.out.println(" sửa mã khách hàng");
                customer1List.get(i).setMaKhachHang(scanner.nextLine());

                System.out.println(" sửa loại khách");
                customer1List.get(i).setLoaiKhach(scanner.nextLine());

                System.out.println(" sửa địa chỉ");
                customer1List.get(i).setDiaChi(scanner.nextLine());
                break;
            }
        }
        if (flag == false) {
            System.out.println("mã khách hàng " + maKhachHang + " không khó trong danh sách");
        }

    }

    @Override
    public void delete() {

        System.out.println("---DELETE CUSTOMER---");
        System.out.println("kiểm tra mã khách hàng");
        String maKhachHang = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < customer1List.size(); i++) {
            if (maKhachHang.equals(customer1List.get(i).getMaKhachHang())) {
                flag = true;
                System.out.println("1.yes\n" +
                        "2. no");
                Integer luaChon = CheckTryCatch.getChoiceInteger();
                if (luaChon.equals(1)) {
                    customer1List.remove(i);
                    System.out.println("da xoa thanh cong");
                    break;
                } else if (luaChon.equals(2)) {
                    System.out.println("ban da khong xoa");
                    break;
                }
            }
        }
        if (flag == false) {
            System.out.println("mã khách hàng " + maKhachHang + " không có trong danh sách");
        }
    }
}
