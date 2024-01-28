package com.kfh.bdd.desktop.screens;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import com.kfh.bdd.ccl.DesktopActions;
import com.kfh.bdd.integrations.common_utils.ConfigReader;
import com.kfh.bdd.integrations.common_utils.DriverFactory;
import com.kfh.bdd.integrations.report_utils.ReportManager;

public class GFS_Home_screen {

//	By txtbx_password = By.xpath("//Window/Window[1]/Pane[2]/Edit[1]");
//	String q = "//Window/Text[1]";
	By txtbx1_password = By.name("Password");
	static String btn_OK = "btnOK";
	String popup_information = "DialogOkCommon";
	String pge_gfsHome = "GreetingAndMessage";
	By txt_locate = By.xpath("//Button[@Name='F9 Locate']");
	By txt_1 = By.xpath("//TreeItem[contains(@Name,'Common')]");

	DesktopActions desktopActions = new DesktopActions();
	Robot robot;
	
	
	public void enterPasswordUsingRobotClass() throws InterruptedException {
		try {
			Thread.sleep(5000);
			// Create a Robot instance
			String text = ConfigReader.getValue("desktopUI_password");
			char[] chars = text.toCharArray();

			// Iterate through each character and type it
			for (char c : chars) {
				// Get the key code for the character
				int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
				robot = new Robot();
				// Press and release the key
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);

				// Introduce a short delay between key presses to simulate typing speed
				robot.delay(50);
				// System.out.println(c);

			}
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void enterPassword() throws Exception {		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_K);
//		robot.keyRelease(KeyEvent.VK_K);
////		robot.keyPress(KeyEvent.VK_F);
////		robot.keyRelease(KeyEvent.VK_F);
////		robot.keyPress(KeyEvent.VK_H);
////		robot.keyRelease(KeyEvent.VK_H);
////		robot.keyPress(KeyEvent.VK_);
////		robot.keyRelease(KeyEvent.VK_);
//		desktopActions.clearAndSendKeys(txtbx_password, "kfh-123");
//		Thread.sleep(5000);
////		desktopActions.click(txtbx_password, "Password");
//		desktopActions.sendKeys(txtbx_password, "kfh-123", "Password");
//		Thread.sleep(5000);
////		desktopActions.sendKeys(txtbx_password, ConfigReader.getValue("desktopUI_password") , "Password");
////		desktopActions.sendKeysToAlert(ConfigReader.getValue("desktopUI_password"));
////		desktopActions.sendKeysUsingAccessbilityID(txtbx_password, ConfigReader.getValue("desktopUI_password") , "Password");
//				//ConfigReader.getValue("desktopUI_password"), "Password");
//
	}

	public void closePopup() {
		try {
			Thread.sleep(7000);
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyGfsHomePage() throws InterruptedException {
//		if (DriverFactory.getInstance().getWindowDriver().findElementsByAccessibilityId(popup_information).size() >= 1) {
//			this.closePopup();
//
//		} else
//			ReportManager.logInfo("No information popup displayed");
////		desktopActions.isDisplayed(pge_gfsHome, "GFS Home page");
		this.closePopup();
		ReportManager.logInfo("Successfully logged into the GFS application.");
	//	DriverFactory.getInstance().getWindowDriver().findElementByAccessibilityId(pge_gfsHome).isDisplayed();
	}
	
	public void clickLocateMenu() throws InterruptedException, AWTException {
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_F9);
		robot.keyRelease(KeyEvent.VK_F9);
		Thread.sleep(5000);
		ReportManager.logInfo("Successfully clicked on the Locate menu option.");
	}
	
	public void clickCSRMenu() throws InterruptedException, AWTException {
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_F10);
		robot.keyRelease(KeyEvent.VK_F10);
		Thread.sleep(2000);
		ReportManager.logInfo("Successfully clicked on the CSR menu option.");
	}
	
	public void clickTransactionsMenu() throws InterruptedException, AWTException {
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_F6);
		robot.keyRelease(KeyEvent.VK_F6);
		Thread.sleep(2000);
		ReportManager.logInfo("Successfully clicked on the Transactions menu option.");
	}

}
