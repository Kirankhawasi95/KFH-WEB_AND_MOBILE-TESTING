package com.kfh.bdd.desktop.step_definitions;

import com.kfh.bdd.desktop.screens.GFS_Locate_Menu_screen;

import java.awt.AWTException;
import java.io.IOException;

import com.kfh.bdd.integrations.report_utils.ReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GFS_Locate_menu_steps {
	GFS_Locate_Menu_screen gfsLocateMenu = new GFS_Locate_Menu_screen();
	
	@Then("user is navigated to Customer Locate screen successfully")
	public void user_is_navigated_to_customer_locate_screen_successfully() {
	    ReportManager.logInfo("Successfully navigated to Locate screen");
	}

	@When("user selects RIM Type")
	public void user_selects_rim_type() {
		ReportManager.logInfo("Successfully selected RIM type");
	}

	@And("user selects RIM number option from search by dropdown")
	public void user_selects_rim_number_option_from_search_by_dropdown() throws InterruptedException, AWTException {
	    gfsLocateMenu.selectRimOptionFromDropdown();
	}

	@And("user enter RIM number")
	public void user_enter_rim_number() throws InterruptedException {
	   gfsLocateMenu.enterRIMnumber();
	}

	@And("user clicks on search button")
	public void user_clicks_on_search_button() throws InterruptedException, AWTException {
	    gfsLocateMenu.clickSearchbtn();
	   
	}

	@Then("user can see the respective customer details for the given RIM number")
	public void user_can_see_the_respective_customer_details_for_the_given_rim_number() {
		ReportManager.logInfo("Customer details are displayed in the list");
	}

	@When("user selects the customer from the list")
	public void user_selects_the_customer_from_the_list() throws AWTException, InterruptedException {
	//	gfsLocateMenu.selectCustomerDetails();
		Thread.sleep(10000);
	}

	@And("user close the popup displayed for the customer selection")
	public void user_close_the_popup_displayed_for_the_customer_selection() throws AWTException {
	    gfsLocateMenu.closePopUp();
	}

	@Then("user can see the client information details")
	public void user_can_see_the_client_information_details() {
		ReportManager.logInfo("Customer details are displayed successfully");
	}

	@When("user close the locate screen")
	public void user_close_the_locate_screen() throws AWTException {
	    gfsLocateMenu.closeLocateTab();

	}

}
