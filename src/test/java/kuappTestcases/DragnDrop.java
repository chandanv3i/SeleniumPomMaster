                      package kuappTestcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectrepositorykuapp.ODragnDrop;

public class DragnDrop {

	@Test
	public void ODragnDrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");

		ODragnDrop ku = new ODragnDrop(driver);
		ku.DragnDroplink.click();
		WebElement block1 = ku.box1;
		WebElement block2 =ku.box2;
		Actions actions = new Actions(driver);
		actions.dragAndDrop(block2, block1).build().perform();
		driver.navigate().back();
		driver.close();
	}

}   
