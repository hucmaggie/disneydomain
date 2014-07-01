package com.disney.business.domain;

import java.io.Serializable;

public class DistributionChannel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String type;
	private String name;
	
	
	
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return Id;
	}



	public void setId(Integer id) {
		Id = id;
	}



	@Override
	public String toString() {
		return "DistributionChannel [Id=" + Id + ", type=" + type + ", name="
				+ name + "]";
	}
	
	

	
}
