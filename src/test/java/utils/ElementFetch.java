package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseTest.CommonTest;

public class ElementFetch{

	public WebElement getWebElement(String locatorType, String locatorValue)
	{
		switch(locatorType)
		{
			case "XPATH":
			return CommonTest.driver.findElement(By.xpath(locatorValue));
			
			case "CSSS ELECTOR":
				return CommonTest.driver.findElement(By.cssSelector(locatorValue));
				
			case "NAME":
				return CommonTest.driver.findElement(By.name(locatorValue));
				
			case "TAG NAME":
				return CommonTest.driver.findElement(By.tagName(locatorValue));
			
			case "LINK":
				return CommonTest.driver.findElement(By.linkText(locatorValue));
				
			case "PARTIAL LINK TEXT":
				return CommonTest.driver.findElement(By.partialLinkText(locatorValue));
				
			case "CLASS":
				return CommonTest.driver.findElement(By.className(locatorValue));
				
			case "ID":
			return CommonTest.driver.findElement(By.id(locatorValue));
			default:
				return null;
		}
	}
	
	public List<WebElement> getWebElements(String locatorType, String locatorValue)
	{
		switch(locatorType)
		{
			case "XPATH":
			return CommonTest.driver.findElements(By.xpath(locatorValue));
			
			case "CSSS ELECTOR":
				return CommonTest.driver.findElements(By.cssSelector(locatorValue));
				
			case "NAME":
				return CommonTest.driver.findElements(By.name(locatorValue));
				
			case "TAG NAME":
				return CommonTest.driver.findElements(By.tagName(locatorValue));
			
			case "LINK":
				return CommonTest.driver.findElements(By.linkText(locatorValue));
				
			case "PARTIAL LINK TEXT":
				return CommonTest.driver.findElements(By.partialLinkText(locatorValue));
				
			case "CLASS":
				return CommonTest.driver.findElements(By.className(locatorValue));
				
			case "ID":
			return CommonTest.driver.findElements(By.id(locatorValue));
			default:
				return null;
		}
	}
}
