package ss2_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so nguyen a");
        int a = sc.nextInt();
        System.out.print("nhap so nguyen b");
        int b = sc.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.print("khong co uoc chung lon nhat");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("uoc chung lon nhat la " + a);
    }
}