package com.website.page;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.website.base.BaseFram;

public class FrontendPage extends BaseFram {
	
	final static Logger logger = Logger.getLogger(FrontendPage.class);
	
	public FrontendPage bookflight (){
		
		selLib.switchToWindow(1);
		
		selLib.waitForPageLoaded();
		
		String pageTitle1 = driver.getTitle();
		logger.info("the title of th epage is " + pageTitle1);
		String expactedTitle1 = "PHPTRAVELS | Travel Technology Partner";
		assertEquals(pageTitle1, expactedTitle1);
		
		
		selLib.waitforElement(By.xpath("//*[@id='search']/div/div/div/div/div/nav/ul/li[2]/a")).click();
		
		selLib.clickButton(By.id("FlightsDateStart"));
		
		selLib.waitforElement(By.id("datepickers-container"));
		selLib.clickHiddenElement((By.xpath("//*[@id='datepickers-container']/div[8]/div/div/div[2]/div[25]")));
		
		//selLib.clickButton(By.xpath("//*[@id='flights']/div/div/form/div/div[3]/div[3]/div/div/div[1]/div/div[2]/div/span/button[1]"));
		
		selLib.clickButton(By.xpath("//*[@id='flights']/div/div/form/div/div[3]/div[4]/button"));
		return this;
		
		
		
	}
	
	
	public FlightPage searchresult (){
		
		logger.info("result page is displayed");
		return new FlightPage();
		
	}
	
	
  public LoginPage gotoLogin(){
	  
	  selLib.switchToWindow(1);
	  selLib.waitForPageLoaded();
	  
		
	  
//	  JavascriptExecutor js=(JavascriptExecutor)driver;
//	  js.executeScript("arguments[0].setAttribute('style', 'border:solid 2px red;');",driver.findElement(By.xpath("(//*[@id='dropdownCurrency'])[2]")));
//	  
	  
		selLib.clickButton(By.xpath("(//*[@id='dropdownCurrency'])[2]"));
		
		logger.info("this will go to login page");
		
		selLib.clickButton(By.xpath("//a[@class='dropdown-item active tr']"));
		
		return new LoginPage();
		
	
  }
  public void changelanguge(){
	  
	  selLib.switchToWindow(1);
	  selLib.waitForPageLoaded();
	  
	  selLib.clickButton(By.xpath("//*[@id='dropdownLangauge']"));
	  
	  logger.info("changing language to Turkish");
	  
	  selLib.clickButton(By.xpath("//*[@id='tr']"));
  }
  
}
