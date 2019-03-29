<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<style><%@include file="/CSS/style.css"%></style>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login form</title>
	
</head>

<body>
	<center>
	<h1> Laughter Club</h1>
				<form method="post" action="LoginProcess">
			<table border="1" align="center">
				<tr>
					<td>User Name</td><td> <input type="text" name="uname" size="45"></td>
				</tr>
				<tr>
					<td>Password </td><td> <input type="password" name="password" size="45"></td>
				</tr>
			</table><br/>
			<input type="submit" value="LOGIN">
		</form>
		<li><a href="Registration.jsp">Registration</a>
		
</body>
</html>
