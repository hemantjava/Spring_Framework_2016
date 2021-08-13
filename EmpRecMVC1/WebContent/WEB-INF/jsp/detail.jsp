<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="4" bgcolor="linen" align="center">
		<tr bgcolor="red">
			<th>name</th>
			<th>id</th>
			<th>date</th>
		</tr>
		<c:forEach var="data" items="${emp}">
			<tr>
				<td>${data.getName()}</td>
				<td>${data.getId()}</td>
				<td>${data.getDate()}</td>
			</tr>
		</c:forEach>
	</table>
	<hr>
	<table border="4" bgcolor="linen">
		<tr bgcolor="yellow">
			<th>name</th>
			<th>id</th>
			<th>date</th>
		</tr>
		<c:forEach var="data" items="${emp}">
			<tr>
				<td>${data.name}</td>
				<td>${data.id}</td>
				<td>${data.date}</td>
			</tr>
		</c:forEach>
	</table><hr>
	<h1>this is example of complete annotaion...</h1><br>
	<h3>@Component</h3><br>
	<h3>@Service</h3><br>
	<h3>@Repository</h3><br>
	<h3>@Autovired</h3><br>

</body>
</html>