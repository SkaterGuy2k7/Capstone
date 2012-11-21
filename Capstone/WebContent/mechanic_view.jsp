<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Mechanic View</title>
</head>
<body>
	<h1 align="center">LOGO</h1>
	<h3 align="center">Profile | Settings</h3>
	<table align="center" border="1" width="400px">		
		<tr>
			<th>Cust info</th>
			<th>Vehicles</th>
		</tr>
		<tr>
			<td valign="top">
				<table width="200px" height="100px">
					<tr><td>Name</td><td>Test Name</td></tr>	
					<tr><td>Address</td><td>Test Address</td></tr>
					<tr><td>Phone</td><td>Test Phone</td></tr>
				</table>
			</td>
			<td>
				<table  width="400px" height="300px">
					<tr><th>Model</th>
					<th>Colour</th>
					<th>Plate</th>
					<th>Status</th></tr>
					<%
						int count = 6;
						for(int i=0; i < count; i++){
							out.println("<tr><td><a>Test Model "+ i +"</a></td>");
							out.println("<td>Test Colour "+ i +"</td>");
							out.println("<td>Test Plate "+ i +"</td>");
							out.println("<td>Test Status "+ i +"</td></tr>");
						}
					%>
					<form>
						<input type="submit" name="vehicleButton" value="Add Vehicle"/>
					</form>
				</table>				
			</td>
		</tr>	
	</table>	
</body>
</html>