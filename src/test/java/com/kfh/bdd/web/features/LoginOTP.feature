@LoginWithOTP
Feature: Verify and Validate the Login with OTP Functionality

  Background: 

  Scenario Outline: <TC_LGNOTP_ID> Validate Login with <SCENARIO>
    When User clicks on the Request Login OTP button
    Then User should able to see the Login OTP page
    And User should able to see the text "Please enter the code"
    When User enters the Login OTP <OTP CODE>
    And User clicks on the Continue button
    Then User should able to see the error message <EXPECTED ERROR MESSAGE>

    Examples: 
      | TC_LGNOTP_ID  | SCENARIO                                           | OTP CODE | EXPECTED ERROR MESSAGE |
      | TC_LGNOTP_001 | with Previously Generated OTP After Expiry Timeout |          |                        |
      | TC_LGNOTP_002 | with Invalid OTP                                   |          |                        |
      | TC_LGNOTP_003 | by leaving otp field empty                         |          |                        |
