package case_study.bai_1.controller;

import case_study.bai_1.model.Customer;
import case_study.bai_1.model.Facility;
import case_study.bai_1.service.iplm.CustomerServiceIplm;
import case_study.bai_1.service.iplm.EmployeeServiceIplm;
import case_study.bai_1.service.iplm.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);
    EmployeeServiceIplm employee = new EmployeeServiceIplm();
    CustomerServiceIplm customerServiceIplm = new CustomerServiceIplm();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public void displayMainMenu() {

        while (true) {
            System.out.println(
                    "1.\tEmployee Management\n" +//quan li nhan su
                            "2.\tCustomer Management\n" +//quan li khach hang
                            "3.\tFacility Management \n" +// quan li co so
                            "4.\tBooking Management\n" +//Quản lý đặt chỗ
                            "5.\tPromotion Management\n" +//nguoi quan li khuyen mai
                            "6.\tExit\n");

            System.out.println("xin hay chon chuc nang");
            int chonMenu = scanner.nextInt();
            switch (chonMenu) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    CustomerManagement();
                    break;
                case 3:
                    FacilityManagement();
                    break;
                case 4:
                    BookingManagement();
                    break;
                case 5:
                    PromotionManagement();
                    break;
                case 6:
                    System.exit(0);

            }
        }
    }

    private void employeeManagement() {
        boolean flag = true;
        while (flag) {
            System.out.println(
                    "1\tDisplay list employees\n" +
                            "2\tAdd new employee\n" +
                            "3\tEdit employee\n" +
                            "4\tReturn main menu\n");
            System.out.println("xin moi chon menu");
            int chonEmployee = scanner.nextInt();
            switch (chonEmployee) {
                case 1:
                    employee.display();
                    break;
                case 2:
                    employee.add();
                    break;
                case 3:
                    employee.edit();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("xin hãy chọn lại");
            }
        }
    }

    private void CustomerManagement() {
        boolean flag = true;
        while (flag) {
            System.out.println(
                    "1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
            System.out.println("xin moi chon menu");
            int chonEmployee = scanner.nextInt();
            switch (chonEmployee) {
                case 1:
                    customerServiceIplm.display();
                    break;
                case 2:
                    customerServiceIplm.add();
                    break;
                case 3:
                    customerServiceIplm.edit();
                    break;
                case 4:
                    flag = false;
                default:
                    System.out.println("xin hãy chọn lại");
            }
        }
    }

    private void FacilityManagement() {
        boolean flag = true;
        while (flag) {
            System.out.println(
                    "1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
            System.out.println("xin moi chon menu");
            int chonEmployee = scanner.nextInt();

            switch (chonEmployee) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    facilityService.add();
                    facilityService.display();
                    break;
                case 3:
                    facilityService.edit();
                    break;
                case 4:
                    flag = false;
                default:
                    System.out.println("xin hãy chọn lại");
            }
        }
    }

    private void BookingManagement() {
        boolean flag = true;
        while (flag) {
            System.out.println(
                    "1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
            System.out.println("xin moi chon menu");
            int chonEmployee = scanner.nextInt();
            switch (chonEmployee) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    flag = false;
                default:
                    System.out.println("xin hãy chọn lại");

            }
        }
    }

    private void PromotionManagement() {
        boolean flag = true;
        while (flag) {
            System.out.println(
                    "1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
            System.out.println("xin moi chon menu");
            int chonEmployee = scanner.nextInt();
            switch (chonEmployee) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    flag = false;
                default:
                    System.out.println("xin hãy chọn lại");
            }
        }
    }
}


