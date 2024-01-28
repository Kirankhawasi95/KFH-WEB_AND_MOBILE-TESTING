@CureBay @PostLogin @CBTesting @CBTest1 @CB06092023 
Feature: Validating CureBay Other Post Login features

  #Background: Opening Curebay mobile application
  #When user taps on curebay application
  #Then user should able to see care plans screens
  #When user logged valid credentials
  #Then user should able to see dashboard Screen
  @TC_POL_001
  Scenario: TC_POL_001 Verify Curebay experience feature with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on curebay experience menu item
    Then user should able to see Welcome to our eClinic Screen
    And user should able to see general health in curebay experience screen
    When user taps on general health
    Then user should able to see key features

  @TC_POL_002 @23082023 @CBDEMO
  Scenario: TC_POL_002 Verify adding key features to cart with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on curebay experience menu item
    Then user should able to see Welcome to our eClinic Screen
    And user should able to see general health in curebay experience screen
    When user taps on general health
    And user taps on add to cart
    Then user should able to see plan added in the cart

  @TC_POL_003
  Scenario: TC_POL_003 Verify Next Generation Solutions is visible at bottom of screen with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on curebay experience menu item
    Then user should able to see Welcome to our eClinic Screen
    When user swipes to bottom of screen
    Then user should able to see next generation solutions
    And user should able to see patient empowerment
    And user should able to see preventive care
    And user should able to see one stop shop
    And user should able to see mutilateral team
    And user should able to see 24 by 7 connected care
    And user should able to see tech smart solutions
    When user taps on patient empowerment
    Then user should able to see information about patient empowerment
    When user taps on preventive care
    Then user should able to see information about preventive care
    When user taps on one stop shop
    Then user should able to see information about one stop shop
    When user taps on mutilateral team
    Then user should able to see information about mutilateral team
    When user taps on 24 by 7 connected care
    Then user should able to see information about 24 by 7 connected care
    When user taps on tech smart solutions
    Then user should able to see information about tech smart solutions

  @TC_POL_004
  Scenario: TC_POL_004 Verify One Stop Health Solutions is visible with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on curebay experience menu item
    Then user should able to see Welcome to our eClinic Screen
    When user swipes to bottom of screen
    Then user should able to see One Stop health solutions!
    And user should able to see eClinic with short Note
    And user should able to see Technology platform with short Note
    And user should able to see Consumer application with short Note
    And user should able to see Health tech devices with short Note
    And user should able to see Situation room with short Note
    And user should able to see Network providers with short Note
    When user navigates back
    Then user should able to see dashboard Screen

  #And user should able to see Holistic care plans with short Note
  #And user should able to see Round the clock access with short Note
  #And user should able to see Achieve health goals with short Note
  #And user should able to see always stay updated with short Note
  #And user should able to see advanced technology with a short note
  #When user navigates back
  #Then user should able to see dashboard Screen
  #Then user should able to care plans screen
  @TC_POL_005_0014_Outline @11082023
  Scenario Outline: <TC_POL_ID> Verify Add <CarePlan> plan to cart in care plans at <PayType> feature with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on Care plans menu item
    Then user should able to see Care Plans screen
    And user should able see General Health with related information
    And user should able to see Cardiac Care with related information
    And user should able to see Diabetes Care with related information
    And user should able to see Ortho Care with related information
    And user should able to see Womens' Health with related information
    When user taps on <CarePlan>
    Then user should able to see Annual health plan screen
    And user should able to see <CarePlan> in Annual health plan screen
    When user taps on add to cart at <PayType> box in Annual health plan screen
    Then user should able to see plan added in the cart

    Examples: 
      | TC_POL_ID  | CarePlan          | PayType       |
      | TC_POL_005 | "General Health"  | "Pay Monthly" |
      | TC_POL_006 | "General Health"  | "Pay in Full" |
      | TC_POL_007 | "Cardiac Care"    | "Pay Monthly" |
      | TC_POL_008 | "Cardiac Care"    | "Pay in Full" |
      | TC_POL_009 | "Diabetes Care"   | "Pay Monthly" |
      | TC_POL_010 | "Diabetes Care"   | "Pay in Full" |
      | TC_POL_011 | "Ortho Care"      | "Pay Monthly" |
      | TC_POL_012 | "Ortho Care"      | "Pay in Full" |
      | TC_POL_013 | "Womens' Health " | "Pay Monthly" |
      | TC_POL_014 | "Womens' Health " | "Pay in Full" |

  @TC_POL_015
  Scenario: TC_POL_015 Verify General Health Care Frequency feature with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on Care plans menu item
    Then user should able to see Care Plans screen
    And user should able see General Health with related information
    When user taps on General Health
    Then user should able to see Annual health plan screen
    And user should able to see General Health Care Frequency
    When user swipes up till Yearly General Health Care Frequency
    And user taps on Yearly General Health Care Frequency
    Then user should able to see "Detailed baseline evaluation & care - Nurse" with short note
    And user should able to see "Detailed baseline evaluation & care - Lab test" with short note
    And user should able to see "Annual outcome - Lab test" with short note
    And user should able to see "Annual outcome - In-Person Nurse visit" with short note
    And user should able to see "Annual outcome - General Physician" with short note
    When user swipes up till Half Yearly General Health Care Frequency
    And user taps on Half Yearly General Health Care Frequency
    Then user should able to see "6 monthly lab tests" with short note
    And user should able to see "In-Person Nurse visit" with short note
    When user taps on Half Yearly General Health Care Frequency
    And user swipes up till Quarterly General Health Care Frequency
    And user taps on Quarterly General Health Care Frequency
    Then user should able to see "Specialty care and referral" with short note
    And user should able to see "Paramedical care - Nutritionist" with short note
    And user should able to see "Paramedical care - Physiotherapist" with short note
    And user should able to see "Comprehensive quarterly care by the physician" with short note
    When user swipes up till Monthly General Health Care Frequency
    And user taps on Monthly General Health Care Frequency
    Then user should able to see "Periodic online follow-ups and care" with short note
    And user should able to see "Paramedical care - Health Educator" with short note
    When user taps on Monthly General Health Care Frequency
    When user swipes up till On Demand General Health Care Frequency
    And user taps on On Demand General Health Care Frequency
    Then user should able to see "Special services that we offer on demand" with short note

  @TC_POL_016
  Scenario: TC_POL_016 Verify Diabetes Care Frequency feature with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on Care plans menu item
    Then user should able to see Care Plans screen
    And user should able to see Diabetes Care with related information
    When user taps on "Diabetes Care"
    Then user should able to see Annual health plan screen
    And user should able to see "Diabetes Care Frequency"
    When user swipes up till Yearly Diabetes Care Frequency
    And user taps on Yearly Diabetes Care Frequency
    And user should able to see "Baseline comprehensive diabetes assessment & care - Nurse" with short note
    And user should able to see "Baseline comprehensive diabetes assessment & care - Lab test" with short note
    And user should able to see "Baseline speciality assessment and care by diabetologist" with short note
    And user should able to see "Specialty care and referral" with short note
    And user should able to see "Annual outcome - Lab test" with short note
    And user should able to see "Annual outcome - In-Person Nurse visit" with short note
    And user should able to see "Annual outcome - General Physician" with short note
    When user swipes up till Half Yearly Diabetes Care Frequency
    And user taps on Half Yearly Diabetes Care Frequency
    Then user should able to see "6 monthly lab tests" with short note
    And user should able to see "In-Person Nurse visit" with short note
    When user taps on Half Yearly Diabetes Care Frequency
    And user swipes up till Quarterly Diabetes Care Frequency
    And user taps on Quarterly Diabetes Care Frequency
    Then user should able to see "Other check-ups - Physiotherapist" with short note
    And user should able to see "Other check-ups - Nutritionist" with short note
    And user should able to see "Comprehensive quarterly care by the physician" with short note
    When user swipes up till Monthly Diabetes Care Frequency
    And user taps on Monthly Diabetes Care Frequency
    Then user should able to see "Other check-ups - Health Educator" with short note
    And user should able to see "Periodic online follow-ups and care" with short note
    When user swipes up till On Demand Diabetes Care Frequency
    And user taps on On Demand Diabetes Care Frequency
    Then user should able to see "Special services that we offer on demand" with short note

  @TC_POL_017
  Scenario: TC_POL_017 Verify Cardiac Care Frequency feature with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on Care plans menu item
    Then user should able to see Care Plans screen
    And user should able to see Cardiac Care with related information
    When user taps on "Cardiac Care"
    Then user should able to see Annual health plan screen
    And user should able to see "Cardiac Care Frequency"
    And user swipes up till Yearly Cardiac Care Frequency
    And user taps on Yearly Cardiac Care Frequency
    Then user should able to see "Baseline comprehensive cardiac health assessment & care - Nurse" with short note
    And user should able to see "Baseline comprehensive cardiac health assessment & care - Lab test" with short note
    And user should able to see "Baseline assessment of cardiac health and care by a cardiologist" with short note
    And user should able to see "Annual outcome - Lab test" with short note
    And user should able to see "Annual outcome - In-Person Nurse visit" with short note
    And user should able to see "Annual outcome - General Physician" with short note
    When user swipes up till Half Yearly Cardiac Care Frequency
    And user taps on Half Yearly Cardiac Care Frequency
    Then user should able to see "6 monthly lab tests" with short note
    And user should able to see "In-Person Nurse visit" with short note
    When user swipes up till Quarterly Cardiac Care Frequency
    And user taps on Quarterly Cardiac Care Frequency
    Then user should able to see "Paramedical care - Nutritionist" with short note
    And user should able to see "Paramedical care - Physiotherapist" with short note
    And user should able to see "Comprehensive quarterly care by the physician" with short note
    When user swipes up till Monthly Cardiac Care Frequency
    And user taps on Monthly Cardiac Care Frequency
    Then user should able to see "Paramedical care - Health Educator" with short note
    And user should able to see "Periodic online follow-ups and care" with short note
    And user should able to see "Specialty care and referral" with short note
    When user swipes up till On Demand Diabetes Care Frequency
    And user taps on On Demand Cardiac Care Frequency
    Then user should able to see "Special services that we offer on demand" with short note

  @TC_POL_018
  Scenario: TC_POL_018 Verify Ortho Care Frequency feature with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on Care plans menu item
    Then user should able to see Care Plans screen
    And user should able to see Ortho Care with related information
    When user taps on "Ortho Care"
    Then user should able to see Annual health plan screen
    And user should able to see "Ortho Care Frequency"
    When user swipes up till Yearly Ortho Care Frequency
    And user taps on Yearly Ortho Care Frequency
    Then user should able to see "Detailed baseline evaluation & symptomatic care - Nurse" with short note
    And user should able to see "Detailed baseline evaluation & symptomatic care - Lab test" with short note
    And user should able to see "Complete health review & care by Orthopedician " with short note
    And user should able to see "Specialty care and referral" with short note
    And user should able to see "Physiotherapy" with short note
    And user should able to see "Annual outcome - lab tests" with short note
    And user should able to see "Annual outcome - In-Person Nurse visit" with short note
    And user should able to see "Annual outcome - General Physician" with short note
    When user swipes up till Half Yearly Ortho Care Frequency
    And user taps on Half Yearly Ortho Care Frequency
    Then user should able to see "6 monthly lab tests" with short note
    And user should able to see "In-Person Nurse visit" with short note
    When user taps on Half Yearly Ortho Care Frequency
    And user swipes up till Quarterly Ortho Care Frequency
    When user swipes up till Quarterly Ortho Care Frequency
    When user taps on Quarterly Ortho Care Frequency
    Then user should able to see "Paramedical care - Nutritionist" with short note
    And user should able to see "Comprehensive quarterly care by the physician" with short note
    When user swipes up till Monthly Ortho Care Frequency
    And user taps on Monthly Ortho Care Frequency
    Then user should able to see "Periodic online follow-ups and care" with short note
    And user should able to see "Paramedical care - Health Educator" with short note
    When user swipes up till On Demand Diabetes Care Frequency
    And user taps on On Demand Ortho Care Frequency
    Then user should able to see "Special services that we offer on demand" with short note

  @TC_POL_019
  Scenario: TC_POL_019 Verify Women's Health Frequency feature with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on Care plans menu item
    Then user should able to see Care Plans screen
    And user should able to see Womens' Health with related information
    When user taps on "Womens' Health "
    Then user should able to see Annual health plan screen
    And user should able to see "Womens Health Care Frequency"
    When user swipes up till Yearly Women's Health Frequency
    And user taps on Yearly Women's Health Frequency
    Then user should able to see "Detailed baseline evaluation & symptomatic care - Nurse" with short note
    And user should able to see "Detailed baseline evaluation & symptomatic care - Lab test" with short note
    And user should able to see "Complete health review & care by OBGYN specialist" with short note
    And user should able to see "Specialty care and referral" with short note
    And user should able to see "Annual outcome - Lab test" with short note
    And user should able to see "Annual outcome - In-Person Nurse visit" with short note
    And user should able to see "Annual outcome - General Physician" with short note
    When user swipes up till Half Yearly Women's Health Frequency
    And user taps on Half Yearly Women's Health Frequency
    Then user should able to see "6 monthly lab tests" with short note
    And user should able to see "In-Person Nurse visit" with short note
    And user swipes up till Quarterly Women's Health Frequency
    And user taps on Quarterly Women's Health Frequency
    Then user should able to see "Paramedical care - Nutritionist" with short note
    And user should able to see "Paramedical care - Physiotherapist" with short note
    And user should able to see "Comprehensive quarterly care by the physician" with short note
    When user swipes up till Monthly Women's Health Frequency
    And user taps on Monthly Women's Health Frequency
    Then user should able to see "Periodic online follow-ups and care" with short note
    And user should able to see "Paramedical care - Health Educator" with short note
    When user swipes up till On Demand Diabetes Care Frequency
    And user taps on On Demand Women's Health Frequency
    Then user should able to see "Special services that we offer on demand" with short note

  @TC_POL_020 
  Scenario: TC_POL_020 Verify About Us feature with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on About us menu item
    Then user should able to see eClinic: last mile healthcare.
    And user should able to see key features of eClinic
    When user scroll to bottom of screen in About Us
    Then user should able to see State of the art healthcare at your finger tips!
    When user scroll to bottom of screen in About Us
    Then user should able to see Comprehensive healthcare plans.
    When user taps on General health dropdown
    Then user should able to see short note on General health
    When user taps on General health dropdown
    And user taps on Diabetes Care dropdown
    Then user should able to see short note on Diabetes
    When user taps on Diabetes Care dropdown
    And user taps on Cardiac Care dropdown
    Then user should able to see short note on Cardiac Care
    When user taps on Cardiac Care dropdown
    And user taps on Ortho Care drop down
    Then user should able to see shot note on Ortho Care
    When user taps on Ortho Care drop down
    And user taps on Womens' Health
    Then usee should able to see short note on womens' health

  @TC_POL_021 
  Scenario: TC_POL_021 Verify Specialites screen with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on Doctors menu item
    Then user should able to see "Specialities" in the screen
    And user should able to see Cardiology
    And user should able to see Dentistry
    And user should able to see Dermatology
    And user should able to see Medicine
    And user should able to see "Available doctors"
    And user should able to see doctor name
    And user should able to see doctor profession
    And user should able to see experience
    And user should able to see Location
    When user scrolls the doctors scroll bar
    Then user should able to see some more doctors in the scroll bar
    And user should able to see Receive top-notch treatment.
    When user scrolls to Get the care you need without leaving the home!
    Then user should able see information on Get the care you need without leaving the home!
    #And user should able to see "Receive top-notch treatment."
    #When user scrolls to "Get the care you need without leaving the house!"
    #Then user should able see information on "Get the care you need without leaving the house!"
    And user should able to see "98%" "  Satisfaction rate"
    And user should able to see "28k+" "  Registered Users "
    When user scrolls to "Get Quality Care With Our Doctors!"
    Then user should able to see "30+ Min" "CureBay Doctors"
    And user should able to see "Less than 5 Min" "Doctors elsewhere"
    When user scrolls to top of the screen
    Then user should able to see "Specialities" in the screen

  #When user slides the doctors carousel
  #Then user should able to see some more doctors in the carousel
  @TC_POL_022 @16082023 @CBDEMO
  Scenario: TC_POL_022 Verify All Specialities Screen with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
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

  @TC_POL_023
  Scenario: TC_POL_023 Verify Service partners feature with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on Service partners menu item
    Then user should see Service partners screen
    And user should able to see "Hospital service partners"
    And user should able to see "Diagnostic labs service partners"
    And user should able to see "Allied service partners"
    And user should able to see "Ambulance service "
    When user taps on Hospital service partners
    Then user should able to see various Hospital service partners
    When user taps on Hospital service partners
    And user taps on Diagnostic labs service partners
    Then user should able to see various Diagnostic labs service partners
    When user taps on Diagnostic labs service partners
    And user taps on Allied service partners
    Then user should able to see various Allied service partners
    When user taps on Allied service partners
    And user taps on Ambulance service
    Then user should able to see Ambulance service
    When user navigates back
     #Then user should able to care plans screen
    Then user should able to see dashboard Screen

  #Then user should able to care plans screen
  @TC_POL_024
  Scenario: TC_POL_024 Verify Locations feature by entering zipcode with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on locations menu item
    Then user should able to see location screen
    When user enters invalid zipcode
    And user taps on submit button in locations screen
    Then user should able to see a popup with message "Please enter a proper pin code"
    When user taps ok in the popup
    And user enter valid zipcode
    And user taps on submit button in locations screen
    Then user should able to see related cureBay eclinics of entered zipcode

  @TC_POL_025 @16082023
  Scenario: TC_POL_025 Verify Select a City dropdown in Locations screen
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on locations menu item
    Then user should able to see location screen
    When user taps on eclinics radio button
    Then user should able to see CureBay eClinics found at various cities
    When user taps on city radio button
    Then user should able to see "Select a City" dropdown
    When user taps on Select a City dropdown
    Then user should able to see cities in dropdown list
    When user selects a city from city dropdown
    #-----> only few cities displayed in the dropdown
    Then user should able to see CureBay eclinics found in selected city
    When user taps on Map view
    Then user should able to Map screen
    When user taps on Select a city dropdown
    Then user should able to see cities in dropdown list
    When user selects a city from city dropdown
    #-----> only few cities displayed in the dropdown
    Then user should able to selected city with eclinic image in map

  @TC_POL_026 @CBDEMO
  Scenario: TC_POL_026 Verify Reviews menu item with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on Reviews menu item
    Then user should able to see Member experience
    And user should able to see reviewer name
    And user should able to see location of reviewer
    And user should able to see review
    And user should able to see posted Dated
    When user swipes to "Show All"
    And user taps on Show All button
    Then user should able to see all available reviews
    When user swipes to "Show less"
    And user taps on Show less button
    Then user should able to see "Videos"
    And user should able to see "Hear it straight from the source"
    When user taps on video
    Then user should able to see the video play

  @TC_POL_027
  Scenario: TC_POL_027 Verify Articles feature with login
    When user taps on curebay application
    Then user should able to see dashboard Screen
    When user taps on menu
    Then user should able to see menu items
    When user taps on Articles menu item
    Then user should able to see Take a glimpse at our accomplishments.
    #When user taps on Articles
    #Then user should able to see Take a look at our eClinic facility.
    #And user should able to see Image is defaultly selected
    And user should able to see Images of Articles
    When user taps on the Image in Articles screen
    Then user should able to see Article
    When user navigates back to the Articles screen
    Then user should able to see Take a glimpse at our accomplishments.
    #Then user should able to see Take a look at our eClinic facility.
    And user should able to see Video
    When user taps on Video in Articles screen
    Then user should able to see Videos
    When user taps on any video
    Then user should able to see video play

  @TC_POL_028
  Scenario: TC_POL_028 Verify Our Team menu item with login
     When user taps on curebay application
    Then user should able to see Login and Sign-up
    When user taps on menu
    Then user should able to see menu items
    When user taps on Our Team memu item
    Then user should able to see "Meet the dreamers" in the Our Team screen
    And user should able to see "Founder & CEO" name
    And user should able to see note on Founder & CEO
    When user scrolls to "Co-Founder & COO"
    Then user should able to see "Co-Founder & COO" name
    And user should able to see note on Co-Founder & COO
    When user scrolls to "Co-Founder & CTO"
    Then user should able to see "Co-Founder & CTO" name
    And user should able to see note on Co-Founder & CTO
    When user scrolls to "President"
    Then user should able to see "President" name
    And user should able to see note on President
     When user scrolls to "Chief Program Officer"
    Then user should able to see "Chief Program Officer" name
    And user should able to see note on Chief Program Officer
     When user scrolls to "Head - Sales & Operations"
    Then user should able to see "Head - Sales & Operations" name
    And user should able to see note on Head - Sales & Operations
    When user scrolls to "Head - Strategic Initiatives"
    Then user should able to see "Head - Strategic Initiatives" name
    And user should able to see note on Head - Strategic Initiatives
    When user scrolls to "Head - Strategic Partnerships"
    Then user should able to see "Head - Strategic Partnerships" name
    And user should able to see note on Head - Strategic Partnerships
    #When user scrolls to "Head - Sales & Operations"
    #Then user should able to see "Head - Sales & Operations" name
    #And user should able to see note on Head - Sales & Operations
    #When user scrolls to "Head - Strategic Initiatives"
    #Then user should able to see "Head - Strategic Initiatives" name
    #And user should able to see note on Head - Strategic Initiatives
    #When user scrolls to "Chief Program Officer"
    #Then user should able to see "Chief Program Officer" name
    #And user should able to see note on Chief Program Officer
    When user scrolls to "Head - Finance"
    Then user should able to see "Head - Finance" name
    And user should able to see note on Head - Finance
    When user scrolls to Our Advisors
    Then user should able to see Our Advisors name and note
