package case_study.bai_1.service.iplm;

import case_study.bai_1.common.check_try_catch.CheckTryCatch;
import case_study.bai_1.common.read_writer.ReadWriterToFileEmployee;
import case_study.bai_1.model.Employee;
import case_study.bai_1.service.IEmployeeService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class EmployeeServiceIplm implements IEmployeeService {
    ReadWriterToFileEmployee readWriterToFileEmployee = new ReadWriterToFileEmployee();
    Scanner scanner = new Scanner(System.in);
    public static List<Employee> employeeList = new LinkedList<>();

    @Override
    public void display() {
        System.out.println("----DANH SÁCH NHÂN VIÊN----");
        employeeList = readWriterToFileEmployee.readToFileEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee.getInFor());
        }
    }

    @Override
    public void add() {
        employeeList = readWriterToFileEmployee.readToFileEmployee();

        System.out.println("----CHƯƠNG TRÌNH ADD NHÂN VIÊN----");
        System.out.println("xin mời thêm mới họ tên");
        String name = scanner.nextLine();
        System.out.println("xin mời thêm mới ngày sinh");
        String dayOfBirth = scanner.nextLine();
        System.out.println("xin mời thêm mới giới tính");
        String gender = scanner.nextLine();

        System.out.println("xin mời thêm mới chứng minh nhân dân");
        Integer identityCardNumber = CheckTryCatch.getChoiceInteger();


        System.out.println("xin mời thêm mới số điện thoại");
        Integer phoneNumber = CheckTryCatch.getChoiceInteger();

        System.out.println("xin mời thêm mới email");
        String email = scanner.nextLine();
        System.out.println("xin mời thêm mới mã nhân viên");
        String employeeCode = scanner.nextLine();
        System.out.println("xin mời thêm mới trình độ");
        String level = scanner.nextLine();
        System.out.println("xin mời thêm mới vị trí");
        String location = scanner.nextLine();

        System.out.println("xin mời thêm mới lương");
        double wage = CheckTryCatch.getChoiceDouble();

        Employee employee = new Employee(name, dayOfBirth, gender, identityCardNumber, phoneNumber, email, employeeCode, level, location, wage);
        employeeList.add(employee);

        readWriterToFileEmployee.writerToFileEmployee(employeeList);

    }


    @Override
    public void edit() {
        employeeList = readWriterToFileEmployee.readToFileEmployee();


        System.out.println("----EDIT EMPLOYEE-----");
        System.out.println("kiểm tra mã nhân viên");
        String employeeCode = scanner.nextLine();
        Boolean flag = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeCode.equals(employeeList.get(i).getEmployeeCode())) {
                flag = true;
                System.out.println("xin mời sửa tên");
                employeeList.get(i).setName(scanner.nextLine());
                System.out.println("xin mời sửa ngày sinh");
                employeeList.get(i).setDateOfBirth(scanner.nextLine());
                System.out.println("xin mời sửa giới tính");
                employeeList.get(i).setGender(scanner.nextLine());

                System.out.println("xin mời sửa số chứng minh nhân dân ");

                Integer identityCardNumber = CheckTryCatch.getChoiceInteger();
                employeeList.get(i).setIdentityCardNumber(identityCardNumber);

                System.out.println("xin mời sửa số điện thoại");
                Integer phoneNumber =CheckTryCatch.getChoiceInteger();
                employeeList.get(i).setPhoneNumber(phoneNumber);

                System.out.println("xin mời sửa email");
                employeeList.get(i).setEmail(scanner.nextLine());
                System.out.println("xin mời sửa mã nhân viên");
                employeeList.get(i).setEmployeeCode(scanner.nextLine());
                System.out.println("xin mời sửa trình độ");
                employeeList.get(i).setLevel(scanner.nextLine());
                System.out.println("xin mời sửa vị trí");
                employeeList.get(i).setLocation(scanner.nextLine());
                System.out.println("xin mời sửa lương");

                double wage= CheckTryCatch.getChoiceDouble();
                employeeList.get(i).setWage(wage);


                readWriterToFileEmployee.writerToFileEmployee(employeeList);

            }

        }
        if (flag == false) {
            System.out.println("không có mã nhân viên " + employeeCode + " ở trong danh sách");
        }

    }
}


