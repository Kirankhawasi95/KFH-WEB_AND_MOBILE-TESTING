Feature: Validating the Get DeliveryServicetemplate Values

  @DeliveryServicetemplate_Values_Positive @TC_API_001 @WULookUpServices
  Scenario: TC_API_001 - To Verify the Get DeliveryServicetemplate Values with valid credentials
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I post the request with "Get_DeliveryServiceTemplateDetails_Values" payload
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                                                | Value                                                          |
      | $.deliveryOptionTemplateList[0].absoluteFieldName    | receiver.bank_account.name                                     |
      | $.deliveryOptionTemplateList[0].category             | INDEPT                                                         |
      | $.deliveryOptionTemplateList[0].dataType             | COMBO                                                          |
      | $.deliveryOptionTemplateList[0].displayName          | Bank Name                                                      |
      | $.deliveryOptionTemplateList[0].internalID           |                                                           1234 |
      | $.deliveryOptionTemplateList[0].isNextFieldOnNewLine | true                                                           |
      | $.deliveryOptionTemplateList[0].isRequiredFiled      | true                                                           |
      | $.deliveryOptionTemplateList[0].maxLength            |                                                             35 |
      | $.deliveryOptionTemplateList[0].pkID                 | IN-INR_4020_receiver.bank_account.name                         |
      | $.deliveryOptionTemplateList[0].product              | UNIVERSAL ADDRESS DLV          H2H                             |
      | $.deliveryOptionTemplateList[0].requiredStringInfo   | Bank Name required                                             |
      | $.deliveryOptionTemplateList[0].tIndex               |                                                            001 |
      | $.deliveryOptionTemplateList[1].dataType             | ALPHANUM                                                       |
      | $.deliveryOptionTemplateList[1].displayName          | Account Number                                                 |
      | $.deliveryOptionTemplateList[1].pkID                 | IN-INR_4020_receiver.bank_account.account_number               |
      | $.deliveryOptionTemplateList[1].tIndex               |                                                            216 |
      | $.deliveryOptionTemplateList[2].absoluteFieldName    | receiver.bank_account.bank_code                                |
      | $.deliveryOptionTemplateList[2].displayName          | IFSC Code                                                      |
      | $.deliveryOptionTemplateList[2].pkID                 | IN-INR_4020_receiver.bank_account.bank_code                    |
      | $.deliveryOptionTemplateList[3].absoluteFieldName    | receiver.reason_for_sending                                    |
      | $.deliveryOptionTemplateList[3].pkID                 | IN-INR_4020_receiver.reason_for_sending                        |
      | $.deliveryOptionTemplateList[3].tIndex               |                                                            218 |
      | $.deliveryOptionTemplateList[4].absoluteFieldName    | receiver.mobile_phone.phone_number.country_code                |
      | $.deliveryOptionTemplateList[4].displayName          | Receiver's Mobile Country Code                                 |
      | $.deliveryOptionTemplateList[4].isRequiredFiled      | false                                                          |
      | $.deliveryOptionTemplateList[5].dataType             | DIGIT                                                          |
      | $.deliveryOptionTemplateList[5].pkID                 | IN-INR_4020_receiver.mobile_phone.phone_number.national_number |
      | $.transactionExtResult.isSuccessful                  | true                                                           |

  @DeliveryServicetemplate_Values_Negative @TC_API_002 @WULookUpServices
  Scenario: TC_API_002 - To Verify the Get DeliveryServicetemplate Values with Invalid API Key value
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      # Invaild API Key
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac4 |
      | Accept       | application/json                     |
    When I post the request with "Get_DeliveryServiceTemplateDetails_Values" payload
    #And I post the request to endpoint
    Then I should see the response code as "401"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                                          |
      | $.Exception | API Gateway encountered an error. Error Message:  Unauthorized application request. Request Details: Service - WULookUpService, Operation - /getDeliveryServiceTemplateDetails |

  @DeliveryServicetemplate_Values_Negative @TC_API_003 @WULookUpServices
  Scenario: TC_API_003 - To Verify the Get DeliveryServicetemplate Values without API Key value
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
      #| apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json |
    When I post the request with "Get_DeliveryServiceTemplateDetails_Values" payload
    Then I should see the response code as "401"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                                          |
      | $.Exception | API Gateway encountered an error. Error Message:  Unauthorized application request. Request Details: Service - WULookUpService, Operation - /getDeliveryServiceTemplateDetails |

  @DeliveryServicetemplate_Values_Negative @TC_API_004 @WULookUpServices
  Scenario: TC_API_004 - To Verify the Get DeliveryServicetemplate Values with Invalid URL
    Given I set up invalid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I post the request with "Get_DeliveryServiceTemplateDetails_Values" payload
    Then I should see the response code as "404"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue |
      | Content-Type | text/html   |

  @DeliveryServicetemplate_Values_Negative @TC_API_005 @WULookUpServices
  Scenario: TC_API_005 - To Verify the Get DeliveryServicetemplate Values without passing Content Type Header
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName | HeaderValue                          |
      #| Content-Type | application/json                     |
      | apiKey     | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept     | application/json                     |
    When I post the request with "Get_DeliveryServiceTemplateDetails_Values" payload
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                                              | Value                                                          |
      | $.deliveryOptionTemplateList[0].absoluteFieldName  | receiver.bank_account.name                                     |
      | $.deliveryOptionTemplateList[0].category           | INDEPT                                                         |
      | $.deliveryOptionTemplateList[0].dataType           | COMBO                                                          |
      | $.deliveryOptionTemplateList[0].displayName        | Bank Name                                                      |
      | $.deliveryOptionTemplateList[0].internalID         |                                                           1234 |
      | $.deliveryOptionTemplateList[0].maxLength          |                                                             35 |
      | $.deliveryOptionTemplateList[0].pkID               | IN-INR_4020_receiver.bank_account.name                         |
      | $.deliveryOptionTemplateList[0].product            | UNIVERSAL ADDRESS DLV          H2H                             |
      | $.deliveryOptionTemplateList[0].requiredStringInfo | Bank Name required                                             |
      | $.deliveryOptionTemplateList[0].tIndex             |                                                            001 |
      | $.deliveryOptionTemplateList[1].dataType           | ALPHANUM                                                       |
      | $.deliveryOptionTemplateList[1].displayName        | Account Number                                                 |
      | $.deliveryOptionTemplateList[1].pkID               | IN-INR_4020_receiver.bank_account.account_number               |
      | $.deliveryOptionTemplateList[1].tIndex             |                                                            216 |
      | $.deliveryOptionTemplateList[2].absoluteFieldName  | receiver.bank_account.bank_code                                |
      | $.deliveryOptionTemplateList[2].displayName        | IFSC Code                                                      |
      | $.deliveryOptionTemplateList[2].pkID               | IN-INR_4020_receiver.bank_account.bank_code                    |
      | $.deliveryOptionTemplateList[3].absoluteFieldName  | receiver.reason_for_sending                                    |
      | $.deliveryOptionTemplateList[3].pkID               | IN-INR_4020_receiver.reason_for_sending                        |
      | $.deliveryOptionTemplateList[3].tIndex             |                                                            218 |
      | $.deliveryOptionTemplateList[4].absoluteFieldName  | receiver.mobile_phone.phone_number.country_code                |
      | $.deliveryOptionTemplateList[4].displayName        | Receiver's Mobile Country Code                                 |
      | $.deliveryOptionTemplateList[4].isRequiredFiled    | false                                                          |
      | $.deliveryOptionTemplateList[5].dataType           | DIGIT                                                          |
      | $.deliveryOptionTemplateList[5].pkID               | IN-INR_4020_receiver.mobile_phone.phone_number.national_number |
      | $.transactionExtResult.isSuccessful                | true                                                           |

  @DeliveryServicetemplate_Values_Negative @TC_API_006 @WULookUpServices
  Scenario: TC_API_006 - To Verify the Get DeliveryServicetemplate Values without passing Accept Header
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
    #| Accept     | application/json                     |
    When I post the request with "Get_DeliveryServiceTemplateDetails_Values" payload
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                                              | Value                                                          |
      | $.deliveryOptionTemplateList[0].absoluteFieldName  | receiver.bank_account.name                                     |
      | $.deliveryOptionTemplateList[0].category           | INDEPT                                                         |
      | $.deliveryOptionTemplateList[0].dataType           | COMBO                                                          |
      | $.deliveryOptionTemplateList[0].displayName        | Bank Name                                                      |
      | $.deliveryOptionTemplateList[0].internalID         |                                                           1234 |
      | $.deliveryOptionTemplateList[0].maxLength          |                                                             35 |
      | $.deliveryOptionTemplateList[0].pkID               | IN-INR_4020_receiver.bank_account.name                         |
      | $.deliveryOptionTemplateList[0].product            | UNIVERSAL ADDRESS DLV          H2H                             |
      | $.deliveryOptionTemplateList[0].requiredStringInfo | Bank Name required                                             |
      | $.deliveryOptionTemplateList[0].tIndex             |                                                            001 |
      | $.deliveryOptionTemplateList[1].dataType           | ALPHANUM                                                       |
      | $.deliveryOptionTemplateList[1].displayName        | Account Number                                                 |
      | $.deliveryOptionTemplateList[1].pkID               | IN-INR_4020_receiver.bank_account.account_number               |
      | $.deliveryOptionTemplateList[1].tIndex             |                                                            216 |
      | $.deliveryOptionTemplateList[2].absoluteFieldName  | receiver.bank_account.bank_code                                |
      | $.deliveryOptionTemplateList[2].displayName        | IFSC Code                                                      |
      | $.deliveryOptionTemplateList[2].pkID               | IN-INR_4020_receiver.bank_account.bank_code                    |
      | $.deliveryOptionTemplateList[3].absoluteFieldName  | receiver.reason_for_sending                                    |
      | $.deliveryOptionTemplateList[3].pkID               | IN-INR_4020_receiver.reason_for_sending                        |
      | $.deliveryOptionTemplateList[3].tIndex             |                                                            218 |
      | $.deliveryOptionTemplateList[4].absoluteFieldName  | receiver.mobile_phone.phone_number.country_code                |
      | $.deliveryOptionTemplateList[4].displayName        | Receiver's Mobile Country Code                                 |
      | $.deliveryOptionTemplateList[4].isRequiredFiled    | false                                                          |
      | $.deliveryOptionTemplateList[5].dataType           | DIGIT                                                          |
      | $.deliveryOptionTemplateList[5].pkID               | IN-INR_4020_receiver.mobile_phone.phone_number.national_number |
      | $.transactionExtResult.isSuccessful                | true                                                           |

  @DeliveryServicetemplate_Values_Negative @TC_API_007 @WULookUpServices
  Scenario: TC_API_007 - To Verify the Get DeliveryServicetemplate Values with passing Invalid Content Type
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | text/html                            |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I post the request with "Get_DeliveryServiceTemplateDetails_Values" payload
    #And I post the request to endpoint
    Then I should see the response code as "415"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                                                   |
      | $.Exception | API Gateway encountered an error. Error Message:  Native service provider error. Code : 415. Request Details: Service - WULookUpService, Operation - /getDeliveryServiceTemplateDetails |

  @DeliveryServicetemplate_Values_Negative @TC_API_008 @WULookUpServices
  Scenario: TC_API_008 - To Verify the Get DeliveryServicetemplate Values with passing Invalid Accept Header
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | text/html                            |
    When I post the request with "Get_DeliveryServiceTemplateDetails_Values" payload
    #And I post the request to endpoint
    Then I should see the response code as "406"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                                                   |
      | $.Exception | API Gateway encountered an error. Error Message:  Native service provider error. Code : 406. Request Details: Service - WULookUpService, Operation - /getDeliveryServiceTemplateDetails |

  @DeliveryServicetemplate_Values_Negative @TC_API_009_018 @WULookUpServices
  Scenario Outline: <TC_ID> To Verify the Get DeliveryServicetemplate Values with <InvalidCountryCode> <InvalidCurrencyCode> <InvalidTemplate> in Payload
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I modify the fields in "Get_DeliveryServiceTemplateDetails_Values" payload
      | JPath             | Value          |
      | $.countryCodeStr  | <CountryCode>  |
      | $.currencyCodeStr | <CurrencyCode> |
      | $.templateID      | <Template>     |
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
      | TC_ID  | InvalidCountryCode                         | InvalidCurrencyCode                         | InvalidTemplate                        | CountryCode | CurrencyCode    | Template      |
      | TC_014 | Alphanumeric value in country code         |                                             |                                        | IN452-sdf   | INR             |          4020 |
      | TC_015 | Integer in country code                    |                                             |                                        |       12345 | INR             |          4020 |
      | TC_016 | Double in country code                     |                                             |                                        | 23456.345d  | INR             |          4020 |
      | TC_017 |                                            | Alphanumeric in currency codeStr            |                                        | IN          | INR-345-adsc_gf |          4020 |
      | TC_018 |                                            | Integer in currency code                    |                                        | IN          |          234567 |          4020 |
      | TC_019 |                                            | Double in currency code                     |                                        | IN          | 23456.78d       |          4020 |
      | TC_020 |                                            |                                             | Alphanumeric in Template               | IN          | INR             | 4020-abdc_Sd3 |
      | TC_021 |                                            |                                             | Integer in Template code               | IN          | INR             |      40202345 |
      | TC_022 |                                            |                                             | Double in Template code                | IN          | INR             | 203456.456d   |
      | TC_023 | null value in country code                 |                                             |                                        | null        | INR             |          4020 |
      | TC_024 |                                            | null value in currency code                 |                                        | IN          | null            |          4020 |
      | TC_025 |                                            |                                             | null value in template                 | IN          | INR             | null          |
      | TC_026 | negative value in country code             |                                             |                                        |       -2345 | INR             |          4020 |
      | TC_027 |                                            | negative value in currency code             |                                        | IN          |           -3456 |          4020 |
      | TC_028 |                                            |                                             | negative value in template             | IN          | INR             |         -4020 |
      | TC_029 | float value in country code                |                                             |                                        | 1234.56f    | INR             |          4020 |
      | TC_030 |                                            | float value in currency code                |                                        | IN          | 23456.74f       |          4020 |
      | TC_031 |                                            |                                             | float value in template                | IN          | INR             | 4020.23f      |
      | TC_032 | integer Special characters in country code |                                             |                                        | 12@345_^    | INR             |          4020 |
      | TC_033 |                                            | integer Special characters in currency code |                                        | IN          | 123@45^         |          4020 |
      | TC_034 |                                            |                                             | integer Special characters in template | IN          | INR             | 123%45^*      |
      | TC_035 | String Special characters in country code  |                                             |                                        | IN@$_TY     | INR             |          4020 |
      | TC_036 |                                            | String Special characters in currency code  |                                        | IN          | INR_^*@         |          4020 |
      | TC_037 |                                            |                                             | String Special Characters in template  | IN          | INR             | sdf$^sd_)     |
      | TC_038 | Special characters in country code         |                                             |                                        | @^&*()      | INR             |          4020 |
      | TC_039 |                                            | Special Charcters in currency code          |                                        | IN          | @$%^*()         |          4020 |
      | TC_040 |                                            |                                             | Special characters in template         | IN          | INR             | @$%^*()       |
      | TC_041 | Without any payload                        |                                             |                                        | null        | null            | null          |
      | TC_042 | Without country payload                    |                                             |                                        | null        | INR             |          4020 |
      | TC_043 |                                            | Without currency payload                    |                                        | IN          | null            |          4020 |
      | TC_044 |                                            |                                             | Without template payload               | IN          | INR             | null          |

  @DeliveryServicetemplate_Values_Negative @TC_API_019 @WULookUpServices
  Scenario Outline: TC_019 To Verify the Get DeliveryServicetemplate values Detail without payload
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Content-Type | application/json                     |
      | Accept       | application/json                     |
    When I post the request with "Get_DeliveryServiceTemplateDetails_Values_Null" payload
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
