package com.disney.business.domain;

import java.io.Serializable;
import java.util.List;

public class Bundle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	private List<Component> components;


	


	public List<Component> getComponents() {
		return components;
	}


	public void setComponents(List<Component> components) {
		this.components = components;
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	@Override
	public String toString() {
		return "Bundle [Id=" + Id + ", components=" + components + "]";
	}


	
	

}
