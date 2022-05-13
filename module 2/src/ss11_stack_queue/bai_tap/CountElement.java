package ss11_stack_queue.bai_tap;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter String");
        String strings = scanner.nextLine();
        strings = strings.toUpperCase();
        Map<Character, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < strings.length(); i++) {
            if (!treeMap.containsKey(strings.charAt(i))) {
                treeMap.put(strings.charAt(i), 1);
            } else {
                treeMap.put(strings.charAt(i), treeMap.get(strings.charAt(i)) + 1);
            }
        }
        for (Map.Entry<Character,Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
