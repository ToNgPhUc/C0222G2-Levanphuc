package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Bai7TinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("nhap so weight (kg): ");
        weight= scanner.nextDouble();
        System.out.print("nhap chieu cao (m)");
        height= scanner.nextDouble();
       bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "chi so trung binh\n");
        if (bmi<18.0)
            System.out.printf("%-20.2f%s", bmi, "coi xuong");
        else if (bmi < 25.0)
                System.out.printf("%-20.2f%s", bmi, "binh thuong");
        else if (bmi < 30.0)
                System.out.printf("%-20.2f%s", bmi, "hoi beo");
        else
                System.out.printf("%-20.2f%s", bmi, "beo");


    }
}
