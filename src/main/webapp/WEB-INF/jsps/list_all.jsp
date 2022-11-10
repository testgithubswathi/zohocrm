<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List all</title>
</head>
<body>
<a href="viewLeadPage">new Lead</a>
<h2>List all</h2>
<form action="listAll" method="post">
<table>
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>Source</th>
</tr>
<c:forEach var="lead" items="${leads}">
<tr>
<td><a href="leadInfo?id=${lead.id}"> ${lead.firstName}</a></td>
<td>${lead.lastName}</td>
<td>${lead.email}</td>
<td>${lead.mobile}</td>
<td>${lead.source}</td>
</tr>
</c:forEach>
</table>
</form>
</body>
</html>