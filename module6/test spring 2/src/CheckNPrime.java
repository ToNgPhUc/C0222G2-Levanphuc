import java.util.Scanner;

public class CheckNPrime {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter number: ");
            int n = Integer.parseInt(scanner.nextLine());
            if (n == 0) {
                break;
            }
            if (checkPrime(n)) {
                System.out.println(n + " is Prime");
            } else {
                System.out.println(n + " is not Prime");
            }
        }
    }

    public static boolean checkPrime(int n) {
        if (n<2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
