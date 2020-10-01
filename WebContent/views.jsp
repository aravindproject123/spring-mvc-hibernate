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
<table border="1" >
	<thead>
		<tr>
			<th><h4> SI No.</h4> </th>
			<th><h4>Application Name</h4></th>
			<th><h4>Email</h4></th>
			<th><h4>User Name</h4></th>
			<th><h4>Password</h4></th>
		</tr>
	</thead>
	<tbody>
 			<tr>
 				<td><h4>${list.get(0).id}</h4> </td>
 				<td><h4>${list.get(0).appName}</h4></td>
 				<td><h4>${list.get(0).email}</h4></td>
 				<td><h4>${list.get(0).userName}</h4></td>
 				<td><h4>${list.get(0).password}</h4></td>
 			</tr>
	</tbody>
	
</table>
</body>
</html>