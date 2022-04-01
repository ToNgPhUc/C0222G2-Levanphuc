package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Bai4GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("cho phương trình a*x +b = 0 : vui lòng nhập số");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double ketQua = (c - b) / a;
            System.out.printf("Equation pass with x = %f!" ,ketQua);
        } else {
            if (b == c){
                System.out.print("The solution is all x!");
            }
            else {
                System.out.print(" No solution!");
            }

        }


    }
}
