package com.kfh.bdd.mobile.screens;

import java.io.IOException;

import org.openqa.selenium.Keys;

import com.kfh.bdd.ccl.MobileActions;
import com.kfh.bdd.integrations.NG_listners.MobileEvent;
import com.kfh.bdd.integrations.common_utils.MobileUtil;
import com.kfh.bdd.integrations.report_utils.ReportManager;

public class Curebay_mydashboard_screens {
	MobileActions mobileActions=new MobileActions();
	public static String data_UDID = MobileEvent.Udid;

	//Dashboard-Payment options
	public void select_Payment()
	{
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_payment_option"),
				"payment option");
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_payment_optionasonetime"),
				"payment option as one time");
	}
	public void verifyyourOrderscreen()
	{
		String textYourorder = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_your_orderpage"));
		mobileActions.verifyText(textYourorder, "SAC Code: 998311");
	}
	public void errorMessage()
	{
		mobileActions.getToastMessage();
	}
	public void biliingfor_Fname(String firstName)
	{
		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_First_Name"),
				firstName, "enter first name");
	}
	public void biliingfor_Lname(String lastName)
	{
		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Last_Name"),
				lastName, "enter last name");
	}
	public void biliingfor_addline1(String AddressLine1)
	{
		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Address_Line1"),
				AddressLine1, "enter AddressLine1 ");
	}
	public void biliingfor_addLine2(String AddressLine2)
	{
		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Address_Line2"),
				AddressLine2, "enter AddressLine2");
	}

	public void biliingfor_city(String City)
	{
		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_City"),
				City, "enter city");
	}
	public void biliingfor_zip(String zip)
	{
		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Zip"),
				zip, "enter zip");
	}
	public void biliingfor_state(String state)
	{
		try {
			mobileActions.waitForVisible(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_State"));
			mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_State"),
					state, "enter state");
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void clicks_login_signup() {
		try {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Login_signup"),
				"Login and signup");
		}catch (Exception e) {
			System.out.println("");
		}
	}

	public void enter_email() {

		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Login_username"),
				"child@gmail.com", "child email");

	}

	public void enters_password() {

		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Login_password"),
				"Newuser@1234", "password ");

	}

	public void clicks_on_next_btn() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Login_next"),
				"next btn");

	}
	public void verifyhomepage() {
		String text = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_verify_Dashboard"));
		mobileActions.verifyText(text, "Dashboard");
	}
	public void clicks_appointment() throws InterruptedException {
		Thread.sleep(1000);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Appointments"),
				"appointment");

	}
	public void clicks_fpatientdropdown() throws InterruptedException {
		Thread.sleep(1000);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_fpatientdropdown"),
				"Dropdown");

	}
	public void selects_motherpatient() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_motherpatientname"),
				"mother madam");

	}
	public void clicks_upcoming() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_upcomingAppointments"),
				"upcoming appointment");

	}
	public void clicks_previous() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_previousAppointments"),
				"previous appointment");

	}
	public void clicks_requesttochange() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Requesttochange"),
				"Request to change appointment");

	}
	public void clicks_selectdate() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_selectdate"),
				"select date");

	}
	public void selects_date() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_date18"),
				"select date 18");

	}
	public void clicks_selectok() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_selectok"),
				"select ok");

	}
	public void clicks_selectsubmit() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_selectsubmit"),
				"select submit");

	}
	public void clicks_errorok() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_errorok"),
				"ok");

	}
	public void verifytxtonAppointmentpage() {
		String text = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_verifyvideoconsultation"));
		mobileActions.verifyText(text, "Video Consultation");
	}
	public void verifyerroronselectpage() {
		String text = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_error"));
		mobileActions.verifyText(text, "Contact Administrator");
	}
	public void clicks_navigatesback() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_navigatesback"),
				"Navigates back");

	}
	public void clicks_fathersir() throws InterruptedException {
		Thread.sleep(1000);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_fpatientdropdown"),
				"father sir");

	}
	public void clicks_childsir() throws InterruptedException {
		Thread.sleep(3000);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_fpatientdropdown"),
				"child sir");

	}
	public void clicks_careplangeneral() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Generalhealth"),
				"care plan");

	}
	public void clicks_careplanortho() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_oralhealth"),
				"orthocare plan");

	}
	public void clicks_sister() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_sister"),
				"sister madam");

	}
	public void clicks_tiger() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_tiger"),
				"Tiger");

	}
	public void clicks_fatherinlaw() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_fatherinlaw"),
				"Fatherinlaw");

	}
	public void clicks_patients(String patient) throws Throwable {
		switch(patient) {
		case "motherinlaw":
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_fpatientdropdown"),
					"Dropdown");
			Thread.sleep(3000);
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_motherinlaw"),
					"motherinlaw");
			break;
		case "Hsbjbg":
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_fpatientdropdown"),
					"Dropdown");
			Thread.sleep(3000);
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Hsbjbg"),
					"Hsbjbg");
			break;
		case "othermadam":
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_fpatientdropdown"),
					"Dropdown");
			Thread.sleep(3000);
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_othermadam"),
					"othermadam");
			break;
		case "motherinlawkumar":
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_fpatientdropdown"),
					"Dropdown");
			Thread.sleep(3000);
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_motherinlawkumar"),
					"motherinlawkumar");
			break;
		case "sisterinsomi":
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_fpatientdropdown"),
					"Dropdown");
			Thread.sleep(3000);
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_sisterinsomi"),
					"sisterinsomi");
			break;
		case "sissir":
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_fpatientdropdown"),
					"Dropdown");
			Thread.sleep(3000);
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_sissir"),
					"sissir");
			break;
		case "Test123":
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_fpatientdropdown"),
					"Dropdown");
			Thread.sleep(3000);
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Test123"),
					"Test123");
			break;
		case "childself":
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_fpatientdropdown"),
					"Dropdown");
			Thread.sleep(3000);
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_childself"),
					"childself");
			break;
		}
		
		
	}
	
	
	public void clicks_calenderondashboard() {

		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_calender"),
				"calender");

	}
	public void clicks_calenderdateandok() throws Throwable {
try {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_calenderdare11"),
				"calender date 11");
		Thread.sleep(3000);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_selectok"),
				"select ok");
		Thread.sleep(3000);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_selectok"),
				"select ok");
}catch(Exception e) {
	System.out.println("error is catched ");
}

	}
	
	public void temperaturedropdown(String Dropdown) throws Throwable {
		switch(Dropdown) {
		case "Temperature":
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_temperature"),
					"temperature");
			Thread.sleep(3000);
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_temperature"),
					"temperature");
			break;
		case "Heart_Rate":
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_temperature"),
					"temperature");
			Thread.sleep(3000);
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_heartrate"),
					"Heart_Rate");
			break;
		case "spo2":
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_temperature"),
					"temperature");
			Thread.sleep(3000);
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Spo2"),
					"spo2");
			break;
			
		
		}
	}
	
	public void Avg_verify(String values) {
		switch(values) {
		case "99.60":
			String text = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_verify_Avg"));
			mobileActions.verifyText(text, "99.60");
			break;
		case "82.80":
			String text1 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_verify_Avg1"));
			mobileActions.verifyText(text1, "82.80");
			break;
		case "92.60":
			String text2 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_verify_Avg2"));
			mobileActions.verifyText(text2, "92.60");
			break;
			
		}
	}
	
	public void clicks_viewall_vitalrpts() throws Throwable {
		mobileActions.swipeUp_FindElement(1, MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_viewalldashbd"));
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_viewalldashbd"),
				"view All vital reports");
	}
	
	public void scrollsdownpage() throws InterruptedException {
		mobileActions.swipeUp_FindElement(4, MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_BMI"));
		
	}
	
	public void verify_bmi() {
		String text = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_BMI"));
		mobileActions.verifyText(text, "BMI");
	}
	public void verify_careplan() {
		try {
		String text = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_careplantxt"));
		mobileActions.verifyText(text, "Select Care Plans :");
		}catch(Exception e) {
			System.out.println("Select Care Plans :");
		}
	}
	public void verify_myappointment(String string) {
		String text = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_myappointmenttxt"));
		mobileActions.verifyText(text, string);
	}
	public void verify_dashboardmsg(String string) {
		String text = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_dashboardtxtmsg"));
		String text1 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_dashboardtxtmsg1"));
		mobileActions.verifyText(text+" "+text1, string);
	}
	
	public void temperature() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_temperature"),
				"temperature");
	}
	public void heartrate() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_heartrate"),
				"Heart_Rate");
	}
	public void sapo2() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Spo2"),
				"spo2");
	}
	
	public void verify_temp() {
		try {
		String text = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_verify_Avg"));
		mobileActions.verifyText(text, "99.60");
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	public void verify_heart() {
		try {
		String text1 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_verify_Avg1"));
		mobileActions.verifyText(text1, "82.80");
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	public void verify_spo2() {
		try {
		String text2 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_verify_Avg2"));
		mobileActions.verifyText(text2, "92.60");
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	public void verify_prescription(String string) {
		try {
		String text2 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_prescriptiontxt1"));
		mobileActions.verifyText(text2, string);
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	public void verify_symptoms() {
		try {
		String text2 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_symptoms"));
		mobileActions.verifyText(text2, "Symptoms");
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	public void verify_allery() {
		try {
		String text2 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_allery"));
		mobileActions.verifyText(text2, "Any Allergy");
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	public void verify_nxtconsult() {
		try {
		String text2 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_nxtconsult"));
		mobileActions.verifyText(text2, "Next Consultation Date");
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	
	public void viewlinkhealth() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_nxtconsultviewlink"),
				"view link");
	}
	
	public void download() throws Throwable {
		try {
		mobileActions.swipeUp_FindElement(4, MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Downloadlink"));
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Downloadlink"),
				"download");
		}catch(Exception e) {
			System.out.println("not downloaded");
		}
	}
	public void labreport() {
//		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Labreport"),
//				"lab reports");
		
		try {
            mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Labreport"),
                    "lab reports");
        }catch(Exception e) {
            System.out.println("error");
            try {
                ReportManager.logMobileScreenshot();
            } catch (IOException e1) {
            }
        }
	}
	
	
	public void verify_testname() throws Throwable {
		try {
		String text2 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_testname"));
		mobileActions.verifyText(text2, "Test Name");
		}catch(Exception e) {
			System.out.println("error");
			ReportManager.logMobileScreenshot();
		}
	}
	public void verify_labname() {
		try {
		String text2 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_labname"));
		mobileActions.verifyText(text2, "Lab Name");
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	public void verify_orderid() {
		try {
		String text2 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_orderid"));
		mobileActions.verifyText(text2, "Order Id");
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	public void viewlabreport() {
//		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_viewalllab"),
//				"view lab reports");
		try {
            mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_viewalllab"),
                    "view lab reports");
        } catch (Exception e) {
            System.out.println("error");
            try {
                ReportManager.logMobileScreenshot();
            } catch (IOException e1) {
            }
        }
		
	}
	
	public void viewlabreportdownload() {
//		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_labdownload"),
//				"view lab reports downloaded");
//		
		try {
            mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_labdownload"),
                    "view lab reports downloaded");
        } catch (Exception e) {
            System.out.println("error");
            try {
                ReportManager.logMobileScreenshot();
            } catch (IOException e1) {
            }
        }
	}
	public void Healthrecord() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Healthrecord"),
				"Curebay_Healthrecord");
	}
	
	public void verify_labreports(String string) {
		try {
		String text2 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Labreport"));
		mobileActions.verifyText(text2, string);
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	
	public void swipesupdoctor() throws Throwable {
		mobileActions.swipeUp_FindElement(4, MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_doctorconsult1"));
	}
	
	public void clicks_doctor() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_doctorconsult1"),
				"Curebay_doctorconsult1");
	}
	public void clicks_past() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_doctorpast"),
				"Curebay_doctorpast");
	}
	
	public void verify_viewall() {
		String textapp = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_doctorviewall"));
		mobileActions.verifyText(textapp, "View All");
	}
	public void clicks_viewalldoct() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_doctorviewall"),
				"Curebay_doctorviewall");
	}
	public void clicks_noti() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_notifications"),
				"Curebay_notifications");
	}
	public void clicks_notiback() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_notificationsback"),
				"Curebay_notificationsback");
	}
	public void swipesupmedical() throws Throwable {
		mobileActions.swipeUp_FindElement(4, MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_medicalplandash"));
	}
	public void user_swipes_the_screen_to_My_Medical_Plans() {
		try {
			mobileActions.swipeUp_FindElementGetText(4, MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay",
					"Curebay_medicalplandash"));
		} catch (InterruptedException e) {
		}
	}
	public void clicks_swipesupmedical() {
//		mobileActions.swipeUp(3);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_medicalplandash"),
				"Curebay_medicalplandash");
//		mobileActions.swipeUp(4);
	}
	public void user_should_able_to_see_General_Health_Care() {
		try {
			mobileActions.swipeUp_FindElementGetText(4, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Text_General_Health_Care"));
		} catch (InterruptedException e) {
		}
	}
	public void user_should_able_to_see_validity_of_plan_for_General_Health_Care() {
		try {
			mobileActions.swipeUp_FindElementGetText(4, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_GeneralHealthCareValidityDays"));
		} catch (InterruptedException e) {
		}
	}
	public void user_taps_on_view_details_related_for_General_Health_Care() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_GeneralHealthCareViewDetails"),
				"View Details");
	}
	public void clicks_sign() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_signup"),
				"Curebay_signup");
	}
	public void verify_doctorname() {
		mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_doctorname"));
		
	}
	public void verify_doctorconsult() {
		mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_doctorconsulttype"));
		
	}
	public void verify_datesee() {
		try{
		String textapp = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_datesee"));
		mobileActions.verifyText(textapp, "20/07/2023");
		}catch(Exception e) {
			mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_doctordate"));
		}
	}
	public void clicks_cart() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cart"),
				"Curebay_cart");
	}
	public void verify_cartmem() {
		String textapp = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_carttxt"));
		mobileActions.verifyText(textapp, "Choose health care plan for your family member");
	}
	public void verify_cartplan(String value) throws Throwable {
		switch(value) {
		case "General Health Care" :
			String textapp = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartgenaral"));
			mobileActions.verifyText(textapp, "General Health Care");
			break;
		case "Diabetes Care" :
			String textapp1 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartdiabetes"));
			mobileActions.verifyText(textapp1, "Diabetes Care");
			break;
		case "Cardic Care" :
			mobileActions.swipeUp(3);
			String textapp2 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartcardiac"));
			mobileActions.verifyText(textapp2, "Cardiac Care");
			mobileActions.swipeUp(2);
			break;
		case "Ortho Care" :
			mobileActions.swipeUp(4);
			String textapp3 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartortho"));
			mobileActions.verifyText(textapp3, "Ortho Care");
			break;
		case "Womens Health Care" :
			
			String textapp4 = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartgenaralwomen"));
			mobileActions.verifyText(textapp4, "Womens Health Care");
			break;
			default:
				System.out.println("error");
		}
		
	}
	
	public void clicks_cartplan() throws InterruptedException {
		Thread.sleep(3000);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartradio"),
				"Curebay_cartradio");
	}
	public void clicks_cartnxt() throws InterruptedException {
		Thread.sleep(3000);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartnxt"),
				"Curebay_Login_next1");
	}
	public void clicks_cartnxt1() throws InterruptedException {
		Thread.sleep(3000);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_Login_next1"),
				"Curebay_Login_next1");
	}
	
	
	public void verify_cartyour() {
		
	        try {

	        String textapp = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartyourtxt"));

	        mobileActions.verifyText(textapp, "YourCart");
	        
//	        mobileActions.swipeUp(2);

	        }

	        catch(Exception e) {

	            System.out.println("your order");

	        }
	        
	}
	public void verify_cartpricepermnt() {
		String textapp = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartpricepermnt"));
		mobileActions.verifyText(textapp, "Price: $69 / Per Month");
	}
	public void verify_cartefft() {
		String textapp = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_carteffectivedate"));
		mobileActions.verifyText(textapp, "09/08/2023");
	}
	
	public void clicks_cartmonth(String option) throws InterruptedException {
		switch(option) {
		case "Monthly" :
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartselectmnt"),
				option);
		Thread.sleep(3000);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartselectmntdp"),
				option);
		break;
		case "One Time" :
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartselectmnt"),
					option);
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartselectonetimedp"),
					option);
			break;
		}
	}
	
	public void verify_cartpayment() {
		String textapp = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartpaymentdetails"));
		mobileActions.verifyText(textapp, "Payment Details");
	}
	public void verify_cartselectedplan() {
		String textapp = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartpaymentplan"));
		mobileActions.verifyText(textapp, "Womens Health Care:");
	}
	public void verify_cartselectedprice() {
		try {
		String textapp = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartpaymentplanprice"));
		mobileActions.verifyText(textapp, "$ 69");
		}
	catch(Exception e) {
		System.out.println("$ 69");
		}
	}

	public void verify_carttotalprice() throws Throwable {
		
		try {
			mobileActions.swipeUp(1);
 		String textapp = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartpaymenttotalprice"));
		mobileActions.verifyText(textapp, "$ 69");
	}
	catch(Exception e) {
		System.out.println("$ 69");
		}
	}
	
	public void clicks_cartcheckedout() {
		
		
		
		switch (data_UDID) {
		
		case "ZF6223VL42":
			try {
//				mobileActions.swipeUp(2);
				mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartcheckedout"),
						"Curebay_cartcheckedout");
				mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartcheckedout"),
						"Curebay_cartcheckedout");
				mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartcheckedout"),
						"Curebay_cartcheckedout");
				
			} catch (Exception e) {
//				mobileActions.swipeUp(2);
				mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartcheckedout"),
						"Curebay_cartcheckedout");
				mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartcheckedout"),
						"Curebay_cartcheckedout");
			}
			

			break;

		default:
			try {
//			mobileActions.swipeUp(2);
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartcheckedout"),
					"Curebay_cartcheckedout");
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartcheckedout"),
					"Curebay_cartcheckedout");
			} catch (Exception e) {
				mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Attention_OK"),
						"OK");
			}
		}
	}
	
	
	public void clicks_cartprocceed() throws Throwable {
		try {
			mobileActions.waitForElement(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartproceed"), 10);
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartproceed"),
					"Curebay_cartproceed");
		}catch (Exception e) {
			
		}
		
	}
	
	public void enter_fstname() throws InterruptedException {
		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartfirstname"),
				"johnchild", "child ");

	}
	public void enter_lstname() {

		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartlastname"),
				"cham", "child girl");

	}
	public void enter_address1() throws InterruptedException {
		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartaddress1"),
				"dd", " sasikanth");
		mobileActions.pressKeyboardValues(Keys.ARROW_DOWN);
		mobileActions.pressKeyboardValues(Keys.ENTER);
		
		

	}
	public void enter_address2() {

		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartaddress2"),
				"kurnool", " kurnool");

	}
	public void enter_address3() {

		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartaddress3"),
				"AP", "AP");

	}
	public void enter_city() {

		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartcity"),
				"kurnool", "kurnool");

	}
	public void enter_zip() {

		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartzip"),
				"908645", "908645");

	}
	public void enter_state() {

		mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartstate"),
				"ap", "child girl ap");

	}
	
	public void clicks_cartpick() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartpickanopt"),
				"Curebay_cartpickanopt");
	}
	public void clicks_cartcalbania() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_cartalbania"),
				"Curebay_cartalbania");
	}
	
	public void clicks_clabrpts() throws Throwable {
		mobileActions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_dashlabreports"));
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_dashlabreports"),
				"Curebay_dashlabreports");
	}
	

	public void verify_labrepts1() {
		mobileActions.swipeUp(2);
		try {
		String textapp = mobileActions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_dashlabreptestname"));
		mobileActions.verifyText(textapp, "Test Name: lab report");
	}catch(Exception e) {
		System.out.println("displayed");
	}
	
	
	
	}
	public void clicks_dashview() {
		
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_dashlabbiewall"),
				"Curebay_dashlabbiewall");
	}
	public void clicks_dashviewall() {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_dashlabbiewalllink"),
				"Curebay_dashlabbiewalllink");
	}


    public void enter_firstname() {

	mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodefirstname"),
			"John", "first name");

}
    public void enter_lastname() {

    	mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodelastname"),
    			"Stephen", "last name");

    }
    public void clicks_pincodecalender() {
    	switch (data_UDID) {
		case "VSWCZ5Q8U4YTCAS4":
			try {
				mobileActions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodecalendericon"));
				mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodecalendericon"),
						"Curebay_pincodecalendericon");
			} catch (InterruptedException e) {
				System.out.println("DOB not clicked");
			}
			break;

		case "ZF6223VL42":
			try {
				mobileActions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodecalendericon"));
				mobileActions.swipeUp(1);
				mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodecalendericon"),
						"Curebay_pincodecalendericon");
			} catch (InterruptedException e) {
				System.out.println("DOB not clicked");
			}

			break;

		default:
			try {
				mobileActions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodecalendericon"));
				mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodecalendericon"),
						"Curebay_pincodecalendericon");
			} catch (InterruptedException e) {
				System.out.println("DOB not clicked");
			}
		}
		
    	
		
	}
    public void clicks_pincodecalenderdateandok() throws Throwable {
    	Thread.sleep(3000);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodecalenderdate4"),
				"Curebay_pincodecalenderdate4");
		Thread.sleep(3000);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodecalenderok"),
				"Curebay_pincodecalenderok");
	}
    public void clicks_pincodebloodandab() throws Throwable {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodeselectblood"),
				"Curebay_pincodeselectblood");
		Thread.sleep(3000);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodeselectbloodab"),
				"Curebay_pincodeselectbloodab");
	}
    public void clicks_pincodemother() throws Throwable {
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodemother"),
				"Curebay_pincodemother");
		Thread.sleep(3000);
		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodemother"),
				"Curebay_pincodemother");
	}
    
    
    public void enter_mobile(String MobileNumber)  {
    	try {
    		mobileActions.swipeUp_FindElement(2,MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodemobilenumber"));
        	mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodemobilenumber"),
        			MobileNumber);

        	mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodemobilenumber"),
        			MobileNumber, "MobileNumber");
		} catch (Exception e) {
		}
    }
    public void enter_emergency(String EmergencyNumber) {
    	
		try {
			mobileActions.swipeUp_FindElement(2,MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodeemergency"));
			mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodeemergency"),
	    			EmergencyNumber);
	    	mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodeemergency"),
	    			EmergencyNumber, "EmergencyNumber");

		} catch (InterruptedException e) {
			System.out.println("emergency number not found");
		}

    	
    }
    public void enter_email(String Email) {
    	try {
    		mobileActions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodemail"));
    		mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodemail"),
        			Email);

        	mobileActions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodemail"),
        			Email, "Email");
		} catch (Exception e) {
			// TODO: handle exception
		}
    	

    }
    
    
	
   public void salutation(String Salutation) {
	   switch(Salutation) {
	   case "Mr" :
		   mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodesalutation"),
					"Curebay_pincodesalutation");
		   break;
	   case "Mrs" :
		   mobileActions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_pincodesalutationMrs"),
					"Curebay_pincodesalutationMrs");
		   break;
		   default:
			   System.out.println("not clicked");
			   
		   
	   }
   }
	
	
}
	
	
	
	
	
	
	
	
	
	
	


