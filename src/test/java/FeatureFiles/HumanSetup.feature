Feature: Education Setup Functionality

  Background:
    Given Enter username and password
    And I click login button
    When I should login successfully

  @HR, @Smoke, @Regression
  Scenario Outline: : Human-Resources Positions
    Given Click on the elements in LefNav
      | humanResources |
      | humanSetup     |
      | positions      |

    And Click on the elements in Dialog
      | addBtn |

    And The admin user sending the humanPositions information in Dialog
      | nameInput | <name>      |
      | ShortName | <shortName> |

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
      | name    | shortName | editName      |
      | Product | PO        | Product Owner |