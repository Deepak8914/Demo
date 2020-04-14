package Screen;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class HomePage {


	
	@FindBy(xpath = "//*[@resource-id='icp-btn-close-announce']")
    private MobileElement buttonCancelLanguageSelection;

	@FindBy(xpath = "//*[@resource-id=\"com.amazon.mShop.android.shopping:id/action_bar_home_logo\"]")
    private MobileElement logoAmazon;
	
	@FindBy(xpath = "//*[@resource-id=\"com.amazon.mShop.android.shopping:id/rs_search_src_text\"]")
    private MobileElement txtBoxSearch;
	
	@FindBy(xpath = "//*[@resource-id=\"com.amazon.mShop.android.shopping:id/iss_search_dropdown_item_query_builder\"]")
    private MobileElement buttonAppendSearch;
	
	@FindBy(xpath ="(//*[@text=\"lizol floor cleaner 1 litre\"])[1]")
    private MobileElement productSelected;
	
 //Element from where to  scroll
	@FindBy(xpath ="(//*[@resource-id=\"com.amazon.mShop.android.shopping:id/list_product_description_layout\"])[1]")
    private MobileElement scrollElement;
	
	//Element to buy
	@FindBy(xpath ="(//*[@text=\"lizol floor cleaner 1 litre\"])[1]")
    private MobileElement buyElement;
	
	
	
	public HomePage(WebDriver driver)
	{
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	

	
	/**
	 * Enter the search keyword in search box and select value from auto suggestion
	 */
	
	@SuppressWarnings("rawtypes")
	public void EnterKeywordAndSearchItem(AndroidDriver<MobileElement> driver,String item_name) {
		
		new TouchAction(driver).press(PointOption.point(471,349)).release().perform();
		txtBoxSearch.sendKeys(item_name);
		buttonCancelLanguageSelection.click();
		txtBoxSearch.click();
		txtBoxSearch.sendKeys(item_name);
		productSelected.click(); //Selecting product from auto suggestion
		
	}
	
	public void scrollToElement(WebDriver driver)
	{
		TouchActions action = new TouchActions(driver);
		action.scroll(scrollElement, 10, 100);
		action.perform();
	}
	
	public void getProductDetail()
	{
		scrollElement.click();
	}
}

