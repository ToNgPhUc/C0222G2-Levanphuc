import java.util.Scanner;

import static java.lang.Math.pow;

public class TinhBatPhan {
    //    Cách chuyển 8 sang 10
//    n = 144
//            4 * 8 ^ 0
//            4 * 8 ^ 1
//            1 * 8 ^ 2
//            = 100
//            */
//    ----------------------
//    Chuyển cơ số 10 sang cơ số 8
//    hệ cơ số 10: 1234 = 1 * 10^3 + 2 * 10^2 + 3 * 10^1 + 4 * 10^0
//    hệ cơ số 8: 25 = 2 * 8 ^ 1 + 5 * 8 ^ 0 = 21
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter number");
            int n = Integer.parseInt(scanner.nextLine());
            if (n == 0) {
                break;
            }
            System.out.println(DecToOct(n));
        }
    }

    public static int DecToOct(int number) {
        int p = 0;
        int octNumber = 0;
        while (number > 0) {
            octNumber += (number % 8) * pow(10, p);
            p++;
            number /= 8;
        }
        return octNumber;
    }
}
