package controller.employee;

import model.employee.*;
import service.employee.IEmployeeService;
import service.employee.iplm.EmployeeServiceIplm;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;


@WebServlet(name = "EmployeeController", urlPatterns = "/Employee")
public class EmployeeController extends HttpServlet {
    IEmployeeService employeeService = new EmployeeServiceIplm();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                request.getRequestDispatcher("employee/create.jsp").forward(request, response);
                break;
            case "edit":
                showFormEdit(request, response);
                break;

            case "delete":
                break;
            case "search":
                break;
            default:
                showListEmployee(request, response);
                break;
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int employeeId = Integer.parseInt(request.getParameter("employee_id"));
        Employee employee = employeeService.FindById(employeeId);

        List<Position> positionList = employeeService.getAllPosition();
        request.setAttribute("positionList", positionList);

        List<Division> divisionList = employeeService.getAllDivision();
        request.setAttribute("divisionList", divisionList);

        List<EducationDegree> educationDegreeList = employeeService.getAllEducationDegree();
        request.setAttribute("educationDegreeList", educationDegreeList);

        List<User> userList = employeeService.getAllUser();
        request.setAttribute("userList", userList);

        request.setAttribute("employee_id", employee.getEmployeeId());
        request.setAttribute("employee_name", employee.getEmployeeName());
        request.setAttribute("employee_birthday", employee.getEmployeeBirthday());
        request.setAttribute("employee_id_card", employee.getEmployeeIdCard());
        request.setAttribute("employee_salary", employee.getEmployeeSalary());
        request.setAttribute("employee_phone", employee.getEmployeePhone());
        request.setAttribute("employee_email", employee.getEmployeeEmail());
        request.setAttribute("employee_address", employee.getEmployeeAddress());
        request.setAttribute("position_id", employee.getPositionId());
        request.setAttribute("education_degree_id", employee.getEducationDegreeId());
        request.setAttribute("division_id", employee.getDivisionId());
        request.setAttribute("user_name", employee.getUserName());
        request.setAttribute("status", employee.getStatus());

