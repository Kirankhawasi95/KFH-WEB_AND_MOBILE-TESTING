@CureBay @CureBay1 @Login @Profile @curebay12 @21092023
Feature: Verify Schedule feature
  @Appnotresponding @TestingCB
  Scenario: TC_SD_001 Verify Schedule for a year is in Schedule screen
    When user taps on Schedule
    Then user should able to see "Schedule for a year" in Schedule screen
    When user taps on Schedule for a year dropdown
    #Then user should able to see month list from current year to next consecutive year
    When user taps on first month in the dropdown list
    Then user should able to see Service Period
    And user should able to see Frequency
    And user should able to see Service Description
    And user should able to see Service Mode
    And user should able to see Service Status
    When user taps on first month in the dropdown list
    And user scrolls to the last month
    And user taps on last month in the dropdown
    Then user should able to see Service Period
    And user should able to see Frequency
    And user should able to see Service Description
    And user should able to see Service Mode
    And user should able to see Service Status
    When user taps on last month in the dropdown
    And user taps on Schedule for a year dropdown
    Then user should able to see Schedule for a year closed

  @mobile
  Scenario: TC_SD_002 Verify Doctor Consultation is in Schedhule screen
    When user taps on Schedule
    Then user should able to see "Doctor Consultation" in Schedule screen
    When user taps on Doctor Consultation dropdown
    Then user should able to see Doctor name in the Consultation
    And user should able to see consultation time
    And user should able to see frequency
    And user should able to see status
    And user should able to see doctor qualification
    When user taps on Doctor Consultation dropdown
    Then user should able to see Doctor constulation drowpdown closed

  @mobile
  Scenario: TC_SD_003 Verify Nursing in Schedule ----> bug
    When user taps on Schedule
    Then user should able to see "Nursing" in Schedule screen
    When user taps on Nursing
    Then user should able nursing schedules
    And user should able to see Date
    And user should able to see Frequency
    And user should able to see Status

  @mobile
  Scenario: TC_SD_004 Verify Lab Test- Track Results is in Schedule screen --->bug reports are not downloading
    When user taps on Schedule
    Then user should able to see "Lab Test- Track Results" in Schedule screen
    When user taps on Lab Test Track Results dropdown
    Then user should able to see Test name in the Result
    And user should able to see Date
    And user should able to see Lab Name
    And user should able to see Order Id
    When user taps on View Lab Report
    Then user should able to see the Lab Report
    When user taps on download
    Then user should able to see downloaded report
