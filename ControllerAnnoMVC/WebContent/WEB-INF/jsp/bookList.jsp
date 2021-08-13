<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2" width="100%">
		<caption>List Of Book records</caption>
		<tr bgcolor="yellow" style="color: maroon;">
			<th>BOOK ID</th>
			<th>BOOKK NAME</th>
			<th>PRICE</th>
			<th>PUBLISHER ID</th>
			<th>PUBLISHER NAME</th>
		</tr>
		<c:forEach items="${list}" var="row">
			<tr align="center" bgcolor="linen" bordercolor="green" style="color: purple;display: table-caption;">
				<td>${row.bookId}</td>
				<td>${row.bookName}</td>
				<td>${row.price}</td>
				<td>${row.publisher.publisherId}</td>
				<td>${row.publisher.publisherName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>