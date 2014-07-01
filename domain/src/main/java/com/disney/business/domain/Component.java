package com.disney.business.domain;

import java.io.Serializable;

public class Component implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String type;
	public String getName() {
		return name;
	}
	
	public Component() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Component(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	
	public Component(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Component [name=" + name + ", type=" + type + "]";
	}
	
	
	
}
