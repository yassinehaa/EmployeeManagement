package org.example.employeemanagement.controller;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.employeemanagement.dao.Persondao;
import org.example.employeemanagement.model.Person;

@WebServlet("/create")
public class Create extends HttpServlet {
    private Persondao persondao;
    @Override
    public void init() {persondao = new Persondao();}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("/WEB-INF/FormP.jsp").forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");
        String tel = request.getParameter("tel");

        Person person = new Person(name, age, address, tel);
        persondao.createPerson(person);
    }
}