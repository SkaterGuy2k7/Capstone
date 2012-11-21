package capstone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the INSPECTION database table.
 * 
 */
@Entity
public class Inspection implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int inspectid;

	private String belts;

	private String brakefluid;

	private String brakeline;

	private String cabinfilter;

	private String cataconv;

	private String coolfluid;

	@Temporal(TemporalType.DATE)
	private Date dateoi;

	private String difffluid;

	private String enginefilter;

	private String exhclamhang;

	private String exlights;

	private String fuelfilter;

	private String gaskets;

	private String horn;

	private String hoses;

	private String inlights;

	private String muffpipes;

	private String notes;

	private String steerfluid;

	private String tpress;

	private String tranfluid;

	private String washfluid;

	private String wipeblades;

	@Column(name = "VECHID")
	private int vechid;

	public Inspection() {
	}

	public int getInspectid() {
		return this.inspectid;
	}

	public void setInspectid(int inspectid) {
		this.inspectid = inspectid;
	}

	public String getBelts() {
		return this.belts;
	}

	public void setBelts(String belts) {
		this.belts = belts;
	}

	public String getBrakefluid() {
		return this.brakefluid;
	}

	public void setBrakefluid(String brakefluid) {
		this.brakefluid = brakefluid;
	}

	public String getBrakeline() {
		return this.brakeline;
	}

	public void setBrakeline(String brakeline) {
		this.brakeline = brakeline;
	}

	public String getCabinfilter() {
		return this.cabinfilter;
	}

	public void setCabinfilter(String cabinfilter) {
		this.cabinfilter = cabinfilter;
	}

	public String getCataconv() {
		return this.cataconv;
	}

	public void setCataconv(String cataconv) {
		this.cataconv = cataconv;
	}

	public String getCoolfluid() {
		return this.coolfluid;
	}

	public void setCoolfluid(String coolfluid) {
		this.coolfluid = coolfluid;
	}

	public Date getDateoi() {
		return this.dateoi;
	}

	public void setDateoi(Date dateoi) {
		this.dateoi = dateoi;
	}

	public String getDifffluid() {
		return this.difffluid;
	}

	public void setDifffluid(String difffluid) {
		this.difffluid = difffluid;
	}

	public String getEnginefilter() {
		return this.enginefilter;
	}

	public void setEnginefilter(String enginefilter) {
		this.enginefilter = enginefilter;
	}

	public String getExhclamhang() {
		return this.exhclamhang;
	}

	public void setExhclamhang(String exhclamhang) {
		this.exhclamhang = exhclamhang;
	}

	public String getExlights() {
		return this.exlights;
	}

	public void setExlights(String exlights) {
		this.exlights = exlights;
	}

	public String getFuelfilter() {
		return this.fuelfilter;
	}

	public void setFuelfilter(String fuelfilter) {
		this.fuelfilter = fuelfilter;
	}

	public String getGaskets() {
		return this.gaskets;
	}

	public void setGaskets(String gaskets) {
		this.gaskets = gaskets;
	}

	public String getHorn() {
		return this.horn;
	}

	public void setHorn(String horn) {
		this.horn = horn;
	}

	public String getHoses() {
		return this.hoses;
	}

	public void setHoses(String hoses) {
		this.hoses = hoses;
	}

	public String getInlights() {
		return this.inlights;
	}

	public void setInlights(String inlights) {
		this.inlights = inlights;
	}

	public String getMuffpipes() {
		return this.muffpipes;
	}

	public void setMuffpipes(String muffpipes) {
		this.muffpipes = muffpipes;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getSteerfluid() {
		return this.steerfluid;
	}

	public void setSteerfluid(String steerfluid) {
		this.steerfluid = steerfluid;
	}

	public String getTpress() {
		return this.tpress;
	}

	public void setTpress(String tpress) {
		this.tpress = tpress;
	}

	public String getTranfluid() {
		return this.tranfluid;
	}

	public void setTranfluid(String tranfluid) {
		this.tranfluid = tranfluid;
	}

	public String getWashfluid() {
		return this.washfluid;
	}

	public void setWashfluid(String washfluid) {
		this.washfluid = washfluid;
	}

	public String getWipeblades() {
		return this.wipeblades;
	}

	public void setWipeblades(String wipeblades) {
		this.wipeblades = wipeblades;
	}

	public int getVechid() {
		return vechid;
	}

	public void setVechid(int vechid) {
		this.vechid = vechid;
	}
}