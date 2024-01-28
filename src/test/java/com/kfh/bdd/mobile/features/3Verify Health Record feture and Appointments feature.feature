@CureBay @Dashboard @Login_123 @13092023  @curebay12 @21092023
Feature: Verify Health Record feture and Appointments feature
#@App
  #Scenario: Opening Curebay mobile application
    #When user clicks on login and signup button
    #And user enters the username on the textbox fields
    #And user enters the password on the textbox fields
    #And user clicks the next button on mobile page
    #Then user able to see the Home page
    #When user taps on Health Record
    #Then user should able to Health Record screen
@Dash
  Scenario: TC_HAA_001 Verify Prescription in Health Record ---> bug ,file is not downloading
  When user taps on Health Record
    Then user should able to Health Record screen
    When user taps on patient name dropdown
    And user selects patient name from the dropdown list
    Then user should able to see the care plan Name
    And user should able to see "Prescription" in Health record
    And user should able to see symptoms in the prescription
    And user should able to see Doctor Name
    And user should able to see Any Allergy
    And user should able to see Consultation Date
    And user should able to see Next Consultation Date
    When user taps on View Prescription link
    Then user should able to see the prescription
    When user taps on Download prescription
    Then user should able to see downloaded prescription file
@Dash @Health
  Scenario: TC_HAA_002 Verify Lab Reports in Health Record --> bug, when i click on download, application getting closed
  When user taps on Health Record
    Then user should able to Health Record screen
    When user taps on patient name dropdown
    And user selects patient name from the dropdown list
    Then user should able to see patient name
    And user should able to see the care plan Name
    And user should able to see "Lab Reports"  Health record
    When user taps on Lab Reports
    Then user should able to see the reports
    And user should able to see Test Name in the Report
    And user should able to see Lab Name in the Report
    And user should able to see Date in the Report
    And user should able to see Order id in the Report
    When user taps on view Lab Report link
    Then user should able to see the Lab Report
    When user taps on Download Lab Report
    Then user should able to see downloaded Lab Report file
@Dash  @TC_HAA_003 @Health
  Scenario: TC_HAA_003 Verify Appointments feature
  
    When user taps on Appointments
    And user taps on patient name dropdown
    And user selects patient name from the dropdown list
    Then user should able to see patient name
    And user should able to see the care plan Name
    And user should able to see "My Appointments" in Appointments
    When user taps on Previous Appoinment
    Then user should able to see doctor name in appointments
    And user should able to see date
    And user should able to see Consultation Type
    When user taps on Upcoming Appointment
    Then user should able to see appointment if any available
