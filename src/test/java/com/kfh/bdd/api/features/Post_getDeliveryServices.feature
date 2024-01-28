Feature: Validating the Get DeliveryServices Values

  @DeliveryServices_Values_Positive @TC_API_001 @WULookUpServices
  Scenario: TC_API_001 - To Verify the Get DeliveryServices Values with valid credentials
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I post the request with "Get_DeliveryServices_Values" payload
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                                       | Value                                                                                       |
      | $.deliveryServiceList[0].banner             | Payee Information for Money in Minutes                                                      |
      | $.deliveryServiceList[0].route              | WADSIN000                                                                                   |
      | $.deliveryServiceList[0].serviceCode        |                                                                                         000 |
      | $.deliveryServiceList[0].serviceDescription | MONEY IN MINUTES IS AVAILABLE. MONEY CAN BE PICKED UP AT ANY AGENT LOCATION WITHIN MINUTES. |
      | $.deliveryServiceList[0].serviceName        | MONEY IN MINUTES                                                                            |
      | $.deliveryServiceList[1].banner             | PAYEE INFORMATION FOR DIRECT DEPOSIT SERVICE                                                |
      | $.deliveryServiceList[1].route              | WADSIN001\\EBD                                                                              |
      | $.deliveryServiceList[1].serviceCode        |                                                                                         500 |
      | $.deliveryServiceList[1].serviceDescription | BANK DEPOSIT SERVICE TO INDIA - FAMILY SUPPORT                                              |
      | $.deliveryServiceList[1].serviceName        | DIRECT TO BANK                                                                              |
      | $.deliveryServiceList[1].templateID         |                                                                                        4020 |
      | $.deliveryServiceList[2].serviceCode        |                                                                                         800 |
      | $.deliveryServiceList[2].serviceName        | MOBILE MONEY TRANSFER                                                                       |
      | $.deliveryServiceList[2].templateID         |                                                                                        4060 |
      | $.transactionExtResult.isSuccessful         | true                                                                                        |

  @DeliveryServices_Values_Negative @TC_API_002 @WULookUpServices
  Scenario: TC_API_002 - To Verify the Get DeliveryServices Values with Invalid API Key value
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      # Invaild API Key
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac4 |
      | Accept       | application/json                     |
    When I post the request with "Get_DeliveryServices_Values" payload
    Then I should see the response code as "401"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                            |
      | $.Exception | API Gateway encountered an error. Error Message:  Unauthorized application request. Request Details: Service - WULookUpService, Operation - /getDeliveryServices |

  @DeliveryServices_Values_Negative @TC_API_003 @WULookUpServices
  Scenario: TC_API_003 - To Verify the Get DeliveryServices Values without API Key value
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
      #| apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json |
    When I post the request with "Get_DeliveryServices_Values" payload
    Then I should see the response code as "401"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                            |
      | $.Exception | API Gateway encountered an error. Error Message:  Unauthorized application request. Request Details: Service - WULookUpService, Operation - /getDeliveryServices |

  @DeliveryServices_Values_Negative @TC_API_004 @WULookUpServices
  Scenario: TC_API_004 - To Verify the Get DeliveryServices Values with Invalid URL
    Given I set up invalid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I post the request with "Get_DeliveryServices_Values" payload
    Then I should see the response code as "404"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue |
      | Content-Type | text/html   |

  @DeliveryServices_Values_Negative @TC_API_005 @WULookUpServices
  Scenario: TC_API_005 - To Verify the Get DeliveryServices Values without passing Content Type Header
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName | HeaderValue                          |
      #| Content-Type | application/json                     |
      | apiKey     | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept     | application/json                     |
    When I post the request with "Get_DeliveryServices_Values" payload
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                                       | Value                                                                                       |
      | $.deliveryServiceList[0].banner             | Payee Information for Money in Minutes                                                      |
      | $.deliveryServiceList[0].route              | WADSIN000                                                                                   |
      | $.deliveryServiceList[0].serviceCode        |                                                                                         000 |
      | $.deliveryServiceList[0].serviceDescription | MONEY IN MINUTES IS AVAILABLE. MONEY CAN BE PICKED UP AT ANY AGENT LOCATION WITHIN MINUTES. |
      | $.deliveryServiceList[0].serviceName        | MONEY IN MINUTES                                                                            |
      | $.deliveryServiceList[1].banner             | PAYEE INFORMATION FOR DIRECT DEPOSIT SERVICE                                                |
      | $.deliveryServiceList[1].route              | WADSIN001\\EBD                                                                              |
      | $.deliveryServiceList[1].serviceCode        |                                                                                         500 |
      | $.deliveryServiceList[1].serviceDescription | BANK DEPOSIT SERVICE TO INDIA - FAMILY SUPPORT                                              |
      | $.deliveryServiceList[1].serviceName        | DIRECT TO BANK                                                                              |
      | $.deliveryServiceList[1].templateID         |                                                                                        4020 |
      | $.deliveryServiceList[2].serviceCode        |                                                                                         800 |
      | $.deliveryServiceList[2].serviceName        | MOBILE MONEY TRANSFER                                                                       |
      | $.deliveryServiceList[2].templateID         |                                                                                        4060 |
      | $.transactionExtResult.isSuccessful         | true                                                                                        |

  @DeliveryServices_Values_Negative @TC_API_006 @WULookUpServices
  Scenario: TC_API_006 - To Verify the Get DeliveryServices Values without passing Accept Header
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
    #| Accept     | application/json                     |
    When I post the request with "Get_DeliveryServices_Values" payload
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                                       | Value                                                                                       |
      | $.deliveryServiceList[0].banner             | Payee Information for Money in Minutes                                                      |
      | $.deliveryServiceList[0].route              | WADSIN000                                                                                   |
      | $.deliveryServiceList[0].serviceCode        |                                                                                         000 |
      | $.deliveryServiceList[0].serviceDescription | MONEY IN MINUTES IS AVAILABLE. MONEY CAN BE PICKED UP AT ANY AGENT LOCATION WITHIN MINUTES. |
      | $.deliveryServiceList[0].serviceName        | MONEY IN MINUTES                                                                            |
      | $.deliveryServiceList[1].banner             | PAYEE INFORMATION FOR DIRECT DEPOSIT SERVICE                                                |
      | $.deliveryServiceList[1].route              | WADSIN001\\EBD                                                                              |
      | $.deliveryServiceList[1].serviceCode        |                                                                                         500 |
      | $.deliveryServiceList[1].serviceDescription | BANK DEPOSIT SERVICE TO INDIA - FAMILY SUPPORT                                              |
      | $.deliveryServiceList[1].serviceName        | DIRECT TO BANK                                                                              |
      | $.deliveryServiceList[1].templateID         |                                                                                        4020 |
      | $.deliveryServiceList[2].serviceCode        |                                                                                         800 |
      | $.deliveryServiceList[2].serviceName        | MOBILE MONEY TRANSFER                                                                       |
      | $.deliveryServiceList[2].templateID         |                                                                                        4060 |
      | $.transactionExtResult.isSuccessful         | true                                                                                        |

  @DeliveryServices_Values_Negative @TC_API_007 @WULookUpServices
  Scenario: TC_API_007 - To Verify the Get DeliveryServices Values with passing Invalid Content Type
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | text/html                            |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I post the request with "Get_DeliveryServices_Values" payload
    Then I should see the response code as "415"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                                     |
      | $.Exception | API Gateway encountered an error. Error Message:  Native service provider error. Code : 415. Request Details: Service - WULookUpService, Operation - /getDeliveryServices |

  @DeliveryServices_Values_Negative @TC_API_008 @WULookUpServices
  Scenario: TC_API_008 - To Verify the Get DeliveryServices Values with passing Invalid Accept Header
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | text/html                            |
    When I post the request with "Get_DeliveryServices_Values" payload
    Then I should see the response code as "406"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                                     |
      | $.Exception | API Gateway encountered an error. Error Message:  Native service provider error. Code : 406. Request Details: Service - WULookUpService, Operation - /getDeliveryServices |

  @DeliveryServices_Values_Negative @TC_API_009_018 @WULookUpServices
  Scenario Outline: <TC_ID> To Verify the Get DeliveryServices Values with <InvalidCountryCode> <InvalidCurrencyCode> in Payload
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I modify the fields in "Get_DeliveryServices_Values" payload
      | JPath             | Value          |
      | $.countryCodeStr  | <CountryCode>  |
      | $.currencyCodeStr | <CurrencyCode> |
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
      | TC_ID  | InvalidCountryCode                    | InvalidCurrencyCode                       | CountryCode  | CurrencyCode |
      | TC_013 | Alphanumeric value in country code    |                                           | IN452-sdf    | INR          |
      | TC_014 |                                       | Alphanumeric value in Currency code       |              | ABV12323     |
      | TC_015 | Integer in country code               |                                           |        12345 | INR          |
      | TC_016 |                                       | Integer Value in Currency Code            | IN           |        12321 |
      | TC_017 | Double in country code                |                                           | 23456.345d   | INR          |
      | TC_018 |                                       | Double in Currency Code                   |              | 12341263d    |
      | TC_019 | Null value in country code            |                                           | Null         | INR          |
      | TC_020 |                                       | Null value in Currency code               | IN           | Null         |
      | TC_021 | Negative Integer in Country code      |                                           |        -1234 | INR          |
      | TC_022 |                                       | Negative Integer in Currency code         | IN           |       -17235 |
      | TC_024 | Float values in Couontry code         |                                           |  -126456.273 | INR          |
      | TC_025 |                                       | float values in Currency Code             | IN           |  87328.23746 |
      | TC_026 | Integer spl character in Country Code |                                           | 53462$%#$%   | INR          |
      | TC_027 |                                       | Integerv Spl Characeters in currency code | IN           | 345623@#@#   |
      | TC_028 | String Spl Charactres in country code |                                           | "3638#$#$#$" | INR          |
      | TC_029 |                                       | String spl character in currency code     | IN           | "23512@#@$"  |
      | TC_030 | Special Character in country code     |                                           | @!$#@#       | INR          |
      | TC_031 |                                       | Special Character in currency code        | IN           | @#$@#        |
      | TC_032 | Without Country Code Payload          |                                           | " "          | INR          |
      | TC_033 |                                       | without currency Code payload             | IN           | " "          |

  @DeliveryServices_Values_Negative @TC_API_019 @WULookUpServices
  Scenario Outline: TC_019 To Verify the Get DeliveryServices values Detail without payload
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Content-Type | application/json                     |
      | Accept       | application/json                     |
    When I post the request with "Get_DeliveryServices_Values_Null" payload
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
