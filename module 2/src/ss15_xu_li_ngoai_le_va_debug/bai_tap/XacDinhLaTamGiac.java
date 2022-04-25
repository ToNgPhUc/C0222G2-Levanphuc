package ss15_xu_li_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class XacDinhLaTamGiac {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Boolean flag = true;
        while (flag) {
            System.out.println("nhap canh a ");
            int a = scanner.nextInt();
            System.out.println("nhap canh b");
            int b = scanner.nextInt();
            System.out.println("nhap canh c");
            int c = scanner.nextInt();
            try {
                setTamGiac(a, b, c);
                System.out.println("la tam giac can");
                flag = false;
            } catch (MyTriangleException e){
                System.err.println(e.getMessage());
                System.out.println("vui long nhap lai");
                flag= true;
            }

        }

//        if (a == b && b == c) {
//            System.out.println("la tam giac can");
//        }

//        boolean flag = true;
//        while (flag) {
//            System.out.println();
//            System.out.println("enter a");
//            int a = scanner.nextInt();
//            System.out.println("enter b b");
//            int b = scanner.nextInt();
//            System.out.println("enter c");
//            int c = scanner.nextInt();
//            try {
//                System.out.println("the is a Triangle");
//                setTriangle(a, b, c);
//                flag = false;
//            } catch (Exception e) {
//                e.printStackTrace();
//                System.out.println("please re-enter");//vui long nhập lại
//                flag = true;
//
//            }
//        }
//    }
//    public static void setTriangle(int a, int b, int c) throws MyTriangleException {
//        if (a <= 0 || b <= 0 || c <= 0) {
//            throw new MyTriangleException("Gia tri nho hon 0");
//        }
    }

    public static void setTamGiac(int a, int b, int c) throws MyTriangleException {
        if (a != b || b != c) {
            throw new MyTriangleException("cac canh ko bang nhau");
        }
    }

}
