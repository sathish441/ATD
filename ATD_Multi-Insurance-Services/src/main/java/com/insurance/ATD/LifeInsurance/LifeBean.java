package com.insurance.ATD.LifeInsurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="LifeBean")
public class LifeBean {
	@Id
	@Column(name="policy Number")
	private int policyNumber;
	@Column(name="full Name")
	private String fullName;
	@Column(name="meterial")
	private String meterial;
	@Column(name="policy Amount")
	private int policyAmount;
	@Column(name="tenure")
	private int tenure;
	
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMeterial() {
		return meterial;
	}
	public void setMeterial(String meterial) {
		this.meterial = meterial;
	}
	public int getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(int policyAmount) {
		this.policyAmount = policyAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
	

}
