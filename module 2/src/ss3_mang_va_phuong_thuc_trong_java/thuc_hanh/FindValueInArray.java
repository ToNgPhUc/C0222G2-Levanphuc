package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

// tìm giá trị trong mãng
public class FindValueInArray {
    public static void main(String[] args) {
        String[] Students = {"le van phuc", "tran thuan", "tran duc phuong"};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name students");
        String enterName = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < Students.length; i++) {
            if (Students[i].equals(enterName)) {
                System.out.print("enter name : " + enterName + " vi tri " + i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(" name " + enterName + " not in arr ");
        }
    }
}
