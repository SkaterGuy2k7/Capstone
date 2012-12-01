package capstone;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MechanicServlet
 */
@WebServlet("/MechanicServlet")
public class MechanicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// String userType, userName, password, retypePass, emailAddy, firstName,
	// lastName, address, city, province, postalCode, phone, fax;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MechanicServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String vechid = request.getParameter("vechid");
		PrintWriter out = response.getWriter();
		try {

			String connectionURL = "jdbc:derby://localhost:1527/sun-appserv-samples;create=true";
			Connection conn = null;
			ResultSet rs;
			conn = DriverManager.getConnection(connectionURL);
			Statement statement = conn.createStatement();
			String sql = "SELECT * FROM Vehicle WHERE vechid=" + vechid;

			rs = statement.executeQuery(sql);

			rs.next();
			Vehicle v = new Vehicle();

			// set rs's to Vehicle v
			v.setVechid(rs.getInt("vechid"));
			v.setUserid(rs.getInt("userid"));
			v.setCarClass(rs.getString("class"));
			v.setCarYear(rs.getString("carYear"));
			v.setMake(rs.getString("make"));
			v.setModel(rs.getString("model"));
			v.setColor(rs.getString("color"));
			v.setVin(rs.getString("vin"));
			v.setPlate(rs.getString("plate"));
			v.setEngine(rs.getString("engine"));
			v.setTranny(rs.getString("tranny"));
			v.setOdometer(rs.getString("odometer"));
			v.setOilType(rs.getString("oilType"));
			v.setDateolc(rs.getString("DateOLC"));
			v.setStatus(rs.getString("status"));

			session.setAttribute("vehicle", v);
			// setDropdowns
			setDropdowns(request, v);
			User u = (User) session.getAttribute("user");

			statement = conn.createStatement();
			sql = "SELECT * FROM Inspection WHERE vechid=" + vechid;

			rs = statement.executeQuery(sql);

			rs.next();
			Inspection i = new Inspection();

			// set rs's to Vehicle v
			i.setVechid(rs.getInt("vechid"));
			i.setInspectid(rs.getInt("inspectid"));
			i.setDateoi(rs.getString("dateoi"));
			i.setNotes(rs.getString("notes"));
			i.setTpress(rs.getString("tpress"));
			i.setCataconv(rs.getString("cataconv"));
			i.setMuffpipes(rs.getString("muffpipes"));
			i.setExhclamhang(rs.getString("exhclamhang"));
			i.setFuelfilter(rs.getString("fuelfilter"));
			i.setEnginefilter(rs.getString("enginefilter"));
			i.setCabinfilter(rs.getString("cabinfilter"));
			i.setBrakeline(rs.getString("brakeline"));
			i.setGaskets(rs.getString("gaskets"));
			i.setHoses(rs.getString("hoses"));
			i.setBelts(rs.getString("belts"));
			i.setWashfluid(rs.getString("washfluid"));
			i.setDifffluid(rs.getString("difffluid"));
			i.setBrakefluid(rs.getString("brakefluid"));
			i.setSteerfluid(rs.getString("steerfluid"));
			i.setCoolfluid(rs.getString("coolfluid"));
			i.setTranfluid(rs.getString("tranfluid"));
			i.setWipeblades(rs.getString("wipeblades"));
			i.setHorn(rs.getString("horn"));
			i.setInlights(rs.getString("inlights"));
			i.setExlights(rs.getString("exlights"));

			session.setAttribute("inspection", i);
			// disable Service button if Customer
			if (u.getUsertype().equals("Cust"))
				session.setAttribute("disabled", "disabled");
			else
				session.setAttribute("disabled", null);
			// NEED TO DO INSPECTIONS

			response.sendRedirect("http://localhost:8080/Capstone/vech_view.jsp");

		} catch (SQLException e) {
			out.println(e.getMessage());
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		session.setAttribute("error", null);
		if (request.getParameter("submit") != null) {
			session.setAttribute("user", null);
			String user = request.getParameter("userName");
			String pass = request.getParameter("password");

			User u = new User();

			try {
				String connectionURL = "jdbc:derby://localhost:1527/sun-appserv-samples;create=true";
				Connection conn = null;
				ResultSet rs;
				conn = DriverManager.getConnection(connectionURL);
				Statement statement = conn.createStatement();

				String sql = "SELECT * FROM Users WHERE userName='" + user
						+ "' AND password='" + pass + "'";

				rs = statement.executeQuery(sql);
				rs.next();

				if (rs.getString("userName").equals(user)
						&& rs.getString("password").equals(pass)) {

					u.setUserid(rs.getInt("userID"));
					u.setFirstname(rs.getString("firstName"));
					u.setLastname(rs.getString("lastName"));
					u.setAddress(rs.getString("address"));
					u.setCity(rs.getString("city"));
					u.setProvince(rs.getString("province"));
					u.setPostal(rs.getString("postal"));
					u.setPhone(rs.getString("phone"));
					u.setFax(rs.getString("fax"));
					u.setEmail(rs.getString("email"));
					u.setUsername(rs.getString("userName"));
					u.setPassword(rs.getString("password"));
					u.setUsertype(rs.getString("userType"));
					sql = "SELECT * FROM Vehicle WHERE userId=" + u.getUserid();
					rs = statement.executeQuery(sql);
					ArrayList<Vehicle> vechList = new ArrayList<Vehicle>();

					while (rs.next()) {
						Vehicle v = new Vehicle();
						v.setVechid(rs.getInt("vechID"));
						v.setUserid(rs.getInt("userID"));
						v.setCarClass(rs.getString("class"));
						v.setCarYear(rs.getString("carYear"));
						v.setMake(rs.getString("make"));
						v.setModel(rs.getString("model"));
						v.setColor(rs.getString("color"));
						v.setVin(rs.getString("vin"));
						v.setPlate(rs.getString("plate"));
						v.setEngine(rs.getString("engine"));
						v.setTranny(rs.getString("Tranny"));
						v.setOdometer(rs.getString("odometer"));
						v.setOilType(rs.getString("oilType"));
						v.setDateolc(rs.getString("DateOLC"));
						v.setStatus(rs.getString("status"));

						vechList.add(v);
					}

					statement.close();
					conn.close();

					session.setAttribute("vehicles", vechList);
					session.setAttribute("user", u);
					response.sendRedirect("http://localhost:8080/Capstone/user_view.jsp");
				} else
					out.println("nopass");

			} catch (ArrayIndexOutOfBoundsException e) {
				response.sendRedirect("http://localhost:8080/Capstone/Login.jsp");
			} catch (IllegalStateException e) {
				out.print(e.getMessage());
			} catch (SQLException e) {
				session.setAttribute("error",
						"Username or password is incorrect!");
				response.sendRedirect("http://localhost:8080/Capstone/Login.jsp");
			}

		} else if (request.getParameter("changeVehicle") != null) {

			Map<String, String> errors = new HashMap<String, String>(10);
			Vehicle newVech = new Vehicle();
			String action = (String) session.getAttribute("action");
			if (action.equals("editVehicle"))
				newVech = (Vehicle) session.getAttribute("vehicle");
			User u = (User) session.getAttribute("user");
			try {

				newVech.setUserid(u.getUserid());
				newVech.setStatus("Y");

				// Validate No Matter What

				// Make Validation
				if (request.getParameter("vehicleMake").equals(""))
					errors.put("makeError",
							"Please fill in the make field.<br/>");
				else if (Pattern.matches("[a-zA-Z]+",
						request.getParameter("vehicleMake")) == false)
					errors.put("makeError", "Please enter a valid make.<br/>");
				else
					newVech.setMake(request.getParameter("vehicleMake"));
				// Model Validation
				if (request.getParameter("vehicleModel").equals(""))
					errors.put("modelError",
							"Please fill in the model field.<br/>");
				else if (Pattern.matches("[a-zA-Z0-9]+",
						request.getParameter("vehicleModel")) == false)
					errors.put("modelError", "Please enter a valid model.<br/>");
				else
					newVech.setModel(request.getParameter("vehicleModel"));
				// Color Validation
				if (request.getParameter("vehicleColor").equals(""))
					errors.put("colorError",
							"Please fill in the color field.<br/>");
				else if (Pattern.matches("[a-zA-Z]+",
						request.getParameter("vehicleColor")) == false)
					errors.put("colorError", "Please enter a valid color.<br/>");
				else
					newVech.setColor(request.getParameter("vehicleColor"));
				// Car Year Validation
				if (request.getParameter("vehicleYear").equals(""))
					errors.put("carYearError",
							"Please fill in the vehicle year field.<br/>");
				else if (Pattern.matches("[a-zA-Z]+",
						request.getParameter("vehicleYear")) == true
						|| request.getParameter("vehicleYear").length() != 4)
					errors.put("carYearError",
							"Please enter a valid vehicle year.<br/>");
				else {
					if (Integer.parseInt(request.getParameter("vehicleYear")) < 1900)
						errors.put("carYearError",
								"Please enter a valid vehicle year.<br/>");
					else
						newVech.setCarYear(request.getParameter("vehicleYear"));
				}
				// Engine Validation
				if (request.getParameter("engineType").equals("Select engine"))
					errors.put("engineError",
							"Please select a value from the engine dropbox.<br/>");
				else
					newVech.setEngine(request.getParameter("engineType"));
				// VIN Validation
				if (request.getParameter("vehicleVIN").equals(""))
					errors.put("vinError", "Please fill in the VIN field.<br/>");
				else
					newVech.setVin(request.getParameter("vehicleVIN"));
				// Plate Validation
				if (request.getParameter("vehiclePlate").equals(""))
					errors.put("plateError",
							"Please fill in the plate field.<br/>");
				else
					newVech.setPlate(request.getParameter("vehiclePlate"));
				// Car Class Validation
				if (request.getParameter("vehicleClass").equals(""))
					errors.put("carClassError",
							"Please fill in the car class field.<br/>");
				else if (Pattern.matches("[a-zA-Z]+",
						request.getParameter("vehicleClass")) == false)
					errors.put("carClassError",
							"Please enter a valid car class.<br/>");
				else
					newVech.setCarClass(request.getParameter("vehicleClass"));
				// Odometer Validation

				if (request.getParameter("vehicleOdometer").equals(""))
					errors.put("odoError",
							"Please fill in the odometer field.<br/>");
				else if (Integer.parseInt(request
						.getParameter("vehicleOdometer")) < 0)
					errors.put("odoError",
							"Please enter a positive number.<br/>");
				else if (Pattern.matches("[0-9]+",
						request.getParameter("vehicleOdometer")) == false)
					errors.put("odoError",
							"Please enter a positive number.<br/>");
				else
					newVech.setOdometer(request.getParameter("vehicleOdometer"));

				// Date of last change Validation
				if (request.getParameter("DateOfChange").equals(""))
					errors.put("docError",
							"Please fill in the date of the vehicle's last oil change.<br/>");
				else {
					SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
					Date doc = new Date();

					doc = df.parse(request.getParameter("DateOfChange"));
					if (df.format(doc).equals(
							request.getParameter("DateOfChange"))) {

						newVech.setDateolc(request.getParameter("DateOfChange"));

					} else {
						errors.put("docError",
								"Please enter the date in the following format: MM/dd/yyyy<br/>");
					}

				}
				// Tranny Validation
				if (request.getParameter("transmissionType").equals(
						"Select transmission"))
					errors.put("trannyError",
							"Please select a transmission.<br/>");
				else
					newVech.setTranny(request.getParameter("transmissionType"));
				// Oil Type Validation
				if (request.getParameter("oilType").equals(""))
					errors.put("oilTypeError", "Please enter an oil type.<br/>");
				else
					newVech.setOilType(request.getParameter("oilType"));

				// END OF VALIDATION

				// SQL stuff
				String connectionURL = "jdbc:derby://localhost:1527/sun-appserv-samples;create=true";
				Connection conn = null;

				conn = DriverManager.getConnection(connectionURL);

				Statement statement = conn.createStatement();

				// If there are errors, go back to add_edit page
				if (!errors.isEmpty()) {
					session.setAttribute("errors", errors);
					int fuck2 = newVech.getVechid();
					session.setAttribute("vehicle", newVech);
					int fuck = newVech.getVechid();
					setDropdowns(request, newVech);
					response.sendRedirect("http://localhost:8080/Capstone/add_edit.jsp");
				} else { // else add vehicle to database and go to user_view
							// page
					session.setAttribute("errors", null);
					// session.setAttribute("vehicle", null);
					if (action.equals("addVehicle")) {

						String sql = "insert into vehicle (userID, class, carYear, make, model, color, vin, plate, engine, tranny, odometer, oilType, DateOLC, status) values("
								+ u.getUserid()
								+ ", '"
								+ newVech.getCarClass()
								+ "', '"
								+ newVech.getCarYear()
								+ "', '"
								+ newVech.getMake()
								+ "', '"
								+ newVech.getModel()
								+ "', '"
								+ newVech.getColor()
								+ "', '"
								+ newVech.getVin()
								+ "', '"
								+ newVech.getPlate()
								+ "', '"
								+ newVech.getEngine()
								+ "', '"
								+ newVech.getTranny()
								+ "', '"
								+ newVech.getOdometer()
								+ "', '"
								+ newVech.getOilType()
								+ "', '"
								+ newVech.getDateolc()
								+ "', '"
								+ newVech.getStatus() + "')";
						statement.executeUpdate(sql);

						session.setAttribute("vehicle", newVech);

					} else if (action.equals("editVehicle")) {
						Vehicle v = (Vehicle) session.getAttribute("vehicle");

						int fuck = v.getVechid();

						// UPDATE Vehicle
						String sql = "UPDATE Vehicle SET class='"
								+ request.getParameter("vehicleClass")
								+ "', carYear='"
								+ request.getParameter("vehicleYear")
								+ "', make='"
								+ request.getParameter("vehicleMake")
								+ "', model='"
								+ request.getParameter("vehicleModel")
								+ "', color='"
								+ request.getParameter("vehicleColor")
								+ "', vin='"
								+ request.getParameter("vehicleVIN")
								+ "', plate='"
								+ request.getParameter("vehiclePlate")
								+ "', engine='"
								+ request.getParameter("engineType")
								+ "', tranny='"
								+ request.getParameter("transmissionType")
								+ "', odometer='"
								+ request.getParameter("vehicleOdometer")
								+ "', oilType='"
								+ request.getParameter("oilType")
								+ "', DateOLC='"
								+ request.getParameter("DateOfChange") + "' "
								+ "WHERE vechID=" + v.getVechid();

						statement.executeUpdate(sql);
					} else
						System.out.println("Mashugana");

					String sql = "SELECT * FROM Vehicle WHERE userId="
							+ u.getUserid();
					ResultSet rs = statement.executeQuery(sql);
					ArrayList<Vehicle> vechList = new ArrayList<Vehicle>();

					while (rs.next()) {
						Vehicle v = new Vehicle();
						v.setVechid(rs.getInt("vechID"));
						v.setUserid(rs.getInt("userID"));
						v.setCarClass(rs.getString("class"));
						v.setCarYear(rs.getString("carYear"));
						v.setMake(rs.getString("make"));
						v.setModel(rs.getString("model"));
						v.setColor(rs.getString("color"));
						v.setVin(rs.getString("vin"));
						v.setPlate(rs.getString("plate"));
						v.setEngine(rs.getString("engine"));
						v.setTranny(rs.getString("Tranny"));
						v.setOdometer(rs.getString("odometer"));
						v.setOilType(rs.getString("oilType"));
						v.setDateolc(rs.getString("DateOLC"));
						v.setStatus(rs.getString("status"));

						vechList.add(v);
					}

					conn.close();
					statement.close();
					session.setAttribute("vehicles", vechList);
					response.sendRedirect("http://localhost:8080/Capstone/user_view.jsp");
				}
			} catch (NullPointerException e) {
				errors.put("nullError", e.getMessage());
				session.setAttribute("errors", errors);
				setDropdowns(request, newVech);
				session.setAttribute("vehicle", newVech);
				response.sendRedirect("http://localhost:8080/Capstone/add_edit.jsp");
			} catch (NumberFormatException e) {
				errors.put("odoError",
						"Please enter a positive odometer number.<br/>");
				session.setAttribute("errors", errors);
				setDropdowns(request, newVech);
				session.setAttribute("vehicle", newVech);
				response.sendRedirect("http://localhost:8080/Capstone/add_edit.jsp");
			} catch (SQLException e) {
				System.out.println(e.getMessage());

			} catch (ParseException e) {
				errors.put("docError",
						"Please enter the date in the following format: MM/dd/yyyy<br/>");
				session.setAttribute("errors", errors);
				session.setAttribute("vehicle", newVech);
				setDropdowns(request, newVech);
				response.sendRedirect("http://localhost:8080/Capstone/add_edit.jsp");
			}

		} else if (request.getParameter("addVehicle") != null) {
			session.setAttribute("vehicle", null);
			session.setAttribute("action", "addVehicle");
			session.setAttribute("errors", null);
			clearDropdowns(request);
			response.sendRedirect("http://localhost:8080/Capstone/add_edit.jsp");

		} else if ((request.getParameter("editVehicle") != null)) {
			session.setAttribute("action", "editVehicle");
			session.setAttribute("errors", null);
			response.sendRedirect("http://localhost:8080/Capstone/add_edit.jsp");

		} else if ((request.getParameter("servVehicle") != null)) {
			response.sendRedirect("http://localhost:8080/Capstone/checkList.jsp");

		} else if ((request.getParameter("checkReset") != null)) {
			response.sendRedirect("http://localhost:8080/Capstone/checkList.jsp");

		} else if ((request.getParameter("checkSubmit") != null)) {
			try {
				String connectionURL = "jdbc:derby://localhost:1527/sun-appserv-samples;create=true";
				Connection conn = null;
				ResultSet rs;
				conn = DriverManager.getConnection(connectionURL);
				Statement statement = conn.createStatement();
				Inspection inspect = setInspection(request);
				Vehicle v = (Vehicle) session.getAttribute("vehicle");

				String sql = "INSERT INTO Inspection(dateoi, notes, tpress, cataconv, muffpipes, exhclamhang, fuelfilter, enginefilter, cabinfilter, brakeline, gaskets, hoses, belts, washfluid, difffluid, brakefluid, steerfluid, coolfluid, tranfluid, wipeblades, horn, inlights, exlights,vechid) VALUES("
						+ "'"
						+ inspect.getDateoi()
						+ "',"
						+ "'"
						+ inspect.getNotes()
						+ "',"
						+ "'"
						+ inspect.getTpress()
						+ "',"
						+ "'"
						+ inspect.getCataconv()
						+ "',"
						+ "'"
						+ inspect.getMuffpipes()
						+ "',"
						+ "'"
						+ inspect.getExhclamhang()
						+ "',"
						+ "'"
						+ inspect.getFuelfilter()
						+ "',"
						+ "'"
						+ inspect.getEnginefilter()
						+ "',"
						+ "'"
						+ inspect.getCabinfilter()
						+ "',"
						+ "'"
						+ inspect.getBrakeline()
						+ "',"
						+ "'"
						+ inspect.getGaskets()
						+ "',"
						+ "'"
						+ inspect.getHoses()
						+ "',"
						+ "'"
						+ inspect.getBelts()
						+ "',"
						+ "'"
						+ inspect.getWashfluid()
						+ "',"
						+ "'"
						+ inspect.getDifffluid()
						+ "',"
						+ "'"
						+ inspect.getBrakefluid()
						+ "',"
						+ "'"
						+ inspect.getSteerfluid()
						+ "',"
						+ "'"
						+ inspect.getCoolfluid()
						+ "',"
						+ "'"
						+ inspect.getTranfluid()
						+ "',"
						+ "'"
						+ inspect.getWipeblades()
						+ "',"
						+ "'"
						+ inspect.getHorn()
						+ "',"
						+ "'"
						+ inspect.getInlights()
						+ "',"
						+ "'"
						+ inspect.getExlights() + "'," + v.getVechid() + ")";
				statement.executeUpdate(sql);
				session.setAttribute("inspection", inspect);
				response.sendRedirect("http://localhost:8080/Capstone/vech_view.jsp");
			} catch (SQLException e) {
				out.print(e.getMessage());
			}

		} else if (request.getParameter("logout") != null) {
			session.setAttribute("user", null);
			response.sendRedirect("http://localhost:8080/Capstone/Login.jsp");
		} else if (request.getParameter("createUser") != null) {
			Map<String, String> userErrors = new HashMap<String, String>(10);
			try {
				String connectionURL = "jdbc:derby://localhost:1527/sun-appserv-samples;create=true";
				Connection conn = null;
				ResultSet rs;
				conn = DriverManager.getConnection(connectionURL);
				Statement statement = conn.createStatement();
				User u = new User();
				String sql = "SELECT * FROM Users";

				rs = statement.executeQuery(sql);
				// Validation for creating user
				while (rs.next()) {
					if (request.getParameter("userTypeDD").equals("Choose")) {
						userErrors.put("typeError",
								"Please choose the customer type");
					} else {
						u.setUsertype(request.getParameter("userTypeDD"));
					}
					if (request.getParameter("userName").equals("")
							&& rs.getString("userName").equals(
									request.getParameter("userName"))) {
						userErrors.put("userError",
								"Please enter a valid User Name");
					} else {
						u.setUsername(request.getParameter("userName"));
					}
					if (request.getParameter("password").equals("")
							&& !request.getParameter("password").equals(
									request.getParameter("retypePass"))) {
						userErrors.put("passError", "Please enter a password");
						userErrors.put("rePass",
								"Please enter a matching password!");
					} else {
						u.setPassword(request.getParameter("password"));
					}
					if (request.getParameter("emailAddy").equals("")) {
						userErrors.put("emailError",
								"Please enter a email address");
					} else if (rs.getString("email").equals(
							request.getParameter("emailAddy"))) {
						userErrors
								.put("errorsSQLEmail",
										"Email already exsists, Please login or use other email address!");
					} else {
						u.setEmail(request.getParameter("emailAddy"));
					}
					if (request.getParameter("firstName").equals("")) {
						userErrors.put("firstError",
								"Please enter your first name");
					} else {
						u.setFirstname(request.getParameter("firstName"));
					}
					if (request.getParameter("lastName").equals("")) {
						userErrors.put("lastError",
								"Please enter your last name");
					} else {
						u.setLastname(request.getParameter("lastName"));
					}
					if (request.getParameter("address").equals("")) {
						userErrors
								.put("addyError", "Please enter your address");
					} else {
						u.setAddress(request.getParameter("address"));
					}
					if (request.getParameter("city").equals("")) {
						userErrors.put("cityError", "Please enter your city");
					} else {
						u.setCity(request.getParameter("city"));
					}
					if (request.getParameter("province").equals("")) {
						userErrors.put("provError",
								"Please enter your province");
					} else {
						u.setProvince(request.getParameter("province"));
					}
					if (request.getParameter("postalCode").equals("")
							&& request.getParameter("postalCode").length() != 6) {
						userErrors.put("postalError",
								"Please enter a valid postal code");
					} else {
						u.setPostal(request.getParameter("postalCode"));
					}
					if (request.getParameter("phone").equals("")
							&& request.getParameter("phone").length() != 10
							&& Pattern.matches("[0-9]+",
									request.getParameter("phone")) == false) {
						userErrors.put("phoneError",
								"Please enter a valid phone Number");
					} else {
						u.setPhone(request.getParameter("phone"));
					}
					if (request.getParameter("fax").length() != 10
							&& Pattern.matches("[0-9]+",
									request.getParameter("fax")) == false) {
						userErrors.put("faxError",
								"please enter a valid fax number");
					} else {
						u.setFax(request.getParameter("fax"));
					}
					if (!userErrors.isEmpty()) {
						request.setAttribute("errors", userErrors);
						response.sendRedirect("register.jsp");
					} else {
						sql = "INSERT INTO Users(firstName, lastName, address, city, province, postal, phone, fax, email, userName, password, userType) VALUES('"
								+ u.getFirstname()
								+ "','"
								+ u.getLastname()
								+ "','"
								+ u.getAddress()
								+ "','"
								+ u.getCity()
								+ "','"
								+ u.getProvince()
								+ "','"
								+ u.getPostal()
								+ "','"
								+ u.getPhone()
								+ "','"
								+ u.getFax()
								+ "','"
								+ u.getEmail()
								+ "','"
								+ u.getUsername()
								+ "','"
								+ u.getPassword()
								+ "','" + u.getUsertype() + "')";
						statement.executeUpdate(sql);
					}

				}
				statement.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

			/*
			 * String firstname, String lastname, String address, String city,
			 * String province, String postal, String phone, String fax, String
			 * email, String username, String password, String usertype
			 */
			session.setAttribute("buttonPressed", "createUser");

			response.sendRedirect("newUser.jsp");

		} else {
			try {
				String connectionURL = "jdbc:derby://localhost:1527/sun-appserv-samples;create=true";
				Connection conn = null;
				ResultSet rs;
				conn = DriverManager.getConnection(connectionURL);
				Statement statement = conn.createStatement();

				Vehicle v = (Vehicle) session.getAttribute("vehicle");

				String sql = "DELETE FROM Vehicle WHERE vechID="
						+ v.getVechid();

				statement.executeUpdate(sql);

				User u = (User) session.getAttribute("user");

				sql = "SELECT * FROM Vehicle WHERE userId=" + u.getUserid();
				rs = statement.executeQuery(sql);
				ArrayList<Vehicle> vechList = new ArrayList<Vehicle>();

				while (rs.next()) {
					v = new Vehicle();
					v.setVechid(rs.getInt("vechID"));
					v.setUserid(rs.getInt("userID"));
					v.setCarClass(rs.getString("class"));
					v.setCarYear(rs.getString("carYear"));
					v.setMake(rs.getString("make"));
					v.setModel(rs.getString("model"));
					v.setColor(rs.getString("color"));
					v.setVin(rs.getString("vin"));
					v.setPlate(rs.getString("plate"));
					v.setEngine(rs.getString("engine"));
					v.setTranny(rs.getString("Tranny"));
					v.setOdometer(rs.getString("odometer"));
					v.setOilType(rs.getString("oilType"));
					v.setDateolc(rs.getString("DateOLC"));
					v.setStatus(rs.getString("status"));

					vechList.add(v);
				}

				statement.close();
				conn.close();
				session.setAttribute("vehicles", vechList);
				response.sendRedirect("http://localhost:8080/Capstone/user_view.jsp");
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private void setDropdowns(HttpServletRequest request, Vehicle v) {
		HttpSession session = request.getSession();
		// Set the dropdowns to proper value
		// Engine
		if (null == v.getEngine())
			clearDropdowns(request);
		else if (v.getEngine().equals("4 Cylinder"))
			session.setAttribute("selectedV4", "selected");
		else if (v.getEngine().equals("V6"))
			session.setAttribute("selectedV6", "selected");
		else if (v.getEngine().equals("V8"))
			session.setAttribute("selectedV8", "selected");
		else if (v.getEngine().equals("V10"))
			session.setAttribute("selectedV10", "selected");
		else if (v.getEngine().equals("V12"))
			session.setAttribute("selectedV12", "selected");
		else if (v.getEngine().equals("Diesel"))
			session.setAttribute("selectedD", "selected");
		// Tranny
		if (null == v.getTranny())
			clearDropdowns(request);
		else if (v.getTranny().equals("Manual"))
			session.setAttribute("selectedM", "selected");
		else if (v.getTranny().equals("auto"))
			session.setAttribute("selectedA", "selected");
	}

	private void clearDropdowns(HttpServletRequest request) {
		HttpSession session = request.getSession();
		// Set the dropdowns to proper value
		// Engine
		session.setAttribute("selectedV4", null);
		session.setAttribute("selectedV6", null);
		session.setAttribute("selectedV8", null);
		session.setAttribute("selectedV10", null);
		session.setAttribute("selectedV12", null);
		session.setAttribute("selectedD", null);
		// Tranny
		session.setAttribute("selectedM", null);
		session.setAttribute("selectedA", null);
	}

	private Inspection setInspection(HttpServletRequest request) {
		Inspection inspect = new Inspection();
		if (null == request.getParameter("extLights")) {
			inspect.setExlights("Y");
		} else if (request.getParameter("extLights").equals("checked")) {
			inspect.setExlights("G");
		} else if (request.getParameter("extLights").equals("damaged")) {
			inspect.setExlights("R");
		}

		if (null == request.getParameter("intLights")) {
			inspect.setInlights("Y");
		} else if (request.getParameter("intLights").equals("checked")) {
			inspect.setInlights("G");
		} else if (request.getParameter("intLights").equals("damaged")) {
			inspect.setInlights("R");
		}

		if (null == request.getParameter("horn")) {
			inspect.setHorn("Y");
		} else if (request.getParameter("horn").equals("checked")) {
			inspect.setHorn("G");
		} else if (request.getParameter("horn").equals("damaged")) {
			inspect.setHorn("R");
		}

		if (null == request.getParameter("wipBlades")) {
			inspect.setWipeblades("Y");
		} else if (request.getParameter("wipBlades").equals("checked")) {
			inspect.setWipeblades("G");
		} else if (request.getParameter("wipBlades").equals("damaged")) {
			inspect.setWipeblades("R");
		}

		if (null == request.getParameter("transFluid")) {
			inspect.setTranfluid("Y");
		} else if (request.getParameter("transFluid").equals("checked")) {
			inspect.setTranfluid("G");
		} else if (request.getParameter("transFluid").equals("damaged")) {
			inspect.setTranfluid("R");
		}

		if (null == request.getParameter("coolFluid")) {
			inspect.setCoolfluid("Y");
		} else if (request.getParameter("coolFluid").equals("checked")) {
			inspect.setCoolfluid("G");
		} else if (request.getParameter("coolFluid").equals("damaged")) {
			inspect.setCoolfluid("R");
		}

		// Check
		if (null == request.getParameter("posFluid")) {
			inspect.setSteerfluid("Y");
		} else if (request.getParameter("posFluid").equals("checked")) {
			inspect.setSteerfluid("G");
		} else if (request.getParameter("posFluid").equals("damaged")) {
			inspect.setSteerfluid("R");
		}

		if (null == request.getParameter("brakFluid")) {
			inspect.setBrakefluid("Y");
		} else if (request.getParameter("brakFluid").equals("checked")) {
			inspect.setBrakefluid("G");
		} else if (request.getParameter("brakFluid").equals("damaged")) {
			inspect.setBrakefluid("R");
		}

		if (null == request.getParameter("diffFluid")) {
			inspect.setDifffluid("Y");
		} else if (request.getParameter("diffFluid").equals("checked")) {
			inspect.setDifffluid("G");
		} else if (request.getParameter("diffFluid").equals("damaged")) {
			inspect.setDifffluid("R");
		}

		if (null == request.getParameter("washFluid")) {
			inspect.setWashfluid("Y");
		} else if (request.getParameter("washFluid").equals("checked")) {
			inspect.setWashfluid("G");
		} else if (request.getParameter("washFluid").equals("damaged")) {
			inspect.setWashfluid("R");
		}

		if (null == request.getParameter("belts")) {
			inspect.setBelts("Y");
		} else if (request.getParameter("belts").equals("checked")) {
			inspect.setBelts("G");
		} else if (request.getParameter("belts").equals("damaged")) {
			inspect.setBelts("R");
		}

		if (null == request.getParameter("hoses")) {
			inspect.setHoses("Y");
		} else if (request.getParameter("hoses").equals("checked")) {
			inspect.setHoses("G");
		} else if (request.getParameter("hoses").equals("damaged")) {
			inspect.setHoses("R");
		}

		if (null == request.getParameter("gasket")) {
			inspect.setGaskets("Y");
		} else if (request.getParameter("gasket").equals("checked")) {
			inspect.setGaskets("G");
		} else if (request.getParameter("gasket").equals("damaged")) {
			inspect.setGaskets("R");
		}

		if (null == request.getParameter("brakLines")) {
			inspect.setBrakeline("Y");
		} else if (request.getParameter("brakLines").equals("checked")) {
			inspect.setBrakeline("G");
		} else if (request.getParameter("brakLines").equals("damaged")) {
			inspect.setBrakeline("R");
		}

		if (null == request.getParameter("cabFilter")) {
			inspect.setCabinfilter("Y");
		} else if (request.getParameter("cabFilter").equals("checked")) {
			inspect.setCabinfilter("G");
		} else if (request.getParameter("cabFilter").equals("damaged")) {
			inspect.setCabinfilter("R");
		}

		if (null == request.getParameter("engAirFilter")) {
			inspect.setEnginefilter("Y");
		} else if (request.getParameter("engAirFilter").equals("checked")) {
			inspect.setEnginefilter("G");
		} else if (request.getParameter("engAirFilter").equals("damaged")) {
			inspect.setEnginefilter("R");
		}

		if (null == request.getParameter("fuelFilter")) {
			inspect.setFuelfilter("Y");
		} else if (request.getParameter("fuelFilter").equals("checked")) {
			inspect.setFuelfilter("G");
		} else if (request.getParameter("fuelFilter").equals("damaged")) {
			inspect.setFuelfilter("R");
		}

		if (null == request.getParameter("exhClamps")) {
			inspect.setExhclamhang("Y");
		} else if (request.getParameter("exhClamps").equals("checked")) {
			inspect.setExhclamhang("G");
		} else if (request.getParameter("exhClamps").equals("damaged")) {
			inspect.setExhclamhang("R");
		}

		if (null == request.getParameter("muffPipes")) {
			inspect.setMuffpipes("Y");
		} else if (request.getParameter("muffPipes").equals("checked")) {
			inspect.setMuffpipes("G");
		} else if (request.getParameter("muffPipes").equals("damaged")) {
			inspect.setMuffpipes("R");
		}

		if (null == request.getParameter("setCataconv")) {
			inspect.setCataconv("Y");
		} else if (request.getParameter("catConv").equals("checked")) {
			inspect.setCataconv("G");
		} else if (request.getParameter("catConv").equals("damaged")) {
			inspect.setCataconv("R");
		}

		if (null == request.getParameter("tirePress")) {
			inspect.setTpress("Y");
		} else if (request.getParameter("tirePress").equals("checked")) {
			inspect.setTpress("G");
		} else if (request.getParameter("tirePress").equals("damaged")) {
			inspect.setTpress("R");
		}

		inspect.setNotes(request.getParameter("miscNotes"));
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date doc = new Date();

		inspect.setDateoi(df.format(doc));

		return inspect;
	}
}
