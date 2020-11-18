Feature: Login to BSF 

Background: 
	Given Navigate to BSF Login Page 
	
Scenario Outline: Checking the Login with Validate Username and Password 
	Then User fills the "<username>" and <password> 
	Then User press the submit button 
	
	Examples: 
		|username 	  | password|
		|Administrator|" "|
		
