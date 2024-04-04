package kuappTestcases;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectrepositorykuapp.OMultipleWindow;

public class MultipleWindow {

	@Test
	public void MultipleWindoww() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");
		OMultipleWindow ku = new OMultipleWindow(driver);
		ku.MultipleWindowlink.click();
		ku.ClickHerelink.click();
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set = driver.getWindowHandles();
		System.out.println(set.toString());
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println("Website Text: " + ku.verifynewwindow.getText());
			}
		}
		// This is to switch to the main window
		driver.switchTo().window(mainWindow);
		String multiplewindows = ku.ClickHerelink.getText();
		System.out.println("the text" + multiplewindows);
		Thread.sleep(2000);
		driver.switchTo().window(mainWindow);
		driver.quit();
	}

}
