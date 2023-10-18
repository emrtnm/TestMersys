Feature: SchoolSetup Functionality
Background:
  Given Enter username and password
  And I click login button
  When I should login successfully

  @Smoke,@Regression
  Scenario: School locations progress
    Given Click on the elements in LefNav
    |setup|
    |schoolSetup|
    |schoolSetup_Locations|
    And Click on the elements in Dialog
    |addBtn|
    And The admin user sending the informations in Dialog and choose the location type
    |nameInput|Techno200|
    |codeInput|Tchn200|
    |capasity|50|
    And Click on the save element in Dialog
    |saveBtn|
    Then Success message should be display

    When The admin click on the edit element Dialog
    |editBtn|
    Then The admin user sending new locations information in Dialog
      |nameInput|Techno300|
      |codeInput|Tchn300|
      |capasity|60|
    And Click on the element in Dialog
      |saveBtn|
    Then Success message should be display

    And Click on the element in Dialog for deleting
    |deleteBtn|
    |actionDeleteBtn|
    Then Success message should be display

