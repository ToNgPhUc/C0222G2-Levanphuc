package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

//gia tri lon nhat trong mang 2 chieu
public class Bai4MaxElementInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1, 2, 3, 4, 5, 6},
                {2, 4, 5, 6, 7, 8,}
        };

        int max = arr[0][0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) ;
                max = arr[i][j];
            }

        }
        System.out.println("gia tri lon nhat la "+max);



    }
}
