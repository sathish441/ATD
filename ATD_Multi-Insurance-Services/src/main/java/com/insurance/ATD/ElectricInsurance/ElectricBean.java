package com.insurance.ATD.ElectricInsurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ElectricBean")
public class ElectricBean {
	@Id
	@Column(name = "meternumber")
	private int meternumber;
	@Column(name="Materials")
	private String Materials;
	@Column(name="amount")
	private int amount;
	@Column(name="Tenure")
	private int Tenure;
	public int getMeternumber() {
		return meternumber;
	}
	public void setMeternumber(int meternumber) {
		this.meternumber = meternumber;
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
