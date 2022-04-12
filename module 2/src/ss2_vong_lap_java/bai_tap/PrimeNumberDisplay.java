package ss2_vong_lap_java.bai_tap;


// in 20 so nguyen to dau tien

import java.util.Scanner;

// hien thi so nguyen to
public class PrimeNumberDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number");
        int number = sc.nextInt();
        System.out.print("prime");
        int count = 0;
        int soNto = 0;
        while (count < number) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(soNto); i++) {
                if (soNto % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(soNto + ",");
                count++;
                soNto++;
            }
            soNto++;
        }
    }
}









//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap number");
//        int number = sc.nextInt();
//        System.out.println("cac so nguyen to la");
//        int soNguyenTo=0;
//            for ( soNguyenTo = 1; soNguyenTo <= number; soNguyenTo++) {
//                int count = 0;
//                for (int j = 1; j <= soNguyenTo; j++) {
//                    if (soNguyenTo % j == 0) {
//                        count++;
//                    }
//                }
//                while (count1<number) {
//                    if (count == 2) {
//                        System.out.print(", " + soNguyenTo);

//                    }
//                }
//        }
//    }
//}
//


//boolean flag = true;
//        if (number<2){
//            flag= false;
//        }else if (number==2){
//            flag= true;
//        }else
//            for (int i = 2;i<=Math.sqrt(number);i++){
//                if (number%i == 0){
//                    flag= false;
//                }
//            }
//        if (flag){
//
//            while (count<number){
//                System.out.println(","+number);
//                count++;
//                number++;
//
//            }
//            number++;
//
//        }
