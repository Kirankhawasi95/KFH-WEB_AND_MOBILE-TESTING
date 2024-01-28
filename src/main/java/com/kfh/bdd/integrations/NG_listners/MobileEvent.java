package com.kfh.bdd.integrations.NG_listners;

import static com.qa.opencart.factory.PlaywrightFactory.takeScreenshot;

import java.io.IOException;

import java.net.ServerSocket;

import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;
import com.kfh.bdd.ccl.MobileActions;
import com.kfh.bdd.integrations.common_utils.ConfigReader;
import com.kfh.bdd.integrations.common_utils.DriverFactory;
import com.kfh.bdd.integrations.common_utils.MobileUtil;
import com.kfh.bdd.integrations.common_utils.VideoRecord;
import com.kfh.bdd.integrations.report_utils.ReportManager;
import com.kfh.bdd.integrations.report_utils.ScreenshotUtil;

import io.appium.java_client.android.AndroidDriver;

public class MobileEvent implements ITestListener {
	ThreadLocal<AndroidDriver> androidDriver = new ThreadLocal<AndroidDriver>();
	DriverFactory driverFactory = DriverFactory.getInstance();
	public static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
	private static final String KEY = "platform";
	private static final String KEY1 = "udid";
	private static final String KEY2 = "systemPort";
	private static final String KEY3 = "deviceName";
	public static String Platform;
	public static String Udid;
	public static String SystemPort;
	public static String DeviceName;

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("+++++++++++++++++++onTestStart++++++++++++++++++");

		/*
		 * try { ReportManager.logInfoMobile("Platform: " + Platform);
		 * ReportManager.logInfoMobile("UDID: " + Udid);
		 * ReportManager.logInfoMobile("Appium Port: " + SystemPort);
		 * ReportManager.logInfoMobile("Device Name: " + DeviceName);
		 * driverFactory.setMobileDriver(Platform, Udid, SystemPort, DeviceName); }
		 * catch (Exception e) { e.printStackTrace(); }
		 */
		try {
			VideoRecord.startRecord(arg0.getMethod().getMethodName());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		//System.out.println("Test Success: " + iTestResult.getMethod().getMethodName());
		//ReportManager.logPass(iTestResult.getThrowable().getMessage());
		
		
		ReportManager.endCurrentTest();

		// driverFactory.getMobileDriver().close();
		try {
			VideoRecord.stopRecord();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {
		System.out.println("Test Fail: " + iTestResult.getMethod().getMethodName());
		
//		test.get().pass("Test passed");
//		test.get().fail(iTestResult.getThrowable(), MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtil.takeScreenshot(),iTestResult.getMethod().getMethodName()).build());
		
		test.get().fail("Test Failed");
		try {
				test.get().fail(iTestResult.getThrowable(), MediaEntityBuilder.createScreenCaptureFromBase64String(
					ScreenshotUtil.takeScreenshot(DriverFactory.getInstance().getMobileDriver())).build());
			
			
			//test.get().getModel().setEndTime(getTime(iTestResult.getEndMillis()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		getCurrentTest().fail("", mediaModel);
//		
		//test.get().getModel().setEndTime(getTime(iTestResult.getEndMillis()));
		
//		try {
//			ReportManager.logScreenshot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//		ReportManager.logFail(iTestResult.getThrowable().getMessage());
//		
//		try {
//			VideoRecord.stopRecord();
////			ReportManager.endCurrentTest();
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		driverFactory.getMobileDriver().quit();
	}

	@Override
	public void onStart(ITestContext arg0) {
		Platform = arg0.getCurrentXmlTest().getParameter(KEY);
		Udid = arg0.getCurrentXmlTest().getParameter(KEY1);
		SystemPort = arg0.getCurrentXmlTest().getParameter(KEY2);
		DeviceName = arg0.getCurrentXmlTest().getParameter(KEY3);

		try {
			driverFactory.setMobileDriver(Platform, Udid, SystemPort, DeviceName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		DriverFactory.getInstance().getMobileDriver().findElement(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobilescreen", "phone_Number")).click();
//		DriverFactory.getInstance().getMobileDriver().findElement(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobilescreen", "phone_Number")).sendKeys(ConfigReader.getValue("MobileNumber"));
//		DriverFactory.getInstance().getMobileDriver().findElement(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobilescreen", "btn_otp")).click();
//		DriverFactory.getInstance().getMobileDriver().findElement(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobilescreen", "txt_otp")).sendKeys(ConfigReader.getValue("Otp"));
//		DriverFactory.getInstance().getMobileDriver().findElement(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobilescreen","btn_submit")).click();

	}
	
	

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}
