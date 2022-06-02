package controller;

import model.Student;
import service.IStudentService;
import service.iplm.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentController", urlPatterns = "/Student")
public class StudentController extends HttpServlet {
    private IStudentService iStudentService = new StudentService();
    List<Student> students = iStudentService.getAllStudent();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
//            request.getRequestDispatcher("create.jsp").forward(request,response);
                response.sendRedirect("create.jsp");
                break;
            case "update":
                response.sendRedirect("update.jsp");
//                int codeStudentUpdate = Integer.parseInt(request.getParameter("codeStudent"));
//                for (Student student : students) {
//                    if (student.getCodeStudent() == codeStudentUpdate) {
//                        request.setAttribute("codeStudent", student.getCodeStudent());
//                        request.setAttribute("nameStudent", student.getNameStudent());
//                        request.setAttribute("point", student.getPoint());
//                        request.setAttribute("gender", student.getGender());
//                        request.getRequestDispatcher("update.jsp").forward(request, response);
//                    }
//                }
                break;
            default:
                request.setAttribute("listStudent", students);
                request.getRequestDispatcher("list.jsp").forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createStudent(request, response);
                break;
            case "update":
                updateStudent(request, response);
                break;
            case "delete":
                break;
        }
    }




    private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer codeStudent1 = Integer.valueOf(request.getParameter("codeStudent"));
        String nameStudent1 = request.getParameter("nameStudent");
        Double point1 = Double.valueOf(request.getParameter("point"));
        Integer gender1 = Integer.valueOf(request.getParameter("gender"));

        iStudentService.updateById(codeStudent1, nameStudent1, point1, gender1);
        response.sendRedirect("/Student");
    }

    private void createStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer codeStudent = Integer.valueOf(request.getParameter("codeStudent"));
        String nameStudent = request.getParameter("nameStudent");
        Double point = Double.valueOf(request.getParameter("point"));
        Integer gender = Integer.valueOf(request.getParameter("gender"));
        Student student = new Student(codeStudent, nameStudent, point, gender);
        this.iStudentService.save(student);
        response.sendRedirect("/Student");
    }
}