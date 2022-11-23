package com.insurance.ATD.HomeInsurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Homebean")
public class Homebean {
	@Id
	@Column(name="PolicyNumber")
	private int PolicyNumber;

	public int getPolicyNumber() {
		return PolicyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		PolicyNumber = policyNumber;
	}
	

}
