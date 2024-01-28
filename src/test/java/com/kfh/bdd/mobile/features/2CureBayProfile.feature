@CureBay @Profile @CBTesting 
Feature: Verify Profile functionalities

  
	@TC_PR_001 @Demo 
  Scenario: TC_PR_001 Verify My Profile Screen
    When user taps on profile icon
    Then user should able to see My Profile Screen
    And user should able to see My Details 
    And user should able to see My Plans 
    And user should able to see Health Records 
    And user should able to see Review 
    And user should able to see Manage Profile 
    And user should able to see Change Password 
    And user should able to see Sign Out 
    When user taps on close icon
    Then user should able to see previous in Screen


@TC_PR_002 @TestingCB
Scenario: TC_PR_002 Verify My Prescription in My Profile Screen
    When user taps on profile icon
    And user taps on Health Records
    Then user should able to see My Prescription
    When user taps on My Prescription
    Then user should able to see Health Records Screen
    And user should able to see Prescription
    And user should able to see symptoms in the prescription
    And user should able to see Doctor Name
    And user should able to see Any Allergy
    And user should able to see Consultation Date
    And user should able to see Next Consultation Date
    When user taps on View Prescription link
    Then user should able to see the prescription details
    When user taps on Download prescription
    Then user should able to see prescription file
    #And user taps on Copy to and choose file and taps on Paste
    Then user should able to see downloaded prescription file

@TC_PR_003
Scenario: TC_PR_003 Verify My Labs Reports in My Profile Screen
    When user taps on profile icon
    And user taps on Health Records
    Then user should able to see My Lab Reports
    When user taps on My Lab Reports
    Then user should able to see Health Records
    And user should able to see Lab Reports
    #When user taps on Lab Reports
    #Then user should able to see the reports
    #And user should able to see Test Name in the Report
    #And user should able to see Lab Name in the Report
    #And user should able to see Date in the Report
    #And user should able to see Order id in the Report
    #When user taps on view Lab Report link
    #Then user should able to see the Lab Report
    #When user taps on Download Lab Report
    #Then user should able to see downloaded Lab Report file


@TC_PR_004
    Scenario: TC_PR_004 Verify My Vitals in My Profile Screen
    When user taps on profile icon
    And user taps on Health Records
    Then user should able to see My Vitals
    When user taps on My Vitals
    Then user should able to see Health Records
    #And user should able to see Your Vitals
    #And user should able to see Temperature
    #And user should able to see Temperature "Normal Range (95-100)" and Last Updated
    #And user should able to see current "Temperature" range
    #And user should able to see HeartRate
    #And user should able to see HeartRate "Normal Range (60-100)" and Last Updated
    #And user should able to see "Last Updated:"
    #And user should able to see current "HeartRate" range
    #And user should able to see SPo2
    #And user should able to see SPo2 "Normal Range (95-100)" and Last Updated
    #When swipes the screen to Height
    #Then user should able to see Height "Normal Range (50-200)" and Last Updated
    #When swipes the screen to Weight
    #Then user should able to see Weight "Normal Range (10-30)" and Last Updated
    #When swipes the screen to RespirationRate
    #Then user should able to see RespirationRate "Normal Range (12-16)" and Last Updated
     #When swipes the screen to BP
    #Then user should able to see BP "Normal Range (90-120)" and Last Updated
    #When swipes the screen to BMI
    #Then user should able to see BMI "Normal Range (18.5-25)" and Last Updated

@TC_PR_005 @28082023 @CBDEMO
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
    #And user should able to see Personal Details
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


