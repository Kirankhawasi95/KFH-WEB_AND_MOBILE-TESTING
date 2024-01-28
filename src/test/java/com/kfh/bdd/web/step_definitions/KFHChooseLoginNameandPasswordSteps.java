package com.kfh.bdd.web.step_definitions;

import com.kfh.bdd.web.screens.KFHChooseLoginNameAndPassword;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KFHChooseLoginNameandPasswordSteps {
	
	KFHChooseLoginNameAndPassword Kfhc=new KFHChooseLoginNameAndPassword();
	
	 @Then("User should see the text {string}")
	  public void user_should_see_the_text(String string) {
		  Kfhc.txtChooseLoginandPwd();
	  }

	 @When("User enters the Valid Username and PassWord")
	  public void user_enters_the_valid_username_and_pass_word() {
		  Kfhc.enterValidUsername();
		  Kfhc.enterValidPassword();
	  }
	 @And("User enters the Confirm Password")
	  public void user_enters_the_confirm_password() {
		  Kfhc.enterConfirmPwd();
	  }
	 @And("User clicks on the Password Expiry Period dropdown")
	  public void user_clicks_on_the_password_expiry_period_dropdown() {
		  Kfhc.clickExpiryPassword();
	  }
	 @And("User select one option from the dropdown")
	  public void user_select_one_option_from_the_dropdown() {
		  Kfhc.selectOption();
	  }
	 @Then("User should be able to see all the Notes displayed below")
	  public void user_should_be_able_to_see_all_the_notes_displayed_below() {
		  Kfhc.txtMessageNote();
	  }
//	 @When("User clicks on the submit button")
//	    public void user_clicks_on_the_submit_button() {
//	        Kfhc.clickSubmitbtn();
//	    }
	 @Then("User should be able to see the message Thank you for your registration")
	  public void user_should_be_able_to_see_the_message_thank_you_for_your_registration() {
		  Kfhc.txtMessageThankYouRegistration();
	  }

    
}
