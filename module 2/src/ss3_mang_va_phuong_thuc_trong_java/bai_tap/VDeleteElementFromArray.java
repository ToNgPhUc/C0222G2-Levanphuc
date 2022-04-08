package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class VDeleteElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 3, 4, 7, 2,5,6,7};

        for (int y : array) {
            System.out.print(y+",");
        }
        System.out.print("enter x: ");
        int x = scanner.nextInt();
        f(x, array);
    }

    public static void f(int x, int[] array) {
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) { // tìm vị trí xuất hiện phần tử muốn xóa
            if (x == array[i]) {
                index = i; // nếu có gắn cho index
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("index x: " + index);
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];// gia tri sau index se def len vi tri index
            }
            array[array.length - 1] = 0;
            System.out.print("new arr"); //nếu phần tử ở i dc xóa thì phần tử cuối thụt lên = 0;
            for (int a : array) {
                System.out.print(a+",");

            }
        } else {
            System.out.println("x not in the arr");
        }

    }
}

