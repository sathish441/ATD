package com.insurance.ATD.LifeInsurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name="lifebean")

public class LifeBean {
	@Id
	@Column(name="policy Number")
	private int policyNumber;
	@Column(name="full Name")
	private String fullName;

	@Column(name="meterial")
	private String meterial;
	@Column(name="Policy Type")
	private String policyType;
	@Column(name="Policy Amount")
	private int policyAmount;
	@Column(name="tenure")
	private int tenure;
	@Column(name="Percentage")
	private int percentage;
	
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
	public String getpolicyType() {
		return policyType;
	}
	public void setpolicyType(String policyType) {
		this.policyType = policyType;
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
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	

}
