@CureBay @Login_123  
Feature: Login functionality of CureBay Mobile App

  Background: Opening Curebay mobile application
    When user taps on curebay application
    #Then user should able to see care plans screens
    When user taps Login SignUp button
    Then user should able to see login screen

  #@curebay_login_valid
  #Scenario: TC_LS_001 Verify login functionality with valid email and vaild password
  #When user enters valid email id in email/mobile number text box
  #And user enters valid password in password text box
  #And user taps on next button
  #Then user should able to see dashboard screens
  #
  @curebay_login_valid_number
  Scenario: TC_LS_002 Verify login functionality with valid mobile number and vaild otp
    When user enters valid mobile number in email/mobile number text box
    Then user should able to see password text box is not visible
    When user taps on submit button
    Then user should able to see otp text boxes
    When user enter valid otp
    And user taps on submit button
    Then user should able to see dashboard screens

  @curebay_invalid_characters
  Scenario: TC_LS_003 Verify login functionality with invalid characters in email/mobile number text box
    When user enters invalid integer characters in email/mobile number text box
    And user taps on next button
    Then user should see a dialog box with error message 'please enter a valid 10 digit mobile number'
    When user taps on ok
    And user clears the entered characters
    And user enters invalid special characters in email/mobile number text box
    And user enters valid password in password text box
    And user taps on next button
    Then user should able to see a dialog box with error message "please enter a valid email address"

  @ivalid_otp
  Scenario: TC_LS_004 Verify login functionality with valid mobile number and invalid otp
    When user enters valid mobile number in email/mobile number text box
    And user taps on submit button
    Then user should able to see otp text boxes
    When user enters invalid valid otp
    And user taps on submit button
    Then user should able to see a error message

  #--> bug
  @valid_signup @sign_up1
  Scenario: TC_LS_005 Verify Sign up functionality with valid data
    When user taps on Sign Up Screen
    Then user should able to see Sign Up Screens
    When user enters valid name text in name text boxs
    And user taps on country code drop down
    And user taps on canada code
    And user enters valid number in mobile number text field
    And user enters valid email id in email text field
    And user taps on Same as Mobile Number check box
    And user enters valid password in password field
    And user enters same valid password in Confirm Password field
    And user taps on submit button
    Then user should able to see a success message as"Signed up successfully"

  #And user should able to see login screen
  #--> bug, missing functionality country code ,success message
  @inavlid_sign_up @sign_up1
  Scenario Outline: <TC_LS_ID> Verify Sign up functionality by entering <Description>
    When user taps on Sign Up Screen
    Then user should able to see Sign Up Screens
    When user enters <Name> in name text box
    And user enters <Number> in mobile number text box
    And user enters <Email> in email text box
    And user enters <WhatsAppNum> in WhatsApp Number
    And user enters <Password_1> in password box
    And user enters <Password_2> in Confirm Password box
    And user taps on submit button
    Then user should able to see error message of invalid

    Examples: 
      | TC_LS_ID  | Name     | Number     | Email               | WhatsAppNum | Password_1 | Password_2 | Description                                            |
      | TC_LS_006 |   122637 | 1111111111 | abcd@gmail.com      |  1111111111 | NewUser2A@ | NewUser2A@ | invalid integer text in name box                       |
      | TC_LS_007 | abcd123  | 1111111111 | abcd@gmail.com      |  1111111111 | NewUser2A@ | NewUser2A@ | invalid alphanumeric text in name box                  |
      | TC_LS_008 | absh@$92 | 1111111111 | abcd@gmail.com      |  1111111111 | NewUser2A@ | NewUser2A@ | invalid special char in name box                       |
      | TC_LS_009 | Tester   |     123456 | abcd@gmail.com      |  1111111111 | NewUser2A@ | NewUser2A@ | invalid integer text in mobile number box              |
      | TC_LS_010 | Tester   | 1ab3n456   | abcd@gmail.com      |  1111111111 | NewUser2A@ | NewUser2A@ | invalid alphanumeric text in mobile number box         |
      | TC_LS_011 | Tester   | abd%@12    | abcd@gmail.com      |  1111111111 | NewUser2A@ | NewUser2A@ | invalid special char in mobile number box              |
      | TC_LS_012 | Tester   | 1111111111 | 1677367@gmail.com   |  1111111111 | NewUser2A@ | NewUser2A@ | invalid integer text with @ gmail in email box         |
      | TC_LS_013 | Tester   | 1111111111 |             1677367 |  1111111111 | NewUser2A@ | NewUser2A@ | invalid integer text without @ gmail in email box      |
      | TC_LS_014 | Tester   | 1111111111 | 1abc3426@gmail.com  |  1111111111 | NewUser2A@ | NewUser2A@ | invalid alphanumeric text with @ gmail in email box    |
      | TC_LS_015 | Tester   | 1111111111 | 1abc3426            |  1111111111 | NewUser2A@ | NewUser2A@ | invalid alphanumeric text without @ gmail in email box |
      | TC_LS_016 | Tester   | 1111111111 | abc@$%d12@gmail.com |  1111111111 | NewUser2A@ | NewUser2A@ | invalid special char text with @ gmail in email box    |
      | TC_LS_017 | Tester   | 1111111111 | abc@$%d12           |  1111111111 | NewUser2A@ | NewUser2A@ | invalid special char text without @ gmail in email box |
      | TC_LS_018 | Tester   | 1111111111 | abcd@gmail.com      |      123456 | NewUser2A@ | NewUser2A@ | invalid integer text in WhatsApp num box               |
      | TC_LS_019 | Tester   | 1111111111 | abcd@gmail.com      | 1ab3n456    | NewUser2A@ | NewUser2A@ | invalid alphanumeric text in WhatsApp num box          |
      | TC_LS_020 | Tester   | 1111111111 | abcd@gmail.com      | abd%@12     | NewUser2A@ | NewUser2A@ | invalid special char text in WhatsApp num box          |
      | TC_LS_021 | Tester   | 1111111111 | abcd@gmail.com      |  1111111111 |   11122227 |   11122272 | 8 char integer text in password boxes                  |
      | TC_LS_022 | Tester   | 1111111111 | abcd@gmail.com      |  1111111111 | newusers   | newusers   | 8 char calpha text in password boxes                   |
      | TC_LS_023 | Tester   | 1111111111 | abcd@gmail.com      |  1111111111 | newuser1   | newuser1   | 8 char alphanumeric text in password box               |
      | TC_LS_024 | Tester   | 1111111111 | abcd@gmail.com      |  1111111111 | NewUser2A@ | NewUser2Aa | 10 char special char different text in password boxes  |
      | TC_LS_025 | Tester   | 1111111111 | abcd@gmail.com      |  1111111111 | Newu2@     | Newu2@     | 6 char special char text in password boxes             |
      | TC_LS_026 | ""       | 1111111111 | abcd@gmail.com      |  1111111111 | NewUser2A@ | NewUser2A@ | name box                                               |
      | TC_LS_027 | Tester   | ""         | abcd@gmail.com      |  1111111111 | NewUser2A@ | NewUser2A@ | Mobile number box                                      |
      | TC_LS_028 | Tester   | 1111111111 | ""                  |  1111111111 | NewUser2A@ | NewUser2A@ | email box                                              |
      | TC_LS_029 | Tester   | 1111111111 | abcd@gmail.com      | ""          | NewUser2A@ | NewUser2A@ | WhatApp Num box                                        |
      | TC_LS_030 | Tester   | 1111111111 | abcd@gmail.com      |  1111111111 | ""         | NewUser2A@ | password box                                           |
      | TC_LS_031 | Tester   | 1111111111 | abcd@gmail.com      |  1111111111 | NewUser2A@ | ""         | confirm password box                                   |
      | TC_LS_032 | ""       | ""         | ""                  | ""          | ""         | ""         | All fields                                             |

  @forgot_password @forgot_password_12
  Scenario: TC_LS_033 Verify forgot password functionality by using valid email id and valid otp
    When User taps on the curebay application
    #And User click on login or signup button
    #Then User should be able to see login page
    When user taps on forgot password link
    And user enters valid email id
    And user taps on next
    Then user should able to see the "ForgotPassword" Screen
    And user should able to see Enter Your Otp
    #And user should able to see resend otp link
    And user should able to see resend otp timer
    When user enters valid otp
    And user taps on submit button

  #Then user should able to see the"UpdatePasswordForgotPassword" screen
  #And user should able to see Update Forgot password
  #When user enters valid text in password box
  #And user enters same valid text in confirm password box
  #And user taps on submit button
  #Then user should able to see success popup message
  #And user should able to Login screen
  #When user enters same valid email id
  #And user enters newly generated password
  #And user taps on next
  #Then user should able to see dasboard screen
  @forgot_password @forgot_password_122
  Scenario: TC_LS_034 Verify forgot password functionality with valid invalid email id
    When User taps on the curebay application
    #And User click on login or signup button
    #Then User should be able to see login page
    When user taps on forgot password link
    And user enters invalid email id
    And user taps on next
    Then user should able to see enter valid email error message
