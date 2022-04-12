package ss2_vong_lap_java.bai_tap;

import java.util.Scanner;

// hiển thị các loại hình
public class DisplayTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("choose"+"\n"+
                "\n"+"1:choose square"
                +"\n"+"2:choose right triangle the left "
                +"\n"+"3:choose right triangle the right");
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
