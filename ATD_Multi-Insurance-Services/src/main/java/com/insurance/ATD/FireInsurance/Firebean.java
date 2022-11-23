package com.insurance.ATD.FireInsurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="fireinsurancebean")
public class Firebean {
	@Id
	@Column(name = "PolicyNumber")
	private int policynumber;
	@Column(name="Materials")
	private String Materials;
	@Column(name="Amount")
	private int amount;
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	@Column(name="Tenure")
	private int Tenure;
	@Column(name="percentage")
	private int percentage;
	
	public int getPolicynumber() {
		return policynumber;
	}
	public void setPolicynumber(int policynumber) {
		this.policynumber = policynumber;
	}
	public String getMaterials() {
		return Materials;
	}
	public void setMaterials(String materials) {
		Materials = materials;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getTenure() {
		return Tenure;
	}
	public void setTenure(int tenure) {
		Tenure = tenure;
	}
	

}
