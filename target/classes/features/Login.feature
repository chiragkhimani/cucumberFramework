Feature: Test login functionality

@smoke @valid
Scenario: Verify Login With Valid Credentials
	Given the user is opening website
	When the user enters valid credentials and clicks on login button
	Then verify if the user is on home page
	
	@regression  @invalid
Scenario: Verify Login With invalid Credentials
	Given the user is opening website
	When the user enters invalid credentials and clicks on login button
	Then verify if error message is displayed

	@smoke
Scenario: Verify Login With blank Credentials
	Given the user is opening website
	When the user enters blank credentials and clicks on login button
	Then verify if error message is displayed
	