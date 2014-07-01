package com.disney.business.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ErrorContext implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private List<Error> errors;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public List<Error> getErrors() {
		return errors;
	}
	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}
	public void addError(Error error){
		if(this.errors == null){
			this.errors = new ArrayList<Error>();
			
		}
		this.errors.add(error);
	}
	
	public boolean hasErrors(){
		
		return this.errors != null && this.errors.size() > 0 ? true:false;
	}

}
