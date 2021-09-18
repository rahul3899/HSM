<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<style>
/* @import url("style.css");  */
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<tr align="center">
<th colspan="7"><h1>Patient Details</h1></th></tr>
<tr>
<th>Patient Id </th>
<th>Name </th>
<th>Email Id</th>
<th>Gender</th>
<th>Phone Number</th>
<th>Age</th>
<th>Medical History</th>
<th>Address</th>
</tr>
<c:forEach items="${display}" var="user" >
<tr>
<td>${user.id }</td>
<td>${user.name }</td>
<td>${user.emailId }</td>
<td>${user.gender }</td>
<td>${user.phoneNumber}</td>
<td>${user.age}</td>
<td>${user.medicalHistory}</td>
<td>${user.address}</td>
</tr>
</c:forEach>

</table>
</body>
</html>