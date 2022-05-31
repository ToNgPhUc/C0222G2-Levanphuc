package repository.iplm;

import model.Student;
import repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "phuc1", 9.0, 1));
        students.add(new Student(2, "phuc2", 8.0, 0));
        students.add(new Student(3, "phuc3", 7.0, 1));
        students.add(new Student(4, "phuc4", 6.0, 0));
        students.add(new Student(5, "phuc5", 5.0, null));
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void save(Student student) {
        students.add(student);
    }
}
