package com.disney.business.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Accommodation implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String name;
	private String type;
	private String roomCatogory;
	private String roomType;
	private Integer lengthOfStay;
	private BigDecimal rate;
	private List<Rate> rates ;
	private BigDecimal totalroomRates;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRoomCatogory() {
		return roomCatogory;
	}
	public void setRoomCatogory(String roomCatogory) {
		this.roomCatogory = roomCatogory;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Integer getLengthOfStay() {
		return lengthOfStay;
	}
	public void setLengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	public List<Rate> getRates() {
		return rates;
	}
	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}
	public BigDecimal getTotalroomRates() {
		return totalroomRates;
	}
	public void setTotalroomRates(BigDecimal totalroomRates) {
		this.totalroomRates = totalroomRates;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Accommodation [Id=" + Id + ", name=" + name + ", type=" + type
				+ ", roomCatogory=" + roomCatogory + ", roomType=" + roomType
				+ ", lengthOfStay=" + lengthOfStay + ", rate=" + rate
				+ ", rates=" + rates + ", totalroomRates=" + totalroomRates
				+ "]";
	}
	

}
