package com.kfh.bdd.mobile.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.kfh.bdd.mobile.screens.Curebay_Schedule;
import com.kfh.bdd.mobile.screens.Curebay_mydashboard_screens;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Curebay_Schedule_Steps {
	Curebay_Schedule schedule = new Curebay_Schedule();
	Curebay_mydashboard_screens profile = new Curebay_mydashboard_screens();

	@Given("user is in curebay mobile appication")
	public void user_is_in_curebay_mobile_appication() {
		System.out.println("Open the app");
	}

	@When("user login with valid credentials")
	public void user_login_with_valid_credentials() {
		schedule.clicks_login_signup();
		schedule.login_Username();
		schedule.login_Password();
		schedule.clicks_login_btn();
	}

	@Then("user should able to see curebay dashboard Screen")
	public void user_should_able_to_see_curebay_dashboard_screen() {
		schedule.dashboard_Curebay();
	}

	@When("user taps on Schedule")
	public void user_taps_on_schedule() {
		schedule.click_Schedule();
	}

	@When("user taps on Doctor Consultation dropdown")
	public void user_taps_on_doctor_consultation_dropdown() {
		schedule.doctor_Consultation();
	}

	@Then("user should able to see Doctor name in the Consultation")
	public void user_should_able_to_see_doctor_name_in_the_consultation() {
		schedule.doctor_Name();
	}

	@Then("user should able to see consultation time")
	public void user_should_able_to_see_consultation_time() {
		schedule.doctor_Consultation_time();
	}

	@Then("user should able to see frequency")
	public void user_should_able_to_see_frequency() {
		schedule.doctor_frequency();
	}

	@Then("user should able to see status")
	public void user_should_able_to_see_status() {
		schedule.doctor_status();
	}

	@Then("user should able to see {string} in Schedule screen")
	public void user_should_able_to_see_in_Schedule_screen(String string) {
		schedule.verify_Text(string);
	}

	@Then("user should able to see doctor qualification")
	public void user_should_able_to_see_doctor_qualification() {
		schedule.doctor_qualification();
	}

	@Then("user should able to see Doctor constulation drowpdown closed")
	public void user_should_able_to_see_doctor_constulation_drowpdown_closed() {
		schedule.doctor_consultation_closed();
	}

	@When("user taps on Nursing")
	public void user_taps_on_Nursing() {
		schedule.nursing_Module();
	}

	@Then("user should able nursing schedules")
	public void user_should_able_nursing_schedules() {
	//	schedule.nursing_scheduleList();
	}

	@And("user should able to see Date")
	public void user_should_able_to_see_Date() {
		schedule.nursing_module_date();
	}

	@And("user should able to see Frequency")
	public void user_should_able_to_see_Frequency() {
		schedule.nursing_module_frequency();
	}

	@And("user should able to see Status")
	public void user_should_able_to_see_Status() {
		schedule.nursing_module_status();
	}

	// Lab track results
	@When("user taps on Lab Test Track Results dropdown")
	public void user_taps_on_Lab_Test_Track_Results_dropdown() {
		schedule.labtrack_Results();
	}

	@Then("user should able to see Test name in the Result")
	public void user_should_able_to_see_Test_name_in_the_Result() {
		schedule.labtrack_Results_testname();
	}

	@And("user should able to see Lab Name")
	public void user_should_able_to_see_Lab_Name() {
		schedule.labtrack_Results_labname();

	}

	@And("user should able to see Order Id")
	public void user_should_able_to_see_Order_Id() {
		schedule.labtrack_Results_orderid();
	}

	@When("user taps on View Lab Report")
	public void user_taps_on_View_Lab_Report() {
		schedule.labtrack_Results_viewlabreport();
	}

	@When("user taps on download")
	public void user_taps_on_download() {
		schedule.labtrack_Results_download();

	}

	@Then("user should able to see downloaded report")
	public void user_should_able_to_see_downloaded_report() {
		//schedule.downloadedReport_verification();
	}

	// Schedule for a year
	@When("user taps on Schedule for a year dropdown")
	public void user_taps_on_Schedule_for_a_year_dropdown() {
		schedule.schedule_for_year();
	}

//	@Then("user should able to see month list from current year to next consecutive year")
//	public void user_should_able_to_see_month_list_from_current_year_to_next_consecutive_year() {
//		schedule.list_of_Schedulemonths();
//
//	}

	@When("user taps on first month in the dropdown list")
	public void user_taps_on_first_month_in_the_dropdown_list() {
		schedule.schedule_for_month();

	}

	@Then("user should able to see Service Period")
	public void user_should_able_to_see_Service_Period() {
		schedule.schedule_for_serviceperiod();
	}

	@And("user should able to see Service Description")
	public void user_should_able_to_see_Service_Description() {

	}

	@And("user should able to see Service Mode")
	public void user_should_able_to_see_Service_Mode() {

	}

	@And("user should able to see Service Status")
	public void user_should_able_to_see_Service_Status() {

	}

	@And("user scrolls to the last month")
	public void user_scrolls_to_the_last_month() {

	}

	@And("user taps on last month in the dropdown")
	public void user_taps_on_last_month_in_the_dropdown() {

	}

	@Then("user should able to see Schedule for a year closed")
	public void user_should_able_to_see_Schedule_for_a_year_closed() {

	}

	// profile steps
	@Then("user should able to see {string} Screen")
	public void user_should_able_to_see_Screen(String string) {
		schedule.verify_profile_text(string);
	}

	@Then("user should able to see 'See Profiles' in profile")
	public void user_should_able_to_see_See_Profiles_in_profile() {
		schedule.verify_manage_profile_text();
	}

	@When("user taps on Add Member")
	public void user_taps_on_Add_Member() {
		schedule.user_clicks_addmember();
	}

	@Then("user should able to see Check medicare services near to your parents area in profile")
	public void user_should_able_to_see_Check_medicare_services_near_to_your_parents_area_in_profile() {
		schedule.verify_profile_medical_services();
	}

	@And("user should able to see Add Member Details")
	public void user_should_able_to_see_Add_Member_Details() {
		schedule.user_clicks_addmember_details();
	}

	@When("^user enters (.*) in profile page$")

	public void user_enters_in_profile_page(String pincode) {
		schedule.user_enters_pincode(pincode);

	}

	@And("user taps on check button")
	public void user_taps_on_check_button() {
		schedule.user_clicks_check_button();
	}

	@Then("user should able to see the error message")
	public void user_should_able_to_see_the_error_message() {
		schedule.verify_pincode_error_message();
	}

	@Given("user is in Curebay mobile application")
	public void user_is_in_curebay_mobile_application() {
	}

	@When("user enters the first name")
	public void user_enters_the_first_name() {
		profile.enter_firstname();
	}

	@When("user enters the last name")
	public void user_enters_the_last_name() {
		profile.enter_lastname();
	}

	@When("user taps on the calendar icon")
	public void user_taps_on_the_calendar_icon() {
		profile.clicks_pincodecalender();
	}

	@When("user selects relavent DOB")
	public void user_selects_relavent_dob() throws Throwable {
		profile.clicks_pincodecalenderdateandok();
	}

	@When("user selects Blood Group from Blood Group dropdown")
	public void user_selects_blood_group_from_blood_group_dropdown() throws Throwable {
		//profile.clicks_pincodebloodandab();
	}

	@When("user selects Mother Relation from Relation dropdown")
	public void user_selects_mother_relation_from_relation_dropdown() throws Throwable {
		//profile.clicks_pincodemother();
	}

	@When("^user enters a valid (.*) in the Mobile Number text box$")
	public void user_enters_a_valid_in_the_mobile_number_text_box(String MobileNumber) {
		profile.enter_mobile(MobileNumber);
	}

	@When("^user enters a valid (.*) in the Emergency Contact Number$")
	public void user_enters_a_valid_in_the_emergency_contact_number(String EmergencyNumber) {
		profile.enter_emergency(EmergencyNumber);
	}

	@When("^user enters a valid (.*) in Email text box$")
	public void user_enters_a_valid_email_id_in_email_text_box(String Email) {
		profile.enter_email(Email);
	}

	@When("user enters Address in Address text box")
	public void user_enters_address_in_address_text_box() {
		schedule.address_Text();
	}

	@When("user enters Locality in Locality\\/Town text box")
	public void user_enters_locality_in_locality_town_text_box() {
		schedule.enter_Locality();
	}

	@When("user enters valid pincode in pincode text box")
	public void user_enters_valid_pincode_in_pincode_text_box() {
		schedule.valid_Pincode();

	}

	@When("user enters city in city text box")
	public void user_enters_city_in_city_text_box() {
		schedule.enter_City();
	}

	@When("user enters State in State text box")
	public void user_enters_state_in_state_text_box() {
		schedule.enter_State();
	}

	@Then("user should able to see Nearby e-clinics")
	public void user_should_able_to_see_nearby_e_clinics() {
		schedule.verify_nearby_clinic_text();
	}

	@When("user taps on Save Member button")
	public void user_taps_on_save_member_button() {
		schedule.save_Memeber();
	}

	@Then("user should able to see created member profile in See Profiles screen")
	public void user_should_able_to_see_created_member_profile_in_see_profiles_screen() {
		schedule.verify_memberadded_Text();
	}
	// Profile steps-scenario 2

	@When("^user enters the (.*) in first name box$")

	public void user_enters_the_in_first_name_box(String Fname) {
     schedule.select_Firstname(Fname);
	}

	@When("^user enters the (.*) in last name box$")

	public void user_enters_the_in_last_name_box(String Lname) {
     schedule.select_Lastname(Lname);
	}

	@When("^user selects (.*) from the Blood Group dropdown$")

	public void user_selects_from_the_blood_group_dropdown(String Bloodgrp) throws InterruptedException {
         schedule.select_Bloodgroup(Bloodgrp);
	}

	@When("^user selects (.*) from the Relation dropdown$")

	public void user_selects_from_the_relation_dropdown(String Relation) throws InterruptedException {
		schedule.select_Relation(Relation);

	}

//		@When("^user selects (.*)$")
//
//		public void user_selects(String DOB) {
//
//		}
	@And ("user selects Country from the country code dropdown")
	public void user_selects_Country_from_the_country_code_dropdown(){
		
	}
	 @Then ("user should able to see the eClinic image")
	 public void user_should_able_to_see_the_eClinic_image()
	 {
		 
	 }
	@And ("user should able to see the eClinic location")
	public void user_should_able_to_see_the_eClinic_location()
	{
		
	}
	 @And ("user should able to see Zipcode")
	 public void user_should_able_to_see_Zipcode()
	 {
		 
	 }
	 @And ("user should able to see Eclinic Name")
	 public void user_should_able_to_see_Eclinic_Name()
	 {
		 
	 }
	 @When ("^user selects (.*) from the Salutation dropdown$")
	 public void user_selects_from_the_Salutationdropdown(String Salutation)
	 {
		 schedule.salutation(Salutation);
	 }
	
	 @Then ("^user should able to see (.*) is updated in the gender box$")
	 public void user_should_able_to_see_is_updated_in_the_gender_box(String gender) throws InterruptedException
	 {
		 schedule.select_Relation(gender);
	 }
	
	 @When("user enters valid pincode")

	    public void user_enters_valid_pincode() {

	        schedule.user_enters_pincode();

	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
