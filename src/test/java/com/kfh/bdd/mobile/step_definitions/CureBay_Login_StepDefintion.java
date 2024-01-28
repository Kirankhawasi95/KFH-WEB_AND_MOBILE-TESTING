package com.kfh.bdd.mobile.step_definitions;

import java.io.IOException;

import com.kfh.bdd.mobile.screens.CureBay_Login_Screen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CureBay_Login_StepDefintion {
	CureBay_Login_Screen CB = new CureBay_Login_Screen();
	@When("user taps Login SignUp button")
	public void user_taps_login_sign_up_button() {
		CB.CB_btn_Login_Sign_up();
	}

	@Then("user should able to see login page")
	public void user_should_able_to_see_login_page() {
		CB.CB_Text_Login();
	}

	@When("user enters valid email id in email mobile text box as {string}")
	public void user_enters_valid_email_id_in_email_mobile_text_box_as(String string) {
		CB.CB_UserName_Email_or_Mobile_Number(string);
	}

	@When("user enters valid password in password box as {string}")
	public void user_enters_valid_password_in_password_box_as(String string) {
		CB.CB_UserName_Enter_Password(string);
	}

	@When("user taps on next button")
	public void user_taps_on_next_button() throws InterruptedException {
		CB.CB_btn_Next();
	}
	@When("user taps on NEVER or Save for Save password {string}")
	public void user_taps_on_NEVER_or_Save_for_Save_password(String string) {
		CB.autofill_save_Password(string);
	}

	@Then("user should able to see dashboard Screen")
	public void user_should_able_to_see_dashboard_Screen() {
		CB.CB_Text_Dashboard();
	}

	@When("user taps on Sign Out")
	public void user_taps_on_Sign_Out() throws InterruptedException {
		CB.CB_user_taps_on_Sign_Out();
	}
	@When("user closes and opens the app")
	public void user_closes_and_opens_the_app() throws InterruptedException {
		CB.user_closes_and_opens_the_app();
	}
	
}
