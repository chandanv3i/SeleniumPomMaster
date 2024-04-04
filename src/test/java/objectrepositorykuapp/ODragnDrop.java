package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ODragnDrop {
WebDriver driver;
public ODragnDrop(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'Drag and Drop')]")
WebElement DragnDroplink;

public
@FindBy(xpath="//div[@id='column-a']")
WebElement box1;

public
@FindBy(xpath="//div[@id='column-b']")
WebElement box2;

public WebElement DragnDroplink() {
	return DragnDroplink;
}

public WebElement box1() {
	return box1;
}
public WebElement box2() {
	return box2;
}
}
