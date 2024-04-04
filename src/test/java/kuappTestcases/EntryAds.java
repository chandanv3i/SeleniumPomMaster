package kuappTestcases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepositorykuapp.OEntryAds;

public class EntryAds {

	@Test
	public void OEntryAds(){
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");
		OEntryAds ku = new OEntryAds(driver);
		ku.EntryAdslink.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//ku.modalclosebutton.click();
		//driver.switchTo().activeElement();
		driver.switchTo().frame(ku.modaltitle);	
		String modal = ku.modaltitle.getText();
				System.out.println("Modal ads displayed" + modal);	
				ku.modalclosebutton.click();
//		if(ku.modaltitle.isDisplayed()) {
//			ku.modalclosebutton.click();
//			System.out.println("Modal ads displayed");
//		}else{
//			ku.clickherelink.click();
//			ku.modaltitle.isDisplayed();
//			ku.modalclosebutton.click();
//			System.out.println("Modal ads displayed");
//		}
		
		driver.close();

	}

}
