package com.kfh.bdd.mobile.screens;

import org.openqa.selenium.By;

import com.kfh.bdd.ccl.MobileActions;

public class InvestmentScreens {

	By btn_Investments = By.id("com.financialhospital.admin.finh:id/clInvestmentView");
	By btn_LargeCaps = By.xpath("//android.widget.TextView[@text='Large Cap']//parent::android.view.ViewGroup");
	By txt_MutualFunds = By.id("com.financialhospital.admin.finh:id/title");
	By txt_AllFunds = By.xpath("//android.widget.TextView[@text='All Funds']");
	By btn_Explore = By.xpath("(//android.widget.TextView[@text='Explore'])[1]");
	By txt_FundName = By.id("com.financialhospital.admin.finh:id/tvFundName");
	By clk_FundDetails = By.xpath("//android.widget.TextView[@text='Fund Details']");
	By txt_Corpus = By.id("com.financialhospital.admin.finh:id/tvFundsCorpus");
	By txt_ExpenseRatio = By.id("com.financialhospital.admin.finh:id/tvFundsExpenseRatio");
	By txt_LatestNav = By.id("com.financialhospital.admin.finh:id/tvFundsLatestNav");
	By clk_Compare = By.xpath("//android.widget.TextView[@text='Compare']");
	By txt_CompareWithOtherFunds = By.xpath("//android.widget.TextView[@text='Compare with other Funds']");
	By txt_CompareHeadings = By.id("com.financialhospital.admin.finh:id/constraintHeading");
	By txt_comparisons = By
			.xpath("(//android.view.ViewGroup[@resource-id='com.financialhospital.admin.finh:id/clParent'])");
	By clk_TopHoldings = By.xpath("//android.widget.TextView[@text='Top Holdings']");
	By clk_AssestAllocation = By.xpath("//android.widget.TextView[@text='Asset Allocation']");
	By list_TopHoldings = By.xpath(
			"//androidx.recyclerview.widget.RecyclerView[@resource-id='com.financialhospital.admin.finh:id/rvFundTopHolding']/android.view.ViewGroup");
	By clk_Equity = By.xpath("(//android.widget.TextView[contains(@text,'Equity')])[2]");
	By clk_Debits = By.xpath("//android.widget.TextView[contains(@text,'Debt & Others')]");
	By txt_Small = By.xpath("//android.widget.TextView[contains(@text,'Small cap')]");
	By txt_Smallpercent = By
			.xpath("(//android.widget.TextView[@resource-id='com.financialhospital.admin.finh:id/tvPercentage'])[1]");
	By txt_Mid = By.xpath("//android.widget.TextView[contains(@text,'Mid cap')]");
	By txt_Midpercent = By
			.xpath("(//android.widget.TextView[@resource-id='com.financialhospital.admin.finh:id/tvPercentage'])[1]");
	By txt_AAA = By.xpath("//android.widget.TextView[@text='AAA']");
	By clk_RiskMeasures = By.xpath("//android.widget.TextView[@text='Risk Measures']");
	By txt_FundName_txt = By.xpath("//android.widget.TextView[@text='Fund Name']");
	By txt_FundNane_Value = By
			.xpath("(//android.widget.TextView[@resource-id='com.financialhospital.admin.finh:id/tvFundName'])[2]");
	By txt_Mean = By.xpath("//android.widget.TextView[@text='Mean']");
	By txt_Meanpercent = By.id("com.financialhospital.admin.finh:id/tvFundMean");
	By txt_Alpha = By.xpath("//android.widget.TextView[@text='Alpha']");
	By txt_alphaPercent = By.xpath("com.financialhospital.admin.finh:id/tvFundAlpha");
	By txt_Beta = By.xpath("//android.widget.TextView[@text='Beta']");
	By txt_betaPercent = By.xpath("com.financialhospital.admin.finh:id/tvFundBeta");
	By txt_Others = By.xpath("//android.widget.TextView[@text='Others']");
	By txt_OtherPlans = By.id("com.financialhospital.admin.finh:id/tvOtherPlansStatic");
	By txt_reg = By.id("com.financialhospital.admin.finh:id/tvRegistrarNameStatic");
	By txt_regName = By.id("com.financialhospital.admin.finh:id/tvRegistrarName");
	By txt_FundManager = By.id("com.financialhospital.admin.finh:id/tvFundManagerStatic");
	By txt_FundManagerName = By.id("com.financialhospital.admin.finh:id/tvFundMangersName");
	By btn_MidCaps = By.xpath("//android.widget.TextView[@text='Mid Cap']//parent::android.view.ViewGroup");

	MobileActions actions = new MobileActions();

	public void user_clicks_on_investments() {

		actions.Click(btn_Investments, "Investments");

	}

	public void user_clicks_on_large_caps_in_category() {
		actions.Click(btn_LargeCaps, "Large Caps");

	}

	public void user_should_able_to_see_mutual_funds_screen() {
		actions.isDisplyed(txt_MutualFunds, "Mutual Funds");
	}

