package Comman;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InfoMethods {
	
	public static AndroidDriver<MobileElement> driver;
	public static Properties OR;

	//Method to launch the Appium
	@BeforeSuite
	public void setup() throws MalformedURLException
	{
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
//		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8");
//		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"KFC3Y18918003544");
		 //Change the Platform version and device name.
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"ZF62243G98");
		 
//		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
//		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"4d9812220805");
		 capabilities.setCapability(MobileCapabilityType.APP,"F:/Gitcode/AppiumInfosysDemo/Amazon_shopping.apk");
		 capabilities.setCapability("appActivity","com.amazon.mShop.splashscreen.StartupActivity");
		 capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		 driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}
	
	
	
	public static void login_flow()
	{
		  MobileElement el1 = (MobileElement) driver.findElementById("com.amazon.mShop.android.shopping:id/sign_in_button");
		  el1.click();
		 // (new TouchAction(driver)).tap(515,731).perform():
		
	    }
	
	

	
	
	//Method to load the txt file of data.

	@BeforeMethod
	public void loaddatafile() throws IOException
	{
		String Path_OR ="F:/Gitcode/AppiumInfosysDemo/src/Comman/OR.txt" ;
		FileInputStream fs = new FileInputStream(Path_OR);
		OR= new Properties(System.getProperties());
		OR.load(fs);
		//System.out.println(OR.getProperty("username"));
	}
	

	
	
	
	

	
	
}
