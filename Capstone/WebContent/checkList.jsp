<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<form action="MechanicServlet" method="post">
		<table>
			<tr>
				<th>Lighting/Blades</th>
				<th>Checked</th>
				<th>Damaged</th>
			</tr>
			<tr>
				<td>Exterior Lights</td>
				<td class="tdStyle"><input type="radio" name="extLights"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="extLights"
					value="damaged" /></td>
			</tr>
			<tr>
				<td>Interior Lights</td>
				<td class="tdStyle"><input type="radio" name="intLights"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="intLights"
					value="damaged" /></td>
			</tr>
			<tr>
				<td>Horn</td>
				<td class="tdStyle"><input type="radio" name="horn"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="horn"
					value="damaged" /></td>
			</tr>
			<tr>
				<td>Wiper Blades/Operation</td>
				<td class="tdStyle"><input type="radio" name="wipBlades"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="wipBlades"
					value="damaged" /></td>
			</tr>
			<tr>
				<th>Fluids</th>
				<th colspan="2"></th>
			</tr>
			<tr>
				<td>Transmission</td>
				<td class="tdStyle"><input type="radio" name="transFluid"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="transFluid"
					value="damaged" /></td>
			</tr>
			<tr>
				<td>Coolant</td>
				<td class="tdStyle"><input type="radio" name="coolFluid"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="coolFluid"
					value="damaged" /></td>
			</tr>
			<tr>
				<td>Power Steering</td>
				<td class="tdStyle"><input type="radio" name="posFluid"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="posFluid"
					value="damaged" /></td>
			</tr>
			<tr>
				<td>Brake</td>
				<td class="tdStyle"><input type="radio" name="brakFluid"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="brakFluid"
					value="damaged" /></td>
			</tr>
			<tr>
				<td>Differential</td>
				<td class="tdStyle"><input type="radio" name="diffFluid"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="diffFluid"
					value="damaged" /></td>
			</tr>
			<tr>
				<td>Washer Fluid</td>
				<td class="tdStyle"><input type="radio" name="washFluid"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="washFluid"
					value="damaged" /></td>
			</tr>
			<tr>
				<th>Components</th>
				<th colspan="2"></th>
			</tr>
			<tr>
				<td>Belt(s) - Serpintine/PS/AC/Water Pump</td>
				<td class="tdStyle"><input type="radio" name="belts"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="belts"
					value="damaged" /></td>
			</tr>
			<tr>
				<td>Hoses</td>
				<td class="tdStyle"><input type="radio" name="hoses"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="hoses"
					value="damaged" /></td>
			</tr>
			<tr>
				<td>Gaskets</td>
				<td class="tdStyle"><input type="radio" name="gasket"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="gasket"
					value="damaged" /></td>
			</tr>
			<tr>
				<td>Brake Lines</td>
				<td class="tdStyle"><input type="radio" name="brakLines"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="brakLines"
					value="damaged" /></td>
			</tr>
			<tr>
				<th>Filters</th>
				<th colspan="2"></th>
			</tr>
			<tr>
				<td>Cabin Filter</td>
				<td class="tdStyle"><input type="radio" name="cabFilter"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="cabFilter"
					value="damaged" /></td>
			</tr>
			<tr>
				<td>Engine Air Filter</td>
				<td class="tdStyle"><input type="radio" name="engAirFilter"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="engAirFilter"
					value="damaged" /></td>
			</tr>
			<tr>
				<td>Fuel Filter</td>
				<td class="tdStyle"><input type="radio" name="fuelFilter"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="fuelFilter"
					value="damaged" /></td>
			</tr>
			<tr>
				<th>Exhaust</th>
				<th colspan="2"></th>
			</tr>
			<tr>
				<td>Exhaust Clamps/Hangers</td>
				<td class="tdStyle"><input type="radio" name="exhClamps"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="exhClamps"
					value="damaged" /></td>
			</tr>
			<tr>
				<td>Muffler/Pipes</td>
				<td class="tdStyle"><input type="radio" name="muffPipes"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="muffPipes"
					value="damaged" /></td>
			</tr>
			<tr>
				<td>Catalytic Converter</td>
				<td class="tdStyle"><input type="radio" name="catConv"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="catConv"
					value="damaged" /></td>
			</tr>
			<tr>
				<th>Misc</th>
				<th colspan="2"></th>
			</tr>
			<tr>
				<td>Tire Pressure</td>
				<td class="tdStyle"><input type="radio" name="tirePress"
					value="checked" /></td>
				<td class="tdStyle"><input type="radio" name="tirePress"
					value="damaged" /></td>
			</tr>
			<tr>
				<td colspan="3">Notes: <textarea name="miscNotes" cols="75%"
						rows="3"></textarea></td>
			</tr>
		</table>
		<br /> <input type="submit" name="checkSubmit" value="Create Checklist" /><input type="reset"
			value="Reset" name="checkReset" style="width: 100px; height: 25px" />
	</form>
	
</body>
</html>