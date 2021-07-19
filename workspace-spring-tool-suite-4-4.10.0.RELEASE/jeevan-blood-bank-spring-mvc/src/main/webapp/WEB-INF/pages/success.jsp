<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p style="display:flex; justify-content: center; color:blue">One Record with following details added</p>
<h2 style="color: chartreuse;
    display: flex;
    justify-content: center;">
<c:out value="${command}" />
</h2>
</body>
</html>