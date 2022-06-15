package repository.employee.iplm;

import connection.Database;
import model.employee.*;
import repository.employee.IEmployeeRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryIplm implements IEmployeeRepository {
    Database database = new Database();
    private static final String GET_ALL_LIST = "select*from employee  \n" +
            " left join division on employee.division_id= division.division_id\n " +
            " left join education_degree on employee.education_degree_id= education_degree.education_degree_id\n " +
            " left join `position` on employee.position_id= `position`.position_id\n " +
            " left join `user`on employee.employee_name= `user`.user_name;";

    private static final String GET_ALL_EMPLOYEE = " select * from employee where `status`=0";
    private static final String GET_ALL_USER = "select * from `user`";
    private static final String GET_ALL_DIVISION = "select * from `division`";
    private static final String GET_ALL_POSITION = "select * from `position`";
    private static final String GET_ALL_EDUCATION_DEGREE = "select * from `education_degree`";

    private static final String INSERT_INTO_EMPLOYEE = " insert into employee (employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id,user_name) values(?,?,?,?,?,?,?,?,?,?,?)";
    private final String SELECT_EMPLOYEE_BY_ID = " select * from employee where employee_id = ?; ";
    private static final String EDIT_EMPLOYEE = " update employee set employee_name=?,employee_birthday=?,employee_id_card=?,employee_salary=?,employee_phone=?,employee_email=?,employee_address=?,position_id=?,`education_degree_id`=?,`division_id`=?,`user_name`=?,`status`=?  where employee_id=?;";


    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = database.getConnectionJavaToDB();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_EMPLOYEE);
            while (resultSet.next()) {

                Integer employeeId = resultSet.getInt("employee_id");
                String employeeName = resultSet.getString("employee_name");
                String employeeBirthday = resultSet.getString("employee_birthday");
                String employeeIdCard = resultSet.getString("employee_id_card");
                Double employeeSalary = resultSet.getDouble("employee_salary");
                String employeePhone = resultSet.getString("employee_phone");
                String employeeEmail = resultSet.getString("employee_email");
                String employeeAddress = resultSet.getString("employee_address");
                Integer positionId = resultSet.getInt("position_id");
                Integer educationDegreeId = resultSet.getInt("education_degree_id");
                Integer divisionId = resultSet.getInt("division_id");
                String userName = resultSet.getString("user_name");
                Integer status = resultSet.getInt("status");
                Employee employee = new Employee(employeeId, employeeName, employeeBirthday, employeeIdCard, employeeSalary,
                        employeePhone, employeeEmail, employeeAddress, positionId, educationDegreeId, divisionId, userName, status);
                employeeList.add(employee);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return employeeList;
    }

    @Override
    public List<User> getAllUser() {
        List<User> userList = new ArrayList<>();
        Connection connection = database.getConnectionJavaToDB();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_USER);
            while (resultSet.next()) {
                String userName = resultSet.getString("user_name");
                String password = resultSet.getString("password");
                int status = resultSet.getInt("status");
                User user = new User(userName, password, status);
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return userList;
    }

    @Override
    public List<Division> getAllDivision() {
        List<Division> divisionList = new ArrayList<>();
        Connection connection = database.getConnectionJavaToDB();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_DIVISION);
            while (resultSet.next()) {
                int divisionId = resultSet.getInt("division_id");
                String divisionName = resultSet.getString("division_name");
                int status = resultSet.getInt("status");
                Division division = new Division(divisionId, divisionName, status);
                divisionList.add(division);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return divisionList;
    }

    @Override
    public List<Position> getAllPosition() {
        List<Position> positionList = new ArrayList<>();
        Connection connection = database.getConnectionJavaToDB();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_POSITION);
            while (resultSet.next()) {
                int positionId = resultSet.getInt("position_id");
                String positionName = resultSet.getString("position_name");
                int status = resultSet.getInt("status");
                Position position = new Position(positionId, positionName, status);
                positionList.add(position);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return positionList;
    }

    @Override
    public List<EducationDegree> getAllEducationDegree() {
        List<EducationDegree> educationDegreeList = new ArrayList<>();
        Connection connection = database.getConnectionJavaToDB();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_EDUCATION_DEGREE);
            while (resultSet.next()) {
                int educationDegreeId = resultSet.getInt("education_degree_id");
                String educationDegreeName = resultSet.getString("education_degree_name");
                int status = resultSet.getInt("status");
                EducationDegree educationDegree = new EducationDegree(educationDegreeId, educationDegreeName, status);
                educationDegreeList.add(educationDegree);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return educationDegreeList;
    }

    @Override
    public void create(Employee employee) {
        Connection connection = database.getConnectionJavaToDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_EMPLOYEE);
            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setString(2, employee.getEmployeeBirthday());
            preparedStatement.setString(3, employee.getEmployeeIdCard());
            preparedStatement.setDouble(4, employee.getEmployeeSalary());
            preparedStatement.setString(5, employee.getEmployeePhone());
            preparedStatement.setString(6, employee.getEmployeeEmail());
            preparedStatement.setString(7, employee.getEmployeeAddress());
            preparedStatement.setInt(8, employee.getPositionId());
            preparedStatement.setInt(9, employee.getEducationDegreeId());
            preparedStatement.setInt(10, employee.getDivisionId());
            preparedStatement.setString(11, employee.getUserName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public Employee FindById(int employeeId) {

        Employee employee = null;
        Connection connection = database.getConnectionJavaToDB();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1, employeeId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int employeeId1 = resultSet.getInt("employee_id");
                String employeeName = resultSet.getString("employee_name");
                String employeeBirthday = resultSet.getString("employee_birthday");
                String employeeIdCard = resultSet.getString("employee_id_card");
                Double employeeSalary = resultSet.getDouble("employee_salary");
                String employeePhone = resultSet.getString("employee_phone");
                String employeeEmail = resultSet.getString("employee_email");
                String employeeAddress = resultSet.getString("employee_address");
                Integer positionId = resultSet.getInt("position_id");
                Integer educationDegreeId = resultSet.getInt("education_degree_id");
                Integer divisionId = resultSet.getInt("division_id");
                String userName = resultSet.getString("user_name");
                Integer status = resultSet.getInt("status");

                employee = new Employee(employeeId1, employeeName, employeeBirthday, employeeIdCard, employeeSalary,
                        employeePhone, employeeEmail, employeeAddress, positionId, educationDegreeId, divisionId, userName, status);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return employee;
    }

    @Override
    public void edit(Employee employee) {
        Connection connection = database.getConnectionJavaToDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(EDIT_EMPLOYEE);

            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setString(2, employee.getEmployeeBirthday());
            preparedStatement.setString(3, employee.getEmployeeIdCard());
            preparedStatement.setDouble(4, employee.getEmployeeSalary());
            preparedStatement.setString(5, employee.getEmployeePhone());
            preparedStatement.setString(6, employee.getEmployeeEmail());
            preparedStatement.setString(7, employee.getEmployeeAddress());
            preparedStatement.setInt(8, employee.getPositionId());
            preparedStatement.setInt(9, employee.getEducationDegreeId());
            preparedStatement.setInt(10, employee.getDivisionId());
            preparedStatement.setString(11, employee.getUserName());
            preparedStatement.setInt(12, employee.getStatus());
            preparedStatement.setInt(13,employee.getEmployeeId());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
