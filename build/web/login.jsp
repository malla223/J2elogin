

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css">
        
    </head>
    <body>
        
        <form action="Myservlet" method="post">
            <h1>Se Connecter</h1>
            <label>UserName : </label><input type="text" name="nom"><br>

            <label>E-mail : </label><input type="email" name="mail"><br>

            <label>Mot de passe : </label><input type="password" name="mtd"><br>

            <button type="submit">Connexion</button>
        </form>
    </body>
</html>
