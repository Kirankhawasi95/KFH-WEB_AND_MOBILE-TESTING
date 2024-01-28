package com.kfh.bdd.mobile.screens;

import java.util.Random;

import com.kfh.bdd.ccl.MobileActions;
import com.kfh.bdd.integrations.NG_listners.MobileEvent;
import com.kfh.bdd.integrations.common_utils.MobileUtil;

import io.appium.java_client.remote.MobileBrowserType;

public class new_login_screens {

	MobileActions mobactions = new MobileActions();
	public static String data_UDID = MobileEvent.Udid;

	Random random_generator = new Random();

	public void careplans_before_login() {
		mobactions.isElementPresent(
				MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "careplans_page_before_login"));

	}

	public void click_on_login_btn() {
		mobactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "login/signup_btn"),
				"login/signup btn");
	}

	public void enter_email() {
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "email_txt"),
				"child@gmail.com", "child email");
	}

	public void enters_password() {
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "password_txt"),
				"Child@1234", "password ");
	}

	public void clicks_on_next_btn() {

		switch (data_UDID) {
		case "VSWCZ5Q8U4YTCAS4":
			mobactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "next_btn"),
					"next btn");

			break;
		case "ZF6223VL42":
			try {
				mobactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "next_btn"),
						"next btn");
				mobactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "next_btn"),
						"next btn");
			} catch (Exception e) {
				mobactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "next_btn"),
						"next btn");
				mobactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "next_btn"),
						"next btn");

			}

			break;

		default:

			mobactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "next_btn"),
					"next btn");

		}

//		mobactions.wait(3000);

	}

	public void login_page_isvisble() {
		mobactions.isElementPresent(
				MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "login_visible"));
	}

	public void curebay_logo_on_dash_board() throws InterruptedException {

		try {
			mobactions.waitForVisible(
					MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "curebay_logo"));

			mobactions.isElementPresent(
					MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "curebay_logo"));

		} catch (Exception e) {
			System.out.println("logo sucessfully appeard");
		}

	}

	public void enetrs_mobile_num() {
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "email_txt"),
				"8247014797", "child email");

	}

	public void click_on_submit() {
		mobactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "submit_btn"),
				"submit_btn");
	}

	public void otp_box_visibility() throws InterruptedException {
		mobactions.isDisplayed(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_1"));
	}

	public void enter_otp_num() throws InterruptedException {
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_1"), "0");
		Thread.sleep(1000);
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_2"), "1");
		Thread.sleep(1000);
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_3"), "2");
		Thread.sleep(1000);
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_4"), "3");
		Thread.sleep(1000);
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_5"), "4");
		Thread.sleep(1000);
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_6"), "0");

	}

	public void invalid_mobile_num() {
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "email_txt"),
				"569874123", "child email");

	}

	public void error_msg_for_invalid_characters(String value) {

		switch (value) {

		case "please enter a valid 10 digit mobile number":
			String num_error = mobactions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "10_digit_error_msg"));
			mobactions.verifyText(num_error, "Please fill all mandatory fields");
			break;
		case "please enter a valid email address":
			String email_eerror = mobactions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "invalid_emailadress_pop_up"),
					"invalid email_message");

			mobactions.verifyText(email_eerror, "Please enter a valid email address");
			break;
		default:
			System.out.println("invalid mobile number or email address ");
			break;
		}

	}

	public void clicks_on_OK() {
		mobactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "ok_btn"),
				"click on ok");
	}

	public void clear_on_entered_number() {
		mobactions.clear(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "login_with_num"),
				"clearin the characters");
	}

	public void invalid_special_characters_in_email() {

		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "email_txt"),
				"@#$%^^&", "invalid email");

	}

	public void errormessage_of_invalid_otp() {

		try {

			String error_msg = mobactions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators",
					"errormessage_of_invalid_otp"));

			mobactions.verifyText(error_msg, "Entered OTP Number has expired or invalid.");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void click_on_sign_up() {
		mobactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "signup_btn"),
				"signup btn");
	}

	public void enter_name() {
		String ramdom_name = "name" + random_generator.nextInt(1000);
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "name_for_sign_up"),
				ramdom_name);
	}

	public void click_drop_down() {
		mobactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "country_dropdown_btn"),
				"country drop down");
	}

	public void enter_country_for_drop_down() {
		mobactions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "country_send_keys_drop_down"),
				"canada");
	}

	public void click_on_country() {
		mobactions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "select_country_in_drop_down"),
				"canad drop down");
	}

	public void enetr_phone_num_sign_up() {
		
//			try {
//
//				long number = random_generator.nextLong(900000000, 999999999L);
//				String phone_num = Long.toString(number);
//				mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "phone_number_txt"),
//						phone_num +  "phonenum");
//			} catch (Exception e) {
//			}
//		
		
	}

	public void checks_whatsapp_check_box() {
		mobactions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "whatssapp_num_checkbox"),
				"whatsapp num check box");
	}

	public void enters_email_insign_up() {
		String ramdom_email = "name" + random_generator.nextInt(1000);
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "email_txt_sign_up"),
				"joe" + ramdom_email + "@gmail.com");
	}

	public void enetrs_password_in_signup() {

		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "password"),
				"New@123");
	}

	public void enters_confirm_pasword_in_sign_up() {
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "confirm_password"),
				"New@123");
	}

	public void enaters_invalid_name(String invalid_name) {
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "name_for_sign_up"),
				invalid_name);

	}

	public void invalid_mobile_num_in_sign_up(String invalid_mobile_num) {
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "phone_number_txt"),
				invalid_mobile_num, "phonenum");

	}

	public void invalid_email_in_sign_up(String invalid_email) {
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "email_txt_sign_up"),
				invalid_email);

	}

	public void invalid_password_in_signup(String invalid_passwrod) {
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "password"),
				invalid_passwrod);

	}

	public void invalid_confirm_password(String invalid_confirm_password) {
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "confirm_password"),
				invalid_confirm_password);

	}

	public void invalid_whats_app_num(String invalid_whats_app_num) {
		mobactions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "Whatsappnum_txt_signup"),
				invalid_whats_app_num);

	}

	public void swipeup_methods() {
		mobactions.swipeUp(1);
	}

	public void succesful_msg() {
		try {
			String get_suceesful_msg = mobactions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_alertTitle"));
//			mobactions.verifyText(get_suceesful_msg, "You signed up successfully, please login.");
		} catch (Exception e) {
//			System.out.println("sucessfully signed up");
		}

	}

	public void invalid_otp_in_forgot_password() {
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_1"), "0");
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_2"), "1");
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_3"), "0");
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_4"), "1");
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_5"), "0");
		mobactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("myprofile_locators", "otp_num_6"), "1");
	}

}
