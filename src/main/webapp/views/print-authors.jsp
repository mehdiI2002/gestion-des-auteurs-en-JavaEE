<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import ="org.mql.biblio.models.Author" %>
   <%@page import ="org.mql.biblio.web.actions.Model" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>les test des auteurs</title>
<link rel ="stylesheet" href ="../css/style.css"/>
</head>
<body>
<%
Model model = (Model)request.getAttribute("model");
List<Author> authors =( List<Author>) model.get("authors");
%>
<h1><%=model.get("tittle") %></h1>
<table class="data-grid">
<tr>
<th>id</th>
<th>name</th>
<th>yearBorn</th>
<%
for(Author a : authors){
%>
<tr>
<td><%= a.getId() %></td>
<td><%= a.getName() %></td>
<td><%= a.getYearBorn()%></td>
</tr>
<%
}
%>
</table>

</body>
</html>