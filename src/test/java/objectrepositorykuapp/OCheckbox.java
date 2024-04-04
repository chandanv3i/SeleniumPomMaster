package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OCheckbox {
WebDriver driver;
public OCheckbox(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'Checkboxes')]")
WebElement Checkboxlink;

@FindBy(xpath="(//div//input[@type='checkbox'])[1]")
public
WebElement checkbox1;

@FindBy(xpath="(//div//input[@type='checkbox'])[2]")
public
WebElement checkbox2;

public WebElement Checkboxlink() {
	return Checkboxlink;
}
public WebElement checkbox1() {
	return checkbox1;
}

public WebElement checkbox2() {
	return checkbox2;
}

}
