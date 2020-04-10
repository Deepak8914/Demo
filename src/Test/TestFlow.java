package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Comman.InfoMethods;
import Screen.HomePage;
import Screen.LoginPage;

public class TestFlow extends InfoMethods {

	@Test
	public void loginflow() throws InterruptedException {
		login_flow();
		LoginPage log=new LoginPage(driver);
		log.signIn(OR.getProperty("username"),OR.getProperty("password"));
		Thread.sleep(1000);
		Assert.assertEquals("com.amazon.identity.auth.device.AuthPortalUIActivity", driver.currentActivity());
	}
		
		
	@Test
	public void searchItem()
	{
		HomePage home=new HomePage(driver);
		home.EnterKeywordAndSearchItem(driver,"lizoal");
		//search of item is completed and selection from list is pending.
		
	}
	
	
	@Test
	public void addItemToCard()
	{
		//pending
		
	}
	
	@Test
	public void cardcheckOut()
	{
		//pending
		
	}
}
	