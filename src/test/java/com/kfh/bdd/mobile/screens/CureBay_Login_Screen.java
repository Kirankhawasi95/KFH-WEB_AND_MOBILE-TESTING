package com.kfh.bdd.mobile.screens;

import com.kfh.bdd.ccl.MobileActions;
import com.kfh.bdd.integrations.NG_listners.MobileEvent;
import com.kfh.bdd.integrations.common_utils.MobileUtil;

public class CureBay_Login_Screen {
	MobileActions actions = new MobileActions();
	public static String data_UDID = MobileEvent.Udid;

	public void CB_btn_Login_Sign_up() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_btn_Login_Sign_up"),
				"Login Sign-up");
	}

	public void CB_Text_Login() {
		String CB_Login = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Login"));
		actions.verifyText(CB_Login, "Login");
//		actions.verifyText(CB_Login, "Login");
	}

	public void CB_UserName_Email_or_Mobile_Number(String UserName) {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Email_or_Mobile_Number"), UserName, UserName);
	}

	public void CB_UserName_Enter_Password(String PassWord) {
		actions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Enter_Password"),
				PassWord, PassWord);
	}

	public void CB_btn_Next() throws InterruptedException  {
		switch (data_UDID) {
		case "VSWCZ5Q8U4YTCAS4":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Next"),
					"Next");
			break;
		case "ZF6223VL42":
			try {
				Thread.sleep(1000);
				actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Next"),
						"Next");
				Thread.sleep(2000);
				actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Next"),
						"Next");
				Thread.sleep(2000);
				actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Next"),
						"Next");
				
			} catch (Exception e) {
				actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Next"),
						"Next");
			}
			

			break;

		default:

			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Next"),
					"Next");

		}
	}


	public void autofill_save_Password(String Value) {
		try {
			switch (Value) {
			case "NEVER":
				actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"autofill_save_no"), "Next");
				break;
			case "SAVE":
				actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"autofill_save_yes"), "Next");
				break;
			default:
				System.out.println(" ");
				break;
			}
		} catch (Exception e) {
			System.out.println();
		}
	}

	public void CB_Text_Dashboard() {
		try {
			String CB_Dashboard = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Dashboard"));
			actions.verifyText(CB_Dashboard, "Dashboard");
		} catch (Exception e) {
			
		} 
		
//		actions.verifyText(CB_Dashboard, "Dashboard");
	}
	public void CB_user_taps_on_Sign_Out() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Sign_Out"),
				"Sign Out");
	}
	public void user_closes_and_opens_the_app() {
		actions.CloseAPP("com.curebay.medicare");
		actions.OpenAPP("com.curebay.medicare");
	}

	
}
