package PageEvent;

import PageObject.HomePageElemets;
import utils.ElementFetch;

public class HomePageEvents {
	
	ElementFetch ele=new ElementFetch();
	
	public void signInButton()
	{
		ele.getWebElement("XPATH", HomePageElemets.signInBtn).click();
		
	}
	
}
