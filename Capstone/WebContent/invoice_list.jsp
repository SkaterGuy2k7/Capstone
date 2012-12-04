<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Invoices</title>
</head>
<body>
<div id="logo">
		<img src="greaseMonkey.gif" />
	</div>
	<div style="float: right">
		<form action="MechanicServlet" method="post">
			<input type="submit" value="Logout" name="logout" />
		</form>
	</div>
	<div id="box">

		<div class="tab">
			<h4>
				<span class="subtitle">Invoices</span> 
			</h4>
		</div>
		<div align="center">
			<div align="center">
				<table>
				<th>Invoice #</th>
				<th>Date</th>
				<th>Customer</th>
				<th>Vehicle</th>
				</table>
				<br />
			</div>
		</div>
		<br /> <br />
		
	</div>
</body>
</html>