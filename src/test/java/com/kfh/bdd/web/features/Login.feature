Feature: To Verify the #Application Name

  Background: 
    Given User is on the KFH online
	@Signup
  Scenario: Tc_KuwaitLogin_001 To Verify the #details
  	When User click on New User signup link
    When User enters the Valid CivilID
    And User enters the Valid ATM Account Number
    And User enters the Valid PIN Number
    And User checks the Acknowledge checkbox
    And User click on the Submit button
    Then User should be able to a message "If your Mobile Number is correct Press send Code"
    When User clicks on the  Send Code button
    #Then User should be able to see the last three digit valid Mobile Number
    When User navigate to OTP url
    When User enters the Valid Code
    Then User should be able to see the text Remaining Time to Resend SMS Code
    When User click on the Submit button
    
    #Please Choose a Login name and a password
    #can modify in a switch cases all the Then stmts
    Then User should see the text "Please Choose a Login name and a password"
    When User enters the Valid Username and PassWord
    And User enters the Confirm Password
    And User clicks on the Password Expiry Period dropdown
    And User select one option from the dropdown
    Then User should be able to see all the Notes displayed below
    When User click on the Submit button
    Then User should be able to see the message Thank you for your registration
    
    #site key after Regisration
    When User enters the valid Username
    And User enters the 5 digit of your account number
    And User clicks on Login
    Then User should be able to see the message "Please choose one of the images and the click Submit:"
    When User clicks on the Cup images radio button
    And User click on the Submit button
    Then User should be able to see the selected image
    When User enters the title or discription for selected image
    And User click on the Submit button
    Then User should be able to see the confirmation message as "Please Confirm on the following information you selected"
    When User enters the value for What is the name of the street on which you grew up
    And User enters the value for What is your favourite hobby
    And User enters the value for Who is your favourite Author
    And User clicks on the Confirm button
    Then User should be able to see the password page
    When User enters the password and clicks on the Login button
    Then User should be able to get the Login OTP page
    
    #After OTP entered
    When User clicks on the Request Login OTP button
    Then User should be taken to the next tab
    When User enters the code
    And User clicks on the Continue button
    Then User should be able to see the Kuwait finance House Page
