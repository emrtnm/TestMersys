Feature: DataTypes

  Background:
    Given Enter username and password
    And I click login button
    When I should login successfully

  @Smoke, @Regression
  Scenario Outline: Add position in Document Types
    Given Click on the elements in LefNav
      | setup         |
      | parameters    |
      | documentType  |

    And Click on the elements in Dialog
      | addBtn |

    And The admin user sending the departments information in Dialog
      | nameInput | <name> |

    And Click on the elements in Dialog
      | stage_input |
      | stageList   |

    And Press ESC button

    And Click on the save element in Dialog
      | saveBtn |

    Then Success message should be display

    And User sends the keys into the DialogBox
      | searchNameInput | <name> |

    And Click on the element in the DialogContent
      | searchBtn |

    And Wait 1000 sn

    And Click on the edit button in the DialogContent

    And User sends the keys into the DialogBox
      | nameInput | <editName> |

    And Click on the element in the DialogContent
      | saveBtn |

    And Wait 1000 sn

    Then Success message should be displayed

    And User sends the keys into the DialogBox
      | searchNameInput | <editName> |

    And Click on the element in the DialogContent
      | searchBtn |

    And Wait 1000 sn

    And Click on the element in the DialogContent for deleting
      | deleteBtn       |
      | actionDeleteBtn |

    Then Success message should be displayed
    Examples:
      | name  | editName |
      | Aslan | Kaplan   |