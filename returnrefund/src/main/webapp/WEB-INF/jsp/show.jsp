<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="../css/bootstrap.min.css">
<title>Orders</title>
</head>
<body bgcolor="#B2EBF2">
<table border="1px">
<tr>
<th>OderNo</th>
<th>ProductName</th>
<th>PurchaseDate</th>
</tr>
<a:forEach items="${ord}" var="ordr">
<tr>
 <td>${ordr.id}</td>
<td>${ordr.name}</td>
<td>${ordr.date}</td>
<td><a href="mod3132/${ordr.id}"/>Returns/Refund</td>
</tr>
</a:forEach>
</table>
</body>
</html>