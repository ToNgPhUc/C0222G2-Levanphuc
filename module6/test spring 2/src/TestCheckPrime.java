public class TestCheckPrime {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
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
