package capstone;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the VEHICLE database table.
 * 
 */
@Entity
public class Vehicle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int vechid;

	@Column(name = "USERID")
	private int userid;

	private String carYear;

	@Column(name = "CLASS")
	private String carClass;

	private String color;

	@Temporal(TemporalType.DATE)
	private Date dateolc;

	private String engine;

	private String make;

	private String model;

	private String odometer;

	private String oilType;

	private String plate;

	private String tranny;

	private String vin;

	public Vehicle() {
	}

	public Vehicle(int userid, String carYear, String carClass, String color,
			Date dateolc, String engine, String make, String model,
			String odometer, String oilType, String plate, String tranny,
			String vin) {
		this.userid = userid;
		this.carYear = carYear;
		this.carClass = carClass;
		this.color = color;
		this.dateolc = dateolc;
		this.engine = engine;
		this.make = make;
		this.model = model;
		this.odometer = odometer;
		this.oilType = oilType;
		this.plate = plate;
		this.tranny = tranny;
		this.vin = vin;
	}

	public int getVechid() {
		return this.vechid;
	}

	public void setVechid(int vechid) {
		this.vechid = vechid;
	}

	public String getCarYear() {
		return this.carYear;
	}

	public void setCarYear(String carYear) {
		this.carYear = carYear;
	}

	public String getCarClass() {
		return this.carClass;
	}

	public void setCarClass(String carClass) {
		this.carClass = carClass;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getDateolc() {
		return this.dateolc;
	}

	public String getStringDateolc() {
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		return df.format(this.dateolc);
	}

	public void setDateolc(Date dateolc) {
		this.dateolc = dateolc;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOdometer() {
		return this.odometer;
	}

	public void setOdometer(String odometer) {
		this.odometer = odometer;
	}

	public String getOilType() {
		return this.oilType;
	}

	public void setOilType(String oilType) {
		this.oilType = oilType;
	}

	public String getPlate() {
		return this.plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getTranny() {
		return this.tranny;
	}

	public void setTranny(String tranny) {
		this.tranny = tranny;
	}

	public String getVin() {
		return this.vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
}