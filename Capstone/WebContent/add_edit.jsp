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
						value="${vehicle.getMake()}" /></td><span class="error">${errors.makeError}</span>
				</tr>
				<tr>
					<td>Model</td>
					<td><input type="text" name="vehicleModel"
						value="${vehicle.getModel()}" /></td><span class="error">${errors.modelError}</span>
				</tr>
				<tr>
					<td>Color</td>
					<td><input type="text" name="vehicleColor"
						value="${vehicle.getColor()}" /></td><span class="error">${errors.colorError}</span>
				</tr>
				<tr>
					<td>Year</td>
					<td><input type="text" name="vehicleYear"
						value="${vehicle.getCarYear()}" /></td><span class="error">${errors.carYearError}</span>
				</tr>
				<tr>
					<td>Engine</td>
					<td><select name="engineType" value="${vehicle.getEngine()}">
							<option value="Select engine">Select Engine</option>
							<option value="4 Cylinder">4 Cylinder</option>
							<option value="V6">V6</option>
							<option value="V8">V8</option>
							<option value="V10">V10</option>
							<option value="V12">V12</option>
							<option value="Diesel">Diesel</option>
					</select></td><span class="error">${errors.engineError}</span>
				</tr>
				<tr>
					<td>VIN</td>
					<td><input type="text" name="vehicleVIN"
						value="${vehicle.getVin()}" /></td><span class="error">${errors.vinError}</span>
				</tr>
				<tr>
					<td>Plate</td>
					<td><input type="text" name="vehiclePlate"
						value="${vehicle.getPlate()}" /></td><span class="error">${errors.plateError}</span>
				</tr>
				<tr>
					<td>Class</td>
					<td><input type="text" name="vehicleClass"
						value="${vehicle.getCarClass()}" /></td><span class="error">${errors.carClassError}</span>
				</tr>
				<tr>
					<td>Odometer</td>
					<td><input type="text" name="vehicleOdometer"
						value="${vehicle.getOdometer()}" /></td><span class="error">${errors.odoError}</span>
				</tr>
				<tr>
					<td>Date of Last Change</td>
					<td><input type="text" name="DateOfChange"
						value="${vehicle.getDateolc()}" /></td><span class="error">${errors.docError}</span>
				</tr>
				<tr>
					<td>Transmission</td>
					<td><select name="transmissionType" value="${vehicle.getTranny()}">
							<option name="Select transmission">Select Transmission</option>
							<option name="Manual" value="Manual">Manual</option>
							<option value="auto">Automatic</option>
					</select></td><span class="error">${errors.trannyError}</span>
				</tr>
				<tr>
					<td>Oil Type</td>
					<td><input type="text" name="oilType"
						value="${vehicle.getOilType()}" /></td><span class="error">${errors.oilTypeError}</span>
				</tr>
				<tr>
					<td><input style="width:120px" type="submit" name="changeVehicle"
						value="Add/Edit Vehicle" /></td>
				</tr>
			</table>
		</form>
	</div>
	<a href="Login.xhtml" />Login Page
	</a>
</body>
</html>