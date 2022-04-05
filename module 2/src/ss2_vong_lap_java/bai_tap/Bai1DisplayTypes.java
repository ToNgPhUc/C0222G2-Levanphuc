package ss2_vong_lap_java.bai_tap;

import java.util.Scanner;

// hiển thị các loại hình
public class Bai1DisplayTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("chon"+"\n"+
        "1:chon hinh vuong"+
                "\n"+"1:chon hinh vuong"
                +"\n"+"2:chon hinh tam giac vuong goc trai duoi"
                +"\n"+"3:chon hinh tam giac vuong goc trai tren");
        int choice= sc.nextInt();
        switch (choice){
            case 1: {
                for (int i = 0; i <6; i++) {

                    for (int j = 0; j < 4; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }break;
            }
            case 2:{
                for (int i = 1; i <= 6; i++) {

                    for (int j = 1; j <i ; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }

            } case 3:{
                for (int i = 5; i >=1 ; i--) {
                    for (int j = 1; j <=i ; j++) {
                        System.out.print("*");
                        
                    }
                    System.out.println(" ");
                }
           }
        }



    }
}
