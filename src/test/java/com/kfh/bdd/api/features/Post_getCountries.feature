Feature: Validating the Get Country values

  @Country_Values_Positive @TC_API_001 @WULookUpServices
  Scenario: TC_API_001 - To Verify the Get Country Values with valid credentials
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
      | Connection   | keep-alive                           |
    When I post the request with "Get_Contry_Values" without payload
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                               | Value                  |
      | $.countriesList[0].codeNum          |                    840 |
      | $.countriesList[0].codeStr          | AB                     |
      | $.countriesList[0].name             | Spain US Military Base |
      | $.countriesList[31].codeNum         |                    084 |
      | $.countriesList[31].codeStr         | BZ                     |
      | $.countriesList[31].name            | Belize                 |
      | $.countriesList[94].codeNum         |                    891 |
      | $.countriesList[94].codeStr         | K1                     |
      | $.countriesList[94].name            | Kosovo                 |
      | $.transactionExtResult.isSuccessful | true                   |

  @Country_Values_Negative @TC_API_002 @WULookUpServices
  Scenario: TC_002 To Verify the Get Country with Invalid API Key
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | apiKey       | d5b942f5-8e5a-4721-BBFE-9b218fercac2 |
      | Content-Type | application/json                     |
      | Connection   | keep-alive                           |
      | Accept       | application/json                     |
    When I post the request with "Get_Contry_Values" without payload
    Then I should see the response code as "401"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                                                                                                                                                        |
      | $.Exception | API Gateway encountered an error. Error Message:  Unauthorized application request. Request Details: Service - WULookUpService, Operation - /getComboValues, Invocation Time:10:11:03 AM, Date:Dec 3, 2023,  Client IP - 10.10.110.71, User - Default and Application:sys:defaultApplication |

  @Country_Values_Negative @TC_API_003 @WULookUpServices
  Scenario: TC_API_003 - To Verify the Get Country Values without API Key value
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
      #| apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json |
    When I post the request with "Get_Contry_Values" without payload
    Then I should see the response code as "401"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                                                                                                                                                        |
      | $.Exception | API Gateway encountered an error. Error Message:  Unauthorized application request. Request Details: Service - WULookUpService, Operation - /getComboValues, Invocation Time:10:11:03 AM, Date:Dec 3, 2023,  Client IP - 10.10.110.71, User - Default and Application:sys:defaultApplication |

  @Country_Values_Negative @TC_API_004 @WULookUpServices
  Scenario: TC_API_004 - To Verify the Get Country Values with Invalid URL
    Given I set up invalid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I post the request with "Get_Contry_Values" without payload
    Then I should see the response code as "404"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue |
      | Content-Type | text/html   |

  @Country_Values_Negative @TC_API_005 @WULookUpServices
  Scenario: TC_API_005 - To Verify the Get Country Values without passing Content Type Header
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      #| Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I post the request with "Get_Contry_Values" without payload
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                               | Value                  |
      | $.countriesList[0].codeNum          |                    840 |
      | $.countriesList[0].codeStr          | AB                     |
      | $.countriesList[0].name             | Spain US Military Base |
      | $.countriesList[31].codeNum         |                    084 |
      | $.countriesList[31].codeStr         | BZ                     |
      | $.countriesList[31].name            | Belize                 |
      | $.countriesList[94].codeNum         |                    891 |
      | $.countriesList[94].codeStr         | K1                     |
      | $.countriesList[94].name            | Kosovo                 |
      | $.transactionExtResult.isSuccessful | true                   |

  @Country_Values_Negative @TC_API_006 @WULookUpServices
  Scenario: TC_API_006 - To Verify the Get Country Values without passing Accept Header
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      #| Accept       | application/json                     |
      | Connection   | keep-alive                           |
    When I post the request with "Get_Contry_Values" without payload
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                               | Value                  |
      | $.countriesList[0].codeNum          |                    840 |
      | $.countriesList[0].codeStr          | AB                     |
      | $.countriesList[0].name             | Spain US Military Base |
      | $.countriesList[31].codeNum         |                    084 |
      | $.countriesList[31].codeStr         | BZ                     |
      | $.countriesList[31].name            | Belize                 |
      | $.countriesList[94].codeNum         |                    891 |
      | $.countriesList[94].codeStr         | K1                     |
      | $.countriesList[94].name            | Kosovo                 |
      | $.transactionExtResult.isSuccessful | true                   |

  @Country_Values_Negative @TC_API_007 @WULookUpServices
  Scenario: TC_API_007 - To Verify the Get Country Values with passing Invalid Content Type
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | text/html                            |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I post the request with "Get_Contry_Values" without payload
    Then I should see the response code as "415"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                                                                                                                                                                    |
      | $.Exception | API Gateway encountered an error. Error Message:  Native service provider error. Code : 415. Request Details: Service - WULookUpService, Operation - /getComboValues, Invocation Time:10:52:24 AM, Date:Dec 3, 2023,  Client IP - 10.10.110.71, User - Default and Application:LegacyRetailOnlineBanking |

  @Country_Values_Negative @TC_API_008 @WULookUpServices
  Scenario: TC_API_008 - To Verify the Get Country Values with passing Invalid Accept Header
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | text/html                            |
    When I post the request with "Get_Contry_Values" without payload
    Then I should see the response code as "406"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                                                                                                                                                                    |
      | $.Exception | API Gateway encountered an error. Error Message:  Native service provider error. Code : 406. Request Details: Service - WULookUpService, Operation - /getComboValues, Invocation Time:11:15:34 AM, Date:Dec 3, 2023,  Client IP - 10.10.110.71, User - Default and Application:LegacyRetailOnlineBanking |

  #@Country_Values_Negative @TC_API_009 @WULookUpServices
  #Scenario: TC_009 To Verify the Post Request without passing headers
    #Given I set up valid URI specification
    #Given I set up request specification
    #| HeaderName   | HeaderValue                          |
    #| Content-Type | application/json                     |
    #| apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
    #| Accept       | application/json                     |
    #| Connection   | keep-alive                           |
    #When I post the request with "Get_Contry_Values" without payload
    #Then I should see the response code as "400"
    #And verify response time is less than "3000" milliseconds
    #And I should see the response size as "546"
    #And verify response headers
      #| HeaderName   | HeaderValue      |
      #| Content-Type | application/json |
