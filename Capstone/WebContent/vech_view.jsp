<%@ page import="capstone.*, java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Vehicle View</title>
<script type="text/javascript">
	function show_confirm() {
		var con = confirm("Are you sure you want to delete this vehicle?");
		if (con == true) {
			document.btnForm.submit();
		} else {

		}
	}
</script>

</head>
<body>
	<div id="logo">
		<img src="ASASLogo.png" />
	</div>
	<div style="float: right">
		<form action="MechanicServlet" method="post">
			<input type="submit" value="Logout" name="logout" />
		</form>
	</div>
	<div id="box">

		<div class="tab">
			<h4>
				<span class="subtitle">Vehicle</span> Info
			</h4>
		</div>
		<div align="center">
			<div align="center">
				<table>
					<tr>
						<td>Vechicle ID</td>
						<td>${ vehicle.getVechid()}</td>
					</tr>
					<tr>
						<td>User ID</td>
						<td>${ vehicle.getUserid()}</td>
					</tr>
					<tr>
						<td>Make</td>
						<td>${ vehicle.getMake()}</td>
					</tr>
					<tr>
						<td>Model</td>
						<td>${ vehicle.getModel()}</td>
					</tr>
					<tr>
						<td>Color</td>
						<td>${ vehicle.getColor()}</td>
					</tr>
					<tr>
						<td>Year</td>
						<td>${ vehicle.getCarYear()}</td>
					</tr>
					<tr>
						<td>Engine</td>
						<td>${ vehicle.getEngine()}</td>
					</tr>
					<tr>
						<td>VIN</td>
						<td>${ vehicle.getVin()}</td>
					</tr>
					<tr>
						<td>Plate</td>
						<td>${ vehicle.getPlate()}</td>
					</tr>
					<tr>
						<td>Class</td>
						<td>${ vehicle.getCarClass()}</td>
					</tr>
					<tr>
						<td>Odometer</td>
						<td>${ vehicle.getOdometer()}</td>
					</tr>
					<tr>
						<td>Date of Last Change</td>
						<td>${ vehicle.getDateolc()}</td>
					</tr>
					<tr>
						<td>Transmission</td>
						<td>${ vehicle.getTranny()}</td>
					</tr>
					<tr>
						<td>Oil Type</td>
						<td>${ vehicle.getOilType()}</td>
					</tr>
				</table>
				<br />
			</div>
		</div>
		<br /> <br />
		<div class="tab">
			<h4>
				<span class="subtitle">Vechicle</span> Service
			</h4>
		</div>
		<div align="center">
			<div id="vechserv" align="center">
				<table>
					<tr>
						<th>Date</th>
						<th>Checklist</th>
					</tr>
					<%
						ArrayList<Inspection> inspects = (ArrayList<Inspection>)session.getAttribute("inspects");
					//if insepcts is not null populate the table
					//else leave empty
						if(null != inspects)
						{
							for(Inspection i : inspects)
							{
								//out.println("<tr><td>"+i.getDateoi()+"</td><td>"+i.get);
							}
						}
					%>
				</table>
			</div>
		</div>
	</div>
	<form name="btnForm" action="MechanicServlet" method="post">
		<center>
			<div>
				<input type="submit" name="editVehicle" value="Edit Vehicle" /> <input
					type="button" onclick="show_confirm()" name="delVehicle"
					value="Delete Vehicle" /> 
					<input type="submit" name="servVehicle" value="Service Vehicle" ${disabled} />
					<input type="submit" name="invoices" value="Invoices" ${disableInv} />
			</div>
		</center>
	</form>
</body>
</html>