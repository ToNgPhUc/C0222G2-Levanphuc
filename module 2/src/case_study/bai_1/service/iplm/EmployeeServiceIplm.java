package case_study.bai_1.service.iplm;

import case_study.bai_1.model.Employee;
import case_study.bai_1.service.IEmployeeService;
import ss16_io_text_file.thuc_hanh.ReadFile2;
import ss16_io_text_file.thuc_hanh.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static case_study.bai_1.common.read_writer.ReadWriterToFile.readWriterToFile;

public class EmployeeServiceIplm implements IEmployeeService {

    private static Scanner scanner = new Scanner(System.in);
    public static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("phuc1", "14/2/95", "nam", 194539633, 123, "tongphuc1495@gmail.com", "123h1", "caodang", "giam doc", 1000.0));
        readWriterToFile.writerToFileEmployee(employeeList);
//        employeeList= readWriterToFile.readToFileEmployee();

    }

    @Override
    public void display() {
        System.out.println("----DANH SÁCH NHÂN VIÊN----");
//       employeeList= readWriterToFile.readToFileEmployee();
//        System.out.println(employeeList);
//        for (Employee e:employeeList
//        ) {
//            System.out.println(e.displayEmployee());
//        }
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("----CHƯƠNG TRÌNH ADD NHÂN VIÊN----");
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
                System.out.println("xin mời thêm mới mã nhân viên");
                String maNhanVien = scanner.nextLine();
                System.out.println("xin mời thêm mới trình độ");
                String trinhDo = scanner.nextLine();
                System.out.println("xin mời thêm mới vị trí");
                String viTri = scanner.nextLine();
                System.out.println("xin mời thêm mới lương");
                double luong = Double.parseDouble(scanner.nextLine());
                Employee employee = new Employee(hoTen, ngaySinh, gioiTinh, soChungMinhNhanDan, soDienThoai, email, maNhanVien, trinhDo, viTri, luong);
                employeeList.add(employee);

                readWriterToFile.writerToFileEmployee(employeeList);
                flag = false;

            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println("bạn đã nhập sai xin hãy nhập lại từ đầu");
                flag = true;
            }
        }

    }

    @Override
    public void edit() {
        boolean ngoaiLe = true;
        while (ngoaiLe) {
            try {
                System.out.println("----CHƯƠNG TRÌNH EDIT NHÂN VIÊN-----");
                System.out.println("kiểm tra mã nhân viên");
                String maNhanVien = scanner.nextLine();
                Boolean flag = false;
                for (int i = 0; i < employeeList.size(); i++) {
                    if (maNhanVien.equals(employeeList.get(i).getMaNhanVien())) {
                        flag = true;
                        System.out.println("xin mời sửa tên");
                        employeeList.get(i).setHoTen(scanner.nextLine());
                        System.out.println("xin mời sửa ngày sinh");
                        employeeList.get(i).setNgaySinh(scanner.nextLine());
                        System.out.println("xin mời sửa giới tính");
                        employeeList.get(i).setGioiTinh(scanner.nextLine());
                        System.out.println("xin mời sửa số chứng minh nhân dân ");
                        employeeList.get(i).setSoChungMinhNhanDan(Integer.parseInt(scanner.nextLine()));
                        System.out.println("xin mời sửa số điện thoại");
                        employeeList.get(i).setSoDienThoai(Integer.parseInt(scanner.nextLine()));
                        System.out.println("xin mời sửa email");
                        employeeList.get(i).setEmail(scanner.nextLine());
                        System.out.println("xin mời sửa mã nhân viên");
                        employeeList.get(i).setMaNhanVien(scanner.nextLine());
                        System.out.println("xin mời sửa trình độ");
                        employeeList.get(i).setTrinhDo(scanner.nextLine());
                        System.out.println("xin mời sửa vị trí");
                        employeeList.get(i).setViTri(scanner.nextLine());
                        System.out.println("xin mời sửa lương");
                        employeeList.get(i).setLuong(Double.parseDouble(scanner.nextLine()));


                        readWriterToFile.writerToFileEmployee(employeeList);

                    }
                }
                if (flag == false) {
                    System.out.println("không có mã nhân viên " + maNhanVien + " ở trong danh sách");
                }

                ngoaiLe = false;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println("bạn đã nhập sai xin hãy nhập lại từ đầu.");
                ngoaiLe = true;
            }
        }


    }
}


