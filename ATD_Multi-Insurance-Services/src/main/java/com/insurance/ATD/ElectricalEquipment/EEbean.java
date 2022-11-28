package com.insurance.ATD.ElectricalEquipment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EEbean")
public class EEbean {
	@Id
    @Column(name="PolicyNumber")
	long PolicyNumber;
	String FullName;
	String Material;
	double PolicyAmount;
	int Tenure;
	
	
	public long getPolicyNumber() {
		return PolicyNumber;
	}
	public void setPolicyNumber(long policyNumber) {
		PolicyNumber = policyNumber;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String material) {
		Material = material;
	}
	public double getPolicyAmount() {
		return PolicyAmount;
	}
	public void setPolicyAmount(double policyAmount) {
		PolicyAmount = policyAmount;
	}
	public int getTenure() {
		return Tenure;
	}
	public void setTenure(int tenure) {
		Tenure = tenure;
	}
	@Override
	public String toString() {
		return "EEbean [PolicyNumber=" + PolicyNumber + ", FullName=" + FullName + ", Material=" + Material
				+ ", PolicyAmount=" + PolicyAmount + ", Tenure=" + Tenure + "]";
	}
	
	
}
