package com.insurance.ATD.HotelInsurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HotelBean")
public class HotelBean {
	@Id
	@Column(name= "PolicyNumber")
	private int policynumber;
	@Column(name="FullName")
	private String fullname;
	@Column(name="PolicyAmount")
	private int policyamount;
	@Column(name="Tenure")
	private int tenure;
	@Column(name="Percentage")
	private float percentage;
	public int getPolicynumber() {
		return policynumber;
	}
	public void setPolicynumber(int policynumber) {
		this.policynumber = policynumber;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getPolicyamount() {
		return policyamount;
	}
	public void setPolicyamount(int policyamount) {
		this.policyamount = policyamount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "HotelBean [policynumber=" + policynumber + ", fullname=" + fullname + ", policyamount=" + policyamount
				+ ", tenure=" + tenure + ", percentage=" + percentage + "]";
	}

	}

