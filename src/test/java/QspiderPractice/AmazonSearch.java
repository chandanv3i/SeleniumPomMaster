package QspiderPractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


		public class AmazonSearch {


		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 driver.get("https://www.amazon.in");
				Thread.sleep(5000);
				 System.out.print("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
			   // Find elements using tag name
			 // driver.findElement(By.id("//*[@id=\"searchDropdownBox\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).sendKeys("Digital device");
			
			 System.out.print("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@NO ERROR@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		driver.close();
		}
	}


