
<head>
<br>
<br>
<br>
<title>Login Page</title>
<style>
body {
  background-image: url('bg.jpg');
}
</style>

</head>
<br>
<br>

<h3 align="center">Login Here</h3>

<body class="hms">
<form action="loginAdmin">
	<table align="center">
	<h1>${errorkey}</h1>
		<tr>
			<td>User Id:</td>
			<td><input type="text" name="username" placeholder="Enter your id"></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" name="password"
				placeholder="Enter Password Here"></td>
		</tr>

		<tr>
			<td><input type="submit" name="submit" value="Login"></td>
			
		</tr>

	</table></form>
</body>
</html>