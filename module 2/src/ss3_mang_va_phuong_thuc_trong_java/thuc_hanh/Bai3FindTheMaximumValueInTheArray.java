package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;
// tìm giá trị lớn nhất trong mãng aray
public class Bai3FindTheMaximumValueInTheArray {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("enter size");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("ko phu hop");
            }
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }

        }
        System.out.print("the maximum in a arr " + max + " index: " + index);





    }
}
