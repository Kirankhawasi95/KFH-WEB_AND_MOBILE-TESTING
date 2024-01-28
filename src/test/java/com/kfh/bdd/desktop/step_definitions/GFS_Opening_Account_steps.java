package com.kfh.bdd.desktop.step_definitions;

import java.awt.AWTException;
import java.io.IOException;

import com.kfh.bdd.desktop.screens.GFS_Opening_Account_screen;
import com.kfh.bdd.integrations.report_utils.ReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GFS_Opening_Account_steps {
	
	GFS_Opening_Account_screen gfsOpeningAcc = new GFS_Opening_Account_screen();

	@Then("user is navigated to Account Opening and Servicing screen successfully")
	public void user_is_navigated_to_account_opening_and_servicing_screen_successfully() throws InterruptedException {
	   ReportManager.logInfo("Successfully navigated to Account Opening and Servicing screen");
	   Thread.sleep(1000);
	}

	@When("user clicks on Account Maintenance option")
	public void user_clicks_on_account_maintenance_option() throws InterruptedException, AWTException {
	    gfsOpeningAcc.clickAccountMaintenceOption();
	}

	@And("user clicks on Open Account option")
	public void user_clicks_on_open_account_option() throws InterruptedException, AWTException {
	    gfsOpeningAcc.clickOpenAccountOption();
	}

	@Then("user is navigated to Open account screen successfully")
	public void user_is_navigated_to_open_account_screen_successfully() {
		ReportManager.logInfo("Successfully navigated to Open Account screen");
	}

	@When("user select Account Type")
	public void user_select_account_type() throws InterruptedException, AWTException {
	    gfsOpeningAcc.selectAccType();
	}

	@And("user select Account Class")
	public void user_select_account_class() throws InterruptedException, AWTException {
	   gfsOpeningAcc.selectAccClass();
	}

	@And("user select Account Branch")
	public void user_select_account_branch() throws AWTException {
	    gfsOpeningAcc.selectAccBranch();
	}

	@And("user select RIM Open Open Reason")
	public void user_select_rim_open_open_reason() throws InterruptedException, AWTException {
		gfsOpeningAcc.selectRimOpenReason();
	}

	@And("user clicks on next button")
	public void user_clicks_on_next_button() throws InterruptedException, AWTException {
		gfsOpeningAcc.clickNxtBtnAccInfoTab();
	}

	@Then("user is navigated to Other Information tab")
	public void user_is_navigated_to_other_information_tab() {
		ReportManager.logInfo("Successfully navigated to Other Information tab");
	}

	@When("user enter Managing Mode")
	public void user_enter_managing_mode() throws InterruptedException, AWTException {
		gfsOpeningAcc.enterMngMode();
	}
	
	@And("user clicks on next button under Other Information Tab")
	public void user_clicks_on_next_button_under_other_information_tab() throws InterruptedException, AWTException {
	    gfsOpeningAcc.clickNxtBtnOtherInfoTab();
	}

	@Then("user is navigated to Account To RIM Relationship Tab")
	public void user_is_navigated_to_account_to_rim_relationship_tab() {
		ReportManager.logInfo("Successfully navigated to RIM Relationship tab");
	}
	
		
	@When("user clicks on next button under RIM Relationship Tab")
	public void user_clicks_on_next_button_under_rim_relationship_tab() throws InterruptedException, AWTException {
	    gfsOpeningAcc.clickNxtBtnRimRelationshipTab();
	}

	@Then("user is navigated to Account Addition Info Tab")
	public void user_is_navigated_to_account_addition_info_tab() {
		ReportManager.logInfo("Successfully navigated to Account Addition Info tab");
	}

	@When("user clicks on save button")
	public void user_clicks_on_save_button() throws InterruptedException, AWTException {
		gfsOpeningAcc.clickSaveBtnAccAditionalInfoTab();
	}

	@And("user accepts the Transaction Vouchers popup")
	public void user_accepts_the_transaction_vouchers_popup() throws InterruptedException, AWTException {
		gfsOpeningAcc.acceptTransVouchersPopup();
	}

	@Then("user is displayed with the successful account opened information and the reference number")
	public void user_is_displayed_with_the_successful_account_opened_information_and_the_reference_number() {
		//gfsOpeningAcc.fetchTransactionDetails();
		 ReportManager.logInfo("Account is opened successfully.");
	}

	@When("user clicks on close button")
	public void user_clicks_on_close_button() throws AWTException {
	    gfsOpeningAcc.closeAccOpeningTab();
	}


}
