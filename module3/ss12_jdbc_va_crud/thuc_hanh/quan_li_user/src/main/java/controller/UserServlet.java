package controller;

import model.User;
import service.IUserService;
import service.iplm.UserServiceIplm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = "/User")
public class UserServlet extends HttpServlet {
    IUserService userService = new UserServiceIplm();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                RequestDispatcher dispatcher;
                request.getRequestDispatcher("user/create.jsp").forward(request, response);
                break;
            default:
                showUserList(request, response);

                break;
        }

    }

    private void showUserList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> userList = userService.getAll();
        request.setAttribute("userList", userList);
        RequestDispatcher dispatcher;
        request.getRequestDispatcher("user/list.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createUser(request, response);
                break;
            default:
                break;
        }
    }

    private void createUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(name, email, country);
        this.userService.save(user);
        response.sendRedirect("user/create.jsp");
    }
}
