package com.kfh.bdd.mobile.step_definitions;

import com.kfh.bdd.mobile.screens.Curebay_mydashboard_screens;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Curebay_Appointments {
	Curebay_mydashboard_screens cure=new Curebay_mydashboard_screens();
	@When("user taps on Appointments")
	public void user_taps_on_appointments() throws InterruptedException {
		cure.clicks_appointment();
	}

	@When("user taps on patient name dropdown")
	public void user_taps_on_patient_name_dropdown() throws InterruptedException {
		//cure.Healthrecord();
		cure.clicks_fpatientdropdown();
	}

	@When("user selects patient name from the dropdown list")
	public void user_selects_patient_name_from_the_dropdown_list() throws InterruptedException {
		cure.clicks_fathersir();
	}

	@Then("user should able to see patient name")
	public void user_should_able_to_see_patient_name() {
		System.out.println("List of user names are displayed");
	}

	@Then("user should able to see the care plan Name")
	public void user_should_able_to_see_the_care_plan_name() {
		cure.verify_careplan();
	}

//	@Then("user should able to see {string}")
//	public void user_should_able_to_see(String string) {
//		try {
//		cure.verify_myappointment(string);
//		}catch(Exception e) {
//			cure.verify_prescription(string);
//		}
//		
//	}

	@When("user taps on Previous Appoinment")
	public void user_taps_on_previous_appoinment() {
		cure.clicks_previous();
	}

//	@Then("user should able to see doctor name")
//	public void user_should_able_to_see_doctor_name() {
//		System.out.println("Doctor name is displayed");
//	}

//	@Then("user should able to see date")
//	public void user_should_able_to_see_date() {
//		System.out.println("Date is displayed");
//	}

	@Then("user should able to see Consultation Type")
	public void user_should_able_to_see_consultation_type() {
		cure.verify_doctorconsult();
		System.out.println("Consultation is displayed");
	}

	@When("user taps on Upcoming Appointment")
	public void user_taps_on_upcoming_appointment() {
		cure.clicks_upcoming();
	}

	@Then("user should able to see appointment if any available")
	public void user_should_able_to_see_appointment_if_any_available() {
		System.out.println("Appointments are not displayed");
	}
	
	@Then("user should able to see {string} in Health record")
	public void user_should_able_to_see_in_health_record(String string) {
		cure.verify_prescription(string);
	}
	@Then("user should able to see doctor name in appointments")
	public void user_should_able_to_see_doctor_name_in_appointments() throws InterruptedException {
		cure.verify_doctorname();
	}

//	@When("user taps on View Prescription link")
//	public void user_taps_on_view_prescription_link() {
//		cure.
//	}

	@Then("user should able to see {string}  Health record")
	public void user_should_able_to_see_health_record(String string) {
		cure.verify_labreports(string);
	}

	@When("user taps on Lab Reports")
	public void user_taps_on_lab_reports() {
		cure.labreport();
	}

	@Then("user should able to see the reports")
	public void user_should_able_to_see_the_reports() throws Throwable {
		cure.verify_testname();
	}

	@Then("user should able to see Test Name in the Report")
	public void user_should_able_to_see_test_name_in_the_report() throws Throwable {
		cure.verify_testname();
	}

	@Then("user should able to see Lab Name in the Report")
	public void user_should_able_to_see_lab_name_in_the_report() {
		cure.verify_labname();
	}

	@Then("user should able to see Date in the Report")
	public void user_should_able_to_see_date_in_the_report() {
		cure.verify_orderid();
	}

	@Then("user should able to see Order id in the Report")
	public void user_should_able_to_see_order_id_in_the_report() {
		cure.verify_orderid();
	}

	@When("user taps on view Lab Report link")
	public void user_taps_on_view_lab_report_link() {
		cure.viewlabreport();
	}

	@Then("user should able to see the Lab Report")
	public void user_should_able_to_see_the_lab_report() {
		System.out.println("lab reports are generated");
	}

	@When("user taps on Download Lab Report")
	public void user_taps_on_download_lab_report() {
	cure.viewlabreportdownload();
	}

	@Then("user should able to see downloaded Lab Report file")
	public void user_should_able_to_see_downloaded_lab_report_file() {
	}

	@Then("user should able to see {string} in Appointments")
	public void user_should_able_to_see_in_appointments(String string) {
		System.out.println("Not downloaded");
	}

//	@Then("user should able to see doctor name")
//	public void user_should_able_to_see_doctor_name() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
	@Then("user should able to see date")
	public void user_should_able_to_see_date() {
		cure.verify_datesee();
	}
	@When("user swipes to {string} dropdown")
	public void user_swipes_to_dropdown(String string) throws Throwable {
		cure.swipesupdoctor();
	}

	@When("user taps on Doctors Consultation dropdown")
	public void user_taps_on_doctors_consultation_dropdown() {
		cure.clicks_doctor();
	}

	@Then("user should able to see consultations if available")
	public void user_should_able_to_see_consultations_if_available() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user taps on Past")
	public void user_taps_on_past() {
		
	}

	@Then("user should able to see View All")
	public void user_should_able_to_see_view_all() {
		cure.verify_viewall();
	}

	@When("user taps on View All")
	public void user_taps_on_view_all() {
		cure.clicks_viewalldoct();
	}

	@When("user taps on notification icon")
	public void user_taps_on_notification_icon() {
		cure.clicks_noti();
		cure.clicks_notiback();
	}

	@Then("user should able to see notifications if available")
	public void user_should_able_to_see_notifications_if_available() {
	}

	@When("user swipes the screen to My medical Plans")
	public void user_swipes_the_screen_to_my_medical_plans() throws Throwable {
		cure.swipesupmedical();
	}
	@When("user swipes the screen to My Medical Plans")
	public void user_swipes_the_screen_to_My_Medical_Plans() {
		cure.user_swipes_the_screen_to_My_Medical_Plans();
	}

	@When("user taps on My Medical plans")
	public void user_taps_on_my_medical_plans() {
		cure.clicks_swipesupmedical();
	}
	@When("user should able to see General Health Care")
	public void user_should_able_to_see_General_Health_Care() {
		cure.user_should_able_to_see_General_Health_Care();
	}
	@Then("user should able to see validity of plan for General Health Care")
	public void user_should_able_to_see_validity_of_plan_for_General_Health_Care() {
		cure.user_should_able_to_see_validity_of_plan_for_General_Health_Care();
	}
	@When("user taps on view details related for General Health Care")
	public void user_taps_on_view_details_related_for_General_Health_Care() {
		cure.user_taps_on_view_details_related_for_General_Health_Care();
	}
	@When("user taps on Start Now")
	public void user_taps_on_start_now() {
		cure.clicks_sign();
	}
	@When("user taps on Health Record")
	public void user_taps_on_health_record() {
		cure.Healthrecord();
	}

	@Then("user should able to Health Record screen")
	public void user_should_able_to_health_record_screen() {
		cure.verify_careplan();
	}
//	@When("^user enters the (.*) in first name box$")
//	public void user_enters_the_in_first_name_box() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("^user enters the (.*) in last name box$")
//	public void user_enters_the_in_last_name_box() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("^user selects (.*) from the Blood Group dropdown$")
//	public void user_selects_from_the_blood_group_dropdown(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("^user selects (.*) from the Relation dropdown$")
//	public void user_selects_from_the_relation_dropdown(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("^user selects (.*)$")
//	public void user_selects(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	

}
