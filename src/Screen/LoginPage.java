package Screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	

	@FindBy(xpath = "//*[@resource-id=\"ap_email_login\"]")
    private MobileElement textBoxMobileNumber;
	
	@FindBy(xpath = "//*[@resource-id=\"ap_password\"]")
    private MobileElement textBoxPassword;
	
	@FindBy(xpath = "//*[@resource-id=\"signInSubmit\"]")
    private MobileElement buttonLogin;
	
	@FindBy(xpath = "//*[@resource-id=\"continue\"]")
    private MobileElement buttonContinue;
	
	
	
	public void signIn(String mobile_no,String pass) {
		
			textBoxMobileNumber.sendKeys(mobile_no);
			buttonContinue.click();
			textBoxPassword.sendKeys(pass);
			
			buttonLogin.click();
	
}
}
