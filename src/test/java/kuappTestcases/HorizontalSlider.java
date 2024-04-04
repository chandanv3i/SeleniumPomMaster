package kuappTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import objectrepositorykuapp.OHorizontalSlider;

public class HorizontalSlider {

	@Test
	public void HorizontalSliderr() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");
		OHorizontalSlider ku = new OHorizontalSlider(driver);
		//Horizontal Slider---------------done
		ku.HorizontalSliderlink.click();
		Thread.sleep(2000);
		WebElement element = ku.Slider;
		org.openqa.selenium.Dimension dim=element.getSize();
		int sliderwid=dim.getWidth();
		int xcor=element.getLocation().getX();
		Actions actios=new Actions(driver);
		actios.moveToElement(element).dragAndDropBy(element, 2, 0).build().perform();	
		driver.navigate().back();
	
	}

}
