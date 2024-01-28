package com.kfh.bdd.mobile.screens;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.kfh.bdd.ccl.MobileActions;
import com.kfh.bdd.integrations.NG_listners.MobileEvent;
import com.kfh.bdd.integrations.common_utils.DriverFactory;
import com.kfh.bdd.integrations.common_utils.MobileUtil;
import com.kfh.bdd.integrations.report_utils.ReportManager;

public class CureBay_Screens {

	MobileActions actions = new MobileActions();
	public static String data_UDID = MobileEvent.Udid;
	String DataTime = DateTimeFormatter.ofPattern("MMddHHmm").format(LocalDateTime.now());
	String DataTimeMMDD = DateTimeFormatter.ofPattern("MMDD").format(LocalDateTime.now());
	String DataTimeHHmm = DateTimeFormatter.ofPattern("HHmm").format(LocalDateTime.now());

	String firstName = "Testing" + DataTimeMMDD;
	String lastName = "Area" + DataTimeHHmm;
	String profileName = firstName+" "+lastName;
//	String profileName = "Testing09 Area05";
//	String profileNameV;
	// Testing09 Area04

//	public void profileName() {
//		switch (data_UDID) {
//
//		case "VSWCZ5Q8U4YTCAS4":
//			profileName = "Testing" + DataTimeMMDD + " " + "Area" + DataTimeHHmm + " " + 11;
//			break;
//
//		case "ZF6223VL42":
//			profileName = "Testing" + DataTimeMMDD + " " + "Area" + DataTimeHHmm + " " + 10;
//			break;
//
//		default:
//			System.out.println("");
//		}
//	}

	public void printTextINFO(String info) {
		ReportManager.logInfo("Successfully get text - <b style=\"color:green;\"> : " + info + "</b>");
		System.out.println("Successfully get text - " + info);
	}

	public void wait_OS(int Seconds) throws InterruptedException {
		for (int i = 0; i <= Seconds; i++) {
			Thread.sleep(1000);
		}
	}

	public void cb_screenShotInfo() {
		try {
			wait_OS(1);
			ReportManager.logMobileScreenshot();
			wait_OS(3);
		} catch (Exception e) {
		}

	}

	public void navigatesback() {
		DriverFactory.getInstance().getMobileDriver().navigate().back();
	}

	public void getToastMessage() {
		try {
//			mobileActions.waitForVisible(By.xpath("//android.widget.Toast"));
			String toast = DriverFactory.getInstance().getMobileDriver().findElement(By.xpath("//android.widget.Toast"))
					.getText();
			System.out.println("The Toast Message is : " + toast);
			ReportManager.logInfo("Successfully get Toast Message text -<b style=\"color:green;\"> " + toast + "</b>");
		} catch (Exception e) {
			System.out.println("");
		}
	}

	public void cb_Text_CarePlans() {
		try {
			String CB_Text_CarePlans = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_CarePlans"));
//			actions.verifyText(CB_Text_CarePlans, "Care Plans");
		} catch (Exception e) {
		}

//		actions.verifyText(CB_Text_CarePlans, "Care Plans");
	}

	public void cb_Text_MedicarePlans() {
		try {
			String CB_Text_MedicarePlans = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_MedicarePlans"));
			actions.verifyText(CB_Text_MedicarePlans, "Medicare Plans");
		} catch (Exception e) {
		}

//		actions.verifyText(CB_Text_CarePlans, "Care Plans");
	}

	public void cb_swipeRighttoLeft() {
		actions.swipeRighttoLeft(10);
	}

	public void cb_Navigateup() {
		try {
			actions.Click(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_NavigateupIcon"),
					"Navigates Back Icon");
//			navigatesback();
		} catch (Exception e) {
			navigatesback();

		}
	}

	public void cb_seeLogin_Sign_up() throws InterruptedException, IOException {
		try {
			actions.waitForVisible(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_btn_Login_Sign_up"));
			String CB_btn_Login_Sign_up = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_btn_Login_Sign_up"));
//			actions.verifyText(CB_btn_Login_Sign_up, "Login / Sign-up");
		} catch (Exception e) {
			ReportManager.logMobileScreenshot();
		}

	}

	public void cb_btn_TapsMenu() {
		actions.waitForVisible(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_btn_TapsMenu"));
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_btn_TapsMenu"),
				"Menu Icon");
	}

	public void cb_btn_Menulist() throws InterruptedException {

		actions.getElementTextUsingFindElements(0, 0,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_btn_TapsMenulist"));

//		for (int i =0; i <= 10; i++) {
//			String text = DriverFactory.getInstance().getMobileDriver().findElement(By.xpath("(//android.widget.Button/android.widget.TextView)["+i+"]"))
//					.getText();
//			printTextINFO(text);
//		}
//		List<WebElement> CBbtnTapsMenulisttext = DriverFactory.getInstance().getMobileDriver()
//				.findElements(By.xpath("//android.widget.TextView//parent::android.view.ViewGroup"));
//		for(int i=11;i<CBbtnTapsMenulisttext.size();i++) {
//			String text = CBbtnTapsMenulisttext.get(i).getText();
//			System.out.println(text);
//		}
	}

	public void cb_btn_Tab_CurebayExperience() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_btn_Tab_Experience"),
				"Curebay Experience");
	}

	public void cb_Text_WelcometooureClinic() {
		String CB_Text_WelcometooureClinic = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_WelcometooureClinic"));
		actions.verifyText(CB_Text_WelcometooureClinic, "Welcome to our eClinic");
//		actions.verifyText(CB_Text_WelcometooureClinic, "Welcome to our eClinic");
	}

	public void cb_Text_Generalhealth() {
		String CB_Text_Generalhealth = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_Generalhealth"));
		actions.verifyText(CB_Text_Generalhealth, "General health");
//		actions.verifyText(CB_Text_Generalhealth, "General health");
	}

	public void cb_Click_Generalhealth() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_Generalhealth"),
				"General health");
	}

	public void cb_swipeDowns(int down) {
		actions.swipeDown(down);
	}

	public void cb_swipeUp(int Up) {
		actions.swipeUp(Up);
	}

	public void cb_ScrollSwipUP(int swipeUp) {
		actions.swipeUp(swipeUp);
	}

	public void swipekeyFeatureslists() {
		actions.swipeUp(2);
	}

	public void cb_Addtocart() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_Addtocart"),
				"Add to cart");
	}

//	public void cb_CurebayExperience_Page() throws InterruptedException {
//
//		String textPreventivehealthcare = actions.swipeUp_FindElementGetText(1, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperiencePagePreventivehealthcare"));
//		printTextINFO(textPreventivehealthcare);
//		
//		String textCurativehealthcare =	actions.swipeUp_FindElementGetText(1, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperiencePageCurativehealthcare"));
//		printTextINFO(textCurativehealthcare);
//		
//		String textAdvancedhealthcare = actions.swipeUp_FindElementGetText(1, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperiencePageAdvancedhealthcare"));
//		printTextINFO(textAdvancedhealthcare);
//		
//		String textPreventivehealthcare = 
//		printTextINFO(textPreventivehealthcare);
//		String textCurativehealthcare = 
//		printTextINFO(textCurativehealthcare);
//		String textAdvancedhealthcare = 
//		printTextINFO(textAdvancedhealthcare);
//	}
//	public void cb_CurebayExperience_Page() throws InterruptedException {
//		actions.swipeUp_FindElementGetText(1, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperiencePagePreventivehealthcare"));
//		actions.swipeUp_FindElementGetText(1, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperiencePageCurativehealthcare"));
//		actions.swipeUp_FindElementGetText(1, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperiencePageAdvancedhealthcare"));
//	}

//	
	public void cb_Text_CurebayExperienceNextGenerationSolutions() throws InterruptedException {
		actions.swipeUp_FindElementGetText(10, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_ExperienceNextGenerationSolutions"));
//		actions.swipeUp_FindElement(1,MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin","CB_Text_CurebayExperiencePageNextGenerationSolutions"));
//		actions.swipeUp_FindElement(10,MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin","CB_Text_ExperienceNextGenerationSolutions"));
//		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperienceNextGenerationSolutions"));
	}

	public void cb_Text_CurebayExperiencePatientempowerment() throws InterruptedException {
		actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperiencePatientempowerment"));
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperiencePatientempowerment"));

	}

	public void cb_Text_CurebayExperiencePreventivecare() throws InterruptedException {
		actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperiencePreventivecare"));
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperiencePreventivecare"));

	}

	public void cb_Text_CurebayExperienceOnestopshop() throws InterruptedException {
		actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperienceOnestopshop"));
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperienceOnestopshop"));

	}

	public void cb_Text_CurebayExperienceMultilateralteam() throws InterruptedException {
		actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperienceMultilateralteam"));
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperienceMultilateralteam"));

	}

	public void cb_Text_CurebayExperience24by7ConnectedCare(int valueh, int valuew) throws InterruptedException {
		int valesh = valueh;
		int valesw = valueh;
		actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperiencebyConnectedCare"));
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperiencebyConnectedCare"));
//		actions.getText(By.xpath("//android.widget.TextView[@text=\"24*7 Connected Care\"]"));
	}

	public void cb_Text_CurebayExperienceTechsmartsolutions() throws InterruptedException {

		actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Experience_Techsmartsolutions"));
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Experience_Techsmartsolutions"));
//		actions.getText(By.xpath("//android.widget.TextView[@text='Tech-smart solutions​']"));	

	}

	public void cb_taps_CurebayExperiencePatientempowerment() throws InterruptedException {
		actions.swipeDown_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperiencePatientempowerment"));
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperiencePatientempowerment"), "Patient empowerment");

//		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin","CB_ExperiencePatientempowerment"),"Patient empowerment");

	}

	public void cb_taps_CurebayExperiencePreventivecare() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperiencePreventivecare"), "Preventive care");
	}

	public void cb_taps_CurebayExperienceOnestopshop() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperienceOnestopshop"), "One-stop shop");
	}

	public void cb_taps_CurebayExperienceMultilateralteam() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperienceMultilateralteam"), "Multilateral team ");
	}

	public void cb_taps_CurebayExperience24by7ConnectedCare(int valueh, int valuew) throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ExperiencebyConnectedCare"), "24*7 Connected Care");
//		actions.swipeUp_FindElementClick(1, By.xpath("//android.widget.TextView[@text=\"24*7 Connected Care\"]"));
	}

	public void cb_taps_CurebayExperienceTechsmartsolutions() throws InterruptedException {

		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Experience_Techsmartsolutions"), "Tech-smart solutions");
//			actions.swipeUp_FindElementClick(2, By.xpath("//android.widget.TextView[@text='Tech-smart solutions​']"));

	}

	public void cb_seeinformation_CurebayExperiencePatientempowerment() throws InterruptedException {
		actions.getElementTextUsingFindElements(0, 0, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_ExperiencePatientempowermentinfo"));

//		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
//				"//android.widget.TextView[@text='Patient empowerment']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup//android.widget.TextView"));
//
//		for (int i = 0; i < seeinformation.size(); i++) {
//			String text = seeinformation.get(i).getText();
//			printTextINFO(text);
//		}
	}

	public void cb_seeinformation_CurebayExperiencePreventivecare() throws InterruptedException {

		actions.getElementTextUsingFindElements(0, 0, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_ExperiencePreventivecareinfo"));

//		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
//				"//android.widget.TextView[@text='Preventive care']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup//android.widget.TextView"));
//
//		for (int i = 0; i < seeinformation.size(); i++) {
//			String text = seeinformation.get(i).getText();
//			printTextINFO(text);
//		}
	}

	public void cb_seeinformation_CurebayExperienceOnestopshop() throws InterruptedException {
		actions.getElementTextUsingFindElements(0, 0, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB__ExperienceOnestopshopinfo"));

//		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
//				"//android.widget.TextView[@text='One-stop shop']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup//android.widget.TextView"));
//
//		for (int i = 0; i < seeinformation.size(); i++) {
//			String text = seeinformation.get(i).getText();
//			printTextINFO(text);
//		}
	}

	public void cb_seeinformation_CurebayExperienceMultilateralteam() throws InterruptedException {
		actions.getElementTextUsingFindElements(0, 0, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB__ExperienceMultilateralteaminfo"));
//		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
//				"//android.widget.TextView[@text='Multilateral team ']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup//android.widget.TextView"));
//
//		for (int i = 0; i < seeinformation.size(); i++) {
//			String text = seeinformation.get(i).getText();
//			printTextINFO(text);
//		}
	}

	public void cb_seeinformation_CurebayExperience24by7ConnectedCare() throws InterruptedException {
		actions.getElementTextUsingFindElements(0, 0, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB__ExperiencebyConnectedCareinfo"));

//		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
//				"//android.widget.TextView[@text=\"24*7 Connected Care\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup//android.widget.TextView"));
//
//		for (int i = 0; i < seeinformation.size(); i++) {
//			String text = seeinformation.get(i).getText();
//			printTextINFO(text);
//		}
	}

	public void cb_seeinformation_CurebayExperienceTechsmartsolutions​() throws InterruptedException {

		actions.getElementTextUsingFindElements(0, 0, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Experience_Techsmartsolutionsinfo"));

		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
				"//android.widget.TextView[@text='Tech-smart solutions​']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup//android.widget.TextView"));

		for (int i = 0; i < seeinformation.size(); i++) {
			String text = seeinformation.get(i).getText();
			printTextINFO(text);
		}
	}

	public void cb_CurebayExperienceOneStopHEALTHSOLUTIONS() throws InterruptedException {
//		actions.swipeUp(5);

		actions.swipeUp_FindElementGetText(15, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Experience_OneStopHEALTHSOLUTIONS"));
//			actions.swipeUp_FindElement(15,MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin","CB_Experience_OneStopHEALTHSOLUTIONS"));
//			actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//					"CB_Experience_OneStopHEALTHSOLUTIONS"), "One Stop HEALTH SOLUTIONS!");
//		actions.swipeUp_FindElementGetText(3, By.xpath("//android.widget.TextView[@text='One-stop shop']"));

	}

	public void cb_Text_ExperienceHolisticcareplans() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_ExperienceHolisticcareplans"));
//		actions.swipeUp_FindElement(2,MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin","CB_Text_ExperienceHolisticcareplans"));
//		String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperienceHolisticcareplans"));
//		actions.verifyText(text, "Holistic care plans");
//		actions.verifyText(text, "Holistic care plans");
	}

	public void cb_Text_ExperienceHolisticcareplansshortNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_ExperienceHolisticcareplansshortNote"));
//		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperienceHolisticcareplansshortNote"));
	}

	public void cb_Text_ExperienceRoundtheclockaccess() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_ExperienceRoundtheclockaccess"));
//		String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperienceRoundtheclockaccess"));
//		actions.verifyText(text, "Round the clock access");
//		actions.verifyText(text, "Round the clock access");
	}

	public void cb_Text_ExperienceRoundtheclockaccessshortNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_ExperienceRoundtheclockaccessshortNote"));
//		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperienceRoundtheclockaccessshortNote"));
	}

	public void cb_Text_ExperienceAchievehealthgoals() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_ExperienceAchievehealthgoals"));
//		String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperienceAchievehealthgoals"));
//		actions.verifyText(text, "Achieve health goals");
//		actions.verifyText(text, "Achieve health goals");
	}

	public void cb_Text_ExperienceAchievehealthgoalsshortNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_ExperienceAchievehealthgoalsshortNote"));
//		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperienceAchievehealthgoalsshortNote"));
	}

	public void cb_Text_ExperienceAlwaysstayupdated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_ExperienceAlwaysstayupdated"));
//		String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperienceAlwaysstayupdated"));
//		actions.verifyText(text, "Always stay updated");
//		actions.verifyText(text, "Always stay updated");
	}

	public void cb_Text_ExperienceAlwaysstayupdatedshortNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_ExperienceAlwaysstayupdatedshortNote"));
//		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperienceAlwaysstayupdatedshortNote"));
	}

	public void cb_Text_ExperienceAdvancedtechnology() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_ExperienceAdvancedtechnology"));
//		String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperienceAdvancedtechnology"));
//		actions.verifyText(text, "Advanced technology");
//		actions.verifyText(text, "Advanced technology");
	}

	public void cb_Text_eClinic() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_eClinic"));
	}

	public void cb_Text_eCliniccareplansshortNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_eCliniccareplansshortNote"));
	}

	public void cb_Text_Technologyplatform() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_Technologyplatform"));
	}

	public void cb_Text_TechnologyplatformshortNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_TechnologyplatformshortNote"));
	}

	public void cb_Text_Consumerapplication() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_Consumerapplication"));
	}

	public void cb_Text_ConsumerapplicationshortNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_ConsumerapplicationshortNote"));
	}

	public void cb_Text_Healthtechdevices() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_Healthtechdevices"));
	}

	public void cb_Text_HealthtechdevicesshortNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_HealthtechdevicesshortNote"));
	}

	public void cb_Text_Situationroom() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_Situationroom"));
	}

	public void cb_Text_SituationroomshortNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_SituationroomshortNote"));
	}

	public void cb_Text_Networkproviders() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_Networkproviders"));
	}

	public void cb_Text_NetworkprovidersshortNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_NetworkprovidersshortNote"));
	}

	public void cb_Text_ExperienceAdvancedtechnologyshortNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Text_ExperienceAdvancedtechnologyshortNote"));
