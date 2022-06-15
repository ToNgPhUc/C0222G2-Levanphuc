package repository.employee;

import model.employee.*;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getAllEmployee();

    List<User> getAllUser();

    List<Division> getAllDivision();

    List<Position> getAllPosition();

    List<EducationDegree> getAllEducationDegree();

    void create(Employee employee);

    Employee FindById(int employeeId);

    void edit(Employee employee);
}
