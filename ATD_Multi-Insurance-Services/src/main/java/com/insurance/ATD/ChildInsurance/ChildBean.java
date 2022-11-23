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
	private int policynumber;
	@Column(name="FullName")
	private int fullname;
	@Column(name="Age")
	private int Age;
	@Column(name="PolicyAmount")
	private int policyamount;
	@Column(name="Tenure")
	private int tenure;
	public int getPolicynumber() {
		return policynumber;
	}
	public void setPolicynumber(int policynumber) {
		this.policynumber = policynumber;
	}
	public int getFullname() {
		return fullname;
	}
	public void setFullname(int fullname) {
		this.fullname = fullname;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = Age;
	}
	public int getPolicyamount() {
		return policyamount;
	}
	public void setPolicyamount(int policyamount) {
		this.policyamount = policyamount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	

}

