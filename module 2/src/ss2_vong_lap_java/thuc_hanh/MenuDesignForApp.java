package ss2_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class MenuDesignForApp {
    public static void main(String[] args) {

int choice= -1;
Scanner sc = new Scanner(System.in);
while (choice!=0){
    System.out.println("menu");
    System.out.println("1. Draw the triangle");
    System.out.println("2. Draw the square");
    System.out.println("3. Draw the rectangle");
    System.out.println("0. exit");
    System.out.print("enter your choice");
    choice= sc.nextInt();
    switch (choice){
        case 1:
            System.out.println("*****");
            System.out.println("****");
            System.out.println("***");
            System.out.println("**");
            System.out.println("*");
            break;
        case 2:
            System.out.println("*****");
            System.out.println("*****");
            System.out.println("*****");

            break;
        case 3:
            System.out.println("*****");
            System.out.println("*****");
            System.out.println("*****");
            System.out.println("*****");
            break;
        case 0:
            System.exit(0);
        default:
            System.out.println("please re-enter");

        }

       }

    }
}


