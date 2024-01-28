package com.kfh.bdd.mobile.step_definitions;

import com.kfh.bdd.mobile.screens.new_login_screens;

import io.cucumber.java.en.*;

public class login_step_def {
	
	new_login_screens login_screens = new new_login_screens();
	

//@When("user taps on curebay application")
//public void user_taps_on_curebay_application() {
//	System.out.println("taps cure bay application");
//    
//}

@Then("user should able to see care plans screens")
public void user_should_able_to_see_care_plans_screens() {
	login_screens.careplans_before_login();
    
}

//@When("user taps Login SignUp button")
//public void user_taps_login_sign_up_button() {
// login_screens.click_on_login_btn();
//}

//@Then("user should able to see login screen")
//public void user_should_able_to_see_login_screen() {
//    login_screens.login_page_isvisble();
//}

@When("user enters valid email id in email\\/mobile number text box")
public void user_enters_valid_email_id_in_email_mobile_number_text_box() {
   login_screens.enter_email();
}



@When("user enters valid password in password text box")
public void user_enters_valid_password_in_password_text_box() {
    login_screens.enters_password();
}

//@When("user taps on next button")
//public void user_taps_on_next_button() {
//    login_screens.clicks_on_next_btn();
//}

@Then("user should able to see dashboard screens")
public void user_should_able_to_see_dashboard_screens() throws InterruptedException {
   login_screens.curebay_logo_on_dash_board();
}


@When("user enters valid mobile number in email\\/mobile number text box")
public void user_enters_valid_mobile_number_in_email_mobile_number_text_box() {
	login_screens.enetrs_mobile_num();
    
}

@Then("user should able to see password text box is not visible")
public void user_should_able_to_see_password_text_box_is_not_visible() {
   System.out.println("password text is not visisble");
}

@When("user taps on submit button")
public void user_taps_on_submit_button() throws InterruptedException {
	try {
		Thread.sleep(2000);
		login_screens.click_on_submit();
	} catch (Exception e) {
		
	}
	
}

@Then("user should able to see otp text boxes")
public void user_should_able_to_see_otp_text_boxes() throws InterruptedException {
   login_screens.otp_box_visibility();
}

@When("user enter valid otp")
public void user_enter_valid_otp() throws InterruptedException {
	
try {
		Thread.sleep(50000);
} catch (Exception e) {
		// TODO: handle exception
	}
   
}



@When("user enters invalid integer characters in email\\/mobile number text box")
public void user_enters_invalid_integer_characters_in_email_mobile_number_text_box() {
    login_screens.invalid_mobile_num();
}

@Then("user should see a dialog box with error message {string}")
public void user_should_see_a_dialog_box_with_error_message(String string) {
   login_screens.error_msg_for_invalid_characters(string);
}

@When("user taps on ok")
public void user_taps_on_ok() {
   login_screens.clicks_on_OK();
}

@When("user clears the entered characters")
public void user_clears_the_entered_characters() {
    login_screens.clear_on_entered_number();
}

@When("user enters invalid special characters in email\\/mobile number text box")
public void user_enters_invalid_special_characters_in_email_mobile_number_text_box() {
    login_screens.invalid_special_characters_in_email();
}

@When("user taps on next")
public void user_taps_on_next() {
  login_screens.clicks_on_next_btn();
}

@Then("user should able to see a dialog box with error message {string}")
public void user_should_able_to_see_a_dialog_box_with_error_message(String string) {
    login_screens.error_msg_for_invalid_characters(string);
}




@When("user enters invalid valid otp")
public void user_enters_invalid_valid_otp() throws InterruptedException {
	
    login_screens.enter_otp_num();
}

@Then("user should able to see a error message")
public void user_should_able_to_see_a_error_message() {
	
	login_screens.errormessage_of_invalid_otp();
}



@When("user taps on Sign Up Screen")
public void user_taps_on_sign_up_Screen() {
  login_screens.click_on_sign_up();
}

@Then("user should able to see Sign Up Screens")
public void user_should_able_to_see_sign_up_screens() {
}

@When("user enters valid name text in name text boxs")
public void user_enters_valid_name_text_in_name_text_boxs() {
    login_screens.enter_name();
}

@When("user taps on country code drop down")
public void user_taps_on_country_code_drop_down() {
    login_screens.click_drop_down();
}

@When("user taps on canada code")
public void user_taps_on_canada_code() {
   login_screens.enter_country_for_drop_down();
   login_screens.click_on_country();
}

@When("user enters valid number in mobile number text field")
public void user_enters_valid_number_in_mobile_number_text_field() {
    login_screens.enetr_phone_num_sign_up();
}

@When("user enters valid email id in email text field")
public void user_enters_valid_email_id_in_email_text_field() {
    login_screens.enters_email_insign_up();
}

@When("user taps on Same as Mobile Number check box")
public void user_taps_on_same_as_mobile_number_check_box() {
  login_screens.checks_whatsapp_check_box();
}

@When("user enters valid password in password field")
public void user_enters_valid_password_in_password_field() {
	login_screens.enetrs_password_in_signup();
	login_screens.swipeup_methods();
    }

@When("user enters same valid password in Confirm Password field")
public void user_enters_same_valid_password_in_confirm_password_box() {
   login_screens.enters_confirm_pasword_in_sign_up();
   login_screens.swipeup_methods();
}

@Then("user should able to see a success message as\"Signed up successfully\"")
public void user_should_able_to_see_a_success_message_as_signed_up_successfully() {
	login_screens.succesful_msg();
	login_screens.clicks_on_OK();
    
}


@When("^user enters (.*) in name text box$")
public void user_enters_in_name_text_box(String invalid_name) {
    login_screens.enaters_invalid_name(invalid_name);
}

@When("^user enters (.*) in mobile number text box$")
public void user_enters_in_mobile_number_text_box(String  invalid_mobile_num) {
   login_screens.invalid_mobile_num_in_sign_up(invalid_mobile_num);
}

@When("^user enters (.*) in email text box$")
public void user_enters_abcd_gmail_com_in_email_text_box(String invalid_email) {
    login_screens.invalid_email_in_sign_up(invalid_email);
}

@When("^user enters (.*) in WhatsApp Number$")
public void user_enters_in_whats_app_number(String invalid_whats_app_num) {
    login_screens.invalid_whats_app_num(invalid_whats_app_num);
}

@When("^user enters (.*) in password box$")
public void user_enters_new_user2a_in_password_box(String invalid_passswrod) {
    login_screens.invalid_password_in_signup(invalid_passswrod);
    
    login_screens.swipeup_methods();
}

@When("^user enters (.*) in Confirm Password box$")
public void user_enters_new_user2a_in_confirm_password_box(String invalid_confirm_Passwrod) {
   login_screens.invalid_confirm_password(invalid_confirm_Passwrod);
   
   
}

@Then("user should able to see error message of invalid")
public void user_should_able_to_see_error_message_of_invalid() {
   
}
@When("user enters invalid otp")
public void user_enters_invalid_otp() {
	login_screens.invalid_otp_in_forgot_password();
   
}

@Then("user should able to see error message foe invalid otp")
public void user_should_able_to_see_error_message_foe_invalid_otp() {
    
}











}
