<%@ page import="org.example.employeemanagement.model.Person" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mise a jour Formulaire</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">Update Person</h2>

    <form action="UpdateP.jsp" method="post">
        <input type="hidden" name="id" value="${Person.id}" />

        <div class="form-group">

            <input type="text" class="form-control" name="name" value="${Person.name}" required />
        </div>

        <div class="form-group">

            <input type="number" class="form-control" name="age" value="${Person.age}" required />
        </div>

        <div class="form-group">

            <input type="text" class="form-control" name="address" value="${Person.address}" required />
        </div>

        <div class="form-group">

            <input type="text" class="form-control" name="tel" value="${Person.tel}" required />
        </div>

        <button type="submit" class="btn btn-primary btn-block">Update</button>
    </form>

    <br>
    <a href="ListP.jsp" class="btn btn-secondary">Back to Person List</a>
</div>

</body>
</html>
