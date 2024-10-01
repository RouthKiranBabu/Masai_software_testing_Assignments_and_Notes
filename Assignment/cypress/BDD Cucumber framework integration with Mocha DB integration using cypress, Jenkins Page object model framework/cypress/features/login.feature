Feature: Login functionality

  Scenario: User logs into the application
    Given the user navigates to the login page
    When the user enters valid credentials
    Then the user should be logged in