@RoundTable @riskcovry @Auth_Login @RoundTable
Feature: validation of khulke APIs for RoundTable Auth Login

  
   
  @Auth_login_WIV_Password @Auth_Login_Negative @RoundTable_Negative @RT_TC_013 @soapAPI1
  Scenario: TC_006_Testing Soap API2
  
   
     Given I set up request specification
      | HeaderName    | HeaderValue                                                                                                                                                                  |
      | Content-Type  | text/xml; charset=utf-8                                                                                                                                                            |
     
    When I send the SOAP post request to "soapEndpoint2" endpoint
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
     Then verifies the field is present in the html response
    |//p[text()='Visual Basic']|

@Auth_login_WIV_Password @Auth_Login_Negative @RoundTable_Negative @RT_TC_013 @soapAPI
  Scenario: TC_005_Testing Soap API1 
     Given I set up request specification
      | HeaderName    | HeaderValue                                                                                                                                                                  |
      | Content-Type  | text/xml; charset=utf-8                                                                                                                                                            |
     
    When I send the SOAP post request to "soapEndpoint" endpoint
    Then I should see the response code as "200"
    And verify response time is less than "10000" milliseconds
    Then verifies the field is present in the html response
    |.//a[text()='NumberToDollars']|
    

 