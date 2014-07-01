package com.disney.business.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SalesRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id; 
	private Accommodation accomodation;
	private Booking booking;
	private CommunicationChannel communicationChannel;
	private DistributionChannel distributionChannel;
	private Bundle bundle;
	private Dine dine;
	private Discounts discoiunts;
	private Golf golf;
	private Giftcard giftcard;
	private Rates rates;
	private ThemeParkTicket themeParkTicket;
	private Transportation transportation;
	private ErrorContext errorContext;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public CommunicationChannel getCommunicationChannel() {
		return communicationChannel;
	}
	public void setCommunicationChannel(CommunicationChannel communicationChannel) {
		this.communicationChannel = communicationChannel;
	}
	public DistributionChannel getDistributionChannel() {
		return distributionChannel;
	}
	public void setDistributionChannel(DistributionChannel distributionChannel) {
		this.distributionChannel = distributionChannel;
	}
	public Bundle getBundle() {
		return bundle;
	}
	public void setBundle(Bundle bundle) {
		this.bundle = bundle;
	}
	public Dine getDine() {
		return dine;
	}
	public void setDine(Dine dine) {
		this.dine = dine;
	}
	public Discounts getDiscoiunts() {
		return discoiunts;
	}
	public void setDiscoiunts(Discounts discoiunts) {
		this.discoiunts = discoiunts;
	}
	public Golf getGolf() {
		return golf;
	}
	public void setGolf(Golf golf) {
		this.golf = golf;
	}
	public Giftcard getGiftcard() {
		return giftcard;
	}
	public void setGiftcard(Giftcard giftcard) {
		this.giftcard = giftcard;
	}
	public Rates getRates() {
		return rates;
	}
	public void setRates(Rates rates) {
		this.rates = rates;
	}
	public ThemeParkTicket getThemeParkTicket() {
		return themeParkTicket;
	}
	public void setThemeParkTicket(ThemeParkTicket themeParkTicket) {
		this.themeParkTicket = themeParkTicket;
	}
	public Transportation getTransportation() {
		return transportation;
	}
	public void setTransportation(Transportation transportation) {
		this.transportation = transportation;
	}
	
	public ErrorContext getErrorContext() {
		return errorContext;
	}
	public void setErrorContext(ErrorContext errorContext) {
		this.errorContext = errorContext;
	}
	
	public Accommodation getAccomodation() {
		return accomodation;
	}
	public void setAccomodation(Accommodation accomodation) {
		this.accomodation = accomodation;
	}
	public void addError(Error error){
		if(this.errorContext == null){
			this.errorContext = new ErrorContext();
		}
		this.errorContext.addError(error);
	}
	public void addError(String category , String type,String message){
		Error error = new Error();
		error.setCategory(category);
		error.setErrorMessage(message);
		error.setRequestId(this.id);
		this.addError(error);
	}
	
	public  boolean hasErrors(){
		
		return this.errorContext !=null && this.errorContext.hasErrors() ? true : false;
		
	}
	
	public void addProduct(String type){
		
		Component prodcut = new Component();
		prodcut.setType(type);
				
		if(this.getBundle() == null){
			this.bundle = new Bundle();
		}
		
		List<Component> componets = this.getBundle().getComponents();
		if(componets==null){
			componets = new  ArrayList<Component>();
		}
		componets.add(prodcut);
	}
	@Override
	public String toString() {
		return "SalesRequest [id=" + id + ", accomodation=" + accomodation
				+ ", booking=" + booking + ", communicationChannel="
				+ communicationChannel + ", distributionChannel="
				+ distributionChannel + ", bundle=" + bundle + ", dine=" + dine
				+ ", discoiunts=" + discoiunts + ", golf=" + golf
				+ ", giftcard=" + giftcard + ", rates=" + rates
				+ ", themeParkTicket=" + themeParkTicket + ", transportation="
				+ transportation + ", errorContext=" + errorContext + "]";
	}
	
}
