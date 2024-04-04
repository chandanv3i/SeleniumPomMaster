package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OHorizontalSlider {
WebDriver driver;
public OHorizontalSlider(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'Horizontal Slider')]")
WebElement HorizontalSliderlink;

public
@FindBy(xpath="//input[@type='range']")
WebElement Slider;

public WebElement HorizontalSliderlink() {
	return HorizontalSliderlink;
}

public WebElement Slider() {
	return Slider;
}


}
