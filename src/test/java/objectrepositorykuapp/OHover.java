package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OHover {
WebDriver driver;
public OHover(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'Hovers')]")
WebElement Hoverlink;

public
@FindBy(xpath="(//img[@alt='User Avatar'])[1]")
WebElement image1;

public
@FindBy(xpath="(//img[@alt='User Avatar'])[2]")
WebElement image2;

public
@FindBy(xpath="(//img[@alt='User Avatar'])[3]")
WebElement image3;

public
@FindBy(xpath="(//a[contains(text(),'View profile')])[1]")
WebElement viewprofile1;

public WebElement Hoverlink() {
	return Hoverlink;
}

public WebElement image1() {
	return image1;
}

public WebElement image2() {
	return image2;
}

public WebElement image3() {
	return image3;
}
public WebElement viewprofile1() {
	return viewprofile1;
}
}
