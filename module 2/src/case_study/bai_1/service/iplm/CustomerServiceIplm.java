package case_study.bai_1.service.iplm;

import case_study.bai_1.model.Customer;
import case_study.bai_1.service.ICustomerService;
import case_study.bai_1.service.InterfaceService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceIplm implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customerList = new LinkedList<>();

    static {
        customerList.add(new Customer("Phuc1", "14/2", "nam", 1, 1, "phuc@gmail.com", "123", "vip", "Quang Binh"));
    }

    @Override
    public void display() {
        System.out.println("-----DANH SÁCH KHÁCH HÀNG-----");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        System.out.println("-----CHƯƠNG TRÌNH ADD KHÁCH HÀNG-------");
        System.out.println("xin mời thêm mới họ tên");
        String hoTen = scanner.nextLine();
        System.out.println("xin mời thêm mới ngày sinh");
        String ngaySinh = scanner.nextLine();
        System.out.println("xin mời thêm mới giới tính");
        String gioiTinh = scanner.nextLine();
        System.out.println("xin mời thêm mới chứng minh nhân dân");
        Integer soChungMinhNhanDan = Integer.parseInt(scanner.nextLine());
        System.out.println("xin mời thêm mới số điện thoại");
        Integer soDienThoai = Integer.parseInt(scanner.nextLine());
        System.out.println("xin mời thêm mới email");
        String email = scanner.nextLine();
        System.out.println("xin mời thêm mới mã khách hàng");
        String maKhachHang = scanner.nextLine();
        System.out.println("xin mời thêm mới loại khách");
        String loaiKhach = scanner.nextLine();
        System.out.println("xin mời thêm mới địa chỉ");
        String diaChi = scanner.nextLine();
        Customer customer = new Customer(hoTen, ngaySinh, gioiTinh, soChungMinhNhanDan, soDienThoai, email, maKhachHang, loaiKhach, diaChi);
        customerList.add(customer);
    }

    @Override
    public void edit() {
        System.out.println("----CHƯƠNG TRÌNH EDIT KHÁCH HÀNG----");
        System.out.println("nhập mã khách hàng để kiểm tra");
        String maKhachHang= scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (maKhachHang.contains(customerList.get(i).getMaKhachHang())){
                flag= true;
                System.out.println("xin mời sửa lại họ tên");
                customerList.get(i).setHoTen(scanner.nextLine());

                System.out.println("xin mời sửa lại ngày sinh");
                customerList.get(i).setNgaySinh(scanner.nextLine());

                System.out.println("xin mời sửa lại giới tính");
                customerList.get(i).setGioiTinh(scanner.nextLine());

                System.out.println("xin mời sửa lại chứng minh nhân dân");
                customerList.get(i).setSoChungMinhNhanDan(Integer.parseInt(scanner.nextLine()));

                System.out.println("xin mời sửa lại số điện thoại");
                customerList.get(i).setSoDienThoai(Integer.parseInt(scanner.nextLine()));

                System.out.println("xin mời sửa lại email");
                customerList.get(i).setEmail(scanner.nextLine());

                System.out.println("xin mời sửa lại mã khách hàng");
                customerList.get(i).setMaKhachHang(scanner.nextLine());

                System.out.println("xin mời sửa lại loại khách");
                customerList.get(i).setLoaiKhach(scanner.nextLine());

                System.out.println("xin mời sửa lại địa chỉ");
                customerList.get(i).setDiaChi(scanner.nextLine());
            }
        }
        if (flag== false){
                System.out.println("không có mã khách hang "+maKhachHang+" ở trong danh sách");
        }
    }
}
