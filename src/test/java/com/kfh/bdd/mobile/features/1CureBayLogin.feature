@CureBay @Login @Profile @PostLogin @CBTesting @TestingCB @curebay12 @21092023 @CBDEMO
Feature: Login functionality of CureBay Mobile App

  @TC_L_C_001 @Test @TC_POL_028 @TC_PR_009 @15092023 @TC_PR_014_TC_PR_029_1 @TC_PR_002
  Scenario: TC_L_001 Login the CureBay Login functionality
    When user taps Login SignUp button
    Then user should able to see login page
    When user enters valid email id in email mobile text box as "Leelareddy@gmail.com"
    And user enters valid password in password box as "Leela@12345"
    And user taps on next button
    And user taps on NEVER or Save for Save password "NEVER"
    Then user should able to see dashboard Screen
