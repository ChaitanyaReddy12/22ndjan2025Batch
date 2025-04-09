package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	public WebDriver driver;

	Actions act;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	// Syntax: Syntax:
	/*
	 * 1st way:
	 * 
	 * @FindBy(how = How.XPATH, using ="//*[@class='oxd-userdropdown-name']") public
	 * WebElement user_Dropdown; 2nd way:
	 * 
	 * @FindBy(xpath = "//*[text()='Logout']") public WebElement logout_Tab;
	 */

	// 1st way

	@FindBy(how = How.XPATH, using = "(//*[text()='About' and @href='/about'])[1]")
	public WebElement about_Tab;

	@FindBy(how = How.XPATH, using = "(//*[text()='Pioneering Pathways'])[1]")
	public WebElement pioneeringPathways_Tab;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[text()='Medicines'])[1]")
	public WebElement medicines_Tab;

	// 2nd way

	@FindBy(xpath = "(//*[text()='Science'])[1]")
	public WebElement science_Tab;

	@FindBy(xpath = "(//*[text()='Our Purpose'])[1]")
	public WebElement ourPurpose_Tab;
	
	@FindBy(xpath = "(//*[text()='Our Stories'])[1]")
	public WebElement ourStories_Tab;

	@FindBy(xpath = "(//*[text()='News'])[1]")
	public WebElement news_Tab;

	@CacheLookup
	@FindBy(xpath = "(//*[text()='Investors'])[1]")
	public WebElement investors_Tab;

	@CacheLookup
	@FindBy(xpath = "(//*[text()='Careers'])[1]")
	public WebElement careers_Tab;

	public void verifyAbout() {

		about_Tab.isDisplayed();
	}

	public void verifyPioneeringPathways() {

		pioneeringPathways_Tab.isDisplayed();
	}

	public void verifyMedicines() {

		medicines_Tab.isDisplayed();
	}

	public void verifyScience() {

		science_Tab.isDisplayed();
	}

	public void verifyOurPurpose() {

		ourPurpose_Tab.isDisplayed();
	}
	
	public void verifyOurStories() {

		ourStories_Tab.isDisplayed();
	}

	public void verifyNews() {

		news_Tab.isDisplayed();
	}

	public void verifyInvestors() {

		investors_Tab.isDisplayed();
	}

	public void verifyCareers() {

		careers_Tab.isDisplayed();
	}

	public void mouseHoverToMedicinesMedicines() {

		act = new Actions(driver);

		act.moveToElement(medicines_Tab).build().perform();
	}

}
