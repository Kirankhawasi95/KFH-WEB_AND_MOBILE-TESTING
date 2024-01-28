//package com.kfh.bdd.desktop.step_definitions;
//
//import java.awt.AWTException;
//import java.io.IOException;
//
//import com.kfh.bdd.desktop.screens.GFS_Cash_Deposit_screen;
//import com.kfh.bdd.integrations.report_utils.ReportManager;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class GFS_Cash_Deposit_steps {
//	
//	GFS_Cash_Deposit_screen gfsCashDeposit = new GFS_Cash_Deposit_screen();
//	
//	@Then("user is navigated to Transactions screen successfully")
//	public void user_is_navigated_to_transactions_screen_successfully() {
//		ReportManager.logInfo("Successfully navigated to Transactions screen");
//	}
//
//	@When("user clicks on Common Teller Functions option")
//	public void user_clicks_on_common_teller_functions_option() throws InterruptedException, AWTException {
//	    gfsCashDeposit.clickCommonTellerFuncsOption();
//	}
//
//	@When("user clicks on Cash Deposit option")
//	public void user_clicks_on_cash_deposit_option() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("user is navigated to Cash Deposit screen successfully")
//	public void user_is_navigated_to_cash_deposit_screen_successfully() {
//		ReportManager.logInfo("Successfully navigated to Cash Deposit screen");
//	}
//
//	@When("user enters Account number")
//	public void user_enters_account_number() throws InterruptedException {
//	    gfsCashDeposit.enterAccNumber();
//	}
//
////	@When("user accepts display notes popup")
////	public void user_accepts_display_notes_popup() {
////	    gfsCashDeposit.ac
////	}
//
//	@When("user selects currency type")
//	public void user_selects_currency_type() {
//		ReportManager.logInfo("Successfully selected the currency type.");
//	}
//
//	@When("user enters deposit amount")
//	public void user_enters_deposit_amount() throws FindFailed, AWTException {
//	    gfsCashDeposit.enterDepositAmount();
//	}
//
//	@When("user selects ID type")
//	public void user_selects_id_type() throws FindFailed, AWTException {
//	   gfsCashDeposit.selectIDtype();
//	}
//
//	@When("user enters ID number")
//	public void user_enters_id_number() throws FindFailed, AWTException {
//		gfsCashDeposit.enterIDnumber();
//	}
//
//	@When("user enters Depositor name")
//	public void user_enters_depositor_name() throws FindFailed, AWTException {
//	    gfsCashDeposit.enterDepositorName();
//	}
//
//	@When("user selects Source of funds")
//	public void user_selects_source_of_funds() throws FindFailed, AWTException {
//	    gfsCashDeposit.selectSourceOfFunds();
//	}
//
//	@When("user enter Other Source of Funds")
//	public void user_enter_other_source_of_funds() throws FindFailed, AWTException {
//	    gfsCashDeposit.enterOtherSourceOfFunds();
//	}
//
//	@When("user enters Phone number")
//	public void user_enters_phone_number() throws FindFailed, AWTException {
//	    gfsCashDeposit.enterPhoneNumber();
//	}
//
//	@When("user clicks on OK button")
//	public void user_clicks_on_ok_button() throws FindFailed, AWTException {
//	    gfsCashDeposit.clickOKBtn();
//	}
//
//	@When("user accepts the confirmation popup")
//	public void user_accepts_the_confirmation_popup() throws FindFailed, AWTException {
//	   gfsCashDeposit.closePopUp();
//	}
//
//	@Then("user is displayed with the successful deposit information and the reference number")
//	public void user_is_displayed_with_the_successful_deposit_information_and_the_reference_number() {
//		ReportManager.logInfo("Amount is deposited successfully.");
//	}
//
//	@When("user clicks on cancel button")
//	public void user_clicks_on_cancel_button() throws AWTException {
//	    gfsCashDeposit.closeCashDepositTab();
//	}
//
////	@When("user navigates to back to Cash deposit screen")
////	public void user_navigates_to_back_to_cash_deposit_screen() {
////	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
////	}
////
////	@When("user enters enters Account number")
////	public void user_enters_enters_account_number() {
////	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
////	}
////
////	@Then("user can successfully see the deposited ammount under available balance")
////	public void user_can_successfully_see_the_deposited_ammount_under_available_balance() {
////	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
////	}
//
//}
