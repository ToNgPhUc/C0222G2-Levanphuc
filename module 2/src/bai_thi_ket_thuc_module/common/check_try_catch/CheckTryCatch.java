package bai_thi_ket_thuc_module.common.check_try_catch;

import java.util.Scanner;

public class CheckTryCatch {

    private static Scanner scanner = new Scanner(System.in);

    public static int getChoiceInteger() {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                return choice;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("lỗi nhập từ hệ thống, vui lòng nhập lại");
            }
        }
    }

    public static double getChoiceDouble() {
        while (true) {
            try {

                double choiceDouble =Double.parseDouble(scanner.nextLine());
                return choiceDouble;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("lỗi nhập từ hệ thống, vui lòng nhập lại");
            }
        }
    }
}
