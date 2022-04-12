package ss2_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number a");
        int a = sc.nextInt();
        System.out.print("enter number b");
        int b = sc.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.print("no UCLN");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("the UCLN=  " + a);
    }
}