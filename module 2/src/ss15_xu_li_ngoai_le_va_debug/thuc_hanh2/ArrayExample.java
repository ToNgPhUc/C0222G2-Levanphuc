package ss15_xu_li_ngoai_le_va_debug.thuc_hanh2;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println(" danh sách phần tử mãng");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần từ bất kì");
        int x = scanner.nextInt();
        try {
            System.out.println("giá trị phần tử có chỉ số " + x + "la" + arr[x]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("vượt quá chỉ số mãng ");
        }
    }
}