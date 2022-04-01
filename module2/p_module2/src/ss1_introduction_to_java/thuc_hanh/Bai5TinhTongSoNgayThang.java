package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Bai5TinhTongSoNgayThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("bạn muốn đếm sô ngày của tháng nào!");
        int month = scanner.nextInt();
        String daysInMonth;


        switch (month) {
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
//                System.out.print("tháng "+month+"có 30 ngày!");

            default:
                daysInMonth = "";
//                System.out.print("không hợp lệ");

    } if (daysInMonth != "")
            System.out.printf("The month '%d' has %s days", month, daysInMonth);
        else System.out.print("không hợp lệ!");
    }
}
