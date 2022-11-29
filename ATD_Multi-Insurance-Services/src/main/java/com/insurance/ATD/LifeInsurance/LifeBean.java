package com.insurance.ATD.LifeInsurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name="lifebean")

public class LifeBean {
	@Id
	@Column(name="fullname")
	String fullName;
	@Column(name="age")
	String age;
	@Column(name="dob")
	String dob;
	@Column(name="permanentAddress")
	String permanentAddress;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	
	

}
