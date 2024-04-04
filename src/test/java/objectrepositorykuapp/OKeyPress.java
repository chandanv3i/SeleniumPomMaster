package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OKeyPress {
WebDriver driver;
public OKeyPress(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'Key Presses')]")
WebElement KeyPresslink;

public
@FindBy(xpath="//input[@type='text']")
WebElement inputfield;

public
@FindBy(xpath="//p[@id='result']")
WebElement inputresult;


public WebElement KeyPresslink() {
	return KeyPresslink;
}

public WebElement inputfield() {
	return inputfield;
}

public WebElement inputresult() {
	return inputresult;
}
}
