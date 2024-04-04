package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import objectrepositorykuapp.OAddRemoveElement;

public class OAddRemoveElement {

	WebDriver driver;

	public OAddRemoveElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public @FindBy(xpath = "//div//a[contains(text(),'Add/Remove Elements')]") WebElement AddRemoveElements;

	@FindBy(xpath = "//div//h3[contains(text(),'Add/Remove Elements')]")
	public WebElement verifyaddRemovegpage;

	@FindBy(xpath = "//div//button[contains(text(),'Add Element')]")
	public WebElement addelementbutton;

	@FindBy(xpath = "//div//button[contains(text(),'Delete')]")
	public WebElement deleteelementbutton;

	public WebElement AddRemoveElements() {
		return AddRemoveElements;
	}

	public WebElement verifyaddRemovegpage() {
		return verifyaddRemovegpage;
	}

	public WebElement addelementbutton() {
		return addelementbutton;
	}

	public WebElement deleteelementbutton() {
		return deleteelementbutton;
	}
}
