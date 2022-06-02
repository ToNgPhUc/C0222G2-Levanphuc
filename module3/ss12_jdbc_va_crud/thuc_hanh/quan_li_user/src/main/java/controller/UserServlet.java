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

        String action =request.getParameter("action");
        if (action==null){
            action="";
        }switch (action){
            case "create":
                break;
            default:
                List<User>userList=userService.getAll();
                request.setAttribute("userList",userList);
                RequestDispatcher dispatcher;
                request.getRequestDispatcher("user/list.jsp").forward(request,response);
        }







//        String action = request.getParameter("action");
//        if (action == null) {
//            action = "";
//        }
//        switch (action) {
//            case "create":
//                break;
//            default:
//                List<User> userList = userService.selectAllUsers();
//                request.setAttribute("userList", userList);
//                request.getRequestDispatcher("user/list.jsp").forward(request, response);
//                break;
//        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
