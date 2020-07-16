package com.website.page;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.website.base.BaseFram;

public class NewacPage extends BaseFram{
	
	final static Logger logger = Logger.getLogger(NewacPage.class);
	
	public NewacPage newacount(){
	
	  String pageTitle1 = driver.getTitle();
		logger.info("the title of th epage is " + pageTitle1);
		String expactedTitle1 = "Register";
		assertEquals(pageTitle1, expactedTitle1);
		
		selLib.enterText(By.xpath("//*[@id='headersignupform']/div[3]/div[1]/div/label/input"), "L");
		selLib.enterText(By.xpath("//*[@id='headersignupform']/div[3]/div[2]/div/label/input"), "W");
		selLib.enterText(By.xpath("//*[@id='headersignupform']/div[4]/label/input"), "5712223303");
		selLib.enterText(By.xpath("//*[@id='headersignupform']/div[5]/label/input"), "lw@gmail.com");
		selLib.enterText(By.xpath("//*[@id='headersignupform']/div[6]/label/input"), "123456");
		selLib.enterText(By.xpath("//*[@id='headersignupform']/div[7]/label/input"), "123456");
		selLib.clickButton(By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']"));
		
		return this;
		

}
}