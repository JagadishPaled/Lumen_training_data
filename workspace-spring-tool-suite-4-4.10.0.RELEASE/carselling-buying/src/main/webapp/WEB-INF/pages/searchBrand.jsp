<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Select Brand</title>
	</head>
	<body>
	
		<form:form method="post" action="brand">
		
		<form:label path="brand">Please Select Brand </form:label>
		
		<form:select path="brand" items="${totalBrand}"></form:select>
			
		<input type="submit" value="Search">
		
		</form:form>
	
	</body>
</html>