package com.website.page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.website.base.BaseFram;

public class Homepage extends BaseFram {

	final static Logger logger = Logger.getLogger(Homepage.class);

	public Homepage gotothepage() {
	try{
		
		driver.get("https://phptravels.com/demo/");
		String pageTitle = driver.getTitle();
		logger.info("the title of th epage is " + pageTitle);
		String expactedTitle = "Demo Script Test drive - PHPTRAVELS";
		assertEquals(pageTitle, expactedTitle);
	}
	catch (Exception e){
		logger.error("Error:",e);
		assertTrue(false);
	}
		return this;
	}
	
	public FrontendPage gotofrontend(){
		
		selLib.clickButton(By.xpath("//*[@id='Main']/section[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/a"));
		logger.info("page will change to fornt end page");
		
		

		
		 return new FrontendPage();
		 
		
	}
	public BackendPage gotobackend(){
		
		selLib.clickButton(By.xpath("//*[@id='Main']/section[2]/div/div/div[3]/div/div/div[2]/div[2]/div/div[1]/div/a"));
		logger.info("page will change to backend page");
		
		return new BackendPage();
		
	}
	
	
}
