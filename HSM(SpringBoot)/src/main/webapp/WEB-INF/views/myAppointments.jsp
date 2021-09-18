<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr align="center">
<th colspan="7"><h1>Appointments</h1></th></tr>
<tr>
<th>Appointment ID </th>
<th>Patient Name </th>
<th>Doctor Name</th>
<th>Date</th>
<th>Prescription</th>
<th>Confirmed(Yes/No)</th>
</tr>
<%-- <c:forEach items="${AllAppointment}" var="user" > --%>

<tr>
<td>${user.appointment_id}</td>
<td>${user.patientName}</td>
<td>${user.doctorName}</td>
<td>${user.date}</td>
<td>${user.prescription}</td>
<td>${user.confirmed}</td>
</tr>
<%-- </c:forEach> --%>

</table>
</body>
</html>