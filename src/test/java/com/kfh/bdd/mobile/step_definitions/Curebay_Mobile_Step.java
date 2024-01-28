package com.kfh.bdd.mobile.step_definitions;

import com.kfh.bdd.mobile.screens.Curebay_Mobile_Screens;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Curebay_Mobile_Step {
	Curebay_Mobile_Screens CB = new Curebay_Mobile_Screens();

	// Practice Login Scenario
	@When("User taps on the curebay application")
	public void User_taps_on_the_curebay_application() {

	}

	@When("User click on login or signup button")
	public void User_click_on_login_or_signup_button() {
		CB.User_click_on_login_or_signup_button();
	}

	@Then("User should be able to see login page")
	public void User_should_be_able_to_see_login_page() {
		CB.User_should_be_able_to_see_login_page();
	}

	@When("User enter Email or mobile number")
	public void User_enter_Email_or_mobile_number() {
		CB.User_enter_Email_or_mobile_number();
	}

	@And("User enter password")
	public void User_enter_password() {
		CB.User_enter_password();
	}

	@And("User click on next button")
	public void User_click_on_next_button() {
		CB.User_click_on_next_button();
	}

	@Then("User should be able to see select member page")
	public void User_should_be_able_to_see_select_member_page() {
		CB.User_should_be_able_to_see_select_member_page();

	}

	@When("user taps on forgot password link")
	public void user_taps_on_forgot_password_link() {
		CB.user_taps_on_forgot_password_link();
	}

	@And("user enters invalid email id")
	public void user_enters_invalid_email_id() {
		CB.user_enters_invalid_email_id();
	}

	@Then("user should able to see enter valid email error message")
	public void user_should_able_to_see_enter_valid_email_error_message() {
		CB.user_should_able_to_see_enter_valid_email_error_message();
	}

	@And("user enters valid email id")
	public void user_enters_valid_email_id() {
		CB.user_enters_valid_email_id();
	}

//	@Then("user should able to see the (.+) Screen")
//	public void user_should_able_to_see_the_Screen(String value) {
//		CB.user_should_able_to_see_the_Screen(value);
//	}

	@Then("user should able to see the {string} Screen")
	public void user_should_able_to_see_the_screen(String value) {
		CB.user_should_able_to_see_the_Screen(value);
	}
	@And("user should able to see Enter Your Otp")
	public void user_should_able_to_see_Enter_Your_Otp() {
		CB.user_should_able_to_see_Enter_Your_Otp();
	}

	@And("user should able to see resend otp link")
	public void user_should_able_to_see_resend_otp_link() {
		CB.user_should_able_to_see_resend_otp_link();
	}

	@When("user enters valid otp")
	public void user_enters_valid_otp() throws InterruptedException {
		CB.user_enters_valid_otp();
	}
	
	@And("user should able to see resend otp timer")
	public void user_should_able_to_see_resend_otp_timer() {
		CB.user_should_able_to_see_resend_otp_timer();
	}
	@And("user should able to see Update Forgot password")
	public void user_should_able_to_see_Update_Forgot_password() {
		CB.user_should_able_to_see_Update_Forgot_password();
	}
}