//		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//				"CB_Text_ExperienceAdvancedtechnologyshortNote"));
	}

	public void cb_btn_Tab_Service_Partners() throws InterruptedException {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Service_Partners"),
				"Service Partners");
	}

	public void cb_Text_Service_Partners() {
		String text = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Service_Partners"));
		actions.verifyText(text, "Service Partners");
//		actions.verifyText(text, "Service Partners");
	}

	public void cb_Hospitalservicepartners() throws InterruptedException {
		actions.swipeUp_FindElementClick(1, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Hospitalservicepartners"), "Hospital service partners");
	}

	public void cb_Diagnosticlabsservicepartners() throws InterruptedException {
		actions.swipeUp_FindElementClick(1, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Diagnosticlabsservicepartners"), "Diagnostic labs service partners");
	}

	public void cb_Alliedservicepartners() throws InterruptedException {
		actions.swipeUp_FindElementClick(1, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Alliedservicepartners"), "Allied service partners");
	}

	public void cb_Ambulanceservice() throws InterruptedException {
		actions.swipeUp_FindElementClick(1,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Ambulanceservice"),
				"Ambulance service ");
	}

	public void cb_btn_Tab_Locations() throws InterruptedException {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_btn_Tab_Locations"),
				"Locations");
	}

	public void cb_Text_Location() throws InterruptedException {
		String textLocation = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_Location"));
		actions.verifyText(textLocation, "Location");
//		actions.verifyText(textLocation, "Location");
	}

	public void cb_Enter_Zipcode(String code) throws InterruptedException {

		actions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Enter_Zipcode"), code,
				code);
	}

	public void cb_Enter_Zipcode_SUBMIT() throws InterruptedException {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Enter_Zipcode_SUBMIT"),
				"SUBMIT");
	}

	public void cb_Enter_Zipcode_SUBMITAlertMessage(String Value) throws InterruptedException {
		String textMessage = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Enter_Zipcode_SUBMITAlertMessage"));
		actions.verifyText(textMessage, Value);
//		actions.verifyText(textMessage, Value);
	}

	public void cb_Enter_Zipcode_SUBMITAlertMessageOK() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Enter_Zipcode_SUBMITAlertMessageOK"), "OK");
	}

	public void cb_Enter_CureBayeClinicsfoundCount() throws InterruptedException {
		try {
			actions.waitForVisible(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Enter_CureBayeClinicsfoundCount"));
			actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Enter_CureBayeClinicsfoundCount"));
		} catch (Exception e) {
			System.out.println("CureBay eClinics found 0");
		}

	}

	public void cb_Locatione_Clinics() throws InterruptedException {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Locatione_Clinics"),
				"eClinics");
	}

	public void cb_Location_city() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Location_city"),
				"eClinics");
	}

	public void cb_Text_Location_SelectanCity() throws InterruptedException {
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Location_SelectanCity"));
	}

	public void cb_Text_Location_SelectanCity(String value) throws InterruptedException {
		String textSelectanCity = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Location_SelectanCity"));
		actions.verifyText(textSelectanCity, value);
	}

	public void cb_taps_Location_SelectanCity() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Location_SelectanCity"), "Select an City");
	}

	public void cb_taps_Location_Selectancity() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Location_Selectancity"), "Select an city");
	}

	public void cb_see_cities_in_dropdown_list​() throws InterruptedException {
		try {
			wait_OS(1);
			List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver()
					.findElements(By.xpath("//android.widget.TextView"));

			for (int i = 0; i < seeinformation.size() - 1; i++) {
				String text = seeinformation.get(i).getText();
				printTextINFO(text);
			}
		} catch (Exception e) {
		}
	
	}

	public void cb_Selects_cities_in_dropdown_list​() throws InterruptedException {
		try {
			wait_OS(1);
			List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver()
					.findElements(By.xpath("//android.widget.TextView"));
			int j = (int) (Math.random() * (seeinformation.size() - 1) + 1);
			for (int i = 1; i < seeinformation.size() - 1; i++) {
				String text = seeinformation.get(i).getText();
				if (i == j) {
					System.out.println("Random number" + j);
					actions.Click(By.xpath("//android.widget.TextView[@text='" + text + "']"), text);
					break;
				}
			}
		}catch (Exception e) {
		}
		
	}

	public void cb_taps_Map_view() throws InterruptedException {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Location_Map_View"),
				"Map View");
	}

	public void cb_Tab_AboutUs() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Tab_AboutUs"),
				"About Us");
	}

	public void cb_KeyFeatureslist() {
		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
				"//android.widget.TextView[@text='Key Features:']/following-sibling::android.widget.ScrollView//android.widget.TextView"));

		for (int i = 0; i < seeinformation.size(); i++) {
			String text = seeinformation.get(i).getText();
			printTextINFO(text);
		}
	}

	public void cb_GeneralHealth() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_GeneralHealth"),
				"General Health");
	}

	public void cb_DiabetesCare() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_DiabetesCare"),
				"Diabetes Care");
	}

	public void cb_CardiacCare() throws InterruptedException {
		actions.swipeUp_FindElementClick(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CardiacCare"),
				"Cardiac Care");
	}

	public void cb_OrthoCare() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_OrthoCare"),
				"Ortho Care");
	}

	public void cb_WomensHealth() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_WomensHealth"),
				"Womens' Health");
	}

	public void cb_GeneralHealth_shortNote() {
		actions.swipeUp(1);
		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_GeneralHealth_shortNote"));
		for (int i = 0; i < seeinformation.size(); i++) {
			String text = seeinformation.get(i).getText();
			printTextINFO(text);
		}
	}

	public void cb_CardiacCare_shortNote() {
		actions.swipeUp(1);
		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CardiacCare_shortNote"));
		for (int i = 0; i < seeinformation.size(); i++) {
			String text = seeinformation.get(i).getText();
			printTextINFO(text);
		}
	}

	public void cb_DiabetesCare_shortNote() {
		actions.swipeUp(1);
		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_DiabetesCare_shortNote"));
		for (int i = 0; i < seeinformation.size(); i++) {
			String text = seeinformation.get(i).getText();
			printTextINFO(text);
		}
	}

	public void cb_OrthoCare_shortNote() {
		actions.swipeUp(1);
		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_OrthoCare_shortNote"));
		for (int i = 0; i < seeinformation.size(); i++) {
			String text = seeinformation.get(i).getText();
			printTextINFO(text);
		}
	}

	public void cb_WomensHealth_shortNote() {
		actions.swipeUp(1);
		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_WomensHealth_shortNote"));
		for (int i = 0; i < seeinformation.size(); i++) {
			String text = seeinformation.get(i).getText();
			printTextINFO(text);
		}
	}

	public void cb_Tab_CarePlans() throws InterruptedException {
		try {
			actions.Click(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Tab_CarePlans2"),
					"Care Plans");
		} catch (Exception e) {
			actions.Click(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Tab_CarePlans"),
					"Care Plans");
		}

	}

	public void cb_Text_CarePlans(String Value) throws InterruptedException {
		String textLocation = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_Location"));
		actions.verifyText(textLocation, Value);
//		actions.verifyText(textLocation, Value);
	}

	public void user_should_able_see_General_Health_with_related_information() {
		String CB_CarePlans_GeneralHealth = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CarePlans_GeneralHealth"));
		actions.verifyText(CB_CarePlans_GeneralHealth, "General Health");
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_CarePlans_GeneralHealthInfo"));
	}

	public void user_should_able_to_see_Cardiac_Care_with_related_information() {
		String CB_CarePlans_CardiacCare = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CarePlans_CardiacCare"));
		actions.verifyText(CB_CarePlans_CardiacCare, "Cardiac Care");
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_CarePlans_CardiacCareInfo"));
	}

	public void user_should_able_to_see_Diabetes_Care_with_related_information() {
		String CB_CarePlans_DiabetesCare = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CarePlans_DiabetesCare"));
		actions.verifyText(CB_CarePlans_DiabetesCare, "Diabetes Care");
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_CarePlans_DiabetesCareInfo"));
	}

	public void user_should_able_to_see_Ortho_Care_with_related_information() {
		String CB_CarePlans_OrthoCare = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CarePlans_OrthoCare"));
		actions.verifyText(CB_CarePlans_OrthoCare, "Ortho Care");
//		actions.verifyText(CB_CarePlans_OrthoCare, Value);
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_CarePlans_OrthoCareInfo"));
	}

	public void user_should_able_to_see_Womens_Health_with_related_information() throws InterruptedException {
		actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_CarePlans_WomensHealth"));
		String CB_CarePlans_WomensHealth = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CarePlans_WomensHealth"));
		actions.verifyText(CB_CarePlans_WomensHealth, "Womens' Health ");
		actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_CarePlans_WomensHealthInfo"));
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_CarePlans_WomensHealthInfo"));
	}

	public void cb_userseeCareplansrelatedinformation(String Value) throws InterruptedException {
		switch (Value) {
		case "General Health":

			break;
		case "Cardiac Care":

			break;
		case "Diabetes Care":

			break;
		case "Ortho Care":

			break;
		case "Womens' Health ":

			break;
		default:
			System.out.println("Care Plans related information!");
			break;
		}
	}

	public void cb_CarePlans_MonthlyAddtoCart() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_CarePlans_MonthlyAddtoCart"), " Add to Cart");
	}

	public void cb_CarePlansPleaselogintocontinue() throws InterruptedException {
		String CB_CarePlansPleaselogintocontinue = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_CarePlansPleaselogintocontinue"));
		actions.verifyText(CB_CarePlansPleaselogintocontinue, "Please login to continue.");
	}

	public void cb_AddtoCartLogin() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_AddtoCartLogin"),
				"LOGIN");
	}

	public void cb_CarePlansseeloginscreen() throws InterruptedException {

		actions.waitForVisible(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Email_or_Mobile_Number"));
		String CB_Email_or_Mobile_Number = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Email_or_Mobile_Number"));
		actions.verifyText(CB_Email_or_Mobile_Number, "Email or Mobile Number");
//			actions.verifyText(CB_Email_or_Mobile_Number, "Email or Mobile Number");
		String CB_Enter_Password = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Enter_Password"));
		actions.verifyText(CB_Enter_Password, "Enter Password");
//			actions.verifyText(CB_Enter_Password, "Enter Password");

	}

	public void cb_Tabs_Doctors() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Tabs_Doctors"),
				"Doctors");
	}

	public void cb_Doctors_Specialities(String Value) throws InterruptedException {

		String CB_Doctors_Specialities = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Doctors_Specialities"));
		actions.verifyText(CB_Doctors_Specialities, Value);
//			actions.verifyText(CB_Doctors_Specialities, Value);

	}

	public void cb_Doctors_Specialities_Cardiology() throws InterruptedException {
		actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Doctors_Specialities_Cardiology"));
		String CB_Doctors_Specialities_Cardiology = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Doctors_Specialities_Cardiology"));
		actions.verifyText(CB_Doctors_Specialities_Cardiology, "Cardiology");
//		actions.verifyText(CB_Doctors_Specialities_Cardiology, "Cardiology");
	}

	public void cb_Doctors_Specialities_Dentistry() throws InterruptedException {
		actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Doctors_Specialities_Dentistry"));
		String CB_Doctors_Specialities_Dentistry = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Doctors_Specialities_Dentistry"));
		actions.verifyText(CB_Doctors_Specialities_Dentistry, "Dentistry");
//		actions.verifyText(CB_Doctors_Specialities_Dentistry, "Dentistry");
	}

	public void cb_Doctors_Specialities_Dermatology() throws InterruptedException {
		actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Doctors_Specialities_Dermatology"));
		String CB_Doctors_Specialities_Dermatology = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Doctors_Specialities_Dermatology"));
		actions.verifyText(CB_Doctors_Specialities_Dermatology, "Dermatology");
//		actions.verifyText(CB_Doctors_Specialities_Dermatology, "Dermatology");
	}

	public void cb_Doctors_Specialities_Medicine() throws InterruptedException {
		actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Doctors_Specialities_Medicine"));
		String CB_Doctors_Specialities_Medicine = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Doctors_Specialities_Medicine"));
		actions.verifyText(CB_Doctors_Specialities_Medicine, "Medicine");
//		actions.verifyText(CB_Doctors_Specialities_Medicine, "Medicine");
	}

	public void cb_Doctors_Availabledoctors() throws InterruptedException {
		String Availabledoctors = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Doctors_Specialities_Availabledoctors"));
		actions.verifyText(Availabledoctors, "Available doctors");
	}

	public void cb_Doctors_Specialities_AvailabledoctorsName() throws InterruptedException {
		String CB_Doctors_Specialities_AvailabledoctorsName = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_Doctors_Specialities_AvailabledoctorsName"));
//		actions.verifyText(CB_Doctors_Specialities_AvailabledoctorsName, "");
	}

	public void cb_Doctors_Specialities_Availabledoctorsprofession() throws InterruptedException {
		String CB_Doctors_Specialities_Availabledoctorsprofession = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_Doctors_Specialities_Availabledoctorsprofession"));
//		actions.verifyText(CB_Doctors_Specialities_Availabledoctorsprofession, "");
	}

	public void cb_Doctors_Specialities_Availabledoctorsexperience() throws InterruptedException {
		String CB_Doctors_Specialities_Availabledoctorsexperience = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_Doctors_Specialities_Availabledoctorsexperience"));
//		actions.verifyText(CB_Doctors_Specialities_Availabledoctorsexperience, "");
	}

	public void cb_Doctors_Specialities_AvailabledoctorsLocation() throws InterruptedException {
		String CB_Doctors_Specialities_AvailabledoctorsLocation = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_Doctors_Specialities_AvailabledoctorsLocation"));
//		actions.verifyText(CB_Doctors_Specialities_AvailabledoctorsLocation, "");
	}

	public void Textgetthecareyouneedwithoutleavingthehouse(String Value) throws InterruptedException {
		String CB_Doctors_Getthecareyoneedwithoutleavingthehouse = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_Doctors_Getthecareyoneedwithoutleavingthehouse"));
		actions.verifyText(CB_Doctors_Getthecareyoneedwithoutleavingthehouse, Value);
//		actions.verifyText(CB_Doctors_Getthecareyoneedwithoutleavingthehouse, Value);
	}

	public void cb_Click_See_All() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_See_All"),
				"See All");
	}

	public void user_scrolls_the_doctors_scroll_bar(int times) {
		switch (data_UDID) {
		case "VSWCZ5Q8U4YTCAS4":
			try {
				for (int i = 0; i < times; i++) {
					actions.SwipeByCoordinates(550, 750, 100, 750);
				}
			} catch (InterruptedException e) {

			}
			break;
		case "ZF6223VL42":
//			try {
//				for (int i = 0; i < times; i++) {
////					actions.SwipeByCoordinates(550, 750, 100, 750);
//				}
//			} catch (InterruptedException e) {
//				
//			}

			break;

		default:
			try {
				for (int i = 0; i < times; i++) {
					actions.SwipeByCoordinates(550, 750, 100, 750);
				}
			} catch (InterruptedException e) {

			}
		}

	}

	public void user_should_able_to_see_Receivetopnotchtreatment() {
		String CB_Doctors_Receivetopnotchtreatment = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Doctors_Receivetopnotchtreatment"));
		actions.verifyText(CB_Doctors_Receivetopnotchtreatment, "Receive top-notch treatment.");
	}

	public void user_scrolls_to_Get_the_care_you_need_without_leaving_the_home() throws InterruptedException {
		actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Doctors_Getthecareyouneedwithoutleavingthehome"));
		String CB_Doctors_Getthecareyouneedwithoutleavingthehome = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_Doctors_Getthecareyouneedwithoutleavingthehome"));
		actions.verifyText(CB_Doctors_Getthecareyouneedwithoutleavingthehome,
				"Get the care you need without leaving the home!");
	}

	public void user_should_able_see_information_on_Get_the_care_you_need_without_leaving_the_home()
			throws InterruptedException {
		try {
			actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Doctors_Getthecareyouneedwithoutleavingthehomeinfo"));
		} catch (Exception e) {
		}
	}

	public void cb_text_See_All() {
		String CB_text_See_All = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_See_All"));
		actions.verifyText(CB_text_See_All, "See All");
	}

	String SpecialitieslistText =null;;

	public void cb_All_Specialitieslist() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		List<WebElement> Specialitieslist = DriverFactory.getInstance().getMobileDriver().findElements(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_All_Specialitieslist"));
		int j = (int) (Math.random() * Specialitieslist.size());
		System.out.println("random " + j);
		for (int i = 1; i < Specialitieslist.size(); i++) {
			if (i == j) {
				if (i==0 || i == 3 || i == 4 || i == 6 || i == 9 || i == 11 || i == 12 || i >= 13) {
//					String text = Specialitieslist.get(i).getText();
					SpecialitieslistText = "ENT";
				} else {
					String text = Specialitieslist.get(i).getText();
//					String text =null;
						SpecialitieslistText = text;	
				}

				break;
			}
		}

	}

	public void cb_entersSearchSpecialitiesText() {
		if(SpecialitieslistText==null) {
			SpecialitieslistText = "ENT";
			actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Search"),
					SpecialitieslistText, SpecialitieslistText);
//			System.out.println("I Getting Null Value please check once");
		}else {
			actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Search"),
					SpecialitieslistText, SpecialitieslistText);
		}
		
	}

	public void cb_gettextsspeciality() throws InterruptedException {
		actions.getText(By.xpath("//android.widget.TextView[@text='" + SpecialitieslistText + "']"));
	}

	public void cb_Clicksspeciality() throws InterruptedException {
		Thread.sleep(3000);
		switch (data_UDID) {

		case "VSWCZ5Q8U4YTCAS4":
			actions.Click(By.xpath("//android.widget.TextView[@text='" + SpecialitieslistText + "']"),
					SpecialitieslistText);
			break;

		case "ZF6223VL42":
			actions.Click(By.xpath("//android.widget.TextView[@text='" + SpecialitieslistText + "']"),
					SpecialitieslistText);
			break;

		default:
			actions.Click(By.xpath("//android.widget.TextView[@text='" + SpecialitieslistText + "']"),
					SpecialitieslistText);
		}

	}

	public void cb_number_available_doctors_found() throws InterruptedException {

		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_number_available_doctors_found"));

	}

	String SpecialitieslistTextdoctors_name;

	public void cb_All_available_doctors_name() throws InterruptedException {

		SpecialitieslistTextdoctors_name = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_All_available_doctors_name"));

	}

	public void cb_All_available_doctors_speciality() throws InterruptedException {

		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_All_available_doctors_speciality"));

	}

	public void cb_All_available_doctors_experience() throws InterruptedException {

		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_All_available_doctors_experience"));

	}

	public void cb_All_available_doctors_location() throws InterruptedException {

		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_All_available_doctors_location"));

	}

	public void cb_All_available_doctors_VideoConsultationfee() throws InterruptedException {

		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_All_available_doctors_VideoConsultationfee"));

	}

	public void cb_All_available_doctors_Read_more() throws InterruptedException {
		try {
			actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_All_available_doctors_Read_more"));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void cb_All_available_doctors_Read_more_seeinformation() throws InterruptedException {
		try {
			actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_All_available_doctors_Read_more"));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void cb_entersSearchSpecialitiesTextdoctorsName() {

		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Search"),
				SpecialitieslistTextdoctors_name, SpecialitieslistTextdoctors_name);

	}

	public void cb_tabs_Reviews() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_tabs_Reviews"),
				"Reviews");
	}

	public void cb_Member_experience() {
		String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_tabs_Reviews_Memberexperience"));
		actions.verifyText(text, "Member experience");
	}

	public void cb_tabs_reviewer_Name() throws InterruptedException {

		actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_tabs_reviewer_Name"));

	}

	public void cb_tabs_reviewer_location() throws InterruptedException {

		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_tabs_reviewer_location"));

	}

	public void cb_tabs_reviewer_review() throws InterruptedException {

		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_tabs_reviewer_review"));

	}

	public void cb_tabs_reviewer_postedDate() throws InterruptedException {

		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_tabs_reviewer_postedDate"));

	}
