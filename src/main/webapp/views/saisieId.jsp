<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="add-author" method="post">
    <label for="id">ID :</label>
    <input type="text" id="id" name="id"><br><br>
    
    <label for="nom">Nom :</label>
    <input type="text" id="nom" name="nom"><br><br>
    
    <label for="yearBorn">Année de naissance :</label>
    <input type="number" id="yearBorn" name="yearBorn"><br><br>
    
    <input type="submit" value="Envoyer">
</form>

</body>
</html>