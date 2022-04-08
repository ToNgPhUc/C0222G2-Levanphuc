package ss2_vong_lap_java.thuc_hanh;


import java.util.Scanner;
         //kiem tra co phai la so nguyen to hay khong
public class PrimeNumberCheck {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int number = sc.nextInt();
        if (number<2){
            System.out.println(number+"is not prime");
        }else {
            int i = 2;
//            cho check la so nguyen to
            boolean check = true;
            while (i <=number){
                if (number% i ==0){
                    check= false;
                    break;
                }
                i++;
            }if (check)
                System.out.println(number+" is a prime");
            else
                System.out.println(number+" is a not prime");

        }

    }
}
