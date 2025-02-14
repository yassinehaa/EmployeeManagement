package org.example.employeemanagement.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.employeemanagement.dao.Persondao;
import org.example.employeemanagement.model.Person;

import java.io.IOException;

@WebServlet("/create")
public class Create extends HttpServlet {
    private Persondao persondao;

    @Override
    public void init() {
        persondao = new Persondao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/FormP.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String poste = request.getParameter("poste");
        int salaire = Integer.parseInt(request.getParameter("salaire"));

        Person person = new Person(name, prenom, email, poste, salaire);
        persondao.createPerson(person);
        response.sendRedirect(request.getContextPath() + "/read");
    }
}