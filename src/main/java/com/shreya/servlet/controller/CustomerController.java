package com.shreya.servlet.controller;

import com.shreya.servlet.service.CustomerService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class CustomerController extends HttpServlet {
    private final CustomerService customerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("--------------- inside the doGet() method ---------------");

        String name = request.getParameter("name");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>" + customerService.greet(name) + "</h1>");
        writer.println("</body></html>");
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException {
        System.out.println("--------------- inside the service() method ---------------");
        super.service(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("--------------- inside the destroy() method ---------------");
    }
}