@TC_PR_006 @17082023AA  @TestingCB
Scenario: TC_PR_006 Verify Add Memeber functionality 
#---> bug, there is no response after tapping on check button
    When user taps on profile icon
    Then user should able to see My Profile Screen
    When user taps on Manage Profile
    Then user should able to see See Profiles
    When user taps on Add Member button
    Then user should able to see Check medicare services near to your parents area
    And user should able to see Add Member Details
    When user enters valid Pincode
    And user taps on Check button
    Then user should able to see nearest eClinc image attached Or should able to see "Sorry there is no eClinic near to your locality, we will get back to you soon"
    When user taps on salutation dropdown
     #--> bug, dropdown is disabled
    And user selects relavent salutation
    #Then user should able to see relavent gender updated in gender box
    And user enters first name and last name
    And user taps on the calendar icon
    And user selects relavent DOB
    And user selects Blood Group details from Blood Group dropdown
    And user selects Relation details from Relation dropdown
    And user selects Gender detatils from Gender dropdown
    #And user selects Country details from country dropdown
    And user selects Country from Country code dropdown
    And user enters valid phone number in phone number box
    And user enters valid Emergency Contact Number
    And user valid Email id in Email text box
    And user enters Address in address text box
    And user enters Locality in Locality Town text box
    And user enters valid Pincode in Pincode text box
    And user enters City in City text box
    And user selects State from State dropdown
    #And user enters State in state text box
    Then user should able to see  Nearby e-clinics
    When user taps on Smartphone access available for user.
    And user taps on  Save Member button 
    #-->bug save member button is not present
    Then user should able to see created member profile is present in See Profiles screen
    
  #@TC_PR_007
#Scenario: TC_PR_007 Verify Sign out functionality
    #When user taps on profile icon
    #Then user should able to see My Profile Screen
    #When user taps on Sign Out
    #Then user should able to see login page
    #Then user should able to see pre login screen
     #--> bug #--> bug dashboard page displayed
    #When user closes and opens the app
    #Then user should able to see login page
    #Then user should able to see pre login screen 
    

@TC_PR_008
Scenario: TC_PR_008 Verify My Plans screen
    When user taps on profile icon
    And user taps on My Plans
    Then user should able to see My Plans
    When user taps on dropdown related to select Patient Name
    And user taps on patient Name
    #When user selects patient Name from the drop down
    And user taps on radio button related the care plans
    #And user choose the care plans if having one or more plans
    Then user should able to see Validity Left days and Renewal Date
    #Then user should able to see Validity Left
    #And user should able to see Renewal Date
    #And user should able to see Plan Details
    #When users taps on navigates back icon
    When user taps on navigates back icon
    Then user should able to see dashboard Screen
    #Then user should able to see My Profile Screen 
    #--> Dashboard screen displayed bug
@TC_PR_009
  Scenario: TC_PR_009 Verify Review Screen
    When user taps on profile icon
    And user taps on Review
    Then user should able to see Review Screen
    And user should able to Please Share your feedback
    #And user should able to see questions
    #And user should able to see rating radio buttons
    When user selects relavent rating individually for all questions
    And user entered valid feedback text in feedback text box
    And user taps on submit button
    Then user should able to see Review Added Successfully
		When user clicks on OK button
		Then user backs to review screen



		
#		@TC_L_P_003
#		Scenario: TC_L_P_003 Verify Review in My Profile Screen
#			When user taps on profile icon
    #Then user should able to see My Profile Screen
    #When user taps on Review
