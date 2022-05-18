package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x;
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x");
        x = sc.nextInt();
        System.out.print("enter index arr");
        index = sc.nextInt();

         themPhantu(arr,index,x);
    }
    static void themPhantu(int[] arr, int index,int x) {

        int[] daySoMoi = new int[arr.length+1];
        for (int i = 0; i < index; i++) {
            daySoMoi[i] = arr[i];
        }
        for (int i = index; i < arr.length ; i++) {
            daySoMoi[i + 1] = arr[i];
        }
        daySoMoi[index]=x;

        for (int i = 0; i < daySoMoi.length; i++) {
            System.out.print(daySoMoi[i]+" ,");
        }


  }
}


