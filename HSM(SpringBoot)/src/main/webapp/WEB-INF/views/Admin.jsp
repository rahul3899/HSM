<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--Here admin function that is admin can add delete doctor, patient  -->
	Welcome ${Adminn}
	
	<h2>${success}</h2>
	<h2>${errorkey}</h2>
	
<a href=""></a>

	<form action="deletePatient">
		<table>
			<td><h4>Delete Patient by Id</h4></td>
			<td><input type="text" name="id"></td>
			<td><button type="submit">
					Delete
					<td>
		</table>

	</form>
	<h2>${successs}</h2>
	<h2>${errorkeyy}</h2>
	<form action="deleteDoctor">
		<table>
			<td><h4>Delete Doctor by Id</h4></td>
			<td><input type="text" name="id"></td>
			<td><button type="submit">
					Delete
					<td>
		</table>

	</form>
</body>
</html>
