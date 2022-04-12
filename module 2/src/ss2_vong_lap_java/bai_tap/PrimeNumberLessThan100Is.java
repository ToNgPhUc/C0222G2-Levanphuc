package ss2_vong_lap_java.bai_tap;

import java.util.Scanner;

public class PrimeNumberLessThan100Is {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number");
        int number= sc.nextInt();
        System.out.print("prime number less than 100 is ");
        int k = 0;
        while (number<=100){
            for (int primeNumber = 1;primeNumber <=number;primeNumber++){
                int count= 0;
                for (int j = 1;j<=primeNumber;j++){
                    if (primeNumber%j ==0){
                        count++;
                    }
                }
                if (count==2){
                    System.out.print(","+primeNumber);
                }

            }
            break;

        }  k++;


    }
}
