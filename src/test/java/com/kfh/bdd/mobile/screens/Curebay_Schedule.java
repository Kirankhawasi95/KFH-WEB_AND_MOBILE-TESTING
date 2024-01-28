package com.kfh.bdd.mobile.screens;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.kfh.bdd.ccl.MobileActions;
import com.kfh.bdd.integrations.common_utils.MobileUtil;

public class Curebay_Schedule {

	MobileActions mobileActions = new MobileActions();

	public void login_Username() {
		mobileActions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "Curebay_Login_username"),
				"child@gmail.com", "username");
	}

	public void login_Password() {
		mobileActions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "Curebay_Login_password"),
				"Child@1234", "password");
	}

	public void clicks_login_btn() {
		mobileActions.Clickoperation(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "Curebay_Login_next"),
				"next button");
	}

	public void clicks_login_signup() {

		try {

			mobileActions.Click(
					MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "login_signup"),

					"Login and signup");

		} catch (Exception e) {

			System.out.println("");

		}
	}

	public void dashboard_Curebay() {
		String homePage = mobileActions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "Curebay_verify_Dashboard"),
				"next button");
		mobileActions.verifyText(homePage, "Dashboard");
	}

	public void click_Schedule() {
		mobileActions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "Curebay_schedulemodule"),
				"Schedule");
	}

//Doctor Consultation
	public void doctor_Consultation() {
		mobileActions.Clickoperation(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
				"Schedule_Doctor_Consultation"), "Doctor Consultation");
	}

	public void nursing_Module() {
		mobileActions.Clickoperation(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "Schedule_Nursing"),
				"Nursing");
	}

	public void verify_Text(String string) {

		switch (string) {
		case "Doctor Consultation":
			String txt_Drconsultation = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"Curebay_ScheduleModule", "Schedule_Doctor_Consultation_Txt"), "Doctor Consultation");

			mobileActions.verifyText(txt_Drconsultation, string);
			mobileActions.Clickoperation(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
					"Schedule_Doctor_Consultation"), "Doctor Consultation");

			break;
		case "Nursing":

			String txt_Nursing = mobileActions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "Schedule_Nursingtxt"),
					"Nursing heading");

			mobileActions.verifyText(txt_Nursing, string);
			mobileActions.Clickoperation(
					MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "Schedule_Nursing"),
					"Nursing");

			break;
		case "Lab Test- Track Results":
			String labTxt = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"Curebay_ScheduleModule", "Schedule_LabTest_trackerresult_Txt"));
			mobileActions.verifyText(labTxt, string);
			mobileActions.isElementPresent(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
					"Schedule_Labtest_TrackerResults"));

			break;

		case "Schedule for a year":
			System.out.println("Schedule for a year");
			String scheduleTxt = mobileActions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "Schedule_Scheduleforyeartxt"));
			mobileActions.verifyText(scheduleTxt, string);
			mobileActions.isElementPresent(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
					"Schedule_Scheduleforyear"));

			break;
		}
	}

	public void doctor_Name() {
		mobileActions.isElementPresent(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "Schedule_Doctor_Name"));
	}

	public void doctor_Consultation_time() {
		mobileActions.isElementPresent(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
				"Schedule_Doctor_Availabilitytime"));
	}

	public void doctor_frequency() {
		mobileActions.isElementPresent(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "Schedule_Doctor_frequency"));
	}

	public void doctor_status() {
		mobileActions.isElementPresent(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "Schedule_Doctor_status"));
	}

	public void doctor_qualification() {
		mobileActions.isElementPresent(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
				"Schedule_Doctor_qualification"));
	}

	public void doctor_consultation_closed() {
		boolean dropDown = mobileActions.isElementPresent(MobileUtil
				.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "Schedule_Doctor_consultation_closed"));
		System.out.println(dropDown);

	}

	// Nursing

	public void nursing_module_date() {
		mobileActions.isElementPresent(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
				"Schedule_Doctor_nursing_date"));
	}

	public void nursing_module_frequency() {
		mobileActions.isElementPresent(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
				"Schedule_Doctor_nursing_frequency"));
	}

	public void nursing_module_status() {
		mobileActions.isElementPresent(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
				"Schedule_Doctor_nursing_status"));
	}

	// Lab Track Results

	public void labtrack_Results() {
		mobileActions.isElementPresent(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
				"Schedule_Labtest_TrackerResults"));
	}

	public void labtrack_Results_testname() {
		boolean testname = mobileActions.isElementPresent(MobileUtil.returnByBasedOnPageNameAndObjectName(
				"Curebay_ScheduleModule", "Schedule_Labtest_TrackerResults_testname"));
		System.out.println(testname);
	}

	public void labtrack_Results_date() {
		mobileActions.isElementPresent(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
				"Schedule_Labtest_TrackerResults_date"));
	}

	public void labtrack_Results_labname() {
		mobileActions.isElementPresent(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
				"Schedule_Labtest_TrackerResults_Labname"));
	}

	public void labtrack_Results_orderid() {
		mobileActions.isElementPresent(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
				"Schedule_Labtest_TrackerResults_orderID"));
	}

	public void labtrack_Results_viewlabreport() {
		mobileActions.isElementPresent(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
				"Schedule_Labtest_TrackerResults_viewLabReport"));
	}

	public void labtrack_Results_download() {
		mobileActions.isElementPresent(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
				"Schedule_Labtest_TrackerResults_download"));
	}

	// schedule for a year
	public void schedule_for_year() {
		mobileActions.isElementPresent(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "Schedule_Scheduleforyear"));
	}

	public void schedule_for_month() {
		mobileActions.isElementPresent(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "Schedule_Listofmonth"));
	}

	public void schedule_for_serviceperiod() {
		mobileActions.isElementPresent(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule",
				"Schedule_July_Serviceperiod"));
	}

	// Profile Screens

	public void verify_profile_text(String string) {
		String textProfile = mobileActions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_myprofile"));
		mobileActions.verifyText(textProfile, string);
	}

	public void verify_manage_profile_text() {
		String textseeProfile = mobileActions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_seeprofile"));
		mobileActions.verifyText(textseeProfile, "See Profiles");
	}

	public void user_clicks_addmember() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_addmemprofile"),
				"Verify manage profile text");
	}

	public void verify_profile_medical_services() {
		String textProfile = mobileActions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_addmemprofileaftertxt"));
		mobileActions.verifyText(textProfile, "services near to your parents area.");
	}

	public void user_clicks_addmember_details() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_addmemdetails"),
				"Verify manage profile text");
	}

	public void user_enters_pincode(String pincode) {
		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_profilepincode"),
				pincode);
	}

	public void user_clicks_check_button() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodecheck"),
				"Verify manage profile text");
	}

	public void verify_pincode_error_message() {
		try {
			String textProfile = mobileActions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodeplease6digit"));
			mobileActions.verifyText(textProfile, "Please enter 6 digit pincode");
		} catch (Exception e) {
			System.out.println("message is not displayed");
		}
	}

	public void user_enters_pincode() {
		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_profilepincode"),
				"518500");
	}

