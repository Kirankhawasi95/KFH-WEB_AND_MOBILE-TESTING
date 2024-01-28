@CureBay @Medicare @Profile @curebay12  @19092023
Feature: Verify Profile functionality_2

  @ManageProfile  @19092023
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
    #And user selects <BloodGroup> from the Blood Group dropdown
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
    #And user enters State in State text box
    #Then user should able to see Nearby e-clinics
    When user taps on Save Member button
    Then user should able to see the error message

    Examples: 
      | TC_PR_ID  | pincode | Salutation | Gender | FirstName | LastName | DOB        | BloodGroup | Relation      | MobileNumber | EmergencyContactNumber | EmailId         | description                                                                                |
      | TC_PR_013 |  600019 | Mr         | Male   | Tester1   | test     | 12-08-1993 | o-         | Mother In law |   5555555555 |             6666666666 | aegon@gmail.com | by mismatching relation and Salutation                                                     |
      | TC_PR_014 |  600019 | Mrs        | Female |     12637 |    82390 | 12-08-1993 | o-         | Mother In law |   5555555555 |             6666666666 | aegon@gmail.com | by entering integers in first name and last name box                                       |
      | TC_PR_015 |  600019 | Mrs        | Female | 12uytu    | hjb6677  | 12-08-1993 | o-         | Mother In law |   5555555555 |             6666666666 | aegon@gmail.com | by entering alphanumeric in first name and last name box                                   |
      | TC_PR_016 |  600019 | Mrs        | Female | %$@&8     | &*@^&gdh | 12-08-1993 | o-         | Mother In law |   5555555555 |             6666666666 | aegon@gmail.com | by entering special char in first name and last name box                                   |
      | TC_PR_017 |  600019 | Mrs        | Female | ""        | ""       | 12-08-1993 | o-         | Mother In law |   5555555555 |             6666666666 | aegon@gmail.com | without entering text in first name and last name box                                      |
      | TC_PR_018 |  600019 | Mrs        | Female | Tester1   | test     | ""         | o-         | Mother In law |   5555555555 |             6666666666 | aegon@gmail.com | without selecting DOB                                                                      |
      | TC_PR_019 |  600019 | Mrs        | Female | Tester1   | test     | 12-08-2023 | o-         | Mother In law |   5555555555 |             6666666666 | aegon@gmail.com | by selecting current year date                                                             |
      | TC_PR_020 |  600019 | Mrs        | Female | Tester1   | test     | 12-08-1993 | ""         | Mother In law |   5555555555 |             6666666666 | aegon@gmail.com | without selecting blood group                                                              |
      | TC_PR_021 |  600019 | Mrs        | Female | Tester1   | test     | 12-08-1993 | o-         | ""            |   5555555555 |             6666666666 | aegon@gmail.com | without selecting relation                                                                 |
      | TC_PR_022 |  600019 | Mrs        | Female | Tester1   | test     | 12-08-1993 | o-         | Mother In law |     55555555 |                6666666 | aegon@gmail.com | by entering less than 10 char number in mobile number box and emergency contact number box |
      | TC_PR_023 |  600019 | Mrs        | Female | Tester1   | test     | 12-08-1993 | o-         | Mother In law |   5555555555 |             6666666666 | aegon           | by entering text without @ in email box                                                    |
      | TC_PR_024 |  600019 | Mrs        | Female | Tester1   | test     | 12-08-1993 | o-         | Mother        |   5555555555 |             6666666666 | aegon@gmail.com | by selecting mother from relation drpdwn even after having mother profile                  |
      | TC_PR_025 |  600019 | Mr         | Male   | Tester1   | test     | 12-08-1993 | o-         | Father        |   5555555555 |             6666666666 | aegon@gmail.com | by selecting father from relation drpdwn even after having father profile                  |
      | TC_PR_026 |  600019 | Mr         | Male   | Tester1   | test     | 12-08-1993 | o-         | Father In law |   7777777777 |             6666666666 | aegon@gmail.com | by entering same child mobile number in parent mobile number box                           |
      | TC_PR_027 |  600019 | Mr         | Male   | Tester1   | test     | 12-08-1993 | o-         | Other         |   5555555555 |             6666666666 | aegon@gmail.com | by entering same parent mobile number in other relation mobile number box                  |
      | TC_PR_028 |  600019 | Mr         | Male   | Tester1   | test     | 12-08-1993 | o-         | Other         |    999999999 |             9999999999 | aegon@gmail.com | by entering the same number in the mobile number and emergency contact number              |

  @ManageProfile1 @19092023
  Scenario Outline: <TC_PR_ID> Verify Manage Profile in Profile <description>
    When user taps on profile icon
    Then user should able to see the "My Profile" Screen
    When user taps on Manage Profile
    Then user should able to see 'See Profiles'
    When user taps on Add Member
    Then user should able to see "Check eClinc" "near to your parent's location"
    And user should able to see Add Member Details
    #When user enters valid pincode
    #And user taps on the check button
    #Then user should able to see the eClinic image
    #And user should able to see the eClinic location
    #And user should able to see Zipcode
    #And user should able to see Eclinic Name
    When user selects <Salutation> from the Salutation dropdown
    #Then user should able to see relevant gender is updated in the gender box
    When user enters the first name
    And user enters the last name
    #And user taps on the calendar icon
    #And user selects the relevant DOB
    #And user selects Blood Group from the Blood Group dropdown
    And user selects <Relation> from the Relation dropdown
    And user selects Country from the country code dropdown
    And user enters a valid <MobileNumber> in the Mobile Number text box
    And user enters a valid <EmergencyNumber> in the Emergency Contact Number
    And user enters a valid <EmailId> in Email text box
    And user enters Address in Address text box
    And user enters Locality in Locality/Town text box

    #And user enters a valid pincode in pincode text box
    #And user enters the city in city text box
    #And user enters State in the State text box
    #Then user should able to see Nearby e-clinics
    #When user taps on the Save Member button
    #Then user should able to see created member profile in the See Profiles screen
    Examples: 
      | TC_PR_ID  | MobileNumber | Relation      | EmergencyNumber | Email             | description                                            | Salutation |
      | TC_PR_029 |   9999999999 | Mother In law |      8888888888 | danerys@gmail.com | by entering fathers mobile number in mobile number box | Mrs        |
      | TC_PR_030 |   7575785858 | Mother In law |      5778585599 | aegon@gmail.com   | by entering fathers email id in Email box              | Mrs        |

  #@ChangePassword  ----changed along with scenario outline
  #Scenario: TC_PR_031 Verify Change Password functionality Positive flow
  #When user taps on profile icon
  #And user taps on change password
  #Then user should able to see the change password screen
  #When user enters the valid old password in the old password box
  #And user enters the valid new password in the new password box
  #Then user should able to see all password criteria checkboxes checked
  #When user enters some valid new password in confirm new password box
  #And user taps on the save button
  #Then user should able to a popup with a message as the password changed successfully
  @ChangePassword 
  Scenario Outline: <TC_PR_ID> Verify Change Password functionality <Description>
    When user taps on profile icon
    And user taps on change password
    Then user should able to see the change password screen
    When user enters <oldpassword> in the old password box
    And user enters <newpassword_1> in the text box
    #Then user should able to see password criteria <checkbox> checked
    When user enters <newpassword_2> in confirm new password box
    And user taps on the save button
    Then user should able to error message

    Examples: 
      | TC_PR_ID  | oldpassword  | newpassword_1 | checkbox                                     | newpassword_2 | Description                                                                           |
      | TC_PR_031 | Check@1234   | Check@1234    | alpha capital and number check boxes         | Check@1234    | by entering valid password                                                            |
      | TC_PR_032 | invalid      | ujhkj         | ""                                           | sjkwewl       | by entering invalid old password                                                      |
      | TC_PR_033 | Newuser@1234 |         12537 | number check box                             |         15377 | by entering integers in new passowrd box                                              |
      | TC_PR_034 | Newuser@1234 | akdkl         | alpha check box                              | akdkl         | by entering aplha text in new passowrd box                                            |
      | TC_PR_035 | Newuser@1234 | akdkl263      | alpha and number check boxes                 | akdkl263      | by entering aplhanumeric text in new passowrd box                                     |
      | TC_PR_036 | Newuser@1234 | Ayeu123       | alpha capital and number check boxes         | Ayeu123       | by entering text new password box having alphanumeric and capital letter              |
      | TC_PR_037 | Newuser@1234 | Au123@        | alpha capital special and number check boxes | Ae123@        | by entering text new password box having alphanumeric special char and capital letter |
      | TC_PR_038 | Newuser@1234 | Auwe@123      | all checkboxes                               | Au56@123      | by entering unmatched text with new password in confirm password box                  |
      | TC_PR_039 | ""           | ""            | ""                                           | ""            | by leaving all boxes                                                                  |
