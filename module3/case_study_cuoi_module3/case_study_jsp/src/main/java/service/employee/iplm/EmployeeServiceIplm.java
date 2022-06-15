package service.employee.iplm;

import model.employee.*;
import repository.employee.IEmployeeRepository;
import repository.employee.iplm.EmployeeRepositoryIplm;
import service.employee.IEmployeeService;
import validate.CheckRegex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceIplm implements IEmployeeService {
    IEmployeeRepository employeeRepository = new EmployeeRepositoryIplm();
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.getAllEmployee();
    }

    @Override
    public List<User> getAllUser() {
        return employeeRepository.getAllUser();
    }

    @Override
    public List<Division> getAllDivision() {
        return employeeRepository.getAllDivision();
    }

    @Override
    public List<Position> getAllPosition() {
        return employeeRepository.getAllPosition();
    }

    @Override
    public List<EducationDegree> getAllEducationDegree() {
        return employeeRepository.getAllEducationDegree();
    }

//    @Override
//    public void create(Employee employee) {
//        employeeRepository.create(employee);
//    }

    @Override
    public Employee FindById(int employeeId) {
        return employeeRepository.FindById(employeeId);
    }


    //    @Override
//    public void edit(Employee employee) {
//        employeeRepository.edit(employee);
//    }
    @Override
    public Map<String, String> create(Employee employee) {
        Map<String, String> errMap = new HashMap<>();

//        List<Employee> employeeList = employeeRepository.getAllEmployee();

//        boolean flag = false;
        if (employee.getEmployeeName() == null || employee.getEmployeeName().equals("")) {
            errMap.put("errEmployeeName", " bạn chưa nhập dữ liệu");
        }
        if (employee.getEmployeeBirthday() == null || employee.getEmployeeBirthday().equals("")) {
            errMap.put("errEmployeeBirthday", "bạn chưa nhập dữ liệu");
        } else {
            try {
                employee.setEmployeeBirthday(simpleDateFormat.format(simpleDateFormat.parse(employee.getEmployeeBirthday())));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        if (employee.getEmployeeIdCard() == null || employee.getEmployeeIdCard().equals("")) {
            errMap.put("errEmployeeIdCard", "bạn chưa nhập dữ liệu");
        } else if (!CheckRegex.checkRegexCard(employee.getEmployeeIdCard())) {
            errMap.put("errEmployeeIdCard", "EmployeeIdCard XXXXXXXXX hoặc XXXXXXXXXXXX (X là số 0-9 )");
        }

        if (employee.getEmployeePhone() == null || employee.getEmployeePhone().equals("")) {
            errMap.put("errEmployeePhone", "bạn chưa nhập dữ liệu");
        } else if (!CheckRegex.checkRegexPhone(employee.getEmployeePhone())) {
            errMap.put("errEmployeePhone", "Số điện thoại phải có 9 số và bắt đầu bằng 09-XXXXXXX hoặc 849-XXXXXXX !");
        }
        if (employee.getEmployeeEmail() == null || employee.getEmployeeEmail().equals("")) {
            errMap.put("errEmployeeEmail", "bạn chưa nhập dữ liệu");
        } else if (!CheckRegex.checkRegexEmail(employee.getEmployeeEmail())) {
            errMap.put("errEmployeeEmail", "Email không đúng định dạng  !");
        }

        if (employee.getEmployeeAddress() == null || employee.getEmployeeAddress().equals("")) {
            errMap.put("errEmployeeAddress", "bạn chưa nhập dữ liệu");
        }

//        for (Employee employee1 : employeeList) {
//            if (employee1.getPositionId() == employee.getPositionId()) {
//                flag = true;
//                break;
//            }
//        }
//
//        if (!flag) {
//            errMap.put("errPositionId", "lỗi hệ thống, xin nhập lại sau");
//        }
//        for (Employee employee1 : employeeList) {
//            if (employee1.getEducationDegreeId() == employee.getEducationDegreeId()) {
//                flag = true;
//                break;
//            }
//        }
//        if (!flag) {
//            errMap.put("errEducationDegreeId", "lỗi hệ thống, xin nhập lại sau");
//        }
//        for (Employee employee1 : employeeList) {
//            if (employee1.getDivisionId() == employee.getDivisionId()) {
//                flag = true;
//                break;
//            }
//        }
//        if (!flag) {
//            errMap.put("errDivisionId", "lỗi hệ thống, xin nhập lại sau");
//        }
        if (errMap.isEmpty()) {
            employeeRepository.create(employee);
        }
        return errMap;
    }

    @Override
    public Map<String, String> edit(Employee employee) {
        Map<String, String> errMap = new HashMap<>();
//        List<Employee> employeeList = employeeRepository.getAllEmployee();

//        boolean flag = false;
        if (employee.getEmployeeName() == null || employee.getEmployeeName().equals("")) {
            errMap.put("errEmployeeName", " bạn chưa nhập dữ liệu");
        }
        if (employee.getEmployeeBirthday() == null || employee.getEmployeeBirthday().equals("")) {
            errMap.put("errEmployeeBirthday", "bạn chưa nhập dữ liệu");
        } else {
            try {
                employee.setEmployeeBirthday(simpleDateFormat.format(simpleDateFormat.parse(employee.getEmployeeBirthday())));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        if (employee.getEmployeeIdCard() == null || employee.getEmployeeIdCard().equals("")) {
            errMap.put("errEmployeeIdCard", "bạn chưa nhập dữ liệu");
        } else if (!CheckRegex.checkRegexCard(employee.getEmployeeIdCard())) {
            errMap.put("errEmployeeIdCard", "EmployeeIdCard XXXXXXXXX hoặc XXXXXXXXXXXX (X là số 0-9 )");
        }

        if (employee.getEmployeePhone() == null || employee.getEmployeePhone().equals("")) {
            errMap.put("errEmployeePhone", "bạn chưa nhập dữ liệu");
        } else if (!CheckRegex.checkRegexPhone(employee.getEmployeePhone())) {
            errMap.put("errEmployeePhone", "Số điện thoại phải có 9 số và bắt đầu bằng 09-XXXXXXX hoặc 849-XXXXXXX !");
        }
        if (employee.getEmployeeEmail() == null || employee.getEmployeeEmail().equals("")) {
            errMap.put("errEmployeeEmail", "bạn chưa nhập dữ liệu");
        } else if (!CheckRegex.checkRegexEmail(employee.getEmployeeEmail())) {
            errMap.put("errEmployeeEmail", "Email không đúng định dạng [ vidu: phuc@gmail.com ] !");
        }

        if (employee.getEmployeeAddress() == null || employee.getEmployeeAddress().equals("")) {
            errMap.put("errEmployeeAddress", "bạn chưa nhập dữ liệu");
        }

//        for (Employee employee1 : employeeList) {
//            if (employee1.getPositionId() == employee.getPositionId()) {
//                flag = true;
//                break;
//            }
//        }
//
//        if (!flag) {
//            errMap.put("errPositionId", "lỗi hệ thống, xin nhập lại sau");
//        }
//        for (Employee employee1 : employeeList) {
//            if (employee1.getEducationDegreeId() == employee.getEducationDegreeId()) {
//                flag = true;
//                break;
//            }
//        }
//        if (!flag) {
//            errMap.put("errEducationDegreeId", "lỗi hệ thống, xin nhập lại sau");
//        }
//        for (Employee employee1 : employeeList) {
//            if (employee1.getDivisionId() == employee.getDivisionId()) {
//                flag = true;
//                break;
//            }
//        }
//        if (!flag) {
//            errMap.put("errDivisionId", "lỗi hệ thống, xin nhập lại sau");
//        }
        if (errMap.isEmpty()) {
            employeeRepository.create(employee);
        }
        return errMap;
    }

}
