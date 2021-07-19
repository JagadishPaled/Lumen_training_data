<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
		<style type="text/css">
			h1
				{
					display: flex;
					justify-content: center;
					color:blue;
				}
			.input1 
				{
				  cursor: pointer;
				  border-radius: 20px;
				  box-sizing: border-box;
				  display: inline-block;
				  border: 1px solid #ccc;
				  padding: 12px 2px;
				  margin: 8px 0;
				}
			input	
				{
					padding: 10px 5px;
					cursor: pointer;
				}
			select 
				{
					  cursor: pointer;
					  border-radius: 20px;
					  box-sizing: border-box;
					  display: inline-block;
					  border: 1px solid #ccc;
					  padding: 12px 2px;
					  margin: 8px 0;
				}
			label 
				{
		  			padding: 8px 13px;
				}
		</style>
	</head>
	<body>
		<h1>
			Please Enter Car Details
		</h1>
		<c:out value="${rowAdded}"></c:out>
		<form:form method="post" action="customers">
		
		<form:label path="model">Car model</form:label>
		<form:input class="input1" path="model"/>
		
		<form:label path="current_date">Date</form:label>
		<form:input class="input1" path="current_date"/>
		
		<form:label path="kilometer">Kilometer</form:label>
		<form:input class="input1" path="kilometer"/>
		
		<form:label path="brand">Select Brand</form:label>
		<form:select path="brand" items="${groups}" />
		
		<form:label path="status">Select Status</form:label>
		<form:select path="status" items="${group}" />
		
		<input type="submit" value="addCar"/>
		
		</form:form>
	</body>
</html>