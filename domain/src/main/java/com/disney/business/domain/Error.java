package com.disney.business.domain;

import java.io.Serializable;

public class Error implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String category;
	private String type;
	private String DomainName;
	private String field;
	private String ruleName;
	private Integer requestId;
	private String ErrorMessage;
	private String actualData;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDomainName() {
		return DomainName;
	}
	public void setDomainName(String domainName) {
		DomainName = domainName;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public Integer getRequestId() {
		return requestId;
	}
	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public String getActualData() {
		return actualData;
	}
	public void setActualData(String actualData) {
		this.actualData = actualData;
	}
	@Override
	public String toString() {
		return "Error [category=" + category + ", type=" + type
				+ ", DomainName=" + DomainName + ", field=" + field
				+ ", ruleName=" + ruleName + ", requestId=" + requestId
				+ ", ErrorMessage=" + ErrorMessage + ", actualData="
				+ actualData + "]";
	}
	
	
	
	
	
	
	
	
	
}
