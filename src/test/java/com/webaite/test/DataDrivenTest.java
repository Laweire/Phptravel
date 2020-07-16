package com.webaite.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.website.base.BaseFram;
import com.website.page.BackendPage;
import com.website.page.FlightPage;
import com.website.page.FrontendPage;
import com.website.page.Homepage;
import com.website.page.LoginPage;
import com.website.page.TicketPage;
import com.website.utility.ExcelReader;

public class DataDrivenTest extends BaseFram {

	final static Logger logger = Logger.getLogger(DataDrivenTest.class);
	private int counter = 0;

	Homepage home = new Homepage();
	FrontendPage front = new FrontendPage();
	FlightPage flight = new FlightPage();
	TicketPage ticket = new TicketPage();
	LoginPage login = new LoginPage();
	BackendPage admin = new BackendPage();

	@DataProvider(name = "Phpdata")
	private Object[][] logindata() {
		ExcelReader reader = new ExcelReader("src/test/resources/Data/Phpdata.xlsx", "Sheet1");
		Object[][] data = null;
		data = reader.getExcelData();

		return data;

	}

	@Test(dataProvider = "Phpdata", priority=0)
	public void negativeTest(String UserName, String Password, String ExpectedResult) {
		test=extent.createTest("negativeTest");
		
		try {
			counter++;

			home.gotothepage();
			home.gotofrontend();
			front.gotoLogin();

			selLib.waitForPageLoaded();
			selLib.enterText(By.xpath("//*[@id='loginfrm']/div[3]/div[1]/label/input"), UserName);
			selLib.enterText(By.xpath("//*[@id='loginfrm']/div[3]/div[2]/label/input"), Password);
			selLib.clickButton(By.xpath("//*[@id='loginfrm']/button"));
			String result = driver.findElement(By.xpath("//*[@id='loginfrm']/div[1]/div")).getText();
			logger.info("Test Scenario: " + counter + "Result:[" + result + "Expected: [" + ExpectedResult + "]");

			Assert.assertEquals(result, ExpectedResult);

		} catch (Exception e) {
			logger.error("Error: ", e);

		}

	}

	@DataProvider(name = "Admindata")
	private Object[][] loginadmin() {
		ExcelReader reader1 = new ExcelReader("src/test/resources/Data/AdminData.xlsx", "Sheet1");
		Object[][] data1 = null;
		data1 = reader1.getExcelData();

		return data1;

	}

	@Test(dataProvider = "Admindata",priority=1)
	public void negativeAdmin(String UserName, String Password, String ExpectedResult) {
		test=extent.createTest("negativeAdmin");
		
		try {
			counter++;

			home.gotothepage();
			home.gotobackend();
			
			selLib.switchToWindow(1);
			
			selLib.waitForPageLoaded();
			
		//	selLib.clickButton(By.xpath("/html/body/div[2]/form[1]/div[1]/label[1]/input"));
			
			selLib.enterText(By.xpath("/html/body/div[2]/form[1]/div[1]/label[1]/input"), UserName);
			
		//	selLib.clickButton(By.xpath("/html/body/div[2]/form[1]/div[1]/label[2]/input"));
			
			selLib.enterText(By.xpath("/html/body/div[2]/form[1]/div[1]/label[1]/input"), Password);
			
			selLib.clickButton(By.xpath("/html/body/div[2]/form[1]/button/span[1]"));
		
			
			String result = driver.findElement(By.xpath("/html/body/div[2]/form[1]/div[2]/div")).getText();
			logger.info("Test Scenario: " + counter + "Result:[" + result +"] "+"Expected: [" + ExpectedResult + "]");

			Assert.assertEquals(result, ExpectedResult);

		} catch (Exception e) {
			logger.error("Error: ", e);

		}

	}

}
