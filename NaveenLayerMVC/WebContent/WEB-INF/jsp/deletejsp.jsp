<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> deleted record</h3>
<table border="3" width="100%">
	<tr align="justify" background="red">
		<th>SID</th>
		<th>SNAME</th>
		<th>ADDRESS</th>
	</tr>
	<tr align="justify">
		<!-- id is object not collection object  that why 
			<c:forEach> is not applicable -->
		<td>${id.sid }</td>
		<td>${id.sname }</td>
		<td>${id.addrs }</td>
	</tr>
</table>
</body>
</html>