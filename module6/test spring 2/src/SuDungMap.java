import java.util.HashMap;
import java.util.Map;


                            //Cho hai mảng số nguyên. tìm những số trùng nhau. (Sử dụng Map)
public class SuDungMap {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,5,5,6,87,65,43,54,35,74,6537,6,537,3};
        int[] num2 = {4,5,3,5,5,6,2,7,43,54,35,74,9,6,537,3};
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int n1: num1) {
            integerMap.put(n1, 1);
        }
        for (int n1: num2) {
            if (integerMap.get(n1) == null) {
                integerMap.put(n1, 1);
            } else {
                integerMap.put(n1, integerMap.get(n1) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: integerMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
