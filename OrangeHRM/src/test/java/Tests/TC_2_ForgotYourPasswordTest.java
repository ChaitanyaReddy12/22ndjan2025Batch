package Tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseOrCommon;
import Methods.ForgotYourPasswordMethods;
import Pages.LoginPage;

public class TC_2_ForgotYourPasswordTest extends BaseOrCommon {
	
	LoginPage lp;
	
	ForgotYourPasswordMethods fpm;
		
	@BeforeSuite
	public void launchBrowser() throws IOException {
		
		browserLaunching("chrome");
		
		lp = new LoginPage(driver);		
		
		fpm = new ForgotYourPasswordMethods(driver);
		
		System.out.println("in @BeforeSuite method");	
		
		screenhsot("TC_2_ForgotYourPasswordTest_LaunchBrowser");
	}
	
	@BeforeTest
	public void launchURL() {
		
		URLLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("in @BeforeTest method");		

	}

	@BeforeClass
	public void maxmizeTheBrowser() {
		
		maximizeTheBrowser();
		
		System.out.println("in @BeforeClass method");		

	}
	
	@BeforeMethod
	public void waiting() {
		
		waits();
		
		System.out.println("in @BeforeMethod method");			
	}
	
	@Test (priority = 0)
	public void clickForgotYourPasswordLink() throws IOException {
		
		screenhsot("TC_2_ForgotYourPasswordTest_clickForgotYourPasswordLink");
		
		lp.clickForgotYourPassword();
		
		System.out.println("in clickForgotYourPasswordLink method");			

	}
	
	@Test (priority = 1)
	public void enterUsername() throws IOException {
		
		fpm.enterUsername();
		
		screenhsot("TC_2_ForgotYourPasswordTest_enterUsername");
		
		System.out.println("in enterUsername method");
	}
	
	@Test (priority = 2)
	public void clickCancelButton() {
		
		fpm.clickCancel();
		
		System.out.println("in clickCancelButton method");	
	}
	
	@AfterMethod
	public void waiting1() {
		
		waits();
		
		System.out.println("in @AfterMethod method");			
	}
	
	@AfterSuite
	public void closeBrowser() throws IOException {
		
		screenhsot("TC_2_ForgotYourPasswordTest_closeBrowser");
		
	    browserClosing();
		
		System.out.println("in @AfterSuite method");
		
	}
}
