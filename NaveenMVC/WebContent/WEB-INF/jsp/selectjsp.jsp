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
	<caption>List of Student is Displayed by Id<hr style="color: green;"></caption>
		<tr align="center" style="background-color: orange;">
			<th>SID</th>
			<th>SNAME</th>
			<th>ADDRESS</th>
			<th colspan="2">ATERATIONN</th>
		</tr>
			<tr align="center" style="background-color:linen;">
				<td>${id.sid }</td>
				<td>${id.sname }</td>
				<td>${id.addrs }</td>
				<td><a href="" style="color: red">delete</a></td>
				<td><a href="" style="color: green">update</a></td>
			</tr>
	</table>
</body>
</html>