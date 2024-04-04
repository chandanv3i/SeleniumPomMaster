package kuappTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectrepositorykuapp.OFileUpload;

public class FileUpload {

	@Test
	public void FileUploads() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");
		OFileUpload ku = new OFileUpload(driver);
		ku.FileUploadlink.click();
		WebElement file=driver.findElement(By.xpath("//input[@id='file-upload']"));
	    file.sendKeys("C:\\Users\\Chandan\\Desktop\\not c.txt");
	 	driver.findElement(By.id("file-submit")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
