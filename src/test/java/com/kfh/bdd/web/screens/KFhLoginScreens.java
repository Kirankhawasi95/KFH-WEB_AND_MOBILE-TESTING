package com.kfh.bdd.web.screens;

import com.kfh.bdd.ccl.PlayActions;
import com.kfh.bdd.integrations.common_utils.BrowserFactory;
import com.kfh.bdd.integrations.common_utils.ConfigReader;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.BrowserContext;

public class KFhLoginScreens {
	String otp;
	BrowserContext context = BrowserFactory.getInstance().getPage().context();
	PlayActions play = new PlayActions();
	Page page = play.getPage();

	// User signup link
	String link_NewSignup = "//a[text()=\"New User Sign Up\"]";

	// Civics,ATM,PIN details
	String txt_ValidCivilID = "//input[@id=\"civilid\"]";
	String txt_ValidATMNumber = "//input[@id=\"atmcardNo\"]";
	String txt_validPinNumber = "//input[@id=\"pinNo\"]";

	// checkbox Acknowledge
	String checkBoxbtn_Acknowledge = "//input[@id=\"acceptTerms\"]";

	// submit button
	String btn_Submit = "//input[@id=\"submitButton\"]";

	// send code button
	String btn_Sendcode = "//input[@type=\"submit\"]";

	// last3 digits/number
	String txt_Last3MobileDigitd = "";

	// valid Code
	String txt_ValidCode = "";

	// Remainig Time Sms Code
	String txt_RemainingTimeSMSCode = "";

	// Submit button after entering the code
	String btn_SubmitButton = "";

	String txt_ChooseLoginandPwdMessage = "";

	// username and pwd details

	// Mobile5digits
	String txt_5digitAccountNumber = "";

	String select_environment = "#lstEnvironment";
	String search_button = "//input[@type=\"submit\"]";
	String civil_ID_value_from_list = "//tr[@style='background-color:aliceblue'][1]//td[11]";
	String otp_value_from_list = "//tr[@style='background-color:aliceblue'][1]//td[1]";

	public void OpenURL() {
		play.openURL(ConfigReader.getValue("baseURI"));
	}

	public void link_NewSignup() {
		play.click(link_NewSignup, "NewSignup");
	}

	public void enterValidCivilID() {
		play.sendKeys(txt_ValidCivilID, ConfigReader.getValue("ValidCivilID"), "#Values");
	}

	public void enterATMNumber() {
		play.sendKeys(txt_ValidATMNumber, ConfigReader.getValue("ValidATMNumber"), "ATM Details");
	}

	public void enterValidPinNumber() {
		play.sendKeys(txt_validPinNumber, ConfigReader.getValue("validPinNumber"), "Pin Number");
	}

	public void clickAcknowledgeCheckbox() {
		play.click(checkBoxbtn_Acknowledge, "Acknowledge CheckBox");
	}

	public void clickSubmitButton() {
		play.click(btn_Submit, "Submit Button");
	}

	public void txtMobileNumberMessage(String value) {
		play.verifyText(value, "If your Mobile Number is correct Press send Code");// this will validate the actaual and
																					// expected value // expected text
	}

	public void clickSendcodeButton() {
		play.click(btn_Sendcode, "Send Code");
	}

	public void txtMessageLast3MobileDigit() {
		// logic for getting the text of last 3 digits
		String actualText = play.getText(txt_Last3MobileDigitd);
		String last3Digits = actualText.substring(actualText.length() - 3, actualText.length() - 1); // just an eg for 8
																										// digit number

		// accordingly
	}

	public void navigatetoOTPurl() {
		Page newPage = context.newPage();

		newPage.navigate("https://testsso.kfh.kw/OTP/"); // Replace with the actual URL

		newPage.locator(select_environment).selectOption("2");
		newPage.click(search_button);
		String expected_civil_ID_value = ConfigReader.getValue("Valid_Civil_ID");
		String actual_civil_ID_value = newPage.textContent(civil_ID_value_from_list);
		System.out.println("Civil ID value from the list = " + actual_civil_ID_value);
		play.verifyText(actual_civil_ID_value, expected_civil_ID_value);

		otp = newPage.textContent(otp_value_from_list);
		System.out.println("OTP value from the list = " + otp);
		newPage.close();
		page.bringToFront();

	}

	public void enterValidCode() {
		play.sendKeys(txt_ValidCode, "#enter the valid code#", "the Code");

	}

	public void txtMessageResendTime() {
		play.verifyText(txt_RemainingTimeSMSCode, "Remaining Time to Resend SMS Code");
	}

	public void btnSubmitButton() {
		play.click(btn_SubmitButton, "Submit button");

	}

	public void txtChooseLoginandPwd() {

		play.verifyText(txt_ChooseLoginandPwdMessage, "Please choose a Login name and a password");

	}

	public void txtResendCodeMessage() {
		play.verifyText(play.getText("#locator"), "Remaining Time to Resend SMS Code");

	}

}
