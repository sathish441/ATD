package com.insurance.ATD.EducationInsurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "educationinsurancebean")
public class Educationbean {
	@Id
	@GeneratedValue
	@Column(name = "PolicyNumber")
	private int policynumber;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Amount")
	private String Amount;
	@Column(name = "Tenure")
	private int Tenure;
	@Column(name = "Percentage")
	private int Percentage;

	public int getPercentage() {
		return Percentage;
	}

	public void setPercentage(int percentage) {
		Percentage = percentage;
	}

	public int getPolicynumber() {
		return policynumber;
	}

	public void setPolicynumber(int policynumber) {
		this.policynumber = policynumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}

	public int getTenure() {
		return Tenure;
	}

	public void setTenure(int tenure) {
		Tenure = tenure;
	}

}
