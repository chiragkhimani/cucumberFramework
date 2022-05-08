Feature: Test home page functionality

  @smoke @valid
  Scenario: Verify all job dropdown options are visible
    Given the user is opening website
    When the user enters username as "admin" and passowrd as "admin123" and clicks on login button
    Then verify if the user is on home page
    When The user hovers on Admin and hovers over Job tab
    Then the user can see following items
      | Job Titles        |
      | Pay Grades        |
      | Employment Status |
      | Job Categories    |
      | Work Shifts       |

 