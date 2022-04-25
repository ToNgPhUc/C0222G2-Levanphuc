package ss15_xu_li_ngoai_le_va_debug.thuc_hanh;

import java.util.Scanner;

public class FileText {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {

            try {
                System.out.println("nhap a");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap b");
                String b = scanner.nextLine();
                System.out.println("nhap c");
                int c = Integer.parseInt(scanner.nextLine());

                flag = false;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                flag = true;
            }
        }

    }
}
