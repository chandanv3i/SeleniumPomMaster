package kuappTestcases;

/*import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepositorykuapp.OBrokenImage;

public class BrokenImage {
	
	@Test
	public void abtest(){
		System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("website opened sucessfully");
	
		OBrokenImage ku = new OBrokenImage(driver);
		ku.BrokenImageLink.click();
		List< WebElement > image_list = driver.findElements(By.tagName("img"));
		System.out.println("chandann" + image_list);
		
		
	}

}
*/


import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
 
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import java.net.URL;
 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class BrokenImage
{
    /*  protected static ChromeDriver driver; */
	
    WebDriver driver = null;
    
    String URL = "https://the-internet.herokuapp.com/broken_images";
    public static String status = "passed";
//    String username = "user-name";
//    String access_key = "access-key";
 
   @BeforeClass
  public void testSetUp() throws MalformedURLException {
	   System.setProperty("webdriver.chrome.driver", "D://browser driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
   }
 
    @Test(description="Approach 1: Find broken images on a web page using Selenium WebDriver", enabled=true)
    protected void test_selenium_broken_images_appr_1()
    {
        Integer iBrokenImageCount = 0;
 
        driver.navigate().to(URL);
        driver.manage().window().maximize();
 
        try
        {
            iBrokenImageCount = 0;
            List<WebElement> image_list = driver.findElements(By.tagName("img"));
            /* Print the total number of images on the page */
            System.out.println("The page under test has " + image_list.size() + " images");
            for (WebElement img : image_list)
            {
                if (img != null)
                {
                    HttpClient client = HttpClientBuilder.create().build();
                    HttpGet request = new HttpGet(img.getAttribute("src"));
                    HttpResponse response = client.execute(request);
                    /* For valid images, the HttpStatus will be 200 */
                    if (response.getStatusLine().getStatusCode() != 200)
                    {
                        System.out.println(img.getAttribute("outerHTML") + " is broken.");
                        iBrokenImageCount++;
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            status = "failed";
            System.out.println(e.getMessage());
        }
        status = "passed";
        System.out.println("The page " + URL + " has " + iBrokenImageCount + " broken images");
    }
 
    @Test(description="Approach 2: Find broken images on a web page using Selenium WebDriver", enabled = true)
    protected void test_selenium_broken_images_appr_2()
    {
        Integer iBrokenImageCount = 0;
 
        driver.navigate().to(URL);
        driver.manage().window().maximize();
 
        try
        {
            iBrokenImageCount = 0;
            List<WebElement> image_list = driver.findElements(By.tagName("img"));
            /* Print the total number of images on the page */
            System.out.println("The page under test has " + image_list.size() + " images");
            for (WebElement img : image_list)
            {
                if (img != null)
                {
                    if (img.getAttribute("naturalWidth").equals("0"))
                    {
                        System.out.println(img.getAttribute("outerHTML") + " is broken.");
                        iBrokenImageCount++;
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            status = "failed";
            System.out.println(e.getMessage());
        }
        status = "passed";
        System.out.println("The page " + URL + " has " + iBrokenImageCount + " broken images");
    }
 
//    @AfterClass
//    public void tearDown()
//    {
//        if (driver != null) {
//            ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
//            driver.quit();
//        }
//    }
}
