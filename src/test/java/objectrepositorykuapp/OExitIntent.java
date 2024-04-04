package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OExitIntent {
WebDriver driver;
public OExitIntent(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'Entry Ad')]")
WebElement EntryAdslink;

public
@FindBy(xpath="//a[contains(text(),'click here')]")
WebElement clickherelink;

public
@FindBy(xpath="//div[@class='modal-footer']/p[contains(text(),'Close')]")
WebElement modalclosebutton;

public
@FindBy(xpath="//div[@class='modal-title']/h3[contains(text(),'This is a modal window')]")
WebElement modaltitle;


public WebElement EntryAdslink() {
	return EntryAdslink;
}

public WebElement clickherelink() {
	return clickherelink;
}
public WebElement modalclosebutton() {
	return modalclosebutton;
}

public WebElement modaltitle() {
	return modaltitle;
}

}
