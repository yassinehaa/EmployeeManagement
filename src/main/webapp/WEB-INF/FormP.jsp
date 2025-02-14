<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Employee</title>
    <!-- Add Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h1>Create Employee</h1>
    <form action="create" method="post">
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" class="form-control" name="name" id="name">
        </div>
        <div class="form-group">
            <label for="prenom">Prenom:</label>
            <input type="text" class="form-control" name="prenom" id="prenom">
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="text" class="form-control" name="email" id="email">
        </div>
        <div class="form-group">
            <label for="poste">Poste:</label>
            <input type="text" class="form-control" name="poste" id="poste">
        </div>
        <div class="form-group">
            <label for="salaire">Salaire:</label>
            <input type="text" class="form-control" name="salaire" id="salaire">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
