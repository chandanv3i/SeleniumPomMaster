package kuappTestcases;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectrepositorykuapp.ODeepDom;

public class DeepDom {

	@Test
	public void DeepDomm(){
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");
		ODeepDom ku = new ODeepDom(driver);
		ku.DeepDomlink.click();
	System.out.println("alldata"+ driver.findElement(By.id("sibling-50.1")).getText());
		//from selenium.common.exceptions import NoSuchElementException
		List<WebElement> divlist=driver.findElements(By.xpath("//div[@class='example']/div"));
		System.out.println("list1"+divlist.size());
		WebElement lastdiv=divlist.get(1);
		System.out.println("lastlist2"+lastdiv.findElements(By.xpath("//div")).size());
	System.out.println("lastdiv"+ lastdiv.findElements(By.xpath("//div")).get(261).getText());
		    driver.close();
		
		driver.close();
		
	}

}
