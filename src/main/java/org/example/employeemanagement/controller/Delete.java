package org.example.employeemanagement.controller;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.employeemanagement.dao.Persondao;
import org.example.employeemanagement.model.Person;
import java.util.List;
@WebServlet("/delete")
public class Delete extends HttpServlet{
    private Persondao persondao;
    public void init() {persondao = new Persondao();}
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Persondao persondao = new Persondao();
        persondao.deletePerson(id);
        response.sendRedirect(request.getContextPath()+"/read");
    }

}
