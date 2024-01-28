@GFS_Desktop1
Feature: GFS Cash Deposit functionality
	
	Background: GFS home screen
	
		Given user is logged into the GFS application
	
  Scenario: Verify the GFS Cash Deposit functionality
  	When user clicks on the Transaction option from the menubar
  	Then user is navigated to Transactions screen successfully
  	When user clicks on Common Teller Functions option
  	And user clicks on Cash Deposit option
  	#Cash Deposit Screen
  	Then user is navigated to Cash Deposit screen successfully
  	When user enters Account number
 	# And user accepts display notes popup 
  	And user selects currency type
  	And user enters deposit amount
  	And user selects ID type
  	And user enters ID number
  	And user enters Depositor name
  	And user selects Source of funds
  	And user enter Other Source of Funds
  	And user enters Phone number
  	And user clicks on OK button
  	And user accepts the Transaction Vouchers popup 
  	And user accepts the confirmation popup
  	Then user is displayed with the successful deposit information and the reference number
  	When user clicks on cancel button
  	Then user is navigated to GFS home screen successfully
  #	When user navigates to back to Cash deposit screen
  #	And user enters enters Account number
  #	And user accepts display notes popup 
  #	Then user can successfully see the deposited ammount under available balance
  	
  	