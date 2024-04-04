package kuappTestcases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import objectrepositorykuapp.OHover;

public class Hover {

	@Test
	public void HorizontalSliderr() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");
		OHover ku = new OHover(driver);
		ku.Hoverlink.click();
		WebElement img1 = ku.image1;
		Actions action = new Actions(driver);
		WebElement img2 = ku.image2;
		WebElement img3 = ku.image2;
		WebElement viewprofile = ku.image2;
        action.moveToElement(img1).moveToElement(img2);
        action.moveToElement(img1).moveToElement(img3).perform();
        ku.viewprofile1.click();
		
	}

}