//	public void user_swipes_to(String Value) throws InterruptedException {
//		switch (Value) {
//		case "Show All":
//				actions.swipeUp_FindElement(2,
//						MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_tabs_reviewer_ShowAll"));
//			break;
//		case "Show less":
//			actions.swipeUp_FindElement(10, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//					"CB_tabs_reviewer_SeeLess"));
//			break;
//		
//		default:
//			System.out.println("***About us! Screens");
//			break;
//		}

	public void cb_GetShowAll() throws InterruptedException {
		String CB_GetShowAll = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_tabs_reviewer_ShowAll"));
//		actions.verifyText(CB_GetShowAll, "Show All");
//		actions.verifySoftText(CB_GetShowAll, "Show All");
	}

	public void cb_ClicksShowAll() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_tabs_reviewer_ShowAll"), "Show All");
	}

	public void cb_Scrollsreviewer_SeeLess() throws InterruptedException {
		actions.swipeUp_FindElement(5, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_tabs_reviewer_SeeLess"));
	}

	public void cb_ClicksSeeLess() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_tabs_reviewer_SeeLess"), "See Less");
	}

	public void cb_ClicksVideo() throws InterruptedException {
		try {
			actions.Click(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_ClicksVideo"),
					"Play Video");
		} catch (Exception e) {
		}

	}

	public void cb_Tabs_Our_Team() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Tabs_Our_Team"),
				"Our Team");
	}

	public void cb_Meetthedreamers(String Value) throws InterruptedException {
		String CB_Meetthedreamers = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Meetthedreamers"));
		actions.verifyText(CB_Meetthedreamers, Value);
//		actions.verifyText(CB_Meetthedreamers, Value);
	}

	public void user_scrolls_to_Founder_CEO() throws InterruptedException {
		actions.swipeUp_FindElement(4,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CoFounderCOO"));
	}

	public void cb_FounderCEO_note() throws InterruptedException {
		actions.swipeUp_FindElement(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_FounderCEO_note"));
		actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_FounderCEO_note"));
	}

	public void cb_CoFounderCOO_note() throws InterruptedException {
		actions.swipeUp_FindElement(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CoFounderCOO_note"));
		actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CoFounderCOO_note"));
	}

	public void cb_CoFounderCTO_note() throws InterruptedException {
		actions.swipeUp_FindElement(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CoFounderCTO_note"));
		actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CoFounderCTO_note"));
	}

	public void cb_President_note() throws InterruptedException {
		actions.swipeUp_FindElement(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_President_note"));
		actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_President_note"));
	}

	public void cb_HeadStrategicPartnerships_note() throws InterruptedException {
		actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_HeadStrategicPartnerships_note"));
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_HeadStrategicPartnerships_note"));
	}

	public void cb_HeadSalesOperations_note() throws InterruptedException {
		actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_HeadSalesOperations_note"));
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_HeadSalesOperations_note"));
	}

	public void cb_HeadStrategicInitiatives_note() throws InterruptedException {
		actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_HeadStrategicInitiatives_note"));
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_HeadStrategicInitiatives_note"));
	}

	public void cb_ChiefProgramOfficer_note() throws InterruptedException {
		actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ChiefProgramOfficer_note"));
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ChiefProgramOfficer_note"));
	}

	public void cb_HeadFinance_note() throws InterruptedException {
		actions.swipeUp_FindElement(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HeadFinance_note"));
		actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HeadFinance_note"));
	}

	public void cb_OurAdvisors() throws InterruptedException {
		actions.swipeUp_FindElement(4,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Our_Advisors"));
	}

	public void cb_Our_Advisors_Bhaskar_PramanikName() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Our_Advisors_Bhaskar_Pramanik"));
	}

	public void cb_Our_Advisors_Bhaskar_PramanikNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Our_Advisors_Bhaskar_PramanikNote"));
	}
	public void cb_Our_Randy_Charles_BelcherName() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Our_Randy_Charles_Belcher"));
	}

	public void cb_Our_Randy_Charles_BelcherNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Our_Randy_Charles_BelcherNote"));
	}
	public void CB_Our_Jyotsana_KrishnanName() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Our_Jyotsana_Krishnan"));
	}

	public void CB_Our_Jyotsana_KrishnanNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Our_Jyotsana_KrishnanNote"));
	}

	public void cb_DrBirenSahooName() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_DrBirenSahoo"));
	}

	public void cb_DrBirenSahooNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_DrBirenSahooNote"));
	}

	public void cb_AshvanniSrivastavaName() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_AshvanniSrivastava"));
	}

	public void cb_AshvanniSrivastavaNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_AshvanniSrivastavaNote"));
	}

	public void cb_DrBidhanDasName() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_DrBidhanDas"));
	}

	public void cb_DrBidhanDasNote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_DrBidhanDasNote"));
	}

	public void user_should_able_to_see_Annual_health_plan_screen() {
		String CB_CarePlans_Annualhealth = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CarePlans_Annualhealth"));
		String CB_CarePlans_Annualhealthplan = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CarePlans_Annualhealthplan"));
		String textAnnualhealthplan = CB_CarePlans_Annualhealth + " " + CB_CarePlans_Annualhealthplan;
		actions.verifyText(textAnnualhealthplan, "Annual health plan");
	}

	public void user_should_able_to_see_General_Health_Care_Frequency() throws InterruptedException {
		actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_GeneralHealthCareFrequency"));
		String CB_GeneralHealthCareFrequency = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_GeneralHealthCareFrequency"));
		actions.verifyText(CB_GeneralHealthCareFrequency, "General Health Care Frequency");
	}

	public void tapsFrequencyMonthly() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Frequency_Monthly"),
				"Monthly");
	}

	public void tapsFrequencyQuarterly() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Frequency_Quarterly"),
				"Quarterly");
	}

	public void tapsFrequencyHalfYearly() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Frequency_HalfYearly"),
				"Half Yearly");
	}

	public void tapsFrequencyYearly() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Frequency_Yearly"),
				"Yearly");
	}

	public void tapsFrequencyOnDemand() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Frequency_OnDemand"),
				"On Demand");
	}

	public void swipesuptillMonthly() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(4,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Frequency_Monthly"));
		actions.verifyText(text, "Monthly");
	}

	public void swipesuptillQuarterly() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(4,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Frequency_Quarterly"));
		actions.verifyText(text, "Quarterly");
	}

	public void swipesuptillHalfYearly() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(4, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Frequency_HalfYearly"));
		actions.verifyText(text, "Half Yearly");
	}

	public void swipesuptillYearly() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(4,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Frequency_Yearly"));
		actions.verifyText(text, "Yearly");
	}

	public void swipesuptillOnDemand() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(4,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Frequency_OnDemand"));
		actions.verifyText(text, "On Demand");
	}

	public void user_should_able_to_see_Comprehensive_healthcare_plans() throws InterruptedException {
		String textComprehensive = actions.swipeUp_FindElementGetText(4,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Comprehensive"));
		String texthealthcareplans = actions.swipeUp_FindElementGetText(4,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_healthcareplans"));
		String text = textComprehensive + texthealthcareplans;
		actions.verifyText(text, " Comprehensive" + " healthcare plans.");
		actions.swipeUp(1);
	}

	public void user_should_able_to_see_eClinic_last_mile_healthcare() throws InterruptedException {

		String texteClinic = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_eClinic"));
		actions.verifyText(texteClinic, "eClinic: ");

		String textlastmile = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_lastmilehealthcare"));
		actions.verifyText(textlastmile, "last mile healthcare.");

	}

	public void user_should_able_to_see_State_of_the_art_healthcare_at_your_finger_tips() throws InterruptedException {
		String text_Stateofthearthealthcare = actions.swipeUp_FindElementGetText(4, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Stateofthearthealthcare"));
		actions.verifyText(text_Stateofthearthealthcare, " State-of-the-art healthcare");

		String text_atyourfingertips = actions.swipeUp_FindElementGetText(4,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_atyourfingertips"));
		actions.verifyText(text_atyourfingertips, " at your finger tips!");

	}

	public void cb_userseescreen(String Value) throws InterruptedException {
		switch (Value) {
		case "Hospital service partners":
			String textHospital = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Hospitalservicepartners"));
			actions.verifyText(textHospital, Value);
//				actions.verifyText(textHospital, Value);
			break;
		case "Diagnostic labs service partners":
			String textDiagnosticlabs = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Diagnosticlabsservicepartners"));
			actions.verifyText(textDiagnosticlabs, Value);
//				actions.verifyText(textDiagnosticlabs, Value);
			break;
		case "Allied service partners":
			String textAllied = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Alliedservicepartners"));
			actions.verifyText(textAllied, Value);
//				actions.verifyText(textAllied, Value);
			break;
		case "Ambulance service ":
			String textAmbulance = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Ambulanceservice"));
			actions.verifyText(textAmbulance, Value);
//				actions.verifyText(textAmbulance, Value);
			break;

		case "eClinic: ":
			String texteClinic = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_eClinic"));
			actions.verifyText(texteClinic, Value);
//				actions.verifyText(texteClinic, Value);
			break;
		case "last mile healthcare.":

			String textlastmile = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_lastmilehealthcare"));
			actions.verifyText(textlastmile, Value);
//				actions.verifyText(textlastmile, Value);
			break;
		case "Key Features:":
			String textKeyFeatures = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_KeyFeatures"));
			actions.verifyText(textKeyFeatures, Value);
//				actions.verifyText(textKeyFeatures, Value);
			break;
		case "State of the art healthcare":

			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Stateofthearthealthcare"));
			String textstatearthealthcare = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Stateofthearthealthcare"));
			actions.verifyText(textstatearthealthcare, Value);
//					actions.verifySoftText(textstatearthealthcare, Value);

			break;
		case " at your finger tips!":
			String textyourfingertips = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_atyourfingertips"));
			actions.verifyText(textyourfingertips, Value);
//				actions.verifySoftText(textyourfingertips, Value);
			break;
		case "Comprehensive healthcare plans.":
			cb_ScrollSwipUP(3);
			String textComprehensive = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Comprehensive"));
			String texthealthcareplans = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_healthcareplans."));
			String text = textComprehensive + texthealthcareplans;
			actions.verifyText(text, Value);
//				actions.verifyText(text, Value);
			break;
		case "Care Plans":
			String textLocation = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_CarePlans"));
			actions.verifyText(textLocation, Value);
//				actions.verifyText(textLocation, Value);
			break;
		case "Annual health plan":
			String CB_CarePlans_Annualhealth = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CarePlans_Annualhealth"));
			String CB_CarePlans_Annualhealthplan = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_CarePlans_Annualhealthplan"));
			String textAnnualhealthplan = CB_CarePlans_Annualhealth + " " + CB_CarePlans_Annualhealthplan;
			actions.verifyText(textAnnualhealthplan, Value);
//				actions.verifyText(textAnnualhealthplan, Value);
			break;
		case "Available doctors":
			String Availabledoctors = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Doctors_Specialities_Availabledoctors"));
			actions.verifyText(Availabledoctors, Value);
//				actions.verifyText(Availabledoctors, Value);
			break;
		case "Receive top-notch treatment.":
			String CB_Doctors_Receivetopnotchtreatment = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Doctors_Receivetopnotchtreatment"));
			actions.verifyText(CB_Doctors_Receivetopnotchtreatment, Value);
//				actions.verifyText(CB_Doctors_Receivetopnotchtreatment, Value);
			break;
		case "98%":
			actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Doctors_Satisfactionrate98"));
			String CB_Doctors_Satisfactionrate98 = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Doctors_Satisfactionrate98"));
			actions.verifyText(CB_Doctors_Satisfactionrate98, Value);
//				actions.verifyText(CB_Doctors_Satisfactionrate98, Value);
			break;
		case " Satisfaction rate":
			actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Doctors_Satisfactionrate"));
			String CB_Doctors_Satisfactionrate = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Doctors_Satisfactionrate"));
			actions.verifyText(CB_Doctors_Satisfactionrate, Value);
//				actions.verifyText(CB_Doctors_Satisfactionrate, Value);
			break;
		case "28k+":
			String CB_Doctors_RegisteredUsers28 = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Doctors_RegisteredUsers28"));
			actions.verifyText(CB_Doctors_RegisteredUsers28, Value);
//				actions.verifyText(CB_Doctors_RegisteredUsers28, Value);
			break;
		case " Registered Users ":
			String CB_Doctors_RegisteredUsers = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Doctors_RegisteredUsers"));
			actions.verifyText(CB_Doctors_RegisteredUsers, Value);
//				actions.verifyText(CB_Doctors_RegisteredUsers, Value);
			break;
		case "30+ Min":
			actions.swipeUp_FindElement(2,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Doctors_30Min"));
			String CB_Doctors_30Min = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Doctors_30Min"));
			actions.verifyText(CB_Doctors_30Min, Value);
//				actions.verifyText(CB_Doctors_30Min, Value);
			break;
		case "CureBay Doctors":
			actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Doctors_30MinCureBayDoctors"));
			String CB_Doctors_30MinCureBayDoctors = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Doctors_30MinCureBayDoctors"));
			actions.verifyText(CB_Doctors_30MinCureBayDoctors, Value);
//				actions.verifyText(CB_Doctors_30MinCureBayDoctors, Value);
			break;
		case "Less than 5 Min":
			String CB_Doctors_Lessthan5Min = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Doctors_Lessthan5Min"));
			actions.verifyText(CB_Doctors_Lessthan5Min, Value);
//				actions.verifyText(CB_Doctors_Lessthan5Min, Value);
			break;
		case "Other's Doctors":
			String CB_Doctors_Lessthan5MinOthersDoctors = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Doctors_Lessthan5MinOthersDoctors"));
			actions.verifyText(CB_Doctors_Lessthan5MinOthersDoctors, Value);
//				actions.verifyText(CB_Doctors_Lessthan5MinOthersDoctors, Value);
			break;
		case "Doctors elsewhere":
			String CB_Doctors_Lessthan5MinDoctorselsewhere = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Doctors_Lessthan5MinDoctorselsewhere"));
			actions.verifyText(CB_Doctors_Lessthan5MinDoctorselsewhere, Value);
//				actions.verifyText(CB_Doctors_Lessthan5MinOthersDoctors, Value);
			break;
		case "All Specialities":
			String CB_All_Specialities = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_All_Specialities"));
			actions.verifyText(CB_All_Specialities, Value);
//				actions.verifyText(CB_All_Specialities, Value);
//			cb_All_Specialitieslist();
			break;
		case "All available doctors":
			String CB_All_available_doctors = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_All_available_doctors"));
			actions.verifyText(CB_All_available_doctors, Value);
//				actions.verifyText(CB_All_available_doctors, Value);
			break;

		case "Hear it straight from the source":
			String CB_Hear_it_straight_from_the_source = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Hear_it_straight_from_the_source"));
			actions.verifyText(CB_Hear_it_straight_from_the_source, Value);
//				actions.verifyText(CB_Hear_it_straight_from_the_source, Value);
			break;
		case "Videos":
			String CB_Videos = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Videos"));
			actions.verifyText(CB_Videos, Value);
//				actions.verifyText(CB_Videos, Value);
			break;
		case "General Health Care Frequency":
			actions.swipeUp_FindElement(1, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_GeneralHealthCareFrequency"));
			String CB_GeneralHealthCareFrequency = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_GeneralHealthCareFrequency"));
			actions.verifyText(CB_GeneralHealthCareFrequency, Value);
//				actions.verifyText(CB_GeneralHealthCareFrequency, Value);
			break;
		case "Diabetes Care Frequency":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DiabetesCareFrequency"));
			String CB_DiabetesCareFrequency = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_DiabetesCareFrequency"));
			actions.verifyText(CB_DiabetesCareFrequency, Value);
//				actions.verifyText(CB_DiabetesCareFrequency, Value);
			break;
		case "Cardiac Care Frequency":
			actions.swipeUp_FindElement(4, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CardiacCareFrequency"));
			String CB_CardiacCareFrequency = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CardiacCareFrequency"));
			actions.verifyText(CB_CardiacCareFrequency, Value);
//				actions.verifyText(CB_CardiacCareFrequency, Value);
			break;
		case "Ortho Care Frequency":
			actions.swipeUp_FindElement(6, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OrthoCareFrequency"));
			String CB_OrthoCareFrequency = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_OrthoCareFrequency"));
			actions.verifyText(CB_OrthoCareFrequency, Value);
//				actions.verifyText(CB_OrthoCareFrequency, Value);
			break;
		case "Womens Health Care Frequency":
			actions.swipeUp_FindElement(10, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_WomensHealthCareFrequency"));
			String CB_WomensHealthCareFrequency = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_WomensHealthCareFrequency"));
			actions.verifyText(CB_WomensHealthCareFrequency, Value);
//				actions.verifyText(CB_WomensHealthCareFrequency, Value);
			break;
		case "Upcoming":
			actions.swipeUp_FindElement(1,
					MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_doctorupcome"));
			String textapp1 = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_doctorupcome"));
			actions.verifyText(textapp1, Value);
			break;
		case "Past":
			String textapp2 = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_doctorpast"));
			actions.verifyText(textapp2, Value);
			break;
		case "My Appointments":
			String textapp = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_myappointmenttxt"));
			actions.verifyText(textapp, Value);
			break;
		case "Share your reviews":
			break;
		case "Assess your health":
			break;
		case "Review":
			String textapp3 = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay", "Curebay_medicalreview"));
			actions.verifyText(textapp3, Value);
			break;
		default:
			System.out.println("Screens  !");
			break;
		}
	}

	public void user_taps_on_add_to_cart_at_box_in_Annual_health_plan(String Value) throws InterruptedException {
		switch (Value) {
		case "Pay Monthly":
			actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CarePlans_Annual_health_plan_Pay_MonthlyAddtoCart"));
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CarePlans_Annual_health_plan_Pay_MonthlyAddtoCart"), Value + " Add to Cart");
			break;
		case "Pay in Full":
			actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CarePlans_Annual_health_plan_Pay_inFullAddtoCart"));
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CarePlans_Annual_health_plan_Pay_inFullAddtoCart"), Value + " Add to Cart");
			break;
		default:
			System.out.println("About us! Screens");
			break;
		}
	}

	public void cb_user_should_able_to_seein_Annual_health_plan_screen(String Value) {
		switch (Value) {
		case "General Health":
			String CB_GeneralHealth = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_GeneralHealth"));
			actions.verifyText(CB_GeneralHealth, Value);
//				actions.verifyText(CB_GeneralHealth, Value);
			break;
		case "Cardiac Care":
			String CB_CardiacCare = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CardiacCare"));
			actions.verifyText(CB_CardiacCare, Value);
//				actions.verifyText(CB_CardiacCare, Value);
			break;
		case "Diabetes Care":
			String CB_DiabetesCare = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_DiabetesCare"));
			actions.verifyText(CB_DiabetesCare, Value);
//				actions.verifyText(CB_DiabetesCare, Value);
			break;
		case "Ortho Care":
			String CB_OrthoCare = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_OrthoCare"));
			actions.verifyText(CB_OrthoCare, Value);
//				actions.verifyText(CB_OrthoCare, Value);
			break;
		case "Womens' Health ":
			String CB_WomensHealth = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_WomensHealth"));
//				actions.verifyText(CB_WomensHealth, Value);
//				actions.verifySoftText(CB_WomensHealth, Value);
			break;
		default:
			System.out.println("About us! Screens");
			break;
		}
	}

	public void user_taps_on_General_Health() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_CarePlans_GeneralHealth"), "General Health");
	}

	public void user_taps_on(String Value) throws InterruptedException {
		switch (Value) {
		case "General Health":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CarePlans_GeneralHealth"), Value);
			break;
		case "Diabetes Care":
			actions.Click(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_DiabetesCare"),
					Value);
			break;
		case "Cardiac Care":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CarePlans_CardiacCare"), Value);
			break;
		case "Ortho Care":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CarePlans_OrthoCare"), Value);
			break;
		case "Womens' Health ":
			actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CarePlans_WomensHealth"));
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CarePlans_WomensHealth"), Value);
			break;
		default:
			System.out.println("About us! Screens");
			break;
		}
	}

	public void user_swipes_to(String Value) throws InterruptedException {
		switch (Value) {
		case "Show All":
			actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_tabs_reviewer_ShowAll"));
			break;
		case "Show less":
			actions.swipeUp_FindElement(10, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_tabs_reviewer_SeeLess"));
			break;

		default:
			System.out.println("***About us! Screens");
			break;
		}
//		actions.verifyText(CB_Doctors_Getthecareyoneedwithoutleavingthehouse, Value);

	}

	public void user_scrolls_to(String Value) throws InterruptedException {
		switch (Value) {
		case "Show All":
			actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_tabs_reviewer_ShowAll"));
			break;
		case "Show less":
			actions.swipeUp_FindElement(10, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_tabs_reviewer_SeeLess"));
			break;
		case "Get the care you need without leaving the house!":
			actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Doctors_Getthecareyoneedwithoutleavingthehouse"));
			break;
		case "Get Quality Care With Our Doctors!":
			actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Doctors_GetQualityCareWithOurDoctors"));
			break;
		case "Co-Founder & COO":
			actions.swipeUp_FindElement(4,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CoFounderCOO"));
			break;
		case "Co-Founder & CTO":
			actions.swipeUp_FindElement(4,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CoFounderCTO"));
			break;
		case "President":
			actions.swipeUp_FindElement(4,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_President"));
			break;
		case "Head - Strategic Partnerships":
			actions.swipeUp_FindElement(4, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_HeadStrategicPartnerships"));
			break;
		case "Head - Sales & Operations":
			actions.swipeUp_FindElement(4, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_HeadSalesOperations"));
			break;
		case "Head - Strategic Initiatives":
			actions.swipeUp_FindElement(4, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_HeadStrategicInitiatives"));
			break;
		case "Chief Program Officer":
			actions.swipeUp_FindElement(4, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_ChiefProgramOfficer"));
			break;
		case "Head - Finance":
			actions.swipeUp_FindElement(4,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HeadFinance"));
			break;
		default:
			System.out.println("About us! Screens");
			break;
		}
//		actions.verifyText(CB_Doctors_Getthecareyoneedwithoutleavingthehouse, Value);

	}

	public void cb_OurTeamsNames(String Value) throws InterruptedException {
		switch (Value) {
		case "Founder & CEO":
			String CB_FounderCEO = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_FounderCEO"));
			actions.verifyText(CB_FounderCEO, Value);
//				actions.verifyText(CB_FounderCEO, Value);
			String CB_FounderCEO_Name = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_FounderCEO_Name"));
			String Founder_CEO_Name = CB_FounderCEO + " -> " + CB_FounderCEO_Name;
			printTextINFO(Founder_CEO_Name);
			System.out.println(Founder_CEO_Name);
			break;
		case "Co-Founder & COO":
			String CB_CoFounderCOO = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CoFounderCOO"));
			actions.verifyText(CB_CoFounderCOO, Value);
//				actions.verifyText(CB_CoFounderCOO, Value);
			String CB_CoFounderCOO_Name = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CoFounderCOO_Name"));
			String Founder_COO_Name = CB_CoFounderCOO + " -> " + CB_CoFounderCOO_Name;
			printTextINFO(Founder_COO_Name);
			System.out.println(Founder_COO_Name);
			break;
		case "Co-Founder & CTO":
			String CB_CoFounderCTO = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CoFounderCTO"));
			actions.verifyText(CB_CoFounderCTO, Value);
//				actions.verifyText(CB_CoFounderCTO, Value);
			String CB_CoFounderCTO_Name = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CoFounderCTO_Name"));
			String Founder_CTO_Name = CB_CoFounderCTO + " -> " + CB_CoFounderCTO_Name;
			printTextINFO(Founder_CTO_Name);
			System.out.println(Founder_CTO_Name);
			break;
		case "President":
			String CB_President = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_President"));
			actions.verifyText(CB_President, Value);
//				actions.verifyText(CB_President, Value);
			String CB_President_Name = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_President_Name"));
			String CB_President_and_Name = CB_President + " -> " + CB_President_Name;
			printTextINFO(CB_President_and_Name);
			System.out.println(CB_President_and_Name);
			break;
		case "Head - Strategic Partnerships":
			String CB_HeadStrategicPartnerships = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HeadStrategicPartnerships"));
			actions.verifyText(CB_HeadStrategicPartnerships, Value);
//				actions.verifyText(CB_HeadStrategicPartnerships, Value);
			String CB_HeadStrategicPartnerships_Name = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_HeadStrategicPartnerships_Name"));
			String CB_HeadStrategicPartnershipstext = CB_HeadStrategicPartnerships + " -> "
					+ CB_HeadStrategicPartnerships_Name;
			printTextINFO(CB_HeadStrategicPartnershipstext);
			System.out.println(CB_HeadStrategicPartnershipstext);
			break;
		case "Head - Sales & Operations":
			String CB_HeadSalesOperations = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HeadSalesOperations"));
			actions.verifyText(CB_HeadSalesOperations, Value);
//				actions.verifyText(CB_HeadSalesOperations, Value);
			String CB_HeadSalesOperations_Name = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HeadSalesOperations_Name"));
			String CB_HeadSalesOperations_Nametext = CB_HeadSalesOperations + " -> " + CB_HeadSalesOperations_Name;
			printTextINFO(CB_HeadSalesOperations_Nametext);
			System.out.println(CB_HeadSalesOperations_Nametext);
			break;
		case "Head - Strategic Initiatives":
			String CB_HeadStrategicInitiatives = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HeadStrategicInitiatives"));
			actions.verifyText(CB_HeadStrategicInitiatives, Value);
//				actions.verifyText(CB_HeadStrategicInitiatives, Value);
			String CB_HeadStrategicInitiatives_Name = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_HeadStrategicInitiatives_Name"));
			String CB_HeadStrategicInitiatives_Nametext = CB_HeadStrategicInitiatives + " -> "
					+ CB_HeadStrategicInitiatives_Name;
			printTextINFO(CB_HeadStrategicInitiatives_Nametext);
			System.out.println(CB_HeadStrategicInitiatives_Nametext);
			break;
		case "Chief Program Officer":
			String CB_ChiefProgramOfficer = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_ChiefProgramOfficer"));
			actions.verifyText(CB_ChiefProgramOfficer, Value);
//				actions.verifyText(CB_ChiefProgramOfficer, Value);
			String CB_ChiefProgramOfficer_Name = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_ChiefProgramOfficer_Name"));
			String CB_ChiefProgramOfficer_Nametext = CB_ChiefProgramOfficer + " -> " + CB_ChiefProgramOfficer_Name;
			printTextINFO(CB_ChiefProgramOfficer_Nametext);
			System.out.println(CB_ChiefProgramOfficer_Nametext);
			break;
		case "Head - Finance":
			String CB_HeadFinance = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HeadFinance"));
			actions.verifyText(CB_HeadFinance, Value);
//				actions.verifyText(CB_HeadFinance, Value);
			String CB_HeadFinance_Name = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HeadFinance_Name"));
			String CB_HeadFinance_Nametext = CB_HeadFinance + " -> " + CB_HeadFinance_Name;
			printTextINFO(CB_HeadFinance_Nametext);
			System.out.println(CB_HeadFinance_Nametext);
			break;

		default:
			System.out.println("Our Team! Screens");
			break;
		}
	}

	public void swipesuptillGeneralHealthCareFrequency(String Value) throws InterruptedException {
		switch (Value) {
		case "Monthly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_GeneralHealthCareFrequencyMonthly"));
			String CB_GeneralHealthCareFrequencyMonthly = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_GeneralHealthCareFrequencyMonthly"));
			actions.verifyText(CB_GeneralHealthCareFrequencyMonthly, Value);
//				actions.verifySoftText(CB_GeneralHealthCareFrequencyMonthly, Value);
			break;
		case "Quarterly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_GeneralHealthCareFrequencyQuarterly"));
			String CB_GeneralHealthCareFrequencyQuarterly = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_GeneralHealthCareFrequencyQuarterly"));
			actions.verifyText(CB_GeneralHealthCareFrequencyQuarterly, Value);
//				actions.verifySoftText(CB_GeneralHealthCareFrequencyQuarterly, Value);
			break;
		case "Half Yearly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_GeneralHealthCareFrequencyHalfYearly"));
			String CB_GeneralHealthCareFrequencyHalfYearly = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_GeneralHealthCareFrequencyHalfYearly"));
			actions.verifyText(CB_GeneralHealthCareFrequencyHalfYearly, Value);
//				actions.verifySoftText(CB_GeneralHealthCareFrequencyHalfYearly, Value);
			break;
		case "Yearly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_GeneralHealthCareFrequencyYearly"));
			String CB_GeneralHealthCareFrequencyYearly = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_GeneralHealthCareFrequencyYearly"));
			actions.verifyText(CB_GeneralHealthCareFrequencyYearly, Value);
//				actions.verifySoftText(CB_GeneralHealthCareFrequencyYearly, Value);
			break;
		case "On Demand":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_GeneralHealthCareFrequencyOnDemand"));
			String CB_GeneralHealthCareFrequencyOnDemand = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_GeneralHealthCareFrequencyOnDemand"));
			actions.verifyText(CB_GeneralHealthCareFrequencyOnDemand, Value);
//				actions.verifySoftText(CB_GeneralHealthCareFrequencyOnDemand, Value);
			break;
		default:
			System.out.println("Frequency! Screens");
			break;
		}
	}

	public void tapsGeneralHealthCareFrequency(String Value) throws InterruptedException {
		switch (Value) {
		case "Monthly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_GeneralHealthCareFrequencyMonthly"), Value);
			break;
		case "Quarterly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_GeneralHealthCareFrequencyQuarterly"), Value);
			break;
		case "Half Yearly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_GeneralHealthCareFrequencyHalfYearly"), Value);
			break;
		case "Yearly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_GeneralHealthCareFrequencyYearly"), Value);
			break;
		case "On Demand":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_GeneralHealthCareFrequencyOnDemand"), Value);
			break;
		default:
			System.out.println("Our Team! Screens");
			break;
		}
	}

	public void swipesuptillOrthoCareFrequency(String Value) throws InterruptedException {
		switch (Value) {
		case "Monthly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OrthoCareFrequencyMonthly"));
			String CB_OrthoCareFrequencyMonthly = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_OrthoCareFrequencyMonthly"));
			actions.verifyText(CB_OrthoCareFrequencyMonthly, Value);
//				actions.verifyText(CB_OrthoCareFrequencyMonthly, Value);
			break;
		case "Quarterly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OrthoCareFrequencyQuarterly"));
			String CB_OrthoCareFrequencyQuarterly = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_OrthoCareFrequencyQuarterly"));
			actions.verifyText(CB_OrthoCareFrequencyQuarterly, Value);
//				actions.verifySoftText(CB_OrthoCareFrequencyQuarterly, Value);
			break;
		case "Half Yearly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OrthoHealthCareFrequencyHalfYearly"));
			String CB_OrthoHealthCareFrequencyHalfYearly = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_OrthoHealthCareFrequencyHalfYearly"));
			actions.verifyText(CB_OrthoHealthCareFrequencyHalfYearly, Value);
//				actions.verifyText(CB_OrthoHealthCareFrequencyHalfYearly, Value);
			break;
		case "Yearly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OrthoHealthCareFrequencyYearly"));
			String CB_OrthoHealthCareFrequencyYearly = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_OrthoHealthCareFrequencyYearly"));
			actions.verifyText(CB_OrthoHealthCareFrequencyYearly, Value);
//				actions.verifyText(CB_OrthoHealthCareFrequencyYearly, Value);
			break;
		case "On Demand":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OrthoCareFrequencyOnDemand"));
			String CB_OrthoCareFrequencyOnDemand = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_OrthoCareFrequencyOnDemand"));
			actions.verifyText(CB_OrthoCareFrequencyOnDemand, Value);
//				actions.verifyText(CB_OrthoCareFrequencyOnDemand, Value);
			break;
		default:
			System.out.println("Frequency! Screens");
			break;
		}
	}

	public void tapsOrthoCareFrequency(String Value) throws InterruptedException {
		switch (Value) {
		case "Monthly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OrthoCareFrequencyMonthly"), Value);
			break;
		case "Quarterly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OrthoCareFrequencyQuarterly"), Value);
			break;
		case "Half Yearly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OrthoHealthCareFrequencyHalfYearly"), Value);
			break;
		case "Yearly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OrthoHealthCareFrequencyYearly"), Value);
			break;
		case "On Demand":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OrthoHealthCareFrequencyOnDemand"), Value);
			break;
		default:
			System.out.println("Ortho Care Frequency! Screens");
			break;
		}
	}

	public void tapsWomensHealthCareFrequency(String Value) throws InterruptedException {
		switch (Value) {
		case "Monthly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_WomensHealthCareFrequencyMonthly"), Value);
			break;
		case "Quarterly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_WomensHealthCareFrequencyQuarterly"), Value);
			break;
		case "Half Yearly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_WomensHealthCareFrequencyHalfYearly"), Value);
			break;
		case "Yearly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_WomensHealthCareFrequencyYearly"), Value);
			break;
		case "On Demand":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_WomensHealthCareFrequencyOnDemand"), Value);
			break;
		default:
			System.out.println("Ortho Care Frequency! Screens");
			break;
		}
	}

	public void swipesuptillWomensHealthCareFrequency(String Value) throws InterruptedException {
		switch (Value) {
		case "Monthly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_WomensHealthCareFrequencyMonthly"));
			String CB_WomensHealthCareFrequencyMonthly = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_WomensHealthCareFrequencyMonthly"));
			actions.verifyText(CB_WomensHealthCareFrequencyMonthly, Value);
//				actions.verifyText(CB_WomensHealthCareFrequencyMonthly, Value);
			break;
		case "Quarterly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_WomensHealthCareFrequencyQuarterly"));
			String CB_WomensHealthCareFrequencyQuarterly = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_WomensHealthCareFrequencyQuarterly"));
			actions.verifyText(CB_WomensHealthCareFrequencyQuarterly, Value);
//				actions.verifySoftText(CB_WomensHealthCareFrequencyQuarterly, Value);
			break;
		case "Half Yearly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_WomensHealthCareFrequencyHalfYearly"));
			String CB_WomensHealthCareFrequencyHalfYearly = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_WomensHealthCareFrequencyHalfYearly"));
			actions.verifyText(CB_WomensHealthCareFrequencyHalfYearly, Value);
//				actions.verifyText(CB_WomensHealthCareFrequencyHalfYearly, Value);
			break;
		case "Yearly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_WomensHealthCareFrequencyYearly"));
			String CB_WomensHealthCareFrequencyYearly = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_WomensHealthCareFrequencyYearly"));
			actions.verifyText(CB_WomensHealthCareFrequencyYearly, Value);
//				actions.verifyText(CB_WomensHealthCareFrequencyYearly, Value);
			break;
		case "On Demand":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_WomensHealthCareFrequencyOnDemand"));
			String CB_WomensHealthCareFrequencyOnDemand = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_WomensHealthCareFrequencyOnDemand"));
			actions.verifyText(CB_WomensHealthCareFrequencyOnDemand, Value);
