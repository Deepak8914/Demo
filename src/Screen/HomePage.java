package Screen;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class HomePage {


	
	@FindBy(xpath = "//*[@resource-id='icp-btn-close-announce']")
    private WebElement buttonCancelLanguageSelection;

	@FindBy(xpath = "//*[@resource-id=\"com.amazon.mShop.android.shopping:id/action_bar_home_logo\"]")
    private WebElement logoAmazon;
	
	@FindBy(xpath = "//*[@resource-id=\"com.amazon.mShop.android.shopping:id/rs_search_src_text\"]")
    private WebElement txtBoxSearch;
	
	@FindBy(xpath = "//*[@resource-id=\"com.amazon.mShop.android.shopping:id/iss_search_dropdown_item_query_builder\"]")
    private WebElement buttonAppendSearch;
	
	@FindBy(xpath = "(//*[@id='iss_search_suggestions_list_view']/*/*/*[@id='iss_search_dropdown_item_text'])[6]")
    private WebElement productSelected;
	
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
}

