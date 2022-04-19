package ss12_java_collection_framwork.thuc_hanh.comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("Kien", 30, "Quang Binh1");
        Student student2 = new Student("Nam", 26, "Quang binh 2");
        Student student3 = new Student("Anh", 38, "Quang binh 3");
        Student student4 = new Student("Tung", 38, "Quang binh 4");
        List<Student> listStudent= new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);

        Collections.sort(listStudent);
        for (Student student:listStudent) {
            System.out.println(student.toString());
        }
        AgeComparator ageComparator= new AgeComparator();
        Collections.sort(listStudent,ageComparator);
        System.out.println("so sanh tuoi");
        for (Student student:listStudent){
            System.out.println(student);
        }





    }

}
