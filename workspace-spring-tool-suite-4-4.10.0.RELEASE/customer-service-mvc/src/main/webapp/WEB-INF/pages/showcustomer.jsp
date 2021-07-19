<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Customers</title>
<style>
h1{display:flex;justify-content:center;color:chartreuse;animation: move 1s infinite ease-in-out;}
table{
border:2px solid blue;
border-collapse:collapse;
margin-left:auto;
margin-right:auto;
}
tr,th,td{
border:2px solid blue;
}
@keyframes move {
    0% {
      transform: scale(1) rotate(0deg);
    }
    50% {
      transform: scale(1.1) rotate(0.1deg);
    }
  }
</style>
</head>
<body>
<h1>Customer Details</h1>
<table>
<tr>
<th>ID</th>
<th>Customer Name</th>
<th>Email_ID</th>
</tr>
<c:forEach items="${list}" var="eachItem">
<tr>
<td>
<c:out value="${eachItem.id}"></c:out>
</td>
<td>
<c:out value="${eachItem.customerName}"></c:out>
</td>
<td>
<c:out value="${eachItem.email}"></c:out>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>