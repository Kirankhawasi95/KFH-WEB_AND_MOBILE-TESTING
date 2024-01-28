package com.kfh.bdd.ccl;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.management.timer.Timer;

import org.joda.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.interactions.touch.TouchActions;

//import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.windows.WindowsDriver;

import com.kfh.bdd.integrations.common_utils.DriverFactory;
import com.kfh.bdd.integrations.report_utils.ReportManager;
import com.google.common.base.Stopwatch;

public class DesktopActions {
	java.util.Date CurrentDate;
	// DriverFactory.getInstance().getWindowDriver()
	JavascriptExecutor javascriptExecutor = (JavascriptExecutor) DriverFactory.getInstance().getWindowDriver();
	Actions actions = new Actions(DriverFactory.getInstance().getWindowDriver());

	/**
	 * =============================================================================
	 * Method: waitForVisible | Author: pravanya Gajula | Date:16 Jan 2020 |
	 * Description: This method wait for element it will check every 5 sec its
	 * present or not until 60 sec | Parameters: locator | Return: element
	 * =============================================================================
	 */
	@SuppressWarnings("deprecation")
	public static WebElement waitForVisible(By locator) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getInstance().getWindowDriver(), 80);
//		WebDriverWait wait =new WebDriverWait(DriverFactory.windowDriver,60);
//		wait.pollingEvery(1, TimeUnit.SECONDS);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * =============================================================================
	 * Method: elementToBeClickable | Author: pravanya Gajula | Date:12 may 2020 |
	 * Description: This method wait for element it will check every 5 sec its
	 * present or not until 60 sec | Parameters: locator | Return: element
	 * =============================================================================
	 */

	public WebElement elementToBeClickable(By locator) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getInstance().getWindowDriver(), 20);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	/**
	 * =============================================================================
	 * Method: Click | Author: pravanya Gajula | Date:16 Jan 2020 | Description:
	 * This method click on element | Parameters: locator, info | Return: none
	 * =============================================================================
	 */
	public static void click(By locator, String info) {
		WebElement elm = waitForVisible(locator);
		elm.click();
		ReportManager.logInfo("Successfully clicked on -  <b style=\"color:green;\">" + info + "</b>");
		System.out.println("Successfully clicked on -  " + info);

	}

	/**
	 * =============================================================================
	 * Method: isDisplayedUsingAccessbilityID | Author: pravanya Gajula | Date:1 jun
	 * | Description: isDisplayed | Parameters: locator, info | Return: none
	 * =============================================================================
	 */

	public static void isDisplayedUsingAccessbilityID(String locator, String info) {
		// WebElement elm = waitForVisible(locator);
//		String text = DriverFactory.getInstance().getWindowDriver().getPageSource().toString();
		WebElement elm = DriverFactory.getInstance().getWindowDriver().findElementByAccessibilityId(locator);
		WebDriverWait wait = new WebDriverWait(DriverFactory.getInstance().getWindowDriver(), 40);
		wait.until(ExpectedConditions.elementToBeClickable(elm));
		elm.isDisplayed();
		ReportManager.logInfo("Successfully element displayed: " + "<b style=\"color:green;\">" + info + "</b>");
		System.out.println("Successfully element displayed: " + "<b style=\"color:green;\">" + info + "</b>");

	}

	/**
	 * =============================================================================
	 * Method: clickUsingAccessbilityID | Author: pravanya Gajula | Date:1 jun |
	 * Description: This method click on element | Parameters: locator, info |
	 * Return: none
	 * =============================================================================
	 */

	public static void clickUsingAccessbilityID(String locator, String info) {
		// WebElement elm = waitForVisible(locator);
//		String text = DriverFactory.getInstance().getWindowDriver().getPageSource().toString();
		WebElement elm = DriverFactory.getInstance().getWindowDriver().findElementByAccessibilityId(locator);
		WebDriverWait wait = new WebDriverWait(DriverFactory.getInstance().getWindowDriver(), 40);
		wait.until(ExpectedConditions.elementToBeClickable(elm));
		elm.click();
		ReportManager.logInfo("Successfully clicked on -  <b style=\"color:green;\">" + info + "</b>");
		System.out.println("Successfully clicked on -  " + info);

	}

	/**
	 * =============================================================================
	 * Method: sendKeysUsingAccessbilityID | Author: pravanya Gajula | Date:1 jun |
	 * This method enter text input text using element | Parameters: locator, text,
	 * info | Return: none
	 * =============================================================================
	 * 
	 * @throws Exception
	 */

	public void sendKeysUsingAccessbilityID(String locator, String value, String info) throws Exception {
		WebElement elm = waitForvisibileByAccessibleId(locator, 1000);
//		WebElement elm = DriverFactory.getInstance().getWindowDriver().findElementByAccessibilityId(locator);
//		WebDriverWait wait = new WebDriverWait(DriverFactory.getInstance().getWindowDriver(), 40);
//		wait.until(ExpectedConditions.visibilityOf(elm));
//		elm.sendKeys(text);
		System.out.println("Successfully entered value -  " + value + " in " + info + " box");
		ReportManager.logInfo("Successfully entered value -  " + value + " in " + info + " box");
		
//		ReportManager.logInfo("Successfully Entered " + info + " : <b style=\"color:green;\">" + value + "</b>");
//		System.out.println("Successfully Entered " + info + " :" + value);

	}

	/**
	 * =============================================================================
	 * Method: clearAndSendKeysUsingAccessbilityID | Author: Lavanya Konde| Date:19
	 * September | Description: This method is used to clear the data and update new
	 * data | Parameters: ele, info | Return: none
	 * =============================================================================
	 */

	public static void clearAndSendKeysUsingAccessbilityID(String locator, String text, String info) {
		// WebElement elm = waitForVisible(locator);
		WebElement elm = DriverFactory.getInstance().getWindowDriver().findElementByAccessibilityId(locator);
		WebDriverWait wait = new WebDriverWait(DriverFactory.getInstance().getWindowDriver(), 40);
		wait.until(ExpectedConditions.visibilityOf(elm));
		elm.clear();
		elm.sendKeys(text);
		ReportManager.logInfo("Successfully Entered " + info + " : <b style=\"color:green;\">" + text + "</b>");
		System.out.println("Successfully Entered " + info + " :" + text);

	}

	/**
	 * =============================================================================
	 * Method: scrollPageDownUsingsendKeysAccessbilityID | Author: Lavanya Konde|
	 * Date:21 September | Description: This method is used to scroll down the page
	 * using accessbility Id | Parameters: ele, info | Return: none
	 * =============================================================================
	 */

	public void scrollPageDownUsingsendKeysAccessbilityID(String locator, String info) {
		WebElement elm = DriverFactory.getInstance().getWindowDriver().findElementByAccessibilityId(locator);

		elm.sendKeys(Keys.PAGE_DOWN);
		elm.sendKeys(Keys.PAGE_DOWN);

	}

	/**
	 * =============================================================================
	 * Method: scrollDownUsingsendKeysAccessbilityID | Author: Lavanya Konde|
	 * Date:21 September | Description: This method is used to scroll down using
	 * accessbility Id | Parameters: ele, info | Return: none
	 * =============================================================================
	 */

	public void scrollDownUsingsendKeysAccessbilityID(String locator, String info) {
		WebElement elm = DriverFactory.getInstance().getWindowDriver().findElementByAccessibilityId(locator);
		elm.sendKeys(Keys.DOWN);
		elm.sendKeys(Keys.DOWN);
	}

	/**
	 * =============================================================================
	 * Method: Click | Author: pravanya Gajula | Date:1 jun | Description: This
	 * method click on element | Parameters: ele, info | Return: none
	 * =============================================================================
	 */

	public static void click(WebElement ele, String info) {
//		 waitForVisible(ele);

		ele.click();
		ReportManager.logInfo("Successfully clicked on -  <b style=\"color:green;\">" + info + "</b>");
		System.out.println("Successfully clicked on -  " + info);

	}

	/**
	 * =============================================================================
	 * Method: sendKeys | Author: pravanya Gajula | Date:16 Jan 2020 | Description:
	 * This method enter text input text using element | Parameters: locator, text |
	 * Return: none
	 * =============================================================================
	 */
	public static void sendKeys(By locator, String text) {
		WebElement elm = waitForVisible(locator);
		elm.sendKeys(text);
		ReportManager.logInfo("Successfully Entered text -  <b style=\"color:green;\">" + text + "</b>");
		System.out.println("Successfully Entered text :" + text);
	}

	/**
	 * =============================================================================
	 * Method: sendKeys | Author: pravanya Gajula | Date:16 Jan 2020 | Description:
	 * This method enter text input text using element | Parameters: locator, text |
	 * Return: none
	 * =============================================================================
	 */
	public static void sendKeys(By locator, String text, String info) {
		WebElement elm = waitForVisible(locator);
		elm.sendKeys(text);
		ReportManager.logInfo("Successfully Entered " + info + " : <b style=\"color:green;\">" + text + "</b>");
		System.out.println("Successfully Entered " + info + " :" + text);
	}

	/**
	 * =============================================================================
	 * Method: selectByVisibleText | Author: pravanya Gajula | Date:16 Jan 2020 |
	 * Description: This method enter text input text using element | Parameters:
	 * locator, text | Return: none
	 * =============================================================================
	 */
	public static void selectByVisibleText(By locator, String text, String info) {
		WebElement elm = waitForVisible(locator);
		elm.sendKeys(text);
		ReportManager.logInfo("Successfully Entered " + info + " : <b style=\"color:green;\">" + text + "</b>");
		System.out.println("Successfully Entered " + info + " :" + text);

	}

	/**
	 * =============================================================================
	 * Method: clearAndSendKeys | Author: pravanya Gajula | Date:16 Jan 2020 |
	 * Description: This method clear text in text box after that enter text using
	 * element | Parameters: locator, text | Return: none
	 * =============================================================================
	 */
	public void clearAndSendKeys(By locator, String text) {
		WebElement elm = waitForVisible(locator);
		elm.clear();
		elm.sendKeys(text);
		ReportManager.logInfo("Successfully Entered text - " + text);
		System.out.println("Successfully Entered text - " + text);

	}

	/**
	 * =============================================================================
	 * Method: clearAndSendKeys | Author: pravanya Gajula | Date:3 May 2022 |
	 * Description: This method clear text in text box after that enter text using
	 * element | Parameters: locator, text, info | Return: none
	 * =============================================================================
	 */
	public void clearAndSendKeys(By locator, String text, String info) {
		WebElement elm = waitForVisible(locator);
		elm.clear();
		elm.sendKeys(text);
		ReportManager.logInfo("Successfully Entered " + info + " : <b style=\"color:green;\">" + text + "</b>");
		System.out.println("Successfully Entered " + info + " :" + text);

	}

	/**
	 * =============================================================================
	 * Method: getAttributeByInfo | Author: pravanya Gajula | Date:16 Jan 2020 |
	 * Description: This method returns value of attribute using element |
	 * Parameters: locator, attribute, info | Return: attribute_value string type
	 * =============================================================================
	 */

	public static String getAttributeByInfo(By element, String attribute, String info) throws Exception {

		WebElement ele = waitForVisible(element);
		String attribute_value = ele.getAttribute(attribute);
		ReportManager.logInfo(" " + info + "" + attribute_value);
		System.out.println("Successfully captured attribute text " + info + " " + attribute_value);

		return attribute_value;
	}

	/**
	 * =============================================================================
	 * Method: getAttributeBy | Author: pravanya Gajula | Date:16 Jan 2020 |
	 * Description: This method returns value of attribute using element |
	 * Parameters: locator, attribute | Return: attribute_value string type
	 * =============================================================================
	 */
	public static String getAttributeBy(By element, String attribute) throws Exception {

		WebElement ele = waitForVisible(element);
		return ele.getAttribute(attribute);

	}

	/**
	 * =============================================================================
	 * Method: enter | Author: pravanya Gajula | Date:16 Jan 2020 | Description:
	 * enter method for enter keyboard action using respective element locator |
	 * Parameters: element | Return: none
	 * =============================================================================
	 */

	public static void enter(By element) throws Exception {

		WebElement ele = waitForVisible(element);
		ele.submit();
	}

	/**
	 * =============================================================================
	 * Method: textClear | Author: pravanya Gajula | Date:16 Jan 2020 | Description:
	 * textClear method used to clear the text using respective element locator |
	 * Parameters: element | Return: none
	 * =============================================================================
	 */
	public static void textClear(By element) throws Exception {
		WebElement ele = waitForVisible(element);
		ele.clear();
		ele.clear();
		ele.clear();
		ele.clear();
		ele.clear();
		ele.clear();
		ele.clear();

	}

	/**
	 * =============================================================================
	 * Method: img_Click | Author: pravanya Gajula | Date:16 Jan 2020 | Description:
	 * This method used for click on respective matching image | Parameters: image |
	 * Return: none
	 * =============================================================================
	 * 
	 * @throws IOException
	 */

	public static void verifyText(String actualText, String expectedText) throws IOException {
		if (actualText.contains(expectedText)) {
			ReportManager.logPass("Actual Text - " + "<b style=\"color:green;\">" + actualText + "</b>"
					+ " matched with expected " + "<b style=\"color:green;\">" + expectedText + "</b>");
		} else {
			ReportManager.logFail("Actual Text - " + "<b style=\"color:green;\">" + actualText + "</b>"
					+ " not matched with expected " + "<b style=\"color:green;\">" + expectedText + "</b>");
			assertEquals(expectedText, actualText);
		}

	}

	/**
	 * =============================================================================
	 * Method: getText | Author: pravanya gajula | Date:3 April 2022 | Description:
	 * This method used to get the text | Parameters: locator, text | Return: none
	 * =============================================================================
	 */

	public String getText(By locator) {
		WebElement elm = waitForVisible(locator);
		String elmText = elm.getText();
		ReportManager.logInfo("Successfully get text - <b style=\"color:green;\">" + elmText + "</b>");
		System.out.println("Successfully get text - " + elmText);
		// LogClass.loginfo("Successfully get text - " + elmText);
		return elmText;
	}

	/**
	 * =============================================================================
	 * Method: getText | Author: pravanya gajula | Date:3 April 2022 | Description:
	 * This method used to get the text | Parameters: locator, text, info | Return:
	 * none
	 * =============================================================================
	 */

	public String getText(By locator, String info) {
		WebElement elm = waitForVisible(locator);
		String elmText = elm.getText();
		ReportManager.logInfo("" + info + "<b style=\"color:green;\"> :" + elmText + "</b>");
		// LogClass.loginfo(""+info+" : " + elmText);
		return elmText;
	}

	/**
	 * =============================================================================
	 * Method: selectByVisibleText | Author: pravanya gajula | Date:4 April 2022 |
	 * Description: This method used to select the visible text | Parameters:
	 * locator, text| Return: none
	 * =============================================================================
	 */
	public void selectByVisibleText(By locator, String text) {
		// TODO Auto-generated method stub
		WebElement element = waitForVisible(locator);
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}

	/**
	 * =============================================================================
	 * Method: verifyText | Author: pravanya gajula | Date:6 April 2022 |
	 * Description: This method used to verify text | Parameters: actualText,
	 * expectedText| Return: none
	 * =============================================================================
	 * 
	 * @throws IOException
	 */

	public static void verifyText(String actualText, WebElement expectedText) throws IOException {
		if (actualText.contains((CharSequence) expectedText)) {
			ReportManager.logPass("Actual Text - " + "<b style=\"color:green;\">" + actualText + "</b>"
					+ " matched with expected " + "<b style=\"color:green;\">" + expectedText + "</b>");
		} else {
			ReportManager.logFail("Actual Text - " + "<b style=\"color:green;\">" + actualText + "</b>"
					+ " not matched with expected " + "<b style=\"color:green;\">" + expectedText + "</b>");
			assertEquals(expectedText, actualText);
		}

	}

	/**
	 * =============================================================================
	 * Method: isDisplayed | Author: pravanya gajula | Date:8 April 2022 |
	 * Description: This method used for particular element is desplayed or not |
	 * Parameters: locator, info | Return: none
	 * =============================================================================
	 */

	public boolean isDisplayed(By locator, String info) {

		WebElement elm = waitForVisible(locator);
		boolean isPresent = elm.isDisplayed();
		if (isPresent) {
			ReportManager.logInfo("Successfully element displayed: " + "<b style=\"color:green;\">" + info + "</b>");
			System.out.println("Successfully element displayed: " + "<b style=\"color:green;\">" + info + "</b>");
		} else {
			ReportManager.logInfo("element not displayed: " + "<b style=\"color:green;\">" + info + "</b>");
			System.out.println("element not displayed: " + info);
		}
		return isPresent;
	}

	/**
	 * =============================================================================
	 * Method: doubleClick | Author: pravanya | Date:9 march 2022 | Description:
	 * This method used for double click on element | Parameters: locator | Return:
	 * none
	 * =============================================================================
	 */
	public static void doubleClick(By locator) {

		Actions actions = new Actions(DriverFactory.getInstance().getWindowDriver());
		WebElement elementLocator = DriverFactory.getInstance().getWindowDriver().findElement(locator);
		actions.doubleClick(elementLocator).perform();
	}

	public void SelectComboboxItem(By locator, int index) {
		WebElement elm = waitForVisible(locator);
		elm.click();
		List<WebElement> lst_elm = elm.findElements(By.className("ListBoxItem"));
		// var comboBoxItems = elm.FindElementsByClassName("ListBoxItem");

		// new
		// Actions(elm.WrappedDriver).MoveToElement(comboBoxItems[index]).Click().Perform();
		new Actions(DriverFactory.getInstance().getWindowDriver()).moveToElement(lst_elm.get(index)).click().build()
				.perform();

	}

	/**
	 * =============================================================================
	 * Method: rightClick | Author: pravanya | Date:21 april 2022 | Description:
	 * This method used for right click on element | Parameters: locator | Return:
	 * none
	 * =============================================================================
	 */
	public void rightClick(By locator) throws Exception {
		WebElement elm = waitForVisible(locator);
		actions.contextClick(elm).build().perform();

		ReportManager.logInfo("Successfully Right Click action performed on " + elm.getText());
		System.out.println("Successfully Right Click action performed on " + elm.getText());
	}

	/**
	 * =============================================================================
	 * Method: isEnabled | Author: pravanya | Date:25 april 2022 | Description: This
	 * method used for element is enabled | Parameters: locator | Return: none
	 * =============================================================================
	 */
	public boolean isEnabled(By locator, String info) {
		WebElement elm = waitForVisible(locator);
		boolean isPresent = elm.isEnabled();
		if (isPresent) {
			ReportManager.logInfo("Successfully element Enabled: " + "<b style=\"color:green;\">" + info + "</b>");
			System.out.println("Successfully element Enabled: " + "<b style=\"color:green;\">" + info + "</b>");
		} else {
			ReportManager.logInfo("element not displayed: " + "<b style=\"color:green;\">" + info + "</b>");
			System.out.println("element not displayed: " + "<b style=\"color:green;\">" + info + "</b>");
		}
		return isPresent;
	}

	/**
	 * =============================================================================
	 * Method: isEnabled | Author: pravanya | Date:25 april 2022 | Description: This
	 * method used for element is enabled | Parameters: locator | Return: none
	 * =============================================================================
	 */
	public void mouseHover(By locator) throws Exception {
		WebElement elm = waitForVisible(locator);
		actions.moveToElement(elm).build().perform();
		String elmText = elm.getText();
		ReportManager.logInfo("Successfully mouse hover and get text - " + elmText);
		System.out.println("Successfully mouse hover and get text - " + elmText);
	}

	/**
	 * =============================================================================
	 * Method: fileUploadsendKeys | Author: pravanya | Date:25 april 2022 |
	 * Description: This method used for uploading file | Parameters: locator |
	 * Return: none
	 * =============================================================================
	 */

	public void fileUploadsendKeys(By locator, String path) throws AWTException, InterruptedException, IOException {
		WebElement elm = waitForVisible(locator);
//		Thread.sleep(2000);

		elm.click();
		System.out.println("File exists at give path");
		StringSelection ss = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); // copy the above string to clip
																				// board
		Robot robot;
		robot = new Robot();
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
//			robot.delay(10000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
//			robot.delay(5000);
		robot.keyRelease(KeyEvent.VK_CONTROL); // paste the copied string into the dialog box
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER); // enter

	}

	/**
	 * =============================================================================
	 * Method: alertAccept() | Author: pravanya | Date:16 May 2022 | Description:
	 * This method used for accepting the alert | Parameters: locator | Return: none
	 * =============================================================================
	 */

	public void alertAccept() throws Exception {
		try {
			Thread.sleep(1000);
			DriverFactory.getInstance().getWindowDriver().switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			System.out.println(e);
		}

	}

	/**
	 * =============================================================================
	 * Method: Scroll Down | Author: pravanya | Date:19 May 2022 | Description: This
	 * method used for scroll down the page | Parameters: locator | Return: none
	 * =============================================================================
	 */

	public void scrollDownUsingsendKeys(By locator) {
		WebElement elm = DriverFactory.getInstance().getWindowDriver().findElement(locator);
		elm.sendKeys(Keys.DOWN);
		elm.sendKeys(Keys.DOWN);
	}
	
	/**
	 * =============================================================================
	 * Method: pageDownUsingsendKeys | Author: pravanya | Date:21 may 2022 |
	 * Description: This method used for uploading file | Parameters: locator |
	 * Return: none
	 * =============================================================================
	 */
	public void pageDownUsingsendKeys(By locator) {
		WebElement elm = DriverFactory.getInstance().getWindowDriver().findElement(locator);
		elm.sendKeys(Keys.PAGE_DOWN);
		elm.sendKeys(Keys.PAGE_DOWN);
	}

	/**
	 * =============================================================================
	 * Method:scrollUpUsingsendKeys() | Author: pravanya | Date:24 May 2022 |
	 * Description: This method used for scroll Up the page | Parameters: locator |
	 * Return: none
	 * =============================================================================
	 */

	public void scrollUpUsingsendKeys(By locator) {
		WebElement elm = DriverFactory.getInstance().getWindowDriver().findElement(locator);
		elm.sendKeys(Keys.PAGE_UP);
//		elm.sendKeys(Keys.PAGE_UP);

	}

	/**
	 * =============================================================================
	 * Method:scrollPageDownUsingsendKeys() | Author: pravanya | Date:24 May 2022 |
	 * Description:This method used for scroll Up the page | Parameters: locator |
	 * Return:none
	 * =============================================================================
	 */
	public void scrollPageDownUsingsendKeys(By locator) {
		WebElement elm = DriverFactory.getInstance().getWindowDriver().findElement(locator);
		elm.sendKeys(Keys.PAGE_DOWN);
		elm.sendKeys(Keys.PAGE_DOWN);
	}

	public void AccessbilityID(By locator, String info) {
		WebElement elm = DriverFactory.getInstance().getWindowDriver().findElement(locator);
//		elm.findElements(locator);
		elm.click();
	}

	/**
	 * =============================================================================
	 * Method:altP() | Author: pravanya | Date:17 june 2022 | Description: This
	 * method used for entering alt + P from keyboard | Parameters: locator |
	 * Return: none
	 * =============================================================================
	 */

	public void altP(By locator) throws AWTException {

		WebElement elm = waitForVisible(locator);

		Robot robot = new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_P);
	}

	/**
	 * =============================================================================
	 * Method:altA() | Author: pravanya | Date:17 june 2022 | Description: This
	 * method used for entering alt + A from keyboard | Parameters: locator |
	 * Return: none
	 * =============================================================================
	 */

	public void altA(By locator) throws AWTException {

		WebElement elm = waitForVisible(locator);

		Robot robot = new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_A);
	}

	/**
	 * =============================================================================
	 * Method:altL() | Author: pravanya | Date:17 june 2022 | Description: This
	 * method used for entering alt + A from keyboard | Parameters: locator |
	 * Return: none
	 * =============================================================================
	 */

	public void altL(By locator) throws AWTException {

		WebElement elm = waitForVisible(locator);

		Robot robot = new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_L);
	}

	/**
	 * =============================================================================
	 * Method:EscFromKeyboard | Author: pravanya | Date:17 june 2022 | Description:
	 * This method used for entering Esc button from keyboard | Parameters: locator
	 * | Return: none
	 * =============================================================================
	 */
	public void EscFromKeyboard(By locator) throws AWTException {

		WebElement elm = waitForVisible(locator);

		Robot robot = new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
//		robot.keyPress(KeyEvent.VK_ACCEPT);

	}

	/**
	 * =============================================================================
	 * Method:ctrlS() | Author: pravanya | Date:17 june 2022 | Description: This
	 * method used for entering ctrl+S from keyboard | Parameters: locator | Return:
	 * none
	 * =============================================================================
	 */
	public void ctrlS() throws AWTException {
		Robot robot = new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_S);
	}

	/**
	 * =============================================================================
	 * Method:isDisabled | Author: pravanya | Date:17 june 2022 | Description: This
	 * method used to validate element is disabled or not| Parameters: locator |
	 * Return: none
	 * =============================================================================
	 */

	public boolean isDisabled(By locator, String info) {
		WebElement elm = waitForVisible(locator);
		boolean isPresent = elm.isEnabled();
		if (isPresent) {
			ReportManager.logInfo("Successfully element Disabled: " + "<b style=\"color:green;\">" + info + "</b>");
			System.out.println("Successfully element Disabled: " + "<b style=\"color:green;\">" + info + "</b>");
		} else {
			ReportManager.logInfo("element is Disabled: " + "<b style=\"color:green;\">" + info + "</b>");
			System.out.println("element not Disabled: " + "<b style=\"color:green;\">" + info + "</b>");
		}
		return isPresent;
	}

	/**
	 * =============================================================================
	 * Method: openURL | Author: Kriss | Date:16 Jan 2020 | Description: This method
	 * open url | Parameters: URL | Return: none
	 * =============================================================================
	 */
	public void openURL(String URL) {
		DriverFactory.getInstance().getWebDriver().get(URL);
		DriverFactory.getInstance().getWebDriver().getCurrentUrl();
		ReportManager.logInfo("Successfully Entered URL - " + "<b style=\"color:green;\">" + URL + "</b>");
		System.out.println("Successfully Entered URL - " + URL);
	}

	/**
	 * =============================================================================
	 * Method:ctrlN() | Author: pravanya | Date:29 june 2022 | Description: This
	 * method used for entering ctrl+N from keyboard | Parameters: locator | Return:
	 * none
	 * =============================================================================
	 */
	public void ctrlN() throws AWTException {
		Robot robot = new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_N);
	}

	/**
	 * =============================================================================
	 * Method:ctrlH() | Author: pravanya | Date:2 sept 2022 | Description: This
	 * method used to refresh the page | Return: none
	 * =============================================================================
	 */
	public void ctrlH() throws AWTException {
		Robot robot = new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_H);
	}

	public void shift1() throws AWTException {

//		WebElement elm = waitForVisible(locator);

		Robot robot = new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_1);
	}

	/**
	 * =============================================================================
	 * Method:AltN() | Author: pravanya | Date:24 august 2022 | Description: This
	 * method used for entering Alt+N from keyboard | Parameters: locator | Return:
	 * none
	 * =============================================================================
	 */
	public void AltN() throws AWTException {
		Robot robot = new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_N);
	}

	public void space() throws AWTException {
		Robot robot = new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_SPACE);
	}

	public static void clickUsingAccessbilityTest() {
		// WebElement elm = waitForVisible(locator);
//		String text = DriverFactory.getInstance().getWindowDriver().getPageSource().toString();
		List<WebElement> elm = DriverFactory.getInstance().getWindowDriver().findElementsByTagName("span");
		WebDriverWait wait = new WebDriverWait(DriverFactory.getInstance().getWindowDriver(), 40);
//		wait.until(ExpectedConditions.elementToBeClickable(elm));
//		elm.click();
		for (WebElement el : elm) {
			String txt = el.getAttribute("data-automation-id");
			if (txt == "saleplsbtn") {
				el.click();
			}
		}

	}

