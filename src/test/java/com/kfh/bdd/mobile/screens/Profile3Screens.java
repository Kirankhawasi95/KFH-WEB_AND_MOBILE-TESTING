package com.kfh.bdd.mobile.screens;

import com.kfh.bdd.ccl.MobileActions;
import com.kfh.bdd.integrations.common_utils.MobileUtil;

public class Profile3Screens {
	//change password
	MobileActions mobileactions=new MobileActions();
	
	public void changePswd()
	{
	 mobileactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "profile_changepswd"),"Change pswd");
	}

	public void checkchangePswdpage()
	{
	String profileTxt= mobileactions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "profile_changepswd"));
	 mobileactions.verifyText(profileTxt, "Change Password");
	}
  public void enterOldpswd(String oldpassword)
  {
	  mobileactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "profile_enteroldpswd"), "Enter old paswd");
	  mobileactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "profile_enteroldpswd"),oldpassword);
  }
  public void enterNewpswd(String newpassword_1)
  {
	  mobileactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "profile_enternewpswd"), "Enter new paswd");
	  mobileactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "profile_enternewpswd"),newpassword_1);
	  mobileactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "change_pass_eye_icon"), "Enter new paswd");

  }
  public void confirmNewpswd(String newpassword_2)
  {
	  mobileactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule","profile_confirmnewpswd"), newpassword_2);
	  mobileactions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "profile_confirmnewpswd"),newpassword_2);
	  mobileactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "change_pass_eye_icon"), "Enter new paswd");

  }
  public void clickSave()
  {
	  //mobileactions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Curebay_ScheduleModule", "profile_clicksaveBtn"), "Click Save");
  }
  public void getERRmsg()
  {
	  mobileactions.getToastMessage();
  }
}
