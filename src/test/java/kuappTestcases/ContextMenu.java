package kuappTestcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectrepositorykuapp.OContextMenu;

public class ContextMenu {

	@Test
	public void ContextMenu() {
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");

		OContextMenu ku = new OContextMenu(driver);
		ku.ContextMenulink.click();
		Actions action = new Actions(driver);
		WebElement rightClickElement = ku.ContextMenubox;
		// contextClick() method to do right click on the element
		new Actions(driver).contextClick(rightClickElement).perform();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.navigate().back();

	}

}
