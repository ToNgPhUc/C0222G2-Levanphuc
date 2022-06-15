package service.employee;

import model.employee.*;

import java.util.List;
import java.util.Map;

public interface IEmployeeService {
    List<Employee> getAllEmployee();

    List<User> getAllUser();

    List<Division> getAllDivision();

    List<Position> getAllPosition();

    List<EducationDegree> getAllEducationDegree();

//    void create(Employee employee);

    Employee FindById(int employeeId);

    //    void edit(Employee employee);
    Map<String, String> edit(Employee employee);
    Map<String, String>  create(Employee employee);
}
