package com.kfh.bdd.mobile.screens;

import com.kfh.bdd.ccl.MobileActions;
import com.kfh.bdd.integrations.common_utils.MobileUtil;

public class Curebay_Mobile_Screens {

	MobileActions actions = new MobileActions();

	// Practice Login Scenario
	public void User_click_on_login_or_signup_button() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobile_CB_Login", "Curebay_Login"),
				"Login/SignUp");

	}

	public void User_should_be_able_to_see_login_page() {
		String CB_Login = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobile_CB_Login", "Curebay_Login_Page"));
		actions.verifyText(CB_Login, "Login");
	}

	public void User_enter_Email_or_mobile_number() {
		actions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Mobile_CB_Login", "Curebay_Email_Or_Mobile_Number"),
				"child@gmail.com", "Email");
	}

	public void User_enter_password() {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobile_CB_Login", "Curebay_Enter_Password"),
				"Newuser@1234", "Password");
	}

	public void User_click_on_next_button() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobile_CB_Login", "Curebay_Next_Button"),
				"Next");
	}

	public void User_should_be_able_to_see_select_member_page() {
		String CB_Sel_Mem = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Mobile_CB_Login", "Curebay_Select_Member_Page"));
		actions.verifyText(CB_Sel_Mem, "Select a member to see their");
	}

	public void user_taps_on_forgot_password_link() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobile_CB_Login", "Curebay_Forgot_Password"),
				"Forgot Password Link");
	}

	public void user_enters_invalid_email_id() {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobile_CB_Login", "Curebay_Email_Address"),
				"ABCD1234@gmail.com", "Invalid Email Address");
	}

	public void user_should_able_to_see_enter_valid_email_error_message() {
		String email_Error = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobile_CB_Login", "Curebay_Alert"));
		actions.verifyText(email_Error, "This email is not registered with us. Please enter a valid email.");
	}

	public void user_enters_valid_email_id() {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobile_CB_Login", "Curebay_Email_Address"),
				"child@gmail.com", "Email Address");
	}

	public void user_should_able_to_see_the_Screen(String value) {
		switch (value) {
		case "Forgot Password":
			String forgot_Password = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("Mobile_CB_Login", "Curebay_Forgot_Password_Page"));
			actions.verifyText(forgot_Password, value);
			break;
		}
	}
	public void user_should_able_to_see_Enter_Your_Otp() {
		String enter_OTP = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobile_CB_Login", "Curebay_Enter_Otp"));
		actions.verifyText(enter_OTP, "Enter your OTP");
	}
	public void user_should_able_to_see_resend_otp_link() {
		String resend_OTP = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobile_CB_Login", "Curebay_Resend_OTP"));
		actions.verifyText(resend_OTP, "Resend OTP");
	}
	public void user_enters_valid_otp() {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_1"), "1");
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_2"), "1");
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_3"), "1");
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_4"), "1");
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_5"), "1");
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_6"), "1");
	}
public void user_should_able_to_see_resend_otp_timer() {
		
	}
public void user_should_able_to_see_Update_Forgot_password() {
	
}
}
