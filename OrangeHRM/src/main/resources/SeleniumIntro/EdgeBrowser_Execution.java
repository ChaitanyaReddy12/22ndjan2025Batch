package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser_Execution {

	public static void main(String[] args) {

		/*
		 * Syntax: interface objectname = new classname();
		 */
		
		//System.setProperty("webdriver.chrome.driver", "path of teh browser extension");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();

	}

}
