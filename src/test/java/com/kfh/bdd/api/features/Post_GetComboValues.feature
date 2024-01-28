Feature: Validating the Get Combo Values

  @Combo_Values_Positive @TC_API_001 @WULookUpServices
  Scenario: TC_API_001 - To Verify the Get Combo Values with valid credentials
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I post the request with "Get_Combo_Values" payload
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                      | Value                                         |
      | $.comboList[0].extraInfo3  | COMBO2_L3                                     |
      | $.comboList[0].fkID        | BD-BDT_4020_receiver.bank_account.branch_code |
      | $.comboList[0].relationID1 |                                           040 |
      | $.comboList[0].relationID3 | null                                          |
      | $.comboList[0].relationID2 | DHAKA                                         |
      | $.comboList[0].title       | DHAKA BRANCH, DHAKA                           |
      | $.comboList[0].value       |                                     040271510 |
      | $.comboList[1].title       | SERVICE BRANCH, DHAKA                         |
      | $.comboList[1].value       |                                     040270003 |

  @Combo_Values_Negative @TC_API_002 @WULookUpServices
  Scenario: TC_API_002 - To Verify for Get Combo Values with Invalid API Key value
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      # Invaild API Key
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac4 |
      | Accept       | application/json                     |
    When I post the request with "Get_Combo_Values" payload
    Then I should see the response code as "401"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                                                                                                                                                        |
      | $.Exception | API Gateway encountered an error. Error Message:  Unauthorized application request. Request Details: Service - WULookUpService, Operation - /getComboValues, Invocation Time:10:11:03 AM, Date:Dec 3, 2023,  Client IP - 10.10.110.71, User - Default and Application:sys:defaultApplication |

  @Combo_Values_Negative @TC_API_003 @WULookUpServices
  Scenario: TC_API_003 - To Verify the Get Combo Values without API Key value
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
      #| apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json |
    When I post the request with "Get_Combo_Values" payload
    Then I should see the response code as "401"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                                                                                                                                                        |
      | $.Exception | API Gateway encountered an error. Error Message:  Unauthorized application request. Request Details: Service - WULookUpService, Operation - /getComboValues, Invocation Time:10:11:03 AM, Date:Dec 3, 2023,  Client IP - 10.10.110.71, User - Default and Application:sys:defaultApplication |

  @Combo_Values_Negative @TC_API_004 @WULookUpServices
  Scenario: TC_API_004 - To Verify the Get Combo Values with Invalid URL
    Given I set up invalid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I post the request with "Get_Combo_Values" payload
    Then I should see the response code as "404"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue |
      | Content-Type | text/html   |

  @Combo_Values_Negative @TC_API_005 @WULookUpServices
  Scenario: TC_API_005 - To Verify the Get Combo Values without passing Content Type Header
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName      | HeaderValue                          |
      #| Content-Type | application/json                     |
      | apiKey          | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept          | application/json                     |
      | Accept          | */*                                  |
      | Accept-Encoding | gzip, deflate, br                    |
    When I post the request with "Get_Combo_Values" payload
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                      | Value                                         |
      | $.comboList[0].extraInfo3  | COMBO2_L3                                     |
      | $.comboList[0].fkID        | BD-BDT_4020_receiver.bank_account.branch_code |
      | $.comboList[0].relationID1 |                                           040 |
      | $.comboList[0].relationID3 | null                                          |
      | $.comboList[0].relationID2 | DHAKA                                         |
      | $.comboList[0].title       | DHAKA BRANCH, DHAKA                           |
      | $.comboList[0].value       |                                     040271510 |
      | $.comboList[1].title       | SERVICE BRANCH, DHAKA                         |
      | $.comboList[1].value       |                                     040270003 |

  @Combo_Values_Negative @TC_API_006 @WULookUpServices
  Scenario: TC_API_006 - To Verify the Get Combo Values without passing Accept Header
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
    #| Accept     | application/json                     |
    When I post the request with "Get_Combo_Values" payload
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath                      | Value                                         |
      | $.comboList[0].extraInfo3  | COMBO2_L3                                     |
      | $.comboList[0].fkID        | BD-BDT_4020_receiver.bank_account.branch_code |
      | $.comboList[0].relationID1 |                                           040 |
      | $.comboList[0].relationID3 | null                                          |
      | $.comboList[0].relationID2 | DHAKA                                         |
      | $.comboList[0].title       | DHAKA BRANCH, DHAKA                           |
      | $.comboList[0].value       |                                     040271510 |
      | $.comboList[1].title       | SERVICE BRANCH, DHAKA                         |
      | $.comboList[1].value       |                                     040270003 |

  @Combo_Values_Negative @TC_API_007 @WULookUpServices
  Scenario: TC_API_007 - To Verify the Get Combo Values with passing Invalid Content Type
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | text/html                            |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I post the request with "Get_Combo_Values" payload
    Then I should see the response code as "415"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                                                                                                                                                                    |
      | $.Exception | API Gateway encountered an error. Error Message:  Native service provider error. Code : 415. Request Details: Service - WULookUpService, Operation - /getComboValues, Invocation Time:10:52:24 AM, Date:Dec 3, 2023,  Client IP - 10.10.110.71, User - Default and Application:LegacyRetailOnlineBanking |

  @Combo_Values_Negative @TC_API_008 @WULookUpServices
  Scenario: TC_API_008 - To Verify the Get Combo Values with passing Invalid Accept Header
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | text/html                            |
    When I post the request with "Get_Combo_Values" payload
    Then I should see the response code as "406"
    And verify response time is less than "3000" milliseconds
    And I should see the response size as "546"
    And verify response headers
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    And verifies the field is present in the response
      | JPath       | Value                                                                                                                                                                                                                                                                                                    |
      | $.Exception | API Gateway encountered an error. Error Message:  Native service provider error. Code : 406. Request Details: Service - WULookUpService, Operation - /getComboValues, Invocation Time:11:15:34 AM, Date:Dec 3, 2023,  Client IP - 10.10.110.71, User - Default and Application:LegacyRetailOnlineBanking |

  @Combo_Values_Negative @TC_API_009 @WULookUpServices
  Scenario: TC_API_009 - To Verify the Get Combo Values with passing Invalid pkID value
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I modify the fields in "Get_Combo_Values" payload
      | JPath                  | Value                                    |
      | $.combo2FilterDTO.pkID | BD-BDT_receiver.bank_account.branch_code |
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

  @Combo_Values_Negative @TC_API_010 @WULookUpServices
  Scenario: TC_API_010 - To Verify the Get Combo Values with passing Invalid relationParentValue1 value
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I modify the fields in "Get_Combo_Values" payload
      | JPath                                  | Value |
      | $.combo2FilterDTO.relationParentValue1 |  0405 |
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

  @Combo_Values_Negative @TC_API_011 @WULookUpServices
  Scenario: TC_API_011 - To Verify the Get Combo Values with passing Invalid relationParentValue2 value
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I modify the fields in "Get_Combo_Values" payload
      | JPath                                  | Value |
      | $.combo2FilterDTO.relationParentValue2 | QA    |
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

  @Combo_Values_Negative @TC_API_011_039 @WULookUpServices
  Scenario Outline: <TC_ID> To Verify the Get Combo Values with <InvalidpkID> <InvalidRelationParent1> <InvalidRelationParent2> in Payload
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | Content-Type | application/json                     |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Accept       | application/json                     |
    When I modify the fields in "Get_Combo_Values" payload
      | JPath                      | Value    |
      | $.pkID                     | <pkID>   |
      | $.relationshipParentvalue1 | <value1> |
      | $.relationshipParentvalue2 | <value2> |
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
      | TC_ID  | InvalidpkID          | InvalidRelationParent1  | InvalidRelationParent2  | pkID                                          | value1      | value2   |
      | TC_012 | Integer value        |                         |                         |                                          1234 |         040 | DHAKA    |
      | TC_013 |                      | Integer value           |                         | BD-BDT_4020_receiver.bank_account.branch_code |        1232 | DHAKA    |
      | TC_014 |                      |                         | Integer value           | BD-BDT_4020_receiver.bank_account.branch_code |         040 |     1234 |
      | TC_015 | AlphaNumeric  values |                         |                         | 34423@#@#@                                    |         040 | DHAKA    |
      | TC_016 |                      | AlphaNumeric  values    |                         | BD-BDT_4020_receiver.bank_account.branch_code | ddfsd234567 | DHAKA    |
      | TC_017 |                      |                         | AlphaNumeric  values    | BD-BDT_4020_receiver.bank_account.branch_code |         040 | DHAKA    |
      | TC_018 |                      |                         | Null Values             | BD-BDT_4020_receiver.bank_account.branch_code |         040 | " "      |
      | TC_019 |                      | Null Values             |                         | BD-BDT_4020_receiver.bank_account.branch_code | " "         | "DHAKA"  |
      | TC_020 | Null Values          |                         |                         | " "                                           |         040 | "DHAKA"  |
      | TC_021 | Double values        |                         |                         | 23123d                                        |         040 | "DHAKA   |
      | TC_022 |                      |                         | Double Values           | BD-BDT_4020_receiver.bank_account.branch_code | 42734d      | DHAKA    |
      | TC_023 |                      | Double values           |                         | BD-BDT_4020_receiver.bank_account.branch_code | 40356.56d   | DHAKA    |
      | TC_024 | Float Values         |                         |                         |                                  734723.23452 |         040 | DHAKA    |
      | TC_025 |                      | Float Values            |                         |                                               |   2482.6234 | DHAKA    |
      | TC_026 |                      |                         | Float Values            | BD-BDT_4020_receiver.bank_account.branch_code |         040 | "DHAKA"  |
      | TC_027 | IntegerSplChar       |                         |                         | 2323$@@%%                                     |         040 | DHAKA    |
      | TC_028 |                      | IntegerSplchar          |                         | BD-BDT_4020_receiver.bank_account.branch_code | 2233$%^&    | DHAKA    |
      | TC_029 |                      |                         | IntegerSplChar          | BD-BDT_4020_receiver.bank_account.branch_code |         040 | 3423$%^& |
      | TC_030 | StringSplChar        |                         |                         | yrwyerwy@$%%                                  |         040 | DHAKA    |
      | TC_031 |                      | StringSplChar           |                         | BD-BDT_4020_receiver.bank_account.branch_code | ewgey@%^^   | DHAKA    |
      | TC_032 |                      |                         | StringSplChar           | BD-BDT_4020_receiver.bank_account.branch_code |         040 | dfjf@%^& |
      | TC_033 | SpecialChar          |                         |                         | $%^&^                                         |         040 | DHAKA    |
      | TC_034 |                      | SpecialChar             |                         | BD-BDT_4020_receiver.bank_account.branch_code | $%^^        | DHAKA    |
      | TC_035 |                      |                         | specialChar             | BD-BDT_4020_receiver.bank_account.branch_code |         040 | $&%^&^%  |
      | TC_036 | Invalid pkID Payload |                         |                         | fgfgru                                        |         040 | DHAKA    |
      | TC_037 |                      | Invalid relationParent1 |                         | BD-BDT_4020_receiver.bank_account.branch_code |       32343 | DHAKA    |
      | TC_038 |                      |                         | Invalid relationParent2 | BD-BDT_4020_receiver.bank_account.branch_code |         040 | dfsdfs   |
      | TC_039 | Without Any Payload  |                         |                         | null                                          | null        | null     |

  @Combo_Values_Negative @TC_API_040 @WULookUpServices
  Scenario Outline: TC_040 To Verify the Get Combo values Detail without payload
    Given I set up valid URI specification
    Given I set up request specification
      | HeaderName   | HeaderValue                          |
      | apiKey       | d5b942f5-8e5a-4721-bbfe-9b218f8ccac2 |
      | Content-Type | application/json                     |
      | Accept       | application/json                     |
    When I post the request with "Get_Combo_Values_Null" payload
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
