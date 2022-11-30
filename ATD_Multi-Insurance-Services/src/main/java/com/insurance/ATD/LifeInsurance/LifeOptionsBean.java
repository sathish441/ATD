package com.insurance.ATD.LifeInsurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lifeOptionsBean")
public class LifeOptionsBean {
	@Id
	@Column(name="sno")
	private int sno;
	@Column(name="policyType")
	private String policyType;
	@Column(name="policyAmountPerMonth")
	private String policyAmountPerMonth;
	@Column(name="instalmentProcess")
	private String instalmentProcess;
	@Column(name="policyTenure")
	private String policyTenure;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public String getPolicyAmountPerMonth() {
		return policyAmountPerMonth;
	}
	public void setPolicyAmountPerMonth(String policyAmountPerMonth) {
		this.policyAmountPerMonth = policyAmountPerMonth;
	}
	public String getInstalmentProcess() {
		return instalmentProcess;
	}
	public void setInstalmentProcess(String instalmentProcess) {
		this.instalmentProcess = instalmentProcess;
	}
	public String getPolicyTenure() {
		return policyTenure;
	}
	public void setPolicyTenure(String policyTenure) {
		this.policyTenure = policyTenure;
	}
	@Override
	public String toString() {
		return "policyNumber="+sno+"<br>"+"policyType=" + policyType+"<br>" + "policyAmountPerMonth="
				+ policyAmountPerMonth +"<br>"+ "instalmentProcess=" + instalmentProcess+"<br>" + "policyTenure=" + policyTenure+"<br>"
				+ "<br>";
	}
	
	
}

