package com.stock.trading.model;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

public class BankDetails {
	
	public BankDetails() {}
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	long id;
	
	@Column(unique = true,nullable = false)
	String accountNo;
	
	@Column(nullable=false)
	String accountHolderName;
	
	@Column(nullable = false)
	String bankName;
	
	@Column(nullable = false)
	String ifsc;
	
	@Column
	String dematNo;
	
	@Column
	String balance;
	
//	@OneToMany
//	Transaction transaction;
	
	@OneToOne(fetch = FetchType.EAGER)
	@PrimaryKeyJoinColumn
	User user;
	
	@Column
	String totalValueSpent;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getDematNo() {
		return dematNo;
	}

	public void setDematNo(String dematNo) {
		this.dematNo = dematNo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
