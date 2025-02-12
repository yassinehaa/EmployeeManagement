package org.example.employeemanagement.controller;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/read")
public class Read extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    public Read() {
        super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    String message = "salut";
    request.setAttribute("message", message);
        this.getServletContext().getRequestDispatcher("/WEB-INF/List.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {}

    public void destroy() {
    }
}