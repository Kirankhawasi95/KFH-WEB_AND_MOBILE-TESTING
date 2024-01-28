package com.kfh.bdd.integrations.common_utils;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsDriver;

public class DriverFactory {
	private static DriverFactory instance = null;
	WebDriver driver;
	ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	ThreadLocal<AppiumDriver> appiumDriver = new ThreadLocal<AppiumDriver>();
	String strMobileExecutiontype = "android";
	ThreadLocal<WindowsDriver<WebElement>> windowDriver = new ThreadLocal<WindowsDriver<WebElement>>();


	private DriverFactory() {

	}

	public static DriverFactory getInstance() {
		if (instance == null) {
			instance = new DriverFactory();
		}
		return instance;
	}

//mobile
	public final void setMobileDriver(String platform, String udid, String systemPort, String deviceName)
			throws Exception {


			String[] platformInfo = platform.split(" ");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformInfo[0]);
			// capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
			// platformInfo[1]);
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
			capabilities.setCapability(MobileCapabilityType.UDID, udid);
//			capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

//		    capabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);

		//	capabilities.setCapability(MobileCapabilityType.APP,
			//		System.getProperty("user.dir") + ConfigReader.getValue("AppLocation"));
			capabilities.setCapability("adbExecTimeout", 60000);
			capabilities.setCapability("appPackage", "com.android.vending");
			capabilities.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
//			capabilities.setCapability("appPackage", "in.android.vyapar");
//			capabilities.setCapability("appActivity", "in.android.vyapar.MainActivity");
			capabilities.setCapability("resetKeyboard", true);
			capabilities.setCapability("unicodeKeyboard", true);
			capabilities.setCapability(MobileCapabilityType.ORIENTATION, "PORTRAIT");
			capabilities.setCapability(MobileCapabilityType.NO_RESET, true);

			appiumDriver.set(new AppiumDriver(new URL("http://127.0.0.1:4723/wb/hub"), capabilities));

			getMobileDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	public final void setDesktopDriver() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", ConfigReader.getValue("ExePath"));
		windowDriver.set(new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723/"), capabilities));
		getWindowDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);;

	}

	public WindowsDriver<WebElement> getWindowDriver() {
		return windowDriver.get();
	}

	public WebDriver getWebDriver() {
		return webDriver.get();
	}

	public AppiumDriver getMobileDriver() {
		return appiumDriver.get();
	}
}
