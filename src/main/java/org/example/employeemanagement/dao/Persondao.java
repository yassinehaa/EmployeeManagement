package org.example.employeemanagement.dao;


import org.example.employeemanagement.model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Persondao {
    private Connection connection;

    public Persondao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employeemanagement", "root", "");

            if (this.connection == null) {
                throw new SQLException("Failed to establish database connection!");
            }

            try (Statement statement = connection.createStatement()) {
                String createTableSQL = "CREATE TABLE IF NOT EXISTS person (" +
                        "id INT AUTO_INCREMENT PRIMARY KEY, " +
                        "nom VARCHAR(100) NOT NULL, " +
                        "prenom VARCHAR(100) NOT NULL, " +
                        "email VARCHAR(255) NOT NULL, " +
                        "poste VARCHAR(100) NOT NULL, " +
                        "salaire INT NOT NULL" +
                        ");";

                statement.executeUpdate(createTableSQL);
                System.out.println("Table 'person' created successfully");
            }

        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Database connection error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void createPerson(Person person) {
        if (connection == null) {
            System.err.println("Database connection is not initialized!");
            return;
        }

        String query = "INSERT INTO person (nom, prenom, email, poste, salaire) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, person.getNom());
            stmt.setString(2, person.getPrenom());
            stmt.setString(3, person.getEmail());
            stmt.setString(4, person.getPoste());
            stmt.setInt(5, person.getSalaire());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error inserting person: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Person> getAllPersons() {
        List<Person> personList = new ArrayList<>();
        if (connection == null) {
            System.err.println("Database connection is not initialized!");
            return personList;
        }

        String query = "SELECT * FROM person";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Person person = new Person(
                        rs.getString("nom"),
                        rs.getString("prenom"),
                        rs.getString("email"),
                        rs.getString("poste"),
                        rs.getInt("salaire")
                );
                person.setId(rs.getInt("id"));
                personList.add(person);
            }
        } catch (SQLException e) {
            System.err.println("Error fetching persons: " + e.getMessage());
            e.printStackTrace();
        }
        return personList;
    }

    public Person getPersonById(int id) {
        if (connection == null) {
            System.err.println("Database connection is not initialized!");
            return null;
        }

        Person person = null;
        String query = "SELECT * FROM person WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    person = new Person(
                            rs.getString("nom"),
                            rs.getString("prenom"),
                            rs.getString("email"),
                            rs.getString("poste"),
                            rs.getInt("salaire")
                    );
                    person.setId(rs.getInt("id"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching person by ID: " + e.getMessage());
            e.printStackTrace();
        }
        return person;
    }

    public void updatePerson(Person person) {
        if (connection == null) {
            System.err.println("Database connection is not initialized!");
            return;
        }

        String query = "UPDATE person SET nom = ?, prenom = ?, email = ?, poste = ?, salaire = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, person.getNom());
            stmt.setString(2, person.getPrenom());
            stmt.setString(3, person.getEmail());
            stmt.setString(4, person.getPoste());
            stmt.setInt(5, person.getSalaire());
            stmt.setInt(6, person.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error updating person: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void deletePerson(int id) {
        if (connection == null) {
            System.err.println("Database connection is not initialized!");
            return;
        }

        String query = "DELETE FROM person WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error deleting person: " + e.getMessage());
            e.printStackTrace();
        }
    }
}