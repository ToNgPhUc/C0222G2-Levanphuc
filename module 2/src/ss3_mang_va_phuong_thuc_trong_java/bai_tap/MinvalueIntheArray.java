package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

//gias trij nhor nhaats trong mang
public class MinvalueIntheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhap phan tu thu" + (i + 1) + ":");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        int min= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println("min value: "+min);
    }

}
