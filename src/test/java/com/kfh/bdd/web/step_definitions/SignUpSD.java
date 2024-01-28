package com.kfh.bdd.web.step_definitions;

import com.kfh.bdd.web.screens.SignUpWebPages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSD {
	SignUpWebPages signup = new SignUpWebPages();
	
	
	// SignUp Invalid civiID,AccNo, PinNO

	@When("^User enters the InValid (.+)$")
	public void user_enters_the_in_valid(String str) {
		signup.user_enters_the_in_valid(str);
	}

	@And("^User enters the InValid ATM (.+)$")
	public void user_enters_the_in_valid_atm(String str) {
		signup.user_enters_the_in_valid_atm(str);
	}

	@And("^User enters the InValid Pin(.+)$")
	public void user_enters_the_in_valid_pin(String str) {
		signup.user_enters_the_in_valid_pin(str);
	}

	@Then("^User should be able to see (.+)$")
	public void user_should_be_able_to_see(String str) {
		signup.user_should_be_able_to_see(str);
	}

}
