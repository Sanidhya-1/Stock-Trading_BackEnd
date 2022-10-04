package com.stock.trading.model;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginPage {
	
	public LoginPage() {
		
	}
	
	@NotEmpty
	String userName;
	@NotEmpty
	String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
