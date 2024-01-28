package com.kfh.bdd.web.screens;

import com.kfh.bdd.ccl.PlayActions;
import com.kfh.bdd.integrations.common_utils.ConfigReader;
import com.microsoft.playwright.Page;

public class KFHSiteRegistrationScreens {

	PlayActions play = new PlayActions();

	String txt_validUsername = "";
	String txt_5digitAccountNumber = "";
	String btn_Login = "";
	String txt_Messge = "";
	String btn_RadioCup = "";
	String btn_Submit = "";
	String txt_SelectedImage = "";
	String txt_TitleDiscription = "";
	String btn_Submitbtn = "";
	String txt_FavHobby = "";
	String txt_GrewUp = "";
	String txt_FavAuthor = "";
	String btn_SubmitImage="";
	
	//sendkeys values
	String txt_Favauthor="";
	String txt_Grewup="";
	String txt_Favhobby="";
	String btn_Confirm="";
	String txt_Password="";
	String txt_PasswordPage="";
	String txt_LoginOTPPageMsg="";
	
	String btn_Continue="";
	String txt_KuwaitFinance="";
	String btn_RequestOTP="";
	String txt_Copycode="";
	
	Page page = play.getPage();
	Page newpage;

	public void enter5DigitAccountNumber() {
		play.sendKeys(txt_5digitAccountNumber, ConfigReader.getValue("#values#"), "5 digit of your account number");
	}

	public void enterValidUsername() {
		play.sendKeys(txt_validUsername, ConfigReader.getValue("#value#"), "Username");
	}

	public void clickLogin() {

		play.click(btn_Login, "Login Button");
	}

	public void txtMessage() {

		play.verifyText(txt_Messge, "Please choose one of the images and the click Submit:");
	}

	public void clickRadioBtn() {

		play.click(btn_RadioCup, "cup Image");
	}

	public void clickSubmitButton() {

		play.click(btn_Submit, "Submit Button");
	}

	public void ViewSelectImage() {

		play.verifyText(txt_SelectedImage, "Selected Image");
	}

	public void enterTitleDiscription() {
		play.sendKeys(txt_TitleDiscription, ConfigReader.getValue("#value#"), "#TilteValue#");
	}

	public void clickSubmitBtn() {

		play.click(btn_Submitbtn, "Submit Button");
	}

	public void txtConfirmationMessage(String value) {
		play.verifyText(value, "Please Confirm on the following information you selected");

	}

	public void enterFavhobby() {
		String value = play.getText(txt_FavHobby);
		String[] listofWords = value.split(" ");
		String lastWord = listofWords[listofWords.length - 1];// this will give the last word
		play.sendKeys(txt_Favhobby, lastWord, "Hobby"); // here we are passing the last word into the textbox.
	}

	public void enterGrewupValue() {
		String value = play.getText(txt_GrewUp);
		String[] listofWords = value.split(" ");
		String lastWord = listofWords[listofWords.length - 1];// this will give the last word
		play.sendKeys(txt_Grewup, lastWord, "Grewup"); // here we are passing the last word into the textbox.
	}

	public void enterFavAuthor() {
		String value = play.getText(txt_FavAuthor);
		String[] listofWords = value.split(" ");
		String lastWord = listofWords[listofWords.length - 1];// this will give the last word
		play.sendKeys(txt_Favauthor, lastWord, "favourite Author"); // here we are passing the last word into the textbox.

	}

	public void clickcnfMessage() {
		
		play.click(btn_Confirm,"confirm Message");
		
	}

	public void clickSubmit() {
		play.click(btn_SubmitImage,"Submit Image button");
		
	}

	public void enterPassword() {
		
		play.sendKeys(txt_Password,ConfigReader.getValue("#value"),"Passoword");
		play.click(btn_Login, "Login");
		
	}

	public void txtPasswordPage() {
		
		play.verifyText(txt_PasswordPage,"Password");
		
	}

	public void txtLoginOTPPage() {
		
		play.verifyText(txt_LoginOTPPageMsg,"Login OTP");
		
	}

	public void clickSubmitbtn() {
		
		
	}

	public void clickRequestLoginOTP() {
		
		play.click(btn_RequestOTP,"Request OTP");
	}

	public void nextTabforOTP() {	
		newpage = page.waitForPopup(() -> {
			play.getText(txt_Copycode);
		});
	}

	public void enterCode() {
		
	}

	public void clickContinueBtn() {
		
		play.click(btn_Continue,"Continue Button");
		
	}

	public void pageKuwaitFinance() {
		
		play.verifyText(txt_KuwaitFinance,"Kuwait Finance Message");
		
	}

}
