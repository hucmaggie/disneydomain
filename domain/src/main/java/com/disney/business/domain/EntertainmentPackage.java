package com.disney.business.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EntertainmentPackage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String type;
	private List<Component> components;
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Component> getComponents() {
		return components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
		if(this.components == null){
			this.components = new ArrayList<Component>();
			
			
		}
		this.components.addAll(components);
	}
	
	public void addPlatinumPackage(){
		
		// call servie get packages based on selected package type
	    this.components.add( new Component("Fireworks viewing at MK"));
	    this.components.add( new Component("Fireworks viewing at Epcot"));
	    this.components.add( new Component("Platium Plan meals"));
	    this.components.add( new Component("two snacks"));
	    
	}
	@Override
	public String toString() {
		return "EntertainmentPackage [type=" + type + ", components="
				+ components + "]";
	}

	
	
	

	
}
