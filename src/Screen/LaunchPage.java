package Screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LaunchPage {
	
	@FindBy(xpath="//*[@resource-id=\"com.amazon.mShop.android.shopping:id/sign_in_button\"]")

   MobileElement signInButton;
	
	@FindBy(xpath="//*[@resource-id=\"com.amazon.mShop.android.shopping:id/skip_sign_in_button\"]")
	
	   MobileElement skipSignInButton;
		
	public LaunchPage(WebDriver driver)
	{
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void tapOnSignInButton()
	{
		signInButton.click();
	}
	
	
	
	public  void tapOnSkipSignInButton()
	{
		skipSignInButton.click();
	}
}
