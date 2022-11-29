package com.insurance.ATD.VehicleInsurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VehicleBean")
public class VehicleBean {

	@Id
	@GeneratedValue	
	@Column(name = "PolicyHolderNumber")
	private int PolicyHolderNumber;
	
	@Column(name = "PolicyHolderName")
	private String PolicyHolderName;
	
	@Column(name = "Age")
	private int Age;

	@Column(name = "DrivingLicenseId")
	private String DrivingLicenseId;

	@Column(name = "Address")
	private String Address;

	@Column(name = "PolicyAmount")
	private long PolicyAmount;

	@Column(name = "Tenure")
	private int Tenure;

	@Column(name = "Percentage")
	private int Percentage;

	public String getPolicyHolderName() {
		return PolicyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		PolicyHolderName = policyHolderName;
	}

	public String getDrivingLicenseId() {
		return DrivingLicenseId;
	}

	public void setDrivingLicenseId(String drivingLicenseId) {
		DrivingLicenseId = drivingLicenseId;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public long getPolicyAmount() {
		return PolicyAmount;
	}

	public void setPolicyAmount(long policyAmount) {
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

}
