Feature: admin creating login details for an employee
  @UserStory57 @henny
  Scenario Outline: Admin create new login
    #Given user is navigated to HRMS application
    When Admin enters valid username and password
    And Admin clicks on login button
    Then Admin is successfully logged in
    When Admin clicks on PIM option
    And Admin clicks on Add Employee option
    When Admin enters "<firstname>" and "<middlename>" and "<lastname>" and "<username>" and "<password>" and "<confirm_password>"
    And Admin choose new employee status
    And Admin clicks on save button
    Then Admin is successfully creating login details for a new employee
    Examples:
      | firstname | middlename | lastname | username | password | confirm_password |
      |James      |Sirius      |Potter    |JamSir123 |Blueorchid007*|Blueorchid007* |


  @testUStory57 @henny
  Scenario: trying new login
   #Given user is navigated to HRMS application
    When new employee enters valid username and password
    And new employee clicks on login button
    Then new employee is successfully logged in