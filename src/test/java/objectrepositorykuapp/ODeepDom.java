package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ODeepDom {
WebDriver driver;
public ODeepDom(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'Large & Deep DOM')]")
WebElement DeepDomlink;

public WebElement DeepDomlink() {
	return DeepDomlink;
}

}
