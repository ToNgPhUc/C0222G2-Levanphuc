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
                showFormCreate(request, response);
                break;
            case "edit":
                showFormEdit(request, response);
                break;
            case "delete":
                showDeleteUser(request, response);

                break;
            default:
                showUserList(request, response);
                break;
        }

    }

    private void showDeleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> userList = userService.getAll();
        int id = Integer.parseInt(request.getParameter("id"));
        for (User user : userList) {
            if (id == user.getId()) {
               request.setAttribute("id",user.getId());
               request.setAttribute("name",user.getName());
               request.setAttribute("email",user.getEmail());
               request.setAttribute("country",user.getCountry());
               request.getRequestDispatcher("user/delete.jsp").forward(request, response);
               break;
            }
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher;
        request.getRequestDispatcher("user/create.jsp").forward(request, response);
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> userList = userService.getAll();
        int id = Integer.parseInt(request.getParameter("id"));
        for (User user : userList) {
            if (user.getId() == id) {
                request.setAttribute("id", user.getId());
                request.setAttribute("name", user.getName());
                request.setAttribute("email", user.getEmail());
                request.setAttribute("country", user.getCountry());
                request.getRequestDispatcher("user/edit.jsp").forward(request, response);
                break;
            }
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
            case "edit":
                editUser(request, response);
                break;
            case "delete":
                int id = Integer.parseInt(request.getParameter("id"));
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String country = request.getParameter("country");
                User user = new User(id, name, email, country);
                userService.deletes(id);
                request.setAttribute("id", id);
                request.setAttribute("name", name);
                request.setAttribute("email", email);
                request.setAttribute("country", country);
                request.getRequestDispatcher("user/delete.jsp").forward(request, response);
                break;
            default:
                break;
        }
    }

    private void editUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(id, name, email, country);
        userService.edit(user);
        request.setAttribute("id", id);
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("country", country);
        request.getRequestDispatcher("user/edit.jsp").forward(request, response);
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
