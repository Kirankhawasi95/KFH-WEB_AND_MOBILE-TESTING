Feature: GFS Cash Withdrawal functionality
	
	Background: GFS home screen
		Given user is logged into the GFS application
	
  Scenario: Verify the GFS Cash Withdrawal functionality
  	When user clicks on the Transaction option from the menubar
  	Then user is navigated to Transactions screen successfully
  	When user clicks on Common Teller Functions option
  	And user clicks on Cash Withrawal option
  	#Cash Withrawal Screen
  	Then user is navigated to Cash Withrawal screen successfully
  	When user enters Account number
  	And user accepts display notes popup 
  	Then user checks the available balance for the account
  	When user select the Withdrawal Option
  	And user selects currency type
  	And user enters withdrawal amount
  	And user selects ID type
  	And user enters ID number 
  	And user clicks on OK button
  	And user accepts the Transaction Vouchers popup 
  	And user accepts the confirmation popup
  	Then user is displayed with the successful withdrawal information and the reference number
  	When user clicks on cancel button
  	Then user is navigated to GFS home screen successfully
  	When user navigates to back to Cash withdrawal screen
  	And user enters enters Account number
  	And user accepts display notes popup 
  	Then user can successfully see the available amount under available balance after withdrawal
  	
  	