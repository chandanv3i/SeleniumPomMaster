package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OABTesting {
WebDriver driver;
public OABTesting(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'A/B Testing')]")
WebElement adtestingtext;

@FindBy(xpath="//h3[contains(text(),'A/B Test Control')]")
public
WebElement verifyabtestingpage;

public WebElement adtestingtext() {
	return adtestingtext;
}

public WebElement verifyabtestingpage() {
	return verifyabtestingpage;
}

/*By adtext=By.xpath("//a[contains(text(),'A/B Testing')]");

public WebElement option1() {
	return driver.findElement(adtext);
}
*/
}
