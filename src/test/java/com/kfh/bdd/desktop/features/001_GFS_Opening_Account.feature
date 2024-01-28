@GFS_Desktop

Feature: GFS Open Account functionality
	
	Background: GFS home screen
	
		Given user is logged into the GFS application
	@GFS_Desktop
  Scenario: Verify the GFS Open Account functionality
  	#Login screen
#  	When user enters password for GFS application
  	#GFS Home screen
#  	Then user is navigated to GFS home screen successfully
  	When user clicks on Locate option from the menubar
  	Then user is navigated to Customer Locate screen successfully
  	When user selects RIM Type
  	And user selects RIM number option from search by dropdown
  	And user enter RIM number
  	And user clicks on search button
  	Then user can see the respective customer details for the given RIM number
  	When user selects the customer from the list
  	And user close the popup displayed for the customer selection
  	Then user can see the client information details
  	When user close the locate screen
  	And user clicks on CSR option from the menubar
  	#CSR Screen
  	Then user is navigated to Account Opening and Servicing screen successfully
  	When user clicks on Account Maintenance option
  	And user clicks on Open Account option
  	#Open Account Screen -> Account Information Tab
  	Then user is navigated to Open account screen successfully
  	When user select Account Type
  	And user select Account Class
  	And user select Account Branch
  	And user select RIM Open Open Reason
  	And user clicks on next button
  	#Open Account Screen -> Other Information Tab
  	Then user is navigated to Other Information tab
  	When user enter Managing Mode
  	And user clicks on next button under Other Information Tab
  	#Open Account Screen -> Account To RIM Relationship Tab
  	Then user is navigated to Account To RIM Relationship Tab
  	When user clicks on next button under RIM Relationship Tab
  	#Open Account Screen -> Account Addition Info Tab
  	Then user is navigated to Account Addition Info Tab
  	When user clicks on save button
  	And user accepts the Transaction Vouchers popup 
  	Then user is displayed with the successful account opened information and the reference number
  	When user clicks on close button
  	Then user is navigated to GFS home screen successfully
  	
  	
  	  

