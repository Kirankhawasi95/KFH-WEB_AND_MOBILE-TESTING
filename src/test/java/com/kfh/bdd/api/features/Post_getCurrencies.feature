Feature: Validating the Get Currencies Values

  @Currency_Values_Positive @TC_API_001 @WULookUpServices
  Scenario: TC_API_001 - To Verify the Get Currency Values with valid credentials
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I post the request with "Get_Currency_Values" payload
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                                    | Value        |
      | $.currenciesList[0].codeNum              |          356 |
      | $.currenciesList[0].codeStr              | INR          |
      | $.currenciesList[0].name                 | Indian Rupee |
      | $.transactionExtResult.errorDetails      | null         |
      | $.transactionExtResult.isSuccessful      | true         |
      | $.transactionExtResult.statusCode        | null         |
      | $.transactionExtResult.statusDescription | null         |

  @Currency_Values_Negative @TC_API_002 @WULookUpServices
  Scenario: TC_API_002 - To Verify the Get Currency Values with Invalid API Key value
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      # Invaild API Key
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac4 |
      | Accept       | application/json                     |
    When I post the request with "Get_Currency_Values" payload
    #And I post the request to endpoint
    Then I should see the response code as "401"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                      |
      | $.Exception | API Gateway encountered an error. Error Message:  Unauthorized application request. Request Details: Service - WULookUpService, Operation - /getCurrencies |

  @Currency_Values_Negative @TC_API_003 @WULookUpServices
  Scenario: TC_API_003 - To Verify the Get Currency Values without API Key value
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
      #| apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json |
    When I post the request with "Get_Currency_Values" payload
    Then I should see the response code as "401"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                      |
      | $.Exception | API Gateway encountered an error. Error Message:  Unauthorized application request. Request Details: Service - WULookUpService, Operation - /getCurrencies |

  @Currency_Values_Negative @TC_API_004 @WULookUpServices
  Scenario: TC_API_004 - To Verify the Get Currency Values with Invalid URL
    Given I set up invalid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I post the request with "Get_Currency_Values" payload
    #And I post the request to endpoint
    Then I should see the response code as "404"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue |
      | Content-Type | text/html   |

  @Currency_Values_Negative @TC_API_005 @WULookUpServices
  Scenario: TC_API_005 - To Verify the Get Currency Values without passing Content Type Header
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName | HeaderValue                          |
      #| Content-Type | application/json                     |
      | apiKey     | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept     | application/json                     |
    When I post the request with "Get_Currency_Values" payload
    #And I post the request to endpoint
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                                    | Value        |
      | $.currenciesList[0].codeNum              |          356 |
      | $.currenciesList[0].codeStr              | INR          |
      | $.currenciesList[0].name                 | Indian Rupee |
      | $.transactionExtResult.errorDetails      | null         |
      | $.transactionExtResult.isSuccessful      | true         |
      | $.transactionExtResult.statusCode        | null         |
      | $.transactionExtResult.statusDescription | null         |

  @Currency_Values_Negative @TC_API_006 @WULookUpServices
  Scenario: TC_API_006 - To Verify the Get Currency Values without passing Accept Header
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
    #| Accept     | application/json                     |
    When I post the request with "Get_Currency_Values" payload
    #And I post the request to endpoint
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                                    | Value        |
      | $.currenciesList[0].codeNum              |          356 |
      | $.currenciesList[0].codeStr              | INR          |
      | $.currenciesList[0].name                 | Indian Rupee |
      | $.transactionExtResult.errorDetails      | null         |
      | $.transactionExtResult.isSuccessful      | true         |
      | $.transactionExtResult.statusCode        | null         |
      | $.transactionExtResult.statusDescription | null         |

  @Currency_Values_Negative @TC_API_007 @WULookUpServices
  Scenario: TC_API_007 - To Verify the Get Currency Values with passing Invalid Content Type
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | text/html                            |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I post the request with "Get_Currency_Values" payload
    #And I post the request to endpoint
    Then I should see the response code as "415"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                               |
      | $.Exception | API Gateway encountered an error. Error Message:  Native service provider error. Code : 415. Request Details: Service - WULookUpService, Operation - /getCurrencies |

  @Currency_Values_Negative @TC_API_008 @WULookUpServices
  Scenario: TC_API_008 - To Verify the Get Currency Values with passing Invalid Accept Header
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | text/html                            |
    When I post the request with "Get_Currency_Values" payload
    #And I post the request to endpoint
    Then I should see the response code as "406"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                               |
      | $.Exception | API Gateway encountered an error. Error Message:  Native service provider error. Code : 406. Request Details: Service - WULookUpService, Operation - /getCurrencies |

  @Currency_Values_Negative @TC_API_009_018 @WULookUpServices
  Scenario Outline: <TC_ID> To Verify the Get Currency Values with <InvalidCountryCode> in Payload
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I modify the fields in "Get_Currency_Values" payload
      | JPath            | Value         |
      | $.countryCodeStr | <CountryCode> |
    And I post the request to endpoint
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                                    | Value |
      | $.transactionExtResult.errorDetails      | null  |
      | $.transactionExtResult.isSuccessful      | true  |
      | $.transactionExtResult.statusCode        | null  |
      | $.transactionExtResult.statusDescription | null  |

    Examples: 
      | TC_ID  | InvalidCountryCode                         | CountryCode |
      | TC_009 | Alphanumeric value in country code         | IN452-sdf   |
      | TC_010 | Integer in country code                    |       12345 |
      | TC_011 | Double in country code                     | 23456.345d  |
      | TC_012 | null value in country code                 | null        |
      | TC_013 | negative value in country code             |       -2345 |
      | TC_014 | float value in country code                | 1234.56f    |
      | TC_015 | integer Special characters in country code | 12@345_^    |
      | TC_016 | String Special characters in country code  | IN@$_TY     |
      | TC_017 | Special characters in country code         | @^&*()      |
      | TC_018 | invalid country code                       | inr         |

  @Currency_Values_Negative @TC_API_019 @WULookUpServices
  Scenario Outline: TC_019 To Verify the Get Currency values Detail without payload
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Content-Type | application/json                     |
      | Accept       | application/json                     |
    When I post the request with "Get_Currency_Values_Null" payload
    #And I post the request to endpoint
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                                                   | Value                                                |
      | $.transactionExtResult.errorDetails[0].errorCode        | KWU1000                                              |
      | $.transactionExtResult.errorDetails[0].errorDescription | Exception during getComboValues-Invalid input - null |
      | $.transactionExtResult.isSuccessful                     | false                                                |
      | $.transactionExtResult.statusCode                       | null                                                 |
      | $.transactionExtResult.statusDescription                | null                                                 |
