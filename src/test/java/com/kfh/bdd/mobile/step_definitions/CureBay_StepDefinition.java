package com.kfh.bdd.mobile.step_definitions;

import java.io.IOException;

import com.kfh.bdd.integrations.report_utils.ReportManager;
import com.kfh.bdd.mobile.screens.CureBay_Screens;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CureBay_StepDefinition {
	CureBay_Screens cb = new CureBay_Screens();

	@When("user taps on curebay application")
	public void user_taps_on_curebay_application() {
		
	}
	@Then("user should able to see Login Sign-up Pre Login screen")
	public void user_should_able_to_see_Login_Sign_up_Pre_Login_screen() throws InterruptedException {
//		cb.user_should_able_to_see_Login_Sign_up_Pre_Login_screen();
	}
	@Then("user should able to see Login and Sign-up")
	public void user_should_able_to_see_Login_and_Sign_up() throws InterruptedException, IOException {
		cb.cb_seeLogin_Sign_up();
	}
	@Then("user should able to see pre login screen")
	public void user_should_able_to_see_pre_login_screen() throws InterruptedException {
		cb.cb_CarePlansseeloginscreen();
	}

	@Then("user should able to see care plans screen")
	public void user_should_able_to_see_care_plans_screen() {
		cb.cb_Text_CarePlans();
	}
	@Then("user should able see a login screen")
	public void user_should_able_see_a_login_screen() throws IOException, InterruptedException {
		cb.cb_screenShotInfo();
	}

	@When("user taps on menu")
	public void user_taps_on_menu() {
		try {
			ReportManager.logMobileScreenshot();
		} catch (IOException e) {
		}
		cb.cb_btn_TapsMenu();
	}

	@Then("user should able to see menu items")
	public void user_should_able_to_see_menu_items() throws InterruptedException {
		cb.cb_btn_Menulist();
	}

	@When("user taps on curebay experience menu item")
	public void user_taps_on_curebay_experience_menu_item() {
		cb.cb_btn_Tab_CurebayExperience();
	}

	@Then("user should able to see Welcome to our eClinic Screen")
	public void user_should_able_to_see_Welcome_to_our_eClinic_Screen() throws IOException, InterruptedException {
		cb.cb_Text_WelcometooureClinic();
	}

	@Then("user should able to see general health in curebay experience screen")
	public void user_should_able_to_see_general_health_in_curebay_experience_screen() throws InterruptedException {
		cb.cb_Text_Generalhealth();
	}

	@When("user taps on general health")
	public void user_taps_on_general_health() {
		cb.cb_Click_Generalhealth();
	}

	@Then("user should able to see key features")
	public void user_should_able_to_see_key_features() {
		cb.swipekeyFeatureslists();
	}

	@When("user taps on add to cart")
	public void user_taps_on_add_to_cart() {
		cb.cb_Addtocart();
		
	}

	

	@When("user swipes to bottom of screen")
	public void user_scroll_to_bottom_of_screen() {
//		cb.cb_ScrollSwipUP(8);
	}

	@Then("user should able to see next generation solutions")
	public void user_should_able_to_see_next_generation_solutions() throws InterruptedException {
		cb.cb_Text_CurebayExperienceNextGenerationSolutions();
	}

	@Then("user should able to see patient empowerment")
	public void user_should_able_to_see_patient_empowerment() throws InterruptedException {
		cb.cb_Text_CurebayExperiencePatientempowerment();
	}

	@Then("user should able to see preventive care")
	public void user_should_able_to_see_preventive_care() throws InterruptedException {
		cb.cb_Text_CurebayExperiencePreventivecare();
	}

	@Then("user should able to see one stop shop")
	public void user_should_able_to_see_one_stop_shop() throws InterruptedException {
		cb.cb_Text_CurebayExperienceOnestopshop();
	}

	@Then("user should able to see mutilateral team")
	public void user_should_able_to_see_mutilateral_team() throws InterruptedException {
		cb.cb_Text_CurebayExperienceMultilateralteam();
	}

	@Then("user should able to see {int} by {int} connected care")
	public void user_should_able_to_see_by_connected_care(Integer int1, Integer int2) throws InterruptedException {
		cb.cb_Text_CurebayExperience24by7ConnectedCare(int1, int2);
	}

	@Then("user should able to see tech smart solutions")
	public void user_should_able_to_see_tech_smart_solutions() throws InterruptedException {
		cb.cb_Text_CurebayExperienceTechsmartsolutions();
	}

	@When("user taps on patient empowerment")
	public void user_taps_on_patient_empowerment() throws InterruptedException {
//		cb.cb_swipeDowns(1);
		cb.cb_taps_CurebayExperiencePatientempowerment();
	}

	@Then("user should able to see information about patient empowerment")
	public void user_should_able_to_see_information_about_patient_empowerment() throws InterruptedException {
		cb.cb_seeinformation_CurebayExperiencePatientempowerment();
	}

	@When("user taps on preventive care")
	public void user_taps_on_preventive_care() throws InterruptedException {
		cb.cb_taps_CurebayExperiencePreventivecare();
	}

	@Then("user should able to see information about preventive care")
	public void user_should_able_to_see_information_about_preventive_care() throws InterruptedException {
		cb.cb_seeinformation_CurebayExperiencePreventivecare();
	}

	@When("user taps on one stop shop")
	public void user_taps_on_one_stop_shop() throws InterruptedException {
		cb.cb_taps_CurebayExperienceOnestopshop();
	}

	@Then("user should able to see information about one stop shop")
	public void user_should_able_to_see_information_about_one_stop_shop() throws InterruptedException {
		cb.cb_seeinformation_CurebayExperienceOnestopshop();
	}

	@When("user taps on mutilateral team")
	public void user_taps_on_mutilateral_team() throws InterruptedException {
		cb.cb_taps_CurebayExperienceMultilateralteam();
	}

	@Then("user should able to see information about mutilateral team")
	public void user_should_able_to_see_information_about_mutilateral_team() throws InterruptedException {
		cb.cb_seeinformation_CurebayExperienceMultilateralteam();
	}

	@When("user taps on {int} by {int} connected care")
	public void user_taps_on_by_connected_care(Integer int1, Integer int2) throws InterruptedException {
		cb.cb_taps_CurebayExperience24by7ConnectedCare(int1, int2);
	}

	@Then("user should able to see information about {int} by {int} connected care")
	public void user_should_able_to_see_information_about_by_connected_care(Integer int1, Integer int2) throws InterruptedException {
		cb.cb_seeinformation_CurebayExperience24by7ConnectedCare();
	}

	@When("user taps on tech smart solutions")
	public void user_taps_on_tech_smart_solutions() throws InterruptedException {
		cb.cb_taps_CurebayExperienceTechsmartsolutions();
	}

	@Then("user should able to see information about tech smart solutions")
	public void user_should_able_to_see_information_about_tech_smart_solutions() throws InterruptedException {
		cb.cb_seeinformation_CurebayExperienceTechsmartsolutions​();
	}

	@Then("user should able to see One Stop health solutions!")
	public void user_should_able_to_see_one_stop_health_solutions() throws InterruptedException {
		cb.cb_CurebayExperienceOneStopHEALTHSOLUTIONS();
	}
	@Then("user should able to see eClinic with short Note")
	public void user_should_able_to_see_eClinic_with_short_Note() throws InterruptedException {
		cb.cb_Text_eClinic();
		cb.cb_Text_eCliniccareplansshortNote();
	}
	@Then("user should able to see Technology platform with short Note")
	public void user_should_able_to_see_Technology_platform_with_short_Note() throws InterruptedException {
		cb.cb_Text_Technologyplatform();
		cb.cb_Text_TechnologyplatformshortNote();
	}
	@Then("user should able to see Consumer application with short Note")
	public void user_should_able_to_see_Consumer_application_with_short_Note() throws InterruptedException {
		cb.cb_Text_Consumerapplication();
		cb.cb_Text_ConsumerapplicationshortNote();
	}
	@Then("user should able to see Health tech devices with short Note")
	public void user_should_able_to_see_Health_tech_devices_with_short_Note() throws InterruptedException {
		cb.cb_Text_Healthtechdevices();
		cb.cb_Text_HealthtechdevicesshortNote();
	}
	@Then("user should able to see Situation room with short Note")
	public void user_should_able_to_see_Situation_room_with_short_Note() throws InterruptedException {
		cb.cb_Text_Situationroom();
		cb.cb_Text_SituationroomshortNote();
	}
	@Then("user should able to see Network providers with short Note")
	public void user_should_able_to_see_Network_providers_with_short_Note() throws InterruptedException {
		cb.cb_Text_Networkproviders();
		cb.cb_Text_NetworkprovidersshortNote();
	}

	@Then("user should able to see Holistic care plans with short Note")
	public void user_should_able_to_see_Holistic_care_plans_with_short_Note() throws InterruptedException {
		cb.cb_Text_ExperienceHolisticcareplans();
		cb.cb_Text_ExperienceHolisticcareplansshortNote();
	}

	@Then("user should able to see Round the clock access with short Note")
	public void user_should_able_to_see_round_the_clock_access_with_short_note() throws InterruptedException {
		cb.cb_Text_ExperienceRoundtheclockaccess();
		cb.cb_Text_ExperienceRoundtheclockaccessshortNote();
	}

	@Then("user should able to see Achieve health goals with short Note")
	public void user_should_able_to_see_achieve_health_goals_with_short_note() throws InterruptedException {
		cb.cb_Text_ExperienceAchievehealthgoals();
		cb.cb_Text_ExperienceAchievehealthgoalsshortNote();
	}

	@Then("user should able to see always stay updated with short Note")
	public void user_should_able_to_see_always_stay_updated_with_short_note() throws InterruptedException {
		cb.cb_Text_ExperienceAlwaysstayupdated();
		cb.cb_Text_ExperienceAlwaysstayupdatedshortNote();
	}

	@Then("user should able to see advanced technology with a short note")
	public void user_should_able_to_see_advanced_technology_with_a_short_note() throws InterruptedException {
		cb.cb_Text_ExperienceAdvancedtechnology();
		cb.cb_Text_ExperienceAdvancedtechnologyshortNote();
	}

	@When("user navigates back")
	public void user_navigates_back() {
		cb.navigatesback();
	}

	@Then("user should able to care plans screen")
	public void user_should_able_to_care_plans_screen() {
		cb.cb_Text_CarePlans();
	}
	@Then("user should able to Medicare Plans screen")
	public void user_should_able_to_Medicare_plans_screen() {
		cb.cb_Text_CarePlans();
	}
	@When("user taps on Service partners menu item")
	public void user_taps_on_service_partners_menu_item() throws InterruptedException {
		cb.cb_btn_Tab_Service_Partners();
	}

	@Then("user should see Service partners screen")
	public void user_should_see_service_partners_screen() {
		cb.cb_Text_Service_Partners();
	}
	@Then("user should able to see General Health Care Frequency")
	public void user_should_able_to_see_General_Health_Care_Frequency() throws InterruptedException {
		cb.user_should_able_to_see_General_Health_Care_Frequency();
	}
	@Then("user should able to see Comprehensive healthcare plans.")
	public void user_should_able_to_see_Comprehensive_healthcare_plans() throws InterruptedException  {
		cb.user_should_able_to_see_Comprehensive_healthcare_plans();
	}

	@Then("user should able to see {string}")
	public void user_should_able_to_see(String string) throws InterruptedException {
		cb.cb_userseescreen(string);
	}
	@Then("user should able to see {string} in Annual health plan screen")
	public void user_should_able_to_seein_Annual_health_plan_screen(String string) throws InterruptedException {
		cb.cb_user_should_able_to_seein_Annual_health_plan_screen(string);
	}

	@When("user taps on Hospital service partners")
	public void user_taps_on_hospital_service_partners() throws InterruptedException {
		cb.cb_screenShotInfo();
		cb.cb_Hospitalservicepartners();
	}

	@Then("user should able to see various Hospital service partners")
	public void user_should_able_to_see_various_hospital_service_partners() throws IOException, InterruptedException {
		cb.cb_screenShotInfo();
	}

	@When("user taps on Diagnostic labs service partners")
	public void user_taps_on_diagnostic_labs_service_partners() throws InterruptedException {
		cb.cb_Diagnosticlabsservicepartners();
	}

	@Then("user should able to see various Diagnostic labs service partners")
	public void user_should_able_to_see_various_diagnostic_labs_service_partners()
			throws IOException, InterruptedException {
		cb.cb_screenShotInfo();
	}

	@When("user taps on Allied service partners")
	public void user_taps_on_allied_service_partners() throws InterruptedException {
		cb.cb_Alliedservicepartners();
	}

	@Then("user should able to see various Allied service partners")
	public void user_should_able_to_see_various_allied_service_partners() throws IOException, InterruptedException {
		cb.cb_screenShotInfo();
	}

	@When("user taps on Ambulance service")
	public void user_taps_on_ambulance_service() throws InterruptedException {
		cb.cb_Ambulanceservice();
	}

	@Then("user should able to see Ambulance service")
	public void user_should_able_to_see_ambulance_service() throws IOException, InterruptedException {
		cb.cb_screenShotInfo();
	}

//	TC_16
	@When("user taps on locations menu item")
	public void user_taps_on_locations_menu_item() throws InterruptedException {
		cb.cb_btn_Tab_Locations();
	}

	@Then("user should able to see location screen")
	public void user_should_able_to_see_location_screen() throws InterruptedException {
		cb.cb_Text_Location();
	}

	@When("user enters invalid zipcode")
	public void user_enters_invalid_zipcode() throws InterruptedException {
		cb.cb_Enter_Zipcode("123");
	}

	@When("user taps on submit button in locations screen")
	public void user_taps_on_submit_button() throws InterruptedException {
		cb.cb_Enter_Zipcode_SUBMIT();
	}

	@Then("user should able to see a popup with message {string}")
	public void user_should_able_to_see_a_popup_with_message(String string) throws InterruptedException {
		cb.cb_Enter_Zipcode_SUBMITAlertMessage(string);
	}

	@When("user taps ok in the popup")
	public void user_taps_ok_in_the_popup() throws InterruptedException {
		cb.cb_Enter_Zipcode_SUBMITAlertMessageOK();
	}

	@When("user enter valid zipcode")
	public void user_enter_valid_zipcode() throws InterruptedException {
		cb.cb_Enter_Zipcode("600005");
	}

	@Then("user should able to see related cureBay eclinics of entered zipcode")
	public void user_should_able_to_see_related_cure_bay_eclinics_of_entered_zipcode() throws InterruptedException {
		cb.cb_Enter_CureBayeClinicsfoundCount();
	}

//	@When("users taps on locations menu item")
//	public void users_taps_on_locations_menu_item() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("user taps on eclinics radio button")
	public void user_taps_on_eclinics_radio_button() throws InterruptedException {
		cb.cb_Locatione_Clinics();
	}

	@Then("user should able to see CureBay eClinics found at various cities")
	public void user_should_able_to_see_cure_bay_e_clinics_found_at_various_cities() throws InterruptedException {
		cb.cb_Enter_CureBayeClinicsfoundCount();
	}

	@When("user taps on city radio button")
	public void user_taps_on_city_radio_button() throws InterruptedException {
		cb.cb_Location_city();
	}

	@Then("user should able to see select a City dropdown")
	public void user_should_able_to_see_select_a_city_dropdown() throws InterruptedException {
		cb.cb_Text_Location_SelectanCity();
	}
	@Then("user should able to see {string} dropdown")
	public void user_should_able_to_see_dropdown(String string) throws InterruptedException {
		cb.cb_Text_Location_SelectanCity(string);
	}

	@When("user taps on Select a city dropdown")
	public void user_taps_on_dropdown() throws InterruptedException {
		cb.cb_taps_Location_Selectancity();
	}
	@When("user taps on Select a City dropdown")
	public void user_taps_on_Select_a_City_dropdown() throws InterruptedException {
		cb.cb_taps_Location_SelectanCity();
	}
	@Then("user should able to see cities in dropdown list")
	public void user_should_able_to_see_cities_in_dropdown_list() throws InterruptedException {
		cb.cb_see_cities_in_dropdown_list​();
	}

	@When("user selects a city from city dropdown")
	public void user_selects_a_city_from_city_dropdown() throws InterruptedException {
		cb.cb_Selects_cities_in_dropdown_list​();
	}

	@Then("user should able to see CureBay eclinics found in selected city")
	public void user_should_able_to_see_cure_bay_eclinics_found_in_selected_city() throws InterruptedException {
		cb.cb_Enter_CureBayeClinicsfoundCount();
	}
	
	@When("user taps on Map view")
	public void user_taps_on_map_view() throws InterruptedException {
		cb.cb_taps_Map_view();
	}

	@Then("user should able to Map screen")
	public void user_should_able_to_map_screen() throws IOException, InterruptedException {
		cb.cb_screenShotInfo();
	}



	@Then("user should able to selected city with eclinic image in map")
	public void user_should_able_to_selected_city_with_eclinic_image_in_map() throws IOException, InterruptedException {
		cb.cb_screenShotInfo();
	}

//@TC_18
	@When("user taps on About us menu item")
	public void user_taps_on_about_us_menu_item() throws InterruptedException {
		cb.cb_Tab_AboutUs();
	}

	@Then("user should able to see {string} {string} screen")
	public void user_should_able_to_see_screen(String string, String string2) throws InterruptedException {
		cb.cb_userseescreen(string);
		cb.cb_userseescreen(string2);
	}

	@Then("user should able to see key features of eClinic")
	public void user_should_able_to_see_key_features_of_eClinic() {
		cb.cb_swipeUp(1);
		cb.cb_KeyFeatureslist();
	}

	@When("user scroll to bottom of screen in About Us")
	public void user_scroll_to_bottom_of_screen_in_About_Us() {
	}
	@Then("user should able to see eClinic: last mile healthcare.")
	public void user_should_able_to_see_eClinic_last_mile_healthcare() throws InterruptedException {
		cb.user_should_able_to_see_eClinic_last_mile_healthcare();
	}
	@Then("user should able to see State of the art healthcare at your finger tips!")
	public void user_should_able_to_see_State_of_the_art_healthcare_at_your_finger_tips() throws InterruptedException {
		cb.user_should_able_to_see_State_of_the_art_healthcare_at_your_finger_tips();
	}
	@Then("user should able to see {string} {string}")
	public void user_should_able_to_see(String string, String string2) throws InterruptedException {

		cb.cb_userseescreen(string);
		cb.cb_userseescreen(string2);

	}

	@When("user taps on General health dropdown")
	public void user_taps_on_general_health_dropdown() throws InterruptedException {
		cb.cb_GeneralHealth();
	}

	@Then("user should able to see short note on General health")
	public void user_should_able_to_see_short_note_on_general_health() {
		cb.cb_GeneralHealth_shortNote();
	}

	@When("user taps on Diabetes Care dropdown")
	public void user_taps_on_diabetes_care_dropdown() throws InterruptedException {
		cb.cb_DiabetesCare();
	}

	@Then("user should able to see short note on Diabetes")
	public void user_should_able_to_see_short_note_on_diabetes() {
		cb.cb_DiabetesCare_shortNote();
	}

	@Then("user should able to see short note on Cardiac Care")
	public void user_should_able_to_see_short_note_on_cardiac_care() {
		cb.cb_CardiacCare_shortNote();
	}

	@When("user taps on Cardiac Care dropdown")
	public void user_taps_on_cardiac_Care_dropdown() throws InterruptedException {
		cb.cb_CardiacCare();
	}

	@When("user taps on Ortho Care drop down")
	public void user_taps_on_ortho_care_drop_down() throws InterruptedException {
		cb.cb_OrthoCare();
	}

	@Then("user should able to see shot note on Ortho Care")
	public void user_should_able_to_see_shot_note_on_ortho_care() {
		cb.cb_OrthoCare_shortNote();
	}

	@When("user taps on Womens' Health")
	public void user_taps_on_womens_health() throws InterruptedException {
		cb.cb_WomensHealth();
	}

	@Then("usee should able to see short note on womens' health")
	public void usee_should_able_to_see_short_note_on_womens_health() {
		cb.cb_WomensHealth_shortNote();
	}

	@When("user taps on Care plans menu item")
	public void user_taps_on_care_plans_menu_item() throws InterruptedException {
		cb.cb_Tab_CarePlans();
	}
	@Then("user should able to see Annual health plan screen")
	public void user_should_able_to_see_Annual_health_plan_screen() throws InterruptedException {
		cb.user_should_able_to_see_Annual_health_plan_screen();
	}

	@Then("user should able to see {string} screen")
	public void user_should_able_to_see_screen(String string) throws InterruptedException {
		cb.cb_userseescreen(string);
	}


//	@Then("user should able to see {string} with related information")
//	public void user_should_able_to_see_with_related_information(String string) throws InterruptedException {
//		cb.cb_userseeCareplansrelatedinformation(string);
//	}
	@When("user taps on General Health")
	public void user_taps_on_General_Health() throws InterruptedException {
		cb.user_taps_on_General_Health();
	}

	@When("user taps on {string}")
	public void user_taps_on(String string) throws InterruptedException {
		cb.user_taps_on(string);
	}
	@When("user taps on add to cart at {string} box in Annual health plan screen")
	public void user_taps_on_add_to_cart_at_box_in_Annual_health_plan_screen(String string) throws InterruptedException {
		cb.user_taps_on_add_to_cart_at_box_in_Annual_health_plan(string);
	}

	@When("user taps on add to cart at Pay Monthly box")
	public void user_taps_on_add_to_cart_at_pay_monthly_box() throws InterruptedException {
		cb.cb_CarePlans_MonthlyAddtoCart();
	}

	@Then("user should able to see a popup Please login to continue.")
	public void user_should_able_to_see_a_popup() throws InterruptedException {
		cb.cb_CarePlansPleaselogintocontinue();
	}

	@When("user taps on login button")
	public void user_taps_on_login_button() throws InterruptedException {
		cb.cb_AddtoCartLogin();
	}

	@Then("user should able to see login screen")
	public void user_should_able_to_see_login_screen() throws InterruptedException {
		cb.cb_CarePlansseeloginscreen();
	}

	@When("user taps on Doctors menu item")
	public void user_taps_on_doctors_menu_item() throws InterruptedException {
		cb.cb_Tabs_Doctors();
	}

	@Then("user should able to see {string} in the screen")
	public void user_should_able_to_see_in_the_screen(String string) throws InterruptedException {
		cb.cb_Doctors_Specialities(string);
	}

	@Then("user should able to see Cardiology")
	public void user_should_able_to_see_cardiology() throws InterruptedException {
		cb.cb_Doctors_Specialities_Cardiology();
	}

	@Then("user should able to see Dentistry")
	public void user_should_able_to_see_dentistry() throws InterruptedException {
		cb.cb_Doctors_Specialities_Dentistry();
	}

	@Then("user should able to see Dermatology")
	public void user_should_able_to_see_dermatology() throws InterruptedException {
		cb.cb_Doctors_Specialities_Dermatology();
	}

	@Then("user should able to see Medicine")
	public void user_should_able_to_see_medicine() throws InterruptedException {
		cb.cb_Doctors_Specialities_Medicine();
	}
	@Then("user should able to see Available doctors")
	public void user_should_able_to_see_Available_doctors() throws InterruptedException {
		cb.cb_Doctors_Specialities_Medicine();
	}

	@Then("user should able to see doctor name")
	public void user_should_able_to_see_doctor_name() throws InterruptedException {
		cb.cb_Doctors_Specialities_AvailabledoctorsName();
	}
	@Then("user should able to see Doctor Name")
	public void user_should_able_to_see_Health_doctor_name() {
		cb.cb_Text_Health_Records_Doctor_Name();
	}

	@Then("user should able to see doctor profession")
	public void user_should_able_to_see_doctor_profession() throws InterruptedException {
		cb.cb_Doctors_Specialities_Availabledoctorsprofession();
	}

	@Then("user should able to see experience")
	public void user_should_able_to_see_experience() throws InterruptedException {
		cb.cb_Doctors_Specialities_Availabledoctorsexperience();
	}

	@Then("user should able to see Location")
	public void user_should_able_to_see_location() throws InterruptedException {
		cb.cb_Doctors_Specialities_AvailabledoctorsLocation();
	}

	@When("user scrolls the doctors scroll bar")
	public void user_scrolls_the_doctors_scroll_bar() throws InterruptedException {
//		cb.cb_swipeRighttoLeft();
		cb.user_scrolls_the_doctors_scroll_bar(20);
	}

	@Then("user should able to see some more doctors in the scroll bar")
	public void user_should_able_to_see_some_more_doctors_in_the_scroll_bar() {
	}
	@Then("user should able to see Receive top-notch treatment.")
	public void user_should_able_to_see_Receivetopnotchtreatment() {
		cb.user_should_able_to_see_Receivetopnotchtreatment();
	}
	@When("user scrolls to Get the care you need without leaving the home!")
	public void user_scrolls_to_Get_the_care_you_need_without_leaving_the_home() throws InterruptedException {
		cb.user_scrolls_to_Get_the_care_you_need_without_leaving_the_home();
	}
	@When("user should able see information on Get the care you need without leaving the home!")
	public void user_should_able_see_information_on_Get_the_care_you_need_without_leaving_the_home() throws InterruptedException {
		cb.user_should_able_see_information_on_Get_the_care_you_need_without_leaving_the_home();
	}

	@When("user swipes to {string}")
	public void user_scrolls_to(String string) throws InterruptedException {
		cb.user_swipes_to(string);
	}
	@When("user scrolls to {string}")
	public void scrolls(String string) throws InterruptedException {
		cb.user_scrolls_to(string);
	}

	@Then("user should able see information on {string}")
	public void user_should_able_see_information_on(String string) throws InterruptedException {
		cb.Textgetthecareyouneedwithoutleavingthehouse(string);
	}


	@When("user scrolls to top of the screen")
	public void user_scrolls_to_top_of_the_screen() {
		cb.cb_swipeDowns(4);
	}

	@When("user taps on the See All")
	public void user_taps_on_the_see_all() throws InterruptedException {
		cb.cb_Click_See_All();
	}

	@When("user enters valid speciality in search box")
	public void user_enters_valid_speciality_in_search_box() {
//		cb.cb_All_Specialitieslist();
		cb.cb_entersSearchSpecialitiesText();
	}

	@Then("user should able to see the speciality entered")
	public void user_should_able_to_see_the_speciality_entered() throws InterruptedException {
		cb.cb_gettextsspeciality();
	}

	@When("user taps on the speciality")
	public void user_taps_on_the_speciality() throws InterruptedException {
		cb.cb_Clicksspeciality();
	}

	@Then("user should able to see number of doctors found")
	public void user_should_able_to_see_number_of_doctors_found() throws InterruptedException {
		cb.cb_number_available_doctors_found();
	}

	@Then("user should able to see doctor name in All available doctors")
	public void user_should_able_to_see_doctor_name_in_all_available_doctors() throws InterruptedException {
		cb.cb_All_available_doctors_name();
	}

	@Then("user should able to see doctor's speciality in All available doctors")
	public void user_should_able_to_see_doctor_s_speciality_in_all_available_doctors() throws InterruptedException {
		cb.cb_All_available_doctors_speciality();
	}

	@Then("user should able to see experience in All available doctors")
	public void user_should_able_to_see_experience_in_all_available_doctors() throws InterruptedException {
		cb.cb_All_available_doctors_experience();
	}

	@Then("user should able to see location in All available doctors")
	public void user_should_able_to_see_location_in_all_available_doctors() throws InterruptedException {
		cb.cb_All_available_doctors_location();
	}

	@Then("user should able to see Video Consultation fee")
	public void user_should_able_to_see_Video_Consultation_fee() throws InterruptedException {
		cb.cb_All_available_doctors_VideoConsultationfee();
	}

	@When("user taps on Read more")
	public void user_taps_on_read_more() throws InterruptedException {
		cb.cb_All_available_doctors_Read_more();
	}

	@Then("user should able to see information on doctor")
	public void user_should_able_to_see_information_on_doctor() throws InterruptedException {
		cb.cb_All_available_doctors_Read_more_seeinformation();
	}

	@When("user enters vaild doctor name in search textbox")
	public void user_enters_vaild_doctor_name_in_search_textbox() {

	}

	@Then("user should able see the doctor availabilty")
	public void user_should_able_see_the_doctor_availabilty() throws InterruptedException {
		cb.cb_number_available_doctors_found();
	}

	@When("user taps on navigates back icon")
	public void user_taps_on_navigates_back_icon() {
		cb.cb_Navigateup();
	}

	@When("user taps on Reviews menu item")
	public void user_taps_on_Reviews_menu_item() throws InterruptedException {
		cb.cb_tabs_Reviews();
	}
	@Then("user should able to see Member experience")
	public void user_should_able_to_see_Member_experience() throws InterruptedException {
		cb.cb_Member_experience();
	}
	@Then("user should able to see reviewer name")
	public void user_should_able_to_see_reviewer_name() throws InterruptedException {
		cb.cb_tabs_reviewer_Name();
	}

	@Then("user should able to see location of reviewer")
	public void user_should_able_to_see_location_of_reviewer() throws InterruptedException {
		cb.cb_tabs_reviewer_location();
	}

	@Then("user should able to see review")
	public void user_should_able_to_see_review() throws InterruptedException {
		cb.cb_tabs_reviewer_review();
	}

	@Then("user should able to see posted Dated")
	public void user_should_able_to_see_posted_dated() throws InterruptedException {
		cb.cb_tabs_reviewer_postedDate();
	}
	 @When("user swipes to Show All")
		public void user_swipes_to_Show_All() throws InterruptedException {
		 cb.cb_GetShowAll();
		 cb.cb_ClicksShowAll();
		}
	

	@When("user taps on Show All button")
	public void user_taps_on_show_all_button() throws InterruptedException {
		cb.cb_GetShowAll();
		cb.cb_ClicksShowAll();
	}

	@Then("user should able to see all available reviews")
	public void user_should_able_to_see_all_available_reviews() throws InterruptedException {
		cb.cb_ScrollSwipUP(2);
		cb.cb_swipeDowns(1);
	}

	@When("user taps on Show less button")
	public void user_taps_on_show_less_button() throws InterruptedException {
		cb.cb_ClicksSeeLess();
	}

	@When("user taps on video")
	public void user_taps_on_video() throws InterruptedException {
		cb.cb_ClicksVideo();
	}

	@Then("user should able to see the video play")
	public void user_should_able_to_see_the_video_play() throws IOException, InterruptedException {
		cb.cb_screenShotInfo();
		cb.cb_screenShotInfo();
	}

	@When("user taps on Our Team memu item")
	public void user_taps_on_Our_Team_memu_item() throws InterruptedException {
		cb.cb_Tabs_Our_Team();
	}

	@Then("user should able to see {string} in the Our Team screen")
	public void user_should_able_to_see_name_in_the_Our_Team_screen(String string) throws InterruptedException {
		cb.cb_Meetthedreamers(string);
	}

	@Then("user should able to see {string} name")
	public void user_should_able_to_see_name(String string) throws InterruptedException {
		cb.cb_OurTeamsNames(string);
	}

	@Then("user should able to see note on Founder & CEO")
	public void user_should_able_to_see_note_on_founder_ceo() throws InterruptedException {
		cb.cb_FounderCEO_note();
	}
	@When("user scrolls to Founder & CEO")
	public void user_scrolls_to_Founder_CEO() throws InterruptedException {
		cb.user_scrolls_to_Founder_CEO();
	}
	@Then("user should able to see note on Co-Founder & COO")
	public void user_should_able_to_see_note_on_co_founder_coo() throws InterruptedException {
		cb.cb_CoFounderCOO_note();
	}

	@Then("user should able to see Co-Founder & CTO name")
	public void user_should_able_to_see_co_founder_cto_name() {
	}

	@Then("user should able to see note on Co-Founder & CTO")
	public void user_should_able_to_see_note_on_co_founder_cto() throws InterruptedException {
		cb.cb_CoFounderCTO_note();
	}

	@Then("user should able to see note on President")
	public void user_should_able_to_see_note_on_president() throws InterruptedException {
		cb.cb_President_note();
	}

	@Then("user should able to see note on Head - Strategic Partnerships")
	public void user_should_able_to_see_note_on_head_strategic_parnterships() throws InterruptedException {
		cb.cb_HeadStrategicPartnerships_note();
	}

	@Then("user should able to see note on Head - Sales & Operations")
	public void user_should_able_to_see_note_on_head_sales_operations() throws InterruptedException {
		cb.cb_HeadSalesOperations_note();
	}

	@Then("user should able to see Head - Strategic Initiatives name")
	public void user_should_able_to_see_head_strategic_initiatives_name() {
	}

	@Then("user should able to see note on Head - Strategic Initiatives")
	public void user_should_able_to_see_note_on_head_strategic_initiatives() throws InterruptedException {
		cb.cb_HeadStrategicInitiatives_note();
	}

	@Then("user should able to see Chief Program Officer name")
	public void user_should_able_to_see_chief_program_officer_name() throws InterruptedException {
	}

	@Then("user should able to see note on Chief Program Officer")
	public void user_should_able_to_see_note_on_chief_program_officer() throws InterruptedException {
		cb.cb_ChiefProgramOfficer_note();
	}

	@Then("user should able to see Head - Finance name")
	public void user_should_able_to_see_head_finance_name() {
	}

	@Then("user should able to see note on Head - Finance")
	public void user_should_able_to_see_note_on_head_finance() throws InterruptedException {
		cb.cb_HeadFinance_note();
	}
	
	@When("user scrolls to Our Advisors")
	public void user_scrolls_to_Our_Advisors() throws InterruptedException {
		cb.cb_OurAdvisors();
	}
	@Then("user should able to see Our Advisors name and note")
	public void user_should_able_to_see_Our_Advisors_name_and_note() throws InterruptedException {
		cb.CB_Our_Jyotsana_KrishnanName();
		cb.CB_Our_Jyotsana_KrishnanNote();
		cb.cb_Our_Advisors_Bhaskar_PramanikName();
		cb.cb_Our_Advisors_Bhaskar_PramanikNote();
		cb.cb_Our_Randy_Charles_BelcherName();
		cb.cb_Our_Randy_Charles_BelcherNote();
//		cb.CB_Our_Jyotsana_KrishnanName();
//		cb.CB_Our_Jyotsana_KrishnanNote();
//		cb.cb_DrBirenSahooName();
//		cb.cb_DrBirenSahooNote();
//		cb.cb_AshvanniSrivastavaName();
//		cb.cb_AshvanniSrivastavaNote();
//		cb.cb_DrBidhanDasName();
//		cb.cb_DrBidhanDasNote();
	}
	

//	@Then("user should able see {string} with related information")
//	public void user_should_able_see_with_related_information(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
	@When("user swipes up till Monthly General Health Care Frequency")
	public void user_swipes_up_till_Monthly_General_Health_Care_Frequency() throws InterruptedException {
		cb.swipesuptillMonthly();
	}
	@When("user taps on Monthly General Health Care Frequency")
	public void user_taps_on_Monthly_General_Health_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyMonthly();
	}
	@When("user swipes up till Quarterly General Health Care Frequency")
	public void user_swipes_up_till_Quarterly_General_Health_Care_Frequency() throws InterruptedException {
		cb.swipesuptillQuarterly();
	}
	@When("user taps on Quarterly General Health Care Frequency")
	public void user_taps_on_Quarterly_General_Health_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyQuarterly();
	}
	@When("user swipes up till Half Yearly General Health Care Frequency")
	public void user_swipes_up_till_Half_Yearly_General_Health_Care_Frequency() throws InterruptedException {
		cb.swipesuptillHalfYearly();
	}
	@When("user taps on Half Yearly General Health Care Frequency")
	public void user_taps_on_Half_Yearly_General_Health_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyHalfYearly();
	}
	@When("user swipes up till Yearly General Health Care Frequency")
	public void user_swipes_up_till_Yearly_General_Health_Care_Frequency() throws InterruptedException {
		cb.swipesuptillYearly();
	}
	@When("user taps on Yearly General Health Care Frequency")
	public void user_taps_on_Yearly_General_Health_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyYearly();
	}
	@When("user swipes up till On Demand General Health Care Frequency")
	public void user_swipes_up_till_On_Demand_General_Health_Care_Frequency() throws InterruptedException {
		cb.swipesuptillOnDemand();
	}
	@When("user taps on On Demand General Health Care Frequency")
	public void user_taps_on_On_Demand_General_Health_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyOnDemand();
	}
	
	@When("user swipes up till Monthly Diabetes Care Frequency")
	public void user_swipes_up_till_Monthly_Diabetes_Care_Frequency() throws InterruptedException {
		cb.swipesuptillMonthly();
	}
	@When("user taps on Monthly Diabetes Care Frequency")
	public void user_taps_on_Monthly_Diabetes_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyMonthly();
	}
	@When("user swipes up till Quarterly Diabetes Care Frequency")
	public void user_swipes_up_till_Quarterly_Diabetes_Care_Frequency() throws InterruptedException {
		cb.swipesuptillQuarterly();
	}
	@When("user taps on Quarterly Diabetes Care Frequency")
	public void user_taps_on_Quarterly_Diabetes_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyQuarterly();
	}
	@When("user swipes up till Half Yearly Diabetes Care Frequency")
	public void user_swipes_up_till_Half_Yearly_Diabetes_Care_Frequency() throws InterruptedException {
		cb.swipesuptillHalfYearly();
	}
	@When("user taps on Half Yearly Diabetes Care Frequency")
	public void user_taps_on_Half_Yearly_Diabetes_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyHalfYearly();
	}
	@When("user swipes up till Yearly Diabetes Care Frequency")
	public void user_swipes_up_till_Yearly_Diabetes_Care_Frequency() throws InterruptedException {
		cb.swipesuptillYearly();
	}
	@When("user taps on Yearly Diabetes Care Frequency")
	public void user_taps_on_Yearly_Diabetes_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyYearly();
	}
	@When("user swipes up till On Demand Diabetes Care Frequency")
	public void user_swipes_up_till_On_Demand_Diabetes_Care_Frequency() throws InterruptedException {
		cb.swipesuptillOnDemand();
	}
	@When("user taps on On Demand Diabetes Care Frequency")
	public void user_taps_on_On_Demand_Diabetes_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyOnDemand();
	}
	
	
	@When("user swipes up till Monthly Cardiac Care Frequency")
	public void user_swipes_up_till_Monthly_Cardiac_Care_Frequency() throws InterruptedException {
		cb.swipesuptillMonthly();
	}
	@When("user taps on Monthly Cardiac Care Frequency")
	public void user_taps_on_Monthly_Cardiac_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyMonthly();
	}
	@When("user swipes up till Quarterly Cardiac Care Frequency")
	public void user_swipes_up_till_Quarterly_Cardiac_Care_Frequency() throws InterruptedException {
		cb.swipesuptillQuarterly();
	}
	@When("user taps on Quarterly Cardiac Care Frequency")
	public void user_taps_on_Quarterly_Cardiac_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyQuarterly();
	}
	@When("user swipes up till Half Yearly Cardiac Care Frequency")
	public void user_swipes_up_till_Half_Yearly_Cardiac_Care_Frequency() throws InterruptedException {
		cb.swipesuptillHalfYearly();
	}
	@When("user taps on Half Yearly Cardiac Care Frequency")
	public void user_taps_on_Half_Yearly_Cardiac_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyHalfYearly();
	}
	@When("user swipes up till Yearly Cardiac Care Frequency")
	public void user_swipes_up_till_Yearly_Cardiac_Care_Frequency() throws InterruptedException {
		cb.swipesuptillYearly();
	}
	@When("user taps on Yearly Cardiac Care Frequency")
	public void user_taps_on_Yearly_Cardiac_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyYearly();
	}
	@When("user swipes up till On Demand Cardiac Care Frequency")
	public void user_swipes_up_till_On_Demand_Cardiac_Care_Frequency() throws InterruptedException {
		cb.swipesuptillOnDemand();
	}
	@When("user taps on On Demand Cardiac Care Frequency")
	public void user_taps_on_On_Demand_Cardiac_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyOnDemand();
	}
	
	
	
	@When("user swipes up till Monthly Ortho Care Frequency")
	public void user_swipes_up_till_Monthly_Ortho_Care_Frequency() throws InterruptedException {
		cb.swipesuptillMonthly();
	}
	@When("user taps on Monthly Ortho Care Frequency")
	public void user_taps_on_Monthly_Ortho_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyMonthly();
	}
	@When("user swipes up till Quarterly Ortho Care Frequency")
	public void user_swipes_up_till_Quarterly_Ortho_Care_Frequency() throws InterruptedException {
		cb.swipesuptillQuarterly();
	}
	@When("user taps on Quarterly Ortho Care Frequency")
	public void user_taps_on_Quarterly_Ortho_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyQuarterly();
	}
	@When("user swipes up till Half Yearly Ortho Care Frequency")
	public void user_swipes_up_till_Half_Yearly_Ortho_Care_Frequency() throws InterruptedException {
		cb.swipesuptillHalfYearly();
	}
	@When("user taps on Half Yearly Ortho Care Frequency")
	public void user_taps_on_Half_Yearly_Ortho_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyHalfYearly();
	}
	@When("user swipes up till Yearly Ortho Care Frequency")
	public void user_swipes_up_till_Yearly_Ortho_Care_Frequency() throws InterruptedException {
		cb.swipesuptillYearly();
	}
	@When("user taps on Yearly Ortho Care Frequency")
	public void user_taps_on_Yearly_Ortho_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyYearly();
	}
	@When("user swipes up till On Demand Ortho Care Frequency")
	public void user_swipes_up_till_On_Demand_Ortho_Care_Frequency() throws InterruptedException {
		cb.swipesuptillOnDemand();
	}
	@When("user taps on On Demand Ortho Care Frequency")
	public void user_taps_on_On_Demand_Ortho_Care_Frequency() throws InterruptedException {
		cb.tapsFrequencyOnDemand();
	}
	
	@When("user swipes up till Monthly Women's Health Frequency")
	public void user_swipes_up_till_Monthly_Womens_Health_Frequency() throws InterruptedException {
		cb.swipesuptillMonthly();
	}
	@When("user taps on Monthly Women's Health Frequency")
	public void user_taps_on_Monthly_Womens_Health_Frequency() throws InterruptedException {
		cb.tapsFrequencyMonthly();
	}
	@When("user swipes up till Quarterly Women's Health Frequency")
	public void user_swipes_up_till_Quarterly_Womens_Health_Frequency() throws InterruptedException {
		cb.swipesuptillQuarterly();
	}
	@When("user taps on Quarterly Women's Health Frequency")
	public void user_taps_on_Quarterly_Womens_Health_Frequency() throws InterruptedException {
		cb.tapsFrequencyQuarterly();
	}
	@When("user swipes up till Half Yearly Women's Health Frequency")
	public void user_swipes_up_till_Half_Yearly_Womens_Health_Frequency() throws InterruptedException {
		cb.swipesuptillHalfYearly();
	}
	@When("user taps on Half Yearly Women's Health Frequency")
	public void user_taps_on_Half_Yearly_Womens_Health_Frequency() throws InterruptedException {
		cb.tapsFrequencyHalfYearly();
	}
	@When("user swipes up till Yearly Women's Health Frequency")
	public void user_swipes_up_till_Yearly_Womens_Health_Frequency() throws InterruptedException {
		cb.swipesuptillYearly();
	}
	@When("user taps on Yearly Women's Health Frequency")
	public void user_taps_on_Yearly_Womens_Health_Frequency() throws InterruptedException {
		cb.tapsFrequencyYearly();
	}
	@When("user swipes up till On Demand Women's Health Frequency")
	public void user_swipes_up_till_On_Demand_Womens_Health_Frequency() throws InterruptedException {
		cb.swipesuptillOnDemand();
	}
	@When("user taps on On Demand Women's Health Frequency")
	public void user_taps_on_On_Demand_Womens_Health_Frequency() throws InterruptedException {
		cb.tapsFrequencyOnDemand();
	}
	
	@When("user swipes up till {string} General Health Care Frequency")
	public void user_swipes_up_till_general_health_care_frequency(String string) throws InterruptedException {
		cb.swipesuptillGeneralHealthCareFrequency(string);
	}
	
	@When("user taps on {string} General Health Care Frequency")
	public void user_taps_on_general_health_care_frequency(String string) throws InterruptedException {
		cb.tapsGeneralHealthCareFrequency(string);
	}

	@Then("user should able to see {string} with short note")
	public void user_should_able_to_see_with_short_note(String string) throws InterruptedException {
		cb.usershouldabletoseeHealthCareFrequencywithshortnote(string);
	}


	@When("swipes up till {string} Diabetes Care Frequency")
	public void swipes_up_till_diabetes_care_frequency(String string) throws InterruptedException {
		cb.swipesuptillDiabetesCareFrequency(string);
	}

	@When("user taps on {string} Diabetes Care Frequency")
	public void user_taps_on_diabetes_care_frequency(String string) throws InterruptedException {
		cb.tapsDiabetesCareFrequency(string);
	}

	@When("user swipes up till {string} Diabetes Care Frequency")
	public void user_swipes_up_till_diabetes_care_frequency(String string) throws InterruptedException {
		cb.swipesuptillDiabetesCareFrequency(string);
	}
	
	@Then("user should able see General Health with related information")
	public void user_should_able_see_General_Health_with_related_information() throws InterruptedException {
		cb.user_should_able_see_General_Health_with_related_information();
	}
	@Then("user should able to see Cardiac Care with related information")
	public void user_should_able_to_see_Cardiac_Care_with_related_information() throws InterruptedException {
		cb.user_should_able_to_see_Cardiac_Care_with_related_information();
	}
	@Then("user should able to see Diabetes Care with related information")
	public void user_should_able_to_see_Diabetes_Care_with_related_information() throws InterruptedException {
		cb.user_should_able_to_see_Diabetes_Care_with_related_information();
	}
	@Then("user should able to see Ortho Care with related information")
	public void user_should_able_to_see_Ortho_Care_with_related_information() throws InterruptedException {
		cb.user_should_able_to_see_Ortho_Care_with_related_information();
	}
	@Then("user should able to see Womens' Health with related information")
	public void user_should_able_to_see_Womens_Health_with_related_information() throws InterruptedException {
		cb.user_should_able_to_see_Womens_Health_with_related_information();
	}
	
	
