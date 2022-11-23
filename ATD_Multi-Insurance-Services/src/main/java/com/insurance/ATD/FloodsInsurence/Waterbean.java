package com.insurance.ATD.FloodsInsurence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Waterbean")
public class Waterbean {
	@Id 
	@Column (name="policyNumber")
private int PolicyNumber;
    @Column (name="Meterial")
private String Meterial;
    @Column (name="Amount")
private double Amount;
    @Column (name="Tenure")
 private int Tenure;
@Column(name="percentage")
private int percentage;

public int getPercentage() {
	return percentage;
}

public void setPercentage(int percentage) {
	this.percentage = percentage;
}

public int getPolicyNumber() {
	return PolicyNumber;
}

public void setPolicyNumber(int policyNumber) {
	PolicyNumber = policyNumber;
}

public String getMeterial() {
	return Meterial;
}

public void setMeterial(String meterial) {
	Meterial = meterial;
}

public double getAmount() {
	return Amount;
}

public void setAmount(double amount) {
	Amount = amount;
}

public int getTenure() {
	return Tenure;
}

public void setTenure(int tenure) {
	Tenure = tenure;
}
 
 
}
