package objectrepositorykuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OFileDownload {
WebDriver driver;
public OFileDownload(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public
@FindBy(xpath="//a[contains(text(),'File Download')]")
WebElement FileDownloadlink;

public
@FindBy(xpath="//a[contains(text(),'msword.docx')]")
WebElement Selectafile;

public WebElement FileDownloadlink() {
	return FileDownloadlink;
}

public WebElement Selectafile() {
	return Selectafile;
}

}
