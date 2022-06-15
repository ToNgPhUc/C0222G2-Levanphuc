package controller.customer;

import model.customer.Customer;
import model.customer.CustomerType;
import service.customer.ICustomerService;
import service.customer.iplm.CustomerServiceIplm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
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
            case "edit":
                showFormEdit(request, response);
            case "delete":
                DeleteCustomer(request, response);
                break;
            case "search":
                searchCustomer(request, response);
                break;
            default:
                showCustomerList(request, response);
                break;
        }
    }

    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String customerSearch = request.getParameter("customerSearch");

        request.setAttribute("customerList", iCustomerService.searchCustomerByName(customerSearch));
        request.setAttribute("customerTypeList", iCustomerService.getAllCustomerType());
        request.setAttribute("customerSearch", customerSearch);
        request.getRequestDispatcher("customer/list.jsp").forward(request, response);


    }

    private void DeleteCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int customerId = Integer.parseInt(request.getParameter("customer_id"));
        iCustomerService.delete(customerId);
        response.sendRedirect("/Customer");
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<CustomerType> customerTypeList = iCustomerService.getAllCustomerType();
        request.setAttribute("customerTypeList", customerTypeList);

        int customerId = Integer.parseInt(request.getParameter("customer_id"));
        Customer customer = iCustomerService.FindById(customerId);

        request.setAttribute("customer_id", customer.getCustomerId());
        request.setAttribute("customer_type_id", customer.getCustomerTypeId());
        request.setAttribute("customer_name", customer.getCustomerName());
        request.setAttribute("customer_birthday", customer.getCustomerBirthday());
        request.setAttribute("customer_gender", customer.getCustomerGender());
        request.setAttribute("customer_id_card", customer.getCustomerIdCard());
        request.setAttribute("customer_phone", customer.getCustomerPhone());
        request.setAttribute("customer_email", customer.getCustomerEmail());
        request.setAttribute("customer_address", customer.getCustomerAddress());
        request.setAttribute("status", customer.getStatus());

        request.getRequestDispatcher("customer/edit.jsp").forward(request, response);

    }


    private void showCustomerList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CustomerType> customerTypeList = iCustomerService.getAllCustomerType();
        request.setAttribute("customerTypeList", customerTypeList);

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
                createCustomer(request, response);
                break;
            case "edit":
                editCustomer(request, response);
                break;
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer customerId = Integer.parseInt(request.getParameter("customer_id"));
        int customerTypeId = Integer.parseInt(request.getParameter("customer_type_id"));
        String customerName = request.getParameter("customer_name");
        String customerBirthday = request.getParameter("customer_birthday");
        int customerGender = Integer.parseInt(request.getParameter("customer_gender"));
        String customerIdCard = request.getParameter("customer_id_card");
        String customerPhone = request.getParameter("customer_phone");
        String customerEmail = request.getParameter("customer_email");
        String customerAddress = request.getParameter("customer_address");
        int status = Integer.parseInt(request.getParameter("status"));

        Customer customer = new Customer(customerId, customerTypeId, customerName, customerBirthday, customerGender, customerIdCard, customerPhone, customerEmail, customerAddress, status);
        iCustomerService.edit(customer);

        List<CustomerType> customerTypeList = iCustomerService.getAllCustomerType();
        request.setAttribute("customerTypeList", customerTypeList);


        request.setAttribute("customer_id", customerId);
        request.setAttribute("customer_type_id", customerTypeId);
        request.setAttribute("customer_name", customerName);
        request.setAttribute("customer_birthday", customerBirthday);
        request.setAttribute("customer_gender", customerGender);
        request.setAttribute("customer_id_card", customerIdCard);
        request.setAttribute("customer_phone", customerPhone);
        request.setAttribute("customer_email", customerEmail);
        request.setAttribute("customer_address", customerAddress);
        request.setAttribute("status", status);

        request.getRequestDispatcher("customer/edit.jsp").forward(request, response);

    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int customerTypeId = Integer.parseInt(request.getParameter("customer_type_id"));
        String customerName = request.getParameter("customer_name");
        String customerBirthday = request.getParameter("customer_birthday");
        int customerGender = Integer.parseInt(request.getParameter("customer_gender"));
        String customerIdCard = request.getParameter("customer_id_card");
        String customerPhone = request.getParameter("customer_phone");
        String customerEmail = request.getParameter("customer_email");
        String customerAddress = request.getParameter("customer_address");
        Customer customer = new Customer(customerTypeId, customerName, customerBirthday, customerGender, customerIdCard, customerPhone, customerEmail, customerAddress);
        iCustomerService.create(customer);

        response.sendRedirect("/Customer");




    }
}
