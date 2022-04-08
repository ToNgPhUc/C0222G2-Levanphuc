package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;
//tìm giá trị nhỏ nhất trong mảng
public class SmallestValue {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 1, 6, 9};
        int min = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[min]);
    }

    public static int minValue(int[] array) {
        int min = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[min]) {//so sanh tat ca cac gia tri trong mang voi phan tu thu nhat
                min = i;
            }
        }
        return min;
    }

}
