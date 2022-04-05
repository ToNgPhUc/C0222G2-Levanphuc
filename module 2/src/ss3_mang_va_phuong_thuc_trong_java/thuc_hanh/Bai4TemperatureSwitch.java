package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

// chuyển đổi nhiệt độ
public class Bai4TemperatureSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("menu" + "\n" +
                "1. Fahrenheit to Celsius" + "\n" +
                "2. Celsius to Fahrenheit" + "\n" +
                "0. Exit "+"\n");
        System.out.println("enter number");
double fahrenheit;
double celsius;
        int enterNumber = sc.nextInt();
            switch (enterNumber) {

                case 1:{
                    System.out.print(" enter  Fahrenheit ");
                    fahrenheit= sc.nextDouble();
                    System.out.println(" Fahrenheit to Celsius"+fahrenheitToCelsius(fahrenheit));
                    break;}
                case 2:{
                    System.out.print(" enter  celsius ");
                    celsius= sc.nextDouble();
                    System.out.println(" Fahrenheit to Celsius"+celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(enterNumber);
            }
    }public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}