//	@Then("user should able see {string} with related information")
//	public void user_should_able_see_with_related_information(String string) throws InterruptedException {
//		cb.cb_userseeCareplansrelatedinformation(string);
//	}
	

	@When("user taps on {string} Cardiac Care Frequency")
	public void user_taps_on_cardiac_care_frequency(String string) throws InterruptedException {
		cb.tapsCardiacCareFrequency(string);
	}

	@When("user swipes up till {string} Cardiac Care Frequency")
	public void user_swipes_up_till_cardiac_care_frequency(String string) throws InterruptedException {
		cb.swipesuptillCardiacCareFrequency(string);
	}

	@When("user taps on Articles menu item")
	public void user_taps_on_Articles_menu_item() throws InterruptedException {
		cb.cb_Tab_Articles();
	}
	@Then("user should able to see Take a glimpse at our accomplishments.")
	public void user_should_able_to_see_Take_a_glimpse_at_our_accomplishments() {
		cb.cb_Take_a_glimpse_at_our_accomplishments();
	}
	@Then("user should able to see Take a look at our eClinic facility.")
	public void user_should_able_to_see_in_articles_screen() {
		cb.cb_TakealookatoureClinicfacility();
	}

	@Then("user should able to see Image is defaultly selected")
	public void user_should_able_to_see_image_is_defaultly_selected() {
	}

	@Then("user should able to see Images of Articles")
	public void user_should_able_to_see_images_of_articles() throws InterruptedException {
		cb.cb_Text_Image("Image");
	}

	@When("user taps on the Image in Articles screen")
	public void user_taps_on_the_image_in_Articles_screen() throws InterruptedException {
		cb.cb_any_Image_Articles();
	}

	@Then("user should able to see Article")
	public void user_should_able_to_see_article() throws IOException, InterruptedException {
		cb.cb_screenShotInfo();
		cb.cb_swipeUp(2);
		cb.cb_swipeDowns(2);
	}

	@When("user navigates back to the Articles screen")
	public void user_navigates_back_to_the_articles_screen() {
		cb.navigatesback();
	}

	@Then("user should able to see {string} Articles screen")
	public void user_should_able_to_see_articles_screen(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("user should able to see Video")
	public void user_should_able_to_see_video() {
		cb.cb_Text_Video("Video");
	}

	@When("user taps on Video in Articles screen")
	public void user_taps_on_video_in_Articles_screen() throws InterruptedException {
		cb.cb_Video();
	}

	@Then("user should able to see Videos")
	public void user_should_able_to_see_videos() throws IOException, InterruptedException {
		cb.cb_screenShotInfo();
		cb.cb_swipeUp(2);
		cb.cb_swipeDowns(2);
	}

	@When("user taps on any video")
	public void user_taps_on_any_video() throws InterruptedException {
		cb.cb_any_Video();
	}

	@Then("user should able to see video play")
	public void user_should_able_to_see_video_play() throws IOException, InterruptedException {
		cb.cb_screenShotInfo();
	}

	@When("user swipes up till {string} Ortho Care Frequency")
	public void user_swipes_up_till_ortho_care_frequency(String string) throws InterruptedException {
		cb.swipesuptillOrthoCareFrequency(string);
	}

	@When("user taps on {string} Ortho Care Frequency")
	public void user_taps_on_ortho_care_frequency(String string) throws InterruptedException {
		cb.tapsOrthoCareFrequency(string);
	}
	@When("user swipes up till {string} Women's Health Frequency")
	public void user_swipes_up_till_women_s_health_frequency(String string) throws InterruptedException {
		cb.swipesuptillWomensHealthCareFrequency(string);
	}

	@When("user taps on {string} Women's Health Frequency")
	public void user_taps_on_women_s_health_frequency(String string) throws InterruptedException {
		cb.tapsWomensHealthCareFrequency(string);
	}
	@When("user taps on profile icon")
	public void user_taps_on_profile_icon() {
		cb.cb_Clicks_Profile_icon();
	}
	

	@Then("user should able to see My Profile Screen")
	public void user_should_able_to_see_my_profile_screen() {
		cb.cb_Text_My_Profile();
	}

	@Then("user should able to see My Details")
	public void user_should_able_to_see_my_details() {
		cb.cb_Text_My_Details();
	}

	@Then("user should able to see My Plans")
	public void user_should_able_to_see_my_plans() {
		cb.cb_Text_My_Plans();
	}

	@Then("user should able to see Health Records")
	public void user_should_able_to_see_health_records() {
		cb.cb_Text_Health_Records();
	}

	@Then("user should able to see Review")
	public void user_should_able_to_see_Review() {
		cb.cb_Text_Review();
	}

	@Then("user should able to see Manage Profile")
	public void user_should_able_to_see_manage_profile() {
		cb.cb_Text_Manage_Profile();
	}

	@Then("user should able to see Change Password")
	public void user_should_able_to_see_change_password() {
		cb.cb_Text_Change_Password();
	}

	@Then("user should able to see Sign Out")
	public void user_should_able_to_see_sign_out() {
		cb.cb_Text_Sign_Out();
	}

	@When("user taps on close icon")
	public void user_taps_on_close_icon() {
		cb.cb_click_Profile_close_icon();
	}
	@When("user taps on My Details")
	public void user_taps_on_My_Details() {
		cb.cb_Clicks_My_Details();
	}
	
	@Then("user should able to see Details Screen")
	public void user_should_able_to_see_details_screen() {
		cb.cb_Text_Details();
	}

	@Then("user should able to Personal Details")
	public void user_should_able_to_personal_details() {
		cb.cb_Text_Personal_Details();
	}

	@Then("user should able to Contact Deatils")
	public void user_should_able_to_contact_deatils() {
		cb.cb_Text_Contact_Details();
	}
	
	


	@Then("user should able to see previous in Screen")
	public void user_should_able_to_see_previous_in_screen() {
		cb.cb_Text_Dashboard();
	}
	@When("user taps on Health Records")
	public void user_taps_on_health_records() {
		cb.cb_Clicks_Health_Records();
	}
	@When("user taps on My Plans")
	public void user_taps_on_My_Plans() {
		cb.cb_Clicks_My_Plans();
	}

	@Then("user should able to see My Prescription")
	public void user_should_able_to_see_my_prescription() {
		cb.cb_Text_My_Prescription();
	}

	@When("user taps on My Prescription")
	public void user_taps_on_my_prescription() {
		cb.cb_Clicks_My_Prescription();
	}
	@Then("user should able to see My Lab Reports")
	public void user_should_able_to_see_my_lab_reports() {
		cb.cb_Text_Profile_My_Lab_Reports();
	}

	@When("user taps on My Lab Reports")
	public void user_taps_on_my_lab_reports() {
		cb.cb_Clicks_Profile_My_Lab_Reports();
	}

	@Then("user should able to see Lab Reports")
	public void user_should_able_to_see_lab_reports() {
		cb.cb_Text_Profile_Lab_Reports();
	}

	@Then("user should able to see Health Records Screen")
	public void user_should_able_to_see_health_records_screen() {
		cb.cb_Text_Health_Records();
	}

	@Then("user should able to see Prescription")
	public void user_should_able_to_see_prescription() {
		cb.cb_Text_Prescription();
	}


	@Then("user should able to see symptoms in the prescription")
	public void user_should_able_to_see_symptoms_in_the_prescription() {
		cb.cb_Text_Health_Records_Symptoms();
	}

	

	@Then("user should able to see Any Allergy")
	public void user_should_able_to_see_any_allergy() {
		cb.cb_Text_Health_Records_Any_Allergy();
	}

	@Then("user should able to see Consultation Date")
	public void user_should_able_to_see_consultation_date() {
		cb.cb_Text_Health_Records_Consultation_Date();
	}

	@Then("user should able to see Next Consultation Date")
	public void user_should_able_to_see_next_consultation_date() {
		cb.cb_Text_Health_Records_Next_Consultation_Date();
	}

	@When("user taps on View Prescription link")
	public void user_taps_on_view_prescription_link() throws InterruptedException {
		cb.cb_clcks_Health_Records_View_Prescription();
	}

	@Then("user should able to see the prescription details")
	public void user_should_able_to_see_the_prescription_details() {
		cb.cb_Health_Records_View_Prescription_Regn_No();
	}

	@When("user taps on Download prescription")
	public void user_taps_on_download_prescription() throws InterruptedException {
		cb.cb_Download_Prescription();
	}
	@When("user taps on Copy to and choose file and taps on Paste")
	public void user_taps_on_Copy_to_and_choose_file_and_taps_on_Paste() throws InterruptedException {
		cb.cb_Copy_to();
		cb.cb_Copy_to_file_choose();
		cb.cb_Copy_to_file_choose_paste_confirm();
		cb.cb_Attention_OK();
	}
	@Then("user should able to see prescription file")
	public void user_should_able_to_see_downloaded_prescription_file() throws IOException, InterruptedException {
		//cb.cb_prescription_pdf();
	}
	
	@Then("user should able to see My Vitals")
	public void user_should_able_to_see_my_vitals() {
		cb.cb_Text_My_Vitals();
	}

	@When("user taps on My Vitals")
	public void user_taps_on_my_vitals() {
		cb.cb_Clicks_My_Vitals();
	}

	@Then("user should able to see Your Vitals")
	public void user_should_able_to_see_your_vitals() {
		cb.cb_Text_Your_Vitals();
	}

	@Then("user should able to see Temperature")
	public void user_should_able_to_see_temperature() throws InterruptedException {
		cb.cb_Temperature();
	}

	@Then("user should able to see Temperature {string} and Last Updated")
	public void user_should_able_to_see_temperature_and_last_updated(String string) throws InterruptedException {
		cb.cb_Temperature_NormaleRange();
		cb.cb_Temperature_LastUpadated();
	}

	@Then("user should able to see HeartRate")
	public void user_should_able_to_see_heart_rate() throws InterruptedException {
		cb.cb_HeartRate();
	}

	@Then("user should able to see HeartRate {string} and Last Updated")
	public void user_should_able_to_see_heart_rate_and_last_updated(String string) throws InterruptedException {
		cb.cb_HeartRate_NormaleRange();
		cb.cb_HeartRate_LastUpadated();
	}

	@Then("user should able to see SPo2")
	public void user_should_able_to_see_s_po2() throws InterruptedException {
		cb.cb_SPo2();
	}

	@Then("user should able to see SPo2 {string} and Last Updated")
	public void user_should_able_to_see_s_po2_and_last_updated(String string) throws InterruptedException {
		cb.cb_SPo2_NormaleRange();
		cb.cb_SPo2_LastUpadated();
	}

	@Then("user should able to see Triglycerides")
	public void user_should_able_to_see_triglycerides() throws InterruptedException {
		cb.cb_Triglycerides();
	}

	@Then("user should able to see Triglycerides {string} and Last Updated")
	public void user_should_able_to_see_triglycerides_and_last_updated(String string) throws InterruptedException {
		cb.cb_Triglycerides_NormaleRange();
		cb.cb_Triglycerides_LastUpadated();
	}

	@When("swipes the screen to Diastolic")
	public void swipes_the_screen_to_diastolic() throws InterruptedException {
		cb.cb_Diastolic();
	}

	@Then("user should able to see Diastolic {string} and Last Updated")
	public void user_should_able_to_see_diastolic_and_last_updated(String string) throws InterruptedException {
		cb.cb_Diastolic_NormaleRange();
		cb.cb_Diastolic_LastUpadated();
	}

	@When("swipes the screen to Weight")
	public void swipes_the_screen_to_weight() throws InterruptedException {
		cb.cb_Weight();
	}

	@Then("user should able to see Weight {string} and Last Updated")
	public void user_should_able_to_see_weight_and_last_updated(String string) throws InterruptedException {
		cb.cb_Weight_NormaleRange();
		cb.cb_Weight_LastUpadated();
	}

	@When("swipes the screen to BP")
	public void swipes_the_screen_to_bp() throws InterruptedException {
		cb.cb_BP();
	}

	@Then("user should able to see BP {string} and Last Updated")
	public void user_should_able_to_see_bp_and_last_updated(String string) throws InterruptedException {
		cb.cb_BP_NormaleRange();
		cb.cb_BP_LastUpadated();
	}

	@When("swipes the screen to HDL")
	public void swipes_the_screen_to_hdl() throws InterruptedException {
		cb.cb_HDL();
	}

	@Then("user should able to see HDL {string} and Last Updated")
	public void user_should_able_to_see_hdl_and_last_updated(String string) throws InterruptedException {
		cb.cb_HDL_NormaleRange();
		cb.cb_HDL_LastUpadated();
	}

	@When("swipes the screen to BloodGlucose")
	public void swipes_the_screen_to_blood_glucose() throws InterruptedException {
		cb.cb_BloodGlucose();
	}

	@Then("user should able to see BloodGlucose {string} and Last Updated")
	public void user_should_able_to_see_blood_glucose_and_last_updated(String string) throws InterruptedException {
		cb.cb_BloodGlucose_NormaleRange();
		cb.cb_BloodGlucose_LastUpadated();
	}

	@When("swipes the screen to LDL")
	public void swipes_the_screen_to_ldl() throws InterruptedException {
		cb.cb_LDL();
	}

	@Then("user should able to see LDL {string} and Last Updated")
	public void user_should_able_to_see_ldl_and_last_updated(String string) throws InterruptedException {
		cb.cb_LDL_NormaleRange();
		cb.cb_LDL_LastUpadated();
	}

	@When("swipes the screen to Systolic")
	public void swipes_the_screen_to_systolic() throws InterruptedException {
		cb.cb_Systolic();
	}

	@Then("user should able to see Systolic {string} and Last Updated")
	public void user_should_able_to_see_systolic_and_last_updated(String string) throws InterruptedException {
		cb.cb_Systolic_NormaleRange();
		cb.cb_Systolic_LastUpadated();
	}

	@When("swipes the screen to PulseRate")
	public void swipes_the_screen_to_pulse_rate() throws InterruptedException {
		cb.cb_PulseRate();
	}

	@Then("user should able to see PulseRate {string} and Last Updated")
	public void user_should_able_to_see_pulse_rate_and_last_updated(String string) throws InterruptedException {
		cb.cb_PulseRate_NormaleRange();
		cb.cb_PulseRate_LastUpadated();
	}

	@When("swipes the screen to Height")
	public void swipes_the_screen_to_height() throws InterruptedException {
		cb.cb_Height();
	}

	@Then("user should able to see Height {string} and Last Updated")
	public void user_should_able_to_see_height_and_last_updated(String string) throws InterruptedException {
		cb.cb_Height_NormaleRange();
		cb.cb_Height_LastUpadated();
	}

	@When("swipes the screen to TotalCholesterol")
	public void swipes_the_screen_to_total_cholesterol() throws InterruptedException {
		cb.cb_TotalCholesterol();
	}

	@Then("user should able to see TotalCholesterol {string} and Last Updated")
	public void user_should_able_to_see_total_cholesterol_and_last_updated(String string) throws InterruptedException {
		cb.cb_TotalCholesterol_NormaleRange();
		cb.cb_TotalCholesterol_LastUpadated();
	}

	@When("swipes the screen to RespirationRate")
	public void swipes_the_screen_to_respiration_rate() throws InterruptedException {
		cb.cb_RespirationRate();
	}

	@Then("user should able to see RespirationRate {string} and Last Updated")
	public void user_should_able_to_see_respiration_rate_and_last_updated(String string) throws InterruptedException {
		cb.cb_RespirationRate_NormaleRange();
		cb.cb_RespirationRate_LastUpadated();
	}

	@When("swipes the screen to BMI")
	public void swipes_the_screen_to_bmi() throws InterruptedException {
		cb.cb_BMI();
	}

	@Then("user should able to see BMI {string} and Last Updated")
	public void user_should_able_to_see_bmi_and_last_updated(String string) throws InterruptedException {
		cb.cb_BMI_NormaleRange();
		cb.cb_BMI_LastUpadated();
	}
	
	@When("user taps on Review")
	public void user_taps_on_Review() {
		cb.cb_Clicks_Review();
	}
	
	@Then("user should able to see Review Screen")
	public void user_should_able_to_see_Review_Screen() {
		cb.cb_Text_Review();
	}
	
	@Then("user should able to Please Share your feedback")
	public void user_should_able_to_Please_Share_your_feedback() {
		cb.cb_CB_Please_share_your_feedback();
	}

	@When("user selects relavent rating individually for all questions")
	public void user_selects_relavent_rating_individually_for_all_questions() throws InterruptedException {
		cb.cb_Text_Question1();
		cb.cb_clicks_Question1_Points();
		cb.cb_Text_Question2();
		cb.cb_clicks_Question2_Points();
		cb.cb_Text_Question3();
		cb.cb_clicks_Question3_Points();
		cb.cb_Text_Question4();
		cb.cb_clicks_Question4_Points();
	}
	
	@When("user entered valid feedback text in feedback text box")
	public void user_entered_valid_feedback_text_in_feedback_text_box() throws InterruptedException {
		cb.cb_Text_Question5();
		cb.cb_Question5_feedBack();
	}
	
	@Then("user should able to see Question1")
	public void user_should_able_to_see_question1() throws InterruptedException {
		cb.cb_Text_Question1();
	}

	@When("user clicks on points related Question1")
	public void user_clicks_on_points_related_question1() {
		cb.cb_clicks_Question1_Points();
	}

	@When("user should able to see Question1 selected point")
	public void user_should_able_to_see_question1_selected_point() {
	}

	@When("user should able to see Question2")
	public void user_should_able_to_see_question2() throws InterruptedException {
		cb.cb_Text_Question2();
	}

	@When("user clicks on points related Question2")
	public void user_clicks_on_points_related_question2() {
		cb.cb_clicks_Question2_Points();
	}

	@When("user should able to see Question2 selected point")
	public void user_should_able_to_see_question2_selected_point() {
	}

	@When("user should able to see Question3")
	public void user_should_able_to_see_question3() throws InterruptedException {
		cb.cb_Text_Question3();
	}

	@When("user clicks on points related Question3")
	public void user_clicks_on_points_related_question3() {
		cb.cb_clicks_Question3_Points();
	}

	@When("user should able to see Question3 selected point")
	public void user_should_able_to_see_question3_selected_point() {
	}

	@When("user should able to see Question4")
	public void user_should_able_to_see_question4() throws InterruptedException {
		cb.cb_Text_Question4();
	}

	@When("user clicks on points related Question4")
	public void user_clicks_on_points_related_question4() throws InterruptedException {
		cb.cb_clicks_Question4_Points();
	}

	@When("user should able to see Question5")
	public void user_should_able_to_see_question5() throws InterruptedException {
		cb.cb_Text_Question5();
	}

	@When("user enter your feedback")
	public void user_enter_your_feedback() throws InterruptedException {
		cb.cb_Question5_feedBack();
	}

	@When("user clicks on Submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
		cb.cb_Clicks_CB_Submit();
	}

	@Then("user should able to see Review Added Successfully")
	public void user_should_able_to_see_review_added_successfully() {
		cb.cb_Review_Added_Successfully();
	}
//	@When("user clicks on OK button")
//	public void user_clicks_on_OK_button() {
//		cb.cb_Clicks_OK();
//	}
	@Then("user backs to review screen")
	public void user_backs_to_review_screen() {
	}
	
	
	
	@When("user taps on dropdown related to select Patient Name")
	public void user_taps_on_dropdown_related_to_select_patient_name() {
		cb.cb_dropdown_related_to_select_Patient_Name();
	}

	@When("user taps on patient Name")
	public void user_taps_on_patient_name() {
		cb.cb_select_related_to_select_Patient_Name();
	}

	@Then("user should able to see related to patient details")
	public void user_should_able_to_see_related_to_patient_details() {
	
	}
	
	@When("user taps on radio button related the care plans")
	public void user_taps_on_radio_button_related_the_care_plans() {
		cb.cb_select_RadioButton1();
	}

	@Then("user should able to see Validity Left days and Renewal Date")
	public void user_should_able_to_see_validity_left_days_and_renewal_date() {
		cb.cb_Text_Validity_Left();
		cb.cb_Text_Renewal_Date();
		
	}

	@When("user taps on Pre screening and selection of right care package")
	public void user_taps_on_pre_screening_and_selection_of_right_care_package() throws InterruptedException {
		cb.cb_ClicksPrescreeningandselectionofrightcarepackage();
	}

	@Then("user should able to see Pre screening and selection of right care package with short note")
	public void user_should_able_to_see_pre_screening_and_selection_of_right_care_package_with_short_note() throws InterruptedException {
		cb.cb_text_MyPlan_Prescreeningandselectionofrightcarepackagenote();
	}

	@When("user taps on Detailed baseline evaluation and care Nurse")
	public void user_taps_on_detailed_baseline_evaluation_and_care_nurse() throws InterruptedException {
		cb.cb_Clicks_DetailedbaselineevaluationcareNurse();
	}

	@Then("user should able to see Detailed baseline evaluation & care - Nurse with short note")
	public void user_should_able_to_see_detailed_baseline_evaluation_care_nurse_with_short_note() throws InterruptedException {
		cb.cb_text_MyPlan_DetailedbaselineevaluationcareNursenote();
	}

	@When("user taps on Detailed baseline evaluation & care - Lab test")
	public void user_taps_on_Detailed_baseline_evaluation_care_Lab_test() throws InterruptedException {
		cb.cb_Clicks_DetailedbaselineevaluationcareLabtest();
	}
	@Then("user should able to see Detailed baseline evaluation & care - Lab test with short note")
	public void user_should_able_to_see_Detailed_baseline_evaluation_care_Lab_test_with_short_note() throws InterruptedException {
		cb.cb_text_MyPlan_DetailedbaselineevaluationcareLabtestnote();
	}

	

	@When("user taps on Complete health review & care by physician")
	public void user_taps_on_complete_health_review_care_by_physician() throws InterruptedException {
		cb.cb_Clicks_Completehealthreviewcarebyphysician();
	}

	@Then("user should able to see Complete health review & care by physician with short note")
	public void user_should_able_to_see_complete_health_review_care_by_physician_with_short_note() throws InterruptedException {
		cb.cb_MyPlan_Completehealthreviewcarebyphysician();
	}

	@When("user taps on Speciality care and referral")
	public void user_taps_on_speciality_care_and_referral() throws InterruptedException {
		cb.cb_Clicks_Specialitycareandreferral();
	}

	@Then("user should able to see Speciality care and referral with short note")
	public void user_should_able_to_see_speciality_care_and_referral_with_short_note() throws InterruptedException {
		cb.cb_MyPlan_Specialitycareandreferral();
	}

	@When("user taps on Periodic calls for health assessment")
	public void user_taps_on_periodic_calls_for_health_assessment() throws InterruptedException {
		cb.cb_Clicks_Periodiccallsforhealthassessment();
	}

	@Then("user should able to see Periodic calls for health assessment with short note")
	public void user_should_able_to_see_periodic_calls_for_health_assessment_with_short_note() throws InterruptedException {
		cb.cb_MYplan_Periodiccallsforhealthassessment();
	}

	@When("user taps on Paramedical care")
	public void user_taps_on_paramedical_care() throws InterruptedException {
		cb.cb_Clicks_Paramedicalcare();
	}

	@Then("user should able to see Paramedical care with short note")
	public void user_should_able_to_see_paramedical_care_with_short_note() throws InterruptedException {
		cb.cb_MyPlan_text_Paramedicalcare();
	}

	@When("user taps on Full health check-up and care")
	public void user_taps_on_full_health_check_up_and_care() throws InterruptedException {
		cb.cb_clicks_Fullhealthcheckupandcare();
	}

	@Then("user should able to see Full health check-up and care with short note")
	public void user_should_able_to_see_full_health_check_up_and_care_with_short_note() throws InterruptedException {
		cb.cb_MyPlan_Fullhealthcheckupandcare();
	}

	@When("user taps on 6monthly lab tests")
	public void user_taps_on_6monthly_lab_tests() throws InterruptedException {
		cb.cb_6monthlylabtests();
	}

	@Then("user should able to see {int} monthly lab tests with short note")
	public void user_should_able_to_see_monthly_lab_tests_with_short_note(Integer int1) throws InterruptedException {
		cb.cb_Myplan_6monthlylabtests();
	}

	@When("user taps on Detailed final check-up & care")
	public void user_taps_on_detailed_final_check_up_care() throws InterruptedException {
		cb.cb_Detailedfinalcheckupcare();
	}

	@Then("user should able to see Detailed final check-up & care with short note")
	public void user_should_able_to_see_detailed_final_check_up_care_with_short_note() throws InterruptedException {
		cb.cb_MyPlan_Detailedfinalcheckupcare();
	}

	@When("user taps on Annual outcome")
	public void user_taps_on_annual_outcome() throws InterruptedException {
		cb.cb_Annualoutcome();
	}

	@Then("user should able to see Annual outcome with short note")
	public void user_should_able_to_see_annual_outcome_with_short_note() throws InterruptedException {
		cb.cb_MyPlanAnnualoutcome();
	}
	@When("user taps on Manage Profile")
	public void user_taps_on_Manage_Profile() throws InterruptedException {
		cb.cb_clicks_CB_Manage_Profile();
	}
	@When("user taps on Add Member button")
	public void user_taps_on_Add_Member_button() throws InterruptedException {
		cb.cb_clicks_CB_Add_Member();
	}
	
	@Then("user should able to see See Profiles")
	public void user_should_able_to_see_See_Profiles() throws InterruptedException {
		cb.cb_CB_See_Profiles();
	}
	
	@Then("user should able to see Profile name")
	public void user_should_able_to_see_Profile_name() throws InterruptedException {
		cb.cb_See_Father_sir();
	}
	@Then("user should able to see Patient id")
	public void user_should_able_to_see_Patient_id() throws InterruptedException {
		cb.cb_SPatient_Id_13079();
	}
	@Then("user should able to see Gender")
	public void user_should_able_to_see_Gender() throws InterruptedException {
		cb.cb_GenderMale();
	}
	@Then("user should able to see Relation")
	public void user_should_able_to_see_Relation() throws InterruptedException {
		cb.cb_RelationFather();
	}
	@Then("user should able to see Blood group")
	public void user_should_able_to_see_Blood_group() throws InterruptedException {
		cb.cb_BloodgroupA_N();
	}
	@Then("user should able to see DOB")
	public void user_should_able_to_see_DOB() throws InterruptedException {
		cb.cb_DOB21071964();
	}
	@Then("user should able to see Package Name")
	public void user_should_able_to_see_Package_Name() throws InterruptedException {
		cb.cb_PackageNames();
	}
	@When("user taps on profile menu")
	public void user_taps_on_profile_menu() throws InterruptedException {
		cb.cb_viewthreedots();
	}
	@Then("user should able to see View")
	public void user_should_able_to_see_View() throws InterruptedException {
		cb.cb_Text_view();
	}
	@When("user taps on View link")
	public void user_taps_on_View_link() throws InterruptedException {
		cb.cb_Click_view();
	}
	@Then("user should able to see Manage Profile Edit page")
	public void user_should_able_to_see_Manage_Profile_Edit_page() throws InterruptedException {
		cb.cb_text_Edit();
	}
	@Then("user should able to see Details")
	public void user_should_able_to_see_Details() throws InterruptedException {
		cb.cb_text_Details();
	}
	@Then("user should able to see Profiles name")
	public void user_should_able_to_see_Profiles_name() throws InterruptedException {
		cb.cb_See_Father();
	}
	@Then("user should able to see ID Number")
	public void user_should_able_to_see_ID_Number() throws InterruptedException {
		cb.cb_See_Father();
	}
	@Then("user should able to see Edit button")
	public void user_should_able_to_see_Edit_button() throws InterruptedException {
		cb.cb_text_Edit();
	}
	@Then("user should able to see Personal Details")
	public void user_should_able_to_see_Personal_Details() throws InterruptedException {
		cb.cb_Personal_Details();
	}
	@Then("user should able to see Profile Details")
	public void user_should_able_to_see_Profile_Details() throws InterruptedException {
		cb.cb_Profile_Details();
	}
	@Then("user should able to see Salutation")
	public void user_should_able_to_see_Salutation() throws InterruptedException {
		cb.cb_Salutation();
		cb.cb_SalutationData();
	}
	@Then("user should able to see First Name")
	public void user_should_able_to_see_First_Name() throws InterruptedException {
		cb.cb_FirstName();
		cb.cb_FirstNameData();
	}
	@Then("user should able to see Last Name")
	public void user_should_able_to_see_Last_Name() throws InterruptedException {
		cb.cb_LastName();
		cb.cb_LastNameData();
	}
	@Then("user should able to see Genders")
	public void user_should_able_to_see_Genders() throws InterruptedException {
		cb.cb_Gender();
		cb.cb_GenderData();
	}
	@Then("user should able to see Mobile Number")
	public void user_should_able_to_see_Mobile_Number() throws InterruptedException {
		cb.cb_MobileNumber();
		cb.cb_MobileNumberData();
	}
	@Then("user should able to see Relations")
	public void user_should_able_to_see_Relations() throws InterruptedException {
		cb.cb_Relation();
		cb.cb_RelationData();
	}
	@Then("user should able to see Date of Birth")
	public void user_should_able_to_see_Date_of_Birth() throws InterruptedException {
		cb.cb_DateofBirth();
		cb.cb_DateofBirthData();
	}
	@Then("user should able to see Blood Group")
	public void user_should_able_to_see_Blood_Group() throws InterruptedException {
		cb.cb_BloodGroup();
		cb.cb_BloodGroupData();
	}
	@Then("user should able to see Email")
	public void user_should_able_to_see_Email() throws InterruptedException {
		cb.cb_Email();
		cb.cb_EmailData();
	}
	@Then("user should able to see Age")
	public void user_should_able_to_see_Age() throws InterruptedException {
		cb.cb_Age();
		cb.cb_AgeData();
	}
	@Then("user should able to see Contact Details")
	public void user_should_able_to_see_Contact_Details() throws InterruptedException {
		cb.cb_Contact_Details();
	}
	@Then("user should able to see House No Street Name")
	public void user_should_able_to_see_House_No_Street_Name() throws InterruptedException {
		cb.cb_HouseNoStreetName();
		cb.cb_HouseNoStreetNameData();
	}
	
	@Then("user should able to see Pincode")
	public void user_should_able_to_see_Pincode() throws InterruptedException {
		cb.cb_Pincode();
		cb.cb_PincodeData();
	}
	@Then("user should able to see Address")
	public void user_should_able_to_see_Address() throws InterruptedException {
		cb.cb_Address();
		cb.cb_AddressData();
	}
	@Then("user should able to see City")
	public void user_should_able_to_see_City() throws InterruptedException {
		cb.cb_Citys();
		cb.cb_CitysData();
	}
	@Then("user should able to see State")
	public void user_should_able_to_see_State() throws InterruptedException {
		cb.cb_States();
		cb.cb_StatesData();
	}
	@Then("user should able to see Profiles")
	public void user_should_able_to_see_Profiles() throws InterruptedException {
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Then("user shouold able to see Family Detalis")
	public void user_shouold_able_to_see_Family_Detalis() throws InterruptedException {
		cb.user_shouold_able_to_see_Family_Detalis();
	}
	
	
	@When("user taps on add to cart icon")
	public void user_taps_on_add_to_cart_icon() throws InterruptedException {
		cb.user_taps_on_add_to_cart_icon();
	}

	@Then("user should able to see choose health care plans")
	public void user_should_able_to_see_choose_health_care_plans() {
		cb.cb_Choose_health_care_plan_for_your_family_member();
	}

	@Then("user should able to see General Health Care details")
	public void user_should_able_to_see_general_health_care_details() {
		cb.user_should_able_to_see_general_health_care_details();
	}
	@Then("user should able to see Diabetes Care details")
	public void user_should_able_to_see_Diabetes_Care_details() {
		cb.user_should_able_to_see_Diabetes_Care_details();
	}
	@Then("user should able to see Cardiac Care details")
	public void user_should_able_to_see_Cardiac_Care_details() {
		cb.user_should_able_to_see_Cardiac_Care_details();
	}
	@When("user select the General Health care")
	public void user_select_the_general_health_care() {
		cb.user_select_the_general_health_care();
	}
	@When("user select the Diabetes Care")
	public void user_select_the_Diabetes_Care() {
		cb.user_select_the_Diabetes_Care();
	}
	@When("user select the Cardiac Care")
	public void user_select_the_Cardiac_Care() {
		cb.user_select_the_Cardiac_Care();
	}
	@When("user taps on Next button")
	public void user_taps_on_next_button() throws InterruptedException {
		cb.cb_Clicks_btn_Next();
	}

	@Then("user should able to see Your Cart")
	public void user_should_able_to_see_your_cart() {
		cb.cb_text_YourCart();
	}

	@When("user taps on the dropdown button")
	public void user_taps_on_the_dropdown_button() {
		cb.cb_YourCart_DropDown();
	}

	@When("user taps on the related family person")
	public void user_taps_on_the_related_family_person() {
		cb.cb_select_related_to_select_Patient_Name();
	}

	@When("user select payment option Monthly or One Time {string}")
	public void user_select_payment_option_monthly_or_one_time(String string) throws InterruptedException {
		cb.cb_SelectPaymentOption();
		cb.user_select_payment_option_monthly_or_one_time(string);
		
	}

	@When("user select the effective start Date")
	public void user_select_the_effective_start_date() {
	}

	@When("user taps on the Checkout button")
	public void user_taps_on_the_checkout_button() {
		cb.cb_Checkout();
	}
	
	@Then("user should able to see Your Order and details")
	public void user_should_able_to_see_Your_Order_and_details() {
		cb.cb_Your_order();
		cb.cb_Your_order_List();
	}
	@When("user taps on Proceed To Checkout")
	public void user_taps_on_Proceed_To_Checkout() {
		cb.cb_Proceed_To_Checkout();
	}
	@Then("user should abel to see Add your billing address")
	public void user_should_abel_to_see_Add_your_billing_address() {
		cb.cb_Add_your_billing_address();
	}
	
	@When("user enters First Name as {string} and Last Name as {string}")
	public void user_enters_first_name_as_and_last_name_as(String string1 , String string2) throws InterruptedException {
		cb.cb_First_Name(string1);
		cb.cb_Last_Name(string2);
	}

	@When("user enters Address Line1 {string} and Address Line2 {string} and Address Line3 {string}")
	public void user_enters_address_lineq_and_address_line2_and_address_line3(String Line1,String Line2,String Line3) throws InterruptedException {
		cb.cb_Address_Line1(Line1);
		cb.cb_Address_Line2(Line2);
		cb.cb_Address_Line3(Line3);
	}

	@When("user enters city Name as {string} and Zip code as {string}")
	public void user_enters_city_name_and_zip_code(String city, String zip) throws InterruptedException {
		cb.cb_City(city);
		cb.cb_Zip(zip);
	}

	@When("user taps on Country and pick an option related to Country")
	public void user_taps_on_country_and_pick_an_option_related_to_country() throws InterruptedException {
		cb.cb_Country();
		cb.cb_CountryList();
		
	}

	@When("user taps on State and pick an option related to State")
	public void user_taps_on_state_and_pick_an_option_related_to_state() throws InterruptedException {
		cb.cb_State();
		cb.cb_CountryState();
	}
	@Then("user should able to see Add your payment details")
	public void user_should_able_to_see_Add_your_payment_details() {
		cb.cb_Add_your_payment_details();
	}
	@When("user taps on Card Number and select the valid Card")
	public void user_taps_on_Card_Number_and_select_the_valid_Card() throws InterruptedException {
		cb.cb_clicks_Card_Number();
		cb.cb_clicks_Valid_Card();
	}
	@Then("user should able to see Complete your order")
	public void user_should_able_to_see_Complete_your_order() {
		cb.cb_Complete_your_order();
	}
	@Then("user should able to see plan and price")
	public void user_should_able_to_see_plan_and_price() {
	}
	@When("user taps on Pay and subscribe")
	public void user_taps_on_Pay_and_subscribe() throws InterruptedException {
		cb.cb_Pay_subscribe();
	}
	@Then("user should able to see message info")
	public void user_should_able_to_see_message_info() {
		
	}
	@When("user taps on cancel button")
	public void user_taps_on_cancel_button() throws InterruptedException {
		cb.cb_Cancel();
	}
	@When("user is in Pre Login Screen")
	public void user_is_in_pre_login_screen() {
	}

	@When("user sees Take care of your loved ones, from miles away.")
	public void user_sees_Take_care_of_your_loved_ones_from_miles_away() {
		cb.cb_Take_care_of_your_loved_ones_from_miles_away();
	}

	@When("user sees Sign Up Now button")
	public void user_sees_sign_up_now_button() {
		cb.cb_text_Sign_Up_Now();
	}

	@When("user taps on Sign Up Now button")
	public void user_taps_on_sign_up_now_button() {
		cb.cb_taps_Sign_Up_Now();
	}

	@Then("user should able to see Sign Up Screen")
	public void user_should_able_to_see_sign_up_screen() {
		cb.cb_text_Sign_Up();
	}
	@When("user sees Care Plans")
	public void user_sees_Care_Plans() {
		cb.cb_Text_CarePlans();
	}
	@When("user sees See All")
	public void user_sees_See_All() {
		cb.cb_text_See_All();
	}
	@When("user sees General Health")
	public void user_sees_General_Health() {
		cb.cb_Text_GeneralHealth();
	}
	@When("user sees Cardiac Care")
	public void user_sees_Cardiac_Care() {
		cb.cb_Text_CardiacCare();
	}
	@When("user taps on See All")
	public void user_taps_on_See_All() throws InterruptedException {
		cb.cb_Click_See_All();
	}
	@Then("user should able to see Care Plans screen")
	public void user_should_able_to_see_Care_Plans_screen() {
		cb.cb_Text_CarePlans();
	}
	@When("user taps on navigate back icon")
	public void user_taps_on_navigate_back_icon() throws InterruptedException {
		cb.cb_navigate_back_icon();
	}
	@When("user taps on Read More is under General Health")
	public void user_taps_on_Read_More_is_under_General_Health() throws InterruptedException {
		cb.cb_General_Health_Read_More();
	}
	@When("user taps on Read More is under Cardiac Care")
	public void user_taps_on_Read_More_is_under_Cardiac_Care() throws InterruptedException {
		cb.cb_Cardiac_Care_Read_More();
	}
	
	@When("user swipes up the screen")
	public void user_swipes_up_the_screen() {
	}

	@Then("user should able to see Brining health right at your Parent's doorstep")
	public void user_should_able_to_see_brining_health_right_at_your_parent_s_doorstep() throws InterruptedException {
		cb.cb_text_Bringinghealthcarerightatyourparentsdoorstep();
	}

	@Then("user should able to see User-Dashboard")
	public void user_should_able_to_see_user_dashboard() throws InterruptedException {
		cb.cb_text_User_Dashboard();
	}

	@Then("user should able to see your father's health report at your fingertips")
	public void user_should_able_to_see_your_father_s_health_report_at_your_fingertips() throws InterruptedException {
		cb.cb_text_Yourfathershealthreportatyourfingertips();
	}

	@When("user slides User-Dashboard slider")
	public void user_slides_user_dashboard_slider() throws InterruptedException {
		cb.cb_slidesUserDashboardslider();
	}

	@Then("user should able to see Virtual Consultation")
	public void user_should_able_to_see_virtual_consultation() throws InterruptedException {
		cb.cb_Virtual_Consultation();
	}

	@Then("user should able to see Participate in your mother's next consultation")
	public void user_should_able_to_see_participate_in_your_mother_s_next_consultation() throws InterruptedException {
		cb.cb_Participateinyourmothersnextconsultation();
	}

	@When("user slides Virtual Consultation slider")
	public void user_slides_virtual_consultation_slider() throws InterruptedException {
		cb.cb_slidesVirtualConsultationslider();
	}

	@Then("user should able to see Vitals")
	public void user_should_able_to_see_vitals() throws InterruptedException {
		cb.cb_text_Vitals();
	}

	@Then("user should able to see Stay informed with ongoing monitoring")
	public void user_should_able_to_see_stay_informed_with_ongoing_monitoring() throws InterruptedException {
		cb.cb_text_Stayinformedwithongoingmonitoring();
	}
	@Then("user should able to see Specialities")
	public void user_should_able_to_see_Specialities() throws InterruptedException {
		cb.cb_text_Specialities();
	}
	@Then("user should able to see See All")
	public void user_should_able_to_see_See_All() throws InterruptedException {
		cb.cb_text_See_All();
	}
	@Then("user should able to see All Specialities screen")
	public void user_should_able_to_see_All_Specialities_screen(){
		cb.cb_text_All_Specialities();
	}
	//TC_PL_003
	@Then("user should able to see Why choose CureBay")
	public void user_should_able_to_see_why_choose_cure_bay() throws InterruptedException {
		cb.cb_Text_Why_choose_CureBay();
	}

	@Then("user should able to see eClinic")
	public void user_should_able_to_see_e_clinic() throws InterruptedException {
		cb.cb_Text_Why_choose_CureBay_eClinic();
	}

	@Then("user should able to see Technology platform")
	public void user_should_able_to_see_technology_platform() throws InterruptedException {
		cb.cb_Text_Why_choose_CureBay_Technology_platform();
	}

	@Then("user should able to see Consumer application")
	public void user_should_able_to_see_consumer_application() throws InterruptedException {
		cb.cb_Text_Why_choose_CureBay_Consumer_application();
	}

	@Then("user should able to see Health tech devices")
	public void user_should_able_to_see_health_tech_devices() throws InterruptedException {
		cb.cb_Text_Why_choose_CureBay_Health_tech_devices();
	}

	@Then("user should able to see Situation room")
	public void user_should_able_to_see_situation_room() throws InterruptedException {
		cb.cb_Text_Why_choose_CureBay_Situation_room();
	}

	@Then("user should able to see Network providers")
	public void user_should_able_to_see_network_providers() throws InterruptedException {
		cb.cb_Text_Why_choose_CureBay_Network_providers();
	}
	@Then("user should able to see Holistic care plans")
	public void user_should_able_to_see_Holistic_care_plans() throws InterruptedException {
		cb.user_should_able_to_see_Holistic_care_plans();
	}
	@Then("user should able to see Always stay updated")
	public void user_should_able_to_see_Always_stay_updated() throws InterruptedException {
		cb.user_should_able_to_see_Always_stay_updated();
	}
	@Then("user should able to see Achieve health goals")
	public void user_should_able_to_see_Achieve_health_goals() throws InterruptedException {
		cb.user_should_able_to_see_Achieve_health_goals();
	}
	@Then("user should able to see Round the clock access")
	public void user_should_able_to_see_Round_the_clock_access() throws InterruptedException {
		cb.user_should_able_to_see_Round_the_clock_access();
	}
	@Then("user should able to see Advanced technology")
	public void user_should_able_to_see_Advanced_technology() throws InterruptedException {
		cb.user_should_able_to_see_Advanced_technology();
	}

	@Then("user should able to see 36k Happy patients")
	public void user_should_able_to_see_36k_happy_patients() throws InterruptedException {
		cb.cb_Happy_patients();
		cb.cb_Happy_patients_count();
	}

	@Then("user should able to see {int} eClincs in Odisha")
	public void user_should_able_to_see_e_clincs_in_odisha(Integer int1) throws InterruptedException {
		cb.cb_eClinics_in_Odisha();
		cb.cb_eClinics_in_Odisha_count();
	}

	@Then("user should able to see {int} Specialities")
	public void user_should_able_to_see_specialities(Integer int1) throws InterruptedException {
		cb.cb_Specialities();
		cb.cb_Specialities_count();
	}

	@Then("user should able to see {int} Service providers")
	public void user_should_able_to_see_service_providers(Integer int1) throws InterruptedException {
		cb.cb_Service_providers();
		cb.cb_Service_providers_count();
	}

	@Then("user should able to see {int} Villages and towns covered")
	public void user_should_able_to_see_villages_and_towns_covered(Integer int1) throws InterruptedException {
		cb.cb_Villages_and_towns_covered();
		cb.cb_Villages_and_towns_covered_count();
	}
	@When("user swipes up the screen to Book for a free session now")
	public void user_swipes_up_the_screen_to_book_for_a_free_session_now() throws InterruptedException {
//		cb.cb_Book_for_a_free_screening_session_now();
		cb.cb_Bookforafreehealthassessmentforyourparentswhichwillhelpyouchoosethebestcareplanforthem();
	}
	@When("user swipes up the screen to Explore our healthcare plans")
	public void user_swipes_up_the_screen_to_Explore_our_healthcare_plans() throws InterruptedException {
//		cb.cb_Book_for_a_free_screening_session_now();
		cb.user_swipes_up_the_screen_to_Explore_our_healthcare_plans();
	}

	@When("user taps on Book Now")
	public void user_taps_on_book_now() throws InterruptedException {
		cb.cb_click_Book_Now();
	}
	@When("user should able to see New Booking in popup")
	public void user_should_able_to_see_New_Booking_in_popup() {
		cb.cb_Text_New_Booking();
	}
	@When("user should able to see Booking Confirmation in popup")
	public void user_should_able_to_see_Booking_Confirmation_in_popup() {
		cb.cb_Text_Booking_Confirmation();
	}
	@When("user taps on BOOK NOW in popup")
	public void user_taps_on_BOOK_NOW_in_popup() {
		cb.cb_Clicks_BOOK_NOW();
	}

	@Then("user should able to see Book for your Pre-Counselling!")
	public void user_should_able_to_see_book_for_your_pre_counselling() {
		cb.cb_Text_Book_for_your_Pre_Counselling();
	}

	@When("user enters valid text in name text box for care details")
	public void user_enters_valid_text_in_name_text_box_for_care_details() {
		cb.cb_Add_Care_Giver_details_name_text_box();
	}

	@When("user selects country from country code dropdown")
	public void user_selects_country_from_country_code_dropdown() {
		cb.cb_Add_Care_Giver_details_country_code_dropdown();
		cb.cb_text_Enter_country_name();
		cb.cb_Click_country_India_91();
	}

	@When("user enters valid Phone Number in Phone Number box")
	public void user_enters_valid_Phone_Number_in_Phone_Number_box() {
		cb.cb_Add_Care_Giver_details_Phone_Number();
	}

	@When("user enters valid email id in email Address")
	public void user_enters_valid_email_id_in_email_address() {
		cb.cb_Add_Care_Giver_details_Email_Address();
	}

	@When("user fills Care Receiver details with vaild details")
	public void user_fills_care_receiver_details_with_vaild_details() {
		cb.cb_swipeUp(1);
		cb.cb_Care_Receiver_details_name_text_box();
		cb.cb_Click_Select_relation();
		cb.cb_Click_Select_relation_Self();
		cb.cb_Click_Care_Receiver_details_country_code_dropdown();
		cb.cb_text_Enter_country_name();
		cb.cb_Click_country_India_91();
		cb.cb_Care_Receiver_details_Phone_Number();
		cb.cb_Care_Receiver_details_Location();
	}

	@When("user taps on Send Inquiry button")
	public void user_taps_on_send_inquiry_button() {
		cb.cb_Click_Send_Inquiry();
	}

	@Then("user should able to see Alert message Your information Saved Successfully.")
	public void user_should_able_to_see_alert_message_your_information_saved_successfully() {
		cb.cb_Book_android_message();
		cb.cb_Book_OK();
		
	}
	
	@When("^user enters (.*) in Name text box for care details$")
	public void user_enters_in_Name_text_box_for_care_details(String string) {
		cb.cb_Add_Care_Giver_details_name_text_box(string);
	}
	@When("^user enters (.*) in Phone Number box for care details$")
	public void user_enters_in_Phone_Number_box_for_care_details(String string) {
		cb.cb_Add_Care_Giver_details_Phone_Number(string);
	}
	@When("^user enters (.*) in Email Address$")
	public void user_enters_valid_email_id_in_email_address(String string) {
		cb.cb_Add_Care_Giver_details_Email_Address(string);
	}
	
	@When("^user enters (.*) in name text box in care receiver details$")
	public void user_enters_in_name_text_box_in_care_receiver_details(String string) {
		cb.cb_swipeUp(1);
		cb.cb_Care_Receiver_details_name_text_box(string);
	}
	@When("user selects the relationship")
	public void user_selects_the_relationship() {
		cb.cb_Click_Select_relation();
		cb.cb_Click_Select_relation_Self();
	}
	
	@When("^user enters (.*) in care receiver's phone number box$")
	public void user_enters_in_care_receivers_phone_number_box(String string) {
		cb.cb_Click_Care_Receiver_details_country_code_dropdown();
		cb.cb_text_Enter_country_name();
		cb.cb_Click_country_India_91();
		cb.cb_Care_Receiver_details_Phone_Number(string);
	}
	
	@When("^user enters (.*) in location box$")
	public void user_enters_in_location_box(String string) {
		cb.cb_Care_Receiver_details_Location(string);
	}
	
	@Then("user should able to see error messages under the text boxes")
	public void user_should_able_to_see_error_messages_under_the_text_boxes() {
		cb.cb_Book_android_message();
		cb.cb_Book_OK();
	}
	@When("user taps on Add More Member")
	public void user_taps_on_Add_More_Member() throws InterruptedException {
		cb.cb_click_Book_Add_More_Member();
	}
	@Then("user should able to see one more booking form")
	public void user_should_able_to_see_one_more_booking_form() {
		
	}
	@Then("user should able to see remove link")
	public void user_should_able_to_see_remove_link() {
		cb.cb_text_Add_More_Member_Remove();
	}
	@When("user taps on remove link")
	public void user_taps_on_remove_link() {
		cb.cb_click_remove();
	}
	@Then("user should able to see newly added form removed")
	public void user_should_able_to_see_newly_added_form_removed() {
		
	}
	@When("user taps on Add More Member more than 3 times")
	public void user_taps_on_Add_More_Member_more_than_times() throws InterruptedException {
		cb.cb_click_Book_Add_More_Member();
		cb.cb_click_Book_Add_More_Member();
		cb.cb_click_Book_Add_More_Member();
	}
	@Then("user should able to see error message")
	public void user_should_able_to_see_error_message() {
		cb.cb_Book_android_message();
		cb.cb_Book_OK();
	}
	
	@Then("user should able to see Frequently Asked Questions")
	public void user_should_able_to_see_Frequently_Asked_Questions() throws InterruptedException {
		cb.cb_text_Frequently_Asked_Questions();
	}

	@Then("user should able to see Q. What is Pre-Assessment?")
	public void user_should_able_to_see_Q_What_is_Pre_Assessment() throws InterruptedException {
		cb.cb_text_QWhatisPreAssessment();
	}
	
	@Then("user should able to see Q. What is Pre-Assessment? Answer")
	public void user_should_able_to_see_Q_What_is_Pre_Assessment_Answer() throws InterruptedException {
		cb.cb_text_QWhatisPreAssessment_Answer();
	}
	@Then("user should able to see Q. What is Health-Assessment?")
	public void user_should_able_to_see_Q_What_is_Health_Assessment() throws InterruptedException {
		cb.cb_text_QWhatisHealthAssessment();
	}
	
	@Then("user should able to see Q. What is Health-Assessment? Answer")
	public void user_should_able_to_see_Q_What_is_Health_Assessment_Answer() throws InterruptedException {
		cb.cb_text_QWhatisHealthAssessment_Answer();
	}
	@Then("user should able to see What is Pre-Assessment?")
	public void user_should_able_to_see_What_is_Pre_Assessment() throws InterruptedException {
		cb.cb_text_WhatisPreAssessment();
	}
	@Then("user taps on What is Pre-Assessment?")
	public void user_taps_on_What_is_Pre_Assessment() throws InterruptedException {
		cb.cb_Click_WhatisPreAssessment();
	}
	@Then("user should able to see relavent answer for What is Pre-Assessment?")
	public void user_should_able_to_see_relavent_answer_for_What_is_PreAssessment() throws InterruptedException {
		cb.cb_text_WhatisPreAssessment_Answer();
	}
	@Then("user should able to see What is Health-Assessment?")
	public void user_should_able_to_see_What_is_Health_Assessment() throws InterruptedException {
		cb.cb_text_WhatisHealthAssessment();
	}
	@Then("user taps on What is Health-Assessment?")
	public void user_taps_on_What_is_Health_Assessment() throws InterruptedException {
		cb.cb_Click_WhatisHealthAssessment();
	}
	@Then("user should able to see relavent answer for What is Health-Assessment?")
	public void user_should_able_to_see_relavent_answer_for_What_is_Health_Assessment() throws InterruptedException {
		cb.cb_text_WhatisHealthAssessment_Answer();
	}

	@Then("user should able to see Can I choose more than one plan if i have 2 diseases?")
	public void user_should_able_to_see_Can_I_choose_more_than_one_plan_if_i_have_2_diseases() throws InterruptedException {
		cb.cb_text_CanIchoosemorethanoneplanifIhave2diseases();
	}
	@Then("user should able to see Yes you can choose more than 1 plans or make on custom plan")
	public void user_should_able_to_see_Yes_you_can_choose_more_than_1_plans_or_make_on_custom_plan() throws InterruptedException {
		cb.cb_text_Yesyoucanchoosemorethanoneplan();
	}
	@Then("user should able to see For more answers read our FAQ Page")
	public void user_should_able_to_see_For_more_answers_read_our_FAQ_Page() throws InterruptedException {
		cb.cb_text_FormoreanswersreadourFAQPagen();
	}
	@When("user taps on For more answers read our FAQ Page")
	public void user_taps_on_For_more_answers_read_our_FAQ_Page() throws InterruptedException {
		cb.cb_Click_FormoreanswersreadourFAQPage();
	}
	@When("user should able to see FAQ screen")
	public void user_should_able_to_see_FAQ_screen() throws InterruptedException {
		cb.cb_text_FAQ();
	}
	
	@And("user should able to see Can I choose more than one plan if i have 2 Chronic Conditions?")
	public void user_should_able_to_see_Can_I_choose_more_than_one_plan_if_i_have_2_Chronic_Conditions() throws InterruptedException {
		cb.cb_text_CanIchoosemorethanoneplanifIhave2ChronicConditions();
	}
	
	@When("user taps on Can I choose more than one plan if i have {int} Chronic Conditions? dropdown")
	public void user_taps_on_can_i_choose_more_than_one_plan_if_i_have_chronic_conditions_dropdown(Integer int1) {
		cb.cb_Click_CanIchoosemorethanoneplanifIhave2ChronicConditions();
	}

	@Then("user should able to see relavent answer for more than one plan")
	public void user_should_able_to_see_relavent_answer_for_more_than_one_plan() throws InterruptedException {
		cb.cb_text_CanIchoosemorethanoneplanifIhave2ChronicConditionsrelaventanswer();
	}
	@When("user taps on Can I use the same account for more than one family member?")
	public void user_taps_on_Can_I_use_the_same_account_for_more_than_one_family_member() throws InterruptedException {
		cb.cb_Click_CanIusethesameaccountformorethanonefamilymember();
	}
	@Then("user should able to see relavent answer for Can I use the same account for more than one family member?")
	public void user_should_able_to_see_relavent_answer_for_Can_I_use_the_same_account_for_more_than_one_family_member() throws InterruptedException {
		cb.cb_text_CanIusethesameaccountformorethanonefamilymemberrelaventanswer();
	}
	@Then("user should able to see relavent answer for same account")
	public void user_should_able_to_see_relavent_answer_for_same_account() throws InterruptedException {
		cb.cb_text_CanIusethesameaccountformorethanonefamilymemberrelaventanswer();
	}

	@When("user taps on How do I make the payment?")
	public void user_taps_on_how_do_i_make_the_payment() throws InterruptedException {
		cb.cb_Click_HowdoImakethepayment();
	}
	@Then("user should able to see relavent answer for How do I make the payment?")
	public void user_should_able_to_see_relavent_answer_for_How_do_I_make_the_payment() throws InterruptedException {
		cb.cb_text_HowdoImakethepaymentrelaventanswer();
	}

	@Then("user should able to see You can make online payment")
	public void user_should_able_to_see_you_can_make_online_payment() throws InterruptedException {
		cb.cb_text_HowdoImakethepaymentrelaventanswer();
	}

	@When("user taps on Do I need to submit any documents?")
	public void user_taps_on_do_i_need_to_submit_any_documents() throws InterruptedException {
		cb.cb_Click_DoIneedtosubmitanydocuments();
	}
	@Then("user should able to see relavent answer for Do I need to submit any documents?")
	public void user_should_able_to_see_relavent_answer_for_Do_I_need_to_submit_any_documents() throws InterruptedException {
		cb.cb_text_DoIneedtosubmitanydocumentsrelaventanswer();
	}

	@Then("user should able to see No, You don't have to submit any documents")
	public void user_should_able_to_see_no_you_don_t_have_to_submit_any_documents() throws InterruptedException {
		cb.cb_text_DoIneedtosubmitanydocumentsrelaventanswer();
	}

	@When("user swipes up")
	public void user_swipes_up() {
	}

	@When("user taps on is my data safe?")
	public void user_taps_on_is_my_data_safe() throws InterruptedException {
		cb.cb_Ismydatasafe();
	}
	@Then("user should able to see relavent answer for is my data safe?")
	public void user_should_able_to_see_relavent_answer_for_is_my_data_safe() throws InterruptedException {
		cb.cb_Ismydatasaferelaventanswer();
	}

	@Then("user should able to see You health data is protected by our firewall. We adhere to a strict privacy policy.")
	public void user_should_able_to_see_you_health_data_is_protected_by_our_firewall_we_adhere_to_a_strict_privacy_policy() throws InterruptedException {
		cb.cb_Ismydatasaferelaventanswer();
	}

	@When("user taps on is the support team available {int}*{int}?")
	public void user_taps_on_is_the_support_team_available(Integer int1, Integer int2) throws InterruptedException {
		cb.cb_Click_Is_the_support_team_available_24_7();
	}
	@Then("user should able to see relavent answer for is the support team available 24*7?")
	public void user_should_able_to_see_relavent_answer_for_is_the_support_team_available_247() throws InterruptedException {
		cb.cb_text_Is_the_support_team_available_24_7relaventanswer();
	}
	@Then("user should able to see relavent answer for support team available 24*7")
	public void user_should_able_to_see_relavent_answer_for_support_team_available_24_7() throws InterruptedException {
		cb.cb_text_Is_the_support_team_available_24_7relaventanswer();
	}

	@When("user taps on How can I cancel my membership?")
	public void user_taps_on_How_can_I_cancel_my_membership() throws InterruptedException {
		cb.cb_HowcanIcancelmymembership();
	}
	@Then("user should able to see relavent answer for How can I cancel my membership?")
	public void user_should_able_to_see_relavent_answer_for_How_can_I_cancel_my_membership() throws InterruptedException {
		cb.cb_HowcanIcancelmymembershiprelaventanswer();
	}
	@Then("user should able to see relavent answer for can I cancel my membership")
	public void user_should_able_to_see_relavent_answer_for_can_I_cancel_my_membership() throws InterruptedException {
		cb.cb_HowcanIcancelmymembershiprelaventanswer();
	}
	
	
	@When("user taps on Can we opt-out if we have chosen a monthly pay-out?")
	public void user_taps_on_Can_we_opt_out_if_we_have_chosen_a_monthly_pay_out() throws InterruptedException {
		cb.cb_click_Canweoptoutifwehavechosenamonthlypayout();
	}
	@Then("user should able to see relavent answer for Can we opt-out if we have chosen a monthly pay-out?")
	public void user_should_able_to_see_relavent_answer_for_Can_we_opt_out_if_we_have_chosen_a_monthly_pay_out() throws InterruptedException {
		cb.cb_text_CanweoptoutifwehavechosenamonthlypayoutAnswer();
	}
	@When("user taps on Can I re-schedule the appointment?")
	public void user_taps_on_Can_I_re_schedule_the_appointment() throws InterruptedException {
		cb.cb_Click_CanIrescheduletheappointment();
	}
	@Then("user should able to see relavent answer for Can I re-schedule the appointment?")
	public void user_should_able_to_see_relavent_answer_for_Can_I_re_schedule_the_appointment() throws InterruptedException {
		cb.cb_text_CanIrescheduletheappointmentAnswer();
	}
	
	@When("user taps on Will I be able to do a physical doctor consultation?")
	public void user_taps_on_will_i_be_able_to_do_a_physical_doctor_consultation() throws InterruptedException {
		cb.cb_WillIbeabletodoaphysicaldoctorconsultation();
	}

	@Then("user should able to see relavent answer for Will I be able to do a physical doctor consultation?")
	public void user_should_able_to_see_relavent_answer_for_will_i_be_able_to_do_a_physical_doctor_consultation() throws InterruptedException {
		cb.cb_WillIbeabletodoaphysicaldoctorconsultationAnswer();
	}

	@When("user taps on Can we do any lab tests based on our custom requirements?")
	public void user_taps_on_can_we_do_any_lab_tests_based_on_our_custom_requirements() throws InterruptedException {
		cb.cb_Canwedoanylabtestsbasedonourcustomrequirements();
	}

	@Then("user should able to see relavent answer for Can we do any lab tests based on our custom requirements?")
	public void user_should_able_to_see_relavent_answer_for_can_we_do_any_lab_tests_based_on_our_custom_requirements() throws InterruptedException {
		cb.cb_CanwedoanylabtestsbasedonourcustomrequirementsAnswer();
	}

	@When("user taps on What all can be tracked on the dashboard?")
	public void user_taps_on_what_all_can_be_tracked_on_the_dashboard() throws InterruptedException {
		cb.cb_Whatallcanbetrackedonthedashboard();
	}

	@Then("user should able to see relavent answer for What all can be tracked on the dashboard?")
	public void user_should_able_to_see_relavent_answer_for_what_all_can_be_tracked_on_the_dashboard() throws InterruptedException {
		cb.cb_WhatallcanbetrackedonthedashboardAnswer();
	}

	@When("user taps on What are the On Demand Services?")
	public void user_taps_on_what_are_the_on_demand_services() throws InterruptedException {
		cb.cb_WhataretheOnDemandServices();
	}

	@Then("user should able to see relavent answer for What are the On Demand Services?")
	public void user_should_able_to_see_relavent_answer_for_what_are_the_on_demand_services() throws InterruptedException {
		cb.cb_WhataretheOnDemandServicesAnswer();
	}

	@Then("user should able to see plan added in the cart")
	public void user_should_able_to_see_plan_added_in_the_cart() throws InterruptedException {
		cb.cb_text_YourCart();
//		cb.cb_YourCart_Payment_Details();
//		cb.cb_YourCart_Payment_Detailsinfo();
		
	}
	@Then("user should able to see Check medicare services near to your parents area")
	public void user_should_able_to_see_Check_medicare_services_near_to_your_parents_area() throws InterruptedException {
		cb.user_should_able_to_see_Check_medicare_services_near_to_your_parents_area();
	}

	
	@When("user enters valid Pincode")
	public void user_enters_valid_Pincode() throws InterruptedException {
		cb.user_enters_Pincode();
	}

	@When("user taps on Check button")
	public void user_taps_on_Check_button() throws InterruptedException {
		cb.cb_Click_Check();
	}
	@Then("user should able to see nearest eClinc image attached Or should able to see {string}")
	public void user_should_able_to_see_nearest_eClinc_image_attached_Or_should_able_to_see(String string) throws InterruptedException {
		cb.cb_user_should_able_to_see_nearest_eClinc_image_attached_Or_should_able_to_see();
	}
	@When("user taps on salutation dropdown")
	public void user_taps_on_salutation_dropdown() throws InterruptedException {
		cb.cb_Saluation_dropdown();
	}
	@When("user selects relavent salutation")
	public void user_selects_relavent_salutation() throws InterruptedException {
		cb.cb_Saluation_Mr();
	}
	@When("user enters first name and last name")
	public void user_enters_first_name_and_last_name() throws InterruptedException {
		cb.user_enters_first_name_and_last_name();
	}
	@When("user taps on calender icon")
	public void user_taps_on_calender_icon() throws InterruptedException {
		cb.cb_DateofBirth();
	}
	@When("user selects Blood Group details from Blood Group dropdown")
	public void user_selects_Blood_Group_details_from_Blood_Group_dropdown() throws InterruptedException {
		cb.user_selects_Blood_Group_details_from_Blood_Group_dropdown();
	}
	@When("user selects Relation details from Relation dropdown")
	public void user_selects_Relation_details_from_Relation_dropdown() throws InterruptedException {
		cb.user_selects_Relation_details_from_Relation_dropdown();
	}
	@When("user selects Gender detatils from Gender dropdown")
	public void user_selects_Gender_detatils_from_Gender_dropdown() throws InterruptedException {
		cb.user_selects_Gender_detatils_from_Gender_dropdown();
	}
	@When("user selects Country from Country code dropdown")
	public void user_selects_Country_from_Country_code_dropdown() throws InterruptedException {
		cb.cb_Add_country_code_dropdown();
		cb.cb_text_Enter_country_name();
		cb.cb_Click_country_India_91();
	}
	@When("user selects State from State dropdown")
	public void user_selects_State_from_State_dropdown() throws InterruptedException {
		cb.cb_Add_State_code_dropdown();
		cb.cb_Tamil_Nadu();
	}
	@When("user enters valid phone number in phone number box")
	public void user_enters_valid_phone_number_in_phone_number_box() throws InterruptedException {
		cb.cb_user_enters_valid_phone_number_in_phone_number_box();
	}
	@When("user enters valid Emergency Contact Number")
	public void user_enters_valid_Emergency_Contact_Number() throws InterruptedException {
		cb.cb_user_enters_valid_Emergency_Contact_Number();
	}
	@When("user valid Email id in Email text box")
	public void user_valid_Email_id_in_Email_text_box() throws InterruptedException {
		cb.cb_user_valid_Email_id_in_Email_text_box();
	}
	@When("user enters Address in address text box")
	public void user_enters_Address_id_in_address_text_box() throws InterruptedException {
		cb.cb_user_enters_Address_id_in_Address_text_box();
	}
	@When("user enters Locality in Locality Town text box")
	public void user_enters_Locality_in_Locality_Town_box() throws InterruptedException {
		cb.cb_user_enters_Locality_in_Locality_Town_box();
	}
	@When("user enters valid Pincode in Pincode text box")
	public void user_enters_valid_Pincode_in_Pincode_text_box() throws InterruptedException {
		cb.cb_user_enters_valid_pincode_in_pincode_box();
	}
	@When("user enters City in City text box")
	public void user_enters_City_in_City_text_box() throws InterruptedException {
		cb.cb_user_enters_City_in_City_text_box();
	}
	@When("user enters State in state text box")
	public void user_enters_State_in_state_text_box() throws InterruptedException {
		cb.cb_user_enters_State_in_state_text_box();
	}
	@When("user taps on Smartphone access available for user.")
	public void user_taps_on_Smartphone_access_available_for_user() throws InterruptedException {
		cb.cb_Smartphoneaccessavailableforuser();
	}
	@When("user taps on  Save Member button")
	public void user_taps_on__Save_Member_button() throws InterruptedException {
		cb.user_taps_on__Save_Member_button();
	}
	@Then("user should able to see  Nearby e-clinics")
	public void user_should_able_to_see__Nearby_e_clinics() {
		
	}
	@Then("user should able to see created member profile is present in See Profiles screen")
	public void user_should_able_to_see_created_member_profile_is_present_in_See_Profiles_screen() {
		cb.getToastMessage();
	}
	
	//24/8/2023 code
	@Then("user should able to see Check Medicare services near to your parents area")
	public void user_should_able_to_see_Check_Medicare_services_near_to_your_parents_area() {
		cb.check_Medicare();
	}
	@Then("user should able to see Plan Details")
	public void user_should_able_to_see_Plan_Details() {
		cb.cb_Plan_Details();
	}
	
	@When("user taps on Detailed baseline evaluation & symptomatic care - Nurse")
	public void user_taps_on_Detailed_baseline_evaluation_symptomaticcareNurse() throws InterruptedException {
		cb.user_taps_on_Detailed_baseline_evaluation_symptomaticcareNurse();
	}
	@Then("user should able to see a short note on baseline evaluation & symptomatic care - Nurse")
	public void user_should_able_to_see_a_short_note_on_baseline_evaluation_symptomatic_care_Nurse() {
		cb.user_should_able_to_see_a_short_note_on_baseline_evaluation_symptomatic_care_Nurse();
	}
	
	@When("user taps on Detailed baseline evaluation & symptomatic care - Lab test")
	public void user_taps_on_Detailed_baseline_evaluation_symptomatic_care_Lab_test() throws InterruptedException {
		cb.user_taps_on_Detailed_baseline_evaluation_symptomatic_care_Lab_test();
	}
	@Then("user should able to see a short note on Detailed baseline evaluation & symptomatic care - Lab test")
	public void user_should_able_to_see_a_short_note_on_Detailed_baseline_evaluation_symptomatic_care_Lab_test() {
		cb.user_should_able_to_see_a_short_note_on_Detailed_baseline_evaluation_symptomatic_care_Lab_test();
	}
	@When("user taps on Complete health review & care by Orthopedician")
	public void user_taps_on_complete_health_review_care_by_orthopedician() throws InterruptedException {
		cb.user_taps_on_complete_health_review_care_by_orthopedician();
	}

	@Then("user should able to see a short note on Complete health review & care by Orthopedician")
	public void user_should_able_to_see_a_short_note_on_complete_health_review_care_by_orthopedician() {
		cb.user_should_able_to_see_a_short_note_on_complete_health_review_care_by_orthopedician();
	}

	@When("user taps on Specialty care and referral")
	public void user_taps_on_specialty_care_and_referral() throws InterruptedException {
		cb.user_taps_on_specialty_care_and_referral();
	}

	@Then("user should able to see a short note on Specialty care and referral")
	public void user_should_able_to_see_a_short_note_on_specialty_care_and_referral() {
		cb.user_should_able_to_see_a_short_note_on_specialty_care_and_referral();
	}

	@When("user taps on Periodic online follow-ups and care")
	public void user_taps_on_periodic_online_follow_ups_and_care() throws InterruptedException {
		cb.user_taps_on_periodic_online_follow_ups_and_care();
	}

	@Then("user should able to see a short note on Periodic online follow-ups and care")
	public void user_should_able_to_see_a_short_note_on_periodic_online_follow_ups_and_care() {
		cb.user_should_able_to_see_a_short_note_on_periodic_online_follow_ups_and_care();
	}

	@When("user taps on Physiotherapy")
	public void user_taps_on_physiotherapy() throws InterruptedException {
		cb.user_taps_on_physiotherapy();
	}

	@Then("user should able to see a short note on Physiotherapy")
	public void user_should_able_to_see_a_short_note_on_physiotherapy() {
		cb.user_should_able_to_see_a_short_note_on_physiotherapy();
	}

	@When("user taps on Paramedical care - Nutritionist")
	public void user_taps_on_paramedical_care_nutritionist() throws InterruptedException {
		cb.user_taps_on_paramedical_care_nutritionist();
	}

	@Then("user should able to see a short note on Paramedical care - Nutritionist")
	public void user_should_able_to_see_a_short_note_on_paramedical_care_nutritionist() {
		cb.user_should_able_to_see_a_short_note_on_paramedical_care_nutritionist();
	}

	@When("user taps on Paramedical care - Health Educator")
	public void user_taps_on_paramedical_care_health_educator() throws InterruptedException {
		cb.user_taps_on_paramedical_care_health_educator();
	}

	@Then("user should able to see a short note on Paramedical care - Health Educator")
	public void user_should_able_to_see_a_short_note_on_paramedical_care_health_educator() {
		cb.user_should_able_to_see_a_short_note_on_paramedical_care_health_educator();
	}

	@When("user taps on Paramedical care - In-Person Nurse visit")
	public void user_taps_on_paramedical_care_in_person_nurse_visit() throws InterruptedException {
		cb.user_taps_on_paramedical_care_in_person_nurse_visit();
	}

	@Then("user should able to see a short note on Paramedical care - In-Person Nurse visit")
	public void user_should_able_to_see_a_short_note_on_paramedical_care_in_person_nurse_visit() {
		cb.user_should_able_to_see_a_short_note_on_paramedical_care_in_person_nurse_visit();
	}

	@When("user taps on Comprehensive quarterly care by the physician")
	public void user_taps_on_comprehensive_quarterly_care_by_the_physician() throws InterruptedException {
		cb.user_taps_on_comprehensive_quarterly_care_by_the_physician();
	}

	@Then("user should able to see a short note on Comprehensive quarterly care by the physician")
	public void user_should_able_to_see_a_short_note_on_comprehensive_quarterly_care_by_the_physician() {
		cb.user_should_able_to_see_a_short_note_on_comprehensive_quarterly_care_by_the_physician();
	}

	@When("user taps on {int} monthly lab tests")
	public void user_taps_on_6_monthly_lab_tests(Integer int1) throws InterruptedException {
		cb.user_taps_on_6_monthly_lab_tests();
	}

	@Then("user should able to see a short note on {int} monthly lab tests")
	public void user_should_able_to_see_a_short_note_on_6_monthly_lab_tests(Integer int1) {
		cb.user_should_able_to_see_a_short_note_on_6_monthly_lab_tests();
	}

	@When("user taps on In-Person Nurse visit")
	public void user_taps_on_in_person_nurse_visit() throws InterruptedException {
		cb.user_taps_on_in_person_nurse_visit();
	}

	@Then("user should able to see a short note on In-Person Nurse visit")
	public void user_should_able_to_see_a_short_note_on_in_person_nurse_visit() {
		cb.user_should_able_to_see_a_short_note_on_in_person_nurse_visit();
	}

	@When("user taps on Annual outcome - lab tests")
	public void user_taps_on_annual_outcome_lab_tests() throws InterruptedException {
		cb.user_taps_on_annual_outcome_lab_tests();
	}

	@Then("user should able to see a short note on Annual outcome - lab tests")
	public void user_should_able_to_see_a_short_note_on_annual_outcome_lab_tests() {
		cb.user_should_able_to_see_a_short_note_on_annual_outcome_lab_tests();
	}

	@When("user taps on Annual outcome - In-Person Nurse visit")
	public void user_taps_on_annual_outcome_in_person_nurse_visit() throws InterruptedException {
		cb.user_taps_on_annual_outcome_in_person_nurse_visit();
	}

	@Then("user should able to see a short note on Annual outcome - In-Person Nurse visit")
	public void user_should_able_to_see_a_short_note_on_annual_outcome_in_person_nurse_visit() {
		cb.user_should_able_to_see_a_short_note_on_annual_outcome_in_person_nurse_visit();
	}

	@When("user taps on Annual outcome - General Physician")
	public void user_taps_on_annual_outcome_general_physician() throws InterruptedException {
		cb.user_taps_on_annual_outcome_general_physician();
	}

	@Then("user should able to see a short note on Annual outcome - General Physician")
	public void user_should_able_to_see_a_short_note_on_annual_outcome_general_physician() {
		cb.user_should_able_to_see_a_short_note_on_annual_outcome_general_physician();
	}
	@Then("user selects one Profile from the lists")
	public void user_selects_one_Profile_from_the_lists() {
		cb.user_selects_one_Profile_from_the_lists();
	}
	
}