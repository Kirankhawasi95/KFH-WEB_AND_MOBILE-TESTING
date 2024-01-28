@CureBay @Login_123 @curebay1 @curebay12 @21092023
Feature: Verify Profile functionality_2

  @TC_PR_010_12 @CureBay
  Scenario Outline: <TC_PR_ID> Verify Manage Profile in Profile <description>
    When user taps on profile icon
    Then user should able to see "My Profile" Screen
    When user taps on Manage Profile
    Then user should able to see 'See Profiles' in profile
    When user taps on Add Member
    Then user should able to see Check medicare services near to your parents area in profile
    And user should able to see Add Member Details
    When user enters <pincode> in profile page
    And user taps on check button
    Then user should able to see the error message

    Examples: 
      | TC_PR_ID  | pincode | description                                               |
      | TC_PR_010 |  517502 | with valid pincode but not having eclinic at that pincode |
      | TC_PR_011 |   27828 | with invalid pincode                                      |
      | TC_PR_012 | ""      | without entering pincode                                  |

  @scene2 @Add_Member @TC_PR_014_TC_PR_029 @curebay12 @05092023 @TC_PR_014_TC_PR_029_1 @19092023
  Scenario Outline: <TC_PR_ID> Verify Manage Profile in Profile <description>
    When user taps on profile icon
    Then user should able to see "My Profile" Screen
    When user taps on Manage Profile
    Then user should able to see 'See Profiles' in profile
    When user taps on Add Member
    #Then user should able to see "Check medicare" "services near to your parents area."
    Then user should able to see Check Medicare services near to your parents area
    And user should able to see Add Member Details
    #When user enters valid pincode in pincode text box
    #And user taps on check button
    #Then user should able to see the eClinic image
    #And user should able to see the eClinic location
    #And user should able to see Zipcode
    #And user should able to see Eclinic Name
    When user selects <Salutation> from the Salutation dropdown
    When user enters the <FirstName> in first name box
    And user enters the <LastName> in last name box
    #And user taps on the calendar icon
    #And user selects <DOB> 
    And user selects <BloodGroup> from the Blood Group dropdown
    And user selects <Relation> from the Relation dropdown
    #Then user should able to see <Gender> is updated in the gender box
    #And user selects Country from the country code dropdown
    And user enters a valid <MobileNumber> in the Mobile Number text box
    And user enters a valid <EmergencyNumber> in the Emergency Contact Number
    And user enters a valid <EmailId> in Email text box
    And user enters Address in Address text box
    And user enters Locality in Locality/Town text box
    And user enters valid pincode in pincode text box
    And user enters city in city text box
    #And user selects State from State dropdown
    #Then user should able to see Nearby e-clinics
    When user taps on Save Member button
    Then user should able to see the error message

    Examples: 
      | TC_PR_ID  | pincode | Salutation | Gender | FirstName | LastName | DOB        | BloodGroup | Relation      | MobileNumber | EmergencyNumber | EmailId         | description                                                                                |
      | TC_PR_014 |  600019 | Mr         | Male   | Tester1   | test     | 12-08-1993 | o-         | Mother In law |   5555555555 |      6666666666 | aegon@gmail.com | by mismatching relation and Salutation                                                     |
      | TC_PR_015 |  600019 | Mrs        | Female |     12637 |    82390 | 12-08-1993 | o-         | Mother In law |   5555555555 |      6666666666 | aegon@gmail.com | by entering integers in first name and last name box                                       |
      | TC_PR_016 |  600019 | Mrs        | Female | 12uytu    | hjb6677  | 12-08-1993 | o-         | Mother In law |   5555555555 |      6666666666 | aegon@gmail.com | by entering alphanumeric in first name and last name box                                   |
      | TC_PR_017 |  600019 | Mrs        | Female | %$@&8     | &*@^&gdh | 12-08-1993 | o-         | Mother In law |   5555555555 |      6666666666 | aegon@gmail.com | by entering special char in first name and last name box                                   |
      | TC_PR_018 |  600019 | Mrs        | Female | ""        | ""       | 12-08-1993 | o-         | Mother In law |   5555555555 |      6666666666 | aegon@gmail.com | without entering text in first name and last name box                                      |
      | TC_PR_019 |  600019 | Mrs        | Female | Tester1   | test     | ""         | o-         | Mother In law |   5555555555 |      6666666666 | aegon@gmail.com | without selecting DOB                                                                      |
      | TC_PR_020 |  600019 | Mrs        | Female | Tester1   | test     | 12-08-2023 | o-         | Mother In law |   5555555555 |      6666666666 | aegon@gmail.com | by selecting current year date                                                             |
      | TC_PR_021 |  600019 | Mrs        | Female | Tester1   | test     | 12-08-1993 | ""         | Mother In law |   5555555555 |      6666666666 | aegon@gmail.com | without selecting blood group                                                              |
      | TC_PR_022 |  600019 | Mrs        | Female | Tester1   | test     | 12-08-1993 | o-         | ""            |   5555555555 |      6666666666 | aegon@gmail.com | without selecting relation                                                                 |
      | TC_PR_023 |  600019 | Mrs        | Female | Tester1   | test     | 12-08-1993 | o-         | Mother In law |     55555555 |         6666666 | aegon@gmail.com | by entering less than 10 char number in mobile number box and emergency contact number box |
      | TC_PR_024 |  600019 | Mrs        | Female | Tester1   | test     | 12-08-1993 | o-         | Mother In law |   5555555555 |      6666666666 | aegon           | by entering text without @ in email box                                                    |
      | TC_PR_025 |  600019 | Mrs        | Female | Tester1   | test     | 12-08-1993 | o-         | Mother        |   5555555555 |      6666666666 | aegon@gmail.com | by selecting mother from relation drpdwn even after having mother profile                  |
      | TC_PR_026 |  600019 | Mr         | Male   | Tester1   | test     | 12-08-1993 | o-         | Mother In law       |   5555555555 |      6666666666 | aegon@gmail.com | by selecting father from relation drpdwn even after having father profile                  |
      | TC_PR_027 |  600019 | Mr         | Male   | Tester1   | test     | 12-08-1993 | o-         | Mother In law |   7777777777 |      6666666666 | aegon@gmail.com | by entering same child mobile number in parent mobile number box                           |
      | TC_PR_028 |  600019 | Mr         | Male   | Tester1   | test     | 12-08-1993 | o-         | Other         |   5555555555 |      6666666666 | aegon@gmail.com | by entering same parent mobile number in other relation mobile number box                  |
      | TC_PR_029 |  600019 | Mr         | Male   | Tester1   | test     | 12-08-1993 | o-         | Other         |    999999999 |      9999999999 | aegon@gmail.com | by entering same number in mobile number and in emergency contact number                   |

  @profile1 @curebay12 @050920231 @19092023
  Scenario Outline: <TC_PR_ID> Verify Manage Profile in Profile <description>
    When user taps on profile icon
    Then user should able to see "My Profile" Screen
    When user taps on Manage Profile
    Then user should able to see 'See Profiles'
    When user taps on Add Member
    Then user should able to see Check medicare services near to your parents area in profile
    And user should able to see Add Member Details
    When user enters valid pincode in pincode text box
    And user taps on check button
    #Then user should able to see the eClinic image
    #And user should able to see the eClinic location
    #And user should able to see Zipcode
    #And user should able to see Eclinic Name
    #When user selects Salutation from the Saluation dropdown
    #Then user should able to see relevant gender is updated in the gender box
    #When user enters the first name
    #And user enters the last name
    And user enters first name and last name
    And user taps on the calendar icon
    And user selects relavent DOB
    And user selects Blood Group from Blood Group dropdown
    #And user selects Mother Relation from Relation dropdown
    #And user selects Country from the country code dropdown
    And user enters a valid <MobileNumber> in the Mobile Number text box
    And user enters a valid <EmergencyNumber> in the Emergency Contact Number
    And user enters a valid <EmailId> in Email text box
    And user enters Address in Address text box
    And user enters Locality in Locality/Town text box
    #And user enters valid pincode in pincode text box
    And user enters city in city text box
    And user selects State from State dropdown
    #And user enters State in State text box
    #Then user should able to see Nearby e-clinics
    #When user taps on Save Member button
    #Then user should able to see created member profile in See Profiles screen

    Examples: 
      | TC_PR_ID  | MobileNumber | EmergencyNumber | EmailId             | description                                            |
      | TC_PR_030 |   9999999999 |      8888888888 | danerys@gmail.com | by entering fathers mobile number in mobile number box |
      | TC_PR_031 |   7575785858 |      5778585599 | aegon@gmail.com   | by entering fathers email id in Email box              |