//	public void scrollDownUsingSendKeysToSelectUnit(By locator,int loopCount) throws Exception {
//		WebElement elm = DriverFactory.getInstance().getWindowDriver().findElement(locator);
//		System.out.println(DriverFactory.getInstance().getWindowDriver().getPageSource());
//		elm.sendKeys(Keys.TAB);

//		public void scrollDownUsingSendKeysToSelectTax(By locator) throws Exception {
//			WebElement elm = DriverFactory.getInstance().getWindowDriver().findElement(locator);
//			elm.sendKeys(Keys.TAB);

//		
//		for(int loop=0;loop<=loopCount;loop++)
//		{
//		elm.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(1500);
//		if(elm.isDisplayed())
//		{
//			DriverFactory.getInstance().getWindowDriver().findElement(locator).click();
//			loop=26;
//		}
//		
////		elm.sendKeys(Keys.ARROW_DOWN);
//		}
//	}
//		elm.sendKeys(Keys.DOWN);
//		

	public void scrollDownUsingSendKeysToSelectUnitandTax(int DataItem, String value) throws Exception {
		int i = 1;
		for (int loop = 0; loop <= i; loop++) {
//				xpath generating dynamically 
			WebElement elm = DriverFactory.getInstance().getWindowDriver()
					.findElementByXPath("//Pane/Document[1]/Group[2]/Custom[1]/Table[1]/Custom[2]/DataItem[" + DataItem
							+ "]/List[1]/ListItem[" + i + "]");
			String elmvalue = elm.getAttribute("Name");
			if (elmvalue.equalsIgnoreCase(value)) {
				elm.click();
				break;
			}
			elm.sendKeys(Keys.ARROW_DOWN);
			i = i + 1;
		}

	}

