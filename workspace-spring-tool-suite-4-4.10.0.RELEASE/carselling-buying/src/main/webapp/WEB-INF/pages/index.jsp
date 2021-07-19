<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
		<style type="text/css">
			div
				{
					display: flex;
					justify-content: space-around;
					font-size: 26px;
				}
			h1	
				{
					display: flex;
					justify-content: center;
				}
		</style>
	</head>
	<body>
		<h1>
			<c:out value="${heading}"/>
		</h1>
		<div>
			<a href="customers">Add Customer</a>
		</div>
		<div>
			<a href="customers/all">View Customer</a>
		</div>
		<div>
			<a href="customers/SearchBrand">View Cars By Brand</a>
		</div>
	</body>
</html>