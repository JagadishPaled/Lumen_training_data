<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add blood Donors</title>
</head>
<body><form:form method="post" action="donors">
<form:label path="phoneNumber">Phone Number</form:label>
<form:input path="phoneNumber"/>
<span style="color: #ff0000"> <form:errors path="phoneNumber"/></span>

<form:label path="firstName">firstName</form:label>
<form:input path="firstName"/>

<form:label path="bloodGroup">Blood group</form:label>
<form:select path="bloodGroup" items="${groups}" />

<input type="submit" value="add">
</form:form>
</body>
</html>