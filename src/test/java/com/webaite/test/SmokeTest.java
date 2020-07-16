package com.webaite.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.website.base.BaseFram;
import com.website.page.BackendPage;
import com.website.page.DashBoardPage;
import com.website.page.FlightPage;
import com.website.page.FrontendPage;
import com.website.page.Homepage;
import com.website.page.LoginPage;
import com.website.page.MyaccountPage;
import com.website.page.NewacPage;
import com.website.page.SignupPage;
import com.website.page.TicketPage;

public class SmokeTest extends BaseFram {
	
	final static Logger logger = Logger.getLogger(SmokeTest.class);

	Homepage home = new Homepage();
	FrontendPage front = new FrontendPage();
	FlightPage flight = new FlightPage();
	TicketPage ticket = new TicketPage();
	LoginPage login = new LoginPage();
	MyaccountPage account = new MyaccountPage();
	BackendPage backend = new BackendPage();	
	DashBoardPage dash = new DashBoardPage();
	SignupPage signup= new SignupPage();
	NewacPage newac= new NewacPage();
	
		@Test(enabled=false)
		public void homepageaccess(){
			
			test=extent.createTest("homepageaccess");
			home.gotothepage();
			home.gotofrontend();
		}
		@Test(enabled=false)
		public void flight(){
			
			test=extent.createTest("flight");
			home.gotothepage();
			home.gotofrontend();
			front.bookflight();
			flight.selectflight();
			ticket.bookticket();
			
		}
		@Test(enabled=false)
		public void login(){
			test=extent.createTest("login");
			home.gotothepage();
			home.gotofrontend();
			front.gotoLogin();
			login.logininfo();
			account.pageconf();
			
		}
		@Test(enabled=false)
		public void backend(){
			test=extent.createTest("backend");
			home.gotothepage();
			home.gotobackend();
			backend.adminlogin();
			
		}
		
		@Test (enabled=false)
		public void account(){
			
			test=extent.createTest("account");
			home.gotothepage();
			home.gotobackend();
			backend.adminlogin();
			dash.changePass();
			
		}
	@Test (enabled=false)
	public void signup(){
		
		test=extent.createTest("signup");
		home.gotothepage();
		home.gotofrontend();
		signup.gotoSignup();
		newac.newacount();
	}
	
	@Test(enabled=false)
	public void language(){
		
		test=extent.createTest("language");
		home.gotothepage();
		home.gotofrontend();
		front.changelanguge();
		
	}
	
	@Test
	public void makeuser(){
		
		test=extent.createTest("makeuser");
		home.gotothepage();
		home.gotobackend();
		backend.adminlogin();
		backend.Newuser();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
