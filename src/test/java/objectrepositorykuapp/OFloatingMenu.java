package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OFloatingMenu {
WebDriver driver;
public OFloatingMenu(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'Floating Menu')]")
WebElement FloatingMenulink;

public
@FindBy(xpath="//a[contains(text(),'News')]")
WebElement newsbutton;

public
@FindBy(xpath="//a[contains(text(),'Contact')]")
WebElement Contactbutton;

public WebElement FloatingMenulink() {
	return FloatingMenulink;
}

public WebElement newsbutton() {
	return newsbutton;
}
public WebElement Contactbutton() {
	return Contactbutton;
}

}
