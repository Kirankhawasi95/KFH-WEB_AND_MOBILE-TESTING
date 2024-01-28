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



public class GFS_Locate_Menu_screen {
	
//	DesktopActions desktopActions = new DesktopActions();
	Robot robot;
	String img_customer_details = "/KFH_Unified_BDD_Framework/images/customer_details.png";
	
	
	
	public void selectRimOptionFromDropdown() throws InterruptedException, AWTException {
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		Thread.sleep(50);
		ReportManager.logInfo("Successfully selected the RIM option from the search by drop-down");
	}
	
	public void enterRIMnumber() throws InterruptedException {
		try {
			// Create a Robot instance
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			String text = ConfigReader.getValue("RIM_number");
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
				ReportManager.logInfo("Successfully entered RIM number");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickSearchbtn() throws InterruptedException, AWTException {
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(50);
		ReportManager.logInfo("Successfully clicked on the Search button");
		Thread.sleep(4000);
	}
	
	public void selectCustomerDetails() throws AWTException, InterruptedException{
		Thread.sleep(10000);
		
//		for(int i=1; i<=2;i++) {
//			robot = new Robot();
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			robot.delay(50);
//		}
////		robot.keyPress(KeyEvent.VK_END);
//		robot.keyRelease(KeyEvent.VK_END);
//		robot.delay(50);
//		robot.mouseMove(305, 450);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
//		Screen s = new Screen();
//		Pattern customer_details = new Pattern("customer_details.PNG");
//		s.wait(customer_details, 2000);
//		s.doubleClick();
	}
	
	public void closePopUp() throws AWTException {
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.delay(3000);
	}
	
	public void closeLocateTab() throws AWTException {
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		robot.delay(500);
	}
		

}
