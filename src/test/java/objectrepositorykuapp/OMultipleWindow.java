package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OMultipleWindow {
WebDriver driver;
public OMultipleWindow(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'Multiple Windows')]")
WebElement MultipleWindowlink;

public
@FindBy(xpath="//a[contains(text(),'Click Here')]")
WebElement ClickHerelink;

public
@FindBy(xpath="//div[@class='example']")
WebElement verifynewwindow;



public WebElement ClickHerelink() {
	return ClickHerelink;
}

public WebElement MultipleWindowlink() {
	return MultipleWindowlink;
}

public WebElement verifynewwindow() {
	return verifynewwindow;
}
}
