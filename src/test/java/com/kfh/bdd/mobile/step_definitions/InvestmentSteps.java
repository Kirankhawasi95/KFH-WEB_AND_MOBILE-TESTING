package com.kfh.bdd.mobile.step_definitions;

import com.kfh.bdd.mobile.screens.InvestmentScreens;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvestmentSteps {

	InvestmentScreens investmentScreens = new InvestmentScreens();

	@When("User clicks on Investments")
	public void user_clicks_on_investments() {
		investmentScreens.user_clicks_on_investments();
	}

	@When("User clicks on Large Caps in Category")
	public void user_clicks_on_large_caps_in_category() {
		investmentScreens.user_clicks_on_large_caps_in_category();
	}
	@When("User clicks on Mid Caps in Category")
	public void user_clicks_on_mid_caps_in_category() {
		investmentScreens.user_clicks_on_mid_caps_in_category();
	}
	@Then("User should able to see Mutual Funds Screen")
	public void user_should_able_to_see_mutual_funds_screen() {
		investmentScreens.user_should_able_to_see_mutual_funds_screen();
	}

	@Then("User should able to see All Funds")
	public void user_should_able_to_see_all_funds() {
		investmentScreens.user_should_able_to_see_all_funds();
	}

	@When("User clicks on Explore of first Cap")
	public void user_cicks_on_explore_of_first_cap() {
		investmentScreens.user_cicks_on_explore_of_first_cap();
	}

	@Then("User should able to see Cap name")
	public void user_should_able_to_see_cap_name() {
		investmentScreens.user_should_able_to_see_cap_name();
	}

	@Then("User should able to see Corpus")
	public void user_should_able_to_see_corpus() {
		investmentScreens.user_should_able_to_see_corpus();
	}

	@Then("User should able to see Expense Ratio")
	public void user_should_able_to_see_expense_ratio() {
		investmentScreens.user_should_able_to_see_expense_ratio();
	}

	@Then("User should able to see Latest Nav")
	public void user_should_able_to_see_latest_nav() {
		investmentScreens.user_should_able_to_see_latest_nav();
	}

	@When("User clicks on Compare")
	public void user_clicks_on_compare() {
		investmentScreens.user_clicks_on_compare();
	}

	@Then("User should able to see Compare with other funds")
	public void user_should_able_to_see_Compare_with_other_funds() {
		investmentScreens.user_should_able_to_see_Compare_with_other_funds();
	}

	@When("User clicks on Top Holdings")
	public void user_clicks_on_top_holdings() {
		investmentScreens.user_clicks_on_top_holdings();
	}

	@Then("User should able to see Fund Name Sectors Instruments Assests")
	public void user_should_able_to_see_fundname_sectors_instruments_Assests() {
		investmentScreens.user_should_able_to_see_fundname_sectors_instruments_Assests();
	}

	@When("User clicks on Asset Allocation")
	public void user_clicks_on_asset_allocation() {
		investmentScreens.user_clicks_on_asset_allocation();
	}

	@Then("User should able to see Equity")
	public void user_should_able_to_see_Equity() {
		investmentScreens.user_should_able_to_see_Equity();
	}

	@Then("User should able to see Debt & others")
	public void user_should_able_to_see_Debt_others() {
		investmentScreens.user_should_able_to_see_Debt_others();
	}

	@When("User clicks on Equity")
	public void user_clicks_on_Equity() {
		investmentScreens.user_clicks_on_Equity();
	}

	@Then("User should able to see small cap mid cap large cap")
	public void user_should_able_to_see_small_cap_mid_cap_large_cap() {
		investmentScreens.user_should_able_to_see_small_cap_mid_cap_large_cap();
	}

	@When("User clicks on Debt & others")
	public void user_clicks_on_Debt_others() {
		investmentScreens.user_clicks_on_Debt_others();
	}

	@Then("User should able to see AAA")
	public void user_should_able_to_see_AAA() {
		investmentScreens.user_should_able_to_see_AAA();
	}
	
	@When("User clicks on Risk Measures")
	public void user_clicks_on_Risk_Measures() {
		investmentScreens.user_clicks_on_Risk_Measures();
	}

	 @Then("User should able to see Fund Name")
	public void user_should_able_to_see_fund_name(){
		 investmentScreens.user_should_able_to_see_fund_name();
	}
	@And("User should able to see Mean")
	public void user_should_able_to_see_Mean(){
		investmentScreens.user_should_able_to_see_Mean();

	}
	@And("User should able to see beta")
	public void user_should_able_to_see_beta(){
		investmentScreens.user_should_able_to_see_beta();

	}
	@And("User should able to see Alpha")
	public void user_should_able_to_see_Alpha(){
		investmentScreens.user_should_able_to_see_Alpha();
	}

	@When("User clicks on Others")
	public void user_clicks_on_others(){
		investmentScreens.user_clicks_on_others();
	}
	@Then("User should able to see Others plans in same fund")
	public void user_should_able_to_see_others_plans_in_same_fund(){
		investmentScreens.user_should_able_to_see_others_plans_in_same_fund();

	}
	@And("User should able to see Registrar Name")
	public void user_should_able_to_see_Registrar_Name(){
		investmentScreens.user_should_able_to_see_Registrar_Name();
		
	}

	@And("User should able to see Fund Manager")
	public void user_should_able_to_see_fund_manager(){
		investmentScreens.user_should_able_to_see_fund_manager();
	}

}
