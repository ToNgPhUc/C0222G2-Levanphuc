import java.util.Scanner;

public class DaoNguocSo {
    // đảo ngược số từ số nhập từ bàn phím.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số : ");
        int x = Integer.parseInt(scanner.nextLine());
        int soDaoNguoc=0;
        while (x > 0) {
            int soDu = x % 10;
            soDaoNguoc = soDaoNguoc * 10 + soDu;
            x /= 10;
        }
        System.out.println("dãy số được đảo ngược là: "+soDaoNguoc);

    }
}
