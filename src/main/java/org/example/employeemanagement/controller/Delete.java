package org.example.employeemanagement.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.employeemanagement.dao.Persondao;

import java.io.IOException;

@WebServlet("/delete")
public class Delete extends HttpServlet {
    private Persondao persondao;

    @Override
    public void init() {
        persondao = new Persondao();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        persondao.deletePerson(id);
        response.sendRedirect(request.getContextPath() + "/read");
    }
}