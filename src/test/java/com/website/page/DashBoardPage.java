package com.website.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.website.base.BaseFram;

public class DashBoardPage extends BaseFram {

	final static Logger logger = Logger.getLogger(DashBoardPage.class);
	
	public DashBoardPage changePass (){
		
//		String pageTitle1 = driver.getTitle();
//		logger.info("the title of th epage is " + pageTitle1);
//		String expactedTitle1 = "Dashboard";
//		assertEquals(pageTitle1, expactedTitle1);

		selLib.waitForPageLoaded();
		
		selLib.clickButton(By.xpath("//li[@id='account']"));
		selLib.enterText(By.xpath("//*[@id='content']/form/div/div[2]/div/div[5]/div/input"), "123456");
		selLib.clickButton(By.xpath("//*[@id='content']/form/div/div[3]/button"));
		
		
		return this;
		
	}
}