//				actions.verifyText(CB_WomensHealthCareFrequencyOnDemand, Value);
			break;
		default:
			System.out.println("Frequency! Screens");
			break;
		}
	}

	public void usershouldabletoseeHealthCareFrequencywithshortnote(String Value) throws InterruptedException {

		switch (Value) {
		case "Periodic visits for health assessment":
//				actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//						"CB_Periodiccallsforhealthassessmentshortnote"));
//				String CB_Periodiccallsforhealthassessment = actions
//						.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//								"CB_Periodiccallsforhealthassessment"));
			String CB_Periodicvisitsforhealthassessment = actions.swipeUp_FindElementGetText(3,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Periodicvisitsforhealthassessment"));
			actions.verifyText(CB_Periodicvisitsforhealthassessment, Value);
//				actions.verifyText(CB_Periodicvisitsforhealthassessment, Value);
			String CB_Periodicvisitsforhealthassessmentshortnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Periodicvisitsforhealthassessmentshortnote"));
			String CB_Periodicvisitsforhealthassessmenttext = CB_Periodicvisitsforhealthassessment + " -> "
					+ CB_Periodicvisitsforhealthassessmentshortnote;
			printTextINFO(CB_Periodicvisitsforhealthassessmenttext);
			System.out.println(CB_Periodicvisitsforhealthassessmenttext);
			break;
		case "Detailed annual check-up and care - Nutritionist":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DetailedannualcheckupandcareNutritionistshortnote"));
//				String CB_Periodiccallsforhealthassessment = actions
//						.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//								"CB_Periodiccallsforhealthassessment"));
			String CB_DetailedannualcheckupandcareNutritionist = actions.swipeUp_FindElementGetText(3,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_DetailedannualcheckupandcareNutritionist"));
			actions.verifyText(CB_DetailedannualcheckupandcareNutritionist, Value);
//				actions.verifyText(CB_Periodicvisitsforhealthassessment, Value);
			String CB_DetailedannualcheckupandcareNutritionistshortnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_DetailedannualcheckupandcareNutritionistshortnote"));
			String CB_DetailedannualcheckupandcareNutritionistshortnotetext = CB_DetailedannualcheckupandcareNutritionist
					+ " -> " + CB_DetailedannualcheckupandcareNutritionistshortnote;
			printTextINFO(CB_DetailedannualcheckupandcareNutritionistshortnotetext);
			System.out.println(CB_DetailedannualcheckupandcareNutritionistshortnotetext);
			break;
		case "Detailed annual check-up and care - Physiotherapist":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DetailedannualcheckupandcarePhysiotherapistshortnote"));
//				String CB_Periodiccallsforhealthassessment = actions
//						.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//								"CB_Periodiccallsforhealthassessment"));
			String CB_DetailedannualcheckupandcarePhysiotherapist = actions.swipeUp_FindElementGetText(3,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_DetailedannualcheckupandcarePhysiotherapist"));
			actions.verifyText(CB_DetailedannualcheckupandcarePhysiotherapist, Value);
//				actions.verifyText(CB_Periodicvisitsforhealthassessment, Value);
			String CB_DetailedannualcheckupandcarePhysiotherapistshortnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_DetailedannualcheckupandcarePhysiotherapistshortnote"));
			String CB_DetailedannualcheckupandcarePhysiotherapistshortnotetext = CB_DetailedannualcheckupandcarePhysiotherapist
					+ " -> " + CB_DetailedannualcheckupandcarePhysiotherapistshortnote;
			printTextINFO(CB_DetailedannualcheckupandcarePhysiotherapistshortnotetext);
			System.out.println(CB_DetailedannualcheckupandcarePhysiotherapistshortnotetext);
			break;
		case "Detailed annual check-up and care - Health educator":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DetailedannualcheckupandcareHealtheducatorshortnote"));
//				String CB_Periodiccallsforhealthassessment = actions
//						.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//								"CB_Periodiccallsforhealthassessment"));
			String CB_DetailedannualcheckupandcareHealtheducator = actions.swipeUp_FindElementGetText(3,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_DetailedannualcheckupandcareHealtheducator"));
			actions.verifyText(CB_DetailedannualcheckupandcareHealtheducator, Value);
//				actions.verifyText(CB_Periodicvisitsforhealthassessment, Value);
			String CB_DetailedannualcheckupandcareHealtheducatorshortnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_DetailedannualcheckupandcareHealtheducatorshortnote"));
			String CB_DetailedannualcheckupandcareHealtheducatorshortnotetext = CB_DetailedannualcheckupandcareHealtheducator
					+ " -> " + CB_DetailedannualcheckupandcareHealtheducatorshortnote;
			printTextINFO(CB_DetailedannualcheckupandcareHealtheducatorshortnotetext);
			System.out.println(CB_DetailedannualcheckupandcareHealtheducatorshortnotetext);
			break;
		case "Annual outcome - Lab test":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_AnnualoutcomeLabtestshortnote"));
//				String CB_Periodiccallsforhealthassessment = actions
//						.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//								"CB_Periodiccallsforhealthassessment"));
			String CB_AnnualoutcomeLabtest = actions.swipeUp_FindElementGetText(3, MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_AnnualoutcomeLabtest"));
			actions.verifyText(CB_AnnualoutcomeLabtest, Value);
//				actions.verifyText(CB_Periodicvisitsforhealthassessment, Value);
			String CB_AnnualoutcomeLabtestshortnote = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_AnnualoutcomeLabtestshortnote"));
			String CB_AnnualoutcomeLabtestshortnotetext = CB_AnnualoutcomeLabtest + " -> "
					+ CB_AnnualoutcomeLabtestshortnote;
			printTextINFO(CB_AnnualoutcomeLabtestshortnotetext);
			System.out.println(CB_AnnualoutcomeLabtestshortnotetext);
			break;
		case "Annual outcome - In-Person Nurse visit":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_AnnualoutcomeInPersonNursevisitshortnote"));
//				String CB_Periodiccallsforhealthassessment = actions
//						.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//								"CB_Periodiccallsforhealthassessment"));
			String CB_AnnualoutcomeInPersonNursevisit = actions.swipeUp_FindElementGetText(3,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_AnnualoutcomeInPersonNursevisit"));
			actions.verifyText(CB_AnnualoutcomeInPersonNursevisit, Value);
//				actions.verifyText(CB_Periodicvisitsforhealthassessment, Value);
			String CB_AnnualoutcomeInPersonNursevisitshortnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_AnnualoutcomeInPersonNursevisitshortnote"));
			String CB_AnnualoutcomeInPersonNursevisitshortnotetext = CB_AnnualoutcomeInPersonNursevisit + " -> "
					+ CB_AnnualoutcomeInPersonNursevisitshortnote;
			printTextINFO(CB_AnnualoutcomeInPersonNursevisitshortnotetext);
			System.out.println(CB_AnnualoutcomeInPersonNursevisitshortnotetext);
			break;
		case "Annual outcome - General Physician":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_AnnualoutcomeGeneralPhysicianshortnote"));
//				String CB_Periodiccallsforhealthassessment = actions
//						.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//								"CB_Periodiccallsforhealthassessment"));
			String CB_AnnualoutcomeGeneralPhysician = actions.swipeUp_FindElementGetText(3,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_AnnualoutcomeGeneralPhysician"));
			actions.verifyText(CB_AnnualoutcomeGeneralPhysician, Value);
//				actions.verifyText(CB_Periodicvisitsforhealthassessment, Value);
			String CB_AnnualoutcomeGeneralPhysicianshortnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_AnnualoutcomeGeneralPhysicianshortnote"));
			String CB_AnnualoutcomeGeneralPhysicianshortnotetext = CB_AnnualoutcomeGeneralPhysician + " -> "
					+ CB_AnnualoutcomeGeneralPhysicianshortnote;
			printTextINFO(CB_AnnualoutcomeGeneralPhysicianshortnotetext);
			System.out.println(CB_AnnualoutcomeGeneralPhysicianshortnotetext);
			break;
		case "Monthly care & assessment":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Monthlycareassessmentnote"));
//				String CB_Periodiccallsforhealthassessment = actions
//						.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//								"CB_Periodiccallsforhealthassessment"));
			String CB_Monthlycareassessment = actions.swipeUp_FindElementGetText(3, MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Monthlycareassessment"));
			actions.verifyText(CB_Monthlycareassessment, Value);
//				actions.verifyText(CB_Periodicvisitsforhealthassessment, Value);
			String CB_Monthlycareassessmentnote = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Monthlycareassessmentnote"));
			String CB_Monthlycareassessmentnotetext = CB_Monthlycareassessment + " -> " + CB_Monthlycareassessmentnote;
			printTextINFO(CB_Monthlycareassessmentnotetext);
			System.out.println(CB_Monthlycareassessmentnotetext);
			break;
		case "Other check-ups - In-Person Nurse visit":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OthercheckupsInPersonNursevisitnote"));
//				String CB_Periodiccallsforhealthassessment = actions
//						.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//								"CB_Periodiccallsforhealthassessment"));
			String CB_OthercheckupsInPersonNursevisit = actions.swipeUp_FindElementGetText(3,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_OthercheckupsInPersonNursevisit"));
			actions.verifyText(CB_OthercheckupsInPersonNursevisit, Value);
//				actions.verifyText(CB_Periodicvisitsforhealthassessment, Value);
			String CB_OthercheckupsInPersonNursevisitnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_OthercheckupsInPersonNursevisitnote"));
			String CB_OthercheckupsInPersonNursevisitnotetext = CB_OthercheckupsInPersonNursevisit + " -> "
					+ CB_OthercheckupsInPersonNursevisitnote;
			printTextINFO(CB_OthercheckupsInPersonNursevisitnotetext);
			System.out.println(CB_OthercheckupsInPersonNursevisitnotetext);
			break;
		case "Annual assessment and care - Nutritionist":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_AnnualassessmentandcareNutritionistnote"));
//				String CB_Periodiccallsforhealthassessment = actions
//						.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//								"CB_Periodiccallsforhealthassessment"));
			String CB_AnnualassessmentandcareNutritionist = actions.swipeUp_FindElementGetText(3,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_AnnualassessmentandcareNutritionist"));
			actions.verifyText(CB_AnnualassessmentandcareNutritionist, Value);
//				actions.verifyText(CB_Periodicvisitsforhealthassessment, Value);
			String CB_AnnualassessmentandcareNutritionistnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_AnnualassessmentandcareNutritionistnote"));
			String CB_AnnualassessmentandcareNutritionistnotetext = CB_AnnualassessmentandcareNutritionist + " -> "
					+ CB_AnnualassessmentandcareNutritionistnote;
			printTextINFO(CB_AnnualassessmentandcareNutritionistnotetext);
			System.out.println(CB_AnnualassessmentandcareNutritionistnotetext);
			break;
		case "Paramedical care - In-Person Nurse visit":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_ParamedicalcareInPersonNursevisitshortnote"));
//				String CB_Periodiccallsforhealthassessment = actions
//						.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//								"CB_Periodiccallsforhealthassessment"));
			String CB_ParamedicalcareInPersonNursevisit = actions.swipeUp_FindElementGetText(3,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_ParamedicalcareInPersonNursevisit"));
			actions.verifyText(CB_ParamedicalcareInPersonNursevisit, Value);
//				actions.verifyText(CB_Periodicvisitsforhealthassessment, Value);
			String CB_ParamedicalcareInPersonNursevisitshortnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_ParamedicalcareInPersonNursevisitshortnote"));
			String CB_ParamedicalcareInPersonNursevisittext = CB_ParamedicalcareInPersonNursevisit + " -> "
					+ CB_ParamedicalcareInPersonNursevisitshortnote;
			printTextINFO(CB_ParamedicalcareInPersonNursevisittext);
			System.out.println(CB_ParamedicalcareInPersonNursevisittext);
			break;
		case "Annual assessment and care - Physiotherapist":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_AnnualassessmentandcarePhysiotherapistnote"));
//				String CB_Periodiccallsforhealthassessment = actions
//						.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//								"CB_Periodiccallsforhealthassessment"));
			String CB_AnnualassessmentandcarePhysiotherapist = actions.swipeUp_FindElementGetText(3,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_AnnualassessmentandcarePhysiotherapist"));
			actions.verifyText(CB_AnnualassessmentandcarePhysiotherapist, Value);
//				actions.verifyText(CB_Periodicvisitsforhealthassessment, Value);
			String CB_AnnualassessmentandcarePhysiotherapistnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_ParamedicalcareInPersonNursevisitshortnote"));
			String CB_AnnualassessmentandcarePhysiotherapistnotetext = CB_AnnualassessmentandcarePhysiotherapist
					+ " -> " + CB_AnnualassessmentandcarePhysiotherapistnote;
			printTextINFO(CB_AnnualassessmentandcarePhysiotherapistnotetext);
			System.out.println(CB_AnnualassessmentandcarePhysiotherapistnotetext);
			break;
		case "Annual assessment and care - Health educator":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_AnnualassessmentandcareHealtheducatornote"));
//				String CB_Periodiccallsforhealthassessment = actions
//						.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//								"CB_Periodiccallsforhealthassessment"));
			String CB_AnnualassessmentandcareHealtheducator = actions.swipeUp_FindElementGetText(3,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_AnnualassessmentandcareHealtheducator"));
			actions.verifyText(CB_AnnualassessmentandcareHealtheducator, Value);
//				actions.verifyText(CB_Periodicvisitsforhealthassessment, Value);
			String CB_AnnualassessmentandcareHealtheducatornote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_AnnualassessmentandcareHealtheducatornote"));
			String CB_AnnualassessmentandcareHealtheducatornotetext = CB_AnnualassessmentandcareHealtheducator + " -> "
					+ CB_AnnualassessmentandcareHealtheducatornote;
			printTextINFO(CB_AnnualassessmentandcareHealtheducatornotetext);
			System.out.println(CB_AnnualassessmentandcareHealtheducatornotetext);
			break;
		case "Annual outcome - lab tests":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Annualoutcomelabtestsnote"));
//				String CB_Periodiccallsforhealthassessment = actions
//						.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//								"CB_Periodiccallsforhealthassessment"));
			String CB_Annualoutcomelabtests = actions.swipeUp_FindElementGetText(3, MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Annualoutcomelabtests"));
			actions.verifyText(CB_Annualoutcomelabtests, Value);
//				actions.verifyText(CB_Periodicvisitsforhealthassessment, Value);
			String CB_Annualoutcomelabtestsnote = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Annualoutcomelabtestsnote"));
			String CB_Annualoutcomelabtestsnotetext = CB_Annualoutcomelabtests + " -> " + CB_Annualoutcomelabtestsnote;
			printTextINFO(CB_Annualoutcomelabtestsnotetext);
			System.out.println(CB_Annualoutcomelabtestsnotetext);
			break;
		case "Paramedical care - Health educator":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_ParamedicalcareHealtheducatorshortnote"));
			String CB_ParamedicalcareHealtheducator = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_ParamedicalcareHealtheducator"));
			actions.verifyText(CB_ParamedicalcareHealtheducator, Value);
//				actions.verifyText(CB_Fullhealthcheckupandcare, Value);
			String CB_ParamedicalcareHealtheducatorshortnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_ParamedicalcareHealtheducatorshortnote"));
			String CB_ParamedicalcareHealtheducatorshortnotetext = CB_ParamedicalcareHealtheducator + " -> "
					+ CB_ParamedicalcareHealtheducatorshortnote;
			printTextINFO(CB_ParamedicalcareHealtheducatorshortnotetext);
			System.out.println(CB_ParamedicalcareHealtheducatorshortnotetext);
			break;
		case "Paramedical care - Health Educator":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_ParamedicalcareHealthEducatorshortnote"));
			String CB_ParamedicalcareHealthEducator = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_ParamedicalcareHealthEducator"));
			actions.verifyText(CB_ParamedicalcareHealthEducator, Value);
//				actions.verifyText(CB_Fullhealthcheckupandcare, Value);
			String CB_ParamedicalcareHealthEducatorshortnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_ParamedicalcareHealthEducatorshortnote"));
			String CB_ParamedicalcareHealthEducatorshortnotetext = CB_ParamedicalcareHealthEducator + " -> "
					+ CB_ParamedicalcareHealthEducatorshortnote;
			printTextINFO(CB_ParamedicalcareHealthEducatorshortnotetext);
			System.out.println(CB_ParamedicalcareHealthEducatorshortnotetext);
			break;
		case "Other check-ups - Health educator":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OthercheckupsHealtheducatorshortnote"));
			String CB_OthercheckupsHealtheducator = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_OthercheckupsHealtheducator"));
			actions.verifyText(CB_OthercheckupsHealtheducator, Value);
			String CB_OthercheckupsHealtheducatorshortnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_OthercheckupsHealtheducatorshortnote"));
			String CB_OthercheckupsHealtheducatorshortnotetext = CB_OthercheckupsHealtheducator + " -> "
					+ CB_OthercheckupsHealtheducatorshortnote;
			printTextINFO(CB_OthercheckupsHealtheducatorshortnotetext);
			System.out.println(CB_OthercheckupsHealtheducatorshortnotetext);
			break;
		case "Other check-ups - Health Educator":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OthercheckupsHealthEducatorshortnote"));
			String CB_OthercheckupsHealthEducator = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_OthercheckupsHealthEducator"));
			actions.verifyText(CB_OthercheckupsHealthEducator, Value);
			String CB_OthercheckupsHealthEducatorshortnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_OthercheckupsHealthEducatorshortnote"));
			String CB_OthercheckupsHealthEducatorshortnotetext = CB_OthercheckupsHealthEducator + " -> "
					+ CB_OthercheckupsHealthEducatorshortnote;
			printTextINFO(CB_OthercheckupsHealthEducatorshortnotetext);
			System.out.println(CB_OthercheckupsHealthEducatorshortnotetext);
			break;
		case "Other check-ups - Nurse":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OthercheckupsNurseshortnote"));
			String CB_OthercheckupsNurse = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_OthercheckupsNurse"));
			actions.verifyText(CB_OthercheckupsNurse, Value);
			String CB_OthercheckupsNurseshortnote = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_OthercheckupsNurseshortnote"));
			String CB_OthercheckupsNurseshortnotetext = CB_OthercheckupsNurse + " -> " + CB_OthercheckupsNurseshortnote;
			printTextINFO(CB_OthercheckupsNurseshortnotetext);
			System.out.println(CB_OthercheckupsNurseshortnotetext);
			break;
		case "Speciality care and referral":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CB_Specialitycareandreferralnote"));
			String CB_Specialitycareandreferral = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Specialitycareandreferral"));
			actions.verifyText(CB_Specialitycareandreferral, Value);
//				actions.verifyText(CB_Specialitycareandreferral, Value);
			String CB_CB_Specialitycareandreferralnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_CB_Specialitycareandreferralnote"));
			String CB_CB_Specialitycareandreferraltext = CB_Specialitycareandreferral + " -> "
					+ CB_CB_Specialitycareandreferralnote;
			printTextINFO(CB_CB_Specialitycareandreferraltext);
			System.out.println(CB_CB_Specialitycareandreferraltext);
			break;
		case "Other check-ups - Physiotherapist":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OthercheckupsPhysiotherapistshortnote"));
			String CB_OthercheckupsPhysiotherapist = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_OthercheckupsPhysiotherapist"));
			actions.verifyText(CB_OthercheckupsPhysiotherapist, Value);
			String CB_OthercheckupsPhysiotherapistshortnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_OthercheckupsPhysiotherapistshortnote"));
			String CB_OthercheckupsPhysiotherapistshortnotetext = CB_OthercheckupsPhysiotherapist + " -> "
					+ CB_OthercheckupsPhysiotherapistshortnote;
			printTextINFO(CB_OthercheckupsPhysiotherapistshortnotetext);
			System.out.println(CB_OthercheckupsPhysiotherapistshortnotetext);
			break;
		case "Other check-ups - Nutritionist":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_OthercheckupsNutritionistshortnote"));
			String CB_OthercheckupsNutritionist = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_OthercheckupsNutritionist"));
			actions.verifyText(CB_OthercheckupsNutritionist, Value);
			String CB_OthercheckupsNutritionistshortnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_OthercheckupsNutritionistshortnote"));
			String CB_OthercheckupsNutritionistshortnotetext = CB_OthercheckupsNutritionist + " -> "
					+ CB_OthercheckupsNutritionistshortnote;
			printTextINFO(CB_OthercheckupsNutritionistshortnotetext);
			System.out.println(CB_OthercheckupsNutritionistshortnotetext);
			break;
		case "Paramedical care":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CB_Paramedicalcarenote"));
			String CB_Paramedicalcare = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Paramedicalcare"));
			actions.verifyText(CB_Paramedicalcare, Value);
//				actions.verifyText(CB_Paramedicalcare, Value);
			String CB_CB_Paramedicalcarenote = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CB_Paramedicalcarenote"));
			String CB_CB_Paramedicalcarenotetext = CB_Paramedicalcare + " -> " + CB_CB_Paramedicalcarenote;
			printTextINFO(CB_CB_Paramedicalcarenotetext);
			System.out.println(CB_CB_Paramedicalcarenotetext);
			break;
		case "Paramedical care - Nutritionist":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Paramedical_care_Nutritionistnote"));
			String CB_Paramedical_care_Nutritionist = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Paramedical_care_Nutritionist"));
			actions.verifyText(CB_Paramedical_care_Nutritionist, Value);
//				actions.verifyText(CB_Paramedicalcare, Value);
			String CB_Paramedical_care_Nutritionistnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Paramedical_care_Nutritionistnote"));
			String CB_Paramedical_care_Nutritionistnotetext = CB_Paramedical_care_Nutritionist + " -> "
					+ CB_Paramedical_care_Nutritionistnote;
			printTextINFO(CB_Paramedical_care_Nutritionistnotetext);
			System.out.println(CB_Paramedical_care_Nutritionistnotetext);
			break;
		case "Paramedical care - Nurse":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Paramedical_care_Nursenote"));
			String CB_Paramedical_care_Nurse = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Paramedical_care_Nurse"));
			actions.verifyText(CB_Paramedical_care_Nurse, Value);
			String CB_Paramedical_care_Nursenote = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Paramedical_care_Nursenote"));
			String CB_Paramedical_care_Nursenotetext = CB_Paramedical_care_Nurse + " -> "
					+ CB_Paramedical_care_Nursenote;
			printTextINFO(CB_Paramedical_care_Nursenotetext);
			System.out.println(CB_Paramedical_care_Nursenotetext);
			break;
		case "Paramedical care - Physiotherapist":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Paramedical_care_Physiotherapistnote"));
			String CB_Paramedical_care_Physiotherapist = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Paramedical_care_Physiotherapist"));
			actions.verifyText(CB_Paramedical_care_Physiotherapist, Value);
//				actions.verifyText(CB_Paramedicalcare, Value);
			String CB_Paramedical_care_Physiotherapistnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Paramedical_care_Physiotherapistnote"));
			String CB_Paramedical_care_Physiotherapistnotetext = CB_Paramedical_care_Physiotherapist + " -> "
					+ CB_Paramedical_care_Physiotherapistnote;
			printTextINFO(CB_Paramedical_care_Physiotherapistnotetext);
			System.out.println(CB_Paramedical_care_Physiotherapistnotetext);
			break;
		case "Full health check-up and care":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Fullhealthcheckupandcarenote"));
			String CB_Fullhealthcheckupandcare = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Fullhealthcheckupandcare"));
			actions.verifyText(CB_Fullhealthcheckupandcare, Value);
//				actions.verifyText(CB_Fullhealthcheckupandcare, Value);
			String CB_Fullhealthcheckupandcarenote = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Fullhealthcheckupandcarenote"));
			String CB_Fullhealthcheckupandcarenotetext = CB_Fullhealthcheckupandcare + " -> "
					+ CB_Fullhealthcheckupandcarenote;
			printTextINFO(CB_Fullhealthcheckupandcarenotetext);
			System.out.println(CB_Fullhealthcheckupandcarenotetext);
			break;
		case "6 monthly lab tests":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_6monthlylabtestsnote"));
			String CB_6monthlylabtests = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_6monthlylabtests"));
			actions.verifyText(CB_6monthlylabtests, Value);
//				actions.verifyText(CB_6monthlylabtests, Value);
			String CB_6monthlylabtestsnote = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_6monthlylabtestsnote"));
			String CB_6monthlylabtestsnotetext = CB_6monthlylabtests + " -> " + CB_6monthlylabtestsnote;
			printTextINFO(CB_6monthlylabtestsnotetext);
			System.out.println(CB_6monthlylabtestsnotetext);
			break;
		case "In-Person Nurse visit":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_InPersonNursevisitnote"));
			String CB_InPersonNursevisit = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_InPersonNursevisit"));
			actions.verifyText(CB_InPersonNursevisit, Value);
//				actions.verifyText(CB_6monthlylabtests, Value);
			String CB_InPersonNursevisitnote = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_InPersonNursevisitnote"));
			String CB_InPersonNursevisitnotetext = CB_InPersonNursevisit + " -> " + CB_InPersonNursevisitnote;
			printTextINFO(CB_InPersonNursevisitnotetext);
			System.out.println(CB_InPersonNursevisitnotetext);
			break;
		case "Baseline speciality assessment and care by diabetologist":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Baselinespecialityassessmentandcarebydiabetologistnote"));
			String CB_Baselinespecialityassessmentandcarebydiabetologist = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Baselinespecialityassessmentandcarebydiabetologist"));
			actions.verifyText(CB_Baselinespecialityassessmentandcarebydiabetologist, Value);
//				actions.verifyText(CB_6monthlylabtests, Value);
			String CB_Baselinespecialityassessmentandcarebydiabetologistnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Baselinespecialityassessmentandcarebydiabetologistnote"));
			String CB_Baselinespecialityassessmentandcarebydiabetologistnotetext = CB_Baselinespecialityassessmentandcarebydiabetologist
					+ " -> " + CB_Baselinespecialityassessmentandcarebydiabetologistnote;
			printTextINFO(CB_Baselinespecialityassessmentandcarebydiabetologistnotetext);
			System.out.println(CB_Baselinespecialityassessmentandcarebydiabetologistnotetext);
			break;
		case "Complete health review & care by Orthopedician ":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CompletehealthreviewcarebyOrthopediciannote"));
			String CB_CompletehealthreviewcarebyOrthopedician = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_CompletehealthreviewcarebyOrthopedician"));
			actions.verifyText(CB_CompletehealthreviewcarebyOrthopedician, Value);
//				actions.verifyText(CB_CompletehealthreviewcarebyOrthopedician, Value);
			String CB_CompletehealthreviewcarebyOrthopediciannote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_CompletehealthreviewcarebyOrthopediciannote"));
			String CB_CompletehealthreviewcarebyOrthopediciannotetext = CB_CompletehealthreviewcarebyOrthopedician
					+ " -> " + CB_CompletehealthreviewcarebyOrthopediciannote;
			printTextINFO(CB_CompletehealthreviewcarebyOrthopediciannotetext);
			System.out.println(CB_CompletehealthreviewcarebyOrthopediciannotetext);
			break;
		case "Specialty care and referral":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Specialtycareandreferralnote"));
			String CB_Specialtycareandreferral = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Specialtycareandreferral"));
			actions.verifyText(CB_Specialtycareandreferral, Value);
//				actions.verifyText(CB_Endofyearlabtests, Value);
			String CB_Specialtycareandreferralnote = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Specialtycareandreferralnote"));
			String CB_Specialtycareandreferralnotetext = CB_Specialtycareandreferral + " -> "
					+ CB_Specialtycareandreferralnote;
			printTextINFO(CB_Specialtycareandreferralnotetext);
			System.out.println(CB_Specialtycareandreferralnotetext);
			break;

		case "Pre-screening and selection of right care package":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Prescreeningandselectionofrightcarepackagenote"));
			String CB_Prescreeningandselectionofrightcarepackage = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Prescreeningandselectionofrightcarepackage"));
			actions.verifyText(CB_Prescreeningandselectionofrightcarepackage, Value);
//				actions.verifyText(CB_Prescreeningandselectionofrightcarepackage, Value);
			String CB_Prescreeningandselectionofrightcarepackagenote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Prescreeningandselectionofrightcarepackagenote"));
			String CB_Prescreeningandselectionofrightcarepackagetext = CB_Prescreeningandselectionofrightcarepackage
					+ " -> " + CB_Prescreeningandselectionofrightcarepackagenote;
			printTextINFO(CB_Prescreeningandselectionofrightcarepackagetext);
			System.out.println(CB_Prescreeningandselectionofrightcarepackagetext);
			break;
		case "Detailed baseline evaluation & care - Nurse":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DetailedbaselineevaluationcareNursenote"));
			String CB_DetailedbaselineevaluationcareNurse = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_DetailedbaselineevaluationcareNurse"));
			actions.verifyText(CB_DetailedbaselineevaluationcareNurse, Value);
//				actions.verifyText(CB_DetailedbaselineevaluationcareNurse, Value);
			String CB_DetailedbaselineevaluationcareNursenote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_DetailedbaselineevaluationcareNursenote"));
			String CB_DetailedbaselineevaluationcareNursetext = CB_DetailedbaselineevaluationcareNurse + " -> "
					+ CB_DetailedbaselineevaluationcareNursenote;
			printTextINFO(CB_DetailedbaselineevaluationcareNursetext);
			System.out.println(CB_DetailedbaselineevaluationcareNursetext);
			break;
		case "Detailed baseline evaluation & care - Lab test":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DetailedbaselineevaluationcareLabtestnote"));
			String CB_DetailedbaselineevaluationcareLabtest = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_DetailedbaselineevaluationcareLabtest"));
			actions.verifyText(CB_DetailedbaselineevaluationcareLabtest, Value);
//				actions.verifyText(CB_DetailedbaselineevaluationcareLabtest, Value);
			String CB_DetailedbaselineevaluationcareLabtestnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_DetailedbaselineevaluationcareLabtestnote"));
			String CB_DetailedbaselineevaluationcareLabtesttext = CB_DetailedbaselineevaluationcareLabtest + " -> "
					+ CB_DetailedbaselineevaluationcareLabtestnote;
			printTextINFO(CB_DetailedbaselineevaluationcareLabtesttext);
			System.out.println(CB_DetailedbaselineevaluationcareLabtesttext);
			break;
		case "Complete health review & care by physician":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Completehealthreviewcarebyphysiciannote"));

			String CB_Completehealthreviewcarebyphysician = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Completehealthreviewcarebyphysician"));
			actions.verifyText(CB_Completehealthreviewcarebyphysician, Value);
//				actions.verifyText(CB_Completehealthreviewcarebyphysician, Value);
			String CB_Completehealthreviewcarebyphysiciannote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Completehealthreviewcarebyphysiciannote"));
			String CB_Completehealthreviewcarebyphysiciantext = CB_Completehealthreviewcarebyphysician + " -> "
					+ CB_Completehealthreviewcarebyphysiciannote;
			printTextINFO(CB_Completehealthreviewcarebyphysiciantext);
			System.out.println(CB_Completehealthreviewcarebyphysiciantext);
			break;
		case "Detailed annual check-up & care":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Detailedannualcheckupcarenote"));
			String CB_Detailedannualcheckupcare = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Detailedannualcheckupcare"));
			actions.verifyText(CB_Detailedannualcheckupcare, Value);
//				actions.verifyText(CB_Detailedfinalcheckupcare, Value);
			String CB_Detailedannualcheckupcarenote = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Detailedannualcheckupcarenote"));
			String CB_Detailedannualcheckupcaretext = CB_Detailedannualcheckupcare + " -> "
					+ CB_Detailedannualcheckupcarenote;
			printTextINFO(CB_Detailedannualcheckupcaretext);
			System.out.println(CB_Detailedannualcheckupcaretext);
			break;
		case "Annual outcome":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Annualoutcomenote"));
			String CB_Annualoutcome = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Annualoutcome"));
			actions.verifyText(CB_Annualoutcome, Value);
//				actions.verifyText(CB_Annualoutcome, Value);
			String CB_Annualoutcomenote = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Annualoutcomenote"));
			String CB_Annualoutcometext = CB_Annualoutcome + " -> " + CB_Annualoutcomenote;
			printTextINFO(CB_Annualoutcometext);
			System.out.println(CB_Annualoutcometext);
			break;
		case "Some of our on-demand offerings":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Someofourondemandofferingsnote"));
			String CB_Someofourondemandofferings = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Someofourondemandofferings"));
			actions.verifyText(CB_Someofourondemandofferings, Value);
//				actions.verifyText(CB_Someofourondemandofferings, Value);
			String CB_Someofourondemandofferingsnote = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Someofourondemandofferingsnote"));
			String CB_Someofourondemandofferingstext = CB_Someofourondemandofferings + " -> "
					+ CB_Someofourondemandofferingsnote;
			printTextINFO(CB_Someofourondemandofferingstext);
			System.out.println(CB_Someofourondemandofferingstext);
			break;
		case "Special services that we offer on demand":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Specialservicesthatweofferondemandnote"));
			String CB_servicesthatweofferondemand = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_servicesthatweofferondemand"));
			actions.verifyText(CB_servicesthatweofferondemand, Value);
//				actions.verifyText(CB_Someofourondemandofferings, Value);
			String CB_Specialservicesthatweofferondemandnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Specialservicesthatweofferondemandnote"));
			String CB_servicesthatweofferondemandtext = CB_servicesthatweofferondemand + " -> "
					+ CB_Specialservicesthatweofferondemandnote;
			printTextINFO(CB_servicesthatweofferondemandtext);
			System.out.println(CB_servicesthatweofferondemandtext);
			break;
		case "Periodic online follow-ups and care":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Periodiconlinefollowupsandcarenote"));
			String CB_Periodiconlinefollowupsandcare = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Periodiconlinefollowupsandcare"));
			actions.verifyText(CB_Periodiconlinefollowupsandcare, Value);
//				actions.verifyText(CB_Periodiconlinefollowupsandcare, Value);
			String CB_Periodiconlinefollowupsandcarenote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Periodiconlinefollowupsandcarenote"));
			String CB_Periodiconlinefollowupsandcaretext = CB_Periodiconlinefollowupsandcare + " -> "
					+ CB_Periodiconlinefollowupsandcarenote;
			printTextINFO(CB_Periodiconlinefollowupsandcaretext);
			System.out.println(CB_Periodiconlinefollowupsandcaretext);
			break;
		case "Monthly care & assessment - by Diabetes educator ":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_MonthlycareassessmentbyDiabeteseducatornote"));
			String CB_MonthlycareassessmentbyDiabeteseducator = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_MonthlycareassessmentbyDiabeteseducator"));
			actions.verifyText(CB_MonthlycareassessmentbyDiabeteseducator, Value);
//				actions.verifyText(CB_MonthlycareassessmentbyDiabeteseducator, Value);
			String CB_MonthlycareassessmentbyDiabeteseducatornote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_MonthlycareassessmentbyDiabeteseducatornote"));
			String CB_MonthlycareassessmentbyDiabeteseducatortext = CB_MonthlycareassessmentbyDiabeteseducator + " -> "
					+ CB_MonthlycareassessmentbyDiabeteseducatornote;
			printTextINFO(CB_MonthlycareassessmentbyDiabeteseducatortext);
			System.out.println(CB_MonthlycareassessmentbyDiabeteseducatortext);
			break;
		case "Other check-ups at baseline":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Othercheckupsatbaselinenote"));
			String CB_Othercheckupsatbaseline = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Othercheckupsatbaseline"));
			actions.verifyText(CB_Othercheckupsatbaseline, Value);
//				actions.verifyText(CB_Othercheckupsatbaseline, Value);
			String CB_Othercheckupsatbaselinenote = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Othercheckupsatbaselinenote"));
			String CB_Othercheckupsatbaselinetext = CB_Othercheckupsatbaseline + " -> "
					+ CB_Othercheckupsatbaselinenote;
			printTextINFO(CB_Othercheckupsatbaselinetext);
			System.out.println(CB_Othercheckupsatbaselinetext);
			break;
		case "Comprehensive quarterly care by the physician":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Comprehensivequarterlycarebythephysiciannote"));
			String CB_Comprehensivequarterlycarebythephysician = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Comprehensivequarterlycarebythephysician"));
			actions.verifyText(CB_Comprehensivequarterlycarebythephysician, Value);
//				actions.verifyText(CB_Comprehensivequarterlycarebythephysician, Value);
			String CB_Comprehensivequarterlycarebythephysiciannote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Comprehensivequarterlycarebythephysiciannote"));
			String CB_Comprehensivequarterlycarebythephysiciannotetext = CB_Comprehensivequarterlycarebythephysician
					+ " -> " + CB_Comprehensivequarterlycarebythephysiciannote;
			printTextINFO(CB_Comprehensivequarterlycarebythephysiciannotetext);
			System.out.println(CB_Comprehensivequarterlycarebythephysiciannotetext);
			break;
		case "Diabetes monitoring at home":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Diabetesmonitoringathomenote"));
			String CB_Diabetesmonitoringathome = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Diabetesmonitoringathome"));
			actions.verifyText(CB_Diabetesmonitoringathome, Value);
//				actions.verifyText(CB_Diabetesmonitoringathome, Value);
			String CB_Diabetesmonitoringathomenote = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Diabetesmonitoringathomenote"));
			String CB_Diabetesmonitoringathomenotetext = CB_Diabetesmonitoringathome + " -> "
					+ CB_Diabetesmonitoringathomenote;
			printTextINFO(CB_Diabetesmonitoringathomenotetext);
			System.out.println(CB_Diabetesmonitoringathomenotetext);
			break;
		case "Baseline comprehensive diabetes assessment & care - Nurse":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_BaselinecomprehensivediabetesassessmentcareNursenote"));
			String CB_BaselinecomprehensivediabetesassessmentcareNurse = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_BaselinecomprehensivediabetesassessmentcareNurse"));
			actions.verifyText(CB_BaselinecomprehensivediabetesassessmentcareNurse, Value);
//				actions.verifyText(CB_BaselinecomprehensivediabetesassessmentcareNurse, Value);
			String CB_BaselinecomprehensivediabetesassessmentcareNursenote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_BaselinecomprehensivediabetesassessmentcareNursenote"));
			String CB_BaselinecomprehensivediabetesassessmentcareNursenotetext = CB_BaselinecomprehensivediabetesassessmentcareNurse
					+ " -> " + CB_BaselinecomprehensivediabetesassessmentcareNursenote;
			printTextINFO(CB_BaselinecomprehensivediabetesassessmentcareNursenotetext);
			System.out.println(CB_BaselinecomprehensivediabetesassessmentcareNursenotetext);
			break;
		case "Baseline comprehensive diabetes assessment & care - Lab test":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_BaselinecomprehensivediabetesassessmentcareLabtestnote"));
			String CB_BaselinecomprehensivediabetesassessmentcareLabtest = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_BaselinecomprehensivediabetesassessmentcareLabtest"));
			actions.verifyText(CB_BaselinecomprehensivediabetesassessmentcareLabtest, Value);
//				actions.verifyText(CB_BaselinecomprehensivediabetesassessmentcareLabtest, Value);
			String CB_BaselinecomprehensivediabetesassessmentcareLabtestnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_BaselinecomprehensivediabetesassessmentcareLabtestnote"));
			String CB_BaselinecomprehensivediabetesassessmentcareLabtestnotetext = CB_BaselinecomprehensivediabetesassessmentcareLabtest
					+ " -> " + CB_BaselinecomprehensivediabetesassessmentcareLabtestnote;
			printTextINFO(CB_BaselinecomprehensivediabetesassessmentcareLabtestnotetext);
			System.out.println(CB_BaselinecomprehensivediabetesassessmentcareLabtestnotetext);
			break;
		case "Baseline speciality assessment and care by diabetelogist":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Baselinespecialityassessmentandcarebydiabetelogistnote"));
			String CB_Baselinespecialityassessmentandcarebydiabetelogist = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Baselinespecialityassessmentandcarebydiabetelogist"));
			actions.verifyText(CB_Baselinespecialityassessmentandcarebydiabetelogist, Value);
//				actions.verifyText(CB_Baselinespecialityassessmentandcarebydiabetelogist, Value);
			String CB_Baselinespecialityassessmentandcarebydiabetelogistnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Baselinespecialityassessmentandcarebydiabetelogistnote"));
			String CB_Baselinespecialityassessmentandcarebydiabetelogistnotetext = CB_Baselinespecialityassessmentandcarebydiabetelogist
					+ " -> " + CB_Baselinespecialityassessmentandcarebydiabetelogistnote;
			printTextINFO(CB_Baselinespecialityassessmentandcarebydiabetelogistnotetext);
			System.out.println(CB_Baselinespecialityassessmentandcarebydiabetelogistnotetext);
			break;
		case "Ophthalmologist review at baseline":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Ophthalmologistreviewatbaselinenote"));
			String CB_Ophthalmologistreviewatbaseline = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Ophthalmologistreviewatbaseline"));
			actions.verifyText(CB_Ophthalmologistreviewatbaseline, Value);
//				actions.verifyText(CB_Ophthalmologistreviewatbaseline, Value);
			String CB_Ophthalmologistreviewatbaselinenote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Ophthalmologistreviewatbaselinenote"));
			String CB_Ophthalmologistreviewatbaselinenotetext = CB_Ophthalmologistreviewatbaseline + " -> "
					+ CB_Ophthalmologistreviewatbaselinenote;
			printTextINFO(CB_Ophthalmologistreviewatbaselinenotetext);
			System.out.println(CB_Ophthalmologistreviewatbaselinenotetext);
			break;
		case "Final annual assessment and care":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Finalannualassessmentandcarenote"));
			String CB_Finalannualassessmentandcare = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Finalannualassessmentandcare"));
			actions.verifyText(CB_Finalannualassessmentandcare, Value);
//				actions.verifyText(CB_Finalannualassessmentandcare, Value);
			String CB_Finalannualassessmentandcarenote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Finalannualassessmentandcarenote"));
			String CB_Finalannualassessmentandcarenotetext = CB_Finalannualassessmentandcare + " -> "
					+ CB_Finalannualassessmentandcarenote;
			printTextINFO(CB_Finalannualassessmentandcarenotetext);
			System.out.println(CB_Finalannualassessmentandcarenotetext);
			break;
		case "Annual assessment and care":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Annualassessmentandcareshortnote"));
			String CB_Annualassessmentandcare = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Annualassessmentandcare"));
			actions.verifyText(CB_Annualassessmentandcare, Value);
			String CB_Annualassessmentandcareshortnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Annualassessmentandcareshortnote"));
			String CB_Annualassessmentandcarenotetext = CB_Annualassessmentandcare + " -> "
					+ CB_Annualassessmentandcareshortnote;
			printTextINFO(CB_Annualassessmentandcarenotetext);
			System.out.println(CB_Annualassessmentandcarenotetext);
			break;
		case "Care & assessment":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Careassessmentnote"));
			String CB_Careassessment = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Careassessment"));
			actions.verifyText(CB_Careassessment, Value);
//				actions.verifyText(CB_Careassessment, Value);
			String CB_Careassessmentnote = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Careassessmentnote"));
			String CB_Careassessmentnotetext = CB_Careassessment + " -> " + CB_Careassessmentnote;
			printTextINFO(CB_Careassessmentnotetext);
			System.out.println(CB_Careassessmentnotetext);
			break;
		case "Cardiac monitoring":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Cardiacmonitoringnote"));
			String CB_Cardiacmonitoring = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Cardiacmonitoring"));
			actions.verifyText(CB_Cardiacmonitoring, Value);
//				actions.verifyText(CB_Cardiacmonitoring, Value);
			String CB_Cardiacmonitoringnote = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Cardiacmonitoringnote"));
			String CB_Cardiacmonitoringnotetext = CB_Cardiacmonitoring + " -> " + CB_Cardiacmonitoringnote;
			printTextINFO(CB_Cardiacmonitoringnotetext);
			System.out.println(CB_Cardiacmonitoringnotetext);
			break;
		case "Baseline comprehensive cardiac health assessment & care - Nurse":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_BaselinecomprehensivecardiachealthassessmentcareNursenote"));
			String CB_BaselinecomprehensivecardiachealthassessmentcareNurse = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_BaselinecomprehensivecardiachealthassessmentcareNurse"));
			actions.verifyText(CB_BaselinecomprehensivecardiachealthassessmentcareNurse, Value);
//				actions.verifyText(CB_BaselinecomprehensivecardiachealthassessmentcareNurse, Value);
			String CB_BaselinecomprehensivecardiachealthassessmentcareNursenote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_BaselinecomprehensivecardiachealthassessmentcareNursenote"));
			String CB_BaselinecomprehensivecardiachealthassessmentcareNursenotetext = CB_BaselinecomprehensivecardiachealthassessmentcareNurse
					+ " -> " + CB_BaselinecomprehensivecardiachealthassessmentcareNursenote;
			printTextINFO(CB_BaselinecomprehensivecardiachealthassessmentcareNursenotetext);
			System.out.println(CB_BaselinecomprehensivecardiachealthassessmentcareNursenotetext);
			break;
		case "Baseline comprehensive cardiac health assessment & care - Lab test":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_BaselinecomprehensivecardiachealthassessmentcareLabtestnote"));
			String CB_BaselinecomprehensivecardiachealthassessmentcareLabtest = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_BaselinecomprehensivecardiachealthassessmentcareLabtest"));
			actions.verifyText(CB_BaselinecomprehensivecardiachealthassessmentcareLabtest, Value);
//				actions.verifyText(CB_BaselinecomprehensivecardiachealthassessmentcareLabtest, Value);
			String CB_BaselinecomprehensivecardiachealthassessmentcareLabtestnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_BaselinecomprehensivecardiachealthassessmentcareLabtestnote"));
			String CB_BaselinecomprehensivecardiachealthassessmentcareLabtestnotetext = CB_BaselinecomprehensivecardiachealthassessmentcareLabtest
					+ " -> " + CB_BaselinecomprehensivecardiachealthassessmentcareLabtestnote;
			printTextINFO(CB_BaselinecomprehensivecardiachealthassessmentcareLabtestnotetext);
			System.out.println(CB_BaselinecomprehensivecardiachealthassessmentcareLabtestnotetext);
			break;
		case "Baseline assessment of cardiac health and care by a cardiologist":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Baselineassessmentofcardiachealthandcarebyacardiologistnote"));
			String CB_Baselineassessmentofcardiachealthandcarebyacardiologist = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Baselineassessmentofcardiachealthandcarebyacardiologist"));
			actions.verifyText(CB_Baselineassessmentofcardiachealthandcarebyacardiologist, Value);
//				actions.verifyText(CB_Baselineassessmentofcardiachealthandcarebyacardiologist, Value);
			String CB_Baselineassessmentofcardiachealthandcarebyacardiologistnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Baselineassessmentofcardiachealthandcarebyacardiologistnote"));
			String CB_Baselineassessmentofcardiachealthandcarebyacardiologistnotetext = CB_Baselineassessmentofcardiachealthandcarebyacardiologist
					+ " -> " + CB_Baselineassessmentofcardiachealthandcarebyacardiologistnote;
			printTextINFO(CB_Baselineassessmentofcardiachealthandcarebyacardiologistnotetext);
			System.out.println(CB_Baselineassessmentofcardiachealthandcarebyacardiologistnotetext);
			break;
		case "Physiotherapy":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Physiotherapynote"));
			String CB_Physiotherapy = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Physiotherapy"));
			actions.verifyText(CB_Physiotherapy, Value);
//				actions.verifyText(CB_Physiotherapy, Value);
			String CB_Physiotherapynote = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Physiotherapynote"));
			String CB_Physiotherapynotetext = CB_Physiotherapy + " -> " + CB_Physiotherapynote;
			printTextINFO(CB_Physiotherapynotetext);
			System.out.println(CB_Physiotherapynotetext);
			break;
		case "Detailed baseline evaluation & symptomatic care - Nurse":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DetailedbaselineevaluationsymptomaticcareNursenote"));
			String CB_DetailedbaselineevaluationsymptomaticcareNurse = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_DetailedbaselineevaluationsymptomaticcareNurse"));
			actions.verifyText(CB_DetailedbaselineevaluationsymptomaticcareNurse, Value);
//				actions.verifyText(CB_DetailedbaselineevaluationsymptomaticcareNurse, Value);
			String CB_DetailedbaselineevaluationsymptomaticcareNursenote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_DetailedbaselineevaluationsymptomaticcareNursenote"));
			String CB_DetailedbaselineevaluationsymptomaticcareNursenotetext = CB_DetailedbaselineevaluationsymptomaticcareNurse
					+ " -> " + CB_DetailedbaselineevaluationsymptomaticcareNursenote;
			printTextINFO(CB_DetailedbaselineevaluationsymptomaticcareNursenotetext);
			System.out.println(CB_DetailedbaselineevaluationsymptomaticcareNursenotetext);
			break;
		case "Detailed baseline evaluation & symptomatic care - Lab test":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DetailedbaselineevaluationsymptomaticcareLabtestnote"));
			String CB_DetailedbaselineevaluationsymptomaticcareLabtest = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_DetailedbaselineevaluationsymptomaticcareLabtest"));
			actions.verifyText(CB_DetailedbaselineevaluationsymptomaticcareLabtest, Value);
//				actions.verifyText(CB_DetailedbaselineevaluationsymptomaticcareLabtest, Value);
			String CB_DetailedbaselineevaluationsymptomaticcareLabtestnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_DetailedbaselineevaluationsymptomaticcareLabtestnote"));
			String CB_DetailedbaselineevaluationsymptomaticcareLabtestnotetext = CB_DetailedbaselineevaluationsymptomaticcareLabtest
					+ " -> " + CB_DetailedbaselineevaluationsymptomaticcareLabtestnote;
			printTextINFO(CB_DetailedbaselineevaluationsymptomaticcareLabtestnotetext);
			System.out.println(CB_DetailedbaselineevaluationsymptomaticcareLabtestnotetext);
			break;
		case "Complete health review & care by Family physician ":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CompletehealthreviewcarebyFamilyphysiciannote"));
			String CB_CompletehealthreviewcarebyFamilyphysician = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_CompletehealthreviewcarebyFamilyphysician"));
			actions.verifyText(CB_CompletehealthreviewcarebyFamilyphysician, Value);
//				actions.verifyText(CB_CompletehealthreviewcarebyFamilyphysician, Value);
			String CB_CompletehealthreviewcarebyFamilyphysiciannote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_CompletehealthreviewcarebyFamilyphysiciannote"));
			String CB_CompletehealthreviewcarebyFamilyphysiciannotetext = CB_CompletehealthreviewcarebyFamilyphysician
					+ " -> " + CB_CompletehealthreviewcarebyFamilyphysiciannote;
			printTextINFO(CB_CompletehealthreviewcarebyFamilyphysiciannotetext);
			System.out.println(CB_CompletehealthreviewcarebyFamilyphysiciannotetext);
			break;
		case "Complete health review & care by Orthopaedician ":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CompletehealthreviewcarebyOrthopaediciannote"));
			String CB_CompletehealthreviewcarebyOrthopaedician = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_CompletehealthreviewcarebyOrthopaedician"));
			actions.verifyText(CB_CompletehealthreviewcarebyOrthopaedician, Value);
//				actions.verifyText(CB_CompletehealthreviewcarebyOrthopaedician, Value);
			String CB_CompletehealthreviewcarebyOrthopaediciannote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_CompletehealthreviewcarebyOrthopaediciannote"));
			String CB_CompletehealthreviewcarebyOrthopaediciannotetext = CB_CompletehealthreviewcarebyOrthopaedician
					+ " -> " + CB_CompletehealthreviewcarebyOrthopaediciannote;
			printTextINFO(CB_CompletehealthreviewcarebyOrthopaediciannotetext);
			System.out.println(CB_CompletehealthreviewcarebyOrthopaediciannotetext);
			break;
		case "End of year - lab tests":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Endofyearlabtestsnote"));
			String CB_Endofyearlabtests = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Endofyearlabtests"));
			actions.verifyText(CB_Endofyearlabtests, Value);
//				actions.verifyText(CB_Endofyearlabtests, Value);
			String CB_Endofyearlabtestsnote = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Endofyearlabtestsnote"));
			String CB_Endofyearlabtestsnotetext = CB_Endofyearlabtests + " -> " + CB_Endofyearlabtestsnote;
			printTextINFO(CB_Endofyearlabtestsnotetext);
			System.out.println(CB_Endofyearlabtestsnotetext);
			break;
		case "OBGYN review":
			actions.swipeUp_FindElement(3,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_OBGYNreviewnote"));
			String CB_OBGYNreview = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_OBGYNreview"));
			actions.verifyText(CB_OBGYNreview, Value);
//				actions.verifyText(CB_OBGYNreview, Value);
			String CB_OBGYNreviewnote = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_OBGYNreviewnote"));
			String CB_OBGYNreviewnotetext = CB_OBGYNreview + " -> " + CB_OBGYNreviewnote;
			printTextINFO(CB_OBGYNreviewnotetext);
			System.out.println(CB_OBGYNreviewnotetext);
			break;
		case "Complete health review by Family physician ":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CompletehealthreviewbyFamilyphysiciannote"));
			String CB_CompletehealthreviewbyFamilyphysician = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_CompletehealthreviewbyFamilyphysician"));
			actions.verifyText(CB_CompletehealthreviewbyFamilyphysician, Value);
//				actions.verifyText(CB_CompletehealthreviewbyFamilyphysician, Value);
			String CB_CompletehealthreviewbyFamilyphysiciannote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_CompletehealthreviewbyFamilyphysiciannote"));
			String CB_CompletehealthreviewbyFamilyphysiciannotetext = CB_CompletehealthreviewbyFamilyphysician + " -> "
					+ CB_CompletehealthreviewbyFamilyphysiciannote;
			printTextINFO(CB_CompletehealthreviewbyFamilyphysiciannotetext);
			System.out.println(CB_CompletehealthreviewbyFamilyphysiciannotetext);
			break;
		case "Complete health review & care by OBGYN specialist":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CompletehealthreviewcarebyOBGYNspecialistnote"));
			String CB_CompletehealthreviewcarebyOBGYNspecialist = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_CompletehealthreviewcarebyOBGYNspecialist"));
			actions.verifyText(CB_CompletehealthreviewcarebyOBGYNspecialist, Value);
//				actions.verifyText(CB_CompletehealthreviewcarebyOBGYNspecialist, Value);
			String CB_CompletehealthreviewcarebyOBGYNspecialistnote = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_CompletehealthreviewcarebyOBGYNspecialistnote"));
			String CB_CompletehealthreviewcarebyOBGYNspecialistnotetext = CB_CompletehealthreviewcarebyOBGYNspecialist
					+ " -> " + CB_CompletehealthreviewcarebyOBGYNspecialistnote;
			printTextINFO(CB_CompletehealthreviewcarebyOBGYNspecialistnotetext);
			System.out.println(CB_CompletehealthreviewcarebyOBGYNspecialistnotetext);
			break;
		default:
			System.out.println("Our Team! Screens");
			break;
		}

	}

	public void swipesuptillDiabetesCareFrequency(String Value) throws InterruptedException {

		switch (Value) {
		case "Monthly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DiabetesCareFrequencyMonthly"));
			String CB_DiabetesCareFrequencyMonthly = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_DiabetesCareFrequencyMonthly"));
			actions.verifyText(CB_DiabetesCareFrequencyMonthly, Value);
//				actions.verifyText(CB_DiabetesCareFrequencyMonthly, Value);
			break;
		case "Quarterly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DiabetesCareFrequencyQuarterly"));
			String CB_DiabetesCareFrequencyQuarterly = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_DiabetesCareFrequencyQuarterly"));
			actions.verifyText(CB_DiabetesCareFrequencyQuarterly, Value);
//				actions.verifySoftText(CB_DiabetesCareFrequencyQuarterly, Value);
			break;
		case "Half Yearly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DiabetesCareFrequencyHalfYearly"));
			String CB_DiabetesCareFrequencyHalfYearly = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_DiabetesCareFrequencyHalfYearly"));
			actions.verifyText(CB_DiabetesCareFrequencyHalfYearly, Value);
//				actions.verifyText(CB_DiabetesCareFrequencyHalfYearly, Value);
			break;
		case "Yearly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DiabetesCareFrequencyYearly"));
			String CB_DiabetesCareFrequencyYearly = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_DiabetesCareFrequencyYearly"));
			actions.verifyText(CB_DiabetesCareFrequencyYearly, Value);
//				actions.verifyText(CB_DiabetesCareFrequencyYearly, Value);
			break;
		case "On Demand":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DiabetesCareFrequencyOnDemand"));
			String CB_DiabetesCareFrequencyOnDemand = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_DiabetesCareFrequencyOnDemand"));
			actions.verifyText(CB_DiabetesCareFrequencyOnDemand, Value);
//				actions.verifyText(CB_DiabetesCareFrequencyOnDemand, Value);
			break;
		default:
			System.out.println(" Diabetes Care Frequency! Screens");
			break;
		}
	}

	public void tapsDiabetesCareFrequency(String Value) throws InterruptedException {
		switch (Value) {
		case "Monthly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DiabetesCareFrequencyMonthly"), Value);
			break;
		case "Quarterly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DiabetesCareFrequencyQuarterly"), Value);
			break;
		case "Half Yearly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DiabetesCareFrequencyHalfYearly"), Value);
			break;
		case "Yearly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DiabetesCareFrequencyYearly"), Value);
			break;
		case "On Demand":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_DiabetesCareFrequencyOnDemand"), Value);
			break;
		default:
			System.out.println("Diabetes Care Frequency! Screens");
			break;
		}
	}

	public void tapsCardiacCareFrequency(String Value) throws InterruptedException {
		switch (Value) {
		case "Monthly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CardiacCareFrequencyMonthly"), Value);
			break;
		case "Quarterly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CardiacCareFrequencyQuarterly"), Value);
			break;
		case "Half Yearly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CardiacCareFrequencyHalfYearly"), Value);
			break;
		case "Yearly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CardiacCareFrequencyYearly"), Value);
			break;
		case "On Demand":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CardiacCareFrequencyOnDemand"), Value);
			break;
		default:
			System.out.println("Cardiac Care Frequency! Screens");
			break;
		}
	}

	public void swipesuptillCardiacCareFrequency(String Value) throws InterruptedException {
		switch (Value) {
		case "Monthly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CardiacCareFrequencyMonthly"));
			String CB_CardiacCareFrequencyMonthly = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_CardiacCareFrequencyMonthly"));
			actions.verifyText(CB_CardiacCareFrequencyMonthly, Value);
