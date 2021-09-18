<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">Welcome ${receptionkey}</h2>
	<form action="saveAppointment">
		<h2>Add New Appointment</h2>
		<table align="center">
			<tr>
				<td>Appointment Id</td>
				<td><input type="text" name="appointment_id"></td>
			</tr>
			<tr>
				<td>Patient Name</td>
				<td><input type="text" name="patientName"></td>
			</tr>
			<tr>
				<td>Doctor Name</td>
				<td><input type="text" name="doctorName"></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><input type="text" name="date"></td>
			</tr>
			<br>
			<br>
			<tr>
				<td>Prescription</td>
				<td><input type="text" name="prescription"></td>
			</tr>
			<tr>
				<td>Confirm(Yes/No)</td>
				<td><input type="text" name="confirmed"></td>
			</tr>
			<tr>
				<td><input type="Submit" name="submit" value="Submit"
					style="width: 84px; height: 33px" /></td>

				<td><input type="Reset" name="reset" value="Reset"
					style="width: 84px; height: 33px" /></td>
			</tr>

		</table>
	</form>
	
	<form action="findAppointmentById">
<table>
<td><h4>Find Appointment by Id</h4></td><td><input type="text" name="id"></td>
<td><button type="submit" >Submit</button></td>${errorkey}
</table>

</form>
	
	
	<a href="showAllAppoitment">
<button type="submit">Show All Appointments</button><br><br></a>
<h4>${error}</h4>
	
</body>
</html>