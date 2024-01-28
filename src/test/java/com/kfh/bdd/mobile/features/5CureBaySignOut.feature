@CureBay @CBTesting @curebay12 @21092023
Feature: ign out functionality of CureBay Mobile Ap

  @TC_PR_007 @06092023 @13092023 @TestingCB
  Scenario: TC_PR_007 Verify Sign out functionality
    When user taps on profile icon
    Then user should able to see My Profile Screen
    When user taps on Sign Out
    #Then user should able to see login page
    Then user should able to see Login and Sign-up
    #--> bug #--> bug dashboard page displayed
    When user closes and opens the app
    #Then user should able to see login page
    Then user should able to see Login and Sign-up
