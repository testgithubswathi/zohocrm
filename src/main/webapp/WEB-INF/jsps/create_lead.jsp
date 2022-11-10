<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create Lead</title>
</head>
<body>
<h2>create Lead.</h2>
<form action="save" method="post">
<pre>
FirstName<input type="text" name="firstName"/>
LastName<input type="text" name="lastName"/>
Email<input type="text" name="email"/>
Mobile<input type="text" name="mobile"/>
Source:
<select name="source">
  <option value="radio">Radio</option>
  <option value="news">News</option>
  <option value="web">Web</option>
  <option value="trade show">Trade Show</option>
</select>
<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>