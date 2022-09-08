import java.util.*;

public class XoaKiTuTrungVaDem {
    public static void main(String[] args) {
        String[] arr = {"1", "k", "k", "f", "f", "1", "2"};
        int a = 1;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null) {
                map.put(arr[i], a);
            } else {
                map.put(arr[i], a + 1);
            }
        }
       String str= "";
       for (Map.Entry<String, Integer> entry: map.entrySet()){
           System.out.println(entry.getKey()+" : " +entry.getValue());
           str+= entry.getKey();
        }
        System.out.println(str);

    }
}
