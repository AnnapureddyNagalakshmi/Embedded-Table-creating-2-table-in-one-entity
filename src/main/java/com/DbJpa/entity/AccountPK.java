package com.DbJpa.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class AccountPK implements Serializable{

	private Integer accId;
	private String accType;
	private String holderName;
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getHolderName() {
		return holderName;
	}
	public AccountPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public AccountPK(Integer accId, String accType, String holderName) {
		super();
		this.accId = accId;
		this.accType = accType;
		this.holderName = holderName;
	}
	
}
