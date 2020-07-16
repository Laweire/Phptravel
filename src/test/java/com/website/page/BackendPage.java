package com.website.page;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.website.base.BaseFram;

public class BackendPage extends BaseFram {
	
	final static Logger logger = Logger.getLogger(BackendPage.class);
	
	public BackendPage adminlogin(){
		
		selLib.switchToWindow(1);
		
		selLib.waitForPageLoaded();
		
		String pageTitle1 = driver.getTitle();
		logger.info("the title of th epage is " + pageTitle1);
		String expactedTitle1 = "Administator Login";
		assertEquals(pageTitle1, expactedTitle1);
		
		selLib.enterText(By.xpath("/html/body/div[2]/form[1]/div[1]/label[1]/input"), "admin@phptravels.com");
		selLib.enterText(By.xpath("/html/body/div[2]/form[1]/div[1]/label[2]/input"), "demoadmin");
		selLib.clickButton(By.xpath("/html/body/div[2]/form[1]/div[1]/div/div[1]/label/div/ins"));
		selLib.clickButton(By.xpath("/html/body/div[2]/form[1]/button"));
		
		return this;
		
		
	}
	
	public void Newuser(){
		
		selLib.clickButton(By.xpath("//*[@id='social-sidebar-menu']/li[5]/a"));
		selLib.clickButton(By.xpath("//*[@id='ACCOUNTS']/li[3]/a"));
		
		selLib.waitForPageLoaded();
		selLib.clickButton(By.xpath("//*[@id='content']/div[2]/form/button"));
		
		selLib.waitForPageLoaded();
		
		selLib.enterText(By.xpath("//*[@id='content']/form/div[1]/div/div[2]/div/div[1]/div/input"), "L");
		selLib.enterText(By.xpath("//*[@id='content']/form/div[1]/div/div[2]/div/div[2]/div/input"), "W");
		selLib.enterText(By.xpath("//*[@id='content']/form/div[1]/div/div[2]/div/div[3]/div/input"),"lw@gmail.com");
		selLib.enterText(By.xpath("//*[@id='content']/form/div[1]/div/div[2]/div/div[4]/div/input"), "123456");

		
		selLib.clickButton(By.xpath("//*[@id='s2id_autogen1']"));
		selLib.enterText(By.xpath("//*[@id='select2-drop']/div/input"), "United States");
		selLib.enterandsend(By.xpath("//*[@id='select2-drop']/div/input"));
		selLib.clickButton(By.xpath("//*[@id='content']/form/div[1]/div/div[3]/button"));
		//selLib.enterText(By.xpath(xpathExpression), textString);
	}

}
