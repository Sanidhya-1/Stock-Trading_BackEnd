package com.stock.trading.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name = "user_table")
public class User {
	
	public User() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_Id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="middleName")
	private String middleName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="verified")
	private boolean verified;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@Column(name="pass_word")
	private String pass_word;
	
	public String getPassword() {
		return pass_word;
	}

	public void setPassword(String password) {
		this.pass_word = password;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

//	@OneToOne
//	private WatchList watchList;
//	
//	@OneToOne
//	private BankDetails bankDetails;
	
//	@OneToMany
//	private List<Transactions> trainsaction;

	public long getId() {
		return user_Id;
	}

	public void setId(long id) {
		this.user_Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public WatchList getWatchList() {
//		return watchList;
//	}
//
//	public void setWatchList(WatchList watchList) {
//		this.watchList = watchList;
//	}
//
//	public BankDetails getBankDetails() {
//		return bankDetails;
//	}
//
//	public void setBankDetails(BankDetails bankDetails) {
//		this.bankDetails = bankDetails;
//	}
//
//	public List<Transactions> getTrainsaction() {
//		return trainsaction;
//	}

//	public void setTrainsaction(List<Transactions> trainsaction) {
//		this.trainsaction = trainsaction;
//	}
	
	
	
	
	

}
