package com.stock.trading.model;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "watchlist")
public class WatchList {
	
	public WatchList() {}
	
	
	@ElementCollection(fetch = FetchType.EAGER)
	@MapKeyColumn(name = "stock_Id")
	@Column(name = "amount")
	@CollectionTable(name = "trade_stock")
	Map<Integer,Integer> stockToAmount;
	
	public Map<Integer, Integer> getStockToAmount() {
		return stockToAmount;
	}

	public void setStockToAmount(Map<Integer, Integer> stockToAmount) {
		this.stockToAmount = stockToAmount;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	@Column
	String stock;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn
	User user;

}
