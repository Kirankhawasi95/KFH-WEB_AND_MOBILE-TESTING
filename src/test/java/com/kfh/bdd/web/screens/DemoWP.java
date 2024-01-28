package com.kfh.bdd.web.screens;

import com.kfh.bdd.ccl.PlayActions;
import com.kfh.bdd.integrations.common_utils.ConfigReader;

public class DemoWP {

	String userName="#user-name";
	String password="#password";
	String login="#login-button";
	String menuButton="#react-burger-menu-btn";
	String sauce_labs_backpack="#add-to-cart-sauce-labs-backpack";
	String add_cart ="//a[@class='shopping_cart_link']";
	String checkout ="#checkout";
	String verify_Checkout="//span[text(='Checkout: Your Information']";
	String first_Name ="#first-name";
	String second_Name ="#last-name";
	String postal_Code ="#postal-code";
	String contiue_Button ="#continue";
	String finish_button="#finish";
	String contiue_ButtonX ="#Nothing";
	
	
	PlayActions play= new PlayActions();
	
	public void openingUrl() {
		play.openURL(ConfigReader.getValue("SwaglabURL"));
	}
	
	public void enterUsername() {
		play.sendKeys(userName, "standard_user", "User Name");
	}
	
	public void enterPass() {
		play.sendKeys(password, "secret_sauce", "Password");
	}
	
	public void login() {
		play.click(login, "Log In");
	}
	
	public void productClick() {
		play.click(sauce_labs_backpack, "back pack button");
	}
	
	public void cartClick() {
		play.click(add_cart, "Add Cart");
	}
	
	public void checkoutClick() {
		play.click(checkout, "Check Out");
	}
	
	public void enter_first_Name(String firstname)
	{
		play.sendKeys(first_Name, firstname, "First Name");
	}
	public void enter_second_Name(String secondname)
	{
		play.sendKeys(second_Name, secondname, "Second Name");
	}
	public void enter_postal_Code(String postalcode)
	{
		play.sendKeys(postal_Code,postalcode, "PIN Code");
	}
	public void clickContinue()
	{
		play.click(contiue_Button, "continue button");

	}
	public void clickFinish()
	{
		play.click(finish_button, "finish button");

	}
	public void clickContinueX()
    {
        play.click(contiue_ButtonX, "continue button");

   }
	
}
