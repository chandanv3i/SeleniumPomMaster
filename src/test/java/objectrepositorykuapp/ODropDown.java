package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ODropDown {
WebDriver driver;
public ODropDown(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'Dropdown')]")
WebElement DropDownlink;

public
@FindBy(xpath="//select[@id='dropdown']")
WebElement DropDown;

public
@FindBy(xpath="//option[contains(text(),'Option 1')]")
WebElement Option1;

public WebElement DragnDroplink() {
	return DropDownlink;
}

public WebElement DropDown() {
	return DropDown;
}
public WebElement Option1() {
	return Option1;
}
}
