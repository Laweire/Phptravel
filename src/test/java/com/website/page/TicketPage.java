package com.website.page;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.website.base.BaseFram;

public class TicketPage extends BaseFram {
	
	final static Logger logger = Logger.getLogger(FlightPage.class);
	
	public TicketPage bookticket(){
		
		String pageTitle1 = driver.getTitle();
		logger.info("the title of th epage is " + pageTitle1);
		String expactedTitle1 = "Booking";
		assertEquals(pageTitle1, expactedTitle1);
		
		
		selLib.enterText(By.id("username"), "user@phptravels.com");
		selLib.enterText(By.id("password"), "demouser");
		selLib.enterText(By.id("name"), "L");
		selLib.enterText(By.id("surname"), "W");
		selLib.enterText(By.id("email"), "user@phptravels.com");
		selLib.enterText(By.id("phone"), "5712220000");
		selLib.enterText(By.id("birthday"),"1997-06-19");
		selLib.enterText(By.id("cardno"),"675843221");
		selLib.enterText(By.id("expiration"),"2022-08-16");
	//	selLib.clickButton(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable select2-highlighted']"));
		selLib.scrollByVertically("200");
		selLib.selectDropDown(By.id("cardtype"), "American Express");
		selLib.enterText(By.id("card-number"), "371449635398431");
		selLib.selectDropDown(By.id("expiry-month"), 2);
		selLib.selectDropDown(By.id("expiry-year"), 4);
		selLib.enterText(By.xpath("//*[@id='cvv']"), "433");
		
		selLib.scrollToElement(driver.findElement(By.cssSelector(".custom-control.custom-checkbox.form-group.acceptterm")));
		
		selLib.clickButton(By.cssSelector(".custom-control.custom-checkbox.form-group.acceptterm"));
		selLib.clickButton(By.id("confirmBooking"));
		return this;
		
	}

}
