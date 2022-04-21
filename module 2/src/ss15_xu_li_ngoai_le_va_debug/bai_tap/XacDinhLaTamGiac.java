package ss15_xu_li_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class XacDinhLaTamGiac {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println();
//            System.out.println("nhap canh a ");
//            int a = scanner.nextInt();
//            System.out.println("nhap canh b");
//            int b = scanner.nextInt();
//            System.out.println("nhap canh c");
//            int c = scanner.nextInt();
//            if (a==b&&b==c&&c==a){
//                System.out.println("la tam giac can");
//            }

        boolean flag = true;
        while (flag) {
            System.out.println();
            System.out.println("nhap canh a ");
            int a = scanner.nextInt();
            System.out.println("nhap canh b");
            int b = scanner.nextInt();
            System.out.println("nhap canh c");
            int c = scanner.nextInt();
            try {
                System.out.println("Dung yeu cau la canh tam giac");
                setTriangle(a, b, c);
                flag = false;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Nhap lai");
                flag = true;

            }
        }
    }
    public static void setTriangle(int a, int b, int c) throws MyTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new MyTriangleException("Gia tri nho hon 0");
        }
 }

}
