<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page import="capstone.*, java.util.*" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="style.css" />
<title>CheckList</title>
</head>
<body>
	<div id="logo">
		<img src="greaseMonkey.gif" />
	</div>

	<h2>
		Service Check <span class="subtitle">List</span>
	</h2>	
		<table>
			<tr>
				<th>Lighting/Blades</th>
				<th>Status</th>
			</tr>
			<tr>
				<td>Exterior Lights</td>
				<td colspan="2" bgcolor=${status.exLights}></td>
			</tr>
			<tr>
				<td>Interior Lights</td>
				<td colspan="2" bgcolor=${ status.inLights}></td>
			</tr>
			<tr>
				<td>Horn</td>
				<td colspan="2" bgcolor=${status.horn }></td>
			</tr>
			<tr>
				<td>Wiper Blades/Operation</td>
				<td colspan="2" bgcolor=${status.wipeblades }></td>
			</tr>
			<tr>
				<th>Fluids</th>
				<th colspan="2"></th>
			</tr>
			<tr>
				<td>Transmission</td>
				<td colspan="2" bgcolor=${status.tranfluid }></td>
			</tr>
			<tr>
				<td>Coolant</td>
				<td colspan="2" bgcolor=${status.coolFluid }></td>
			</tr>
			<tr>
				<td>Power Steering</td>
				<td colspan="2" bgcolor=${status.steerFluid }></td>
			</tr>
			<tr>
				<td>Brake</td>
				<td colspan="2" bgcolor=${status.brakeFluid }></td>
			</tr>
			<tr>
				<td>Differential</td>
				<td colspan="2" bgcolor=${status.diffFluid }></td>
			</tr>
			<tr>
				<td>Washer Fluid</td>
				<td colspan="2" bgcolor=${status.washFluid }></td>
			</tr>
			<tr>
				<th>Components</th>
				<th colspan="2"></th>
			</tr>
			<tr>
				<td>Belt(s) - Serpintine/PS/AC/Water Pump</td>
				<td colspan="2" bgcolor=${status.belts }></td>
			</tr>
			<tr>
				<td>Hoses</td>
				<td colspan="2" bgcolor=${status.hoses }></td>
			</tr>
			<tr>
				<td>Gaskets</td>
				<td colspan="2" bgcolor=${status.gaskets }></td>
			</tr>
			<tr>
				<td>Brake Lines</td>
				<td colspan="2" bgcolor=${status.brakeLine }></td>
			</tr>
			<tr>
				<th>Filters</th>
				<th colspan="2"></th>
			</tr>
			<tr>
				<td>Cabin Filter</td>
				<td colspan="2" bgcolor=${status.cabinFilter }></td>
			</tr>
			<tr>
				<td>Engine Air Filter</td>
				<td colspan="2" bgcolor=${status.enginefilter }></td>
			</tr>
			<tr>
				<td>Fuel Filter</td>
				<td colspan="2" bgcolor=${status.fuelfilter }></td>
			</tr>
			<tr>
				<th>Exhaust</th>
				<th colspan="2"></th>
			</tr>
			<tr>
				<td>Exhaust Clamps/Hangers</td>
				<td colspan="2" bgcolor=${status.exhClamHang }></td>
			</tr>
			<tr>
				<td>Muffler/Pipes</td>
				<td colspan="2" bgcolor=${status.muffPipes }></td>
			</tr>
			<tr>
				<td>Catalytic Converter</td>
				<td colspan="2" bgcolor=${status.cataConv }></td>
			</tr>
			<tr>
				<th>Misc</th>
				<th colspan="2"></th>
			</tr>
			<tr>
				<td>Tire Pressure</td>
				<td colspan="2" bgcolor=${status.tPress }></td>
			</tr>
			<tr>
				<td colspan="3">Notes: <textarea name="miscNotes" cols="75%"
						rows="3">${status.notes }</textarea></td>
			</tr>
		</table>
		<br /> 	
	
</body>
</html>