Feature: test
Scenario: Verify Login With invalid Credentials
	Given the user is opening website
	When the user enters invalid credentials and clicks on login button
	Then verify if error message is displayed
