package com.disney.business.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Giftcard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String type ;
	private BigDecimal amount;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Giftcard [Id=" + Id + ", type=" + type + ", amount=" + amount
				+ "]";
	}
	
}
