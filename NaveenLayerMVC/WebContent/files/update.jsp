<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert operation</title>
</head>
<body>
	<!--  reading param value and set in the ids variable-->
	<c:set var="ids" value="${param.id}"/>
	<form action="../update">
		<input type="hidden" name="id" value="${ids}"> name:<input
			type="text" name="name"><br> address:<input type="text"
			name="adds"><br> <input type="submit" value="submit"><br>
	</form>
</body>
</html>