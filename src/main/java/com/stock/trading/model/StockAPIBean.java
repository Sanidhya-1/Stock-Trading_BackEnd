package com.stock.trading.model;

import java.util.Objects;

public class StockAPIBean {
	
	private String symbol;
	private String exchange;
	private String name;
	private String dayCode;
	private String serverTimestamp;
	private String mode;
	private String lastPrice;
	private String tradeTimestamp;
	private String netChange;
	private String percentChange;
	private String unitCode;
	private String open;
	private String high="0.0";
	private String low="0.0";
	private String close;
	private String flag;
	private String volume;
	private String fiftyTwoWkHigh="0.0";
	private String fiftyTwoWkHighDate;
	private String fiftyTwoWkLow="0.0";
	private String fiftyTwoWkLowDate;
	
	public StockAPIBean() {
}

	public StockAPIBean(String symbol, String exchange, String name, String dayCode, String serverTimestamp,
			String mode, String lastPrice, String tradeTimestamp, String netChange, String percentChange,
			String unitCode, String open, String high, String low, String close, String flag, String volume,
			String fiftyTwoWkHigh, String fiftyTwoWkHighDate, String fiftyTwoWkLow, String fiftyTwoWkLowDate) {
		super();
		this.symbol = symbol;
		this.exchange = exchange;
		this.name = name;
		this.dayCode = dayCode;
		this.serverTimestamp = serverTimestamp;
		this.mode = mode;
		this.lastPrice = lastPrice;
		this.tradeTimestamp = tradeTimestamp;
		this.netChange = netChange;
		this.percentChange = percentChange;
		this.unitCode = unitCode;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.flag = flag;
		this.volume = volume;
		this.fiftyTwoWkHigh = fiftyTwoWkHigh;
		this.fiftyTwoWkHighDate = fiftyTwoWkHighDate;
		this.fiftyTwoWkLow = fiftyTwoWkLow;
		this.fiftyTwoWkLowDate = fiftyTwoWkLowDate;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getExchange() {
		return this.exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDayCode() {
		return this.dayCode;
	}

	public void setDayCode(String dayCode) {
		this.dayCode = dayCode;
	}

	public String getServerTimestamp() {
		return this.serverTimestamp;
	}

	public void setServerTimestamp(String serverTimestamp) {
		this.serverTimestamp = serverTimestamp;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getLastPrice() {
		return this.lastPrice;
	}

	public void setLastPrice(String lastPrice) {
		this.lastPrice = lastPrice;
	}

	public String getTradeTimestamp() {
		return this.tradeTimestamp;
	}

	public void setTradeTimestamp(String tradeTimestamp) {
		this.tradeTimestamp = tradeTimestamp;
	}

	public String getNetChange() {
		return this.netChange;
	}

	public void setNetChange(String netChange) {
		this.netChange = netChange;
	}

	public String getPercentChange() {
		return this.percentChange;
	}

	public void setPercentChange(String percentChange) {
		this.percentChange = percentChange;
	}

	public String getUnitCode() {
		return this.unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getOpen() {
		return this.open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getHigh() {
		return this.high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getLow() {
		return this.low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getClose() {
		return this.close;
	}

	public void setClose(String close) {
		this.close = close;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getVolume() {
		return this.volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getFiftyTwoWkHigh() {
		return this.fiftyTwoWkHigh;
	}

	public void setFiftyTwoWkHigh(String fiftyTwoWkHigh) {
		this.fiftyTwoWkHigh = fiftyTwoWkHigh;
	}

	public String getFiftyTwoWkHighDate() {
		return this.fiftyTwoWkHighDate;
	}

	public void setFiftyTwoWkHighDate(String fiftyTwoWkHighDate) {
		this.fiftyTwoWkHighDate = fiftyTwoWkHighDate;
	}

	public String getFiftyTwoWkLow() {
		return this.fiftyTwoWkLow;
	}

	public void setFiftyTwoWkLow(String fiftyTwoWkLow) {
		this.fiftyTwoWkLow = fiftyTwoWkLow;
	}

	public String getFiftyTwoWkLowDate() {
		return this.fiftyTwoWkLowDate;
	}

	public void setFiftyTwoWkLowDate(String fiftyTwoWkLowDate) {
		this.fiftyTwoWkLowDate = fiftyTwoWkLowDate;
	}
	
	// with returning object
	 public StockAPIBean symbol(String symbol) {
	        this.symbol = symbol;
	        return this;
	    }

	    public StockAPIBean exchange(String exchange) {
	        this.exchange = exchange;
	        return this;
	    }

	    public StockAPIBean name(String name) {
	        this.name = name;
	        return this;
	    }

	    public StockAPIBean dayCode(String dayCode) {
	        this.dayCode = dayCode;
	        return this;
	    }

	    public StockAPIBean serverTimestamp(String serverTimestamp) {
	        this.serverTimestamp = serverTimestamp;
	        return this;
	    }

	    public StockAPIBean mode(String mode) {
	        this.mode = mode;
	        return this;
	    }

	    public StockAPIBean lastPrice(String lastPrice) {
	        this.lastPrice = lastPrice;
	        return this;
	    }

	    public StockAPIBean tradeTimestamp(String tradeTimestamp) {
	        this.tradeTimestamp = tradeTimestamp;
	        return this;
	    }

	    public StockAPIBean netChange(String netChange) {
	        this.netChange = netChange;
	        return this;
	    }

	    public StockAPIBean percentChange(String percentChange) {
	        this.percentChange = percentChange;
	        return this;
	    }

	    public StockAPIBean unitCode(String unitCode) {
	        this.unitCode = unitCode;
	        return this;
	    }

	    public StockAPIBean open(String open) {
	        this.open = open;
	        return this;
	    }

	    public StockAPIBean high(String high) {
	        this.high = high;
	        return this;
	    }

	    public StockAPIBean low(String low) {
	        this.low = low;
	        return this;
	    }

	    public StockAPIBean close(String close) {
	        this.close = close;
	        return this;
	    }

	    public StockAPIBean flag(String flag) {
	        this.flag = flag;
	        return this;
	    }

	    public StockAPIBean volume(String volume) {
	        this.volume = volume;
	        return this;
	    }

	    public StockAPIBean fiftyTwoWkHigh(String fiftyTwoWkHigh) {
	        this.fiftyTwoWkHigh = fiftyTwoWkHigh;
	        return this;
	    }

	    public StockAPIBean fiftyTwoWkHighDate(String fiftyTwoWkHighDate) {
	        this.fiftyTwoWkHighDate = fiftyTwoWkHighDate;
	        return this;
	    }

	    public StockAPIBean fiftyTwoWkLow(String fiftyTwoWkLow) {
	        this.fiftyTwoWkLow = fiftyTwoWkLow;
	        return this;
	    }

	    public StockAPIBean fiftyTwoWkLowDate(String fiftyTwoWkLowDate) {
	        this.fiftyTwoWkLowDate = fiftyTwoWkLowDate;
	        return this;
	    }
	

	@Override
	public int hashCode() {
		return Objects.hash(close, dayCode, exchange, fiftyTwoWkHigh, fiftyTwoWkHighDate, fiftyTwoWkLow,
				fiftyTwoWkLowDate, flag, high, lastPrice, low, mode, name, netChange, open, percentChange,
				serverTimestamp, symbol, tradeTimestamp, unitCode, volume);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockAPIBean other = (StockAPIBean) obj;
		return Objects.equals(close, other.close) && Objects.equals(dayCode, other.dayCode)
				&& Objects.equals(exchange, other.exchange) && Objects.equals(fiftyTwoWkHigh, other.fiftyTwoWkHigh)
				&& Objects.equals(fiftyTwoWkHighDate, other.fiftyTwoWkHighDate)
				&& Objects.equals(fiftyTwoWkLow, other.fiftyTwoWkLow)
				&& Objects.equals(fiftyTwoWkLowDate, other.fiftyTwoWkLowDate) && Objects.equals(flag, other.flag)
				&& Objects.equals(high, other.high) && Objects.equals(lastPrice, other.lastPrice)
				&& Objects.equals(low, other.low) && Objects.equals(mode, other.mode)
				&& Objects.equals(name, other.name) && Objects.equals(netChange, other.netChange)
				&& Objects.equals(open, other.open) && Objects.equals(percentChange, other.percentChange)
				&& Objects.equals(serverTimestamp, other.serverTimestamp) && Objects.equals(symbol, other.symbol)
				&& Objects.equals(tradeTimestamp, other.tradeTimestamp) && Objects.equals(unitCode, other.unitCode)
				&& Objects.equals(volume, other.volume);
	}

	@Override
	public String toString() {
		return "StockAPIBean [symbol=" + symbol + ", exchange=" + exchange + ", name=" + name + ", dayCode=" + dayCode
				+ ", serverTimestamp=" + serverTimestamp + ", mode=" + mode + ", lastPrice=" + lastPrice
				+ ", tradeTimestamp=" + tradeTimestamp + ", netChange=" + netChange + ", percentChange=" + percentChange
				+ ", unitCode=" + unitCode + ", open=" + open + ", high=" + high + ", low=" + low + ", close=" + close
				+ ", flag=" + flag + ", volume=" + volume + ", fiftyTwoWkHigh=" + fiftyTwoWkHigh
				+ ", fiftyTwoWkHighDate=" + fiftyTwoWkHighDate + ", fiftyTwoWkLow=" + fiftyTwoWkLow
				+ ", fiftyTwoWkLowDate=" + fiftyTwoWkLowDate + "]";
	}
	
	
	
	
	
}
