<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Web Application</title>
</head>
<body>
<h1 style="text-align: center;">Welcome to Gandhi Library</h1>
<h2 style="text-align: center;"><% out.println(request.getAttribute("city")); %></h2>


<p>
<% out.println(request.getAttribute("srch")); %>
</p>
</body>
</html>