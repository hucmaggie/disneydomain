package com.disney.business.domain;

import java.io.Serializable;

public class Custmer implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String firstName;
	private String lastName;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String phonNumber;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhonNumber() {
		return phonNumber;
	}
	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}
	public String getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	private String emailAdress;

	@Override
	public String toString() {
		return "Custmer [Id=" + Id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phonNumber="
				+ phonNumber + ", emailAdress=" + emailAdress + "]";
	}
}
