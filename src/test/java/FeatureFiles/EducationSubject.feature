Feature: Education Setup Functionality

  Background:
    Given Enter username and password
    And I click login button
    When I should login successfully

  @Education, @Regression
  Scenario Outline: Education SubjectCategories
    Given Click on the elements in LefNav
      | education         |
      | educationSetup    |
      | SubjectCategories |

    And Click on the elements in Dialog
      | addBtn |

    Then The admin user sending new  SubjectCategories information in Dialog
      | nameInput | <name> |
      | codeInput | <code> |

    And Click on the save element in Dialog
      | saveBtn |

    Then Success message should be displayed

    And User sends the keys into the DialogBox
      | searchNameInput | <name> |

    And Click on the search button

    And Click on the edit button in the DialogContent

    And The admin user sending the humanPositions information in Dialog
      | nameInput | <editName> |

    And Click on the save element in Dialog
      | saveBtn |

    Then Success message should be displayed

    And User sends the keys into the DialogBox
      | searchNameInput | <editName> |

    And Click on the search button

    And Click on the element in Dialog for deleting
      | deleteBtn       |
      | actionDeleteBtn |

    Then Success message should be displayed
    Examples:
      | name     | code     |editName|
      | java11g5 | core11g5 | pythong5 |