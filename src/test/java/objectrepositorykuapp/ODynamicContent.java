package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ODynamicContent {
WebDriver driver;
public ODynamicContent(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'Dynamic Content')]")
WebElement DynamicContentlink;

public
@FindBy(xpath="(//div[@class='large-10 columns'])[3]")
WebElement thirdcontent;

public
@FindBy(xpath="//a[contains(text(),'click here')]")
WebElement clickherebutton;

public WebElement DynamicContentlink() {
	return DynamicContentlink;
}

public WebElement thirdcontent() {
	return thirdcontent;
}
public WebElement clickherebutton() {
	return clickherebutton;
}

}
