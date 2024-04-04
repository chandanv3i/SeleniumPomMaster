package baseTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class CommonTest {
	public static WebDriver driver;
	public WebDriverWait wait;
	static ExtentTest test;
	static ExtentReports report;
//	@BeforeClass
//	public static void startTest()
//	{
//	report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
//	test = report.startTest("ExtentDemo");
//	}
	
	@BeforeTest
	public void launch() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://First_selenium//firstmaven//drivers//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()=\"Welcome to the-internet\"]")));
		System.out.println("website opened sucessfully");
	}
@AfterTest
	public void Closerowser() {
		driver.close();
	}

}
