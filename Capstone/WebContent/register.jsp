<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>Register</title>
</head>
<body>
<div style="float: right">
<img src="greaseMonkey.gif"/>
</div>
<div style="float: left">
	<h2>Register New User/Mechanic</h2>
	</div>
	<div style="clear: both; float:left">
	<form action="MechanicServlet" method="post">
		<table>
			<tr>
				<th colspan="2">Login Information</th>
			</tr>
			<tr>
				<td>User Type:</td>
				<td><select name="userTypeDD">
						<option value="Choose">Choose</option>
						<option value="customer">Customer</option>
						<option value="mechanic">Mechanic</option>
						<option value="persMechanic">Personal Mechanic</option>
				</select></td><span class="error">${errors.typeError}</span>
			</tr>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="userName" id="userName"
					style="width: 125px; height: 25px" /></td><span class="error">${errors.userError}</span>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" id="password"
					style="width: 125px; height: 25px" /></td><span class="error">${errors.passError}</span>
			</tr>
			<tr>
				<td>Retype Password:</td>
				<td><input type="password" name="retypePass" id="retypePass"
					style="width: 125px; height: 25px" /></td><span class="error">${errors.rePass}</span>
			</tr>
			<tr>
				<td>Email Address:</td>
				<td><input type="text" name="emailAddy" id="emailAddy"
					style="width: 200px; height: 25px" /></td><span class="error">${errors.emailError}</span>
			</tr>
			<tr>
				<th colspan="2">User Information</th>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName"
					style="width: 125px; height: 25px" /></td><span class="error">${errors.firstError}</span>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName"
					style="width: 125px; height: 25px" /></td><span class="error">${errors.lastError}</span>
			</tr>
			<tr>
				<td>Address:</td>
				<td><textarea cols="20" rows="2" name="address"></textarea></td><span class="error">${errors.addyError}</span>
			</tr>
			<tr>
				<td>City:</td>
				<td><input type="text" name="city"
					style="width: 125px; height: 25px" /></td><span class="error">${errors.cityError}</span>
			</tr>
			<tr>
				<td>Province:</td>
				<td><select name="province">
						<option value="Choose">Choose</option>
						<option value="Ontario">Ontario</option>
						<option value="Alberta">Alberta</option>
						<option value="British Columbia">British Columbia</option>
						<option value="Manitoba">Manitoba</option>
						<option value="Quebec">Quebec</option>
						<option value="Nova Scotia">Nova Scotia</option>
						<option value="Saskatchewan">Saskatchewan</option>
						<option value="Newfoundland and Labrador">Newfoundland
							and Labrador</option>
						<option value="Yukon">Yukon</option>
						<option value="Prince Edward Island">Prince Edward Island</option>
						<option value="New Brunswick">New Brunswick</option>
				</select></td><span class="error">${errors.provError}</span>
			</tr>
			<tr>
				<td>Postal Code:</td>
				<td><input type="text" name="postalCode"
					style="width: 75px; height: 25px" /></td><span class="error">${errors.postalError}</span>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input type="text" name="phone"
					style="widht: 80px; height: 25px" /></td><span class="error">${errors.phoneError}</span>
			</tr>
			<tr>
				<td>Fax:</td>
				<td><input type="text" name="fax"
					style="widht: 80px; height: 25px" /></td><span class="error">${errors.faxError}</span>
			</tr>
			<tr>
				<td><input type="submit" name="createUser" value="Create User" /></td>
			</tr>

		</table>
	</form>
</div>
</body>
</html>