package com.kfh.bdd.web.screens;

import com.kfh.bdd.ccl.PlayActions;
import com.kfh.bdd.integrations.common_utils.ConfigReader;

public class KFHChooseLoginNameAndPassword {
	PlayActions play = new PlayActions();
	String txt_ValidUsername = "";
	String txt_ValidPassword = "";
	String txt_ConfirmPwd = "";
	String btn_DropDown = "";
	String select_Value = "";
	String txt_Notes = "";
	String btn_SubmitLoginPWD = "";
	String txt_ThankYouMsg = "";
	String txt_LoginandPwd = "";

	public void enterValidUsername() {
		play.sendKeys(txt_ValidUsername, ConfigReader.getValue("#value"), "Valid Username");
	}

	public void enterValidPassword() {
		play.sendKeys(txt_ValidPassword, ConfigReader.getValue("#value"), "Valid Password");
	}

	public void enterConfirmPwd() {
		play.sendKeys(txt_ConfirmPwd, ConfigReader.getValue("#value"), "Valid Confirm Password");

	}

	public void clickExpiryPassword() {
		play.click(btn_DropDown, "Dropdown");

	}

	public void selectOption() {
		play.SelectOptions(select_Value, "#indexValue"); // for select tag in DOM

	}

	public void txtMessageNote() {
		play.getText(txt_Notes);

	}

	public void clickSubmitbtn() {
		play.click(btn_SubmitLoginPWD, "Submit button");

	}

	public void txtMessageThankYouRegistration() {
		play.verifyText(txt_ThankYouMsg, "Thank you for your registration");
	}

	public void txtChooseLoginandPwd() {

		play.verifyText(txt_LoginandPwd, btn_DropDown);

	}

}
