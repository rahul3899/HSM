<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="loginurl">
<h1>${errorkey}</h1>
<table align="center">

<tr>
<td>Username</td><td><input type="text" name="userName"></td>
</tr>
<tr>
<td>Password</td><td><input type="password" name="pwd"></td>
</tr>
<tr>
<td><input type="submit" value="submit"></td>
</tr>

</table>





</form>
</body>
</html>