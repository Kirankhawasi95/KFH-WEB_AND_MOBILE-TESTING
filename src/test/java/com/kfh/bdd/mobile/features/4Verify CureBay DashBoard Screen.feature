@CureBay @Dashboard1 @Curebay @Login_123 @13092023 @curebay12 @21092023
Feature: Verify CureBay DashBoard Screen

  #@Dashboard @screen
  #Scenario: Opening Curebay mobile application
  #When user clicks on login and signup button
  #And user enters the username on the textbox fields
  #And user enters the password on the textbox fields
  #And user clicks the next button on mobile page
  #Then user able to see the Home page
  #
  @CureBay
  Scenario: TC_DB_001 Verify vitals in Dashbaord Screen
    #Given user sees the "Select a member to see their health status:" headline
    When user taps on member profile drop down
    And user selects relevent profile
    Then user should see selected member profile name in dropdown
    And user should see current package plan name of that profile
    #  And user should able to see appointments
    When user selects date from the calender
    #  Then user should able to see appointments are available at particular date
    When user taps on vital dropdown
    And user selects temperature
    Then user should able to see data relevant to temperature
    When user taps on vital dropdown
    And user selects HeartRate
    Then user should able to see data relevant to HeartRate
    When user taps on vital dropdown
    And user selects SPo2
    Then user should able to see data relevant to SPo2

  @TC_DB_002
  Scenario: TC_DB_002 Verify My Medical Plans in Dashboard Screen
    When user swipes the screen to My Medical Plans
    And user taps on My Medical plans
    Then user should able to see General Health Care
    And user should able to see validity of plan for General Health Care
    When user taps on view details related for General Health Care
    Then user should able to see "My Plans" screen
    When user taps on patient name dropdown
    And user selects patient name from the dropdown list
    #Then user should able to see choose the care plans
    Then user should able to see Validity Left days and Renewal Date
    #And user should able to see Validity Left
    #And user should able to see Renewal Date
    And user should able to see Plan Details
    When user taps on Detailed baseline evaluation & symptomatic care - Nurse
    Then user should able to see a short note on baseline evaluation & symptomatic care - Nurse
    When user taps on Detailed baseline evaluation & symptomatic care - Nurse
    And user taps on Detailed baseline evaluation & symptomatic care - Lab test
    Then user should able to see a short note on Detailed baseline evaluation & symptomatic care - Lab test
    When user taps on Detailed baseline evaluation & symptomatic care - Lab test
    And user taps on Complete health review & care by Orthopedician
    Then user should able to see a short note on Complete health review & care by Orthopedician
    When user taps on Complete health review & care by Orthopedician
    And user taps on Specialty care and referral
    Then user should able to see a short note on Specialty care and referral
    When user taps on Specialty care and referral
    And user taps on Periodic online follow-ups and care
    Then user should able to see a short note on Periodic online follow-ups and care
    When user taps on Periodic online follow-ups and care
    And user taps on Physiotherapy
    Then user should able to see a short note on Physiotherapy
    When user taps on Physiotherapy
    And user taps on Paramedical care - Nutritionist
    Then user should able to see a short note on Paramedical care - Nutritionist
    When user taps on Paramedical care - Nutritionist
    And user taps on Paramedical care - Health Educator
    Then user should able to see a short note on Paramedical care - Health Educator
    When user taps on Paramedical care - Health Educator
    And user taps on Paramedical care - In-Person Nurse visit
    Then user should able to see a short note on Paramedical care - In-Person Nurse visit
    When user taps on Paramedical care - In-Person Nurse visit
    And user taps on Comprehensive quarterly care by the physician
    Then user should able to see a short note on Comprehensive quarterly care by the physician
    When user taps on Comprehensive quarterly care by the physician
    And user taps on 6 monthly lab tests
    Then user should able to see a short note on 6 monthly lab tests
    When user taps on 6 monthly lab tests
    And user taps on In-Person Nurse visit
    Then user should able to see a short note on In-Person Nurse visit
    When user taps on In-Person Nurse visit
    And user taps on Annual outcome - lab tests
    Then user should able to see a short note on Annual outcome - lab tests
    When user taps on Annual outcome - lab tests
    And user taps on Annual outcome - In-Person Nurse visit
    Then user should able to see a short note on Annual outcome - In-Person Nurse visit
    When user taps on Annual outcome - In-Person Nurse visit
    And user taps on Annual outcome - General Physician
    Then user should able to see a short note on Annual outcome - General Physician

  #When user taps on Pre-screening and selection of right care package
  #Then user should able to see a short note on Pre-screening and selection of right care package
  #When user taps on Pre-screening and selection of right care package
  #And user taps on Details baseline evalution & care - Nurse
  #Then user should able to see a short note on Details baseline evalution & care - Nurse
  #When user taps on Details baseline evalution & care - Nurse
  #And user taps on Details baseline evalution & care - Lab test
  #Then user should able to see a short note on Details baseline evalution & care - Lab test
  #When user taps on Details baseline evalution & care - Lab test
  #And user taps on Complete health review & care by physician
  #Then user should able to see a short note on Complete health review & care by physician
  #When user taps on Complete health review & care by physician
  #And user taps on Speciality care and referral
  #Then user should able to see a short note on Speciality care and referral
  #When user taps on Speciality care and referral
  #And user swipes the screen to periodic calls for health assessment
  #And user taps on Periodic calls for health assessment
  #Then user should able to see a short note on Periodic calls for health assessment
  #When user taps on Periodic calls for health assessment
  #And user swipes the screen to Paramedical care
  #And user taps on Paramedical care
  #Then user should able to see a short note on Paramedical care
  #When user taps on Paramedical care
  #And user swipes the screen to Full health check-up assesment
  #And user taps on Full health check-up assesment
  #Then user should able to see a short note on Full health check-up assesment
  #When user taps on Full health check-up assesment
  #And user swipes the screen to 6 monthly lab tests
  #And user taps on 6 monthly lab tests
  #Then user should able to see a 6 monthly lab tests
  #When user taps on 6 monthly lab tests
  #And user swipes the screen to Detailed final check-up & care
  #And user taps on Detailed final check-up & care
  #Then user should able to see a short note on Detailed final check-up & care
  #When user taps on Detailed final check-up & care
  #And user taps on Periodic calls for Detailed final check-up & care
  #And user swipes the screen to Annual outcome
  #And user taps on Annual outcomee
  #Then user should able to see a short note on Annual outcome
  @Dashboard @screen_cart1 @profileNamelist1 @06092023
  Scenario Outline: <TC_DB_ID> Verify Cart icon in dashboard screen by select payment option <option>
    When user taps on cart icon
    #Then user should able to see Choose health care plan for your family member
    #And user should able to see "General Health Care" with plan cost
    #And user should able to see "Diabetes Care" with plan cost
    #And user should able to see "Cardiac Care" with plan cost
    #And user should able to see "Ortho Care" with plan cost
    #And user should able to see "Womens Health Care" with plan cost
    #When user selects one plan from the list
    #And user taps on Next button in cart
    Then user should able to see YourCart screen
    When user taps on member profile dropdown
    #And user selects one profile from the list
    And user selects one Profile from the lists
    #Then user should able to see price per month
    When user select payment option <option>
    #Then user should able to see Effective Start Date
    #And user should able to see Payment Details
    #And user should able to see selected plan
    #And user should able to see selected plan price
    #And user should able to see total price
    When user taps on Checkout
    Then user should able to see your order screen
    #And user should able to see selected plan in Your order screen
    When user taps on Proceed To Checkout in cart
    Then user should able to see Add your billing address screen
    When user enters the valid text in first name text box
    And user enters the valid text in last name text box
    And user enters the valid address in Address Line one box
    #And user selects the valid location from the suggestions
    And user enters the valid address in Address Line two box
    Then user should able to see City name in City text box
    And user should able to see Zipcode in Zipcode text box
    And user should able to see State in State text box

    #And user should able to see Country in Country box
    #When user taps on Next button in carts
    #And user should able to see Add your payment details screen
    #And user enters valid card number
    #And user enters the expiry date
    #When user taps on next in cart
    #Then user should able to see Complete your order screen
    #And user should able to see selected plan in complete your order screen
    #And user should able to see cost of plan
    #And user should able to see Account
    #And user should able to see Billing
    #And user should able to see Payment
    #And user taps on pay & subscribe
    #Then user should able to see a message Subscription complete
    #And user should able to see Thank you for purchasing
    #When user taps on Go to Home button
    #Then user should able to see Dashboard screen
    Examples: 
      | TC_DB_ID  | option   |
      | TC_DB_003 | Monthly  |
      | TC_DB_004 | One Time |

  @Curebay @screen123 @TC_DB_005_008 @06092023
  Scenario Outline: <TC_DB_ID> Verify Add your billing address screen with <type>
    When user taps on cart icon
    #Then user should able to see "Choose health care plan for your family member"
    #And user should able to see "General Health Care" with plan cost
    #And user should able to see "Diabetes Care" with plan cost
    #And user should able to see "Cardic Care" with plan cost
    #And user should able to see "Ortho Care" with plan cost
    #And user should able to see "Women's Health" with plan cost
    #When user selects one plan from the list
    #And user taps on Next button
    #Then user should able to see "YourCart" screen
    Then user should able to see YourCart screen
    When user taps on member profile dropdown
    And user selects one profile from the list
    #Then user should able to see price per month
    #When user select payment options
    #Then user should able to see Effective Start Date
    #And user should able to see Payment Details
    #And user should able to see selected plan
    #And user should able to see selected plan price
    #And user should able to see total price
    When user taps on Checkout
    Then user should able to see your order screen
    #And user should able to see selected plan in your Order screen
    When user taps on Proceed To Checkout in cart
    Then user should able to see "Add your billing address" screen
    When user taps on Next button
    Then user should able to see a popup mesaage There were errors while submitting the form
    When user enters <firstName> in First name box
    And user enters <lastName> in Last name box
    And user enters <AddressLine1> in Address Line1 box
    And user enters <AddressLine2> in Address Line2 box
    And user enters <City> in city box
    And user enters <Zip> in Zip box

    #And user enters <State> in State box
    #And user pick a <country> in country box
    #Then user should able to see a error message
    Examples: 
      | TC_DB_ID  | firstName | lastName | AddressLine1 | AddressLine2 | City    | Zip      | State     | country  | type             |
      | TC_DB_005 | kskjdfj   | lkkdkl   | jdsfk        | dlkfl        | kdknk   | sjdhfkj  | dkjf      | India    | Invalid String   |
      | TC_DB_006 |     -1238 |   -28839 |         -284 |        -3803 |    -399 | -7387938 | -83849238 | US       | Negative Integer |
      | TC_DB_007 |      1563 |   902090 |      8320809 |          847 | 8932498 |    32899 |     99849 | UK       | Integer          |
      | TC_DB_008 | 3HS$%%^   | !$@%     | 35**&        | 39SHJ$%      | 394@$!  | 38jB@    | $ad&^87   | Anguilla | special char     |

  @cart @Dashboard_lab_reports @060920231
  Scenario: TC_DB_009 Verify Lab Reports in Dashboard
    When user swipes to "Lab Reports" dropdown
    And user taps on Lab Reports dropdown
    Then user should able to see lab reports
    And user should able to see Test Name in reports
    And user should able to see laboratory name
    And user should able to see View All Lab Reports button
    #When user tapped on View All Lab Reports in dashboard
    #Then user should able to see the reports
    #And user should able to see Test Name in the Report
    #And user should able to see Lab Name in the Report
    #And user should able to see Date in the Report
    #And user should able to see Order id in the Report
    When user taps on view Lab Report link
    Then user should able to see the Lab Report
    When user taps on Download Lab Report
    Then user should able to see downloaded Lab Report file

  @Dash1 @Dashboard_doctor_consultation @060920231
  Scenario: TC_DB_010 Verify Doctors Consultation --> bug
    When user swipes to "Doctors Consultation" dropdown
    And user taps on Doctors Consultation dropdown
    Then user should able to see "Upcoming"
    And user should able to see "Past"
    # And user should able to see consultations if available
    When user taps on Past
    #Then user should able to see consultations if available
    And user should able to see View All
    When user taps on View All
    Then user should able to see "My Appointments" screen

  @CureBay @Dashboard_notification @060920231
  Scenario: TC_DB_011 Verify Notifications and Share a reviews features
    #When user taps on notification icon
    #Then user should able to see notifications if available
    #When user taps on navigates back icon
    When user swipes the screen to My medical Plans
    And user taps on My Medical plans
    #When user taps on Start Now
    #Then user should able to see "Review" screen
