
<!DOCTYPE html>
<br>
<br>
<br>


<head>
<title>New Account</title>
<link rel="stylesheet" type="text/css" href="style.css">

</head>
<h1 align="center">Add New Patient</h1>

<body class="hsm">

	<form action="savePatient">
	<table align="center">

		<tr>
			<td>Patient Id</td>
			<td><input type="text" name="id" required /></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" required
				style="width: 158px;" /></td>
		</tr>
		<tr>
			<td>Phone Number</td>
			<td><input type="text" name="phoneNumber" placeholder="810...."
				required /></td>
		</tr>

		<tr>
			<td>Email Id</td>
			<td><input type="text" name="emailId">
		</tr>
		<tr>
			<td>Age</td>
			<td><input type="text" name="age" required></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><input type="text" name="gender" required></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><input type="text" name="address" required /></td>
		</tr>
		<tr>
			<td>Medical History</td>
			<td><input type="text" name="medicalHistory" required /></td>
		</tr>

		<tr>
			<td><input type="Submit" name="submit" value="Submit"
				style="width: 84px; height: 33px" /></td>

			<td><input type="Reset" name="reset" value="Reset"
				style="width: 84px; height: 33px" /></td>
		</tr>


	</table></form>

</body>
</html>