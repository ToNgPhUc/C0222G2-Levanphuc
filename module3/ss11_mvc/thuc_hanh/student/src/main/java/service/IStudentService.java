package service;

import model.Student;

import java.util.List;

public interface IStudentService  {
    List<Student>getAllStudent();
    void save(Student student);
    void updateById(Integer codeStudent ,String nameStudent,Double point, Integer gender);
}
