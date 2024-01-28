package com.kfh.bdd.web.step_definitions;

import com.kfh.bdd.web.screens.OTPscreens;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OTPSteps {

	OTPscreens otp = new OTPscreens();

	@When("User clicks on the Request Login OTP button")
	public void user_clicks_on_the_request_login_otp_button() {
		otp.clickRequestLoginOTP();
	}

	@Then("User should be taken to the next tab")
	public void user_should_be_taken_to_the_next_tab() {
		otp.nextTabforOTP();
	}

	@When("User enters the code")
	public void user_enters_the_code() {
		otp.enterCode();
	}

	@And("User clicks on the Continue button")
	public void user_clicks_on_the_continue_button() {
		otp.clickContinueBtn();
	}

	@Then("User should be able to see the Kuwait finance House Page")
	public void user_should_be_able_to_see_the_kuwait_finance_house_page() {
		otp.pageKuwaitFinance();
	}
	
	@Then("User should able to see the Login OTP page")
	public void user_should_able_to_see_the_Login_OTP_page() {
		otp.user_should_able_to_see_the_Login_OTP_page();
	}
	@Then("User should able to see the text {string}")
	public void user_should_able_to_see_the_text_specified(String expectedText) {
		otp.user_should_able_to_see_the_text_specified(expectedText);
	}
	@When("^User enters the Login OTP(.+)$")
	public void user_enters_the_Login_OTP_specified(String otpdata) {
		otp.user_enters_the_Login_OTP_specified(otpdata);
	}

}
