package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OContextMenu {
WebDriver driver;
public OContextMenu(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'Context Menu')]")
WebElement ContextMenulink;

@FindBy(xpath="//div[@id='hot-spot']")
public
WebElement ContextMenubox;

public WebElement ContextMenulink() {
	return ContextMenulink;
}
public WebElement ContextMenubox() {
	return ContextMenubox;
}


}
