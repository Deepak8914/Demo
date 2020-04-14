package Screen;

import java.util.List;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class CheckoutPage {

	

	@FindBy(xpath = "//*[@text='Continue']")
	private MobileElement buttonContinue;
	
	@FindBy(xpath = "//*[@resource-id='a-autoid-0-announce']")
	private MobileElement buttonUseThisAddress;
	
	@FindBy(xpath = "//*[@text=\"Net Banking\"]")
	private MobileElement radioButtonNetBanking;
	
	@FindBy(xpath = "//*[@text=\"Choose an Option\"]")
	private MobileElement dropDownBankName;
	
	@FindBy(xpath = "//*[@resource-id='list-banks']")
	private List <MobileElement> bankOptions;
	
	@FindBy(xpath = "//*[@resource-id=\"com.amazon.mShop.android.shopping:id/item_title\"]")
	private MobileElement actualItemName;
	
	
	@FindBy(xpath ="//*[@text=\"Proceed to Buy\"]")
	private MobileElement proceceedtobuy;
	
	@FindBy(xpath ="//*[@resource-id=\"a-autoid-0-announce\"]")
	private MobileElement deliveraddress;
	
	@FindBy(xpath ="//*[@text=\"Continue\"]")
	private MobileElement deliverContinueButton;
	
	
	@FindBy(xpath = "//*[@text=\"Axis Bank\"]")
	private MobileElement axisbankselectElement;
	
	
	@FindBy(xpath="//*[@text=\"Place Your Order\"]")
	private MobileElement payNowButton;
	
	
	public CheckoutPage(AndroidDriver<MobileElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	

	public void proceedToBuy() {
	
		proceceedtobuy.click();
	}
	
	
	
	public void deliverToAddress() {
		deliveraddress.click();
	}
	
	public void tapOndeliverContinue() {
		deliverContinueButton.click();
	}
	
	
	
	
	public void  selectBankName() {
	
			dropDownBankName.click();
			axisbankselectElement.click();		
			
	
	}
	
	
	public void clickOnPayButton()
	{
		payNowButton.click();
	}
	
	
	public void clickNetBankingRadioButton() {
		try {
			
			radioButtonNetBanking.click();
				} catch (Exception e) {
			Assert.fail("Failed to click NetBanking button");
		}
		
	}
	
	/**
	 * Click Continue button
	 */
	public void clickContinueButton() {
		try {
			
			buttonContinue.click();
			//Reporter.log("Continue button is clicked");
		} catch (Exception e) {
			Assert.fail("Failed to click continue button");
		}
		
	}
	

}
