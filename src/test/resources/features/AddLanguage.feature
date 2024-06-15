Feature: Adding different languages from Qualifications Option

  @UStory53
  Scenario: Admin add a new language
    #Given user is navigated to HRMS application
    When Admin enters valid username and password
    And Admin clicks on login button
    Then Admin is successfully logged in
    When Admin clicks on Admin button
    And Admin navigated to qualifications
    And Admin clicks on Languages
    And Admin add any language
    And Admin clicks save button
    Then Admin user successfully add languages
