package case_study.bai_1.service.iplm;

import case_study.bai_1.model.Employee;
import case_study.bai_1.service.InterfaceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceIplm implements InterfaceService<Employee> {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("phuc1", "14/2/95", "nam", 194539633, 123, "tongphuc1495@gmail.com", "123h1", "caodang", "giam doc", 1000.0));
    }
//(String hoTen, String ngaySinh, String gioiTinh, Integer soChungMinhNhanDan,
// Integer soDienThoai, String email, String maNhanVien, String trinhDo, String viTri, double luong) {
    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        System.out.println("enter name");
        String hoTen=scanner.nextLine();
        System.out.println("enter Date");
        String ngaySinh=scanner.nextLine();
        System.out.println("enter gioi tinh");
        String gioiTinh=scanner.nextLine();
        System.out.println("enter chung minh nhan dan");
        Integer soChungMinhNhanDan= Integer.parseInt(scanner.nextLine());
        System.out.println("enter number");
        Integer soDienThoai=Integer.parseInt(scanner.nextLine());
        System.out.println("enter email");
        String email= scanner.nextLine();
        System.out.println("enter ma nhan vien");
        String maNhanVien= scanner.nextLine();
        System.out.println("enter trinh do");
        String trinhDo = scanner.nextLine();
        System.out.println("enter vi tri");
        String viTri= scanner.nextLine();
        System.out.println("enter luong");
        double luong= Double.parseDouble(scanner.nextLine());
        Employee employee= new Employee(hoTen,ngaySinh,gioiTinh,soChungMinhNhanDan,soDienThoai,email,maNhanVien,trinhDo,viTri,luong);
        employeeList.add(employee);

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }
}
