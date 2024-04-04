package kuappTestcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepositorykuapp.OCheckbox;

public class Checkbox {
	
	@Test
	public void OCheckbox(){
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");
	
		OCheckbox ku = new OCheckbox(driver);
		ku.Checkboxlink.click();
		ku.checkbox1.isDisplayed();
		ku.checkbox1.click();
		ku.checkbox1.isSelected();
		driver.navigate().back();
		
	}

}
