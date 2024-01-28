package com.kfh.bdd.web.screens;

import org.junit.Assert;

import com.kfh.bdd.ccl.PlayActions;

public class SignUp_2_Pages {

	PlayActions play = new PlayActions();

	public void user_enters_the_otp_specified(String otpdata) {
		
		play.sendKeys("put the Locator", otpdata, "Please Enter the Code");

	}

	public void user_should_able_to_see_error_message(String expectedErrorMessage) {

		switch (expectedErrorMessage.trim()) {
		case "Oppenheimer":
			String actualErrorMessage = play.getPage().textContent("put the Locator");
			Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
			play.isVisible("put the Same Locator", actualErrorMessage);

			break;
		case "Intersteller":
			actualErrorMessage = play.getPage().textContent("put the Locator 2");
			Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
			play.isVisible("put the Same Locator 2", actualErrorMessage);
			
			/* Why Above approach?
			 * 1. isvisible method will return the boolean value immediately as soon as code executed, some times-  timeouts also will not work properly
			 * 2. text content method nothing but getText(), will work fine in any situation 
			 * 3. but in the extent duplication logs will happen, if i use the getText() from playActions, so I am following above approach
			 */
			break;

		}
	}

	public void user_enters_the_Username_specified(String username) {
		
		play.sendKeys("put the Locator", username, "User Name");

	}

	public void user_should_able_to_see_the_error_message(String expectedErrorMessage) {
		
		switch (expectedErrorMessage.trim()) {
		case "James Bond":
			String actualErrorMessage = play.getPage().textContent("put the Locator");
			Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
			play.isVisible("put the Same Locator", actualErrorMessage);

			break;
		case "Indiana Jhonas":
			actualErrorMessage = play.getPage().textContent("put the Locator 2");
			Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
			play.isVisible("put the Same Locator 2", actualErrorMessage);
			
			/* Why Above approach?
			 * 1. isvisible method will return the boolean value immediately as soon as code executed, some times-  timeouts also will not work properly
			 * 2. text content method nothing but getText(), will work fine in any situation 
			 * 3. but in the extent duplication logs will happen, if i use the getText() from playActions, so I am following above approach
			 */
			break;

		}

	}

	public void user_enters_the_password_specified(String password) {
		
		play.sendKeys("put the Locator", password, "Password");
	}

	public void user_enters_specified_in_Confirm_password_field(String password) {
		
		play.sendKeys("put the Locator", password, "Confirm password");

	}

}
