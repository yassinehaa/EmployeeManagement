<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Employee</title>
    <!-- Add Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h1>Update Employee</h1>
    <form action="update" method="post">
        <input type="hidden" name="id" value="${person.id}">
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" class="form-control" name="nom" value="${person.nom}">
        </div>
        <div class="form-group">
            <label for="prenom">Prenom:</label>
            <input type="text" class="form-control" name="prenom" value="${person.prenom}">
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="text" class="form-control" name="email" value="${person.email}">
        </div>
        <div class="form-group">
            <label for="poste">Poste:</label>
            <input type="text" class="form-control" name="poste" value="${person.poste}">
        </div>
        <div class="form-group">
            <label for="salaire">Salaire:</label>
            <input type="text" class="form-control" name="salaire" value="${person.salaire}">
        </div>
        <button type="submit" class="btn btn-primary">Update</button>
    </form>
</div>
</body>
</html>
