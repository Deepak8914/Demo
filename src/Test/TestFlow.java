package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Comman.InfoMethods;
import Screen.CheckoutPage;
import Screen.HomePage;
import Screen.LaunchPage;
import Screen.LoginPage;
import Screen.ProductDetailsPage;
import io.appium.java_client.MobileElement;

public class TestFlow extends InfoMethods {

	@Test(priority = 1)
	public static void loginflow() throws InterruptedException {
		LaunchPage lap=new LaunchPage(driver);
		lap.tapOnSignInButton();		
		LoginPage log=new LoginPage(driver);
		log.signIn(OR.getProperty("username"),OR.getProperty("password"));
		Thread.sleep(1000);
		Assert.assertEquals("com.amazon.identity.auth.device.AuthPortalUIActivity", driver.currentActivity());
	}
		
	@Test(priority = 2)
	public static void searchItem()
	{
		HomePage home=new HomePage(driver);
	    home.EnterKeywordAndSearchItem(driver,"lizoal");
	    Assert.assertEquals("com.amazon.mShop.search.RetailSearchActivity", driver.currentActivity());
	}
	
	
	
	@Test(priority = 3)
	public void addItemToCard()
	{
		HomePage home=new HomePage(driver);
		home.getProductDetail();
//		ProductDetailsPage pdp=new ProductDetailsPage(driver);
//		pdp.clickBuyNowButton(driver);
		System.out.println(driver.currentActivity());

	}
	
	@Test(priority=4)
	public void cardcheckOut() throws InterruptedException
	{
	 MobileElement cartButtonElement=driver.findElementByAccessibilityId("Cart");
	 cartButtonElement.click();
	 CheckoutPage checkoutPage=new CheckoutPage(driver);
	 checkoutPage.proceedToBuy();
	 checkoutPage.deliverToAddress();
	 checkoutPage.clickContinueButton();
	 checkoutPage.clickNetBankingRadioButton();
	 checkoutPage.selectBankName();
	 checkoutPage.clickContinueButton();
	 Assert.assertEquals("com.amazon.mShop.opl.web.WebPurchaseActivity", driver.currentActivity());
	}
		
	}
	
	
	public void debugg() throws InterruptedException
	{
		loginflow();
		searchItem();
		
	//	driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
		
}
}
	