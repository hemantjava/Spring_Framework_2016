<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="3" width="100%">
		<caption>List of All Student Records</caption>
		<hr color="green"/>
		<tr align="center" style="background-color: orange;">
			<th>SID</th>
			<th>SNAME</th>
			<th>ADDRESS</th>
			<th colspan="2">ATERATIONN</th>
		</tr>
		<c:forEach items="${id }" var="val">
			<tr align="center" style="background-color: linen;">
				<td>${val.sid }</td>
				<td>${val.sname }</td>
				<td>${val.addrs }</td>
				<td><a href="delete?id=${val.sid}" style="color: red">delete</a></td>
				<td><a href="files/update.jsp?id=${val.sid}"
					style="color: green">update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>