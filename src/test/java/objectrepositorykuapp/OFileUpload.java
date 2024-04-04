package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OFileUpload {
WebDriver driver;
public OFileUpload(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'File Upload')]")
WebElement FileUploadlink;

public
@FindBy(xpath="//a[contains(text(),'msword.docx')]")
WebElement Selectafile;

public WebElement FileUploadlink() {
	return FileUploadlink;
}

public WebElement Selectafile() {
	return Selectafile;
}

}
