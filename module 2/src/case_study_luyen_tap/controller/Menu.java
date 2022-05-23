package case_study_luyen_tap.controller;

import case_study.common.check_try_catch.CheckTryCatch;
import case_study_luyen_tap.service.Iplm.CustomerServiceImpl1;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    CustomerServiceImpl1 customerServiceImpl1= new CustomerServiceImpl1();

    public void displayMenu() {
        Boolean flag = true;
        while (flag) {
            System.out.println("------CHƯƠNG TRÌNH CHỌN MENU-------\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.println("xin mời chọn menu");

            int chon =CheckTryCatch.getChoiceInteger();
            switch (chon) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                   System.exit(0);
                default:
                    System.out.println("nhập không hợp lệ, vui lòng chọn lại");

            }

        }

    }

    private void promotionManagement() {
        boolean flag = true;
        while (flag) {
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            System.out.println("xin mời chọn menu");
            int chon = CheckTryCatch.getChoiceInteger();
            switch (chon) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    flag = false;
                default:
                    System.out.println("nhập không hợp lệ, vui lòng chọn lại");

            }
        }


    }

    private void bookingManagement() {
        boolean flag = true;
        while (flag) {
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new constracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
            System.out.println("xin mời chọn menu");

            int chon = CheckTryCatch.getChoiceInteger();
            switch (chon) {
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
                    System.out.println("nhập không hợp lệ, vui lòng chọn lại");

            }
        }


    }

    private void facilityManagement() {
        boolean flag = true;
        while (flag) {
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            System.out.println("xin mời chọn menu");

            int chon = CheckTryCatch.getChoiceInteger();
            switch (chon) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    flag = false;
                default:
                    System.out.println("nhập không hợp lệ, vui lòng chọn lại");

            }
        }


    }

    private void customerManagement() {
        boolean flag = true;
        while (flag) {
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
            System.out.println("xin mời chọn menu");

            int chon = CheckTryCatch.getChoiceInteger();
            switch (chon) {
                case 1:
                    customerServiceImpl1.display();
                    break;
                case 2:
                    customerServiceImpl1.add();
                    break;
                case 3:
                    customerServiceImpl1.edit();
                    break;
                case 4:
                    customerServiceImpl1.delete();
//                    flag = false;
                    break;
                default:
                    System.out.println("nhập không hợp lệ, vui lòng chọn lại");

            }
        }


    }

    private void employeeManagement() {
        boolean flag = true;
        while (flag) {
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n");
            System.out.println("xin mời chọn menu");

            int chon = CheckTryCatch.getChoiceInteger();
            switch (chon) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    flag = false;
                default:
                    System.out.println("nhập không hợp lệ, vui lòng chọn lại");

            }
        }
    }

}

