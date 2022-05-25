package a_luyen_tap_giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SoNguyenTo {
// cho 1 mảng 2 chiều sau đó in ra mảng 1 chiều bao gồm các số nguyên tố được sắp sếp tăng dần
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };
        System.out.printf("số nguyên to" + Arrays.toString(isprime(arr)));
    }

    public static Integer[] isprime(int[][] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (prime(arr[i][j])) {
                    list.add(arr[i][j]);
                }
            }
        }
        list.sort(Comparator.naturalOrder());
        return list.toArray(new Integer[0]);
    }
    public static boolean prime(int number) {
        if (number < 2) {
            return false;
        } else
            for (int i = 2; i < number; i++) {
                if (number % 2 == 0) {
                    return false;
                }
            }
        return true;
    }
}

