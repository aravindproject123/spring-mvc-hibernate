<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<a href="userdetails.jsp">+create</a>
<table border="1" >
	<thead>
		<tr>
			<th>SI No.</th>
			<th>Application Name</th>
			<th>Email</th>
			<th>User Name</th>
			<th>Password</th>
		</tr>
	</thead>
	<tbody>
 		<c:forEach items="${list}" var="app">
 			<tr>
 				<td>${app.id}</td>
 				<td>${app.appName}</td>
 				<td>${app.email}</td>
 				<td>${app.userName}</td>
 				<td>${app.password}
 				<td><a href="view?id=${app.id}">Views</a> </td>
 				<td><a href="update?id=${app.id}">Update</a> </td>
 			</tr>
 		</c:forEach>

	</tbody>
	
</table>
</body>
</html>