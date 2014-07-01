package com.disney.business.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Discounts implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Discount> discounts ;
	
	private BigDecimal totalDiscounts;

	public List<Discount> getDiscounts() {
		return discounts;
	}

	public void setDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
	}

	public BigDecimal getTotalDiscounts() {
		return totalDiscounts;
	}

	public void setTotalDiscounts(BigDecimal totalDiscounts) {
		this.totalDiscounts = totalDiscounts;
	}

	@Override
	public String toString() {
		return "Discounts [discounts=" + discounts + ", totalDiscounts="
				+ totalDiscounts + "]";
	}
	
	public void addDiscount(Integer percentage,String type){
		
		Discount e = new Discount();
		e.setPercentage(percentage);
		e.setType(type);
		if (this.discounts != null){
			this.discounts = new ArrayList<Discount>();
			
		}
		this.discounts.add(e);
		
		
	}
	
	
	
	

}
