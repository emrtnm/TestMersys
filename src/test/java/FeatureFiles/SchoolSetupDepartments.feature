Feature: SchoolSetup Functionality 2

  Background:
    Given Enter username and password
    And I click login button
    When I should login successfully

  @Smoke,@Regression
  Scenario Outline: School departments progress
    Given Click on the elements in LefNav
      | setup                   |
      | schoolSetup             |
      | schoolSetup_Departments |
    And Click on the elements in Dialog
      | addBtn |
    And The admin user sending the departments information in Dialog
      | nameInput | <nameInputInfo> |
      | codeInput | <codeInputInfo> |
    And Click on the save element in Dialog
      | saveBtn |
    Then Success message should be display

    When The admin click on the edit element Dialog
      | editBtn |
    Then The admin user sending new departments information in Dialog
      | nameInput | <e_nameInputInfo> |
      | codeInput | <e_codeInputInfo> |

    And Click on the save element in Dialog
      | saveBtn |
    Then Success message should be display

    And Click on the element in Dialog for deleting
      | deleteBtn       |
      | actionDeleteBtn |
    Then Success message should be display
    Examples:
      | nameInputInfo       | codeInputInfo | e_nameInputInfo                | e_codeInputInfo |
      | Sport Department    | SD            | Gym Department                 | Gym             |
      | Musics Department   | MD            | Musics and Sports Department   | MaS             |
      | Math Department     | MaD           | Math and Chemical  Department  | MaC             |
      | Software Department | SftwrD        | Computer Department Department | CDD             |
