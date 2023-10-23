Feature: Login Functionality

  @Login,@Smoke,@Regression
  Scenario: Login with success
    Given Enter username and password
    And I click login button
    When I should login successfully

  Scenario: Failed Login
    Given Enter invalid username and password
    And I click login button
    When I should see the invalid message