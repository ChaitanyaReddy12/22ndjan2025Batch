package TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_3_DataProviders extends BaseOrCommon {

	@BeforeSuite
	public void launchBrowser() {

		browserLaunching("chrome");

		System.out.println("in @BeforeSuite method");
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

	/*
	 * Syntax:
	 * 
	 * @dataprovider(name = “harsitha”) Public Object[][] methodname(){
	 * 
	 * }
	 * 
	 * @test(dataprovider = “harsitha”) Public void methodname(){
	 * 
	 * }
	 */
	
	@DataProvider(name = "harsitha") 
	public Object[][] credentials(){
		
	    Object[][] values = new Object[3][2];
	    
	    values[0][0] = "Asra";
	    values[0][1] = "Asra@testing.com";
	    
	    values[1][0] = "Naven";
	    values[1][1] = "Naven@testing.com";
	    
	    values[2][0] = "Harish";
	    values[2][1] = "Harish@testing.com";
	    
	    return values;   
	}

	@Test(priority = 1, dataProvider = "harsitha")
	public void enterCredentials(String username, String passsword) {
		
		driver.findElement(By.xpath("//input[@name='username']")).clear();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name='password']")).clear();

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passsword);

		System.out.println("in enterPassword method");

	}

	@AfterMethod
	public void waiting1() {

		waits();

		System.out.println("in @AfterMethod method");
	}

	@AfterSuite
	public void closeBrowser() {

		browserClosing();

		System.out.println("in @AfterSuite method");

	}
}
