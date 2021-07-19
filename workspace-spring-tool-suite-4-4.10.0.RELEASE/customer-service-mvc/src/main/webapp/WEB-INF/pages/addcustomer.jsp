<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>RowAdded</p>
<c:out value="${rowAdded}"></c:out>
<form:form method="post" action="customers">

<form:label path="id">Customer Id</form:label>
<form:input path="id"/>

<form:label path="customerName">Customer Name</form:label>
<form:input path="customerName"/>

<form:label path="email">E-mail</form:label>
<form:input path="email"/>

<input type="submit" value="add"/>

</form:form>
</body>
</html>