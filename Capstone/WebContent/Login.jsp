<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Home/Login Page</title>

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
		<div style="float: right; clear: both">
			Password:<input type="password" name="password"
				style="width: 100px; height: 20px" />
		</div>
		<div style="float: right; clear: both"><span class="error">${error}</span>
			<input type="submit" name="submit" value="Login" />
		</div>
	</form>

	<img src="ASASLogo.png" />
	<div>
		<br />
		<hr />
	</div>
	<div style="float: right">
		<a href="register.xhtml">Register New User</a>
	</div>
	<center>
		<h2>Welcome to ASAS Industries Maintenance Tracker</h2>



		<div>
			<h2>Our Mission:</h2>
			<h3>Who We Are!</h3>
			<h4>ASAS Industries</h4>
			<h3>What We Do!</h3>
			<h4>ASAS Personal or Commercial Automobile Maintenance Tracker</h4>
		</div>
	</center>
</body>
</html>