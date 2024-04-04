package kuappTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import objectrepositorykuapp.OABTesting;
import pageObject.KuAppObject;
import utils.ElementFetch;
import baseTest.CommonTest;


public class ABTesting extends CommonTest{	
//	@Test
//	public void abtest(){
//		System.setProperty("webdriver.chrome.driver", "D://First_selenium//firstmaven//drivers//chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.get("https://the-internet.herokuapp.com/");
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()=\"Welcome to the-internet\"]")));
//		System.out.println("website opened sucessfully");
//		OABTesting ku = new OABTesting(driver);
//		ku.adtestingtext.click();
//		ku.verifyabtestingpage.isDisplayed();
//		driver.navigate().back();
//		
//		
//	}
	
	ElementFetch locate = new 	ElementFetch();
	@Test
	public void ABTestings()
	{
	locate.getWebElement("XPATH", KuAppObject.ABTesting).click();
	locate.getWebElement("XPATH", KuAppObject.ABTestingLink).isDisplayed();
	}

}
