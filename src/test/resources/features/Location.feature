Feature: Test location page functionality

  @smoke @valid
  Scenario: Verify all job dropdown options are visible
    Given the user is opening website
    When the user enters username as "admin" and passowrd as "admin123" and clicks on login button
    Then verify if the user is on home page
    When The user hovers on Admin and hovers over Oraganization and click on Locations
    Then Verify data for locations
      | Ottawa     | Canada        | 1-876-267-6999   |  9 |
      | California | United States | 1-888-452-1508   |  6 |
      | New York   | United States | 1 (866) 781-7104 | 12 |
      | Texas      | United States | 1 (866) 791-7204 |  8 |

  @smoke @valid @wip
  Scenario: Verify all job dropdown options are visible
    Given the user is opening website
    When the user enters username as "admin" and passowrd as "admin123" and clicks on login button
    Then verify if the user is on home page
    When The user hovers on Admin and hovers over Oraganization and click on Locations
    Then print data for locations
      | City       | Country       | PhoneNumber      | NoOfEmp |
      | Ottawa     | Canada        | 1-876-267-6999   |       9 |
      | California | United States | 1-888-452-1508   |       6 |
      | New York   | United States | 1 (866) 781-7104 |      12 |
      | Texas      | United States | 1 (866) 791-7204 |       8 |
