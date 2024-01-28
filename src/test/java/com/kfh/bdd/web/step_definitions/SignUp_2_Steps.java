package com.kfh.bdd.web.step_definitions;

import com.kfh.bdd.web.screens.SignUp_2_Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUp_2_Steps {
	
	SignUp_2_Pages signup= new SignUp_2_Pages();
	 
	 @When("^User enters the OTP (.+)$")
	 public void user_enters_the_otp_specified(String otpdata)
	 {
		 signup.user_enters_the_otp_specified(otpdata);
	 }
	@Then("^User should able to see error message(.+)$")
	 public void user_should_able_to_see_error_message(String expectedErrorMessage){
		 signup.user_should_able_to_see_error_message(expectedErrorMessage);
	}
	@When("^User enters the Username (.+)$")
	 public void user_enters_the_Username_specified(String username)
	 {
		 signup.user_enters_the_Username_specified(username);
	 }
	@When("^User enters (.+) in the Confirm Password field$")
	 public void user_enters_specified_in_Confirm_password_field(String password)
	 {
		 signup.user_enters_specified_in_Confirm_password_field(password);
	 }
	@When("^User enters the Password (.+)$")
	 public void user_enters_the_password_specified(String password)
	 {
		 signup.user_enters_the_password_specified(password);
	 }
	
	@Then("^User should able to see the error message(.+)$")
	 public void user_should_able_to_see_the_error_message(String expectedErrorMessage){
		 signup.user_should_able_to_see_the_error_message(expectedErrorMessage);
	}

}
