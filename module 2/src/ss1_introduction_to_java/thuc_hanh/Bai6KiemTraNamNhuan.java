package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Bai6KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("enter year: ");
        year= scanner.nextInt();
//        if (year % 4 == 0){
//            if (year%100==0){
//                if (year%400==0){
//                    System.out.printf("%d la nam nhuan ", year);
//                }
//                else {
//                    System.out.printf("%d khong phai la nam nhuan",year);
//                }
//            }else {
//                System.out.printf("%d khong phai la nam nhuan",year);
//            }
//
//        }else {
//            System.out.printf("%d khong phai la nam nhuan", year);
//        }


//boolean NamNhuan=false;
//if (year%4==0){
//    if (year%100==0){
//        if (year%400==0){
//            NamNhuan=true;
//        }
//    }
//}
//if (NamNhuan){
//    System.out.printf("%d khong phai la nam nhuan",year);
//
//}else {
//    System.out.printf("%d la nam nhuan",year);
//}
//

boolean NamNhuan = false;
boolean chiaHetCho4= year%4==0;
if (chiaHetCho4){
    boolean chiaHetCho100= year%100==0;
    if (chiaHetCho100){
        boolean chiaHetCho400=year%400==0;
      if (chiaHetCho400){
          NamNhuan= true;
      }
    }else {
        NamNhuan= true;
    }
}
if (NamNhuan){
            System.out.printf("%d la nam nhuan: ",year);
        }
else {
    System.out.printf("%d  ko phai la nam nhuan: ",year);
}





    }
}
