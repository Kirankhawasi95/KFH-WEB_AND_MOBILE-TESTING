@CureBay @PreLogin @CureBayTest
Feature: Verify CureBay Pre Login functionalities

  

  @TC_PL_001 @CBDEMO
  Scenario: TC_PL_002 Verify adding key features to cart without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
    When user taps on menu
    Then user should able to see menu items
    When user taps on curebay experience menu item
    Then user should able to see Welcome to our eClinic Screen
    And user should able to see general health in curebay experience screen
    When user taps on general health
    And user taps on add to cart
    Then user should able to see a popup Please login to continue.
    And user taps on login button
    Then user should able to see login screen

 
  @TC_PL_002 
  Scenario: TC_PL_002 Verify All Specialities Screen without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
    When user taps on menu
    Then user should able to see menu items
    When user taps on Doctors menu item
    Then user should able to see "Specialities" in the screen
    When user taps on the See All
    Then user should able to see "All Specialities" screen
    When user enters valid speciality in search box
    Then user should able to see the speciality entered
    When user taps on the speciality
    Then user should able to see "All available doctors"
    And user should able to see number of doctors found
    And user should able to see doctor name in All available doctors
    And user should able to see doctor's speciality in All available doctors
    And user should able to see experience in All available doctors
    And user should able to see location in All available doctors
    And user should able to see Video Consultation fee
    When user taps on Read more
    Then user should able to see information on doctor
    When user enters vaild doctor name in search textbox
    Then user should able see the doctor availabilty
    When user taps on navigates back icon
    Then user should able to see "All Specialities" screen
    When user taps on navigates back icon
    Then user should able to see "Specialities" in the screen
    
    
@TC_L_003
 Scenario: TC_L_001 Login the CureBay Login functionality
    When user taps Login SignUp button
    Then user should able to see login page
    When user enters valid email id in email mobile text box as "Leelareddy@gmail.com"
    And user enters valid password in password box as "Leela@12345"
    And user taps on next button
    #And user taps on NEVER or Save for Save password "NEVER"
    Then user should able to see dashboard Screen

#@TC_PR_006 @17082023AA  @TestingCB
#Scenario: TC_PR_006 Verify Add Memeber functionality 
#---> bug, there is no response after tapping on check button
    #When user taps on profile icon
    #Then user should able to see My Profile Screen
    #When user taps on Manage Profile
    #Then user should able to see See Profiles
    #When user taps on Add Member button
    #Then user should able to see Check medicare services near to your parents area
    #And user should able to see Add Member Details
    #When user enters valid Pincode
    #And user taps on Check button
    #Then user should able to see nearest eClinc image attached Or should able to see "Sorry there is no eClinic near to your locality, we will get back to you soon"
    #When user taps on salutation dropdown
     #--> bug, dropdown is disabled
    #And user selects relavent salutation
    #Then user should able to see relavent gender updated in gender box
    #And user enters first name and last name
    #And user taps on the calendar icon
    #And user selects relavent DOB
    #And user selects Blood Group details from Blood Group dropdown
    #And user selects Relation details from Relation dropdown
    #And user selects Gender detatils from Gender dropdown
    #And user selects Country details from country dropdown
    #And user selects Country from Country code dropdown
    #And user enters valid phone number in phone number box
    #And user enters valid Emergency Contact Number
    #And user valid Email id in Email text box
    #And user enters Address in address text box
    #And user enters Locality in Locality Town text box
    #And user enters valid Pincode in Pincode text box
    #And user enters City in City text box
    #And user selects State from State dropdown
    #And user enters State in state text box
    #Then user should able to see  Nearby e-clinics
    #When user taps on Smartphone access available for user.
    #And user taps on  Save Member button 
    #-->bug save member button is not present
    #Then user should able to see created member profile is present in See Profiles screen

@TC_PR_004 @28082023 @CBDEMO
Scenario: TC_PR_005 Verify Manage Profile in My Profile Screen
    When user taps on profile icon
    Then user should able to see "My Profile" Screen
    When user taps on Manage Profile
    Then user should able to see See Profiles
    And user should able to see Profile name
    And user should able to see Patient id
    And user should able to see Gender
    And user should able to see Relation
    And user should able to see Blood group
    And user should able to see DOB
    And user should able to see Package Name
    When user taps on profile menu
    Then user should able to see View
    When user taps on View link
    Then user should able to see Manage Profile Edit page
    #-> not aligned properly
    And user should able to see Details
    And user should able to see Profiles name
    And user should able to see ID Number
    And user should able to see Edit button
    And user should able to see Profile Details
    And user should able to see Personal Details
    And user should able to see Salutation
    And user should able to see First Name
    And user should able to see Last Name
    And user should able to see Genders
    And user should able to see Mobile Number
    And user should able to see Relations
    And user should able to see Date of Birth
    And user should able to see Blood Group
    And user should able to see Email
    And user should able to see Age
    And user should able to see Contact Details
    And user should able to see House No Street Name
    And user should able to see Pincode
    And user should able to see Address
    And user should able to see City
    And user should able to see State
    When user taps on navigate back icon
    Then user should able to see See Profiles





  
