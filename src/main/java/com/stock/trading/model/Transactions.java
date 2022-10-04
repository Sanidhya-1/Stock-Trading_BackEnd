package com.stock.trading.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="transaction")

public class Transactions {

	public Transactions() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	@Column
	Date timeStampDate;
	
	@Column
	double price;
	
//	@Column
//	Set<Trade> allTrades;
//	
	@ManyToOne
	@JoinColumn(name = "id",nullable =false)
	User user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getTimeStampDate() {
		return timeStampDate;
	}

	public void setTimeStampDate(Date timeStampDate) {
		this.timeStampDate = timeStampDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	public Set<Trade> getAllTrades() {
//		return allTrades;
//	}
//
//	public void setAllTrades(Set<Trade> allTrades) {
//		this.allTrades = allTrades;
//	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