@inalid_otp_forgot_pass
  Scenario: TC_LS_035 Verify forgot password functionality with valid invalid otp
    When user taps on forgot password link
    And user enters valid email id
    And user taps on next
    Then user should able to see the "ForgotPassword" Screen
    And user should able to see Enter Your Otp
    #And user should able to see resend otp link
    And user should able to see resend otp timer
    When user enters invalid otp
    And user taps on submit button
    Then user should able to see error message foe invalid otp

  #->bug, navigating to update forgot password screen
  
  @TC_LS_ID_036_035
  Scenario Outline: <TC_LS_ID> Verify update forgot password screen with <Description>
    When user taps on forgot password link
    And user enters valid email id
    And user taps on next
    Then user should able to see the "ForgotPassword" Screen
    And user should able to see Enter Your Otp
    #And user should able to see resend otp link
    And user should able to see resend otp timer
    When user enters valid otp
    And user taps on submit button

    #Then user should able to see "UpdatePasswordForgotPassword" screen -->bug, not aligned properly
    #And user should able to see Update Forgot password
    #When user enters <password1> in password box
    #And user enters <password2> in confirm password box
    #And user taps on submit button
    #Then user should able to see error message
    #---> password criteria not displayed error message not displayed TC_LS_037
    #--->error messages not displayed under boxes TC_LS_038
    Examples: 
      | TC_LS_ID  | password1 | password2 | Description                      |
      | TC_LS_036 |     64838 |     64838 | same integer number in two boxes |
      | TC_LS_037 |           |           | blank                            |
      | TC_LS_038 | abcd      | abce      | different text in two box    |
