public class TinhTongMang {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,6};
        int n = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i]+arr[j]==n && i!=j){
                    System.out.println("vị trí 2 số trong mảng có tổng = n là: "+ "\n" +i+" có giá trị là "+arr[i]+ "\n"+" và "+j+ " có giá trị là "+arr[j] );
                }
            }
        }
    }

}
