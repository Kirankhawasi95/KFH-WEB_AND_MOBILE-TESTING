//package com.kfh.bdd.desktop.screens;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.io.IOException;
//import org.openqa.selenium.By;
//import org.sikuli.script.FindFailed;
//
//import com.kfh.bdd.ccl.DesktopActions;
//import com.kfh.bdd.integrations.common_utils.ConfigReader;
//import com.kfh.bdd.integrations.common_utils.DriverFactory;
//import com.kfh.bdd.integrations.report_utils.ReportManager;
//
//public class GFS_Cash_Deposit_screen {
//	
//	
//	
//	
//	DesktopActions desktopActions = new DesktopActions();
//	Robot robot;
//	
//	public void clickCommonTellerFuncsOption() throws InterruptedException, AWTException {
//		robot = new Robot();
//		robot = new Robot();
//		robot.keyPress(KeyEvent.VK_NUMPAD1);
//		robot.keyRelease(KeyEvent.VK_NUMPAD1);
//		Thread.sleep(500);
//		ReportManager.logInfo("Successfully clicked on the Common Teller Functions option.");
//	}
//	
//	public void clickCasDepositOption() throws InterruptedException, AWTException {
//		robot = new Robot();
//		robot.keyPress(KeyEvent.VK_NUMPAD1);
//		robot.keyRelease(KeyEvent.VK_NUMPAD1);
//		robot.delay(2000);
//		robot.keyPress(KeyEvent.VK_SPACE);
//		robot.keyRelease(KeyEvent.VK_SPACE);
//		Thread.sleep(8000);
//		ReportManager.logInfo("Successfully clicked on the Cash Deposit option.");
//		
//	}
//	
//	public void enterAccNumber() throws InterruptedException {
//		try {
//			// Create a Robot instance
//			String text = ConfigReader.getValue("AccNumber");
//			char[] chars = text.toCharArray();
//
//			// Iterate through each character and type it
//			for (char c : chars) {
//				// Get the key code for the character
//				int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
//				robot = new Robot();
//				// Press and release the key
//				robot.keyPress(keyCode);
//				robot.keyRelease(keyCode);
//				// Introduce a short delay between key presses to simulate typing speed
//				robot.delay(50);
//				// System.out.println(c);
//
//			}
//			robot.delay(2000);
//			robot.keyPress(KeyEvent.VK_SPACE);
//			robot.keyRelease(KeyEvent.VK_SPACE);
//			robot.delay(2000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		ReportManager.logInfo("Successfully entered the Account number.");
//	}
//	
//	public void enterDepositAmount() throws AWTException, FindFailed {
//		for(int i=1; i<=25;i++) {
//			robot = new Robot();
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			robot.delay(50);
//		}
//		robot.keyPress(KeyEvent.VK_NUMPAD1);
//		robot.keyRelease(KeyEvent.VK_NUMPAD1);
//		robot.delay(50);
//		robot.keyPress(KeyEvent.VK_NUMPAD0);
//		robot.keyRelease(KeyEvent.VK_NUMPAD0);
//		robot.delay(50);
//		robot.keyPress(KeyEvent.VK_NUMPAD0);
//		robot.keyRelease(KeyEvent.VK_NUMPAD0);
//		robot.delay(50);
//		ReportManager.logInfo("Successfully entered the deposit ammount");
//	}
//	
//	public void selectIDtype() throws AWTException, FindFailed {
//		for(int i=1; i<=5;i++) {
//			robot = new Robot();
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			robot.delay(50);
//		}
//		robot.keyPress(KeyEvent.VK_P);
//		robot.keyRelease(KeyEvent.VK_P);
//		robot.delay(500);
//		ReportManager.logInfo("Successfully selected the IP type.");
//	}
//	
//	
//	public void enterIDnumber() throws AWTException, FindFailed {
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.delay(500);		
//		try {
//			// Create a Robot instance
//			String text = ConfigReader.getValue("ID_Number");
//			char[] chars = text.toCharArray();
//
//			// Iterate through each character and type it
//			for (char c : chars) {
//				// Get the key code for the character
//				int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
//				robot = new Robot();
//				// Press and release the key
//				robot.keyPress(keyCode);
//				robot.keyRelease(keyCode);
//				// Introduce a short delay between key presses to simulate typing speed
//				robot.delay(50);
//				// System.out.println(c);
//
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		ReportManager.logInfo("Successfully entered the ID number.");
//	}
//	
//	public void enterDepositorName() throws AWTException, FindFailed {
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.delay(500);		
//		try {
//			// Create a Robot instance
//			String text = ConfigReader.getValue("DepostorName");
//			char[] chars = text.toCharArray();
//
//			// Iterate through each character and type it
//			for (char c : chars) {
//				// Get the key code for the character
//				int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
//				robot = new Robot();
//				// Press and release the key
//				robot.keyPress(keyCode);
//				robot.keyRelease(keyCode);
//				// Introduce a short delay between key presses to simulate typing speed
//				robot.delay(50);
//				// System.out.println(c);
//
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		ReportManager.logInfo("Successfully entered the depositor name.");
//	}
//	
//	public void selectSourceOfFunds() throws AWTException, FindFailed {
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.delay(500);
//		for(int i=1; i<=2;i++) {
//			robot = new Robot();
//			robot.keyPress(KeyEvent.VK_0);
//			robot.keyRelease(KeyEvent.VK_0);
//			robot.delay(50);
//		}
//		robot.keyPress(KeyEvent.VK_P);
//		robot.keyRelease(KeyEvent.VK_P);
//		robot.delay(500);
//		ReportManager.logInfo("Successfully selected the IP type.");
//	}
//	
//	public void enterOtherSourceOfFunds() throws AWTException, FindFailed {
//		robot = new Robot();
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.delay(500);
//		robot.keyPress(KeyEvent.VK_T);
//		robot.keyRelease(KeyEvent.VK_T);
//		robot.delay(50);
//		robot.keyPress(KeyEvent.VK_E);
//		robot.keyRelease(KeyEvent.VK_E);
//		robot.delay(50);
//		robot.keyPress(KeyEvent.VK_S);
//		robot.keyRelease(KeyEvent.VK_S);
//		robot.delay(50);
//		robot.keyPress(KeyEvent.VK_T);
//		robot.keyRelease(KeyEvent.VK_T);
//		robot.delay(50);
//	}
//	
//	public void enterPhoneNumber() throws AWTException, FindFailed {
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.delay(500);		
//		try {
//			// Create a Robot instance
//			String text = ConfigReader.getValue("Phone_Number");
//			char[] chars = text.toCharArray();
//
//			// Iterate through each character and type it
//			for (char c : chars) {
//				// Get the key code for the character
//				int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
//				robot = new Robot();
//				// Press and release the key
//				robot.keyPress(keyCode);
//				robot.keyRelease(keyCode);
//				// Introduce a short delay between key presses to simulate typing speed
//				robot.delay(50);
//				// System.out.println(c);
//
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		ReportManager.logInfo("Successfully entered the Phone number.");
//	}
//	
//	public void clickOKBtn() throws AWTException, FindFailed {
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.delay(500);	
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		robot.delay(13000);
//	}
//	
//	public void closePopUp() throws AWTException, FindFailed {
//		robot.keyPress(KeyEvent.VK_SPACE);
//		robot.keyRelease(KeyEvent.VK_SPACE);
//		robot.delay(2000);	
//		robot.keyPress(KeyEvent.VK_SPACE);
//		robot.keyRelease(KeyEvent.VK_SPACE);
//		robot.delay(8000);
//	}
//	
//	public void closeCashDepositTab() throws AWTException {
//		robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		robot.keyRelease(KeyEvent.VK_ESCAPE);
//		robot.delay(2000);
//	}
//}