//		public void scrollDownUsingSendKeysToSelectUnitandTax(int DataItem,String value) throws Exception {
//			int i=1;
//			for(int loop=0;loop<=i;loop++)
//			{
////				xpath generating dynamically 
//				WebElement elm = DriverFactory.getInstance().getWindowDriver().findElementByXPath("//Pane/Document[1]/Group[2]/Custom[1]/Table[1]/Custom[2]/DataItem["+DataItem+"]/List[1]/ListItem["+i+"]");
//			     String elmvalue=elm.getAttribute("Name");
//				if(elmvalue.equalsIgnoreCase(value)) {
//					elm.click();
//					break;
//				}
//				elm.sendKeys(Keys.ARROW_DOWN);
//			i=i+1;
//			}
//			
//		}

	public static WebElement waitForvisibileByAccessibleId(String automationId, int milliseconds) throws Exception {
		boolean iterate = true;

		WebElement control = null;
		Stopwatch stopwatch = Stopwatch.createStarted();
		long _elementTimeOut = TimeUnit.MILLISECONDS.toMillis(milliseconds);
		while (stopwatch.elapsed(TimeUnit.MILLISECONDS) <= _elementTimeOut && iterate == true) {
			try {
				System.out.println("Entering into the method");
				control = DriverFactory.getInstance().getWindowDriver().findElementByAccessibilityId(automationId);
				iterate = false;

			} catch (NoSuchElementException e) {
				System.out.println(e);
			}
		}

		stopwatch.stop();
		stopwatch.reset();
		return control;
	}

	public void scrollDownUsingSendKeysToSelectState(String value) throws Exception {
		int i = 1;
		for (int loop = 0; loop <= i; loop++) {
//				xpath generating dynamically 
			WebElement elm = DriverFactory.getInstance().getWindowDriver()
					.findElementByXPath("//Pane/Document[1]/Group[2]/Custom[1]/List[1]/ListItem[" + i + "]");
			String elmvalue = elm.getAttribute("Name");
			if (elmvalue.equalsIgnoreCase(value)) {
				elm.click();
				break;
			}
			elm.sendKeys(Keys.ARROW_DOWN);
			i = i + 1;
		}
	}

	public void scrollDownUsingSendKeysToSelectUnit(int custom, String value) throws Exception {
		int i = 1;
		for (int loop = 0; loop <= i; loop++) {
//					xpath generating dynamically 
			WebElement elm = DriverFactory.getInstance().getWindowDriver()
					.findElementByXPath("//Pane/Document[1]/Group[2]/Custom[1]/Table[1]/Custom[" + custom
							+ "]/DataItem[4]/List[1]/ListItem[" + i + "]");
			String elmvalue = elm.getAttribute("Name");
			if (elmvalue.equalsIgnoreCase(value)) {

				elm.click();
				break;
			}
			elm.sendKeys(Keys.ARROW_DOWN);
			i = i + 1;

		}
	}

	public void scrollDownUsingSendKeysToSelectUnitArrowUP(int custom, String value) throws Exception {
		
		
//					xpath generating dynamically 
		List<WebElement> elmlist = DriverFactory.getInstance().getWindowDriver()
					.findElements(By.xpath("//List[@AutomationId='unitList']//following-sibiling::ListItem"));
		for (WebElement elm : elmlist) {
			String elmvalue = elm.getAttribute("Name");
			if (elmvalue.equalsIgnoreCase(value)) {
				elm.sendKeys(Keys.ARROW_UP);
				elm.click();
				break;
			}
			elm.sendKeys(Keys.ARROW_DOWN);
			

		}
	}

	public void scrollDownUsingSendKeysToSelectTax(String value) throws Exception {

		List<WebElement> elmlist = DriverFactory.getInstance().getWindowDriver()
				.findElements(By.xpath("//List[@AutomationId='item-list-taxPercent0']//following-sibling::ListItem"));

		for (WebElement elm : elmlist) {
			String elmvalue = elm.getAttribute("Name");

			if (elmvalue.equalsIgnoreCase(value)) {
				elm.click();
				break;
			}
			elm.sendKeys(Keys.ARROW_DOWN);

		}

	}
	public void scrollDownUsingSendKeysToSelectTax2(String value) throws Exception {

		List<WebElement> elmlist = DriverFactory.getInstance().getWindowDriver()
				.findElements(By.xpath("//List[@AutomationId='item-list-taxPercent1']//following-sibling::ListItem"));

		for (WebElement elm : elmlist) {
			String elmvalue = elm.getAttribute("Name");

			if (elmvalue.equalsIgnoreCase(value)) {
				elm.click();
				break;
			}
			elm.sendKeys(Keys.ARROW_DOWN);

		}

	}
	public void scrollDownUsingSendKeysToSelectUnitArrowUP1(String value) throws Exception {
		WebElement elmlist = DriverFactory.getInstance().getWindowDriver().findElementByName(value);
		elmlist.click();

	}

