package com.mkyong.common;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "STOCK", catalog = "mkyong", uniqueConstraints = { @UniqueConstraint(columnNames = "STOCK_NAME"),
		@UniqueConstraint(columnNames = "STOCK_CODE") })
public class Stock implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STOCK_ID", unique = true, nullable = false)
	private int StockId;
	@Column(name = "STOCK_CODE", unique = true, nullable = false)
	private String StockName;
	@Column(name = "STOCK_NAME", unique = true, nullable = false)
	private String StockCode;

	public Stock(String stockName, String stockCode) {
		super();
		StockName = stockName;
		StockCode = stockCode;
	}

	public Stock() {
		super();
	}

	public int getStockId() {
		return StockId;
	}

	public void setStockId(int stockId) {
		StockId = stockId;
	}

	public String getStockName() {
		return StockName;
	}

	public void setStockName(String stockName) {
		StockName = stockName;
	}

	public String getStockCode() {
		return StockCode;
	}

	public void setStockCode(String stockCode) {
		StockCode = stockCode;
	}

}