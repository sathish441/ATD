package com.insurance.ATD.HomeInsurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Homecalculation")
public class Homecalculation {
	@Id
	@Column(name="Ageofhouse")
	private int Ageofhouse;
	@Column(name="Housevalue")
	private long Housevalue;
	@Column(name="Claiminterest")
	private float Claiminterest;
	@Column(name="Claimamount")
	private float Claimamount;
	public int getAgeofhouse() {
		return Ageofhouse;
	}
	public void setAgeofhouse(int ageofhouse) {
		Ageofhouse = ageofhouse;
	}
	public long getHousevalue() {
		return Housevalue;
	}
	public void setHousevalue(long housevalue) {
		Housevalue = housevalue;
	}
	public float getClaiminterest() {
		return Claiminterest;
	}
	public void setClaiminterest(float claiminterest) {
		Claiminterest = claiminterest;
	}
	public float getClaimamount() {
		return Claimamount;
	}
	public void setClaimamount(float claimamount) {
		Claimamount = claimamount;
	}
	@Override
	public String toString() {
		return "Homecalculation [Ageofhouse=" + Ageofhouse + ", Housevalue=" + Housevalue + ", Claiminterest="
				+ Claiminterest + ", Claimamount=" + Claimamount + "]";
	}
	

}
