package com.insurance.ATD.LifeInsurance;

import javax.persistence.*;


@Entity
@Table(name="lifeInsurenceBean")
public class LifeBean {
	
	@Id
	@Column(name="Policy Number")
	private int policyNumber;
	@Column(name="Full Name")
	private String fullName;
	@Column(name="Meterial")
	private String meterial;
	@Column(name="Policy Amount")
	private int policyAmount;
	@Column(name="Tenure")
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
