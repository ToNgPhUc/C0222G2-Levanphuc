package service.iplm;

import model.Student;
import repository.IStudentRepository;
import repository.iplm.StudentRepository;
import service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();
    private List<Student> students = this.iStudentRepository.getAll();

    @Override
    public List<Student> getAllStudent() {
        return students;
    }

    @Override
    public void save(Student student) {
        iStudentRepository.save(student);
    }

    @Override
    public void updateById(Integer codeStudent, String nameStudent, Double point, Integer gender) {

        for (Student student : students) {
            if (student.getCodeStudent() == codeStudent) {
                student.setCodeStudent(codeStudent);
                student.setNameStudent(nameStudent);
                student.setPoint(point);
                student.setGender(gender);
            }
        }
    }
}
