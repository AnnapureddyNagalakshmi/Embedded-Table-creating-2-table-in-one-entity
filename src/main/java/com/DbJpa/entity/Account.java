package com.DbJpa.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Bank_Account")
public class Account {
	private String branchName;
	private Double minBal;
	@EmbeddedId
	private AccountPK accPk;
	@Override
	public String toString() {
		return "Account [branchName=" + branchName + ", minBal=" + minBal + "]";
	}
	public Account(String branchName, Double minBal, AccountPK accPk) {
		super();
		this.branchName = branchName;
		this.minBal = minBal;
		this.accPk = accPk;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Double getMinBal() {
		return minBal;
	}
	public void setMinBal(Double minBal) {
		this.minBal = minBal;
	}
	public AccountPK getAccPk() {
		return accPk;
	}
	public void setAccPk(AccountPK accPk) {
		this.accPk = accPk;
	}
	

}
