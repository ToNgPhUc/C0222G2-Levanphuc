package ss12_java_collection_framwork.thuc_hanh.differentiate_hashmap_and_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("nam1", 27, "QuangBinh3");
        Student student2 = new Student("phuc2", 26, "QuangBinh2");
        Student student3 = new Student("phu3", 25, "QuangBinh1");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);
        Set<Integer> key = studentMap.keySet();

        for (Integer Key : key) {
            System.out.println("Key: " + Key);
            System.out.println("Value: " + studentMap.get(Key));
        }
        System.out.println("...........Set");
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student3);
        studentSet.add(student2);
        studentSet.add(student1);
        studentSet.add(student3);

        for (Student student : studentSet) {
            System.out.println(student.toString());
        }

    }
}
