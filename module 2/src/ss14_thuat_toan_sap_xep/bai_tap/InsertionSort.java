package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void insertionSort(int[] array) {

        int pos;
        int x;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
            System.out.println("lan thu" + i + Arrays.toString(array));
        }

    }

    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 7, 3, 5, 7, 9, 0};
        insertionSort(arr);
    }
}