	public void user_should_able_to_see_all_funds() {
		actions.isDisplyed(txt_AllFunds, "All Funds");
	}

	public void user_cicks_on_explore_of_first_cap() {
		actions.Click(btn_Explore, "First Cap's Explore button");
	}

	public void user_should_able_to_see_cap_name() {
		actions.isDisplyed(txt_FundName, actions.waitForVisible(txt_FundName).getText());
	}

	public void user_should_able_to_see_corpus() {
		actions.isDisplyed(txt_Corpus, "Corpus " + actions.waitForVisible(txt_Corpus).getText());
	}

	public void user_should_able_to_see_expense_ratio() {
		actions.isDisplyed(txt_ExpenseRatio, "Expense Ratio " + actions.waitForVisible(txt_ExpenseRatio).getText());
	}

	public void user_should_able_to_see_latest_nav() {
		actions.isDisplyed(txt_LatestNav, "Latest Nav " + actions.waitForVisible(txt_LatestNav).getText());
	}

	public void user_clicks_on_compare() {
		actions.Click(clk_Compare, "Compare");

	}

	public void user_should_able_to_see_Compare_with_other_funds() {
		actions.isDisplyed(txt_CompareWithOtherFunds, "Compare with other funds");

	}

	public void user_clicks_on_top_holdings() {

		actions.Click(clk_Compare, "Compare");
		actions.Click(clk_AssestAllocation, "Assest Allocation");
		actions.Click(clk_TopHoldings, "Top Holdings");

	}

	public void user_should_able_to_see_fundname_sectors_instruments_Assests() {
		try {
			actions.getElementTextUsingFindElements(0, 4, list_TopHoldings);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void user_clicks_on_asset_allocation() {
		actions.Click(clk_Compare, "Compare");
		actions.Click(clk_AssestAllocation, "Assest Allocation");

	}

	public void user_should_able_to_see_Equity() {
		actions.isDisplyed(clk_Equity, "Equity");

	}

	public void user_should_able_to_see_Debt_others() {
		actions.isDisplyed(clk_Debits, "Debts & Others");

	}

	public void user_clicks_on_Equity() {
		actions.Click(clk_Equity, "Equity");

	}

	public void user_should_able_to_see_small_cap_mid_cap_large_cap() {
		try {
		actions.isDisplyed(txt_Small, "Small cap: " + actions.waitForVisible(txt_Smallpercent).getText());
		}catch(Exception e) {
			actions.isDisplyed(txt_Mid, "Mid cap: " + actions.waitForVisible(txt_Midpercent).getText());
		}
	}

	public void user_clicks_on_Debt_others() {
		actions.Click(clk_Debits, "Debts & Others");

	}

	public void user_should_able_to_see_AAA() {
		actions.isDisplyed(txt_AAA, "AAA: " + actions.waitForVisible(txt_Smallpercent).getText());

	}

	public void user_clicks_on_Risk_Measures() {
		actions.Click(clk_Compare, "Compare");
		actions.Click(clk_AssestAllocation, "Assest Allocation");
		actions.Click(clk_TopHoldings, "Top Holdings");
		actions.Click(clk_RiskMeasures, "Risk Measures");

	}

	public void user_should_able_to_see_fund_name() {
		actions.isDisplyed(txt_FundName_txt, "Fund Name: " + actions.waitForVisible(txt_FundNane_Value).getText());

	}

	public void user_should_able_to_see_Mean() {
		actions.isDisplyed(txt_Mean, "Mean: " + actions.waitForVisible(txt_Meanpercent).getText());

	}

	public void user_should_able_to_see_beta() {
		actions.isDisplyed(txt_Beta, "Beta: " + actions.waitForVisible(txt_betaPercent));

	}

	public void user_should_able_to_see_Alpha() {
		actions.isDisplyed(txt_Alpha, "Alpha: " + actions.waitForVisible(txt_alphaPercent));

	}

	public void user_clicks_on_others() {
		actions.Click(clk_Compare, "Compare");
		actions.Click(clk_AssestAllocation, "Assest Allocation");
		actions.Click(clk_TopHoldings, "Top Holdings");
		actions.Click(clk_RiskMeasures, "Risk Measures");
		actions.Click(txt_Others, "Others");

	}

	public void user_should_able_to_see_others_plans_in_same_fund() {
		actions.isDisplyed(txt_OtherPlans, actions.waitForVisible(txt_OtherPlans).getText());

	}

	public void user_should_able_to_see_Registrar_Name() {
		actions.isDisplyed(txt_reg,
				actions.waitForVisible(txt_reg).getText() + ": " + actions.waitForVisible(txt_regName));

	}

	public void user_should_able_to_see_fund_manager() {
		actions.isDisplyed(txt_FundManager,
				actions.waitForVisible(txt_FundManager).getText() + ": " + actions.waitForVisible(txt_FundManagerName));

	}

	public void user_clicks_on_mid_caps_in_category() {
		actions.Click(btn_MidCaps, "Mid Caps");
	}

}
