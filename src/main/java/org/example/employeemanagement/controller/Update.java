package org.example.employeemanagement.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.employeemanagement.dao.Persondao;
import org.example.employeemanagement.model.Person;

import java.io.IOException;

@WebServlet("/update")
public class Update extends HttpServlet {
    private Persondao persondao;

    @Override
    public void init() {
        persondao = new Persondao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Person person = persondao.getPersonById(id);
        request.setAttribute("person", person);
        request.getRequestDispatcher("/WEB-INF/UpdateP.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String poste = request.getParameter("poste");
        int salaire = Integer.parseInt(request.getParameter("salaire"));

        Person person = new Person(nom, prenom, email, poste, salaire);
        person.setId(id);
        persondao.updatePerson(person);

        response.sendRedirect("read");
    }
}