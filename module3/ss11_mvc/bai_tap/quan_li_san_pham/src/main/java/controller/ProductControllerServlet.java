package controller;


import model.Product;
import service.IProductService;
import service.iplm.ProductServiceIplm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductControllerServlet", urlPatterns = "/Product")
public class ProductControllerServlet extends HttpServlet {
    IProductService productService = new ProductServiceIplm();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
               RequestDispatcher dispatcher;
                request.getRequestDispatcher("product/create.jsp").forward(request,response);
                break;
            case "edit":
                showFormEdit(request,response);
                break;
            default:
                showListProduct(request, response);
                break;
        }

    }





    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.valueOf(request.getParameter("id"));
        Product product=this.productService.findById(id);
        request.setAttribute("product",product);
        try {
            request.getRequestDispatcher("product/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showListProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = productService.getAllProduct();
        request.setAttribute("products", products);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
                createProduct(request, response);
                break;
            case "edit":
                editProduct(request, response);
                break;
            default:
                break;
        }

    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Double prince = Double.valueOf(request.getParameter("prince"));
        String describe = request.getParameter("describe");
        String manufacturer = request.getParameter("manufacturer");
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;

        if (product == null) {
            dispatcher = request.getRequestDispatcher("error.jsp");
        } else {
            product.setName(name);
            product.setPrince(prince);
            product.setDescribe(describe);
            product.setManufacturer(manufacturer);
            this.productService.edit(id, product);
            request.setAttribute("product", product);
            request.setAttribute("message", "Customer information was updated");
            dispatcher = request.getRequestDispatcher("product/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.valueOf(request.getParameter("id"));
        String name = request.getParameter("name");
        Double prince = Double.valueOf(request.getParameter("prince"));
        String describe = request.getParameter("describe");
        String manufacturer = request.getParameter("manufacturer");

        Product product = new Product(id,name, prince, describe, manufacturer);

        this.productService.save(product);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
