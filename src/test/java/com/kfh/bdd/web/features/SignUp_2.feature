@Signup
Feature: Verify and Validate the Siging Up Functionalities

  Background: 
    Given User is on the #Application Name

  @Signup_negative
  Scenario Outline: <TC_SIGNUP_ID> Verify <FUNCTIONALITY> text field <SCENARIO>
    When User enters the Valid CivilID
    And User enters the Valid ATM Account Number
    And User enters the Valid PIN Number
    And User checks the Acknowledge checkbox
    And User click on the Submit button
    Then User should be able to a message "If your Mobile Number is correct Press send Code"
    When User clicks on the  Send Code button
    Then User should be able to see the last three digit valid Mobile Number
    When User enters the OTP <OTP CODE>
    And User click on the Submit button
    Then User should able to see error message <EXPECTED ERROR MESSAGE>

    Examples: 
      | TC_SIGNUP_ID  | FUNCTIONALITY | OTP CODE   | SCENARIO                | EXPECTED ERROR MESSAGE |
      | TC_SIGNUP_012 | OTP           |     000007 | by invalid otp          |                        |
      | TC_SIGNUP_013 | OTP           | JAMES Bond | by invalid alpha values |                        |
      | TC_SIGNUP_014 | OTP           | ""         | without entering otp    |                        |

  @Signup_negative
  Scenario Outline: <TC_SIGNUP_ID> Verify <FUNCTIONALITY> text field <SCENARIO>
    When User enters the Valid CivilID
    And User enters the Valid ATM Account Number
    And User enters the Valid PIN Number
    And User checks the Acknowledge checkbox
    And User click on the Submit button
    Then User should be able to a message "If your Mobile Number is correct Press send Code"
    When User clicks on the  Send Code button
    Then User should be able to see the last three digit valid Mobile Number
    When User enters the Valid Code
    Then User should be able to see the text Remaining Time to Resend SMS Code
    When User click on the Submit button
    Then User should see the text "Please Choose a Login name and a password"
    When User enters the Username <USERNAME>
    And User click on the Submit button
    Then User should able to see the error message <EXPECTED ERROR MESSAGE>

    Examples: 
      | TC_SIGNUP_ID  | FUNCTIONALITY | USERNAME          | SCENARIO                                              | EXPECTED ERROR MESSAGE |
      | TC_SIGNUP_015 | Username      | James             | by entering text less than 6 char                     |                        |
      | TC_SIGNUP_016 | Username      | JAMES&BOND        | by entering text more than 6 char having special char |                        |
      | TC_SIGNUP_017 | Username      | JAMES BOND        | by entering text more than 6 char having space        |                        |
      | TC_SIGNUP_018 | Username      | JAMESBOND00000007 | by entering text more than 16 char                    |                        |
      | TC_SIGNUP_019 | Username      | ""                | without entering text                                 |                        |

  @Signup_negative
  Scenario Outline: <TC_SIGNUP_ID> Verify <FUNCTIONALITY> text field <SCENARIO>
    When User enters the Valid CivilID
    And User enters the Valid ATM Account Number
    And User enters the Valid PIN Number
    And User checks the Acknowledge checkbox
    And User click on the Submit button
    Then User should be able to a message "If your Mobile Number is correct Press send Code"
    When User clicks on the  Send Code button
    Then User should be able to see the last three digit valid Mobile Number
    When User enters the Valid Code
    Then User should be able to see the text Remaining Time to Resend SMS Code
    When User click on the Submit button
    Then User should see the text "Please Choose a Login name and a password"
    When User enters the Username " " #<---- pass valid username
    And User enters the Password <PASSWORD>
    And User enters <PASSWORD> in the Confirm Password field
    And User click on the Submit button
    Then User should able to see the error message <EXPECTED ERROR MESSAGE>

    Examples: 
      | TC_SIGNUP_ID  | FUNCTIONALITY | PASSWORD                                          | SCENARIO                                                         | EXPECTED ERROR MESSAGE |
      | TC_SIGNUP_020 | Password      | ""                                                | by entering username in the field                                |                        |
      #<---- pass valid username which was entered in username textbox
      | TC_SIGNUP_021 | Password      | JAMES07                                           | by entering text less than 8 char in the field                   |                        |
      | TC_SIGNUP_022 | Password      | jamesbon                                          | by entering 8 char alpha text only                               |                        |
      | TC_SIGNUP_023 | Password      | JAMES007                                          | by entering 8 char alpha numeric text only                       |                        |
      | TC_SIGNUP_024 | Password      | JAMES789                                          | by entering 8 char text having more than two consecutive digits  |                        |
      | TC_SIGNUP_025 | Password      | JAMES007                                          | by entering 8 char text having more than two consecutive letters |                        |
      | TC_SIGNUP_026 | Password      | "HERE PASS THE TEXT HAVING SOME PART OF USERNAME" | by entering 8 char text having a part of username                |                        |
      | TC_SIGNUP_027 | Password      | JAMESBON                                          | by entering 8 char uppercase alpha text only                     |                        |
      | TC_SIGNUP_028 | Password      | JAMESBOND00007                                    | by entering more than 14 char text in the field                  |                        |

  @Signup_negative
  Scenario Outline: TC_SIGNUP_029 Verify Confirm Password text field by entering different text
    When User enters the Valid CivilID
    And User enters the Valid ATM Account Number
    And User enters the Valid PIN Number
    And User checks the Acknowledge checkbox
    And User click on the Submit button
    Then User should be able to a message "If your Mobile Number is correct Press send Code"
    When User clicks on the  Send Code button
    Then User should be able to see the last three digit valid Mobile Number
    When User enters the Valid Code
    Then User should be able to see the text Remaining Time to Resend SMS Code
    When User click on the Submit button
    Then User should see the text "Please Choose a Login name and a password"
    When User enters the Username " " #<---- pass valid username
    When User enters the Password <PASSWORD>
    And User enters "HERE PASS THE TEXT WHICH YOU HAVEN'T ENTERED IN PASSWORD FIELD" in the Confirm Password field
    And User click on the Submit button
    Then User should able to see the error message <EXPECTED ERROR MESSAGE>

  @Signup_negative
  Scenario Outline: TC_SIGNUP_030 Verify Sign up functionality by leaving text fields empty
    When User enters the Valid CivilID
    And User enters the Valid ATM Account Number
    And User enters the Valid PIN Number
    And User checks the Acknowledge checkbox
    And User click on the Submit button
    Then User should be able to a message "If your Mobile Number is correct Press send Code"
    When User clicks on the  Send Code button
    Then User should be able to see the last three digit valid Mobile Number
    When User enters the Valid Code
    Then User should be able to see the text Remaining Time to Resend SMS Code
    When User click on the Submit button
    Then User should see the text "Please Choose a Login name and a password"
    When User enters the Username "DON'T PASS THE DATA"
    When User enters the Password "DON'T PASS THE DATA"
    And User enters "DON'T PASS THE DATA" in the Confirm Password field
    And User click on the Submit button
    Then User should able to see the error message <EXPECTED ERROR MESSAGE>
