Feature: Test login functionality

@smoke @valid 
Scenario: Verify Login With Valid Credentials
	Given the user is opening website
	When the user enters username as "admin" and passowrd as "admin123" and clicks on login button
	Then verify if the user is on home page
	
	@regression  @invalid 
Scenario Outline: Verify Login With invalid Credentials
	Given the user is opening website
	When the user enters "<invalidUsername>" and "<invalidPassword>" and clicks on login button
	Then verify if error message is displayed
	
	Examples:
	|invalidUsername | invalidPassword|
	| demo 				 	 | demo123				|
	| test 					 | test123 				|
	| abc! 					 | abc123 				|

	@smoke
Scenario: Verify Login With blank Credentials
	Given the user is opening website
	When the user enters blank credentials and clicks on login button
	Then verify if error message is displayed
	