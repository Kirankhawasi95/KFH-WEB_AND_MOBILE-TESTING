package com.kfh.bdd.web.screens;

import org.junit.Assert;

import com.kfh.bdd.ccl.PlayActions;
import com.kfh.bdd.integrations.common_utils.BrowserFactory;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;

public class OTPscreens {

	PlayActions play = new PlayActions();
	Page page = play.getPage(); // to currentPage value n storing it the page varialbl// current page session id
	Page newpage; // new page one more ref variable

	String btn_RequestLoginOTP = "";
	String actualText = "";
	String txt_Code = "";
	String btn_Continue = "";
	
		BrowserContext context = BrowserFactory.getInstance().getPage().context();
	public void clickRequestLoginOTP() {

		play.click(btn_RequestLoginOTP, "Request Login OTP");
	}

	public void nextTabforOTP() {
		Page newPage = context.newPage();
		 
		newPage.navigate("enter otp url"); // Replace with the actual URL
 
		 actualText = newPage.innerText("//h4[text()='Accepted usernames are:']");
 
		page.bringToFront();
//		newpage = page.waitForPopup(() -> { // waitforpop from playwright
//			actualText = play.getText("#locator");
	//	});
	}

	public void enterCode() {

		play.sendKeys(txt_Code, actualText, "Text code");
	}

	public void clickContinueBtn() {

		play.click(btn_Continue, "Continue button");

	}

	public void pageKuwaitFinance() {
		String expectedValue = "Kuwait Finance House";
		play.verifyText(play.getText("#locator"), expectedValue);
	}

	public void user_should_able_to_see_the_Login_OTP_page() {
		// TODO Auto-generated method stub
		
	}

	public void user_enters_the_Login_OTP_specified(String otpdata) {
		play.sendKeys("put the locator", otpdata, "Please enter the code");
		/*
		 * if sendKeys method is not giving best results 
		 * kindly, go for the enterText() method
		 */
	}

	public void user_should_able_to_see_the_text_specified(String expectedText) {
		
		switch (expectedText.trim()) {
		case "Shutter Island":
			String actualErrorMessage = play.getPage().textContent("put the Locator");
			Assert.assertEquals(expectedText, actualErrorMessage);
			play.isVisible("put the Same Locator", actualErrorMessage);

			break;
		case "Fight Club":
			actualErrorMessage = play.getPage().textContent("put the Locator 2");
			Assert.assertEquals(expectedText, actualErrorMessage);
			play.isVisible("put the Same Locator 2", actualErrorMessage);
			
			/* Why Above approach?
			 * 1. isvisible method will return the boolean value immediately as soon as code executed, some times-  timeouts also will not work properly
			 * 2. text content method nothing but getText(), will work fine in any situation 
			 * 3. but in the extent duplication logs will happen, if i use the getText() from playActions, so I am following above approach
			 * 4. Instead of higher amount of waits, we can follow this kind of approaches for best Results
			 */
			break;

		}		
	}

}
