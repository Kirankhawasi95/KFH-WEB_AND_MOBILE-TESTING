package com.kfh.bdd.mobile.step_definitions;

import com.kfh.bdd.mobile.screens.Profile3Screens;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Profile3Steps {
	Profile3Screens profile=new Profile3Screens();
	
	@When("user taps on change password")
	public void user_taps_on_change_password() {
	 profile.changePswd();
	}

	@Then("user should able to see the change password screen")
	public void user_should_able_to_see_the_change_password_screen() {
	  profile.checkchangePswdpage();
	}

	@When("^user enters (.*) in the old password box$")
	public void user_enters_the_in_the_old_password_box(String oldpassword) {
	   profile.enterOldpswd(oldpassword);
	}

	@When("^user enters (.*)in the text box$")
	public void user_enters_the_in_the_text_box(String new_password_1) {
	  profile.enterNewpswd(new_password_1);
	}

	@Then("user should able to see all password criteria checkboxes checked")
	public void user_should_able_to_see_all_password_criteria_checkboxes_checked() {
	   
	}


	@When("user taps on the save button")
	public void user_taps_on_the_save_button() {
	  profile.clickSave();
	}

	@Then("user should able to error message")
	public void user_should_able_to_error_message() {
	   profile.getERRmsg();
	}
    @Then ("user should able to a popup with a message as the password changed successfully")
    public void user_should_able_to_a_popup_with_a_message_as_the_password_changed_successfully()
    {
    	
    }

   @When("^user enters (.*) in confirm new password box$")
	public void user_enters_in_confirm_new_password_box(String newpassword_2) {
	  profile.confirmNewpswd(newpassword_2);
	}



}
