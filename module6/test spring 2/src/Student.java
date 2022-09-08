import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
    private String name;
    private Integer diem;

    public Student() {
    }

    public Student(String name, Integer diem) {
        this.name = name;
        this.diem = diem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDiem() {
        return diem;
    }

    public void setDiem(Integer diem) {
        this.diem = diem;
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", diem=" + diem +
                '}';
    }

    public static void main(String[] args) {
        Student student= new Student("phuc",5);
        Student student1= new Student("phuc",6);
        Student student2= new Student("phuc",5);
        Student student3= new Student("phuc",10);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Collections.sort(studentList);
        studentList.stream().map(s -> s.diem).forEach(System.out::print);

        Collections.reverse(studentList);
        studentList.stream().forEach(System.out::print);

        System.out.println(studentList.toString());
    }
}
