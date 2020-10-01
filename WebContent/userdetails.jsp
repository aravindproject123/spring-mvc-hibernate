<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveUserData" method="post">
		<div>
			<label for="appName">Application Name</label>
			<input type="text" name="appName">
		</div>
		<div>
			<label for="userName">User Name</label>
			<input type="text" name="userName">
		</div>
		<div>
			<label for="email">Email</label>
			<input type="email" name="email">
		</div>
		<div>
			<label for="password">Password</label>
			<input type="password" name="password">
		</div>

		<div>
			<input type="submit" value="save">
		</div>
	</form>

</body>
</html>