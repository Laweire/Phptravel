package com.website.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.website.base.BaseFram;

public class SignupPage extends BaseFram {
	
	final static Logger logger = Logger.getLogger(SignupPage.class);
	
	
	public SignupPage gotoSignup(){

  		selLib.switchToWindow(1);
  		selLib.waitForPageLoaded();
  		
  		selLib.clickButton(By.xpath("(//*[@id='dropdownCurrency'])[2]"));
  		
  		logger.info("this will go to signup page");
  		
  		selLib.clickButton(By.xpath("//*[@id='//header-waypoint-sticky']/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]"));
		
  		return this;

	  
  	}	  
	public NewacPage gotoNew(){
		
		return new NewacPage();
	}
	  

}
