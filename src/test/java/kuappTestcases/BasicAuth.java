package kuappTestcases;

import java.awt.AWTException;
import java.time.Duration;

import org.codehaus.jackson.map.deser.ValueInstantiators.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import baseTest.CommonTest;
import objectrepositorykuapp.OBasicAuth;

public class BasicAuth extends CommonTest{

	@Test
	public void BasicAuthh() throws AWTException {
		String username = "admin";
		String password = "admin";
		String URL = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(URL);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		OBasicAuth ku = new OBasicAuth(driver);
		ku.verifyBasicAuthgpage.isDisplayed();
		System.out.println("Sucessfully logged IN");
		driver.navigate().back();

	}
}
