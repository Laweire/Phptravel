package com.website.page;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.website.base.BaseFram;

public class LoginPage extends BaseFram{
	
	final static Logger logger = Logger.getLogger(LoginPage.class);
	
	public MyaccountPage logininfo(){
		
		  String pageTitle1 = driver.getTitle();
			logger.info("the title of th epage is " + pageTitle1);
			String expactedTitle1 = "Login";
			assertEquals(pageTitle1, expactedTitle1);

		selLib.waitForPageLoaded();
		selLib.enterText(By.xpath("//*[@id='loginfrm']/div[3]/div[1]/label/input"),"user@phptravels.com");
		selLib.enterText(By.xpath("//*[@id='loginfrm']/div[3]/div[2]/label/input"), "demouser");
		selLib.clickButton(By.xpath("//*[@id='loginfrm']/button"));
	
		return new MyaccountPage();
		
	}
	}
