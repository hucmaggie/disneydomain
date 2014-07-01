package com.disney.business.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Discount implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String type ;
	private BigDecimal originalAmount;
	private BigDecimal discountAmount;
	private Integer percentage ;
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BigDecimal getOriginalAmount() {
		return originalAmount;
	}
	public void setOriginalAmount(BigDecimal originalAmount) {
		this.originalAmount = originalAmount;
	}
	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}
	public Integer getPercentage() {
		return percentage;
	}
	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Discount [Id=" + Id + ", type=" + type + ", originalAmount="
				+ originalAmount + ", discountAmount=" + discountAmount
				+ ", percentage=" + percentage + "]";
	}

}
