Feature: US-12345 - Search an employee in HRMS
  Scenario: Search an employee by id
    Given user is navigated to the HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    And user is navigated to employee list page
    When user enters valid employee id
    And user clicks on search button
    Then user is able to see employee information

    # we can convert keywords with * asterisk after step def class has been created
  Scenario: Search an employee by name
    * user is navigated to the HRMS application
    * user enters valid admin credentials
    * user clicks on login button
    * user is navigated to employee list page
    * user enters valid employee name
    * user clicks on search button
    * user is able to see employee information