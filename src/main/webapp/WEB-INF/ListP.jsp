<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Employee List</title>
    <!-- Add Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h1>Employee List</h1>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Prenom</th>
            <th>Email</th>
            <th>Poste</th>
            <th>Salaire</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="person" items="${ListP}">
            <tr>
                <td>${person.id}</td>
                <td>${person.nom}</td>
                <td>${person.prenom}</td>
                <td>${person.email}</td>
                <td>${person.poste}</td>
                <td>${person.salaire}</td>
                <td>
                    <a href="update?id=${person.id}" class="btn btn-warning btn-sm">Edit</a>
                    <form action="delete" method="post" style="display:inline;">
                        <input type="hidden" name="id" value="${person.id}">
                        <button type="submit" class="btn btn-danger btn-sm">Delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="create" class="btn btn-success">Add New Employee</a>
</div>
</body>
</html>
