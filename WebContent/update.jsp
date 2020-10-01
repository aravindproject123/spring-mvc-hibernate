<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveTheUpdate/${details.id}" method="post">
<div>
			<label for="id">Application Name</label>
			<input type="text" name="id" value=${ details.id} disabled="disabled">
</div>
		<div>
			<label for="appName">Application Name</label>
			<input type="text" name="appName" value=${ details.appName}>
		</div>
		<div>
			<label for="userName">User Name</label>
			<input type="text" name="userName" value=${ details.userName}>
		</div>
		<div>
			<label for="email">Email</label>
			<input type="email" name="email" value=${ details.email}>
		</div>
		<div>
			<label for="password">Password</label>
			<input type="password" name="password" value=${ details.password}>
		</div>

		<div>
			<input type="submit" value="save">
		</div>
	</form>
</body>
</html>