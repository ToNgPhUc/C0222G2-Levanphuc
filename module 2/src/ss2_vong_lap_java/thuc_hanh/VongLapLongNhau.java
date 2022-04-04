package ss2_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class VongLapLongNhau {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("mulipticatison table");
        System.out.print(" ");
        for (int j = 1; j <= 9 ;j++)
            System.out.print("   "+ j);
            System.out.println("\n-------------------------------------------");

            for (int i = 1; i<= 9 ; i++){
                System.out.print(i+"|");
                for (int j = 1; j<=9; j++){
                    System.out.printf("%4d",i*j);
                }
                System.out.println();
            }

        }
    }

