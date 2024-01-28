@Investment
Feature: Verify and Validate Investment feature

 @FundDetails @LargeCaps
 Scenario: TC_INV_001 Verify Large Caps Fund Details
 When User clicks on Investments
 And User clicks on Large Caps in Category
 Then User should able to see Mutual Funds Screen
 And User should able to see All Funds
 When User clicks on Explore of first Cap
 Then User should able to see Cap name
 And User should able to see Corpus
 And User should able to see Expense Ratio
 And User should able to see Latest Nav
 
  @Compare @LargeCaps
 Scenario: TC_INV_002 Verify Large Caps Compare
 When User clicks on Investments
 And User clicks on Large Caps in Category
 Then User should able to see Mutual Funds Screen
 And User should able to see All Funds
 When User clicks on Explore of first Cap
 Then User should able to see Cap name
 And User should able to see Corpus
 And User should able to see Expense Ratio
 And User should able to see Latest Nav
 When User clicks on Compare
 Then User should able to see Compare with other funds
 

  @AssetAllocation @LargeCaps
 Scenario: TC_INV_003 Verify Large Caps Asset Allocation
 When User clicks on Investments
 And User clicks on Large Caps in Category
 Then User should able to see Mutual Funds Screen
 And User should able to see All Funds
 When User clicks on Explore of first Cap
 Then User should able to see Cap name
 And User should able to see Corpus
 And User should able to see Expense Ratio
 And User should able to see Latest Nav
 When User clicks on Asset Allocation
 Then User should able to see Equity 
 #And User should able to see Debt & others
 When User clicks on Equity
 Then User should able to see small cap mid cap large cap
 #When User clicks on Debt & others
 #Then User should able to see AAA 
 
  @TopHoldings @LargeCaps
 Scenario: TC_INV_004 Verify Large Caps Top Holdings
 When User clicks on Investments
 And User clicks on Large Caps in Category
 Then User should able to see Mutual Funds Screen
 And User should able to see All Funds
 When User clicks on Explore of first Cap
 Then User should able to see Cap name
 And User should able to see Corpus
 And User should able to see Expense Ratio
 And User should able to see Latest Nav
 When User clicks on Top Holdings
 Then User should able to see Fund Name Sectors Instruments Assests
 
  @RiskMeasures @LargeCaps
 Scenario: TC_INV_005 Verify Large Caps Risk Measures
 When User clicks on Investments
 And User clicks on Large Caps in Category
 Then User should able to see Mutual Funds Screen
 And User should able to see All Funds
 When User clicks on Explore of first Cap
 Then User should able to see Cap name
 And User should able to see Corpus
 And User should able to see Expense Ratio
 And User should able to see Latest Nav
 When User clicks on Risk Measures
 Then User should able to see Fund Name
 And User should able to see Mean
 And User should able to see beta
 And User should able to see Alpha
 
  @Others @LargeCaps
 Scenario: TC_INV_006 Verify Large Caps Others
 When User clicks on Investments
 And User clicks on Large Caps in Category
 Then User should able to see Mutual Funds Screen
 And User should able to see All Funds
 When User clicks on Explore of first Cap
 Then User should able to see Cap name
 And User should able to see Corpus
 And User should able to see Expense Ratio
 And User should able to see Latest Nav
 When User clicks on Others
 Then User should able to see Others plans in same fund
 And User should able to see Registrar Name
 And User should able to see Fund Manager
 
  @FundDetails @MidCaps
 Scenario: TC_INV_007 Verify Mid Caps Fund Details
 When User clicks on Investments
 And User clicks on Mid Caps in Category
 Then User should able to see Mutual Funds Screen
 And User should able to see All Funds
 When User clicks on Explore of first Cap
 Then User should able to see Cap name
 And User should able to see Corpus
 And User should able to see Expense Ratio
 And User should able to see Latest Nav
 
  @Compare @MidCaps
 Scenario: TC_INV_008 Verify Mid Caps Compare
 When User clicks on Investments
 And User clicks on Mid Caps in Category
 Then User should able to see Mutual Funds Screen
 And User should able to see All Funds
 When User clicks on Explore of first Cap
 Then User should able to see Cap name
 And User should able to see Corpus
 And User should able to see Expense Ratio
 And User should able to see Latest Nav
 When User clicks on Compare
 Then User should able to see Compare with other funds
 

  @AssetAllocation @LargeCaps
 Scenario: TC_INV_009 Verify Mid Caps Asset Allocation
 When User clicks on Investments
 And User clicks on Mid Caps in Category
 Then User should able to see Mutual Funds Screen
 And User should able to see All Funds
 When User clicks on Explore of first Cap
 Then User should able to see Cap name
 And User should able to see Corpus
 And User should able to see Expense Ratio
 And User should able to see Latest Nav
 When User clicks on Asset Allocation
 Then User should able to see Equity 
 And User should able to see Debt & others
 When User clicks on Equity
 Then User should able to see small cap mid cap large cap
 When User clicks on Debt & others
 Then User should able to see AAA 