package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OBrokenImage {
WebDriver driver;
public OBrokenImage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'Broken Images')]")
WebElement BrokenImageLink;

public WebElement BrokenImageLink() {
	return BrokenImageLink;
}


}