//				actions.verifyText(CB_CardiacCareFrequencyMonthly, Value);
			break;
		case "Quarterly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CardiacCareFrequencyQuarterly"));
			String CB_CardiacCareFrequencyQuarterly = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_CardiacCareFrequencyQuarterly"));
			actions.verifyText(CB_CardiacCareFrequencyQuarterly, Value);
//				actions.verifySoftText(CB_CardiacCareFrequencyQuarterly, Value);
			break;
		case "Half Yearly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CardiacCareFrequencyHalfYearly"));
			String CB_CardiacCareFrequencyHalfYearly = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_CardiacCareFrequencyHalfYearly"));
			actions.verifyText(CB_CardiacCareFrequencyHalfYearly, Value);
//				actions.verifyText(CB_CardiacCareFrequencyHalfYearly, Value);
			break;
		case "Yearly":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CardiacCareFrequencyYearly"));
			String CB_CardiacCareFrequencyYearly = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_CardiacCareFrequencyYearly"));
			actions.verifyText(CB_CardiacCareFrequencyYearly, Value);
//				actions.verifyText(CB_CardiacCareFrequencyYearly, Value);
			break;
		case "On Demand":
			actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_CardiacCareFrequencyOnDemand"));
			String CB_CardiacCareFrequencyOnDemand = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_CardiacCareFrequencyOnDemand"));
			actions.verifyText(CB_CardiacCareFrequencyOnDemand, Value);
