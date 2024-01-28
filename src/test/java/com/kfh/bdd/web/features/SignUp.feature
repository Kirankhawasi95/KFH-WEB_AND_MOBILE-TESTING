@SignUp
Feature: To Verify the Sign up of #Application

  Background: 
    Given User is on the #Application Name

  Scenario Outline: <Tc_Signup_ID> To Verify <ID> text field  <data> SignUp page
    When User enters the InValid <CivilID>
    And User enters the InValid ATM <AccountNumber>
    And User enters the InValid Pin<PINNumber>
    And User checks the Acknowledge checkbox
    And User click on the Submit button
    Then User should be able to see <errorMessage>

    Examples: 
      | Tc_Signup_ID | ID             | data                             | CivilID      | AccountNumber | PINNumber   | errorMessage       |
      | Tc_Signup_02 | Civil ID       | by entering invalid ID           |     23456677 | validAccNo    | ValidPINNo  | expected error msg |
      | Tc_Signup_03 | Civil ID       | by entering invalid alpha values | adcdefgh     | validAccNo    | ValidPINNo  | expected error msg |
      | Tc_Signup_04 | Civil ID       | by without entering text         | ""           | validAccNo    | ValidPINNo  | expected error msg |
      | Tc_Signup_05 | ATM Account No | by entering invalid ID           | validCivilID |     234567890 | ValidPINNo  | expected error msg |
      | Tc_Signup_06 | ATM Account No | by entering invalid alpha values | validCivilID | adcvfghjd     | ValidPINNo  | expected error msg |
      | Tc_Signup_07 | ATM Account No | by without entering text         | validCivilID | ""            | ValidPINNo  | expected error msg |
      | Tc_Signup_08 | PIN Number     | by entering invalid ID           | validCivilID | validAccNo    | 23456789123 | expected error msg |
      | Tc_Signup_09 | PIN Number     | by entering invalid alpha values | validCivilID | validAccNo    | asdfgtrhjk  | expected error msg |
      | Tc_Signup_10 | PIN Number     | by without entering text         | validCivilID | validAccNo    | ""          | expected error msg |
