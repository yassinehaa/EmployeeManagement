package org.example.employeemanagement.model;

public class Person {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String poste;
    private int salaire;

    public Person(String nom, String prenom, String email, String poste, int salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.poste = poste;
        this.salaire = salaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}