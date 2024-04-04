package kuappTestcases;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import objectrepositorykuapp.OKeyPress;

public class keypress {

	@Test
	public void keypresss() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");
		OKeyPress ku = new OKeyPress(driver);
		ku.KeyPresslink.click();
		ku.inputfield.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_F);
		String actualtext = "You entered: F";
		String fieldtext = ku.inputresult.getText();
		System.out.println("Result Output"+fieldtext );
		assertEquals(fieldtext, actualtext);
		Thread.sleep(5000);
		driver.close();
		
	}

}