// from address 
	public void address_Text() {
		try {
			mobileActions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodaddress"));
			mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodaddress"),
					"11/12, KAF Nagar");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void enter_Locality() {
		try {
			mobileActions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodlocality"));
			mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodlocality"),
					"Lakshmi Colony");
		} catch (InterruptedException e) {
			
		}

	
	}

	public void valid_Pincode() {
		try {
			mobileActions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodemempincode"));
			mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodemempincode"),
					"625009");//600030
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void enter_City() {
		try {
			mobileActions.swipeUp_FindElement(2,MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodecity"));
			mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodecity"),
					"Chennai");
		} catch (Exception e) {
			mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodecity"),
					"Chennai");
		}
		
		
	}

	public void enter_State() {
		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodestate"),
				"TamilNadu");
	}

	public void verify_nearby_clinic_text() {
		String textNearbyclinic = mobileActions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay", "Curebay_pincodenearbyeclinic"));
		mobileActions.verifyText(textNearbyclinic, "Nearby e-clinics");
	}

	public void save_Memeber() {
		try {
			mobileActions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodesubmit"));
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodesubmit"),
					"Save member");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void verify_memberadded_Text() {
		System.out.println("Member is saved to the profile");
	}

	public void salutation(String Salutation) {
		try {
			
		
		Thread.sleep(3000);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodesalutation"),

				"Curebay_pincodesalutation");

		switch (Salutation) {

		case "Mr":
			Thread.sleep(3000);
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodesalutation"),

					"Curebay_pincodesalutation");

			break;

		case "Mrs":
			Thread.sleep(3000);
			mobileActions.Click(
					MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodesalutationMrs"),

					"Curebay_pincodesalutationMrs");

			break;

		default:

			System.out.println("not clicked");

		}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void select_Lastname(String Lname) {

		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodelastname"),

				Lname);

//		mobileActions.swipeUp(2);


	}

	public void select_Mobilenumber(String Mobilenumber) {

		mobileActions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodemobilenumber"),

				Mobilenumber);

	}

	public void select_Emergencynumber(String Emergencynumber) {

		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodeemergency"),

				Emergencynumber);

	}

	public void select_Emailid(String Emailid) {

		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodemail"),

				Emailid);
		mobileActions.swipeUp(1);

	}

	public void select_Bloodgroup(String Bloodgroup) throws InterruptedException {
		try {
		switch (Bloodgroup) {
		case "o-":
			Thread.sleep(1000);
			mobileActions.Click(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Blood_Group_dropdown"),

					"Blood Group DropDown");
			Thread.sleep(3000);

			mobileActions.sendKeys(
					MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodebloodoneg"),

					"Bloodgroup");
			break;
		default:
			try {
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Select_relation_cancel"),"Cancel");
			} catch (Exception e) {
				
			}

		}
		} catch (Exception e) {
			
		}
	}

	public void select_Relation(String Relation) throws InterruptedException {
		try {
			
		
		mobileActions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Relation_dropdown"));
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Relation_dropdown"),
				"Relation Dropdown");
		Thread.sleep(3000);

		switch (Relation) {

		case "Mother In law":

			mobileActions.Click(

					MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodemotherinlaw"),

					Relation);

			break;

		case "Father In law":

			mobileActions.Click(

					MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_fatherinlaw"),

					Relation);

			break;

		case "Mother":

			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodemother"),

					Relation);

		case "Father":

			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodefather"),

					Relation);

		case "Other":

			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodeothers"),

					Relation);

		default:
			try {
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Select_relation_cancel"),
					Relation);
			} catch (Exception e) {
				
			}

		}
		} catch (Exception e) {
			try {
				mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Select_relation_cancel"),
						Relation);
				} catch (Exception e1) {
					
				}
		}
		
		

	}
	


	public void select_Firstname(String Fname) {

		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodefirstname"),

				Fname);

	}

}
