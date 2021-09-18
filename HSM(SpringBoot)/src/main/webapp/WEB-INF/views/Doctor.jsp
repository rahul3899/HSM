<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome ${doctern}
<!-- There is many function Doctor can view all Patient add and delete and update patient -->
<a href="showAllPatient">
<button type="submit">Show All patient</button><br><br></a>
<form action="findPatientById">
<table>
<td><h4>Find Patient by Id</h4></td><td><input type="text" name="id"></td>
<td><button type="submit" >Submit<td>
${patientById.name}

</table>

</form>
<br><br>

</a>
<a href="NewPatient">
<button type="submit">Save new Patient</button>
</a>
</body>
</html>