//				actions.verifyText(CB_CardiacCareFrequencyOnDemand, Value);
			break;
		default:
			System.out.println("Cardiac Care Frequency! Screens");
			break;
		}
	}

	public void cb_Tab_Articles() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Tab_Articles"),
				"Articles");
	}

	public void cb_Take_a_glimpse_at_our_accomplishments() {
		String CB_Take_a_glimpse_at_our_accomplishments = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_Take_a_glimpse_at_our_accomplishments"));
		actions.verifyText(CB_Take_a_glimpse_at_our_accomplishments, "Take a glimpse at our accomplishments.");
	}

	public void cb_TakealookatoureClinicfacility() {
		String CB_TakealookatoureClinicfacility = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_TakealookatoureClinicfacility"));
		actions.verifyText(CB_TakealookatoureClinicfacility, "Take a look at our eClinic facility.");
	}

	public void cb_Text_Image(String Value) {
		String CB_Image = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Image"));
		actions.verifyText(CB_Image, Value);
//		actions.verifyText(CB_Image, Value);
	}

	public void cb_Text_Video(String Value) {
		String CB_Video = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Video"));
		actions.verifyText(CB_Video, Value);
//		actions.verifyText(CB_Video, Value);
	}

	public void cb_Image() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Image"),
				"Image");
	}

	public void cb_Video() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Video"),
				"Video");
	}

	public void cb_any_Image_Articles() throws InterruptedException {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_any_Image_Articles"),
				"Any Image Articles");
	}

	public void cb_any_Video() throws InterruptedException {
		try {
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_any_Video"),
					"Any Video");
		} catch (Exception e) {
			System.out.println("");
		}

	}

	public void cb_Clicks_Profile_icon() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Profile_icon"),
				"Profile icon");
	}

	public void cb_Text_My_Profile() {
		String CB_My_Profile = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_My_Profile"));
		actions.verifyText(CB_My_Profile, "My Profile");
//		actions.verifySoftText(CB_My_Profile, "My Details");
	}

	public void cb_Text_My_Details() {
		String CB_My_Details = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_My_Details"));
		actions.verifyText(CB_My_Details, "My Details");
//		actions.verifySoftText(CB_My_Details, "My Details");
	}

	public void cb_Text_My_Plans() {
		String CB_My_Plans = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_My_Plans"));
		actions.verifyText(CB_My_Plans, "My Plans");
//		actions.verifySoftText(CB_My_Plans, "My Plans");
	}

	public void cb_Text_Health_Records() {
		try {
			actions.waitForVisible(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Health_Records"));
			cb_screenShotInfo();
			String CB_Health_Records = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Health_Records"));
			actions.verifyText(CB_Health_Records, "Health Records");
		} catch (Exception e) {
			cb_screenShotInfo();
		}
		
//		actions.verifySoftText(CB_Health_Records, "Health Records");
	}

	public void cb_Text_Profile_Lab_Reports() {
		actions.waitForVisible(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Profile_Lab_Reports"));
		String CB_Profile_Lab_Reports = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Profile_Lab_Reports"));
		actions.verifyText(CB_Profile_Lab_Reports, "Lab Reports");
//		actions.verifySoftText(CB_Profile_Lab_Reports, "Lab Reports");
	}

	public void cb_Text_Review() {
		String CB_Review = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Review"));
		actions.verifyText(CB_Review, "Review");
//		actions.verifySoftText(CB_Review, "Review");
	}

	public void cb_CB_Please_share_your_feedback() {
		String CB_Review = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Please_share_your_feedback"));
		actions.verifyText(CB_Review, "Please share your feedback");
//		actions.verifySoftText(CB_Review, "Review");
	}

	public void cb_Text_Manage_Profile() {
		String CB_Manage_Profile = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Manage_Profile"));
		actions.verifyText(CB_Manage_Profile, "Manage Profile");
//		actions.verifySoftText(CB_Manage_Profile, "Manage Profile");
	}

	public void cb_Text_Change_Password() {
		String CB_Change_Password = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Change_Password"));
		actions.verifyText(CB_Change_Password, "Change Password");
//		actions.verifySoftText(CB_Change_Password, "Change Password");
	}

	public void cb_Text_Sign_Out() {
		String CB_Sign_Out = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Sign_Out"));
		actions.verifyText(CB_Sign_Out, "Sign Out");
//		actions.verifySoftText(CB_Sign_Out, "Sign Out");
	}

	public void cb_click_Profile_close_icon() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Profile_close_icon"),
				"Profile close icon");
	}

	public void cb_btn_Login_Sign_up() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_btn_Login_Sign_up"),
				"Login Sign-up");
	}

	public void cb_Text_Login() {
		String CB_Login = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Login"));
		actions.verifyText(CB_Login, "Login");
//		actions.verifySoftText(CB_Login, "Login");
	}

	public void cb_UserName_Email_or_Mobile_Number(String UserName) {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Email_or_Mobile_Number"), UserName, UserName);
	}

	public void cb_UserName_Enter_Password(String PassWord) {
		actions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Enter_Password"),
				PassWord, PassWord);
	}

	public void cb_btn_Next() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Next"), "Next");
	}

	public void autofill_save_Password(String Value) {
		switch (Value) {
		case "NEVER":
			actions.Click(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "autofill_save_no"),
					"Next");
			break;
		case "SAVE":
			actions.Click(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "autofill_save_yes"),
					"Next");
			break;
		default:
			System.out.println(" ");
			break;
		}
	}

	public void cb_Text_Dashboard() {
		String CB_Dashboard = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Dashboard"));
		actions.verifyText(CB_Dashboard, "Dashboard");
//		actions.verifySoftText(CB_Dashboard, "Dashboard");
	}

	public void cb_Clicks_Health_Records() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Health_Records"),
				"Health Records");
	}

	public void cb_Clicks_My_Plans() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_My_Plans"),
				"My Plans");
	}

	public void cb_Clicks_Review() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Review"),
				"Review");
	}

	public void cb_Text_My_Prescription() {
		String CB_Profile_My_Prescription = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Profile_My_Prescription"));
		actions.verifyText(CB_Profile_My_Prescription, "My Prescription");
//		actions.verifySoftText(CB_Profile_My_Prescription, "My Prescription");
	}

	public void cb_Clicks_My_Prescription() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Profile_My_Prescription"), "My Prescription");
	}

	public void cb_Clicks_My_Details() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_My_Details"),
				"My Details");
	}

	public void cb_Text_Details() {
		String CB_Details = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Details"));
		actions.verifyText(CB_Details, "Details");
//		actions.verifySoftText(Details, "Details");
	}

	public void cb_Text_Personal_Details() {
		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
				"//android.widget.TextView[@text='Personal Details']/following-sibling::android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

		for (int i = 0; i < seeinformation.size(); i++) {
			String text = seeinformation.get(i).getText();
			printTextINFO(text);
		}
//		actions.getTextListsofElements(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Profile_Personal_Details"));
	}

	public void cb_Text_Contact_Details() {
		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
				"//android.widget.TextView[@text='Contact Details']/following-sibling::android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

		for (int i = 0; i < seeinformation.size(); i++) {
			String text = seeinformation.get(i).getText();
			printTextINFO(text);
		}
//		actions.getTextListsofElements(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Profile_Contact_Details"));
	}

	public void cb_Text_Profile_My_Lab_Reports() {
		String CB_Profile_My_Lab_Reports = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Profile_My_Lab_Reports"));
		actions.verifyText(CB_Profile_My_Lab_Reports, "My Lab Reports");
//		actions.verifySoftText(CB_Profile_My_Lab_Reports, "My Lab Reports");
	}

	public void cb_Clicks_Profile_My_Lab_Reports() {
		try {
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Profile_My_Lab_Reports"), "My Lab Reports");
		} catch (Exception e) {
			System.out.println("Not available Reports in Lab Reports ");
		}
	}

	public void cb_Text_Prescription() {
		String CB_Profile_Prescription = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Profile_Prescription"));
		actions.verifyText(CB_Profile_Prescription, "Prescription");
//		actions.verifySoftText(CB_Profile_Prescription, "Prescription");
	}

	public void cb_Text_Health_Records_Symptoms() {
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Profile_Prescription"));
	}

	public void cb_Text_Health_Records_Doctor_Name() {
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Health_Records_Doctor_Name"));
	}

	public void cb_Text_Health_Records_Any_Allergy() {
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Health_Records_Any_Allergy"));
	}

	public void cb_Text_Health_Records_Consultation_Date() {
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Health_Records_Consultation_Date"));
	}

	public void cb_Text_Health_Records_Next_Consultation_Date() {
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Health_Records_Next_Consultation_Date"));
	}

	public void cb_clcks_Health_Records_View_Prescription() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Health_Records_View_Prescription"), "View Prescription");
	}

	public void cb_Health_Records_View_Prescription_Regn_No() {
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Health_Records_View_Prescription_Regn_No"));
	}

	public void cb_Download_Prescription() throws InterruptedException {
		actions.swipeUp_FindElementClick(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Download_Prescription"), "Download Prescription");
	}

	public void cb_Copy_to() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Copy_to"),
				"Copy to...");

	}

	public void cb_Copy_to_file_choose() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Copy_to_file_choose"),
				"@CureBay Testing Files");
	}

	public void cb_Copy_to_file_choose_paste_confirm() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Copy_to_file_choose_paste_confirm"), "paste");
	}

	public void cb_prescription_pdf() throws IOException, InterruptedException {
		actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_prescription_pdf"));
		cb_screenShotInfo();
		navigatesback();
		navigatesback();
	}

	public void cb_Attention_OK() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Attention_OK"),
				"OK");
	}

	public void cb_Text_My_Vitals() {
		String CB_My_Vitals = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_My_Vitals"));
		actions.verifyText(CB_My_Vitals, "My Vitals");
//		actions.verifySoftText(CB_My_Vitals, "My Vitals");
	}

	public void cb_Text_Your_Vitals() {
		String CB_Your_Vitals = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Your_Vitals"));
		actions.verifyText(CB_Your_Vitals, "Your Vitals");
//		actions.verifySoftText(CB_Your_Vitals, "Your Vitals");
	}

	public void cb_Clicks_My_Vitals() {
		try {
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_My_Vitals"),
					"My Vitals");
		} catch (Exception e) {
			try {
				ReportManager.logMobileScreenshot();
			} catch (IOException e1) {
			}
		}
	}

	public void cb_Temperature() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Temperature"));
	}

	public void cb_Temperature_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Temperature_NormaleRange"));
	}

	public void cb_Temperature_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Temperature_LastUpadated"));
	}

	public void cb_HeartRate() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HeartRate"));
	}

	public void cb_HeartRate_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HeartRate_NormaleRange"));
	}

	public void cb_HeartRate_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HeartRate_LastUpadated"));
	}

	public void cb_SPo2() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_SPo2"));
	}

	public void cb_SPo2_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_SPo2_NormaleRange"));
	}

	public void cb_SPo2_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_SPo2_LastUpadated"));
	}

	public void cb_Triglycerides() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Triglycerides"));
	}

	public void cb_Triglycerides_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Triglycerides_NormaleRange"));
	}

	public void cb_Triglycerides_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Triglycerides_LastUpadated"));
	}

	public void cb_Diastolic() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Diastolic"));
	}

	public void cb_Diastolic_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Diastolic_NormaleRange"));
	}

	public void cb_Diastolic_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Diastolic_LastUpadated"));
	}

	public void cb_Weight() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Weight"));
	}

	public void cb_Weight_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Weight_NormaleRange"));
	}

	public void cb_Weight_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Weight_LastUpadated"));
	}

	public void cb_BP() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_BP"));
	}

	public void cb_BP_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_BP_NormaleRange"));
	}

	public void cb_BP_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_BP_LastUpadated"));
	}

	public void cb_HDL() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HDL"));
	}

	public void cb_HDL_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HDL_NormaleRange"));
	}

	public void cb_HDL_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HDL_LastUpadated"));
	}

	public void cb_BloodGlucose() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_BloodGlucose"));
	}

	public void cb_BloodGlucose_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_BloodGlucose_NormaleRange"));
	}

	public void cb_BloodGlucose_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_BloodGlucose_LastUpadated"));
	}

	public void cb_LDL() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_LDL"));
	}

	public void cb_LDL_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_LDL_NormaleRange"));
	}

	public void cb_LDL_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_LDL_LastUpadated"));
	}

	public void cb_Systolic() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Systolic"));
	}

	public void cb_Systolic_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Systolic_NormaleRange"));
	}

	public void cb_Systolic_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Systolic_LastUpadated"));
	}

	public void cb_PulseRate() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_PulseRate"));
	}

	public void cb_PulseRate_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_PulseRate_NormaleRange"));
	}

	public void cb_PulseRate_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_PulseRate_LastUpadated"));
	}

	public void cb_Height() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Height"));
	}

	public void cb_Height_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Height_NormaleRange"));
	}

	public void cb_Height_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Height_LastUpadated"));
	}

	public void cb_TotalCholesterol() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_TotalCholesterol"));
	}

	public void cb_TotalCholesterol_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_TotalCholesterol_NormaleRange"));
	}

	public void cb_TotalCholesterol_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_TotalCholesterol_LastUpadated"));
	}

	public void cb_RespirationRate() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_RespirationRate"));
	}

	public void cb_RespirationRate_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_RespirationRate_NormaleRange"));
	}

	public void cb_RespirationRate_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_RespirationRate_LastUpadated"));
	}

	public void cb_BMI() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_BMI"));
	}

	public void cb_BMI_NormaleRange() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_BMI_NormaleRange"));
	}

	public void cb_BMI_LastUpadated() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_BMI_LastUpadated"));
	}

	public void cb_Text_Question1() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Question1"));
	}

	public void cb_clicks_Question1_Points() {
//		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
//				"//android.widget.TextView[@text='Contact Details']/following-sibling::android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

		List<WebElement> Points = DriverFactory.getInstance().getMobileDriver().findElements(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Question1_points"));
		for (int i = 0; i < Points.size(); i++) {
			Points.get(i).click();
		}
	}

	public void cb_Text_Question2() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Question2"));
	}

	public void cb_clicks_Question2_Points() {
//		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
//				"//android.widget.TextView[@text='Contact Details']/following-sibling::android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

		List<WebElement> Points = DriverFactory.getInstance().getMobileDriver().findElements(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Question2_points"));
		for (int i = 0; i < Points.size(); i++) {
			Points.get(i).click();
		}
	}

	public void cb_Text_Question3() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Question3"));
	}

	public void cb_clicks_Question3_Points() {
//		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
//				"//android.widget.TextView[@text='Contact Details']/following-sibling::android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

		List<WebElement> Points = DriverFactory.getInstance().getMobileDriver().findElements(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Question3_points"));
		for (int i = 0; i < Points.size(); i++) {
			Points.get(i).click();
		}
	}

	public void cb_Text_Question4() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Question4"));
	}

	public void cb_clicks_Question4_Points() throws InterruptedException {
		actions.swipeUp_FindElement(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Question4_points"));
//		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
//				"//android.widget.TextView[@text='Contact Details']/following-sibling::android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

		List<WebElement> Points = DriverFactory.getInstance().getMobileDriver().findElements(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Question4_points"));
		for (int i = 0; i < Points.size(); i++) {
			Points.get(i).click();
		}
	}

	public void cb_Text_Question5() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Question5"));
	}

	public void cb_Question5_feedBack() throws InterruptedException {
		actions.swipeUp_FindElement(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Question5_your_feedback"));
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Question5_your_feedback"), "Very Good " + DataTime, "Very Good " + DataTime);
	}

	public void cb_Review_Added_Successfully() {
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Review_Added_Successfully"));
	}

	public void cb_Clicks_CB_Submit() throws InterruptedException {
		actions.swipeUp_FindElement(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Submit"));
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Submit"),
				"Submit");
	}

	public void cb_Clicks_OK() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Clicks_OK"),
				"OK");
	}

	public void cb_dropdown_related_to_select_Patient_Name() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_dropdown_related_to_select_Patient_Name"), "Drop Down");
	}

	public void cb_select_related_to_select_Patient_Name() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_select_related_to_select_Patient_Name"), "Father sir");
	}

	public void cb_select_RadioButton1() {
		try {
			actions.Click(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_select_RadioButton1"),
					"RadioButton1");
		} catch (Exception e) {
		}
		
	}

	public void cb_Text_Validity_Left() {
		actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Validity_Left"));
		actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Validity_Left_Value"));
	}

	public void cb_Text_Renewal_Date() {
		actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Renewal_Date"));
		actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Renewal_Date_Value"));
	}

	public void cb_ClicksPrescreeningandselectionofrightcarepackage() throws InterruptedException {
		actions.swipeUp_FindElementClick(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Prescreeningandselectionofrightcarepackage"));
	}

	public void cb_text_MyPlan_Prescreeningandselectionofrightcarepackagenote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_MyPlan_Prescreeningandselectionofrightcarepackagenote"));
	}

	public void cb_Clicks_DetailedbaselineevaluationcareNurse() throws InterruptedException {
		actions.swipeUp_FindElementClick(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_DetailedbaselineevaluationcareNurse"));
	}

	public void cb_text_MyPlan_DetailedbaselineevaluationcareNursenote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_MyPlan_DetailedbaselineevaluationcareNurse"));
	}

	public void cb_Clicks_DetailedbaselineevaluationcareLabtest() throws InterruptedException {
		actions.swipeUp_FindElementClick(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_DetailedbaselineevaluationcareLabtest"));
	}

	public void cb_text_MyPlan_DetailedbaselineevaluationcareLabtestnote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_MyPlan_DetailedbaselineevaluationcareLabtest"));
	}

	public void cb_Clicks_Completehealthreviewcarebyphysician() throws InterruptedException {
		actions.swipeUp_FindElementClick(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Completehealthreviewcarebyphysician"));
	}

	public void cb_MyPlan_Completehealthreviewcarebyphysician() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_MyPlan_Completehealthreviewcarebyphysician"));
	}

	public void cb_Clicks_Specialitycareandreferral() throws InterruptedException {
		actions.swipeUp_FindElementClick(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Specialitycareandreferral"));
	}

	public void cb_MyPlan_Specialitycareandreferral() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_MyPlan_Specialitycareandreferral"));
	}

	public void cb_Clicks_Periodiccallsforhealthassessment() throws InterruptedException {
		actions.swipeUp_FindElementClick(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Periodiccallsforhealthassessment"));
	}

	public void cb_MYplan_Periodiccallsforhealthassessment() throws InterruptedException {
		actions.swipeUp_FindElementClick(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_MYplan_Periodiccallsforhealthassessment"));
	}

	public void cb_MyPlan_Paramedicalcare() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_MyPlan_Paramedicalcare"));
	}

	public void cb_Clicks_Paramedicalcare() throws InterruptedException {
		actions.swipeUp_FindElementClick(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Paramedicalcare"));
	}

	public void cb_MyPlan_text_Paramedicalcare() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_MyPlan_Paramedicalcare"));
	}

	public void cb_clicks_Fullhealthcheckupandcare() throws InterruptedException {
		actions.swipeUp_FindElementClick(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Fullhealthcheckupandcare"));
	}

	public void cb_MyPlan_Fullhealthcheckupandcare() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_MyPlan_Fullhealthcheckupandcare"));
	}

	public void cb_6monthlylabtests() throws InterruptedException {
		actions.swipeUp_FindElementClick(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_6monthlylabtests"));
	}

	public void cb_Myplan_6monthlylabtests() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Myplan_6monthlylabtests"));
	}

	public void cb_Detailedfinalcheckupcare() throws InterruptedException {
		actions.swipeUp_FindElementClick(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Detailedfinalcheckupcare"));
	}

	public void cb_MyPlan_Detailedfinalcheckupcare() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_MyPlan_Detailedfinalcheckupcare"));
	}

	public void cb_Annualoutcome() throws InterruptedException {
		actions.swipeUp_FindElementClick(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Annualoutcome"));
	}

	public void cb_MyPlanAnnualoutcome() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_MyPlanAnnualoutcome"));
	}

	public void cb_Someofourondemandofferings() throws InterruptedException {
		actions.swipeUp_FindElementClick(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Someofourondemandofferings"));
	}

	public void cb_Someofourondemandofferingsnote() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Someofourondemandofferingsnote"));
	}

	public void cb_DiabetesCareFrequency() throws InterruptedException {
		actions.swipeUp_FindElementClick(3, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_DiabetesCareFrequency"));
	}

	public void cb_DiabetesCareFrequencyMonthly() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_DiabetesCareFrequencyMonthly"));
	}

	public void cb_Text_CB_Manage_Profile() {
		String CB_CB_Manage_Profile = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CB_Manage_Profile"));
		actions.verifyText(CB_CB_Manage_Profile, "Manage Profile");
//		actions.verifySoftText(CB_CB_Manage_Profile, "Manage Profile");
	}

	public void cb_clicks_CB_Manage_Profile() throws InterruptedException {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CB_Manage_Profile"),
				"Manage Profile");
	}

	public void cb_clicks_CB_Add_Member() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Add_Member"),
				"Add Member");
	}

	public void cb_CB_See_Profiles() {
		String CB_CB_See_Profiles = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CB_See_Profiles"));
//		actions.verifyText(CB_CB_See_Profiles, "See Profiles");
//		actions.verifySoftText(CB_CB_See_Profiles, "See Profiles");
	}

	public void cb_See_Father_sir() {
		String CB_See_Father_sir = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_See_Father_sir"));
//		actions.verifyText(CB_See_Father_sir, "Father sir");
	}

	public void cb_See_Father() {
		String CB_See_Father = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_See_Father"));
//		actions.verifyText(CB_See_Father, "Father");
	}

	public void cb_SPatient_Id_12402() {
		String CB_SPatient_Id_12402 = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_SPatient_Id_12402"));
//		actions.verifyText(CB_SPatient_Id_12402, "Patient Id: 12402");
	}

	public void cb_SPatient_Id_13079() {
		try {
			String CB_SPatient_Id_13079 = actions.getText(MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_SPatient_Id_13079"));
//			actions.verifyText(CB_SPatient_Id_13079, "Patient Id: 13079");
		} catch (Exception e) {
			System.out.println();
			try {
				ReportManager.logMobileScreenshot();
			} catch (IOException e1) {
			}
		}
	}

	public void cb_GenderMale() {
		String CB_GenderMale = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_GenderMale"));
//		actions.verifyText(CB_GenderMale, "Gender : Male");
	}

	public void cb_RelationFather() {
		String CB_RelationFather = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_RelationFather"));
//		actions.verifyText(CB_RelationFather, "Relation : Father");
	}

	public void cb_BloodgroupABve() {
		String CB_BloodgroupABve = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_BloodgroupABve"));
//		actions.verifyText(CB_BloodgroupABve, "Blood group : AB+ve");
	}

	public void cb_BloodgroupA_N() {
		String CB_BloodgroupA_N = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_BloodgroupA_N"));
//		actions.verifyText(CB_BloodgroupA_N, "Blood group : A-");
	}

	public void cb_DOB23082023() {
		String CB_DOB23082023 = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_DOB23082023"));
//		actions.verifyText(CB_DOB23082023, "DOB : 23/08/2023");
	}

	public void cb_DOB21071964() {
		String CB_DOB21071964 = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_DOB21071964"));
//		actions.verifyText(CB_DOB21071964, "DOB : 21/07/1964");
	}

	public void cb_PackageNames() {
		try {
			String CB_PackageNames = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_PackageNames"));
//			actions.verifyText(CB_PackageNames, "Package Name : Ortho Care, Diabetes Care, General Health Care");
		} catch (Exception e) {
		}
	}

	public void cb_viewthreedots() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_viewthreedots"),
				"Profile Menu Icon");
	}

	public void cb_Text_view() {
		String CB_Text_view = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_view"));
//		actions.verifyText(CB_Text_view, "View");
	}

	public void cb_Click_view() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Text_view"),
				"View");
	}

	public void cb_text_Details() {
		String CB_text_Details = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_text_Details"));
//		actions.verifyText(CB_text_Details, "Details");
	}

	public void cb_text_Edit() {
		String CB_text_Edit = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_text_Edit"));
//		actions.verifyText(CB_text_Edit, "Edit");
	}

	public void cb_Personal_Details() {
		String CB_Personal_Details = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Personal_Details"));
//		actions.verifyText(CB_Personal_Details, "Personal Details");
	}

	public void cb_Profile_Details() {
		String CB_Profile_Details = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Profile_Details"));
//		actions.verifyText(CB_Profile_Details, "Profile Details");
	}

	public void cb_Salutation() {
		String CB_Salutation = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Salutation"));
//		actions.verifyText(CB_Salutation, "Salutation");
	}

	public void cb_SalutationData() {
		String CB_SalutationData = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_SalutationData"));
//		actions.verifyText(CB_SalutationData, "Mr");
	}

	public void cb_FirstName() {
		String CB_FirstName = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_FirstName"));
//		actions.verifyText(CB_FirstName, "First Name");
	}

	public void cb_FirstNameData() {
		String CB_FirstNameData = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_FirstNameData"));
//		actions.verifyText(CB_FirstNameData, "Father");
	}

	public void cb_LastName() {
		String CB_LastName = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_LastName"));
//		actions.verifyText(CB_LastName, "Last Name");
	}

	public void cb_LastNameData() {
		String CB_LastNameData = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_LastNameData"));
//		actions.verifyText(CB_LastNameData, "sir");
	}

	public void cb_Gender() {
		String CB_Gender = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Gender"));
//		actions.verifyText(CB_Gender, "Gender");
	}

	public void cb_GenderData() {
		String CB_GenderData = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_GenderData"));
//		actions.verifyText(CB_GenderData, "M");
	}

	public void cb_MobileNumber() {
		String CB_MobileNumber = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_MobileNumber"));
//		actions.verifyText(CB_MobileNumber, "Mobile Number");
	}

	public void cb_MobileNumberData() {
		String CB_MobileNumberData = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_MobileNumberData"));
//		actions.verifyText(CB_MobileNumberData, "9986893443");
	}

	public void cb_Relation() {
		String CB_Relation = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Relation"));
//		actions.verifyText(CB_Relation, "Relation");
	}

	public void cb_RelationData() {
		String CB_RelationData = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_RelationData"));
//		actions.verifyText(CB_RelationData, "Father");
	}

	public void cb_DateofBirth() {
		String CB_DateofBirth = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_DateofBirth"));
		actions.verifyText(CB_DateofBirth, "Date of Birth");
	}

	public void cb_DateofBirthData() {
		String CB_DateofBirthData = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_DateofBirthData"));
//		actions.verifyText(CB_DateofBirthData, "21/07/1964");
	}

	public void cb_BloodGroup() {
		String CB_BloodGroup = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_BloodGroup"));
		actions.verifyText(CB_BloodGroup, "Blood Group");
	}

	public void cb_BloodGroupData() {
		String CB_BloodGroupData = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_BloodGroupData"));
//		actions.verifyText(CB_BloodGroupData, "A-");
	}

	public void cb_Email() {
		String CB_Email = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Email"));
		actions.verifyText(CB_Email, "Email");
	}

	public void cb_EmailData() {
		String CB_EmailData = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_EmailData"));
//		actions.verifyText(CB_EmailData, "");
	}

	public void cb_Age() {
		String CB_Age = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Age"));
		actions.verifyText(CB_Age, "Age");
	}

	public void cb_AgeData() {
		String CB_AgeData = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_AgeData"));
//		actions.verifyText(CB_AgeData, "59 Years");
	}

	public void cb_Contact_Details() {
		String CB_Contact_Details = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Contact_Details"));
		actions.verifyText(CB_Contact_Details, "Contact Details");
	}

	public void cb_HouseNoStreetName() {
		String CB_HouseNoStreetName = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HouseNoStreetName"));
//		actions.verifyText(CB_HouseNoStreetName, "House No/Street Name");
	}

	public void cb_HouseNoStreetNameData() {
		String CB_HouseNoStreetNameData = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HouseNoStreetNameData"));
//		actions.verifyText(CB_HouseNoStreetNameData, "No 2 Gandhi nagar by pass road");
	}

	public void cb_Pincode() {
		String CB_Pincode = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Pincode"));
		actions.verifyText(CB_Pincode, "Pincode");
	}

	public void cb_PincodeData() {
		String CB_PincodeData = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_PincodeData"));
//		actions.verifyText(CB_PincodeData, "751001");
	}

	public void cb_Address() {
		String CB_Address = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Address"));
		actions.verifyText(CB_Address, "Address");
	}

	public void cb_AddressData() {
		String CB_AddressData = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_AddressData"));
//		actions.verifyText(CB_AddressData, "");
	}

	public void cb_Citys() {
		String CB_Citys = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Citys"));
		actions.verifyText(CB_Citys, "City");
	}

	public void cb_CitysData() {
		String CB_CitysData = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CitysData"));
//		actions.verifyText(CB_CitysData, "Odisha");
	}

	public void cb_States() {
		try {
			actions.swipeUp_FindElement(2,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_States"));

			String CB_States = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_States"));
			actions.verifyText(CB_States, "State");
		} catch (InterruptedException e) {
		}
	}

	public void cb_StatesData() {
		try {
			actions.swipeUp_FindElement(2,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_StatesData"));
			String CB_StatesData = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_StatesData"));
			actions.verifyText(CB_StatesData, "OD");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void user_shouold_able_to_see_Family_Detalis() {
		actions.waitForVisible(By.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup//android.widget.TextView"));
//				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Profile_Lab_Reports"));
		List<WebElement> seeinformation = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup//android.widget.TextView"));

		for (int i = 1; i < seeinformation.size(); i++) {
			String text = seeinformation.get(i).getText();
			printTextINFO(text);
		}
		actions.swipeUp(5);
	}

	public void user_taps_on_add_to_cart_icon() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_addtocart"),
				"Cart Icon");
//		actions.clickUsingCoordinates(570,110);
	}

	public void cb_Choose_health_care_plan_for_your_family_member() {
		String CB_Choose_health_care_plan_for_your_family_member = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_Choose_health_care_plan_for_your_family_member"));
		actions.verifyText(CB_Choose_health_care_plan_for_your_family_member,
				"Choose health care plan for your family member");
//		actions.verifySoftText(CB_CB_See_Profiles, "See Profiles");
	}

	public void user_should_able_to_see_general_health_care_details() {
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_General_Health_Care_price"));
		List<WebElement> general_health_care_details = DriverFactory.getInstance().getMobileDriver().findElements(By
				.xpath("//android.widget.TextView[@text=\"General Health Care\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]"));

		for (int i = 0; i < general_health_care_details.size(); i++) {
			String text = general_health_care_details.get(i).getText();
			printTextINFO(text);
		}
	}

	public void user_should_able_to_see_Diabetes_Care_details() {
		actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Diabetes_Care_price"));
		List<WebElement> general_health_care_details = DriverFactory.getInstance().getMobileDriver().findElements(By
				.xpath("//android.widget.TextView[@text=\"Diabetes Care\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]"));

		for (int i = 0; i < general_health_care_details.size(); i++) {
			String text = general_health_care_details.get(i).getText();
			printTextINFO(text);
		}
	}

	public void user_should_able_to_see_Cardiac_Care_details() {
		actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Cardiac_Care_price"));
		List<WebElement> general_health_care_details = DriverFactory.getInstance().getMobileDriver().findElements(By
				.xpath("//android.widget.TextView[@text=\"Cardiac Care\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]"));

		for (int i = 0; i < general_health_care_details.size(); i++) {
			String text = general_health_care_details.get(i).getText();
			printTextINFO(text);
		}
	}

	public void cb_Clicks_btn_Next() throws InterruptedException {

		switch (data_UDID) {
		case "VSWCZ5Q8U4YTCAS4":
			actions.swipeUp_FindElementClick(2,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_btn_Next"),
					"Next");
//			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_btn_Next"),"Next");
			break;
		case "ZF6223VL42":
			try {
				actions.waitForVisible(
						MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_next_btn2"));
				actions.swipeUp_FindElementClick(2,
						MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_next_btn2"),
						"Next");
//				actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_btn_Next"),"Next");

			} catch (Exception e) {
				try {
					actions.Click(
							MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Next"),
							"Next");
				} catch (Exception e2) {
					// TODO: handle exception
				}

			}

			break;

		default:

			actions.swipeUp_FindElementClick(5,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_next_btn2"),
					"Next");
//			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_btn_Next"),"Next");

		}
	}

	public void user_select_the_general_health_care() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_General_Health_Care_Option"), "General Health Care Options");
	}

	public void user_select_the_Diabetes_Care() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Diabetes_Care_Option"),
				"Diabetes Care Options");
	}

	public void user_select_the_Cardiac_Care() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Cardiac_Care_Option"),
				"Cardiac Care Options");
	}

	public void cb_text_YourCart() {
		try {
			String CB_YourCart = actions
					.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_YourCart"));
			actions.verifyText(CB_YourCart, "YourCart");
		} catch (Exception e) {
		}
		
	}

	public void cb_YourCart_Payment_Details() {
		String CB_YourCart_Payment_Details = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_YourCart_Payment_Details"));
		actions.verifyText(CB_YourCart_Payment_Details, "Payment Details");
	}

	public void cb_YourCart_Payment_Detailsinfo() throws InterruptedException {
		actions.getElementTextUsingFindElements(0, 0, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_YourCart_Payment_Detailsinfo"));
//		List<WebElement> CB_YourCart_Payment_Detailsinfo = DriverFactory.getInstance().getMobileDriver().findElements(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_YourCart_Payment_Detailsinfo"));
//
//		for (int i = 0; i < CB_YourCart_Payment_Detailsinfo.size(); i++) {
//			String text = CB_YourCart_Payment_Detailsinfo.get(i).getText();
//			printTextINFO(text);
//		}
	}

	public void cb_YourCart_DropDown() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_YourCart_DropDown"),
				"Drop Down");
	}

	public void cb_SelectPaymentOption() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_SelectPaymentOption"),
				"Select Payment Option");
	}

	public void user_select_payment_option_monthly_or_one_time(String Value) throws InterruptedException {

		switch (Value) {
		case "Monthly":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Monthly"),
					Value);
			break;
		case "One Time":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_One_Time"),
					Value);
			break;

		default:
			System.out.println("payment option monthly or one time! Screens");
			break;
		}

	}

	public void cb_Checkout() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Checkout"),
				"Checkout");
	}

	public void cb_Your_order() {
		String CB_Your_order = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Your_order"));
		actions.verifyText(CB_Your_order, "Your order");
	}

	public void cb_Your_order_List() {
		List<WebElement> CB_Your_order_list = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
				"//android.widget.TextView[@text='Your order']/parent::android.view.View/parent::android.view.View/following-sibling::android.view.View//android.widget.TextView"));

		for (int i = 0; i < CB_Your_order_list.size(); i++) {
			String text = CB_Your_order_list.get(i).getText();
			printTextINFO(text);
		}
	}

	public void cb_Proceed_To_Checkout() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Proceed_To_Checkout"),
				"Proceed To Checkout");
	}

	public void cb_Add_your_billing_address() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Add_your_billing_address"), "Add your billing address");
		String CB_Add_your_billing_address = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Add_your_billing_address"));
		actions.verifyText(CB_Add_your_billing_address, "Add your billing address");
	}

	public void cb_First_Name(String value) throws InterruptedException {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_First_Name"),
				value, value);
	}

	public void cb_Last_Name(String value) throws InterruptedException {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Last_Name"),
				value, value);
	}

	public void cb_Address_Line1(String value) throws InterruptedException {
		wait_OS(1);
		actions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Address_Line1"), value,
				value);
	}

	public void cb_Address_Line2(String value) throws InterruptedException {
		wait_OS(1);
		actions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Address_Line2"), value,
				value);
	}

	public void cb_Address_Line3(String value) throws InterruptedException {
		wait_OS(1);
		actions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Address_Line3"), value,
				value);
	}

	public void cb_City(String value) throws InterruptedException {
		wait_OS(1);
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_City"), value,
				value);
	}

	public void cb_Zip(String value) throws InterruptedException {
		wait_OS(1);
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Zip"), value,
				value);
	}

	public void cb_Country() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Country"),
				"Proceed To Checkout");
	}

	public void cb_CountryList() throws InterruptedException {
		actions.swipeUp_FindElementClick(15,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Countrylist"),
				"India");
	}

	public void cb_State() throws InterruptedException {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_State"),
				"State");
	}

	public void cb_CountryState() throws InterruptedException {
		actions.swipeUp_FindElementClick(15,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_StateList"),
				"Andhra Pradesh");
	}

	public void cb_Card_Number(String value) throws InterruptedException {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Card_Number"),
				value, value);
	}

	public void cb_clicks_Card_Number() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Card_Number"),
				"Card Number");
	}

	public void cb_clicks_Valid_Card() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Valid_Card"),
				"Valid Card");
	}

	public void cb_Expiry(String value) throws InterruptedException {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Expiry"),
				value, value);
	}

	public void cb_CVV_Optional(String value) throws InterruptedException {
		actions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CVV_Optional"), value,
				value);
	}

	public void cb_Add_your_payment_details() {
		String CB_Add_your_payment_details = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Add_your_payment_details"));
		actions.verifyText(CB_Add_your_payment_details, "Add your payment details");
	}

	public void cb_Complete_your_order() {
		String CB_Complete_your_order = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_CureBay_locators_PreLoginlocators", "CB_Complete_your_order"));
		actions.verifyText(CB_Complete_your_order, "Complete your order");
	}

	public void cb_Pay_subscribe() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Pay_subscribe"),
				"Pay & subscribe");
	}

	public void cb_text_btn_Next() throws InterruptedException {
		actions.swipeUp_FindElementClick(5,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_text_btn_Next"),
				"Next");
//		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_btn_Next"),"Next");
	}

	public void cb_messageinfo() throws InterruptedException {
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_messageinfo"));
	}

	public void cb_Cancel() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Cancel"),
				"Cancel");
	}

	public void cb_Take_care_of_your_loved_ones_from_miles_away() {
		String CB_Take_care_of_your_loved_ones_from_miles_away = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_Take_care_of_your_loved_ones_from_miles_away"));
		actions.verifyText(CB_Take_care_of_your_loved_ones_from_miles_away,
				"Take care of your loved ones, from miles away.");
	}

	public void cb_text_Sign_Up_Now() {
		String CB_Sign_Up_Now = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Sign_Up_Now"));
		actions.verifyText(CB_Sign_Up_Now, "Sign Up Now");
	}

	public void cb_taps_Sign_Up_Now() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Sign_Up_Now"),
				"Sign Up Now");
	}

	public void cb_text_Sign_Up() {
		String CB_Sign_Up = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Sign_Up"));
		actions.verifyText(CB_Sign_Up, "Sign Up");
	}

	public void cb_Text_GeneralHealth() {
		String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_CarePlans_GeneralHealth"));
		actions.verifyText(text, "General Health");
	}

	public void cb_Text_CardiacCare() {
		String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_CarePlans_CardiacCare"));
		actions.verifyText(text, "Cardiac Care");
	}

	public void cb_navigate_back_icon() {
		try {
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_navigate_back_icon"), "Navigate Back Icon");
		} catch (Exception e) {
			navigatesback();
		}
	}

	public void cb_General_Health_Read_More() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_General_Health_Read_More"), "General Health Read More");
	}

	public void cb_Cardiac_Care_Read_More() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Cardiac_Care_Read_More"), "Cardiac Care Read More");
	}

	public void cb_text_Bringinghealthcarerightatyourparentsdoorstep() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Bringinghealthcarerightatyourparentsdoorstep"));
		actions.verifyText(text, "Bringing healthcare right at your parent's doorstep");
	}

	public void cb_text_User_Dashboard() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_User_Dashboard"));
		actions.verifyText(text, "User-Dashboard");
	}

	public void cb_text_Yourfathershealthreportatyourfingertips() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Yourfathershealthreportatyourfingertips"));
		actions.verifyText(text, "Your father's health report at your fingertips.");
	}

	public void cb_slidesUserDashboardslider() throws InterruptedException {
		actions.SwipeByCoordinates(600, 1110, 50, 1110);
	}

	public void cb_Virtual_Consultation() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Virtual_Consultation"));
		actions.verifyText(text, "Virtual Consultation");
	}

	public void cb_Participateinyourmothersnextconsultation() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Participateinyourmothersnextconsultation"));
		actions.verifyText(text, "Participate in your mother's next consultation.");
	}

	public void cb_slidesVirtualConsultationslider() throws InterruptedException {
		actions.SwipeByCoordinates(600, 1110, 50, 1110);
	}

	public void cb_text_Vitals() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Vitals"));
		actions.verifyText(text, "Vitals");
	}

	public void cb_text_Stayinformedwithongoingmonitoring() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Stayinformedwithongoingmonitoring"));
		actions.verifyText(text, "Stay informed with ongoing monitoring.");
	}

	public void cb_text_Specialities() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Doctors_Specialities"));
		actions.verifyText(text, "Specialities");
	}

	public void cb_text_All_Specialities() {
		String CB_All_Specialities = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_All_Specialities"));
		actions.verifyText(CB_All_Specialities, "All Specialities");
	}

	public void cb_Text_Why_choose_CureBay() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(6,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Why_choose_CureBay"));
		actions.verifyText(text, "Why choose CureBay");
	}

	public void cb_Text_Why_choose_CureBay_eClinic() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Why_choose_CureBay_eClinic"));
		actions.verifyText(text, "eClinic");
	}

	public void cb_Text_Why_choose_CureBay_Technology_platform() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Why_choose_CureBay_Technology_platform"));
		actions.verifyText(text, "Technology platform");
	}

	public void cb_Text_Why_choose_CureBay_Consumer_application() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Why_choose_CureBay_Consumer_application"));
		actions.verifyText(text, "Consumer application");
	}

	public void cb_Text_Why_choose_CureBay_Health_tech_devices() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Why_choose_CureBay_Health_tech_devices"));
		actions.verifyText(text, "Health tech devices");
	}

	public void cb_Text_Why_choose_CureBay_Situation_room() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Why_choose_CureBay_Situation_room"));
		actions.verifyText(text, "Situation room");
	}

	public void cb_Text_Why_choose_CureBay_Network_providers() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Why_choose_CureBay_Network_providers"));
		actions.verifyText(text, "Network providers");
	}

	public void user_should_able_to_see_Holistic_care_plans() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "cb_Why_choose_CureBay_Holistic_care_plans"));
		actions.verifyText(text, "Holistic care plans");
	}

	public void user_should_able_to_see_Always_stay_updated() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "cb_Why_choose_CureBay_Always_stay_updated"));
		actions.verifyText(text, "Always stay updated");
	}

	public void user_should_able_to_see_Achieve_health_goals() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "cb_Why_choose_CureBay_Achieve_health_goals"));
		actions.verifyText(text, "Achieve health goals");
	}

	public void user_should_able_to_see_Round_the_clock_access() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "cb_Why_choose_CureBay_Round_the_clock_access"));
		actions.verifyText(text, "Round the clock access");
	}

	public void user_should_able_to_see_Advanced_technology() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "cb_Why_choose_CureBay_Advanced_technology"));
		actions.verifyText(text, "Advanced technology");
	}

	public void cb_Happy_patients() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Happy_patients"));
		actions.verifyText(text, "Happy patients");
	}

	public void cb_Happy_patients_count() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Happy_patients_count"));
	}

	public void cb_eClinics_in_Odisha() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_eClinics_in_Odisha"));
		actions.verifyText(text, "eClinics in Odisha");
	}

	public void cb_eClinics_in_Odisha_count() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_eClinics_in_Odisha_count"));
	}

	public void cb_Specialities() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Specialities"));
		actions.verifyText(text, "Specialities");
	}

	public void cb_Specialities_count() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Specialities_count"));
	}

	public void cb_Service_providers() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Service_providers"));
		actions.verifyText(text, "Service providers");
	}

	public void cb_Service_providers_count() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Service_providers_count"));
	}

	public void cb_Villages_and_towns_covered() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(3, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Villages_and_towns_covered"));
		actions.verifyText(text, "Villages and towns covered");
	}

	public void cb_Villages_and_towns_covered_count() throws InterruptedException {
		actions.swipeUp_FindElementGetText(3, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Villages_and_towns_covered_count"));
	}

	public void cb_Book_for_a_free_screening_session_now() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(7, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Book_for_a_free_screening_session_now"));
		actions.verifyText(text, "Book for a free screening session now");
	}

	public void cb_Bookforafreehealthassessmentforyourparentswhichwillhelpyouchoosethebestcareplanforthem()
			throws InterruptedException {
		actions.swipeUp_FindElement(7,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Book_Now"));
		try {
//			String text = actions.swipeUp_FindElementGetText(7, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//					"CB_Bookforafreehealthassessmentforyourparentswhichwillhelpyouchoosethebestcareplanforthem"));
			String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Bookforafreehealthassessmentforyourparentswhichwillhelpyouchoosethebestcareplanforthem"));
		} catch (Exception e) {
			System.out.println();
		}
	}

	public void user_swipes_up_the_screen_to_Explore_our_healthcare_plans() throws InterruptedException {
		actions.swipeUp_FindElement(7,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Book_Now"));
		try {
//			String text = actions.swipeUp_FindElementGetText(7, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
//					"CB_Bookforafreehealthassessmentforyourparentswhichwillhelpyouchoosethebestcareplanforthem"));
			String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Explore_our_healthcare_plans"));
		} catch (Exception e) {
			System.out.println();
		}
	}

	public void cb_click_Book_Now() throws InterruptedException {
		actions.swipeUp_FindElementClick(7,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Book_Now"),
				"Book Now");
	}

	public void cb_Text_New_Booking() {
		try {
			String text = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_New_Booking"));
//			actions.verifyText(text, "New Booking");
		} catch (Exception e) {
			System.out.println("New Booking not in popup");
		}

	}

	public void cb_Text_Booking_Confirmation() {
		try {
			String text = actions.getText(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_alertTitle"));
//			actions.verifyText(text, "Booking Confirmation");
		} catch (Exception e) {
			System.out.println("Booking Confirmation not in popup");
		}

	}

	public void cb_Clicks_BOOK_NOW() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_BOOK_NOW"),
				"BOOK NOW");
	}

	public void cb_Text_Book_for_your_Pre_Counselling() {
		String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Book_for_your_Pre_Counselling"));
		actions.verifyText(text, "Book for your Pre-Counselling!");
	}

	public void cb_Add_Care_Giver_details_name_text_box() {
		String Name = "Test" + DataTime;
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Add_Care_Giver_details_name_text_box"), Name, Name);
	}

	public void cb_Add_Care_Giver_details_name_text_box(String string) {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Add_Care_Giver_details_name_text_box"), string, string);
	}

	public void cb_Add_Care_Giver_details_country_code_dropdown() {

		switch (data_UDID) {

		case "VSWCZ5Q8U4YTCAS4":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Add_Care_Giver_details_country_code_dropdown"), "country code dropdown");
			break;

		case "ZF6223VL42":
			try {
				actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_Add_Care_Giver_details_country_code_dropdown"), "country code dropdown");
				Thread.sleep(3000);
				actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_Add_Care_Giver_details_country_code_dropdown"), "country code dropdown");
			} catch (Exception e) {
			}

			break;

		default:
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Add_Care_Giver_details_country_code_dropdown"), "country code dropdown");
		}
	}

	public void cb_text_Enter_country_name() {
		actions.waitForElement(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_text_Enter_country_name"), 30);
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_text_Enter_country_name"), "India", "India");
	}

	public void cb_Click_country_India_91() {
		switch (data_UDID) {
		case "VSWCZ5Q8U4YTCAS4":
			actions.Click(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_country_India_91"),
					"India (+91)");
			break;

		case "ZF6223VL42":
			try {
				actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_country_India_91"), "India (+91)");
				Thread.sleep(3000);
				actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_country_India_91"), "India (+91)");
			} catch (Exception e) {
			}

			break;

		default:
			actions.Click(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_country_India_91"),
					"India (+91)");
		}

	}

	public void cb_Add_Care_Giver_details_Phone_Number() {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Add_Care_Giver_details_Phone_Number"), "91" + DataTime, "91" + DataTime);
	}

	public void cb_Add_Care_Giver_details_Phone_Number(String string) {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Add_Care_Giver_details_Phone_Number"), string, string);
	}

	public void cb_Add_Care_Giver_details_Email_Address() {
		actions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_Add_Care_Giver_details_Email_Address"),
				"Test" + DataTime + "@gmail.com", "Test" + DataTime + "@gmail.com");
	}

	public void cb_Add_Care_Giver_details_Email_Address(String string) {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Add_Care_Giver_details_Email_Address"), string, string);
	}

	public void cb_Care_Receiver_details_name_text_box() {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Care_Receiver_details_name_text_box"), "Testing" + DataTime, "Testing" + DataTime);
	}

	public void cb_Care_Receiver_details_name_text_box(String string) {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Care_Receiver_details_name_text_box"), string, string);
	}

	public void cb_Click_Select_relation() {
		switch (data_UDID) {
		case "VSWCZ5Q8U4YTCAS4":
			actions.Click(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Select_relation"),
					"Select relation");
			break;

		case "ZF6223VL42":
			try {
				actions.Click(
						MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Select_relation"),
						"Select relation");
				Thread.sleep(3000);
				actions.Click(
						MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Select_relation"),
						"Select relation");
			} catch (Exception e) {
			}

			break;

		default:
			actions.Click(
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Select_relation"),
					"Select relation");
		}
		
	}

	public void cb_Click_Select_relation_cancel() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Select_relation_cancel"), "Cancel");
	}

	public void cb_Click_Select_relation_Self() {
		actions.waitForVisible(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Select_relation_Self"));
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Select_relation_Self"),
				"Self");
	}

	public void cb_Click_Care_Receiver_details_country_code_dropdown() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Care_Receiver_details_country_code_dropdown"), "country code dropdown");
	}

	public void cb_Care_Receiver_details_Phone_Number() {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Care_Receiver_details_Phone_Number"), "91" + DataTime, "91" + DataTime);
	}

	public void cb_Care_Receiver_details_Phone_Number(String string) {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Care_Receiver_details_Phone_Number"), string, string);
	}

	public void cb_Care_Receiver_details_Location() {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Care_Receiver_details_Location"), "Testing Area", "Testing Area");
	}

	public void cb_Care_Receiver_details_Location(String string) {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Care_Receiver_details_Location"), string, string);
	}

	public void cb_Click_Send_Inquiry() {
		switch (data_UDID) {
		case "VSWCZ5Q8U4YTCAS4":
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Send_Inquiry"),
					"Send Inquiry");
			break;

		case "ZF6223VL42":
			try {
				actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Send_Inquiry"),
						"Send Inquiry");
				Thread.sleep(3000);
				actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Send_Inquiry"),
						"Send Inquiry");
			} catch (Exception e) {
			}

			break;

		default:
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Send_Inquiry"),
					"Send Inquiry");
		}
		
	}

	public void cb_Book_android_message() {
		try {
			actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_Book_android_message"));
		} catch (Exception e) {
		}
	
	}

	public void cb_Book_OK() {
		try {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Book_OK"), "OK");
		} catch (Exception e) {
		}
	}

	public void cb_click_Book_Add_More_Member() throws InterruptedException {
		actions.swipeUp_FindElementClick(4,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Add_More_Member"),
				" + Add More Member");
	}

	public void cb_text_Add_More_Member_Remove() {
		String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Add_More_Member_Remove"));
		actions.verifyText(text, "Remove");
	}

	public void cb_click_remove() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Add_More_Member_Remove"), "Remove");
	}

	public void cb_text_Frequently_Asked_Questions() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(10, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Frequently_Asked_Questions"));
		actions.verifyText(text, "Frequently Asked Questions");
	}

	public void cb_text_QWhatisPreAssessment() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(2, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_QWhatisPreAssessment"));
		actions.verifyText(text, "Q. What is Pre-Assessment?");
	}

	public void cb_text_QWhatisPreAssessment_Answer() throws InterruptedException {
		actions.swipeUp_FindElementGetText(2, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_QWhatisPreAssessmentAnswer"));
	}
	public void cb_text_QWhatisHealthAssessment() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(2, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_QWhatisHealthAssessment"));
		actions.verifyText(text, "Q. What is Health-Assessment?");
	}

	public void cb_text_QWhatisHealthAssessment_Answer() throws InterruptedException {
		actions.swipeUp_FindElementGetText(2, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_QWhatisHealthAssessmentAnswer"));
	}

	public void cb_text_WhatisPreAssessment() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_WhatisPreAssessment"));
		actions.verifyText(text, "What is Pre-Assessment?");
	}

	public void cb_Click_WhatisPreAssessment() throws InterruptedException {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_WhatisPreAssessment"),
				"What is Pre-Assessment?");
	}

	public void cb_text_WhatisPreAssessment_Answer() throws InterruptedException {
		actions.swipeUp_FindElementGetText(2, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_WhatisPreAssessmentAnswer"));
	}
	
	public void cb_text_WhatisHealthAssessment() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_WhatisHealthAssessment"));
		actions.verifyText(text, "What is Health-Assessment?");
	}

	public void cb_Click_WhatisHealthAssessment() throws InterruptedException {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_WhatisHealthAssessment"),
				"What is Health-Assessment?");
	}

	public void cb_text_WhatisHealthAssessment_Answer() throws InterruptedException {
		actions.swipeUp_FindElementGetText(2, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_WhatisHealthAssessmentAnswer"));
	}

	public void cb_text_CanIchoosemorethanoneplanifIhave2diseases() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_CanIchoosemorethanoneplanifIhave2diseases"));
		actions.verifyText(text, "Q. Can I choose more than one plan if I have 2 diseases?");
	}

	public void cb_text_Yesyoucanchoosemorethanoneplan() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Yesyoucanchoosemorethanoneplan"));
		actions.verifyText(text, "Yes you can choose more than one plan..");
	}

	public void cb_text_FormoreanswersreadourFAQPagen() throws InterruptedException {
		String text = actions.swipeUp_FindElementGetText(2, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_FormoreanswersreadourFAQPage"));
		actions.verifyText(text, "For more answers read our FAQ Page");
	}

	public void cb_Click_FormoreanswersreadourFAQPage() throws InterruptedException {
		actions.swipeUp(1);

//		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_FormoreanswersreadourFAQPage"),"For more answers read our FAQ Page");
		try {
			actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
					"CB_FormoreanswersreadourFAQPage"), "For more answers read our FAQ Page");
//			actions.clickUsingCoordinates(80, 1456);
//			actions.clickUsingCoordinates(545, 1524);

//			WebElement element = DriverFactory.getInstance().getMobileDriver().findElement(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_FormoreanswersreadourFAQPage"));
//			Point locations = element.getLocation();

//			int x = point.x +1;  
//			int y = point.y + element.getSize().getHeight() - 1;
//
//			new TouchAction(driver).tap(x, y).perform();
		} catch (Exception e) {
		}

