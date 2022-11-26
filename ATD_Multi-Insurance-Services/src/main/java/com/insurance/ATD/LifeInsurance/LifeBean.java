package com.insurance.ATD.LifeInsurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name="lifebean")

public class LifeBean {
	@Id
	
	@Column(name="policy Type")
	private String policyType;
	@Column(name="policy Amount")
	private int policyAmount;
	@Column(name="tenure")
	private int tenure;
	@Column(name="percentage")
	private int percentage;
	
	

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
