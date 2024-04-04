package kuAppTest;

import org.apache.xmlbeans.impl.xb.xsdschema.Element;

import pageObject.KuAppObject;
import utils.ElementFetch;

public class TestCases {

	ElementFetch locate = new 	ElementFetch();
	public void ABTesting()
	{
	locate.getWebElement("XPATH", KuAppObject.ABTesting).click();
	locate.getWebElement("XPATH", KuAppObject.ABTestingLink).isDisplayed();
	}
}