//		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_FormoreanswersreadourFAQPage","For more answers read our FAQ Page"));
//		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_FormoreanswersreadourFAQPage"),
//				"For more answers read our FAQ Page");

	}

	public void cb_text_FAQ() throws InterruptedException {
		String text = actions
				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_FAQ"));
		actions.verifyText(text, "FAQ");
	}

	public void cb_text_CanIchoosemorethanoneplanifIhave2ChronicConditions() throws InterruptedException {
		String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_CanIchoosemorethanoneplanifIhave2ChronicConditions"));
		actions.verifyText(text, "Can I choose more than one plan if I have 2 Chronic Conditions?");
	}

	public void cb_Click_CanIchoosemorethanoneplanifIhave2ChronicConditions() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_CanIchoosemorethanoneplanifIhave2ChronicConditions"),
				"Can I choose more than one plan if I have 2 Chronic Conditions?");
	}

	public void cb_text_CanIchoosemorethanoneplanifIhave2ChronicConditionsrelaventanswer() throws InterruptedException {
//		String text = 
		actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_CanIchoosemorethanoneplanifIhave2ChronicConditionsrelaventanswer"));
//		actions.verifyText(text, "Yes, you can choose more than one plan.");
	}

	public void cb_Click_CanIusethesameaccountformorethanonefamilymember() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_CanIusethesameaccountformorethanonefamilymember"),
				"Can I use the same account for more than one family member?");
