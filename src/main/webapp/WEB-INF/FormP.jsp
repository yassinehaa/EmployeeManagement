<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulaire de creation de personne</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">formulaire de création</h2>
    <form action="create" method="post">
        <div class="form-group">
            <label for="name">Nom:</label>
            <input type="text" class="form-control" id="name" name="name" required />
        </div>
        <div class="form-group">
            <label for="prenom">Prénom:</label>
            <input type="text" class="form-control" id="prenom" name="Prénom" required />
        </div>
        <div class="form-group">
            <label for="Email">Email:</label>
            <input type="text" class="form-control" id="Email" name="Email" required />
        </div>
        <div class="form-group">
            <label for="poste">Poste:</label>
            <input type="text" class="form-control" id="poste" name="poste" required />
        </div>
        <div class="form-group">
            <label for="Salaire">Salaire:</label>
            <input type="number" class="form-control" id="Salaire" name="Salaire" required />
        </div>
        <button type="submit" class="btn btn-primary btn-block">Ajouter</button>
    </form>
</div>

</body>
</html>
