package com.kfh.bdd.web.step_definitions;

import com.kfh.bdd.web.screens.KFHSiteRegistrationScreens;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KFHSiteRegistrationSteps {
	KFHSiteRegistrationScreens KFh = new KFHSiteRegistrationScreens();

	@When("User enters the valid Username")
	public void userr_enters_the_valid_username() {
		KFh.enterValidUsername();
	}

	@And("User enters the 5 digit of your account number")
	public void user_enters_the_5_digit_of_your_account_number() {
		KFh.enter5DigitAccountNumber();
	}

	@And("User clicks on Login")
	public void user_clicks_on_login() {
		KFh.clickLogin();
	}

	@Then("User should be able to see the message {string}")
	public void user_should_be_able_to_see_the_message(String string) {
		KFh.txtMessage();
	}

	@When("User clicks on the Cup images radio button")
	public void user_clicks_on_the_cup_images_radio_button() {
		KFh.clickRadioBtn();
	}

//	@And("User clicks on the Submit button")
//	public void user_clicks_on_the_Submit_button() {
//		KFh.clickSubmitBtn();
//	}

	@Then("User should be able to see the selected image")
	public void user_should_be_able_to_see_the_selected_image() {
		KFh.ViewSelectImage();
	}

	@When("User enters the title or discription for selected image")
	public void user_enters_the_title_or_discription_for_selected_image() {
		KFh.enterTitleDiscription();
	}

	@Then("User should be able to see the confirmation message as {string}")
	public void user_should_be_able_to_see_the_confirmation_message_as(String value) {
		KFh.txtConfirmationMessage(value);
	}

	@When("User enters the value for What is the name of the street on which you grew up")
	public void user_enters_the_value_for_What_is_the_name_of_the_street_on_which_you_grew_up() {
		KFh.enterGrewupValue();
	}

	@And("User enters the value for What is your favourite hobby")
	public void user_enters_the_value_for_What_is_your_favourite_hobby() {
		KFh.enterFavhobby();
	}

	@And("User enters the value for Who is your favourite Author")
	public void user_enters_the_value_for_who_is_your_favourite_author() {
		KFh.enterFavAuthor();
	}

	@And("User clicks on the Confirm button")
	public void user_clicks_on_the_confirm_button() {
		KFh.clickcnfMessage();
	}

	@Then("User should be able to see the password page")
	public void user_should_be_able_to_see_the_password_page() {
		KFh.txtPasswordPage();
	}

	@When("User enters the password and clicks on the Login button")
	public void user_enters_the_password_and_clicks_on_the_login_button() {
		KFh.enterPassword();
	}

	@Then("User should be able to get the Login OTP page")
	public void user_should_be_able_to_get_the_Login_otp_page() {
		KFh.txtLoginOTPPage();
	}

}
