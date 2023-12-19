package PageEvent;


import PageObject.ForgotPassword;
import PageObject.LoginPageElemets;
import utils.ElementFetch;
import org.testng.Assert;

public class LoginPageEvents {

	
	ElementFetch ele=new ElementFetch();
	
	
	public void verifyLoginPageIsLoaded()
	{
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElemets.LoginText).size()==0,"Login");
	}
    public void enterCredentials()
	{
		ele.getWebElement("XPATH",LoginPageElemets.emailAddress).sendKeys("000000nkrk@gmail.com");
		ele.getWebElement("XPATH",LoginPageElemets.passwordField).sendKeys("nksjrrj");
        ele.getWebElement("XPATH",ForgotPassword.Forgotpassword).click();
        ele.getWebElement("XPATH",ForgotPassword.ForgotResendmail).sendKeys("Raju@gmail.com");
	
	}
}
