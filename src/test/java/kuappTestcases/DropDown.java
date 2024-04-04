package kuappTestcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepositorykuapp.ODropDown;

public class DropDown {

	@Test
	public void ODragnDrop(){
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");

		ODropDown ku = new ODropDown(driver);
		ku.DropDownlink.click();
		ku.Option1.click();
	
		driver.navigate().back();
		driver.close();

	}

}
