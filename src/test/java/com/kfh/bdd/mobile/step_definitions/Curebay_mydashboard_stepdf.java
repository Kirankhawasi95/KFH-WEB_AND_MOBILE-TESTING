package com.kfh.bdd.mobile.step_definitions;

import com.kfh.bdd.mobile.screens.Curebay_mydashboard_screens;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Curebay_mydashboard_stepdf {

	Curebay_mydashboard_screens cure = new Curebay_mydashboard_screens();

	@When("user clicks on login and signup button")
	public void user_clicks_on_login_and_signup_button() {
		cure.clicks_login_signup();
	}

	@When("user enters the username on the textbox fields")
	public void user_enters_the_username_on_the_textbox_fields() {
		cure.enter_email();
	}

	@When("user enters the password on the textbox fields")
	public void user_enters_the_password_on_the_textbox_fields() {
		cure.enters_password();
	}

	@When("user clicks the next button on mobile page")
	public void user_clicks_the_next_button_on_mobile_page() throws Throwable {
		cure.clicks_on_next_btn();
		Thread.sleep(3000);
		// cure.clicks_on_next_btn();
	}

	@Then("user able to see the Home page")
	public void user_able_to_see_the_home_page() {
		System.out.println("Home page");
		cure.verifyhomepage();
	}

	@When("user clicks on appointment button on home page")
	public void user_clicks_on_appointment_button_on_home_page() throws InterruptedException {
		cure.clicks_appointment();
	}

	@When("user selects the cardiac care plans on selects plan dropdown")
	public void user_selects_the_cardiac_care_plans_on_selects_plan_dropdown() {
		System.out.println("Cardiac care plan is selected");
	}

	@When("user clicks on previous and upcoming appointments")
	public void user_clicks_on_previous_and_upcoming_appointments() throws Throwable {
		cure.clicks_previous();
		Thread.sleep(3000);
		cure.clicks_upcoming();

	}

	@Then("user able to see the appointments on that page")
	public void user_able_to_see_the_appointments_on_that_page() throws Throwable {
		cure.clicks_previous();
		Thread.sleep(3000);
		cure.verifytxtonAppointmentpage();
	}

	@When("user selects the patient name on select patient name dropdown on appointment")
	public void user_selects_the_patient_name_on_select_patient_name_dropdown_on_appointment()
			throws InterruptedException {
		cure.clicks_fpatientdropdown();
		Thread.sleep(3000);
		cure.selects_motherpatient();
	}

	@When("user clicks on request to change the date for appointments")
	public void user_clicks_on_request_to_change_the_date_for_appointments() {
		cure.clicks_requesttochange();
	}

	@When("user selects date and clicks on submit button")
	public void user_selects_date_and_clicks_on_submit_button() throws Throwable {
		cure.clicks_selectdate();
		Thread.sleep(3000);
		cure.selects_date();
		cure.clicks_selectok();
		cure.clicks_selectsubmit();
		cure.clicks_errorok();
	}

	@Then("user able to see the changed date on that page")
	public void user_able_to_see_the_changed_date_on_that_page() throws Throwable {
		try {
			cure.clicks_navigatesback();
			cure.clicks_previous();
			Thread.sleep(3000);
			cure.verifytxtonAppointmentpage();
		} catch (Exception e) {
			System.out.println("Changed date is visible");
		}
	}

	@When("user selects the child sir name on select patient name dropdown in appointment")
	public void user_selects_the_child_sir_name_on_select_patient_name_dropdown_in_appointment() throws Throwable {
		cure.clicks_fpatientdropdown();
		Thread.sleep(3000);
		cure.clicks_childsir();
	}

	@When("user selects the another care plans in the care plan drop down")
	public void user_selects_the_another_care_plans_in_the_care_plan_drop_down() throws Throwable {
		cure.clicks_careplangeneral();
		Thread.sleep(3000);
		cure.clicks_careplanortho();
	}

	@Then("user able to see the appointments for the child sir")
	public void user_able_to_see_the_appointments_for_the_child_sir() {
		System.out.println("no data found");
	}

	@When("user selects the sister name on select patient name on dropdown of appointment")
	public void user_selects_the_sister_name_on_select_patient_name_on_dropdown_of_appointment() throws Throwable {
		cure.clicks_fpatientdropdown();
		Thread.sleep(6000);
		cure.clicks_sister();
	}

	@Then("user able to see the appointments for the sister")
	public void user_able_to_see_the_appointments_for_the_sister() {
		System.out.println("no data found");
	}

	@When("user selects the tiger name on select patient name in dropdown on appintment")
	public void user_selects_the_tiger_name_on_select_patient_name_in_dropdown_on_appintment() throws Throwable {
		cure.clicks_fpatientdropdown();
		Thread.sleep(3000);
		cure.clicks_tiger();

	}

	@Then("user able to see the appointments for the tiger")
	public void user_able_to_see_the_appointments_for_the_tiger() {
		System.out.println("no data found");
	}

	@When("user selects the fatherinlaw name on select patient name dropdown in the appointment")
	public void user_selects_the_fatherinlaw_name_on_select_patient_name_dropdown_in_the_appointment()
			throws Throwable {
		cure.clicks_fpatientdropdown();
		Thread.sleep(3000);
		cure.clicks_fatherinlaw();
	}

	@Then("user able to see date is not changing on that page")
	public void user_able_to_see_date_is_not_changing_on_that_page() throws Throwable {
		cure.clicks_navigatesback();
		cure.clicks_previous();
		Thread.sleep(3000);
		cure.verifytxtonAppointmentpage();
	}

	@Then("user able to see the appointments for the patients")
	public void user_able_to_see_the_appointments_for_the_patients() {
		System.out.println("no data found");
	}

	@When("^user selects the (.*) name on select patient name dropdown$")
	public void user_selects_the_motherinlaw_name_on_select_patient_name_dropdown(String patient) throws Throwable {
		cure.clicks_patients(patient);

	}

	@When("user clicks on the calender on the dashboard")
	public void user_clicks_on_the_calender_on_the_dashboard() {
		cure.clicks_calenderondashboard();
	}

	@When("user selects the date and clicks on ok")
	public void user_selects_the_date_and_clicks_on_ok() throws Throwable {
		cure.clicks_calenderdateandok();
	}

	@When("^user clicks the (.*) in the dashboard$")
	public void user_clicks_the_temperature_in_the_dashboard(String Dropdown) throws Throwable {
		cure.temperaturedropdown(Dropdown);
	}

	@Then("^user able to see the different (.*) for the dropdown$")
	public void user_able_to_see_the_different_values_for_the_dropdown(String values) {
		cure.Avg_verify(values);
	}

	@When("user clicks on the viewall button on the vital reports in Dashboard")
	public void user_clicks_on_the_viewall_button_on_the_vital_reports_in_dashboard() throws Throwable {
		cure.clicks_viewall_vitalrpts();
	}

	@When("user scrolls download the vital reports page")
	public void user_scrolls_download_the_vital_reports_page() throws Throwable {
		cure.scrollsdownpage();
	}

	@Then("user able to see the BMI in the vital reports")
	public void user_able_to_see_the_bmi_in_the_vital_reports() {
		cure.verify_bmi();
	}
	// Dasboard

	@Given("user sees the {string} headline")
	public void user_sees_the_headline(String string) {
		cure.verify_dashboardmsg(string);
	}

	@When("user taps on member profile drop down")
	public void user_taps_on_member_profile_drop_down() throws InterruptedException {
		cure.clicks_fpatientdropdown();
	}

	@When("user selects relevent profile")
	public void user_selects_relevent_profile() throws InterruptedException {
		cure.clicks_childsir();
	}

	@Then("user should see selected member profile name in dropdown")
	public void user_should_see_selected_member_profile_name_in_dropdown() {
		System.out.println("Dropdown is displayed");
	}

	@Then("user should see current package plan name of that profile")
	public void user_should_see_current_package_plan_name_of_that_profile() {
		System.out.println("current plan is diaplayed");
	}

	@Then("user should able to see appointments")
	public void user_should_able_to_see_appointments() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("user selects date from the calender")
	public void user_selects_date_from_the_calender() throws Throwable {
		cure.clicks_calenderondashboard();
		cure.clicks_calenderdateandok();
	}

	@Then("user should able to see appointments are available at particular date")
	public void user_should_able_to_see_appointments_are_available_at_particular_date() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("user taps on vital dropdown")
	public void user_taps_on_vital_dropdown() {
		try {
			cure.temperature();
		} catch (Exception e) {
			cure.heartrate();
		}
	}

	@When("user selects temperature")
	public void user_selects_temperature() {
		cure.temperature();
	}

	@Then("user should able to see data relevant to temperature")
	public void user_should_able_to_see_data_relevant_to_temperature() {
		cure.verify_temp();
	}

	@When("user selects HeartRate")
	public void user_selects_heart_rate() {
		cure.heartrate();
		// cure.heartrate();
	}

	@Then("user should able to see data relevant to HeartRate")
	public void user_should_able_to_see_data_relevant_to_heart_rate() {
		cure.verify_heart();
	}

	@When("user selects SPo2")
	public void user_selects_s_po2() {
		cure.sapo2();
	}

	@Then("user should able to see data relevant to SPo2")
	public void user_should_able_to_see_data_relevant_to_s_po2() {
		cure.verify_spo2();
	}
//		@Then("user should able to see symptoms in the prescription")
//		public void user_should_able_to_see_symptoms_in_the_prescription() {
//			cure.verify_symptoms();
//		}

//		@Then("user should able to see Doctor Name")
//		public void user_should_able_to_see_doctor_name() {
//			System.out.println("Jamal s");
//		}

//		@Then("user should able to see Any Allergy")
//		public void user_should_able_to_see_any_allergy() {
//			cure.verify_allery();
//		}

//		@Then("user should able to see Consultation Date")
//		public void user_should_able_to_see_consultation_date() {
//			cure.verify_nxtconsult();
//		}

//		@Then("user should able to see Next Consultation Date")
//		public void user_should_able_to_see_next_consultation_date() {
//			cure.verify_nxtconsult();
//		}

//		@When("user taps on View Prescription link")
//		public void user_taps_on_view_prescription_link() {
//			cure.viewlinkhealth();
//		}

	@Then("user should able to see the prescription")
	public void user_should_able_to_see_the_prescription() {
		System.out.println("prescription displayed");
	}

//		@When("user taps on Download prescription")
//		public void user_taps_on_download_prescription() throws Throwable {
//			cure.download();
//		}

	@Then("user should able to see downloaded prescription file")
	public void user_should_able_to_see_downloaded_prescription_file() {
		System.out.println("file is not downloaded");
	}

	@When("user taps on cart icon")
	public void user_taps_on_cart_icon() {
		cure.clicks_cart();
	}

	@Then("user should able to see Choose health care plan for your family member")
	public void user_should_able_to_see_choose_health_care_plan_for_your_family_member() {
		cure.verify_cartmem();
	}

	@Then("user should able to see {string} with plan cost")
	public void user_should_able_to_see_with_plan_cost(String string) throws Throwable {
		cure.verify_cartplan(string);
	}

	@When("user selects one plan from the list")
	public void user_selects_one_plan_from_the_list() throws InterruptedException {
		cure.clicks_cartplan();
	}

	@When("user taps on Next button in cart")
	public void user_taps_on_next_button_in_cart() throws InterruptedException {
		cure.clicks_cartnxt();
	}
	@When("user taps on Next button in carts")
	public void user_taps_on_next_button_in_carts() throws InterruptedException {
		cure.clicks_cartnxt1();
	}

	@Then("user should able to see YourCart screen")
	public void user_should_able_to_see_your_cart_screen() {
		cure.verify_cartyour();
	}

	@When("user taps on member profile dropdown")
	public void user_taps_on_member_profile_dropdown() throws InterruptedException {
		cure.clicks_fpatientdropdown();
	}

	@When("user selects one profile from the list")
		public void user_selects_one_profile_from_the_list() {
			try {
				cure.selects_motherpatient();
//				cure.clicks_fpatientdropdown();
			}catch(Exception e) {
//				cure.clicks_fpatientdropdown();
//			cure.selects_motherpatient();
//			System.out.println("selected");
			}

		}
	

	@Then("user should able to see price per month")
	public void user_should_able_to_see_price_per_month() {
		cure.verify_cartpricepermnt();
	}

	@When("^user select payment option (.*)$")
	public void user_select_payment_option(String option) throws InterruptedException {
		cure.clicks_cartmonth(option);
	}

	@Then("user should able to see Effective Start Date")
	public void user_should_able_to_see_effective_start_date() {
		cure.verify_cartefft();

	}

	@Then("user should able to see Payment Details")
	public void user_should_able_to_see_payment_details() throws Throwable {
		Thread.sleep(3000);
		cure.verify_cartpayment();
	}

	@Then("user should able to see selected plan")
	public void user_should_able_to_see_selected_plan() {
		cure.verify_cartselectedplan();
	}


	@Then("user should able to see selected plan price")
	public void user_should_able_to_see_selected_plan_price() {
		cure.verify_cartselectedprice();
	}

		@Then("user should able to see total price")
		public void user_should_able_to_see_total_price() throws Throwable {
			cure.verify_carttotalprice();
		}


	@When("user taps on Checkout")
	public void user_taps_on_checkout() {
		cure.clicks_cartcheckedout();
	}

	@Then("user should able to see your order screen")
	public void user_should_able_to_see_your_order_screen() {
		cure.verify_cartyour();
	}

	@Then("user should able to see selected plan in Your order screen")
	public void user_should_able_to_see_selected_plan_in_your_order_screen() {
		cure.verify_cartselectedplan();
	}

	@When("user taps on Proceed To Checkout in cart")
	public void user_taps_on_proceed_to_checkout_in_cart() throws Throwable {
		cure.clicks_cartprocceed();
	}

	@Then("user should able to see Add your billing address screen")
	public void user_should_able_to_see_add_your_billing_address_screen() {
		System.out.println("add your bill is displayed");
	}

	@When("user enters the valid text in first name text box")
	public void user_enters_the_valid_text_in_first_name_text_box() throws InterruptedException {
		cure.enter_fstname();
	}

	@When("user enters the valid text in last name text box")
	public void user_enters_the_valid_text_in_last_name_text_box() {
		cure.enter_lstname();
	}

	@When("user enters the valid address in Address Line one box")
	public void user_enters_the_valid_address_in_address_line_one_box() throws InterruptedException {
		cure.enter_address1();
	}

	@When("user enters the valid address in Address Line two box")
	public void user_enters_the_valid_address_in_address_line_two_box() {
		cure.enter_address2();
	}

	@When("user selects the valid location from the suggestions")
	public void user_selects_the_valid_location_from_the_suggestions() {
		cure.enter_address3();
	}

	@Then("user should able to see City name in City text box")
	public void user_should_able_to_see_city_name_in_city_text_box() {
		cure.enter_city();
	}

	@Then("user should able to see Zipcode in Zipcode text box")
	public void user_should_able_to_see_zipcode_in_zipcode_text_box() {
		cure.enter_zip();
	}

	@Then("user should able to see State in State text box")
	public void user_should_able_to_see_state_in_state_text_box() {
		cure.enter_state();
	}

	@Then("user should able to see Country in Country box")
	public void user_should_able_to_see_country_in_country_box() {
		cure.clicks_cartpick();
		cure.clicks_cartcalbania();
	}
//
//		@When("user should able to see Add your payment details screen")
//		public void user_should_able_to_see_add_your_payment_details_screen() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@When("user enters valid card number")
//		public void user_enters_valid_card_number() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@When("user enters the expiry date")
//		public void user_enters_the_expiry_date() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}

	@When("user taps on next in cart")
	public void user_taps_on_next_in_cart() throws InterruptedException {
		cure.clicks_cartnxt();
	}

//		@Then("user should able to see Complete your order screen")
//		public void user_should_able_to_see_complete_your_order_screen() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Then("user should able to see selected plan in complete your order screen")
//		public void user_should_able_to_see_selected_plan_in_complete_your_order_screen() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Then("user should able to see cost of plan")
//		public void user_should_able_to_see_cost_of_plan() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Then("user should able to see Account")
//		public void user_should_able_to_see_account() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Then("user should able to see Billing")
//		public void user_should_able_to_see_billing() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Then("user should able to see Payment")
//		public void user_should_able_to_see_payment() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Then("user taps on pay & subscribe")
//		public void user_taps_on_pay_subscribe() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Then("user should able to see a message Subscription complete")
//		public void user_should_able_to_see_a_message_subscription_complete() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Then("user should able to see Thank you for purchasing")
//		public void user_should_able_to_see_thank_you_for_purchasing() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@When("user taps on Go to Home button")
//		public void user_taps_on_go_to_home_button() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Then("user should able to see Dashboard screen")
//		public void user_should_able_to_see_dashboard_screen() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@When("user select payment option OneTime")
//		public void user_select_payment_option_one_time() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}

	@When("user taps on Lab Reports dropdown")
	public void user_taps_on_lab_reports_dropdown() throws Throwable {
		cure.clicks_clabrpts();
	}

	@Then("user should able to see lab reports")
	public void user_should_able_to_see_lab_reports() {
		cure.verify_labrepts1();
	}

	@Then("user should able to see Test Name in reports")
	public void user_should_able_to_see_test_name_in_reports() {
		System.out.println("Test Name is displayed");
	}

	@Then("user should able to see View All Lab Reports button")
	public void user_should_able_to_see_view_all_lab_reports_button() {
		cure.verify_labrepts1();
	}

	@When("user tapped on View All Lab Reports in dashboard")
	public void user_tapped_on_view_all_lab_reports_in_dashboard() {
		cure.clicks_dashview();
	}

	@Then("user should able to see laboratory name")
	public void user_should_able_to_see_laboratory_name() {
		System.out.println("laboratory name");
	}

//		@Then("user should able to see {string} button")
//		public void user_should_able_to_see_button(String string) {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}


	@When("user tapped on View All Lab Reports")
	public void user_tapped_on_view_all_lab_reports() {
		cure.clicks_dashviewall();
	}

	// Dashboard -Nisha & Pavani
	@When("user select payment options")
	public void user_select_payment_options() {
		cure.select_Payment();
		
	}

	@And("user should able to see selected plan in your Order screen")
	public void user_should_able_to_see_selected_plan_in_your_Order_screen() {
       cure.verifyyourOrderscreen();
	}

	@Then("user should able to see a popup mesaage There were errors while submitting the form")
	public void user_should_able_to_see_a_popup_mesaage_There_were_errors_while_submitting_the_form() {
       cure.errorMessage();
	}

	@When("^user enters (.*) in First name box$")
	public void user_enters_in_First_name_box(String firstName) {
      cure.biliingfor_Fname(firstName);
	}

	@And("^user enters (.*) in Last name box$")
	public void user_enters_in_Last_name_box(String lastName) {
		 cure.biliingfor_Fname(lastName);
	}

	@And("^user enters (.*) in Address Line1 box$")
	public void user_enters_in_Address_Line1_box(String AddressLine1) {
        cure.biliingfor_addline1(AddressLine1);
	}

	@And("^user enters (.*) in Address Line2 box$")
	public void user_enters_in_Address_Line2_box(String AddressLine2) { 
		cure.biliingfor_addLine2(AddressLine2);
	}

	@And("^user enters (.*) in city box$")
	public void user_enters_in_city_box(String City) {
       cure.biliingfor_city(City);
	}

	@And("^user enters (.*) in Zip box$")
	public void user_enters_in_Zip_box(String Zip) {
        cure.biliingfor_zip(Zip);
	}

	@And("^user enters (.*) in State box$")
	public void user_enters_in_State_box(String State) {
       cure.biliingfor_state(State);
	}

//	@And("^user pick a (.*) in country box$")
//	public void user_pick_a_in_country_box(String country) {
//
//	}

}