//=========

	public void scrollDownUsingSendKeysToSelectState1(String value) throws Exception {

		List<WebElement> elmlist = DriverFactory.getInstance().getWindowDriver()
				.findElementsByAccessibilityId("item-label-placeOfSupply");
		for (WebElement elm : elmlist) {
			String elmvalue = elm.getAttribute("Name");
			if (elmvalue.equalsIgnoreCase(value)) {
				elm.click();
				break;
			}
			elm.sendKeys(Keys.ARROW_DOWN);

		}

	}

	/**
	 * =============================================================================
	 * Method:SelectTaxPercentage | Author: pravanya | Date:12 JAN 2023 |
	 * Description: This method used for entering scrolldown for selecting the tax
	 * percentage | Parameters: locator | Return: none
	 * =============================================================================
	 */

	public void SelectFromDropdownUsingAccessibilityId(String value, String Locator) throws Throwable {
		List<WebElement> elmlist = DriverFactory.getInstance().getWindowDriver().findElementsByAccessibilityId(Locator);
		for (WebElement elm : elmlist) {
			String elmvalue = elm.getAttribute("Name");
			System.out.println(elmvalue);
			if (elmvalue.equalsIgnoreCase(value)) {
				elm.click();
				break;
			}
			elm.sendKeys(Keys.ARROW_DOWN);
		}

	}

	/**
	 * =============================================================================
	 * Method:getTextUsingAccessbilityID | Author: Lavanya | Date:13 JAN 2023 |
	 * Description: This method used for get text using the Accessbility ID |
	 * Parameters: locator | Return: none
	 * =============================================================================
	 * 
	 * @return
	 */
	public String getTextUsingAccessbilityID(String locator, String info) {
		WebElement elm = DriverFactory.getInstance().getWindowDriver().findElementByAccessibilityId(locator);
		String ele = elm.getText();
		ReportManager.logInfo("Successfully get text - <b style=\"color:green;\">" + ele + "</b>");
		System.out.println("Successfully get text - " + ele);
		return ele;
	}

	/**
	 * =============================================================================
	 * Method:SelectingCombobox | Author: Laxmi,lavanya | Date:17 JAN 2023 |
	 * Description: This method used for Selecting the combobox for filter |
	 * Parameters: locator | Return: none
	 * =============================================================================
	 * 
	 * @return
	 */

	public void SelectComboboxFilter(String filter) {
		int index = 1;
		for (int loop = 1; loop < 5; loop++) {
//		System.out.println(index);
			WebElement elm = DriverFactory.getInstance().getWindowDriver()
					.findElement(By.xpath("//Pane/Document[1]/ComboBox[1]/List[1]/ListItem[" + index + "]"));
//		System.out.println(elm.getAttribute("Name"));
			String Filtervalue = elm.getAttribute("Name");
			if (Filtervalue.equalsIgnoreCase(filter)) {
				elm.click();
				break;
			}
			elm.sendKeys(Keys.ARROW_DOWN);

			index = index + 1;
		}
	}

	/**
	 * =============================================================================
	 * Method:SelectingCombobox | Author: Laxmi,lavanya | Date:17 JAN 2023 |
	 * Description: This method used for Selecting the combobox by using combo box
	 * number for filter | Parameters: locator | Return: none
	 * =============================================================================
	 * 
	 * @return
	 */
	public void SelectComboboxByUsingIndex(int comboboxIndex, String filter) {

		int index = 1;
		for (int loop = 1; loop < 5; loop++) {
//		System.out.println(index);
			WebElement elm = DriverFactory.getInstance().getWindowDriver().findElement(
					By.xpath("//Pane/Document[1]/ComboBox[" + comboboxIndex + "]/List[1]/ListItem[" + index + "]"));
			System.out.println(elm.getAttribute("Name"));
//		String Filtervalue = elm.getAttribute("Name");
//		if (Filtervalue.equalsIgnoreCase(filter)) {
//			elm.click();
//			break;
//		}
//		elm.sendKeys(Keys.ARROW_DOWN);

			index = index + 1;
		}
	}

	/**
	 * =============================================================================
	 * Method:Selecting Date from filter | Author: Laxmi,lavanya | Date:21 JAN 2023
	 * | Description: This method used for Selecting various values from the Date
	 * filter | Parameters: locator | Return: none
	 * =============================================================================
	 * 
	 * @return
	 */

	public void SelectValueFromDateFilter(String filter) {

		List<String> arr = new ArrayList<String>();
		// using add() to initialize values
		arr.add("Equal to");
		arr.add("Greater than");
		arr.add("Less than");
		arr.add("Range");
		for (int i = 0; i < arr.size(); i++) {
//	System.out.println(arr.get(i));
			WebElement elm = DriverFactory.getInstance().getWindowDriver()
					.findElement(By.xpath("//ListItem[@Name='" + arr.get(i) + "']"));
			String elmValue = elm.getAttribute("Name");
//	System.out.println(elmValue);
			if (elmValue.equalsIgnoreCase(filter)) {
				elm.sendKeys(Keys.ENTER);
				break;
			}
			elm.sendKeys(Keys.ARROW_DOWN);
		}

	}

	/**
	 * =============================================================================
	 * Method:Selecting Contains and Exact match from filter | Author: Laxmi,lavanya
	 * | Date:21 JAN 2023 | Description: This method used for Selecting various
	 * values from the Different filter | Parameters: locator | Return: none
	 * =============================================================================
	 * 
	 * @return
	 */

	public void SelectContainsAndExactmatchFromFilter(String filter) {

		List<String> arr = new ArrayList<String>();
		// using add() to initialize values
		arr.add("Contains");
		arr.add("Exact match");
		for (int i = 0; i < arr.size(); i++) {
//	System.out.println(arr.get(i));
			WebElement elm = DriverFactory.getInstance().getWindowDriver()
					.findElement(By.xpath("//ListItem[@Name='" + arr.get(i) + "']"));
			String elmValue = elm.getAttribute("Name");
//	System.out.println(elmValue);
			if (elmValue.equalsIgnoreCase(filter)) {
				elm.sendKeys(Keys.ENTER);
				break;
			}
			elm.sendKeys(Keys.ARROW_DOWN);
		}

	}

	/**
	 * =============================================================================
	 * Method:Selecting Amount values from filter | Author: Laxmi,lavanya | Date:21
	 * JAN 2023 | Description: This method used for Selecting various values from
	 * the Different filter | Parameters: locator | Return: none
	 * =============================================================================
	 * 
	 * @return
	 */

	public void SelectAmountFromFilter(String filter) {

		List<String> arr = new ArrayList<String>();
		// using add() to initialize values
		arr.add("Equal to");
		arr.add("Greater than");
		arr.add("Less than");
		for (int i = 0; i < arr.size(); i++) {
//	System.out.println(arr.get(i));
			WebElement elm = DriverFactory.getInstance().getWindowDriver()
					.findElement(By.xpath("//ListItem[@Name='" + arr.get(i) + "']"));
			String elmValue = elm.getAttribute("Name");
//	System.out.println(elmValue);
			if (elmValue.equalsIgnoreCase(filter)) {
				elm.sendKeys(Keys.ENTER);
				break;
			}
			elm.sendKeys(Keys.ARROW_DOWN);
		}

	}

	/**
	 * =============================================================================
	 * Method:Selecting Base Unit and Seconadary Unit | Author: Laxmi | Date:27 JAN
	 * 2023 | Description: This method used for Selecting Base unit and Seconadary
	 * unit from dropdown | Parameters: locator,value | Return: none
	 * =============================================================================
	 * 
	 * @return
	 */

	public void SelectBaseUnitandSeconadaryUnitFromDropdown(String Locator, String value) throws Throwable {
		List<WebElement> elmlist = DriverFactory.getInstance().getWindowDriver().findElements(By.xpath(Locator));
//	System.out.println(elmlist.size());

		for (WebElement elm : elmlist) {
			String elmvalue = elm.getAttribute("Name");
//        System.out.println(elmvalue);
			if (elmvalue.equalsIgnoreCase(value)) {
				elm.sendKeys(Keys.ARROW_DOWN);
				elm.sendKeys(Keys.ENTER);
				break;
			}
			elm.sendKeys(Keys.ARROW_DOWN);
		}

	}
	
	public void sendKeysToAlert(String text) {
//		WebDriverWait wait = new WebDriverWait(DriverFactory.getInstance().getWindowDriver()hashCode(), Duration.ofSeconds(10));
	//	if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
			DriverFactory.getInstance().getWindowDriver().switchTo().alert().sendKeys(text);
			ReportManager.logInfo("Successfully Entered text - " + text +" in alert text field");
			System.out.println("Successfully Entered text - " + text+"  in alert text field");
	}
	
	/**
	 * =============================================================================
	 * Method: get Date | Author: pravanya | Date:14 FEB
	 * 2023 | Description: current date = 0, Tommarrow = 1, Yesterday = -1
	 * [ User need to pass as parameters| Parameters: dateSelection | Return: date[dd/MM/yyyy]
	 * =============================================================================
	 * 
	 * @return
	 */
public String getDate(int dateSelection){
	 Calendar calendar = Calendar.getInstance();
 
	 calendar.add(Calendar.DATE, dateSelection); 
	 CurrentDate = calendar.getTime(); 
	 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
	String date = formatter.format(CurrentDate); 
	
	return date;
}

/**
 * =============================================================================
 * Method: get Date | Author: Lavanya | Date:14 FEB
 * 2023 | Description: current date = 0, Tommarrow = 1, Yesterday = -1
 * [ User need to pass as parameters| Parameters: dateSelection | Return: date[dd/MM/yyyy]
 * =============================================================================
 * 
 * @return
 */

public void ctrlV() throws AWTException {
	Robot robot = new Robot();
	robot.delay(2000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
}



}
