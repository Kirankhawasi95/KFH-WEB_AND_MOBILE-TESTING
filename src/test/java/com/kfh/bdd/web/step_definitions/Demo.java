package com.kfh.bdd.web.step_definitions;


import com.kfh.bdd.web.screens.DemoWP;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo {
	
	DemoWP webPage= new DemoWP();

	  @Given("^I am in swaglab application$")
	    public void i_am_in_swaglab_application() throws Throwable {
	       webPage.openingUrl();
	    }

	    @When("^user enter username$")
	    public void user_enter_username() throws Throwable {
	       webPage.enterUsername();
	    }

	    @When("^user clicks on login button$")
	    public void user_clicks_on_login_button() throws Throwable {
	       webPage.login();
	    }

	    @Then("^user clicks on Sauce Labs Backpack prodcut$")
	    public void user_clicks_on_sauce_labs_backpack_prodcut() throws Throwable {
	       webPage.productClick();
	    }

	    @Then("^user enter first name (.+)$")
	    public void user_enter_first_name(String firstname) throws Throwable {
	       webPage.enter_first_Name(firstname);
	    }

	    @And("^user enter password$")
	    public void user_enter_password() throws Throwable {
	       webPage.enterPass();
	    }

	    @And("^user clicks on add cart icon$")
	    public void user_clicks_on_add_cart_icon() throws Throwable {
	       webPage.cartClick();
	    }

	    @And("^user clicks on checkout$")
	    public void user_clicks_on_checkout() throws Throwable {
	       webPage.checkoutClick();
	    }

	    @And("^user enter second name(.+)$")
	    public void user_enter_second_name(String secondname) throws Throwable {
	       webPage.enter_second_Name(secondname);
	    }

	    @And("^user enter postal code(.+)$")
	    public void user_enter_postal_code(String postalcode) throws Throwable {
	       webPage.enter_postal_Code(postalcode);
	    }

	    @And("^user clicks on continue$")
	    public void user_clicks_on_continue() throws Throwable {
	       webPage.clickContinue();
	    }
	    
	    @And("^user clicks on continue wrong button$")
	    public void user_clicks_on_continue_wrong_button() throws Throwable {
	       webPage.clickContinueX();
	    }

	    @And("^user clicks on finish button$")
	    public void user_clicks_on_finish_button() throws Throwable {
	       webPage.clickFinish();
	    }
}
