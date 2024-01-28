package com.kfh.bdd.web.step_definitions;

import com.kfh.bdd.web.screens.KFhLoginScreens;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KFHLoginsteps {

	KFhLoginScreens kfh = new KFhLoginScreens();

	@Given("User is on the KFH online")
	public void user_is_on_the_application_name() {
		kfh.OpenURL();
	}

	@When ("User click on New User signup link")
	public void User_click_on_New_User_signup_link() {
		kfh.link_NewSignup();
	}
	
	@When("User enters the Valid CivilID")
	public void user_enter_the_valid_civil_id() {
		kfh.enterValidCivilID();
	}

	@When("User enters the Valid ATM Account Number")
	public void user_enter_the_valid_atm_account_number() {
		kfh.enterATMNumber();
	}

	@When("User enters the Valid PIN Number")
	public void user_enter_the_valid_pin_number() {
		kfh.enterValidPinNumber();
	}

	@When("User checks the Acknowledge checkbox")
	public void user_checks_the_acknowledge_checkbox() {
		kfh.clickAcknowledgeCheckbox();
	}

	@When("User click on the Submit button")
	public void user_click_on_the_Submit_button() {
		kfh.clickSubmitButton();
	}
	
	@Then("User should be able to a message {string}")
	public void user_should_be_able_to_a_message(String value) {
		kfh.txtMobileNumberMessage(value);
	}

	@When("User clicks on the  Send Code button")
	public void user_clicks_on_the_send_code_button() {
		kfh.clickSendcodeButton();
	}

	@Then("User should be able to see the last three digit valid Mobile Number")
	public void user_should_be_able_to_see_the_last_three_digit_valid_mobile_number() {
		kfh.txtMessageLast3MobileDigit();
	}

	@When("User navigate to OTP url")
	public void User_navigate_to_OTP_url() {
		kfh.navigatetoOTPurl();
	}
	
	@When("User enters the Valid Code")
	public void user_enters_the_valid_code() {
		kfh.enterValidCode();
	}

	 @Then("User should be able to see the text Remaining Time to Resend SMS Code")
	 public void user_should_be_able_to_see_the_text_remaining_time_to_resend_sms_code() {
		 kfh.txtResendCodeMessage();
	 }
}
