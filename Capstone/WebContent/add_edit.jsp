<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Add/Edit</title>
</head>
<body>
	<div id="logo">
		<img src="ASASLogo.png" />
	</div>

	<h3 align="center">Profile | Settings</h3>

	<div id=box>
		<form action="MechanicServlet" method="post">
			<table>
				<tr>
					<th colspan="2">Vechicle Info</th>
				</tr>
				<tr>
					<td>Make</td>
					<td><input type="text" name="vehicleMake"
						value="${vehicle.make}" /></td>
				</tr>
				<tr>
					<td>Model</td>
					<td><input type="text" name="vehicleMake"
						value="${vehicle.make}" /></td>
				</tr>
				<tr>
					<td>Colour</td>
					<td><input type="text" name="vehicleMake"
						value="${vehicle.make}" /></td>
				</tr>
				<tr>
					<td>Year</td>
					<td><input type="text" name="vehicleMake"
						value="${vehicle.make}" /></td>
				</tr>
				<tr>
					<td>VIN</td>
					<td><input type="text" name="vehicleMake"
						value="${vehicle.make}" /></td>
				</tr>
				<tr>
					<td>Plate</td>
					<td><input type="text" name="vehicleMake"
						value="${vehicle.make}" /></td>
				</tr>
				<tr>
					<td>Class</td>
					<td><input type="text" name="vehicleMake"
						value="${vehicle.make}" /></td>
				</tr>
				<tr>
					<td>Odometer</td>
					<td><input type="text" name="vehicleMake"
						value="${vehicle.make}" /></td>
				</tr>
				<tr>
					<td><input type="submit" name="changeVehicle"
						value="Add/Edit Vehicle" /></td>
				</tr>
			</table>
		</form>
	</div>
	<a href="Login.xhtml"/>Login Page</a>
</body>
</html>