        request.getRequestDispatcher("employee/edit.jsp").forward(request, response);

    }

    private void showListEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employeeList = employeeService.getAllEmployee();
        request.setAttribute("employeeList", employeeList);


        List<User> userList = employeeService.getAllUser();
        request.setAttribute("userList", userList);

        List<Division> divisionList = employeeService.getAllDivision();
        request.setAttribute("divisionList", divisionList);

        List<Position> positionList = employeeService.getAllPosition();
        request.setAttribute("positionList", positionList);

        List<EducationDegree> educationDegreeList = employeeService.getAllEducationDegree();
        request.setAttribute("educationDegreeList", educationDegreeList);

        request.getRequestDispatcher("employee/list.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {

            case "create":
                addNewEmployee(request, response);
                break;
            case "edit":
                editEmployee(request, response);

                break;
        }
    }


    private void addNewEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String employeeName = request.getParameter("employee_name");
        String employeeBirthday = request.getParameter("employee_birthday");
        String employeeIdCard = request.getParameter("employee_id_card");

        double employeeSalary = 0;
        String errEmployeeSalary = null;
        try {
            employeeSalary = Double.parseDouble(request.getParameter("employee_salary"));
        } catch (NumberFormatException e) {
            errEmployeeSalary = "bạn chưa nhập dữ liệu";
        }
        String employeePhone = request.getParameter("employee_phone");
        String employeeEmail = request.getParameter("employee_email");
        String employeeAddress = request.getParameter("employee_address");
        Integer positionId = Integer.valueOf(request.getParameter("position_id"));
        Integer educationDegreeId = Integer.valueOf(request.getParameter("education_degree_id"));
        Integer divisionId = Integer.valueOf(request.getParameter("division_id"));
        String userName = request.getParameter("user_name");


        Employee employee = new Employee(employeeName, employeeBirthday, employeeIdCard, employeeSalary,
                employeePhone, employeeEmail, employeeAddress, positionId, educationDegreeId, divisionId, userName);

        Map<String, String> errMap = employeeService.edit(employee);

        if (errEmployeeSalary != null) {
            errMap.put("errEmployeeSalary", errEmployeeSalary);
        }
        if (errMap.isEmpty()) {
            response.sendRedirect("/Employee");
        } else {

            request.setAttribute("positionList", employeeService.getAllPosition());
            request.setAttribute("divisionList", employeeService.getAllDivision());
            request.setAttribute("educationDegreeList", employeeService.getAllEducationDegree());
            request.setAttribute("userList", employeeService.getAllUser());

            request.setAttribute("employee_name", employeeName);
            request.setAttribute("employee_birthday", employeeBirthday);
            request.setAttribute("employee_id_card", employeeIdCard);
            request.setAttribute("employee_salary", employeeSalary);
            request.setAttribute("employee_phone", employeePhone);
            request.setAttribute("employee_email", employeeEmail);
            request.setAttribute("employee_address", employeeAddress);
            request.setAttribute("position_id", positionId);
            request.setAttribute("education_degree_id", educationDegreeId);
            request.setAttribute("division_id", divisionId);
            request.setAttribute("user_name", userName);
            request.setAttribute("errMap", errMap);
            try {
                request.getRequestDispatcher("employee/create.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            }


        }
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer employeeId = Integer.valueOf(request.getParameter("employee_id"));
        String employeeName = request.getParameter("employee_name");
        String employeeBirthday = request.getParameter("employee_birthday");
        String employeeIdCard = request.getParameter("employee_id_card");
        double employeeSalary = 0;
        String errEmployeeSalary = null;
        try {
            employeeSalary = Double.parseDouble(request.getParameter("employee_salary"));
        } catch (NumberFormatException e) {
            errEmployeeSalary = "bạn chưa nhập dữ liệu";
        }
        String employeePhone = request.getParameter("employee_phone");
        String employeeEmail = request.getParameter("employee_email");
        String employeeAddress = request.getParameter("employee_address");
        Integer positionId = Integer.valueOf(request.getParameter("position_id"));
        Integer educationDegreeId = Integer.valueOf(request.getParameter("education_degree_id"));
        Integer divisionId = Integer.valueOf(request.getParameter("division_id"));
        String userName = request.getParameter("user_name");
        Integer status = Integer.valueOf(request.getParameter("status"));


        Employee employee = new Employee(employeeId, employeeName, employeeBirthday, employeeIdCard, employeeSalary,
                employeePhone, employeeEmail, employeeAddress, positionId, educationDegreeId, divisionId, userName, status);
        Map<String, String> errMap = employeeService.edit(employee);

        if (errEmployeeSalary != null) {
            errMap.put("errEmployeeSalary", errEmployeeSalary);
        }
        if (errMap.isEmpty()) {
            response.sendRedirect("/Employee");
        } else {

            request.setAttribute("positionList", employeeService.getAllPosition());
            request.setAttribute("divisionList", employeeService.getAllDivision());
            request.setAttribute("educationDegreeList", employeeService.getAllEducationDegree());
            request.setAttribute("userList", employeeService.getAllUser());

            request.setAttribute("employee_id", employeeId);
            request.setAttribute("employee_name", employeeName);
            request.setAttribute("employee_birthday", employeeBirthday);
            request.setAttribute("employee_id_card", employeeIdCard);
            request.setAttribute("employee_salary", employeeSalary);
            request.setAttribute("employee_phone", employeePhone);
            request.setAttribute("employee_email", employeeEmail);
            request.setAttribute("employee_address", employeeAddress);
            request.setAttribute("position_id", positionId);
            request.setAttribute("education_degree_id", educationDegreeId);
            request.setAttribute("division_id", divisionId);
            request.setAttribute("user_name", userName);
            request.setAttribute("status", status);

            request.setAttribute("errMap", errMap);

            request.getRequestDispatcher("employee/edit.jsp").forward(request, response);
        }

    }


// check try catch khi có người muốn sửa dữ liệu trong f12


//        private void editEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Integer employeeId = Integer.valueOf(request.getParameter("employee_id"));
//        String employeeName = request.getParameter("employee_name");
//        String employeeBirthday = request.getParameter("employee_birthday");
//        String employeeIdCard = request.getParameter("employee_id_card");
//
//        double employeeSalary = 0;
//        String errEmployeeSalary = null;
//        try {
//          employeeSalary = Double.parseDouble(request.getParameter("employee_salary"));
//        } catch (NumberFormatException e) {
//            errEmployeeSalary = "không được để trống";
//        }
//
//        String employeePhone = request.getParameter("employee_phone");
//        String employeeEmail = request.getParameter("employee_email");
//        String employeeAddress = request.getParameter("employee_address");
//
//        Integer positionId = 0;
//        String errPositionId = null;
//        try {
//            positionId = Integer.parseInt(request.getParameter("position_id"));
//        } catch (NumberFormatException e) {
//            errPositionId = "nhập đúng theo định dạng";
//        }
//        Integer educationDegreeId = 0;
//        String errEducationDegreeId = null;
//        try {
//            educationDegreeId = Integer.parseInt(request.getParameter("education_degree_id"));
//        } catch (NumberFormatException e) {
//            errEducationDegreeId = "";
//        }
//        Integer divisionId = 0;
//        String errDivisionId = null;
//        try {
//            divisionId = Integer.parseInt(request.getParameter("division_id"));
//        } catch (NumberFormatException e) {
//            errDivisionId = "";
//        }
//        String userName = request.getParameter("user_name");
//
//        Employee employee = new Employee(employeeId, employeeName, employeeBirthday, employeeIdCard, employeeSalary, employeePhone, employeeEmail,
//                employeeAddress, positionId, educationDegreeId, divisionId, userName);
//
//
//        Map<String, String> errMap = employeeService.edit(employee);
//        if (errEmployeeSalary != null) {
//            errMap.put("errEmployeeSalary", errEmployeeSalary);
//        }
//        if (errPositionId != null) {
//            errMap.put("errPositionId", errPositionId);
//        }
//        if (errEducationDegreeId != null) {
//            errMap.put("errEducationDegreeId", errEducationDegreeId);
//        }
//        if (errDivisionId != null) {
//            errMap.put("errDivisionId", errDivisionId);
//        }
//        if (errMap.isEmpty()) {
//            response.sendRedirect("/Employee");
//        } else {
//            request.setAttribute("positionList", employeeService.getAllPosition());
//            request.setAttribute("divisionList", employeeService.getAllDivision());
//            request.setAttribute("educationDegreeList",  employeeService.getAllEducationDegree());
//            request.setAttribute("userList", employeeService.getAllUser());
//
//            request.setAttribute("employee_id", employeeId);
//            request.setAttribute("employee_name", employeeName);
//            request.setAttribute("employee_birthday", employeeBirthday);
//            request.setAttribute("employee_id_card", employeeIdCard);
//            request.setAttribute("employee_salary", employeeSalary);
//            request.setAttribute("employee_phone", employeePhone);
//            request.setAttribute("employee_email", employeeEmail);
//            request.setAttribute("employee_address", employeeAddress);
//            request.setAttribute("position_id", positionId);
//            request.setAttribute("education_degree_id", educationDegreeId);
//            request.setAttribute("division_id", divisionId);
//            request.setAttribute("user_name", userName);
//            request.setAttribute("errMap", errMap);
//
//            request.getRequestDispatcher("employee/edit.jsp").forward(request, response);
//
//        }
//    }

}
