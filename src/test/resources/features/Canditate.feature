Feature: Test recruitment functionality

@smoke @valid 
Scenario Outline: Verify if candidate can be added
	Given the user is opening website
	When the user enters username as "admin" and passowrd as "admin123" and clicks on login button
	Then verify if the user is on home page
	When The user hovers on Recruitment and clicks on Candidate tab
	Then the user is on Candidate page
	When the user clicks on add button on Candidate page
	Then the user is Add candidate page
	When the user enters "<firstname>", "<lastname>", "<email>" and click on save button on Add candidate page
	Then verify if the candidate "<firstname>", "<lastname>", "<email>" has been added 
	
	Examples:
	|	firstname	|	lastname	|	email	|
	|	alexJ			|	a					| alexj@gmail.com|
	|	sam				|	b					| sam@gmail.com|
	|	bobh			|	c					| bobh@gmail.com|