#		Then user should able to Review Screen
#		And user should able to Please Share your feedback
#		And user should able to see Question1
#		When user clicks on points related Question1 
#		And user should able to see Question1 selected point
#		 And user should able to see Question2
#		When user clicks on points related Question2 
#		And user should able to see Question2 selected point
#		 And user should able to see Question3
#		When user clicks on points related Question3 
#		And user should able to see Question3 selected point
#		And user should able to see Question4
#		When user clicks on points related Question4 
#		And user should able to see Question4 
#		And user should able to see Question5
#		When user enter your feedback 
#		And user clicks on Submit button
#		Then user should able to see Review Added Successfully
#		When user clicks on OK button
#		Then user backs to review screen
		
		
    
    
    #And user should able to see "Last Updated:"
    #And user should able to see current "Temperature" range
    #And user should able to see Triglycerides
    #And user should able to see Triglycerides "Normal Range (0-150)" and Last Updated
    #And user should able to see "Last Updated:"
    #And user should able to see current "Triglycerides" range
    #!When swipes the screen to Diastolic
    #!Then user should able to see Diastolic "Normal Range (60-80)" and Last Updated
    #And user should able to see "Last Updated:"
    #And user should able to see current "Diastolic" range
    #!When swipes the screen to Weight
    #!Then user should able to see Weight "Normal Range (10-30)" and Last Updated
    #And user should able to see "Last Updated:"
    #And user should able to see current "Weight" range
    #!When swipes the screen to BP
    #!Then user should able to see BP "Normal Range (90-120)" and Last Updated
    #And user should able to see "Last Updated:"
    #And user should able to see current "BP" range
    #!When swipes the screen to HDL
    #!Then user should able to see HDL "Normal Range (0-60)" and Last Updated
    #And user should able to see "Last Updated:"
    #And user should able to see current "HDL" range
    #!When swipes the screen to BloodGlucose
    #!Then user should able to see BloodGlucose "Normal Range (70-130)" and Last Updated
    #And user should able to see "Last Updated:"
    #And user should able to see current "BloodGlucose" range
    #!When swipes the screen to LDL
    #!Then user should able to see LDL "Normal Range (0-100)" and Last Updated
    #And user should able to see "Last Updated:"
    #And user should able to see current "LDL" range
    #!When swipes the screen to Systolic
    #!Then user should able to see Systolic "Normal Range (90-120)" and Last Updated
    #And user should able to see "Last Updated:"
    #And user should able to see current "Systolic" range
    #!When swipes the screen to PulseRate
    #!Then user should able to see PulseRate "Normal Range (60-100)" and Last Updated
    #And user should able to see "Last Updated:"
    #And user should able to see current "PulseRate" range
    #!When swipes the screen to Height
    #!Then user should able to see Height "Normal Range (50-200)" and Last Updated
    #And user should able to see "Last Updated:"
    #And user should able to see current "Height" range
    #!When swipes the screen to TotalCholesterol
    #!Then user should able to see TotalCholesterol "Normal Range (0-200)" and Last Updated
    #And user should able to see "Last Updated:"
    #And user should able to see current "TotalCholesterol" range
    #!When swipes the screen to RespirationRate
    #!Then user should able to see RespirationRate "Normal Range (12-16)" and Last Updated
    #And user should able to see "Last Updated:"
    #And user should able to see current "RespirationRate" range
    #!When swipes the screen to BMI
    #!Then user should able to see BMI "Normal Range (18.5-25)" and Last Updated
    #And user should able to see "Last Updated:"
    #And user should able to see current "BMI" range
    
    
     #@TC_L_P_007
    #Scenario: TC_L_P_007 Verify My Plans in My Profile Screen
    #When user taps on profile icon
    #And user taps on My Plans
    #Then user should able to see My Plans
    #When user taps on dropdown related to select Patient Name
    #And user taps on patient Name 
    #Then user should able to see related to patient details
    #And user taps on radio button related the care plans
    #Then user should able to see Validity Left days and Renewal Date
    #When user taps on Pre screening and selection of right care package
    #Then user should able to see Pre screening and selection of right care package with short note 
    #When user taps on Detailed baseline evaluation and care Nurse
    #Then user should able to see Detailed baseline evaluation & care - Nurse with short note
     #When user taps on Detailed baseline evaluation & care - Lab test
    #Then user should able to see Detailed baseline evaluation & care - Lab test with short note
    #When user taps on Complete health review & care by physician
    #Then user should able to see Complete health review & care by physician with short note
    #When user taps on Speciality care and referral
    #Then user should able to see Speciality care and referral with short note
    #When user taps on Periodic calls for health assessment
    #Then user should able to see Periodic calls for health assessment with short note
    #When user taps on Paramedical care
    #Then user should able to see Paramedical care with short note
    #When user taps on Full health check-up and care
    #Then user should able to see Full health check-up and care with short note
    #
    #When user taps on 6monthly lab tests
    #Then user should able to see 6 monthly lab tests with short note
    #When user taps on Detailed final check-up & care
    #Then user should able to see Detailed final check-up & care with short note
#
    #
    #@TC_L_P_008
    #Scenario: TC_L_P_008 Verify Manage Profile in My Profile Screen
    #When user taps on profile icon
    #And user taps on Manage Profile
    #Then user should able to see See Profiles
    #And user shouold able to see Family Detalis
    
    #	@TC_L_P_002 @Demo
#	Scenario: TC_L_P_002 Verify My Details in My Profile Screen
    #When user taps on profile icon
    #Then user should able to see My Profile Screen
#		When user taps on My Details 
#		Then user should able to see Details Screen
#		And user should able to Personal Details
#		And user should able to Contact Deatils
#		
#		And user should able to Salutation
#		And user should able to First Name
#		And user should able to Last Name
#		And user should able to Gender 
#		And user should able to Mobile Number
#		And user should able to Age 
#		And user should able to Date of Birth
#		And user should able to blood Group
#		And user should able to Email
      
      
    	
    
    