package ss12_java_collection_framwork.thuc_hanh.comparable_and_comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getAge()-student2.getAge();
    }
}
