@CureBay @PreLogin @CBTesting
Feature: Verify CureBay Pre Login functionalities

  @TC_PL_001 
  Scenario: TC_PL_001 Verify Curebay experience feature without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
    When user taps on menu
    Then user should able to see menu items
    When user taps on curebay experience menu item
    Then user should able to see Welcome to our eClinic Screen
    And user should able to see general health in curebay experience screen
    When user taps on general health
    Then user should able to see key features

  @TC_PL_002 @CBDEMO
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

  @TC_PL_003 
  Scenario: TC_PL_003 Verify Next Generation Solutions is visible at bottom of screen without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
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

  @TC_PL_004
  Scenario: TC_PL_004 Verify One Stop Health Solutions is visible without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
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
    Then user should able to Medicare Plans screen
    
    #And user should able to see Holistic care plans with short Note
    #And user should able to see Round the clock access with short Note
    #And user should able to see Achieve health goals with short Note
    #And user should able to see always stay updated with short Note
    #And user should able to see advanced technology with a short note
    #When user navigates back
    #Then user should able to care plans screen
    #Then user should able to Medicare Plans screen

  @TC_PL_005_0014_Outline
  Scenario Outline: <TC_PL_ID> Verify Add <CarePlan> plan to cart in care plans at <PayType> feature without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
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
    Then user should able to see a popup Please login to continue.
    When user taps on login button
    Then user should able to see login screen

    Examples: 
      | TC_PL_ID  | CarePlan          | PayType       |
      | TC_PL_005 | "General Health"  | "Pay Monthly" |
      | TC_PL_006 | "General Health"  | "Pay in Full" |
      | TC_PL_007 | "Cardiac Care"    | "Pay Monthly" |
      | TC_PL_008 | "Cardiac Care"    | "Pay in Full" |
      | TC_PL_009 | "Diabetes Care"   | "Pay Monthly" |
      | TC_PL_010 | "Diabetes Care"   | "Pay in Full" |
      | TC_PL_011 | "Ortho Care"      | "Pay Monthly" |
      | TC_PL_012 | "Ortho Care"      | "Pay in Full" |
      | TC_PL_013 | "Womens' Health " | "Pay Monthly" |
      | TC_PL_014 | "Womens' Health " | "Pay in Full" |

  @TC_PL_015 @Textadd
  Scenario: TC_PL_015 Verify General Health Care Frequency feature without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
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

  @TC_PL_016 @Textadd
  Scenario: TC_PL_016 Verify Diabetes Care Frequency feature without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
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
    

  @TC_PL_017 @Textadd
  Scenario: TC_PL_017 Verify Cardiac Care Frequency feature without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
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
    


  @TC_PL_018 @Textadd @CB06092023 @07092023
  Scenario: TC_PL_018 Verify Ortho Care Frequency feature without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
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
    And user taps on Quarterly Ortho Care Frequency
    Then user should able to see "Paramedical care - Nutritionist" with short note
    And user should able to see "Comprehensive quarterly care by the physician" with short note
    When user swipes up till Monthly Ortho Care Frequency
    And user taps on Monthly Ortho Care Frequency
    Then user should able to see "Periodic online follow-ups and care" with short note
    And user should able to see "Paramedical care - Health Educator" with short note
    When user swipes up till On Demand Diabetes Care Frequency
    And user taps on On Demand Ortho Care Frequency
    Then user should able to see "Special services that we offer on demand" with short note
    

  @TC_PL_019 @Textadd
  Scenario: TC_PL_019 Verify Women's Health Frequency feature without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
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

  @TC_PL_020 
  Scenario: TC_PL_020 Verify About Us feature without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
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

  @TC_PL_021 
  Scenario: TC_PL_021 Verify Specialites screen without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
    When user taps on menu
    Then user should able to see menu items
    When user taps on Doctors menu item
    Then user should able to see "Specialities" in the screen
    And user should able to see Cardiology
    And user should able to see Dentistry
    And user should able to see Dermatology
    And user should able to see Medicine
    And user should able to see Available doctors
    And user should able to see doctor name
    And user should able to see doctor profession
    And user should able to see experience
    And user should able to see Location
    When user scrolls the doctors scroll bar
    Then user should able to see some more doctors in the scroll bar
    And user should able to see Receive top-notch treatment.
    When user scrolls to Get the care you need without leaving the home!
    Then user should able see information on Get the care you need without leaving the home!
    And user should able to see "98%" " Satisfaction rate"
    And user should able to see "28k+" " Registered Users "
    When user scrolls to "Get Quality Care With Our Doctors!"
    Then user should able to see "30+ Min" "CureBay Doctors"
    And user should able to see "Less than 5 Min" "Doctors elsewhere"
    When user scrolls to top of the screen
    Then user should able to see "Specialities" in the screen

  @TC_PL_022 
  Scenario: TC_PL_022 Verify All Specialities Screen without login
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

  @TC_PL_023 
  Scenario: TC_PL_023 Verify Service partners feature without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
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
    Then user should able to care plans screen

  @TC_PL_024 @TestingCB 
  Scenario: TC_PL_024 Verify Locations feature by entering zipcode without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
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

  #@TC_PL_025
  #Scenario: TC_PL_025 Verify Locations feature without entering zipcode
  #When user taps on menu
  #Then user should able to see menu items
  #When user taps on locations menu item
  #Then user should able to see location screen
  #When user taps on eclinics radio button
  #Then user should able to see CureBay eClinics found at various cities
  #When user taps on city radio button
  #Then user should able to see select a City dropdown
  #When user taps on dropdown
  #Then user should able to see cities in dropdown list
  #When user selects a city
  #Then user should able to see CureBay eclinics found in selected city
  @TC_PL_025 
  Scenario: TC_PL_025 Verify Select a City dropdown in Locations screen
    When user taps on curebay application
    Then user should able to see Login and Sign-up
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

  @TC_PL_026  
  Scenario: TC_PL_026 Verify Reviews menu item without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
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

  @TC_PL_027 
  Scenario: TC_PL_027 Verify Articles feature without login
    When user taps on curebay application
    Then user should able to see Login and Sign-up
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

  @TC_PL_028 
  Scenario: TC_PL_028 Verify Our Team menu item without login
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

  @TC_PL_029 
  Scenario: TC_PL_029 Verify Sig Up Now button in Pre Login screen
    When user taps on curebay application
    Then user should able to see Login and Sign-up
    When user is in Pre Login Screen
    And user sees Take care of your loved ones, from miles away.
    And user sees Sign Up Now button
    And user taps on Sign Up Now button
    Then user should able to see Sign Up Screen

  @TC_PL_030 
  Scenario: TC_PL_030 Verify Care Plans in Pre Login screen
    When user taps on curebay application
    Then user should able to see Login and Sign-up
    When user is in Pre Login Screen
    And user sees Care Plans
    And user sees See All
    And user sees General Health
    And user sees Cardiac Care
    When user taps on See All
    Then user should able to see Care Plans screen
    When user taps on navigate back icon
    Then user should able to see Login and Sign-up
    #Then user should able to see pre login screen
    When user taps on Read More is under General Health
    Then user should able to see Care Plans screen
    When user taps on navigate back icon
    Then user should able to see Login and Sign-up
    #Then user should able to see pre login screen
    When user taps on Read More is under Cardiac Care
    Then user should able to see Care Plans screen

  @TC_PL_031 
  Scenario: TC_PL_031 Verify dot slider in Pre Login screen
    When user taps on curebay application
    Then user should able to see Login and Sign-up
    When user swipes up the screen
    Then user should able to see Brining health right at your Parent's doorstep
    And user should able to see User-Dashboard
    And user should able to see your father's health report at your fingertips
    When user slides User-Dashboard slider
    Then user should able to see Virtual Consultation
    And user should able to see Participate in your mother's next consultation
    When user slides Virtual Consultation slider
    Then user should able to see Vitals
    And user should able to see Stay informed with ongoing monitoring

  @TC_PL_032 
  Scenario: TC_PL_032 Verify Specialities in Pre Login screen
    When user taps on curebay application
    Then user should able to see Login and Sign-up
    When user swipes up the screen
    Then user should able to see Specialities
    And user should able to see See All
    And user should able to see Cardiology
    And user should able to see Dentistry
    And user should able to see Dermatology
    And user should able to see Medicine
    When user taps on See All
    Then user should able to see All Specialities screen
    When user taps on navigate back icon
    Then user should able to see Login and Sign-up

  #Then user should able to see pre login screen
  @TC_PL_033  
  Scenario: TC_PL_033 Verify Why choose CureBay in Pre Login screen
    When user taps on curebay application
    Then user should able to see Login and Sign-up
    When user swipes up the screen
    Then user should able to see Why choose CureBay
    And user should able to see Holistic care plans
    And user should able to see Always stay updated
    And user should able to see Achieve health goals
    And user should able to see Round the clock access
    And user should able to see Situation room
    And user should able to see Advanced technology
    
    #And user should able to see eClinic
    #And user should able to see Technology platform
    #And user should able to see Consumer application
    #And user should able to see Health tech devices
    #And user should able to see Situation room
    #And user should able to see Network providers
    When user swipes up the screen
    Then user should able to see 36k Happy patients
    And user should able to see 48 eClincs in Odisha
    And user should able to see 45 Specialities
    And user should able to see 30 Service providers
    And user should able to see 2500 Villages and towns covered

  @TC_PL_034 @BookNow 
  Scenario: TC_PL_034 Verify Book for a free session now in Pre Login Screen with valid data
    When user taps on curebay application
    Then user should able to see Login and Sign-up
    When user swipes up the screen to Explore our healthcare plans
    #When user swipes up the screen to Book for a free session now
    And user taps on Book Now
    Then user should able to see New Booking in popup
    When user taps on BOOK NOW in popup
    Then user should able to see Book for your Pre-Counselling!
    When user enters valid text in name text box for care details
    And user selects country from country code dropdown
    And user enters valid Phone Number in Phone Number box
    And user enters valid email id in email Address
    And user fills Care Receiver details with vaild details
    And user taps on Send Inquiry button
    Then user should able to see Alert message Your information Saved Successfully.

  @TC_PL_035 @10082023 @BookNow 
  Scenario Outline: <TC_PL_ID> Verify Book for a free session now in Pre Login Screen with <description>
    When user taps on curebay application
    Then user should able to see Login and Sign-up
    When user swipes up the screen to Explore our healthcare plans
    #When user swipes up the screen to Book for a free session now
    And user taps on Book Now
    Then user should able to see Booking Confirmation in popup
    And user should able to see New Booking in popup
    When user taps on BOOK NOW in popup
    Then user should able to see Book for your Pre-Counselling!
    When user enters <name1> in Name text box for care details
    And user selects country from country code dropdown
    And user enters <phoneNumber1> in Phone Number box for care details
    And user enters <emailId> in Email Address
    And user enters <name2> in name text box in care receiver details
    And user selects the relationship
    And user enters <phoneNumber2> in care receiver's phone number box
    And user enters <location> in location box
    And user taps on Send Inquiry button
    Then user should able to see error messages under the text boxes

    Examples: 
      | TC_PL_ID  | description                               | name1     | phoneNumber1 | emailId          | name2    | phoneNumber2 | location    |
      | TC_PL_035 | Integers in all text boxes                |      1234 |        12345 |           123456 |     8278 |         2233 |       33444 |
      | TC_PL_036 | special char in all text boxes            | 1%%%^^&ad | $^!&1b       | @^%*43@gmail.com | ^^&@&1hj | @h/?><       | UI*??>      |
      | TC_PL_037 | less than 10 digits in phone number boxes | 28ujd     |        98328 | 1ndjnj2          | 326hjed  |        93453 | 7837jndnnjw |
      | TC_PL_038 | blank in text box                         |           |              |                  |          |              |             |

  @TC_PL_039 @10082023 @BookNow 
  Scenario: TC_PL_039 Verify Add More Member in Book for your pre-counselling
    When user taps on curebay application
    Then user should able to see Login and Sign-up
    When user swipes up the screen to Explore our healthcare plans
    #When user swipes up the screen to Book for a free session now
    And user taps on Book Now
    Then user should able to see Booking Confirmation in popup
    #And user should able to see New Booking in popup
    When user taps on BOOK NOW in popup
    Then user should able to see Book for your Pre-Counselling!
    When user enters valid text in name text box for care details
    And user selects country from country code dropdown
    And user enters valid Phone Number in Phone Number box
    And user enters valid email id in email Address
    And user fills Care Receiver details with vaild details
    And user taps on Add More Member
    Then user should able to see one more booking form
    And user should able to see remove link
    When user taps on remove link
    Then user should able to see newly added form removed
    When user taps on Add More Member more than 3 times
    Then user should able to see error message

  #--> bug ,forms getting added
  @TC_PL_040 
  Scenario: TC_PL_040 Verify Frequently Asked Questions in Pre Login screen
    When user taps on curebay application
    Then user should able to see Login and Sign-up
    When user swipes up the screen
    Then user should able to see Frequently Asked Questions
    And user should able to see Q. What is Health-Assessment?
    And user should able to see Q. What is Health-Assessment? Answer
     And user should able to see For more answers read our FAQ Page
    When user taps on For more answers read our FAQ Page
    Then user should able to see FAQ screen
     And user should able to see What is Health-Assessment?
    When user taps on What is Health-Assessment?
    Then user should able to see relavent answer for What is Health-Assessment?
    
     When user taps on Can I use the same account for more than one family member?
    Then user should able to see relavent answer for Can I use the same account for more than one family member?
    When user taps on How do I make the payment?
    Then user should able to see relavent answer for How do I make the payment?
    When user taps on Do I need to submit any documents?
    Then user should able to see relavent answer for Do I need to submit any documents?
     When user taps on is my data safe?
    Then user should able to see relavent answer for is my data safe?
    And user taps on is the support team available 24*7?
      Then user should able to see relavent answer for is the support team available 24*7?
    And user taps on How can I cancel my membership?
    Then user should able to see relavent answer for How can I cancel my membership?
     When user taps on Can we opt-out if we have chosen a monthly pay-out?
    Then user should able to see relavent answer for Can we opt-out if we have chosen a monthly pay-out?
     When user taps on Can I re-schedule the appointment?
    Then user should able to see relavent answer for Can I re-schedule the appointment?
      When user taps on Will I be able to do a physical doctor consultation?
    Then user should able to see relavent answer for Will I be able to do a physical doctor consultation?
     When user taps on Can we do any lab tests based on our custom requirements?
    Then user should able to see relavent answer for Can we do any lab tests based on our custom requirements?
    When user taps on What all can be tracked on the dashboard?
    Then user should able to see relavent answer for What all can be tracked on the dashboard?
    When user taps on What are the On Demand Services?
    Then user should able to see relavent answer for What are the On Demand Services?
    
    #And user should able to see Q. What is Pre-Assessment?
    #And user should able to see Q. What is Pre-Assessment? Answer
    #And user should able to see Can I choose more than one plan if i have 2 diseases?
    #And user should able to see Yes you can choose more than 1 plans or make on custom plan
   
    #And user should able to see What is Pre-Assessment?
    #When user taps on What is Pre-Assessment?
    #Then user should able to see relavent answer for What is Pre-Assessment?
    #When user taps on Can I use the same account for more than one family member?
    #Then user should able to see relavent answer for same account
    #When user taps on How do I make the payment?
    #Then user should able to see You can make online payment
    #When user taps on Do I need to submit any documents?
    #Then user should able to see No, You don't have to submit any documents
    #When user swipes up
    #And user taps on is my data safe?
    #Then user should able to see You health data is protected by our firewall. We adhere to a strict privacy policy.
    #When user swipes up
    #And user taps on is the support team available 24*7?
    #Then user should able to see relavent answer for support team available 24*7
    #When user swipes up
    #And user taps on How can I cancel my membership?
    #Then user should able to see relavent answer for can I cancel my membership
    #When user taps on Can we opt-out if we have chosen a monthly pay-out?
    #Then user should able to see relavent answer for Can we opt-out if we have chosen a monthly pay-out?
    #When user taps on Can I re-schedule the appointment?
    #Then user should able to see relavent answer for Can I re-schedule the appointment?
    #When user taps on Will I be able to do a physical doctor consultation?
    #Then user should able to see relavent answer for Will I be able to do a physical doctor consultation?
    #When user taps on Can we do any lab tests based on our custom requirements?
    #Then user should able to see relavent answer for Can we do any lab tests based on our custom requirements?
    #When user taps on What all can be tracked on the dashboard?
    #Then user should able to see relavent answer for What all can be tracked on the dashboard?
    #When user taps on What are the On Demand Services?
    #Then user should able to see relavent answer for What are the On Demand Services?
    #
    #
   #		Then user should able to see pre login screen
