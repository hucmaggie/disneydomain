package com.disney.business.domain;

import java.io.Serializable;

public class Dine implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "Dine [Id=" + Id + ", type=" + type + "]";
	}
	
	
}
