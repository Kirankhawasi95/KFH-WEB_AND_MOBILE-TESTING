package com.kfh.bdd.web.screens;

import com.kfh.bdd.ccl.PlayActions;
import com.kfh.bdd.integrations.common_utils.ConfigReader;

public class SignUpWebPages {
	PlayActions play = new PlayActions();
	// Civics,ATM,PIN details
		String txt_CivilID = "";
		String txt_ATMNumber = "";
		String txt_PinNumber = "";

		
		String btn_Submit = "";
		String txt_ErrMsg="";

	public void user_enters_the_in_valid(String str) {
		play.sendKeys(txt_CivilID, ConfigReader.getValue("#Values from config"), "#Values");

	}

	public void user_enters_the_in_valid_atm(String str) {
		play.sendKeys(txt_ATMNumber, ConfigReader.getValue("#ATMvalues"), "ATM Details");

	}

	public void user_enters_the_in_valid_pin(String str) {
		play.sendKeys(txt_PinNumber, ConfigReader.getValue("#PinNumber#"), "Pin Number");

	}

	public void user_should_be_able_to_see(String str) {
		String actualtxt= play.getText(txt_ErrMsg);
		play.verifyText(str,actualtxt );

	}
	
}
