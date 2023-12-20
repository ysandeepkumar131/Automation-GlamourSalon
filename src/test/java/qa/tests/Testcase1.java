package qa.tests;


import org.testng.annotations.Test;

import PageEvent.HomePageEvents;
import PageEvent.LoginPageEvents;
import base.BaseTest;
import utils.ElementFetch;

public class Testcase1 extends BaseTest {
 
	ElementFetch ele=new ElementFetch();
	HomePageEvents homePage=new HomePageEvents();
	LoginPageEvents loginPage=new LoginPageEvents();
	@Test
  public void sampleMethodForCredentials() {
		
		homePage.signInButton();
		//loginPage.verifyLoginPageIsLoaded();
		loginPage.enterCredentials();
		
		
  }
}
