package kuappTestcases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import objectrepositorykuapp.OInfiniteScroll;

public class InfiniteScroll {

	@Test
	public void OInfiniteScroll() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");
		OInfiniteScroll ku = new OInfiniteScroll(driver);
		ku.infiniteScrolllink.click();
		final long NANOSEC_PER_SEC = 1000l*1000*1000;

		long startTime = System.nanoTime();
		while ((System.nanoTime()-startTime)< 5*60*NANOSEC_PER_SEC){
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			// Scroll vertically downward by 250 pixels
			jse.executeScript("window.scrollBy(0,500)", "");
		}
		driver.close();
		
	}

}
