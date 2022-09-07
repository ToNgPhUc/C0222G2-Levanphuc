import java.util.HashMap;
import java.util.Map;

public class XuLiChuoiBangMap {
    public static void main(String[] args) {
        String str = "aksdbksdjhjaskdjkasjdsd";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == null) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        str = "";
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            str += entry.getKey();
        }
        System.out.println(str);


    }

}
