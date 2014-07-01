package com.disney.business.domain;

import java.io.Serializable;

public class ThemeParkTicket implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer Id;
	private String destination;	
	private Integer numberOfDays;
	private String expiration;
	private String waterPark;
	private String parkHopping;
	private String typeofPass;
	
	
	
	public String getTypeofPass() {
		return typeofPass;
	}
	public void setTypeofPass(String typeofPass) {
		this.typeofPass = typeofPass;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Integer getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(Integer numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	public String getWaterPark() {
		return waterPark;
	}
	public void setWaterPark(String waterPark) {
		this.waterPark = waterPark;
	}
	public String getParkHopping() {
		return parkHopping;
	}
	public void setParkHopping(String parkHopping) {
		this.parkHopping = parkHopping;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "ThemeParkTicket [Id=" + Id + ", destination=" + destination
				+ ", numberOfDays=" + numberOfDays + ", expiration="
				+ expiration + ", waterPark=" + waterPark + ", parkHopping="
				+ parkHopping + ", typeofPass=" + typeofPass + "]";
	}
	
	

}
