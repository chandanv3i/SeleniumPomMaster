package kuappTestcases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectrepositorykuapp.OFloatingMenu;

public class FloatingMenu {

	@Test
	public void FloatingMenuu() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");
		OFloatingMenu ku = new OFloatingMenu(driver);
		ku.FloatingMenulink.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// Scroll vertically downward by 250 pixels
		jse.executeScript("window.scrollBy(0,500)", "");
		ku.newsbutton.isDisplayed();
		// Scroll vertically upward by 250 pixels
		jse.executeScript("window.scrollBy(0,-500)", "");
		// Scroll vertically downward by 250 pixels
		jse.executeScript("window.scrollBy(0,800)", "");
		ku.Contactbutton().isDisplayed();
		driver.navigate().back();
	}

}
