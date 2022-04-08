package ss2_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class LoanInterest {
    public static void main(String[] args) {

        double money = 1.0;
        int month = 1;
        double interest = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("input money");
        money = input.nextDouble();

        System.out.println("input interest");
        interest = input.nextDouble();

        System.out.println("input month");
        month = input.nextInt();
        double lai= 0;
        for (int i = 0;i<month;i++){
            lai+=money*(interest/100)/12*month;

        }
        System.out.println(lai+" là số tiền lai");



    }
}
