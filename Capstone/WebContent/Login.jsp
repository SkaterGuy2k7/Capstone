<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Grease Monkey Login Page</title>

</head>

<body>
	<form action="MechanicServlet" method="post">
		<div style="float: right; padding-right: 45px">
			<h2>Login</h2>
		</div>
		<div style="float: right; clear: both">
			User Name:<input type="text" name="userName"
				style="width: 100px; height: 20px" />
		</div>
		<br />
		<div style="float: right; clear: both; padding-top: 5px">
			Password:<input type="password" name="password"
				style="width: 100px; height: 20px" />
		</div>
		<div style="float: right; clear: both; padding-top: 5px">
			<span class="error">${error}</span> <input type="submit"
				name="submit" value="Login" />
		</div>
	</form>

	
	<img src="greaseMonkey.gif" />
	
	<div>
		<br /> <br />
		<hr />
	</div>
	<div style="float: right">
		<a href="register.jsp">Register New User</a>
	</div>
	<br />
	<div align="center">
		<h2>Welcome to Grease Monkey</h2>


		<h2>Our Mission:</h2> To have a simple way to know what's going on with your vehicle.
		<h3>Who We Are!</h3>
		<h4>ASAS Industries</h4>
		<h3>What We Do!</h3>
		<h4>ASAS Grease Monkey</h4>
	</div>
	
	<img src="ASASLogo.png" />
</body>
</html>