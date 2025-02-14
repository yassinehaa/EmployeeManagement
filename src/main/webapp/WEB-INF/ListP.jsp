<%@ page import="org.example.employeemanagement.model.Person" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Liste des Personnes</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">Liste des personnes</h2>

    <table class="table table-bordered table-striped">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Prenom</th>
            <th>Email</th>
            <th>Poste</th>
            <th>Salaire</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<Person> personList = (List<Person>) request.getAttribute("ListP");

            for (Person person : personList) {
        %>
        <tr>
            <td><%= person.getId() %></td>
            <td><%= person.getNom() %></td>
            <td><%= person.getPrenom() %></td>
            <td><%= person.getEmail() %></td>
            <td><%= person.getPoste() %></td>
            <td><%= person.getSalaire() %></td>
            <td>
                <a href="updatePerson?id=<%= person.getId() %>" class="btn btn-warning btn-sm">Edit</a>
                <form action="deletePerson" method="post" style="display:inline;">
                    <input type="hidden" name="id" value="<%= person.getId() %>" />
                    <input type="submit" value="Delete" class="btn btn-danger btn-sm" />
                </form>
            </td>
        </tr>
        <%

            }
        %>
        </tbody>
    </table>

    <a href="create" class="btn btn-success">Creer une nouvelle personne</a>
</div>


</body>
</html>