//		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CanIusethesameaccountformorethanonefamilymember"),
//				"Can I use the same account for more than one family member?");
	}

	public void cb_text_CanIusethesameaccountformorethanonefamilymemberrelaventanswer() throws InterruptedException {
		actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_CanIusethesameaccountformorethanonefamilymemberrelaventanswer"));
//		String text =
//				actions
//				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_CanIusethesameaccountformorethanonefamilymemberrelaventanswer"));
//		actions.verifyText(text, "Yes, you can use the same account and add your family members to that account.");
	}

	public void cb_Click_HowdoImakethepayment() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HowdoImakethepayment"),
				"How do I make the payment?");
//		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HowdoImakethepayment"),
//				"How do I make the payment?");
	}

	public void cb_text_HowdoImakethepaymentrelaventanswer() throws InterruptedException {
		actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_HowdoImakethepaymentrelaventanswer"));
//		String text =
		actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_HowdoImakethepaymentrelaventanswer"));
//		actions.verifyText(text, "You can make online payment using Stripe.");
//		String text = actions
//				.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_HowdoImakethepaymentrelaventanswer"));
//		actions.verifyText(text, "You can make online payment using Stripe.");
	}

	public void cb_Click_DoIneedtosubmitanydocuments() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_DoIneedtosubmitanydocuments"), "Do I need to submit any documents?");
	}

	public void cb_text_DoIneedtosubmitanydocumentsrelaventanswer() throws InterruptedException {
		actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_DoIneedtosubmitanydocumentsrelaventanswer"));
//		String text =
		actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_DoIneedtosubmitanydocumentsrelaventanswer"));
//		actions.verifyText(text, "No, You don't have to submit any documents.");
	}

	public void cb_click_Canweoptoutifwehavechosenamonthlypayout() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_Canweoptoutifwehavechosenamonthlypayout"),
				"Can we opt-out if we have chosen a monthly pay-out?");
	}

	public void cb_text_CanweoptoutifwehavechosenamonthlypayoutAnswer() throws InterruptedException {
		actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_CanweoptoutifwehavechosenamonthlypayoutAnswer"));
	}

	public void cb_Click_CanIrescheduletheappointment() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_CanIrescheduletheappointment"), "Can I re-schedule the appointment?");
	}

	public void cb_text_CanIrescheduletheappointmentAnswer() throws InterruptedException {
		actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_CanIrescheduletheappointmentAnswer"));
	}

	public void cb_WillIbeabletodoaphysicaldoctorconsultation() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_WillIbeabletodoaphysicaldoctorconsultation"),
				"Will I be able to do a physical doctor consultation?");
	}

	public void cb_WillIbeabletodoaphysicaldoctorconsultationAnswer() throws InterruptedException {
		actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_WillIbeabletodoaphysicaldoctorconsultationAnswer"));
	}

	public void cb_Canwedoanylabtestsbasedonourcustomrequirements() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_Canwedoanylabtestsbasedonourcustomrequirements"),
				"Can we do any lab tests based on our custom requirements?");
	}

	public void cb_CanwedoanylabtestsbasedonourcustomrequirementsAnswer() throws InterruptedException {
		actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_CanwedoanylabtestsbasedonourcustomrequirementsAnswer"));
	}

	public void cb_Whatallcanbetrackedonthedashboard() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Whatallcanbetrackedonthedashboard"), "What all can be tracked on the dashboard?");
	}

	public void cb_WhatallcanbetrackedonthedashboardAnswer() throws InterruptedException {
		actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_WhatallcanbetrackedonthedashboardAnswer"));
	}

	public void cb_WhataretheOnDemandServices() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_WhataretheOnDemandServices"), "What are the On Demand Services?");
	}

	public void cb_WhataretheOnDemandServicesAnswer() throws InterruptedException {
		actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_WhataretheOnDemandServicesAnswer"));
	}

	public void cb_Ismydatasafe() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Ismydatasafe"),
				"Is my data safe?");
	}

	public void cb_Ismydatasaferelaventanswer() throws InterruptedException {
//		String text =
		actions.swipeUp_FindElementGetText(2, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Ismydatasaferelaventanswer"));
//		actions.verifyText(text, "You health data is protected by our firewall. We adhere to a strict privacy policy.");
	}

	public void cb_Click_Is_the_support_team_available_24_7() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Is_the_support_team_available_24_7"), "Is the support team available 24*7?");
	}

	public void cb_text_Is_the_support_team_available_24_7relaventanswer() throws InterruptedException {
//		String text =
		actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_Is_the_support_team_available_24_7relaventanswer"));
//		actions.verifyText(text, "Yes, the support team is available 24*7 to answer all you queries and doubts. We also have a quick emergency response protocol.");
	}

	public void cb_HowcanIcancelmymembership() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_HowcanIcancelmymembership"), "How can I cancel my membership?");
	}

	public void cb_HowcanIcancelmymembershiprelaventanswer() throws InterruptedException {
//		String text =
		actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
				"CureBay_locators_PreLogin", "CB_HowcanIcancelmymembershiprelaventanswer"));
//		actions.verifyText(text, "You can simply go to your account and cancel your membership.");
	}

	public void user_should_able_to_see_Check_medicare_services_near_to_your_parents_area()
			throws InterruptedException {
		String CB_Check_medicare = actions.swipeUp_FindElementGetText(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Check_medicare"));
		actions.verifyText(CB_Check_medicare, "Check medicare");
		String CB_servicesneartoyourparentsarea = actions.swipeUp_FindElementGetText(2, MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_servicesneartoyourparentsarea"));
		actions.verifyText(CB_servicesneartoyourparentsarea, "services near to your parents area.");
	}

	public void user_enters_Pincode() {
		actions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_enters_Pincode"),
				"600019");
	}

	public void cb_Click_Check() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Check"),
				"Check");
	}

	public void cb_user_should_able_to_see_nearest_eClinc_image_attached_Or_should_able_to_see()
			throws InterruptedException {
		try {
			String CB_Check_medicare_ErrorMessage = actions.swipeUp_FindElementGetText(2,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Check_medicare_ErrorMessage"));
//			actions.verifyText(CB_Check_medicare_ErrorMessage, "Sorry, No medicare services near to your parent's area.");
//			actions.verifyText(CB_Check_medicare_ErrorMessage, "Pincode is not valid.");
		} catch (Exception e) {
			String CB_Check_medicare_Chennai = actions.swipeUp_FindElementGetText(2, MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Check_medicare_Chennai"));
			actions.verifyText(CB_Check_medicare_Chennai, "Chennai");
			String CB_Check_medicare_Zipcode600016 = actions.swipeUp_FindElementGetText(2,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Check_medicare_Zipcode600016"));
			actions.verifyText(CB_Check_medicare_Zipcode600016, "Zipcode- 600016");
			String CB_Check_medicare_EclinicNameECLINICCHENNAI = actions.swipeUp_FindElementGetText(2,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
							"CB_Check_medicare_EclinicNameECLINICCHENNAI"));
			actions.verifyText(CB_Check_medicare_EclinicNameECLINICCHENNAI, "Eclinic Name- ECLINIC-CHENNAI");
		}

	}

	public void cb_Saluation_dropdown() {
		actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Saluation_dropdown"),
				"Saluation Dropdown");
	}

	public void cb_Saluation_Mr() {
		actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Saluation_Mr"),
				"Mr");
	}

	public void user_enters_first_name_and_last_name() {
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_firstName"),
				firstName, firstName);
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_lastName"),
				lastName, lastName);
	}

	public void user_selects_Blood_Group_details_from_Blood_Group_dropdown() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Blood_Group_dropdown"),
				"Blood Group");

		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Blood_Group_dropdown_B"), "B+");
	}

	public void user_selects_Relation_details_from_Relation_dropdown() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Relation_dropdown"),
				"Relation dropdown");

//		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Relation_Self"),"Self");
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Relation_Others"),
				"Others");
	}

	public void user_selects_Gender_detatils_from_Gender_dropdown() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Gender_dropdown"),
				"Gender dropdown");

		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Gender_Male"), "Male");
	}

	public void cb_Add_country_code_dropdown() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Country_dropdown"),
				"Country dropdown");
	}

	public void cb_Add_State_code_dropdown() throws InterruptedException {
		switch (data_UDID) {

		case "VSWCZ5Q8U4YTCAS4":

			actions.swipeUp_FindElementClick(2,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_State_dropdown"),
					"State dropdown");
			break;
		case "ZF6223VL42":
			try {
				actions.swipeUp(1);
				actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
						"CureBay_locators_PreLogin", "CB_State_dropdown"), "State dropdown");
				actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_State_dropdown"), "State dropdown");
			} catch (Exception e) {
				System.out.println(" ");
			}
			break;
		default:
			actions.swipeUp_FindElementClick(2,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_State_dropdown"),
					"State dropdown");

		}

	}

	public void cb_Tamil_Nadu() throws InterruptedException {
		try {
			actions.swipeUp_FindElementClick(3,
					MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Tamil_Nadu"),
					"Tamil Nadu");
		} catch (Exception e) {
			System.out.println(" ");
		}

	}

	public void cb_user_enters_valid_phone_number_in_phone_number_box() throws InterruptedException {
		actions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Phone_Number"),
				"91" + DataTime, "91" + DataTime);
	}

	public void cb_user_enters_valid_Emergency_Contact_Number() throws InterruptedException {
		actions.swipeUp_FindElement(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Emergency_Contact_Number"));
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Emergency_Contact_Number"), "91" + DataTime, "91" + DataTime);
	}

	public void cb_user_valid_Email_id_in_Email_text_box() throws InterruptedException {
		actions.swipeUp_FindElement(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Email_Address"));
		actions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Email_Address"),
				"Test" + DataTime + "@gmail.com", "Test" + DataTime + "@gmail.com");
	}

	public void cb_user_enters_Address_id_in_Address_text_box() throws InterruptedException {
		actions.swipeUp_FindElement(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Enter_Address"));
		actions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Enter_Address"),
				"Test Area" + DataTimeMMDD, "Test Area" + DataTimeHHmm);
	}

	public void cb_user_enters_Locality_in_Locality_Town_box() throws InterruptedException {
		actions.swipeUp_FindElement(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Enter_Locality_Town"));
		actions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Enter_Locality_Town"),
				"Auto Area" + DataTimeMMDD, "Auto Area" + DataTimeHHmm);
	}

	public void cb_user_enters_valid_pincode_in_pincode_box() throws InterruptedException {
		actions.swipeUp_FindElement(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Enter_Pincode"));
		actions.sendKeys(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Enter_Pincode"),
				"600019", "600019");
	}

	public void cb_user_enters_City_in_City_text_box() throws InterruptedException {
		actions.swipeUp_FindElement(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Enter_City"));
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Enter_City"),
				"Chennai", "Chennai");
	}

	public void cb_user_enters_State_in_state_text_box() throws InterruptedException {
		actions.swipeUp_FindElement(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Enter_State"));
		actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Enter_State"),
				"TamilNadu", "TamilNadu");
	}

	public void cb_Smartphoneaccessavailableforuser() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Smartphoneaccessavailableforuser"), "Check");
	}

	public void user_taps_on__Save_Member_button() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Save_Member"),
				"Save Member");
	}

	public void check_Medicare() {
		String CB_Check_medicare = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Check_medicare"));
		actions.verifyText(CB_Check_medicare, "Check medicare");
		String services_Parent = actions.getText(MobileUtil
				.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_servicesneartoyourparentsarea"));
		actions.verifyText(services_Parent, "services near to your parents area.");

	}

	public void cb_Plan_Details() {
		String CB_Plan_Details = actions.getText(
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Plan_Details"));
		actions.verifyText(CB_Plan_Details, "Plan Details");

	}

	public void user_taps_on_Detailed_baseline_evaluation_symptomaticcareNurse() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_DetailedbaselineevaluationsymptomaticcareNurse"),
				"Detailed baseline evaluation & symptomatic care - Nurse");
	}

	public void user_should_able_to_see_a_short_note_on_baseline_evaluation_symptomatic_care_Nurse() {
		try {
			actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_DetailedbaselineevaluationsymptomaticcareNurse_short_note"));
		} catch (InterruptedException e) {
		}

	}

	public void user_taps_on_Detailed_baseline_evaluation_symptomatic_care_Lab_test() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_DetailedbaselineevaluationsymptomaticcareLabtest"),
				"Detailed baseline evaluation & symptomatic care - Lab test");
	}

	public void user_should_able_to_see_a_short_note_on_Detailed_baseline_evaluation_symptomatic_care_Lab_test() {
		try {
			actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_DetailedbaselineevaluationsymptomaticcareLabtest_short_note"));
		} catch (InterruptedException e) {
		}

	}

	public void user_taps_on_complete_health_review_care_by_orthopedician() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_CompletehealthreviewcarebyOrthopedician"),
				"Complete health review & care by Orthopedician");
	}

	public void user_should_able_to_see_a_short_note_on_complete_health_review_care_by_orthopedician() {
		try {
			actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_CompletehealthreviewcarebyOrthopedician_short_note"));
		} catch (InterruptedException e) {
		}

	}

	public void user_taps_on_specialty_care_and_referral() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Specialtycareandreferral"), "Specialty care and referral");
	}

	public void user_should_able_to_see_a_short_note_on_specialty_care_and_referral() {
		try {
			actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Specialty_care_and_referral_short_note"));
		} catch (InterruptedException e) {
		}

	}

	public void user_taps_on_periodic_online_follow_ups_and_care() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Periodiconlinefollowupsandcare"), "Periodic online follow-ups and care ");
	}

	public void user_should_able_to_see_a_short_note_on_periodic_online_follow_ups_and_care() {
		try {
			actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Periodic_online_follow_ups_and_care_short_note"));
		} catch (InterruptedException e) {
		}

	}

	public void user_taps_on_physiotherapy() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Physiotherapy"),
				"Physiotherapy");
	}

	public void user_should_able_to_see_a_short_note_on_physiotherapy() {
		try {
			actions.swipeUp_FindElementGetText(2, MobileUtil
					.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_Physiotherapy_short_note"));
		} catch (InterruptedException e) {
		}

	}

	public void user_taps_on_paramedical_care_nutritionist() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Paramedical_care_Nutritionist"), "Paramedical care - Nutritionist");
	}

	public void user_should_able_to_see_a_short_note_on_paramedical_care_nutritionist() {
		try {
			actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Paramedical_care_Nutritionistr_short_note"));
		} catch (InterruptedException e) {
		}

	}

	public void user_taps_on_paramedical_care_health_educator() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ParamedicalcareHealthEducator"), "Paramedical care - Health Educator");
	}

	public void user_should_able_to_see_a_short_note_on_paramedical_care_health_educator() {
		try {
			actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Paramedical_care_Health_Educator_short_note"));
		} catch (InterruptedException e) {
		}

	}

	public void user_taps_on_paramedical_care_in_person_nurse_visit() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_ParamedicalcareInPersonNursevisit"), "Paramedical care - In-Person Nurse visit");
	}

	public void user_should_able_to_see_a_short_note_on_paramedical_care_in_person_nurse_visit() {
		try {
			actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Paramedical_care_In_Person_Nurse_visit_short_note"));
		} catch (InterruptedException e) {
		}

	}

	public void user_taps_on_comprehensive_quarterly_care_by_the_physician() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
						"CB_Comprehensivequarterlycarebythephysician"),
				"Comprehensive quarterly care by the physician");
	}

	public void user_should_able_to_see_a_short_note_on_comprehensive_quarterly_care_by_the_physician() {
		try {
			actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Comprehensive_quarterly_care_by_the_physician_short_note"));
		} catch (InterruptedException e) {
		}

	}

	public void user_taps_on_6_monthly_lab_tests() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_6monthlylabtests"),
				"6 monthly lab tests");
	}

	public void user_should_able_to_see_a_short_note_on_6_monthly_lab_tests() {
		try {
			actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_6_monthly_lab_tests_short_note"));
		} catch (InterruptedException e) {
		}

	}

	public void user_taps_on_in_person_nurse_visit() throws InterruptedException {
		actions.swipeUp_FindElementClick(2,
				MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin", "CB_InPersonNursevisit"),
				"In-Person Nurse visit");
	}

	public void user_should_able_to_see_a_short_note_on_in_person_nurse_visit() {
		try {
			actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_In_Person_Nurse_visit_short_note"));
		} catch (InterruptedException e) {
		}

	}

	public void user_taps_on_annual_outcome_lab_tests() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_Annualoutcomelabtests"), "Annual outcome - lab tests");
	}

	public void user_should_able_to_see_a_short_note_on_annual_outcome_lab_tests() {
		try {
			actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Annual_outcome_lab_tests_short_note"));
		} catch (InterruptedException e) {
		}

	}

	public void user_taps_on_annual_outcome_in_person_nurse_visit() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_AnnualoutcomeInPersonNursevisit"), "Annual outcome - In-Person Nurse visit");
	}

	public void user_should_able_to_see_a_short_note_on_annual_outcome_in_person_nurse_visit() {
		try {
			actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Annual_outcome_In_Person_Nurse_visit_short_note"));
		} catch (InterruptedException e) {
		}

	}

	public void user_taps_on_annual_outcome_general_physician() throws InterruptedException {
		actions.swipeUp_FindElementClick(2, MobileUtil.returnByBasedOnPageNameAndObjectName("CureBay_locators_PreLogin",
				"CB_AnnualoutcomeGeneralPhysician"), "Annual outcome - General Physician");
	}

	public void user_should_able_to_see_a_short_note_on_annual_outcome_general_physician() {
		try {
			actions.swipeUp_FindElementGetText(2, MobileUtil.returnByBasedOnPageNameAndObjectName(
					"CureBay_locators_PreLogin", "CB_Annual_outcome_General_Physician_short_note"));
		} catch (InterruptedException e) {
		}

	}

	public void user_selects_one_Profile_from_the_lists() {
		try {
			actions.swipeUp_FindElementClick(3, By.xpath("//android.widget.TextView[@text='" + profileName + "']"),
					profileName);
//			actions.Click(By.xpath("//android.widget.TextView[@text='" + profileName + "']"), profileName);
		} catch (InterruptedException e) {
		}

	}

}
