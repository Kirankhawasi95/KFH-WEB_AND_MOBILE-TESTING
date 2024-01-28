@CartModule
Feature: Testing new cucumber framework with SwagLab application

  Background: SwagLab
    Given I am in swaglab application
	
  Scenario Outline: adding in cart in swaglab1 application- <iteration>
    When user enter username
    And user enter password
    And user clicks on login button
    When user clicks on Sauce Labs Backpack prodcut
    And user clicks on add cart icon
    And user clicks on checkout
    And user enter first name <First Name>
    And user enter second name<Second Name>
    And user enter postal code<Postal code>
    And user clicks on continue
    And user clicks on finish button

    Examples: 
      | First Name    | Second Name | Postal code | iteration |
      | vamsi krishna | pemmasani   |      522603 |         1 |
      | Amitabha      | Bagchi      |      700059 |         2 |
