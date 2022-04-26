package ss15_xu_li_ngoai_le_va_debug.thuc_hanh3;

import java.util.Scanner;

public class CalculationExample {
    public void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println(" tổng: "+a);
            System.out.println(" hiệu: "+b);
            System.out.println(" tích: "+c);
            System.out.println(" thương: "+d);

        }catch (NumberFormatException e){
            System.out.println("xảy ra ngoại lệ "+e.getMessage());

        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter x");
        int x= scanner.nextInt();
        System.out.println("enter y");
        int y = scanner.nextInt();
        CalculationExample calculationExample= new CalculationExample();
        calculationExample.calculate(x,y);

    }
}
