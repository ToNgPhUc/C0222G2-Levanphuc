package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

//gộp mãng
public class Bai3MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + " :");
            arr1[i] = Integer.parseInt(sc.nextLine());
        }

        int[] arr2 = new int[2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + " :");
            arr2[i] = Integer.parseInt(sc.nextLine());

        }
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i= 0; i <arr1.length ; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr3[arr1.length+i]=arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+",");
        }
    }
}
