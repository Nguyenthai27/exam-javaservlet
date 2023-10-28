package com.example.examjavaservlet.util;

import com.example.examjavaservlet.dao.impl.EmployeeDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fullname = request.getParameter("fullname");
        String birthday = request.getParameter("birthday");
        String address = request.getParameter("address");
        String position = request.getParameter("position");
        String department = request.getParameter("department");
        EmployeeServlet newEmployee = new EmployeeServlet(fullname, birthday, address, position, department);
        try {
            EmployeeDAOImpl.insertEmployee(newEmployee);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        response.sendRedirect("/Assignment_Exam_war_exploded/list");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee.jsp");
        dispatcher.forward(request, response);

    }
}
