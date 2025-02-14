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
    <h2 class="text-center mb-4">Mise a jour d'une personne</h2>

    <form action="update" method="post">
        <input type="hidden" name="id" value="${Person.id}" />

        <div class="form-group">

            <input type="text" class="form-control" name="name" value="${Person.name}" required />
        </div>

        <div class="form-group">

        <input type="text" class="form-control" name="prenom" value="${Person.prenom}" required />
    </div>

        <div class="form-group">

            <input type="text" class="form-control" name="email" value="${Person.email}" required />
        </div>

        <div class="form-group">

            <input type="text" class="form-control" name="poste" value="${Person.poste}" required />
        </div>

        <div class="form-group">

            <input type="number" class="form-control" name="tel" value="${Person.salaire}" required />
        </div>

        <button type="submit" class="btn btn-primary btn-block">mettre a jour</button>
    </form>

    <br>
    <a href="ListP.jsp" class="btn btn-secondary">Back to Person List</a>
</div>

</body>
</html>
