package com.kfh.bdd.desktop.screens;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import com.kfh.bdd.ccl.DesktopActions;
import com.kfh.bdd.integrations.common_utils.ConfigReader;
import com.kfh.bdd.integrations.common_utils.DriverFactory;
import com.kfh.bdd.integrations.report_utils.ReportManager;
import com.microsoft.playwright.Keyboard;

public class GFS_Opening_Account_screen {
	
	String txt_Transaction_details = "HostResponseText";
	
	DesktopActions desktopActions = new DesktopActions();
	Robot robot;
	
	public void clickAccountMaintenceOption() throws InterruptedException, AWTException {		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_NUMPAD2);
		robot.keyRelease(KeyEvent.VK_NUMPAD2);
		robot.delay(100);
		ReportManager.logInfo("Successfully clicked on the Account Maintenance option.");
	} 
	
	public void clickOpenAccountOption() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_NUMPAD1);
		robot.keyRelease(KeyEvent.VK_NUMPAD1);
		robot.delay(15000);
		ReportManager.logInfo("Successfully clicked on the Open Account option.");
	}
	
	public void selectAccType() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_NUMPAD1);
		robot.keyRelease(KeyEvent.VK_NUMPAD1);
		robot.delay(1000);
		ReportManager.logInfo("Successfully selected Account type from the dropdown.");
	}
	
	public void selectAccClass() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_NUMPAD1);
		robot.keyRelease(KeyEvent.VK_NUMPAD1);
		robot.delay(500);
		ReportManager.logInfo("Successfully selected Account class from the dropdown.");
		
	}
	
	public void selectAccBranch() throws AWTException{
		for(int i=1; i<=3;i++) {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.delay(500);
		}
//		robot.keyPress(KeyEvent.VK_1);
//		robot.keyRelease(KeyEvent.VK_1);
//		robot.delay(100);
		ReportManager.logInfo("Successfully selected Account branch from the dropdown.");
	}
	public void selectRimOpenReason() throws InterruptedException, AWTException {
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		ReportManager.logInfo("Successfully selected RIM Open reason from the dropdown.");
	}
	
	public void clickNxtBtnAccInfoTab() throws InterruptedException, AWTException {
		for(int i=1; i<=4;i++) {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.delay(50);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		ReportManager.logInfo("Successfully clicked on the next button.");
	}
	
	public void enterMngMode() throws InterruptedException, AWTException {
		for(int i=1; i<=3;i++) {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.delay(50);
		}
		try {
			Thread.sleep(2000);
			// Create a Robot instance
			String text = ConfigReader.getValue("managing_mode");
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		ReportManager.logInfo("Successfully entered managing mode.");
	  }
	public void clickNxtBtnOtherInfoTab() throws InterruptedException, AWTException {
		for(int i=1; i<=6;i++) {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.delay(50);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		ReportManager.logInfo("Successfully clicked on the next button.");
	}
	public void clickNxtBtnRimRelationshipTab() throws InterruptedException, AWTException {
		for(int i=1; i<=6;i++) {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.delay(50);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		ReportManager.logInfo("Successfully clicked on the next button.");
	}
	public void clickSaveBtnAccAditionalInfoTab() throws InterruptedException, AWTException {
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(50);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(50);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		ReportManager.logInfo("Successfully clicked on the save button.");
		robot.delay(10000);
	}
	
	public void acceptTransVouchersPopup() throws InterruptedException, AWTException {
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
		ReportManager.logInfo("TansactionVouchersPopup is accepted successfully.");
		robot.delay(10000);		
	}
	
	public void fetchTransactionDetails() {
		desktopActions.getTextUsingAccessbilityID(txt_Transaction_details, "Transaction Details");
		//desktopActions.getText(txt_Transaction_details);
	}
	
	
	public void closeAccOpeningTab() throws AWTException {
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		robot.delay(500);
	}


}
