package com.insurance.ATD.ChildInsurance;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ChildBean")
public class ChildBean {
	@Id
	@Column(name= "PolicyNumber")
	private int PolicyNumber;
	@Column(name="FullName")
	private String FullName;
	@Column(name="Age")
	private int Age;
	@Column(name="PolicyAmount")
	private int PolicyAmount;
	@Column(name="Tenure")
	private int Tenure;
	@Column(name="Percentage")
	private int Percentage;
	public int getPolicyNumber() {
		return PolicyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		PolicyNumber = policyNumber;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getPolicyAmount() {
		return PolicyAmount;
	}
	public void setPolicyAmount(int policyAmount) {
		PolicyAmount = policyAmount;
	}
	public int getTenure() {
		return Tenure;
	}
	public void setTenure(int tenure) {
		Tenure = tenure;
	}
	public int getPercentage() {
		return Percentage;
	}
	public void setPercentage(int percentage) {
		Percentage = percentage;
	}
	@Override
	public String toString() {
		return "ChildBean [PolicyNumber=" + PolicyNumber + ", FullName=" + FullName + ", Age=" + Age + ", PolicyAmount="
				+ PolicyAmount + ", Tenure=" + Tenure + ", Percentage=" + Percentage + "]";
	}
	
	
}

