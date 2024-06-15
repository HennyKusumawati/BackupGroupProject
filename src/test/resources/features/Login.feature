Feature: Login testing

  @lora @sprint2
  Scenario: Valid admin login

    When user enters valid login details (username and password)
    And user clicks on the login button
    Then user succesfuly logs in