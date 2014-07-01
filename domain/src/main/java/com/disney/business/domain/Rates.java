package com.disney.business.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Rates implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Rate> rates = new ArrayList<Rate>();
	
	private BigDecimal totalRate;

	public List<Rate> getRates() {
		return rates;
	}

	public void setRates(List<Rate> rates) {
		if ( this.rates == null){
			this.rates = new ArrayList<Rate>();
		}
		this.rates.addAll(rates);
	}

	public BigDecimal getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(BigDecimal totalRate) {
		this.totalRate = totalRate;
	}
	
	
	
	

}
