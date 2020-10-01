<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveRegisterDetails" method="post">

		<div>
			<label>Name</label> <input type="text" name="name">
		</div>
		<div>
			<label>Email</label> <input type="email" name="email">
		</div>

		<div>
			<label>Contact Number</label> <input type="tel" name="contactNumber">
		</div>
		<div>
			<label>Password</label> <input type="password" name="password">
		</div>
		<div>
			<label>City</label> <input type="text" name="city">
		</div>
		<div>
			<label>Country</label> <input type="text" name="country">
		</div>
		<div>
			<label>Pincode</label> <input type="text" name="pinCode">
		</div>

		<div>
			<input type="submit" value="Register">
		</div>

	</form>

</body>
</html>