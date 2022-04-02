package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("your enter VND");
        double vnd = scanner.nextDouble();
        double usd = vnd / 23000;
        System.out.println("the usd  " + usd);

    }
}
