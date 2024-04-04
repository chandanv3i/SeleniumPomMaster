package kuappTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepositorykuapp.OAddRemoveElement;

public class AddRemoveElement {
	
	@Test
	public void AddRemoveElements(){
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div//h1[contains(text(),'Welcome to the-internet')]")).isDisplayed();
		System.out.println("website opened sucessfully");
	
		OAddRemoveElement ku = new OAddRemoveElement(driver);
		ku.AddRemoveElements.click();
		ku.verifyaddRemovegpage.isDisplayed();
		ku.addelementbutton.isDisplayed();
		ku.addelementbutton.click();
		ku.deleteelementbutton.isDisplayed();
		ku.deleteelementbutton.click();
		
		
//		if(ku.deleteelementbutton.isDisplayed()==false){
//			System.out.println("No element displayed");
//		}else{
//			System.out.println("Element displayed");
//			
//		};
		//driver.navigate().back();
		
		
	}
	public boolean verifyelementNotDisplayed() {
		WebDriver driver = null;
		OAddRemoveElement kup = new OAddRemoveElement(driver);
        try
            {
               if(kup.deleteelementbutton.isDisplayed())
                   return false;
                   else
                 {
                     logMessage("element not displayed");
                  return true;
                 }
            }
            catch(Exception e)
            {
                return false;
            }

    }
	private void logMessage(String string) {
		// TODO Auto-generated method stub
		
	}
}
