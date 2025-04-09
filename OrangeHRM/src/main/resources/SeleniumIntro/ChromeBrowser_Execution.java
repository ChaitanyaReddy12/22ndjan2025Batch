package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser_Execution {

	public static void main(String[] args) {

		/*
		 * Syntax: interface objectname = new classname();
		 */
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		
		driver.get("https://www.jazzpharma.com/")
		
		
	}

}
