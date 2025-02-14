package org.example.employeemanagement.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.employeemanagement.dao.Persondao;
import org.example.employeemanagement.model.Person;

import java.io.IOException;
import java.util.List;

@WebServlet("/read")
public class Read extends HttpServlet {
    private Persondao persondao;

    @Override
    public void init() {
        persondao = new Persondao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Person> Listp = persondao.getAllPersons();
        request.setAttribute("ListP", Listp);
        request.getRequestDispatcher("/WEB-INF/ListP.jsp").forward(request, response);
    }
}