<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Hospital Management</title>
<!-- <link rel="stylesheet" href="style.css"> -->
<!---we had linked our css file----->


<c:url value="/css/Sample.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" >


<%-- <c:url value="/css/Sample.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" > --%>
<%-- <link rel="stylesheet" type="text/css" href="<html:rewrite page="style.css"/>">
<style type="text/css">
<link type="text/css" rel="stylesheet" href="<c:url value="style.css" />" />
@import url("style.css"); 
</style> --%>
</head>
<body>
	<div class="full-page">
		<div class="navbar">

			<nav>
				<ul id='MenuItems'>
					<li><a href='home'>Home</a></li>
					<li><a href="receptionL">Receptionist</a></li>
					<li><a href="adminLoginPage">Admin Login</a></li>
					<li><a href='#'>Contact</a></li>
					<li><button class='loginbtn'
							onclick="document.getElementById('login-form').style.display='block'"
							style="width: auto;">Login</button></li>
				</ul>
			</nav>
		</div>
		<div id='login-form' class='login-page'>
			<div class="form-box">
				<div class='button-box'>
					<div id='btn'></div>
					<button type='button' onclick='login()' class='toggle-btn'>Log
						In</button>
					<button type='button' onclick='register()' class='toggle-btn'>Register</button>
				</div>
				<form id='login' class='input-group-login' action="loginDoctorurl">
					<input type='text' class='input-field' placeholder='DoctorId'
					name="doctorId"	required > <input type='password' class='input-field'
						placeholder='Enter Password'name="password" required> <input
						type='checkbox' class='check-box'><span>Remember
						Password</span>
					<button type='submit' class='submit-btn'>Log in</button>
				</form>
				<form id='register' class='input-group-register' action="saveDoctor">
					<input type='text' class='input-field' placeholder='Name' name="name"
						required > <input type='text' class='input-field'
						placeholder='DoctorId' name="doctorId" required> <input type='text'
						class='input-field' placeholder='Specialist' name="specialist" required> <input type='password'
						class='input-field' placeholder='Enter Password' name="password" required>
					<input type='password' class='input-field'
						placeholder='Confirm Password' required>
					<button type='submit' class='submit-btn'>Register</button>
				</form>
			</div>
		</div>
	</div>
	<script>
        var x=document.getElementById('login');
		var y=document.getElementById('register');
		var z=document.getElementById('btn');
		function register()
		{
			x.style.left='-400px';
			y.style.left='50px';
			z.style.left='110px';
		}
		function login()
		{
			x.style.left='50px';
			y.style.left='450px';
			z.style.left='0px';
		}
	</script>
	<script>
        var modal = document.getElementById('login-form');
        window.onclick = function(event) 
        {
            if (event.target == modal) 
            {
                modal.style.display = "none";
            }
        }
    </script>
</body>
</html>