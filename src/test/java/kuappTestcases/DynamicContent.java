package kuappTestcases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepositorykuapp.ODynamicContent;

public class DynamicContent {

	@Test
	public void ODragnDrop(){
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");
		ODynamicContent ku = new ODynamicContent(driver);
		ku.DynamicContentlink.click();
		String third_para_text = ku.thirdcontent.getText();
		ku.clickherebutton.click();
		driver.navigate().back();
		String Retake_third_para_text = ku.thirdcontent.getText();
		assertEquals(third_para_text, Retake_third_para_text);
	driver.navigate().back();
		
		driver.close();

	}

}
