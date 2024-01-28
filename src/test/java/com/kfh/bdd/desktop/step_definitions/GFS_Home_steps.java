package com.kfh.bdd.desktop.step_definitions;

import java.awt.AWTException;
import java.io.IOException;
import com.kfh.bdd.desktop.screens.GFS_Home_screen;
import com.kfh.bdd.integrations.common_utils.DriverFactory;
import com.kfh.bdd.ccl.DesktopActions;
import com.kfh.bdd.integrations.report_utils.ReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GFS_Home_steps {
	
	GFS_Home_screen gfs = new GFS_Home_screen();
	
	@Given("user is logged into the GFS application")
	public void user_is_logged_into_the_gfs_application() throws Exception {
		gfs.enterPasswordUsingRobotClass();
		gfs.closePopup();
//		gfs.enterPassword();
//		gfs.verifyGfsHomePage();
	}
	
//	@When("user enters the password for GFS application")
//	public void user_enters_the_password_for_gfs_application() {
//		
//	}
//	
	@Then("user is navigated to GFS home screen successfully")
	public void user_is_navigated_to_gfs_home_screen_successfully() {
		ReportManager.logInfo("Navigated to GFS home page successfully.");
	}

	@When("user clicks on Locate option from the menubar")
	public void user_clicks_on_locate_option_from_the_menubar() throws InterruptedException, AWTException {
	   gfs.clickLocateMenu();
	}
	
	@And("user clicks on CSR option from the menubar")
	public void user_clicks_on_csr_option_from_the_menubar() throws InterruptedException, AWTException {
		gfs.clickCSRMenu();
	   
	}
	@When("user clicks on the Transaction option from the menubar")
	public void user_clicks_on_the_transaction_option_from_the_menubar() throws InterruptedException, AWTException {
		gfs.clickTransactionsMenu();
	    
	}
	

}
