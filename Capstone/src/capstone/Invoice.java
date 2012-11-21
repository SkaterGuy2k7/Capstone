package capstone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the INVOICE database table.
 * 
 */
@Entity
public class Invoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int invoiceid;

	@Temporal(TemporalType.DATE)
	private Date dateoi;

	private String paymethod;

	private boolean payrecieved;

	private double subtotal;

	@Column(name = "CUSTID")
	private int userid;

	@Column(name = "VECHID")
	private int vechid;

	public Invoice() {
	}

	public int getInvoiceid() {
		return this.invoiceid;
	}

	public void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
	}

	public Date getDateoi() {
		return this.dateoi;
	}

	public void setDateoi(Date dateoi) {
		this.dateoi = dateoi;
	}

	public String getPaymethod() {
		return this.paymethod;
	}

	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}

	public double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getVechid() {
		return vechid;
	}

	public void setVechid(int vechid) {
		this.vechid = vechid;
	}

	public boolean isPayrecieved() {
		return payrecieved;
	}

	public void setPayrecieved(boolean payrecieved) {
		this.payrecieved = payrecieved;
	}

}