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
<div>
<img src="ASASLogo.png" />
</div>
<div>
<h2>New User Created</h2>
</div>
<%
	if (session != null) {
		if (session.getAttribute("buttonPressed").equals("createUser")) {
			ArrayList<User> userList = (ArrayList<User>) session
					.getAttribute("statename");
			if (userList != null) {
				for (User users : userList) {
					out.println("User Type: " + users.getUsertype()
							+ " First Name: " + "<b>"
							+ users.getFirstname() + "</b>"
							+ " Last Name: " + users.getLastname()
							+ " User Name: " + users.getUsername());
					out.println("<br />");
				}
			}
		}
	}
%>
<div style="float: center">
<a href="register.xhtml">Register Another User</a>
</div>
</body>
</html>