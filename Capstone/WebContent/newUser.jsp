<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page import="capstone.*" language="java"
	import="java.util.*, capstone.*"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>New User Created</title>
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
		<div style="float: right; clear: both">
			<span class="error">${error}</span> <input type="submit"
				name="submit" value="Login" />
		</div>
	</form>

	<img src="ASASLogo.png" />
	<div>
		<br />
		<hr />
	</div>
	<div>
		<h2>New User Created</h2>
	</div>
	<%
		if (session != null) {
			if (session.getAttribute("buttonPressed").equals("createUser")) {
				User userList = (User) session.getAttribute("newUser");
				if (userList != null) {
					out.println(" First Name: " + "<b>"
							+ userList.getFirstname() + "</b>"
							+ " Last Name: " + userList.getLastname()
							+ " User Name: " + userList.getUsername() + "User Type: " + userList.getUsertype());
					out.println("<br />");
				}
			}
		}
	%>
	<div style="float: center">
		<a href="register.jsp">Register Another User</a>
	</div>
</body>
</html>