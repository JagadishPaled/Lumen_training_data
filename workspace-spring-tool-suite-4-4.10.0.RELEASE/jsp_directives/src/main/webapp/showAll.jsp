<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All Books</title>
<style type="text/css">

table{
border: 2px solid blue;
border-collapse: collapse;
margin-left: auto;
margin-right: auto;
}
tr,th,td{
border: 2px solid blue;
}

</style>
</head>
<body>

<%@ include file="menu.html" %>


<h2 style="text-align: center;">Book List</h2>
<table>
<tr>
    <th>Sl.No</th>
    <th>Book Name</th>
</tr>
	<c:forEach items="${requestScope.bookList}" var="eachBook" varStatus="status">
<tr>
    <td><c:out value="${status.index+1}"></c:out></td>
	<td><c:out value="${eachBook}"></c:out></td>
</tr>

	</c:forEach>
</table>
</body>
</html>