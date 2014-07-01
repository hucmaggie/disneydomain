package com.disney.business.domain;

import java.io.Serializable;

public class Golf implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String name;
	private String loation;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoation() {
		return loation;
	}
	public void setLoation(String loation) {
		this.loation = loation;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Golf [Id=" + Id + ", name=" + name + ", loation=" + loation
				+ "]";
	}
	
	
}
