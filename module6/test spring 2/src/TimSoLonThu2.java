public class TimSoLonThu2 {
    public static void main(String[] args) {
        int arr[] = { 6,9,8,3,2,5,3,9};
        int max1 = arr[0];
        int max2 = arr[0];

        for (int i = 1; i<arr.length; i++){
            if (max1<=arr[i]){
                max1 = arr[i];
            } if (max2< arr[i] && arr[i]< max1){
                max2 = arr[i];
            }
        }

        System.out.println(max2);
    }
}
