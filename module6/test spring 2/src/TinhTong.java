public class TinhTong {


    // tính tổng của 4 số lớn nhất và tổng của 4 số nhỏ nhất
    public static void main(String[] args) {
        int sumMax = 0;
        int sumMin = 0;
        int sum = 0;
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
            sumMax = sum - min;
            sumMin = sum - max;

        }
        System.out.println(sumMax);
        System.out.println(sumMin);

    }
}
