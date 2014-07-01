package com.disney.business.domain.util;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import com.disney.business.domain.Giftcard;
import com.disney.business.domain.SalesRequest;



public class Helper {
	
	public boolean  isBookingAdvanced(Date bookingDate,int numberOfdays){
		
		Calendar today = Calendar.getInstance();
		Calendar c = Calendar.getInstance();
		c.setTime(bookingDate);
		c.add(Calendar.DATE, -numberOfdays);
		Date dt = c.getTime();
		boolean isadvance = dt.after(today.getTime());
		return isadvance;
		
	}
	
	public void addGiftCard(SalesRequest request , String type,BigDecimal amount){
		
		Giftcard giftcard = new Giftcard();
		giftcard.setAmount(amount);
		giftcard.setType(type);
		request.setGiftcard(giftcard);
		
	}
	
	public static void main(String[] ar){
		Helper helper = new Helper();
		Calendar dt = Calendar.getInstance();
		dt.set(2014, 8, 1);
		
		boolean re = helper.isBookingAdvanced(dt.getTime(), 120);
		System.out.print("" + re);
		
		
	}

}
