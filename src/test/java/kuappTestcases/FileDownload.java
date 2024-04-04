package kuappTestcases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectrepositorykuapp.OFileDownload;

public class FileDownload {

	@Test
	public void FileDownloads() {
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");
		OFileDownload ku = new OFileDownload(driver);
		ku.FileDownloadlink().click();
		ku.Selectafile.click();
		driver.close();

	}

}
