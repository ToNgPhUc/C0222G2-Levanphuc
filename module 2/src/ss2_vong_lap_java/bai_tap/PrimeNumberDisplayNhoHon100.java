package ss2_vong_lap_java.bai_tap;

import java.util.Scanner;

public class PrimeNumberDisplayNhoHon100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number");
        int number= sc.nextInt();
        System.out.print("số nguyên tố nhỏ hơn 100 là ");
       int k = 0;
       while (number<=100){
           for (int soNguyenTo = 1;soNguyenTo <=number;soNguyenTo++){
               int count= 0;
               for (int j = 1;j<=soNguyenTo;j++){
                   if (soNguyenTo%j ==0){
                       count++;
                   }
               }
               if (count==2){
                   System.out.print(","+soNguyenTo);
               }

           }
           break;

       }  k++;


    }

}
