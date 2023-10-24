Feature: SchoolSetup Functionality

  Background:
    Given Enter username and password
    And I click login button
    When I should login successfully

  @Smoke, @Regression, @School
  Scenario Outline: School locations progress
    Given Click on the elements in LefNav
      | setup                 |
      | schoolSetup           |
      | schoolSetup_Locations |
    And Click on the elements in Dialog
      | addBtn |
    And The admin user sending the informations in Dialog and choose the location type
      | nameInput        | <nameInputCode>   |
      | school_shortName | <schoolShortName> |
      | school_Capacity  | <capasityInfo>    |
    And Click on the save element in Dialog
      | saveBtn |

    Then Success message should be display
    When The admin click on the edit element Dialog

    Then The admin user sending new locations information in Dialog
      | nameInput        | <e_nameInputCode>   |
      | school_shortName | <e_schoolShortName> |

    And Click on the element in Dialog
      | edit_saveButton |
    Then Success message should be display

    And Click on the element in Dialog for deleting
      | deleteBtn       |
      | actionDeleteBtn |
    Then Success message should be display
    Examples:
      | nameInputCode | schoolShortName | capasityInfo | e_nameInputCode | e_schoolShortName |
      | Z_115         | Z1155           | 20           | *Z11107         | *Z_11107          |


