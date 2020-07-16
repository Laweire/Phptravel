package com.website.page;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;

import com.website.base.BaseFram;

public class MyaccountPage extends BaseFram{
	
	final static Logger logger = Logger.getLogger(MyaccountPage.class);
	
	public MyaccountPage pageconf(){
		String pageTitle = driver.getTitle();
		logger.info("the title of th epage is " + pageTitle);
		String expactedTitle = "Login";
		assertEquals(pageTitle, expactedTitle);
	
	return this;
	}
	
	
}
