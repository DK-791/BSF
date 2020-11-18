Feature: Work Entry 

Scenario Outline: Making a new Work Order for Non Estimate Type-IOW  
	Given Navigate to BSF Login Page 
	Then User fills the "<username>" and <password>
	Then User press the submit button	 
	Then Navigate to Order Wizard 
	Then User fills the "<costcentre>" "<ordertype>" "<worktype>" "<vendor>"
	Then User click on Continue button
	Then Double click on Common SAC
	Then Select the SAC Code and Click on OK
	Then Double click on Description
	Then Select two items and click on OK 
	Then Provide the Qty as "<qty>"
	Then Clear Current Rate and Enter Rate as "<rate>"
	Then Click on Work Order submit button
	Examples: 
		|username 	  | password|costcentre		 	   |ordertype  |worktype		|vendor							 |qty|rate|
		|Administrator|" "		|Normal Project W/O WBS|Work	   |Non-Estimate-IOW|MCA Registered (VRON/0009/GENE/)|10 |1000|
