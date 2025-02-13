package org.example.employeemanagement.controller;

import java.io.*;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.employeemanagement.dao.Persondao;
import org.example.employeemanagement.model.Person;

@WebServlet("/read")
public class Read extends HttpServlet {
    private Persondao persondao;
    @Override
    public void init() {persondao = new Persondao();}

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Person> Listp = persondao.getAllPersons();
        request.setAttribute("Listp", Listp);
        request.getRequestDispatcher("/WEB-INF/ListP.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {}

    public void destroy() {
    }
}