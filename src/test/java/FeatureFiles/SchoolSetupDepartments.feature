Feature: SchoolSetup Functionality 2
  Background:
    Given Enter username and password
    And I click login button
    When I should login successfully

  @Smoke,@Regression
  Scenario: School departments progress
    Given Click on the elements in LefNav
      |setup|
      |schoolSetup|
      |schoolSetup_Departments|
    And Click on the elements in Dialog
      |addBtn|
    And The admin user sending the departments information in Dialog
      |nameInput|Techno200|
      |codeInput|Tchn200|
    And Click on the save element in Dialog
      |saveBtn|
    Then Success message should be display

    When The admin click on the edit element Dialog
      |editBtn|
    Then The admin user sending new departments information in Dialog
      |nameInput|Techno300|
      |codeInput|Tchn300|

    And Click on the save element in Dialog
      |saveBtn|
    Then Success message should be display

    And Click on the element in Dialog for deleting
      |deleteBtn|
      |actionDeleteBtn|
    Then Success message should be display
