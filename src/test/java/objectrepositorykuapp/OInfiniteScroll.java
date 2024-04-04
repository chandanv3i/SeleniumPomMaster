package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OInfiniteScroll {
WebDriver driver;
public OInfiniteScroll(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'Infinite Scroll')]")
WebElement infiniteScrolllink;

public WebElement infiniteScrolllink() {
	return infiniteScrolllink;
}

}
