package com.insurance.ATD.VehicleInsurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "VehicleInsuranceBean")
public class VehicleBean {
	
@Id
@Column(name = "policynumber")
private long PolicyNumber;

@Column(name = "policyholdername")
private String PolicyHolderName;

@Column(name = "vehicletype")
private String VehicleType;

@Column(name = "policyamount")
private long PolicyAmount;

@Column(name = "tenure")
private int Tenure;

@Column(name = "percentage")
private int Percentage;

public long getPolicyNumber() {
	return PolicyNumber;
}

public void setPolicyNumber(long policyNumber) {
	this.PolicyNumber = policyNumber;
}

public String getPolicyHolderName() {
	return PolicyHolderName;
}

public void setPolicyHolderName(String policyHolderName) {
	this.PolicyHolderName = policyHolderName;
}

public String getVehicleType() {
	return VehicleType;
}

public void setVehicleType(String vehicleType) {
	this.VehicleType = vehicleType;
}

public long getPolicyAmount() {
	return PolicyAmount;
}

public void setPolicyAmount(long policyAmount) {
	this.PolicyAmount = policyAmount;
}

public int getTenure() {
	return Tenure;
}

public void setTenure(int tenure) {
	this.Tenure = tenure;
}

public int getPercentage() {
	return Percentage;
}

public void setPercentage(int percentage) {
	this.Percentage = percentage;
	
}











	

}
