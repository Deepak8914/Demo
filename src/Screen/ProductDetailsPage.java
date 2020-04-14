package Screen;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

import Comman.InfoMethods;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductDetailsPage {

	@FindBy(xpath = "//*[@resource-id='icp-btn-close-announce']")
    private MobileElement buttonCancelLanguageSelection;
	
	@FindBy(xpath = "//*[@resource-id='titleExpander']")
	private MobileElement labelProductTitle;
	
	@FindBy(xpath = "//*[@resource-id='buyNowCheckout']")
	private MobileElement buttonBuyNow;
	
	

	
	public ProductDetailsPage(AndroidDriver<MobileElement> driver) {
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	
	public void clickBuyNowButton(AndroidDriver<MobileElement> driver) {
		
		buttonCancelLanguageSelection.click();
		try {
			
			while(!(buttonBuyNow.isDisplayed())){ 	
		     InfoMethods.swipeVeritcal(driver, 0.9, 0.2, 2); //Scroll Down till Buy Now button displayed
				//debug
			//	driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
				// buttonCancelLanguageSelection.click();
				
			
			}
			
			buttonBuyNow.click();
			
		} catch (Exception e) {
			Assert.fail("Failed to click Buy Now button");
		}
		
	}
}
