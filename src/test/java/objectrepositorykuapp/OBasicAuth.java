package objectrepositorykuapp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import objectrepositorykuapp.OBasicAuth;

public class OBasicAuth {
	
	WebDriver driver;
	public OBasicAuth(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div//p[contains(text(), 'Congratulations! You must have the proper credentials.')]")
	public
	WebElement verifyBasicAuthgpage;
	
		public WebElement verifyBasicAuthgpage() {
			return verifyBasicAuthgpage;
		}
		
		
	}
	
