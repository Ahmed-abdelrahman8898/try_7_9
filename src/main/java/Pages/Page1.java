package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page1 extends PageBase {

	public Page1(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//*[@title='Anmelden']")
	WebElement ele1;
	
	public WebElement getEle1() {
		return ele1;
	}

	public void setEle1(String text) {
		this.ele1.sendKeys(text);
	}

	

	public void openregister() {
		ele1.click();
	}
}
