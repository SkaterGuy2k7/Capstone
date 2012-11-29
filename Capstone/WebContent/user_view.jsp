<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page import="capstone.*, java.util.*" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Mechanic View</title>
</head>
<body>
	<div id="logo">
		<img src="ASASLogo.png" />
	</div>
	<div style="float:right"><form action="MechanicServlet" method="post">
		<input type="submit" value="Logout" name="logout" />
	</form></div>

	

	<div id="box">

		<div align="center">
			<table>
				<tr>
					<th>Cust Info</th>
					<th>Vehicle</th>
				</tr>
				<tr>
					<td valign="top">

						<table class="inTable">
							<tr>
								<td>Name</td>
								<td>${user.getFirstname()} ${user.getLastname()}</td>
							</tr>
							<tr>
								<td>Address</td>
								<td>${user.getAddress()}</td>
							</tr>
							<tr>
								<td>Phone</td>
								<td>${user.getPhone()}</td>
							</tr>
						</table>

					</td>
					<td>

						<table class="inTable">
							<tr>
								<th>Model</th>
								<th>Colour</th>
								<th>Plate</th>
								<th>Status</th>
							</tr>
							<%
								ArrayList<Vehicle> vechList = (ArrayList<Vehicle>) session
										.getAttribute("vehicles");

								if (null != vechList) {
									for (Vehicle v : vechList) {
										out.println("<tr><td><a href=\"http://localhost:8080/Capstone/MechanicServlet?vechid="
												+ v.getVechid()
												+ "\">"
												+ v.getModel()
												+ "</a>"
												+ "</td><td>"
												+ v.getColor()
												+ "</td><td>"
												+ v.getPlate()
												+ "</td><td>"
												+ v.getStatus()
												+ "</td></tr>");
									}
								}
							%>

						</table>
						<form action="MechanicServlet" method="post">
							<input type="submit" name="addVehicle" value="Add Vehicle" />
						</form>
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>