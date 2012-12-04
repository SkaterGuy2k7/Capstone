<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<img border="0" src="greaseMonkey.gif" width="150" height="60">
<form>


	<table border="1" width="950" height="30" align="left">

		<tr>

			<td align="center" style="background: blue"><font color="white">Vehicle
					Invoice </font></td>

		</tr>

	</table>
	<br /> <br />


	<div style="width: 50%; position: relative; float: left;">
		<tr>
			<td>
				<h4 style="color: red">ASAS Industry</h4>
				<h5>Address:&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
					&nbsp XXX
			</td>
			</h5>
			<h5>Phone Number:&nbsp &nbsp &nbsp 905-804-1375</h5>
			<h5>Email Address:&nbsp &nbsp &nbsp asas_industry@live.ca</h5>

			<h5>Website: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp</h5>

			<h5>Toll-free Number:1-800-123-345</h5>
			</td>
		</tr>
	</div>

	<div style="width: 49%; position: relative; float: right;">
		<tr>
			<td>
				<h4 style="color: red">Industry Information</h4>
				<h5>
					Mechanic ID: <input style="background: #E0ECF8" type="text"
						size="25" name="mechanicId" value="${invoice.mechanicId}">
				</h5>
				<h5>
					Invoice #:&nbsp &nbsp &nbsp &nbsp<input style="background: #E0ECF8"
						type="text" size="25" name="invoiceNo"
						value="${invoice.invoiceNo}">
				</h5>
				<h5>
					Date:&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<input
						style="background: #E0ECF8" type="text" size="25" name="Date"
						value="${invoice.Date}">
				</h5>

			</td>
		</tr>
	</div>

	<br />



	<table border="1" height="250"></table>
	<div style="width: 50%; position: relative;">
		<table border="1">
			<tr>
				<td width="100" style="background: blue"><font color="white">
						Make </font></td>
				<td width="100" style="background: blue"><font color="white">
						Model</font></td>
				<td width="100" style="background: blue"><font color="white">
						Color</font></td>
				<td width="100" style="background: blue"><font color="white">
						Year</font></td>
				<td width="100" style="background: blue"><font color="white">
						VIN</font></td>
				<td width="100" style="background: blue"><font color="white">
						Plate</font></td>
				<td width="100" style="background: blue"><font color="white">
						BodyStyle</font></td>
				<td width="100" style="background: blue"><font color="white">
						Kilometers(Kms)</font></td>
				<tr>
					<td><input type="text" size="10" value=""></td>
					<td><input type="text" size="10" value=""></td>
					<td><input type="text" size="10" value=""></td>
					<td><input type="text" size="10" value=""></td>
					<td><input type="text" size="10" value=""></td>
					<td><input type="text" size="10" value=""></td>
					<td><input type="text" size="10" value=""></td>
					<td><input type="text" size="10" value=""></td>

				</tr>
		</table>


	</div>



	<table border="1" height="250" width="745">


		<tr>
			<td><h4 style="color: red">
					Oil Service <br />
					<hr></hr>
					<select>
						<option value="Choose">Choose</option>
						<option value="SynHalf">Semi-Synthetic</option>
						<option value="SynFull">Full-Synthetic</option>
						<option value="SynFull">Low-Conventional</option>
						<option value="SynFull">Medium-Conventional</option>
						<option value="SynFull">High-Conventional</option>

					</select> Oil type<input type="text" name="oilType"
						value="${invoice.oilType}" size="25" style="background: #E0ECF8"></input></td>




		</tr>


		<tr>
			<td><h4 style="color: red">Service Parts</h4>
				<hr /> <input type="checkbox" name="vehicle" value="oilFilter">Oil
					Filter<br> <input type="checkbox" name="vehicle" value="viper">Viper<br>
								<input type="checkbox" name="vehicle" value="airFilter">Air
									Filter<br> <input type="checkbox" name="vehicle"
										value="carbonFilter">Carbon Filter<br> <br></br></td>

		</tr>

		<tr>

			<td>Sub Total: <input style="background: #E0ECF8" type="text"
				size="20" name="subTotal" value="${invoice.subTotal}"></input> Tax:
				<input style="background: #E0ECF8" type="text" size="20" name="Tax"
				value="${invoice.Tax}"></input> Total: <input
				style="background: #E0ECF8" type="text" size="20" name="Total"
				value="${invoice.Total}"></input> <input type="submit" width="25"
				value="	  Submit           " />

			</td>

		</tr>






	</table>




</form>
</body>

</html>
