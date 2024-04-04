package kuappTestcases;
import java.io.File;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import eu.bitwalker.useragentutils.Utils;
public class screenshot {

	public static void main(String[] args) throws IOException {
	
		 
		
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");

		WebDriver driver =new ChromeDriver();
        
        //navigate to url
        driver.get("https://demoqa.com");
        
       //Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\Chandan\\Desktop\\ankit photo\\homePageScreenshot.png"));
        //Copy the file to a location and use try catch block to handle exception
//        try {
//            FileUtils.copyFile(screenshot, new File("C:\\Users\\Chandan\\Desktop\\ankit photo\\homePageScreenshot.png"));
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        
        //closing the webdriver
        driver.close();

		

	
System.setProperty("webdriver.chrome.driver"," webdriver path");
WebDriver driverr = new ChromeDriver();
driver.navigate().to("https://demoqa.com");
File screenshot1 = ((TakesScreenshot)driverr).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshot1, new File("jhashfgahgfa"));

System.setProperty("webDriver.Chrome.driver", "location");
WebDriver driver1 = new ChromeDriver();
driver.navigate().to("URL");
File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshot2, new File("asdasdasdas"));
driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(34));

WebDriverWait driver4 = new WebDriverWait(driver, Duration.ofSeconds(22));
driver4.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
    }
	}
