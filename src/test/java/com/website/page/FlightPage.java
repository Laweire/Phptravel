package com.website.page;

import static org.testng.Assert.assertEquals;



import org.apache.log4j.Logger;
import org.openqa.selenium.By;


import com.website.base.BaseFram;

public class FlightPage extends BaseFram {
	
	final static Logger logger = Logger.getLogger(FlightPage.class);
	
	public FlightPage selectflight(){
		
		String pageTitle1 = driver.getTitle();
		logger.info("the title of th epage is " + pageTitle1);
		String expactedTitle1 = "Flights Results - From to NYC to MIA";
		assertEquals(pageTitle1, expactedTitle1);
		
		
		if (driver.findElement(By.xpath("//*[@id='group_main']/div[1]/label")).isSelected()== true){
				
		}else { 
			selLib.clickButton(By.xpath("//*[@id='group_main']/div[1]/label"));
			
		}
		
		selLib.scrollByVertically("250");
		
		
		selLib.clickButton(By.xpath("//li[@class='all  item unitedairlines oneway_0  ']//child::button[1]"));
				
		
		return this;
		
	}
	
	public  TicketPage booking(){
		
		
		
		return new TicketPage();
	}


}
