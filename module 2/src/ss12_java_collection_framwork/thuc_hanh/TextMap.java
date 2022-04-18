package ss12_java_collection_framwork.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TextMap {
    public static void main(String[] args) {
        Map<String,Integer>hashMap= new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson",31);
        hashMap.put("Lewis",29);
        hashMap.put("Cook",29);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap+"\n");

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Smith",30);
        treeMap.put("Anderson",31);
        treeMap.put("Lewis",29);
        treeMap.put("Cook",29);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap+"\n");

        Map<String,Integer> linkedHashMap= new LinkedHashMap<>(16,0.75f,true);

        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
                                                                         //get key=> value
        System.out.println("\nThe age for " + "Smith is " + linkedHashMap.get("Smith"));    }
}
