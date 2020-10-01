<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
	<div>
		<label>Email</label>
		<input type="email" name="email">
	</div>
	<div>
		<label>Password</label>
		<input type="password" name="password">
	</div>
	<div>
		<input type="submit" value="Login">
	</div>
<a href="register.jsp">Register</a>

</form>
<h5>${msg}</h5>
</body>
</html>