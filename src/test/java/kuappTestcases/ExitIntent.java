package kuappTestcases;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectrepositorykuapp.OEntryAds;

public class ExitIntent {

	@Test
	public void OEntryAds() throws AWTException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");
		OEntryAds ku = new OEntryAds(driver);
//	driver.findElement(By.linkText("Exit Intent")).click();
//	Actions actions=new Actions(driver);
//		
//		actions.build().perform();
//		Robot robot = new Robot();
//		robot.mouseMove(0,100);
//		WebElement path = driver.findElement(By.xpath("//div[@class='modal-footer']/p[contains(text(),'Close')]"));
//		 actions.moveToElement(path).build().perform();
//	actions.clickAndHold();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'File Download')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'msword.docx')]")).click();
		driver.switchTo().alert().accept();
  // driver.get("http://the-internet.herokuapp.com/");
    Thread.sleep(2000);
		//driver.close();

	}

}
