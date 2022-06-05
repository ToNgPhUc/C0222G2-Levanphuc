package controller;

import model.Customer;
import service.ICustomerService;
import service.iplm.CustomerServiceIplm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerController", value = "/Customer")
public class CustomerController extends HttpServlet {
    ICustomerService iCustomerService = new CustomerServiceIplm();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                request.getRequestDispatcher("customer/create.jsp").forward(request, response);
                break;
            default:
                showCustomerList(request, response);
                break;
        }
    }

    private void showCustomerList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = iCustomerService.getAllCustomer();
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("customer/list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                int customerTypeId = Integer.parseInt(request.getParameter("customer_type_id"));
                String customerName = request.getParameter("customer_name");
                String customerBirthday = request.getParameter("customer_birthday");
                int customerGender = Integer.parseInt(request.getParameter("customer_gender"));
                String customerIdCard = request.getParameter("customer_id_card");
                String customerPhone = request.getParameter("customer_phone");
                String customerEmail = request.getParameter("customer_email");
                String customerAddress = request.getParameter("customer_address");
                Customer customer = new Customer( customerTypeId, customerName, customerBirthday, customerGender, customerIdCard, customerPhone, customerEmail, customerAddress);
                iCustomerService.create(customer);
                response.sendRedirect("customer/create.jsp");
                break;

        }
    }
}
